package com.google.zxing.aztec.p127a;

import com.google.zxing.common.C5664a;
import com.google.zxing.common.C5665b;
import com.google.zxing.common.p128a.C5661a;
import com.google.zxing.common.p128a.C5663c;

/* renamed from: com.google.zxing.aztec.a.c */
public final class C5654c {
    /* renamed from: a */
    private static final int[] f20945a = new int[]{4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    /* renamed from: a */
    private static int m24694a(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }

    /* renamed from: a */
    public static C5653a m24695a(byte[] bArr, int i, int i2) {
        boolean z;
        int abs;
        int a;
        int i3;
        int i4;
        int i5;
        int i6;
        C5664a a2 = new C5656d(bArr).m24709a();
        int i7 = 11;
        int a3 = ((a2.m24751a() * i) / 100) + 11;
        int a4 = a2.m24751a() + a3;
        int i8 = 32;
        int i9 = 0;
        if (i2 != 0) {
            z = i2 < 0;
            abs = Math.abs(i2);
            if (z) {
                i8 = 4;
            }
            if (abs > i8) {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", new Object[]{Integer.valueOf(i2)}));
            }
            a = C5654c.m24694a(abs, z);
            i8 = f20945a[abs];
            i3 = a - (a % i8);
            a2 = C5654c.m24697a(a2, i8);
            if (a2.m24751a() + a3 > i3) {
                throw new IllegalArgumentException("Data to large for user specified layer");
            } else if (!z || a2.m24751a() <= (i8 << 6)) {
                i4 = a;
                i5 = abs;
            } else {
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
        }
        C5664a c5664a = null;
        a = 0;
        abs = 0;
        while (a <= 32) {
            boolean z2 = a <= 3;
            i5 = z2 ? a + 1 : a;
            i4 = C5654c.m24694a(i5, z2);
            if (a4 <= i4) {
                if (abs != f20945a[i5]) {
                    abs = f20945a[i5];
                    c5664a = C5654c.m24697a(a2, abs);
                }
                i6 = i4 - (i4 % abs);
                if (!z2 || c5664a.m24751a() <= (abs << 6)) {
                    if (c5664a.m24751a() + a3 <= i6) {
                        i8 = abs;
                        a2 = c5664a;
                        z = z2;
                    }
                }
            }
            a++;
            i9 = 0;
        }
        throw new IllegalArgumentException("Data too large for an Aztec code");
        C5664a a5 = C5654c.m24698a(a2, i4, i8);
        int a6 = a2.m24751a() / i8;
        C5664a a7 = C5654c.m24699a(z, i5, a6);
        if (!z) {
            i7 = 14;
        }
        i7 += i5 << 2;
        int[] iArr = new int[i7];
        abs = 2;
        if (z) {
            for (i3 = 0; i3 < iArr.length; i3++) {
                iArr[i3] = i3;
            }
            i3 = i7;
        } else {
            int i10 = i7 / 2;
            i3 = (i7 + 1) + (((i10 - 1) / 15) * 2);
            i4 = i3 / 2;
            for (i6 = 0; i6 < i10; i6++) {
                int i11 = (i6 / 15) + i6;
                iArr[(i10 - i6) - 1] = (i4 - i11) - 1;
                iArr[i10 + i6] = (i11 + i4) + 1;
            }
        }
        C5665b c5665b = new C5665b(i3);
        i4 = 0;
        i6 = 0;
        while (i4 < i5) {
            i11 = ((i5 - i4) << abs) + (z ? 9 : 12);
            int i12 = 0;
            while (i12 < i11) {
                int i13 = i12 << 1;
                for (abs = 
/*
Method generation error in method: com.google.zxing.aztec.a.c.a(byte[], int, int):com.google.zxing.aztec.a.a, dex: classes2.dex
jadx.core.utils.exceptions.CodegenException: Error generate insn: PHI: (r8_9 'abs' int) = (r8_8 'abs' int), (r8_21 'abs' int) binds: {(r8_8 'abs' int)=B:65:0x011c, (r8_21 'abs' int)=B:82:0x0191} in method: com.google.zxing.aztec.a.c.a(byte[], int, int):com.google.zxing.aztec.a.a, dex: classes2.dex
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:226)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:184)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:61)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:219)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:61)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:219)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:61)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:187)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:320)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:257)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:220)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:75)
	at jadx.core.codegen.CodeGen.visit(CodeGen.java:12)
	at jadx.core.ProcessClass.process(ProcessClass.java:40)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
Caused by: jadx.core.utils.exceptions.CodegenException: PHI can be used only in fallback mode
	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:537)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:509)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:220)
	... 26 more

*/

                /* renamed from: a */
                private static void m24700a(C5665b c5665b, int i, int i2) {
                    int i3;
                    int i4;
                    for (i3 = 0; i3 < i2; i3 += 2) {
                        i4 = i - i3;
                        int i5 = i4;
                        while (true) {
                            int i6 = i + i3;
                            if (i5 > i6) {
                                break;
                            }
                            c5665b.m24770b(i5, i4);
                            c5665b.m24770b(i5, i6);
                            c5665b.m24770b(i4, i5);
                            c5665b.m24770b(i6, i5);
                            i5++;
                        }
                    }
                    i3 = i - i2;
                    c5665b.m24770b(i3, i3);
                    i4 = i3 + 1;
                    c5665b.m24770b(i4, i3);
                    c5665b.m24770b(i3, i4);
                    i += i2;
                    c5665b.m24770b(i, i3);
                    c5665b.m24770b(i, i4);
                    c5665b.m24770b(i, i - 1);
                }

                /* renamed from: a */
                static C5664a m24699a(boolean z, int i, int i2) {
                    C5664a c5664a = new C5664a();
                    if (z) {
                        c5664a.m24752a(i - 1, true);
                        c5664a.m24752a(i2 - 1, true);
                        return C5654c.m24698a(c5664a, 28, 4);
                    }
                    c5664a.m24752a(i - 1, true);
                    c5664a.m24752a(i2 - 1, true);
                    return C5654c.m24698a(c5664a, 40, 4);
                }

                /* renamed from: a */
                private static void m24701a(C5665b c5665b, boolean z, int i, C5664a c5664a) {
                    i /= 2;
                    int i2 = false;
                    if (z) {
                        while (i2 < true) {
                            z = (i - 3) + i2;
                            if (c5664a.m24756a(i2)) {
                                c5665b.m24770b(z, i - 5);
                            }
                            if (c5664a.m24756a(i2 + 7)) {
                                c5665b.m24770b(i + 5, z);
                            }
                            if (c5664a.m24756a(20 - i2)) {
                                c5665b.m24770b(z, i + 5);
                            }
                            if (c5664a.m24756a(27 - i2)) {
                                c5665b.m24770b(i - 5, z);
                            }
                            i2++;
                        }
                        return;
                    }
                    while (i2 < true) {
                        z = ((i - 5) + i2) + (i2 / 5);
                        if (c5664a.m24756a(i2)) {
                            c5665b.m24770b(z, i - 7);
                        }
                        if (c5664a.m24756a(i2 + 10)) {
                            c5665b.m24770b(i + 7, z);
                        }
                        if (c5664a.m24756a(29 - i2)) {
                            c5665b.m24770b(z, i + 7);
                        }
                        if (c5664a.m24756a(39 - i2)) {
                            c5665b.m24770b(i - 7, z);
                        }
                        i2++;
                    }
                }

                /* renamed from: a */
                private static C5664a m24698a(C5664a c5664a, int i, int i2) {
                    int a = c5664a.m24751a() / i2;
                    C5663c c5663c = new C5663c(C5654c.m24696a(i2));
                    int i3 = i / i2;
                    c5664a = C5654c.m24702b(c5664a, i2, i3);
                    c5663c.m24748a(c5664a, i3 - a);
                    i %= i2;
                    C5664a c5664a2 = new C5664a();
                    int i4 = 0;
                    c5664a2.m24752a(0, i);
                    i = c5664a.length;
                    while (i4 < i) {
                        c5664a2.m24752a(c5664a[i4], i2);
                        i4++;
                    }
                    return c5664a2;
                }

                /* renamed from: b */
                private static int[] m24702b(C5664a c5664a, int i, int i2) {
                    i2 = new int[i2];
                    int a = c5664a.m24751a() / i;
                    for (int i3 = 0; i3 < a; i3++) {
                        int i4 = 0;
                        for (int i5 = 0; i5 < i; i5++) {
                            i4 |= c5664a.m24756a((i3 * i) + i5) ? 1 << ((i - i5) - 1) : 0;
                        }
                        i2[i3] = i4;
                    }
                    return i2;
                }

                /* renamed from: a */
                private static C5661a m24696a(int i) {
                    if (i == 4) {
                        return C5661a.f20971d;
                    }
                    if (i == 6) {
                        return C5661a.f20970c;
                    }
                    if (i == 8) {
                        return C5661a.f20974g;
                    }
                    if (i == 10) {
                        return C5661a.f20969b;
                    }
                    if (i == 12) {
                        return C5661a.f20968a;
                    }
                    StringBuilder stringBuilder = new StringBuilder("Unsupported word size ");
                    stringBuilder.append(i);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }

                /* renamed from: a */
                static C5664a m24697a(C5664a c5664a, int i) {
                    C5664a c5664a2 = new C5664a();
                    int a = c5664a.m24751a();
                    int i2 = (1 << i) - 2;
                    int i3 = 0;
                    while (i3 < a) {
                        int i4;
                        int i5 = 0;
                        for (i4 = 0; i4 < i; i4++) {
                            int i6 = i3 + i4;
                            if (i6 >= a || c5664a.m24756a(i6)) {
                                i5 |= 1 << ((i - 1) - i4);
                            }
                        }
                        i4 = i5 & i2;
                        if (i4 == i2) {
                            c5664a2.m24752a(i4, i);
                            i3--;
                        } else if (i4 == 0) {
                            c5664a2.m24752a(i5 | 1, i);
                            i3--;
                        } else {
                            c5664a2.m24752a(i5, i);
                        }
                        i3 += i;
                    }
                    return c5664a2;
                }
            }
