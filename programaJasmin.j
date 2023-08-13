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
ldc 5
istore 2
iload 2
ldc -1
imul
ldc -5
i2f
ldc 2.0
fcmpl
ifge L1
goto L2
L1:
ldc 1
istore 6
goto L3
L2:
ldc 0
istore 6
L3:
iload 6
istore 1
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
ldc "false"
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
ldc " "
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
astore 9
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 9
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
return
.end method
