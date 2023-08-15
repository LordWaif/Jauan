.class public programaJasmin
.super java/lang/Object
.method public static fatorial(I)I
.limit stack 10
.limit locals 10
new java/util/Scanner
dup
getstatic java/lang/System/in Ljava/io/InputStream;
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
astore 1
iload 0
ldc 0
if_icmpeq L4
goto L5
L4:
ldc 1
istore 2
goto L6
L5:
ldc 0
istore 2
L6:
iload 2
ifne L1
goto L2
L1:
ldc 1
ireturn
goto L3
L2:
L3:
iload 0
