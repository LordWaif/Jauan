.class public programaJasmin
.super java/lang/Object
.method public static fatorial(I)I
.limit stack 10
.limit locals 10
new java/util/Scanner
dup
getstatic java/lang/System/in Ljava/io/InputStream;
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
astore 1
iload 0
ldc 1
if_icmpgt L4
goto L5
L4:
ldc 1
istore 2
goto L6
L5:
ldc 0
istore 2
L6:
iload 2
ifne L1
goto L2
L1:
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
iload 0
invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
ldc " "
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
astore 3
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 3
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
iload 0
iload 0
ldc 1
isub
invokestatic programaJasmin/fatorial(I)I
imul
ireturn
goto L3
L2:
ldc 1
ireturn
goto L3
L3:
ldc 0
ireturn
.end method

.method public static mostrarMedia(II)V
.limit stack 10
.limit locals 10
new java/util/Scanner
dup
getstatic java/lang/System/in Ljava/io/InputStream;
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
astore 2
ldc 0.0
fstore 4
ldc 0
istore 6
fload 4
iload 0
iload 1
iadd
ldc 2
idiv
i2f
swap
pop
fstore 4
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
