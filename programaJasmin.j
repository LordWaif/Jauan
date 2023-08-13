.class public programaJasmin
.super java/lang/Object
.method public static media(FF)F
.limit stack 4
.limit locals 4
ldc 0.0
fstore 2
fload 2
fload 0
fload 1
fadd
ldc 2
i2f
fdiv
swap
pop
fstore 2
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
fload 2
invokevirtual java/lang/StringBuilder/append(F)Ljava/lang/StringBuilder;
ldc " "
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
astore 1
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 1
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
fload 2
freturn
.end method
.method public static main([Ljava/lang/String;)V
.limit stack 4
.limit locals 4
new java/util/Scanner
dup
getstatic java/lang/System/in Ljava/io/InputStream;
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
astore 1
ldc 0
istore 3
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
ldc 10.0
ldc 20.0
invokestatic programaJasmin/media(FF)F
invokevirtual java/lang/StringBuilder/append(F)Ljava/lang/StringBuilder;
ldc " "
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
astore 3
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 3
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
return
.end method
