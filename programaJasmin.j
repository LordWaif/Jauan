.class public programaJasmin
.super java/lang/Object
.method public static lerInteiro(II)I
.limit stack 10
.limit locals 10
new java/util/Scanner
dup
getstatic java/lang/System/in Ljava/io/InputStream;
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
astore 2
ldc 0
istore 4
iload 0
iload 1
if_icmpgt L4
goto L5
L4:
ldc 1
istore 5
goto L6
L5:
ldc 0
istore 5
L6:
iload 5
ifne L1
goto L2
L1:
iload 4
iload 0
swap
pop
istore 4
goto L3
L2:
iload 4
iload 1
swap
pop
istore 4
goto L3
L3:
iload 0
iload 1
if_icmpgt L10
goto L11
L10:
ldc 1
istore 6
goto L12
L11:
ldc 0
istore 6
L12:
iload 6
ifne L7
goto L8
L7:
iload 4
iload 0
swap
pop
istore 4
goto L9
L8:
iload 4
iload 1
swap
pop
istore 4
goto L9
L9:
iload 4
ireturn
.end method
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
ldc 0
istore 3
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
ldc "Digite o primeiro numero: "
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
ldc " "
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
astore 4
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 4
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
iload 1
aload 0
invokevirtual java/util/Scanner/nextInt()I
istore 1
pop
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
ldc "Digite o segundo numero: "
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
ldc " "
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
astore 5
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 5
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
iload 2
aload 0
invokevirtual java/util/Scanner/nextInt()I
istore 2
pop
iload 3
iload 1
iload 2
invokestatic programaJasmin/lerInteiro(II)I
swap
pop
istore 3
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
iload 3
invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
ldc " "
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
astore 6
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 6
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
return
.end method
