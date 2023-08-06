from functools import wraps

class Jasmin():
    def __init__(self, jasmin_path):
        self.jasmin_path = jasmin_path
        self.jasmin_file = open(jasmin_path+'.j', 'w+') # jasmin file
        self.jasmin_file.write('.class public '+jasmin_path+'\n')
        self.jasmin_file.write('.super java/lang/Object\n')
        self.max_locals_used = 0
        self.labels = []
        self.ops = {'>=':'ge','<=':'le','>':'gt','<':'lt','==':'eq','!=':'ne'}

    def createMain(self,limit_stack,limit_locals):
        self.limit_locals = limit_locals
        self.jasmin_file.write('.method public static main([Ljava/lang/String;)V\n')
        self.jasmin_file.write('.limit stack '+str(limit_stack)+'\n')
        self.jasmin_file.write('.limit locals '+str(limit_locals)+'\n')

    def endMain(self):
        self.jasmin_file.write('return\n')
        self.jasmin_file.write('.end method\n')

    def printConst(self, value):
        self.jasmin_file.write('getstatic java/lang/System/out Ljava/io/PrintStream;\n')
        if isinstance(value, int):
            self.jasmin_file.write('ldc '+str(value)+'\n')
            self.jasmin_file.write('invokevirtual java/io/PrintStream/println(I)V\n')
        elif isinstance(value,str):
            self.jasmin_file.write('ldc "'+str(value)+'"\n')
            self.jasmin_file.write('invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n')
        elif isinstance(value,float):
            self.jasmin_file.write('ldc '+str(value)+'\n')
            self.jasmin_file.write('invokevirtual java/io/PrintStream/println(F)V\n')

    def print(self, adress):
        self.jasmin_file.write('getstatic java/lang/System/out Ljava/io/PrintStream;\n')
        if isinstance(adress, int):
            self.jasmin_file.write('iload '+str(adress)+'\n')
            self.jasmin_file.write('invokevirtual java/io/PrintStream/println(I)V\n')
        elif isinstance(adress,float):
            self.jasmin_file.write('fload '+str(adress)+'\n')
            self.jasmin_file.write('invokevirtual java/io/PrintStream/println(F)V\n')

    def verifyLimitLocals(func):
        @wraps(func)
        def wrapper(self,*args, **kwargs): 
            if args[0]  > self.limit_locals:
                raise ValueError("O limite de variáveis locais foi excedido.")
            if args[0] > self.max_locals_used:
                self.max_locals_used = args[0]
            if hasattr(self,'scanner_adress') and args[0] == self.scanner_adress:
                raise ValueError('Scanner adress already in use')
            func(self,*args, **kwargs)
        return wrapper

    @verifyLimitLocals
    def createScanner(self,adress):
        self.scanner_adress = adress
        self.jasmin_file.write('new java/util/Scanner\n')
        self.jasmin_file.write('dup\n')
        self.jasmin_file.write('getstatic java/lang/System/in Ljava/io/InputStream;\n')
        self.jasmin_file.write('invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V\n')
        self.jasmin_file.write('astore '+str(self.scanner_adress)+'\n')

    @verifyLimitLocals
    def readInt(self,adress):
        if adress == self.scanner_adress:
            raise ValueError('Scanner adress already in use')
        self.jasmin_file.write('aload '+str(self.scanner_adress)+'\n')
        self.jasmin_file.write('invokevirtual java/util/Scanner/nextInt()I\n')
        self.jasmin_file.write('istore '+str(adress)+'\n')

    @verifyLimitLocals
    def readFloat(self,adress):
        if adress == self.scanner_adress:
            raise ValueError('Scanner adress already in use')
        self.jasmin_file.write('aload '+str(self.scanner_adress)+'\n')
        self.jasmin_file.write('invokevirtual java/util/Scanner/nextFloat()F\n')
        self.jasmin_file.write('fstore '+str(adress)+'\n')

    def createLabel(self,label):
        self.labels.append(label)
        self.jasmin_file.write(label+':\n')

    @verifyLimitLocals
    def loadInt(self,adress):
        self.jasmin_file.write('iload '+str(adress)+'\n')

    @verifyLimitLocals
    def loadFloat(self,adress):
        self.jasmin_file.write('fload '+str(adress)+'\n')

    @verifyLimitLocals
    def storeInt(self,adress):
        self.jasmin_file.write('istore '+str(adress)+'\n')

    @verifyLimitLocals
    def storeFloat(self,adress):
        self.jasmin_file.write('fstore '+str(adress)+'\n')

    def newStoreInt(self):
        self.jasmin_file.write('istore '+str(self.max_locals_used+1)+'\n')
        self.max_locals_used += 1
        return self.max_locals_used

    def newStoreFloat(self):
        self.jasmin_file.write('fstore '+str(self.max_locals_used+1)+'\n')
        self.max_locals_used += 1
        return self.max_locals_used

    def jump(self,label):
        if label not in self.labels:
            Warning('Label not found')
        self.jasmin_file.write('goto '+label+'\n')

    def loadConst(self,value):
        self.jasmin_file.write('ldc '+str(value)+'\n')

    def copy(self,adress):
        self.jasmin_file.write('iload '+str(adress)+'\n')
        self.jasmin_file.write('istore '+self.max_locals_used+'\n')
        return self.max_locals_used

    def while_loop_init(self,label,init_value):
        self.loadConst(init_value)
        self.newStoreInt()
        self.jasmin_file.write(label+':\n')
        return self.max_locals_used

    def while_loop_end(self,label,address):
        self.jump(label) 
        self.createLabel(label+'_end')
    
    def increment(self,adress):
        self.jasmin_file.write('iinc '+str(adress)+' 1\n')

    def _return(self):
        self.jasmin_file.write('return\n')

    def addInt(self,adress1,adress2):
        self.jasmin_file.write('iload '+str(adress1)+'\n')
        self.jasmin_file.write('iload '+str(adress2)+'\n')
        self.jasmin_file.write('iadd\n')

    def _if(self,address1,address2,label,op='>='):
        if_label = 'if'
        if address2 == None:
            if_label += self.ops[op]
            if_label += ' '+label
        else:
            if_label += '_icmp'+self.ops[op]
            if_label += ' '+label
        self.jasmin_file.write('iload '+str(address1)+'\n')
        self.jasmin_file.write('iload '+str(address2)+'\n')
        self.jasmin_file.write(if_label+'\n')

from subprocess import Popen, PIPE
def compile(jasmin_path):
    process = Popen(['java', '-jar', 'jasmin.jar', jasmin_path+'.j'], stdout=PIPE, stderr=PIPE)
    stdout, stderr = process.communicate()
    print(stdout.decode('utf-8'))
    print(stderr.decode('utf-8'))

def execute(jasmin_path):
    process = Popen(['java', jasmin_path], stdout=PIPE, stderr=PIPE,shell=True)
    stdout, stderr = process.communicate()
    print(stdout.decode('utf-8'))
    print(stderr.decode('utf-8'))

if __name__ == '__main__':
    jasmin = Jasmin('Teste')
    jasmin.createMain(10,10)
    jasmin.createScanner(0)
    adress_count = jasmin.while_loop_init('loop',0)
    jasmin.print(adress_count)

    jasmin.loadConst(10)
    max_ = jasmin.newStoreInt()
    jasmin.loadConst(1)
    adress_1 = jasmin.newStoreInt()
    jasmin.addInt(adress_count,adress_1)
    jasmin.storeInt(adress_count)

    jasmin._if(adress_count,max_,'loop_end','>')
    
    jasmin.while_loop_end('loop',adress_count)
    jasmin.endMain()
    jasmin.jasmin_file.close()
    compile('Teste')


    
