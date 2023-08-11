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
L3:
iload 1
ldc 5
if_icmpgt L4
goto L5
L4:
ldc 1
istore 4
goto L6
L5:
ldc 0
istore 4
L6:
iload 4
ifne L1
goto L2
L1:
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
ldc 3
invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
ldc " "
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
astore 6
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 6
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto L3
L2:
return
.end method
