.class public programaJasmin
.super java/lang/Object
.method public static soma(II)I
.limit stack 10
.limit locals 10
new java/util/Scanner
dup
getstatic java/lang/System/in Ljava/io/InputStream;
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
astore 2
iload 0
iload 1
iadd
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
invokestatic programaJasmin/soma(II)I
