.class public programaJasmin
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
.limit stack 20
.limit locals 20
new java/util/Scanner
dup
getstatic java/lang/System/in Ljava/io/InputStream;
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
astore 0
ldc 0
istore 1
ldc 0
istore 2
ldc 0.0
fstore 3
ldc 5
i2f
fstore 3
ldc 1.0
f2i
istore 1
iload 1
i2f
fload 3
fadd
f2i
istore 1
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
iload 1
i2f
fload 3
fadd
invokevirtual java/lang/StringBuilder/append(F)Ljava/lang/StringBuilder;
ldc " "
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
astore 9
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 9
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
L3:
iload 1
iload 2
if_icmpgt L4
goto L5
L4:
ldc 1
istore 10
goto L6
L5:
ldc 0
istore 10
L6:
iload 10
ifne L1
goto L2
L1:
iload 1
ldc 4
if_icmpeq L10
goto L11
L10:
ldc 1
istore 12
goto L12
L11:
ldc 0
istore 12
L12:
iload 12
ifne L7
goto L8
L7:
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
ldc "Quatro"
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
ldc " "
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
astore 14
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 14
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto L9
L8:
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
iload 1
invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
ldc " "
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
astore 15
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 15
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto L9
L9:
iload 1
ldc 1
isub
istore 1
goto L3
L2:
return
.end method
