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
ldc 0.0
fstore 1
ldc 0
istore 2
ldc 10
fstore 1
fload 1
ldc -1.0
fmul
ldc 2
i2f
fadd
fload 1
ldc -1.0
fmul
if_icmpgt L1
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
istore 2
return
.end method
