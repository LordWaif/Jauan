from functools import wraps
class Jasmin():
    def __init__(self, jasmin_path):
        self.jasmin_path = jasmin_path
        self.jasmin_file = open(jasmin_path+'.j', 'w+') # jasmin file
        self.jasmin_file.write('.class public '+jasmin_path+'\n')
        self.jasmin_file.write('.super java/lang/Object\n')
        self.max_locals_used = 0
        self.labels = self.gerar_labels()
        self.ops = {'>=':'ge','<=':'le','>':'gt','<':'lt','==':'eq','!=':'ne'}
        self.if_module = {'comparador':'','label_if':'','tipo':'','label_end':'','label_else':'',}
        self.while_module = {'comparador':'','label_start':'','label_end':'','label_loop':'','tipo':''}
        self.types_args = {"int":"I","float":"F","bool":"I","str":"Ljava/lang/String;"}
        self.stack = list()
        self.in_execution = list()
        self.labels_history = list()

    def createNewTemp(self,_type):
        if _type == 'int':
            return self.newStoreInt()
        elif _type == 'float':
            return self.newStoreFloat()
        return self.max_locals_used

    def load(self,adress,_type):
        if _type == 'int':
            self.loadInt(adress)
        elif _type == 'float':
            self.loadFloat(adress)
        elif _type == 'bool':
            self.loadInt(adress) 

    def store(self,adress,_type):
        if _type == 'int':
            self.storeInt(adress)
        elif _type == 'float':
            self.storeFloat(adress)
        elif _type == 'bool':
            self.storeInt(adress)
        elif _type == 'str':
            self.Astore(adress)
        self.max_locals_used += 1

    def gerar_labels(self):
        contador = 1
        while True:
            yield f"L{contador}"
            contador += 1

    def createMain(self,limit_stack,limit_locals):
        self.limit_locals = limit_locals
        self.jasmin_file.write('.method public static main([Ljava/lang/String;)V\n')
        self.jasmin_file.write('.limit stack '+str(limit_stack)+'\n')
        self.jasmin_file.write('.limit locals '+str(limit_locals)+'\n')

    def endMain(self):
        self.jasmin_file.write('return\n')
        self.jasmin_file.write('.end method\n')

    def printConst(self, value):
        if isinstance(value, int):
            #self.jasmin_file.write('ldc '+str(value)+'\n')
            self.jasmin_file.write('invokevirtual java/io/PrintStream/println(I)V\n')
        elif isinstance(value,str):
            #self.jasmin_file.write('ldc "'+str(value)+'"\n')
            self.jasmin_file.write('invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n')
        elif isinstance(value,float):
            #self.jasmin_file.write('ldc '+str(value)+'\n')
            self.jasmin_file.write('invokevirtual java/io/PrintStream/println(F)V\n')

    def init_print(self):
        self.jasmin_file.write('getstatic java/lang/System/out Ljava/io/PrintStream;\n')

    def print(self, adress):
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

    def createScanner(self):
        self.scanner_adress = self.max_locals_used
        self.jasmin_file.write('new java/util/Scanner\n')
        self.jasmin_file.write('dup\n')
        self.jasmin_file.write('getstatic java/lang/System/in Ljava/io/InputStream;\n')
        self.jasmin_file.write('invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V\n')
        self.Astore(self.scanner_adress)

    def invokeScanner(self,_type):
        methods = {'str':'nextLine()Ljava/lang/String;','float':'nextFloat()F','int':'nextInt()I'}
        self.jasmin_file.write(f'invokevirtual java/util/Scanner/{methods[_type]}\n')

    def createStringBuilder(self):
        self.jasmin_file.write('new java/lang/StringBuilder\n')
        self.jasmin_file.write('dup\n')
        self.jasmin_file.write('invokespecial java/lang/StringBuilder/<init>()V\n')

    def StringBuilderAppend(self,_type):
        self.jasmin_file.write('invokevirtual java/lang/StringBuilder/append('+self.types_args[_type]+')Ljava/lang/StringBuilder;\n')

        self.loadConst(' ',_type='str')
        self.jasmin_file.write('invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;\n')


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
        self.labels_history.append(label)
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

    def newAStore(self):
        self.jasmin_file.write('astore '+str(self.max_locals_used+1)+'\n')
        self.max_locals_used += 1
        return self.max_locals_used

    def newStoreFloat(self):
        self.jasmin_file.write('fstore '+str(self.max_locals_used+1)+'\n')
        self.max_locals_used += 1
        return self.max_locals_used

    def jump(self,label):
        if label not in self.labels_history:
            Warning('Label not found')
        self.jasmin_file.write('goto '+label+'\n')

    def loadConst(self,value,_type=''):
        if _type == 'str':
            self.jasmin_file.write('ldc "'+str(value)+'"\n')
        else:
            self.jasmin_file.write('ldc '+str(value)+'\n')

    def Aload(self,adress):
        self.jasmin_file.write('aload '+str(adress)+'\n')

    def Astore(self,adress):
        self.jasmin_file.write('astore '+str(adress)+'\n')
        self.max_locals_used += 1

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

    def addInt(self):
        self.jasmin_file.write('iadd\n')

    def addFloat(self):
        self.jasmin_file.write('fadd\n')

    def subInt(self):
        self.jasmin_file.write('isub\n')

    def subFloat(self):
        self.jasmin_file.write('fsub\n')

    def mulInt(self):
        self.jasmin_file.write('imul\n')

    def mulFloat(self):
        self.jasmin_file.write('fmul\n')

    def add(self,_type):
        if _type == 'int':
            self.addInt()
        elif _type == 'float':
            self.addFloat()

    def sub(self,_type):
        if _type == 'int':
            self.subInt()
        elif _type == 'float':
            self.subFloat()

    def mul(self,_type):
        if _type == 'int':
            self.mulInt()
        elif _type == 'float':
            self.mulFloat()

    def createIfElse(self):
        if_atual = self.if_module.copy()
        if_atual['label_if'] = next(self.labels)
        if_atual['label_else'] = next(self.labels)
        if_atual['label_end'] = next(self.labels)
        self.stack.append(if_atual)

    def createWhile(self):
        while_atual = self.while_module.copy()
        while_atual['label_start'] = next(self.labels)
        while_atual['label_end'] = next(self.labels)
        while_atual['label_loop'] = next(self.labels)
        self.createLabel(while_atual['label_loop'])
        self.stack.append(while_atual)

    def constructIf(self,op,_type):
        if_atual = self.stack.pop()
        if _type == 'zero':
            if_atual['comparador'] = 'if'+self.ops[op]
        else:
            if_atual['comparador'] = 'if_icmp'+self.ops[op]
        if_atual['tipo'] = _type
        self.stack.append(if_atual)

    def executeIf(self):
        if_atual = self.stack.pop()
        self.jasmin_file.write(if_atual['comparador']+' '+if_atual['label_if']+'\n')
        self.jasmin_file.write('goto '+if_atual['label_else']+'\n')
        self.createLabel(if_atual['label_if'])
        self.in_execution.append(if_atual)
        return if_atual['label_else'],if_atual['label_end']
    
    def executeWhile(self):
        while_atual = self.stack.pop()
        self.jasmin_file.write(while_atual['comparador']+' '+while_atual['label_start']+'\n')
        self.jasmin_file.write('goto '+while_atual['label_end']+'\n')
        self.createLabel(while_atual['label_start'])
        self.in_execution.append(while_atual)
        return while_atual['label_end'],while_atual['label_loop']


    def toString(self,_type):
        if _type == 'int':
            self.jasmin_file.write('invokestatic java/lang/Integer/toString(I)Ljava/lang/String;\n')
        elif _type == 'float':
            self.jasmin_file.write('f2s\n')

    def swap(self):
        self.jasmin_file.write('swap\n')

    def concat(self,num_args):
        self.jasmin_file.write(f'invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;\n')  

    def makeStringBuilder(self):
        self.jasmin_file.write('invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;\n')
        return self.newAStore()    

    def exit(self):
        self.jasmin_file.close()

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
    # jasmin = Jasmin('Teste')
    ...


    
