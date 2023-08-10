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
ldc 10
istore 1
L3:
iload 1
ldc 0
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
iload 1
ldc 5
if_icmpeq L10
goto L11
L10:
ldc 1
istore 7
goto L12
L11:
ldc 0
istore 7
L12:
iload 7
ifne L7
goto L8
L7:
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
ldc "a = 5"
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
ldc " "
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
astore 9
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 9
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto L2
goto L9
L8:
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
ldc "a != 2"
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
ldc " "
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
astore 10
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 10
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
