.class public programaJasmin
.super java/lang/Object
.method public static media(FFI)F
.limit stack 5
.limit locals 5
ldc 0.0
fstore 3
fload 3
fload 0
fload 1
fadd
iload 2
i2f
fadd
ldc 3
i2f
fdiv
swap
pop
fstore 3
fload 3
freturn
.end method
.method public static main([Ljava/lang/String;)V
.limit stack 5
.limit locals 5
new java/util/Scanner
dup
getstatic java/lang/System/in Ljava/io/InputStream;
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
astore 0
ldc 0
istore 4
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
ldc 10.0
ldc 20.0
ldc 30
invokestatic programaJasmin/media(FFI)F
invokevirtual java/lang/StringBuilder/append(F)Ljava/lang/StringBuilder;
ldc " "
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
astore 2
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 2
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
return
.end method
