.class public programaJasmin
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
.limit stack 10
.limit locals 10
ldc 0
istore 0
ldc ""
astore 1
ldc "hello"
astore 1
iload 0
ldc 4
if_icmple L4
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
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
aload 1
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
ldc " "
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
astore 7
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 7
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto L3
L2:
L3:
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
ldc "world"
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
ldc " "
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
astore 8
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 8
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
return
.end method
