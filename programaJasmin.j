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
istore 3
iload 3
ldc 10
ldc 15
if_icmpgt L1
goto L2
L1:
ldc 1
istore 4
goto L3
L2:
ldc 0
istore 4
L3:
iload 4
swap
pop
istore 3
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
iload 3
ifne L4
goto L5
L4:
ldc "true"
goto L6
L5:
ldc "false"
L6:
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
ldc " "
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
astore 5
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 5
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
L9:
iload 3
ifne L7
goto L8
L7:
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
ldc "Raimundo rodou o mundo"
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
ldc " "
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
astore 6
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 6
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
iload 1
ldc 3
if_icmpgt L13
goto L14
L13:
ldc 1
istore 7
goto L15
L14:
ldc 0
istore 7
L15:
iload 7
ifne L10
goto L11
L10:
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
ldc "e comeu todo mundo!"
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
ldc " "
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
astore 8
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 8
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto L8
goto L12
L11:
L12:
iload 1
iload 1
ldc 1
iadd
swap
pop
istore 1
goto L9
L8:
return
.end method
