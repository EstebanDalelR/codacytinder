package java8.util;

import java8.util.concurrent.CountedCompleter;
import java8.util.function.BinaryOperator;
import java8.util.function.DoubleBinaryOperator;
import java8.util.function.IntBinaryOperator;
import java8.util.function.LongBinaryOperator;

class ArrayPrefixHelpers {

    static final class CumulateTask<T> extends CountedCompleter<Void> {
        /* renamed from: a */
        final T[] f57460a;
        /* renamed from: b */
        final BinaryOperator<T> f57461b;
        /* renamed from: c */
        CumulateTask<T> f57462c;
        /* renamed from: d */
        CumulateTask<T> f57463d;
        /* renamed from: e */
        T f57464e;
        /* renamed from: f */
        T f57465f;
        /* renamed from: g */
        final int f57466g;
        /* renamed from: h */
        final int f57467h;
        /* renamed from: i */
        final int f57468i;
        /* renamed from: j */
        final int f57469j;
        /* renamed from: k */
        final int f57470k;

        CumulateTask(CumulateTask<T> cumulateTask, BinaryOperator<T> binaryOperator, T[] tArr, int i, int i2, int i3, int i4, int i5) {
            super(cumulateTask);
            this.f57461b = binaryOperator;
            this.f57460a = tArr;
            this.f57468i = i;
            this.f57469j = i2;
            this.f57470k = i3;
            this.f57466g = i4;
            this.f57467h = i5;
        }

        /* renamed from: a */
        public final void mo13596a() {
            BinaryOperator binaryOperator = this.f57461b;
            if (binaryOperator != null) {
                CumulateTask cumulateTask;
                Object[] objArr = cumulateTask.f57460a;
                if (objArr != null) {
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    int i5;
                    CumulateTask cumulateTask2;
                    Object obj;
                    int c;
                    int i6;
                    Object obj2;
                    int i7 = cumulateTask.f57470k;
                    int i8 = cumulateTask.f57468i;
                    int i9 = cumulateTask.f57469j;
                    CumulateTask cumulateTask3 = cumulateTask;
                    while (true) {
                        i = cumulateTask3.f57466g;
                        if (i >= 0) {
                            i2 = cumulateTask3.f57467h;
                            if (i2 <= objArr.length) {
                                if (i2 - i <= i7) {
                                    break;
                                }
                                CumulateTask cumulateTask4 = cumulateTask3.f57462c;
                                CumulateTask cumulateTask5 = cumulateTask3.f57463d;
                                int i10;
                                if (cumulateTask4 == null) {
                                    int i11 = (i + i2) >>> 1;
                                    CumulateTask cumulateTask6 = cumulateTask3;
                                    BinaryOperator binaryOperator2 = binaryOperator;
                                    Object[] objArr2 = objArr;
                                    i3 = i8;
                                    i4 = i9;
                                    cumulateTask = cumulateTask4;
                                    i5 = i7;
                                    i10 = i;
                                    cumulateTask4 = new CumulateTask(cumulateTask6, binaryOperator2, objArr2, i3, i4, i5, i11, i2);
                                    cumulateTask3.f57463d = cumulateTask;
                                    CumulateTask cumulateTask7 = cumulateTask;
                                    cumulateTask = cumulateTask4;
                                    cumulateTask4 = new CumulateTask(cumulateTask6, binaryOperator2, objArr2, i3, i4, i5, i10, i11);
                                    cumulateTask3.f57462c = cumulateTask;
                                    cumulateTask3 = cumulateTask;
                                    cumulateTask2 = cumulateTask7;
                                } else {
                                    i10 = i;
                                    obj = cumulateTask3.f57464e;
                                    cumulateTask4.f57464e = obj;
                                    if (cumulateTask5 != null) {
                                        Object obj3 = cumulateTask4.f57465f;
                                        if (i10 != i8) {
                                            obj3 = binaryOperator.apply(obj, obj3);
                                        }
                                        cumulateTask5.f57464e = obj3;
                                        do {
                                            c = cumulateTask5.mo12940c();
                                            if ((c & 1) != 0) {
                                            }
                                        } while (!cumulateTask5.m63891a(c, c | 1));
                                        do {
                                            c = cumulateTask4.mo12940c();
                                            if ((c & 1) != 0) {
                                                cumulateTask4 = cumulateTask5;
                                                cumulateTask2 = null;
                                                break;
                                            }
                                        } while (!cumulateTask4.m63891a(c, c | 1));
                                        if (cumulateTask5 != null) {
                                            cumulateTask5 = null;
                                        }
                                        cumulateTask2 = cumulateTask5;
                                        if (cumulateTask4 == null) {
                                            cumulateTask3 = cumulateTask4;
                                        } else {
                                            return;
                                        }
                                    }
                                    cumulateTask5 = null;
                                    do {
                                        c = cumulateTask4.mo12940c();
                                        if ((c & 1) != 0) {
                                            cumulateTask4 = cumulateTask5;
                                            cumulateTask2 = null;
                                            break;
                                        }
                                    } while (!cumulateTask4.m63891a(c, c | 1));
                                    if (cumulateTask5 != null) {
                                        cumulateTask5 = null;
                                    }
                                    cumulateTask2 = cumulateTask5;
                                    if (cumulateTask4 == null) {
                                        cumulateTask3 = cumulateTask4;
                                    } else {
                                        return;
                                    }
                                }
                                if (cumulateTask2 != null) {
                                    cumulateTask2.m59284j();
                                }
                                cumulateTask = this;
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                    int i12 = i2;
                    i3 = i;
                    do {
                        c = cumulateTask3.mo12940c();
                        if ((c & 4) == 0) {
                            i6 = (c & 1) != 0 ? 4 : i3 > i8 ? 2 : 6;
                        } else {
                            return;
                        }
                    } while (!cumulateTask3.m63891a(c, c | i6));
                    if (i6 != 2) {
                        if (i3 == i8) {
                            obj = objArr[i8];
                            i3 = i8 + 1;
                        } else {
                            obj = cumulateTask3.f57464e;
                        }
                        obj2 = obj;
                        c = i12;
                        for (i3 = 
/*
Method generation error in method: java8.util.ArrayPrefixHelpers.CumulateTask.a():void, dex: classes4.dex
jadx.core.utils.exceptions.CodegenException: Error generate insn: PHI: (r5_4 'i3' int) = (r5_3 'i3' int), (r5_2 'i3' int) binds: {(r5_3 'i3' int)=B:58:0x00ca, (r5_2 'i3' int)=B:59:0x00d0} in method: java8.util.ArrayPrefixHelpers.CumulateTask.a():void, dex: classes4.dex
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:226)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:184)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:61)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:187)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:320)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:257)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:220)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
	at jadx.core.codegen.ClassGen.addInnerClasses(ClassGen.java:233)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:219)
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
	... 36 more

*/
                    }

                    static final class DoubleCumulateTask extends CountedCompleter<Void> {
                        /* renamed from: a */
                        final double[] f57471a;
                        /* renamed from: b */
                        final DoubleBinaryOperator f57472b;
                        /* renamed from: c */
                        DoubleCumulateTask f57473c;
                        /* renamed from: d */
                        DoubleCumulateTask f57474d;
                        /* renamed from: e */
                        double f57475e;
                        /* renamed from: f */
                        double f57476f;
                        /* renamed from: g */
                        final int f57477g;
                        /* renamed from: h */
                        final int f57478h;
                        /* renamed from: i */
                        final int f57479i;
                        /* renamed from: j */
                        final int f57480j;
                        /* renamed from: k */
                        final int f57481k;

                        DoubleCumulateTask(DoubleCumulateTask doubleCumulateTask, DoubleBinaryOperator doubleBinaryOperator, double[] dArr, int i, int i2, int i3, int i4, int i5) {
                            super(doubleCumulateTask);
                            this.f57472b = doubleBinaryOperator;
                            this.f57471a = dArr;
                            this.f57479i = i;
                            this.f57480j = i2;
                            this.f57481k = i3;
                            this.f57477g = i4;
                            this.f57478h = i5;
                        }

                        /* renamed from: a */
                        public final void mo13596a() {
                            DoubleBinaryOperator doubleBinaryOperator = this.f57472b;
                            if (doubleBinaryOperator != null) {
                                DoubleCumulateTask doubleCumulateTask;
                                double[] dArr = doubleCumulateTask.f57471a;
                                if (dArr != null) {
                                    int i;
                                    int i2;
                                    int i3;
                                    int i4;
                                    int c;
                                    int i5;
                                    double d;
                                    int i6 = doubleCumulateTask.f57481k;
                                    int i7 = doubleCumulateTask.f57479i;
                                    int i8 = doubleCumulateTask.f57480j;
                                    DoubleCumulateTask doubleCumulateTask2 = doubleCumulateTask;
                                    while (true) {
                                        i = doubleCumulateTask2.f57477g;
                                        if (i >= 0) {
                                            i2 = doubleCumulateTask2.f57478h;
                                            if (i2 <= dArr.length) {
                                                if (i2 - i <= i6) {
                                                    break;
                                                }
                                                DoubleCumulateTask doubleCumulateTask3;
                                                DoubleCumulateTask doubleCumulateTask4 = doubleCumulateTask2.f57473c;
                                                DoubleCumulateTask doubleCumulateTask5 = doubleCumulateTask2.f57474d;
                                                int i9;
                                                if (doubleCumulateTask4 == null) {
                                                    int i10 = (i + i2) >>> 1;
                                                    DoubleCumulateTask doubleCumulateTask6 = doubleCumulateTask2;
                                                    DoubleBinaryOperator doubleBinaryOperator2 = doubleBinaryOperator;
                                                    double[] dArr2 = dArr;
                                                    i3 = i7;
                                                    i4 = i8;
                                                    doubleCumulateTask = doubleCumulateTask4;
                                                    int i11 = i6;
                                                    i9 = i;
                                                    doubleCumulateTask4 = new DoubleCumulateTask(doubleCumulateTask6, doubleBinaryOperator2, dArr2, i3, i4, i11, i10, i2);
                                                    doubleCumulateTask2.f57474d = doubleCumulateTask;
                                                    DoubleCumulateTask doubleCumulateTask7 = doubleCumulateTask;
                                                    doubleCumulateTask = doubleCumulateTask4;
                                                    doubleCumulateTask4 = new DoubleCumulateTask(doubleCumulateTask6, doubleBinaryOperator2, dArr2, i3, i4, i11, i9, i10);
                                                    doubleCumulateTask2.f57473c = doubleCumulateTask;
                                                    doubleCumulateTask2 = doubleCumulateTask;
                                                    doubleCumulateTask3 = doubleCumulateTask7;
                                                } else {
                                                    int c2;
                                                    i9 = i;
                                                    double d2 = doubleCumulateTask2.f57475e;
                                                    doubleCumulateTask4.f57475e = d2;
                                                    doubleCumulateTask = null;
                                                    if (doubleCumulateTask5 != null) {
                                                        double d3 = doubleCumulateTask4.f57476f;
                                                        if (i9 != i7) {
                                                            d3 = doubleBinaryOperator.applyAsDouble(d2, d3);
                                                        }
                                                        doubleCumulateTask5.f57475e = d3;
                                                        do {
                                                            c2 = doubleCumulateTask5.mo12940c();
                                                            if ((c2 & 1) != 0) {
                                                            }
                                                        } while (!doubleCumulateTask5.m63891a(c2, c2 | 1));
                                                        do {
                                                            c2 = doubleCumulateTask4.mo12940c();
                                                            if ((c2 & 1) != 0) {
                                                                doubleCumulateTask3 = null;
                                                                doubleCumulateTask4 = doubleCumulateTask5;
                                                                break;
                                                            }
                                                        } while (!doubleCumulateTask4.m63891a(c2, c2 | 1));
                                                        if (doubleCumulateTask5 != null) {
                                                            doubleCumulateTask = doubleCumulateTask5;
                                                        }
                                                        doubleCumulateTask3 = doubleCumulateTask;
                                                        if (doubleCumulateTask4 == null) {
                                                            doubleCumulateTask2 = doubleCumulateTask4;
                                                        } else {
                                                            return;
                                                        }
                                                    }
                                                    doubleCumulateTask5 = null;
                                                    do {
                                                        c2 = doubleCumulateTask4.mo12940c();
                                                        if ((c2 & 1) != 0) {
                                                            doubleCumulateTask3 = null;
                                                            doubleCumulateTask4 = doubleCumulateTask5;
                                                            break;
                                                        }
                                                    } while (!doubleCumulateTask4.m63891a(c2, c2 | 1));
                                                    if (doubleCumulateTask5 != null) {
                                                        doubleCumulateTask = doubleCumulateTask5;
                                                    }
                                                    doubleCumulateTask3 = doubleCumulateTask;
                                                    if (doubleCumulateTask4 == null) {
                                                        doubleCumulateTask2 = doubleCumulateTask4;
                                                    } else {
                                                        return;
                                                    }
                                                }
                                                if (doubleCumulateTask3 != null) {
                                                    doubleCumulateTask3.m59284j();
                                                }
                                                doubleCumulateTask = this;
                                            } else {
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    int i12 = i2;
                                    i2 = i;
                                    do {
                                        c = doubleCumulateTask2.mo12940c();
                                        if ((c & 4) == 0) {
                                            i5 = (c & 1) != 0 ? 4 : i2 > i7 ? 2 : 6;
                                        } else {
                                            return;
                                        }
                                    } while (!doubleCumulateTask2.m63891a(c, c | i5));
                                    if (i5 != 2) {
                                        if (i2 == i7) {
                                            d = dArr[i7];
                                            i2 = i7 + 1;
                                        } else {
                                            d = doubleCumulateTask2.f57475e;
                                        }
                                        c = i12;
                                        for (i2 = 
/*
Method generation error in method: java8.util.ArrayPrefixHelpers.DoubleCumulateTask.a():void, dex: classes4.dex
jadx.core.utils.exceptions.CodegenException: Error generate insn: PHI: (r8_6 'i2' int) = (r8_5 'i2' int), (r8_4 'i2' int) binds: {(r8_5 'i2' int)=B:57:0x00c8, (r8_4 'i2' int)=B:58:0x00ce} in method: java8.util.ArrayPrefixHelpers.DoubleCumulateTask.a():void, dex: classes4.dex
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:226)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:184)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:61)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:187)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:320)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:257)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:220)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
	at jadx.core.codegen.ClassGen.addInnerClasses(ClassGen.java:233)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:219)
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
	... 36 more

*/
                                    }

                                    static final class IntCumulateTask extends CountedCompleter<Void> {
                                        /* renamed from: a */
                                        final int[] f57482a;
                                        /* renamed from: b */
                                        final IntBinaryOperator f57483b;
                                        /* renamed from: c */
                                        IntCumulateTask f57484c;
                                        /* renamed from: d */
                                        IntCumulateTask f57485d;
                                        /* renamed from: e */
                                        int f57486e;
                                        /* renamed from: f */
                                        int f57487f;
                                        /* renamed from: g */
                                        final int f57488g;
                                        /* renamed from: h */
                                        final int f57489h;
                                        /* renamed from: i */
                                        final int f57490i;
                                        /* renamed from: j */
                                        final int f57491j;
                                        /* renamed from: k */
                                        final int f57492k;

                                        IntCumulateTask(IntCumulateTask intCumulateTask, IntBinaryOperator intBinaryOperator, int[] iArr, int i, int i2, int i3, int i4, int i5) {
                                            super(intCumulateTask);
                                            this.f57483b = intBinaryOperator;
                                            this.f57482a = iArr;
                                            this.f57490i = i;
                                            this.f57491j = i2;
                                            this.f57492k = i3;
                                            this.f57488g = i4;
                                            this.f57489h = i5;
                                        }

                                        /* renamed from: a */
                                        public final void mo13596a() {
                                            IntBinaryOperator intBinaryOperator = this.f57483b;
                                            if (intBinaryOperator != null) {
                                                IntCumulateTask intCumulateTask;
                                                int[] iArr = intCumulateTask.f57482a;
                                                if (iArr != null) {
                                                    int i;
                                                    int i2;
                                                    int i3;
                                                    int i4;
                                                    int i5;
                                                    IntCumulateTask intCumulateTask2;
                                                    int i6;
                                                    int i7;
                                                    int i8 = intCumulateTask.f57492k;
                                                    int i9 = intCumulateTask.f57490i;
                                                    int i10 = intCumulateTask.f57491j;
                                                    IntCumulateTask intCumulateTask3 = intCumulateTask;
                                                    while (true) {
                                                        i = intCumulateTask3.f57488g;
                                                        if (i >= 0) {
                                                            i2 = intCumulateTask3.f57489h;
                                                            if (i2 <= iArr.length) {
                                                                if (i2 - i <= i8) {
                                                                    break;
                                                                }
                                                                IntCumulateTask intCumulateTask4 = intCumulateTask3.f57484c;
                                                                IntCumulateTask intCumulateTask5 = intCumulateTask3.f57485d;
                                                                int i11;
                                                                if (intCumulateTask4 == null) {
                                                                    int i12 = (i + i2) >>> 1;
                                                                    IntCumulateTask intCumulateTask6 = intCumulateTask3;
                                                                    IntBinaryOperator intBinaryOperator2 = intBinaryOperator;
                                                                    int[] iArr2 = iArr;
                                                                    i3 = i9;
                                                                    i4 = i10;
                                                                    intCumulateTask = intCumulateTask4;
                                                                    i5 = i8;
                                                                    i11 = i;
                                                                    intCumulateTask4 = new IntCumulateTask(intCumulateTask6, intBinaryOperator2, iArr2, i3, i4, i5, i12, i2);
                                                                    intCumulateTask3.f57485d = intCumulateTask;
                                                                    IntCumulateTask intCumulateTask7 = intCumulateTask;
                                                                    intCumulateTask = intCumulateTask4;
                                                                    intCumulateTask4 = new IntCumulateTask(intCumulateTask6, intBinaryOperator2, iArr2, i3, i4, i5, i11, i12);
                                                                    intCumulateTask3.f57484c = intCumulateTask;
                                                                    intCumulateTask3 = intCumulateTask;
                                                                    intCumulateTask2 = intCumulateTask7;
                                                                } else {
                                                                    i11 = i;
                                                                    i6 = intCumulateTask3.f57486e;
                                                                    intCumulateTask4.f57486e = i6;
                                                                    if (intCumulateTask5 != null) {
                                                                        int i13 = intCumulateTask4.f57487f;
                                                                        if (i11 != i9) {
                                                                            i13 = intBinaryOperator.applyAsInt(i6, i13);
                                                                        }
                                                                        intCumulateTask5.f57486e = i13;
                                                                        do {
                                                                            i6 = intCumulateTask5.mo12940c();
                                                                            if ((i6 & 1) != 0) {
                                                                            }
                                                                        } while (!intCumulateTask5.m63891a(i6, i6 | 1));
                                                                        do {
                                                                            i6 = intCumulateTask4.mo12940c();
                                                                            if ((i6 & 1) != 0) {
                                                                                intCumulateTask4 = intCumulateTask5;
                                                                                intCumulateTask2 = null;
                                                                                break;
                                                                            }
                                                                        } while (!intCumulateTask4.m63891a(i6, i6 | 1));
                                                                        if (intCumulateTask5 != null) {
                                                                            intCumulateTask5 = null;
                                                                        }
                                                                        intCumulateTask2 = intCumulateTask5;
                                                                        if (intCumulateTask4 == null) {
                                                                            intCumulateTask3 = intCumulateTask4;
                                                                        } else {
                                                                            return;
                                                                        }
                                                                    }
                                                                    intCumulateTask5 = null;
                                                                    do {
                                                                        i6 = intCumulateTask4.mo12940c();
                                                                        if ((i6 & 1) != 0) {
                                                                            intCumulateTask4 = intCumulateTask5;
                                                                            intCumulateTask2 = null;
                                                                            break;
                                                                        }
                                                                    } while (!intCumulateTask4.m63891a(i6, i6 | 1));
                                                                    if (intCumulateTask5 != null) {
                                                                        intCumulateTask5 = null;
                                                                    }
                                                                    intCumulateTask2 = intCumulateTask5;
                                                                    if (intCumulateTask4 == null) {
                                                                        intCumulateTask3 = intCumulateTask4;
                                                                    } else {
                                                                        return;
                                                                    }
                                                                }
                                                                if (intCumulateTask2 != null) {
                                                                    intCumulateTask2.m59284j();
                                                                }
                                                                intCumulateTask = this;
                                                            } else {
                                                                return;
                                                            }
                                                        }
                                                        return;
                                                    }
                                                    int i14 = i2;
                                                    i3 = i;
                                                    do {
                                                        i6 = intCumulateTask3.mo12940c();
                                                        if ((i6 & 4) == 0) {
                                                            i7 = (i6 & 1) != 0 ? 4 : i3 > i9 ? 2 : 6;
                                                        } else {
                                                            return;
                                                        }
                                                    } while (!intCumulateTask3.m63891a(i6, i6 | i7));
                                                    if (i7 != 2) {
                                                        if (i3 == i9) {
                                                            i6 = iArr[i9];
                                                            i3 = i9 + 1;
                                                        } else {
                                                            i6 = intCumulateTask3.f57486e;
                                                        }
                                                        i4 = i6;
                                                        i6 = i14;
                                                        for (i3 = 
/*
Method generation error in method: java8.util.ArrayPrefixHelpers.IntCumulateTask.a():void, dex: classes4.dex
jadx.core.utils.exceptions.CodegenException: Error generate insn: PHI: (r5_4 'i3' int) = (r5_3 'i3' int), (r5_2 'i3' int) binds: {(r5_2 'i3' int)=B:59:0x00d0, (r5_3 'i3' int)=B:58:0x00ca} in method: java8.util.ArrayPrefixHelpers.IntCumulateTask.a():void, dex: classes4.dex
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:226)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:184)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:61)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:187)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:320)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:257)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:220)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
	at jadx.core.codegen.ClassGen.addInnerClasses(ClassGen.java:233)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:219)
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
	... 36 more

*/
                                                    }

                                                    static final class LongCumulateTask extends CountedCompleter<Void> {
                                                        /* renamed from: a */
                                                        final long[] f57493a;
                                                        /* renamed from: b */
                                                        final LongBinaryOperator f57494b;
                                                        /* renamed from: c */
                                                        LongCumulateTask f57495c;
                                                        /* renamed from: d */
                                                        LongCumulateTask f57496d;
                                                        /* renamed from: e */
                                                        long f57497e;
                                                        /* renamed from: f */
                                                        long f57498f;
                                                        /* renamed from: g */
                                                        final int f57499g;
                                                        /* renamed from: h */
                                                        final int f57500h;
                                                        /* renamed from: i */
                                                        final int f57501i;
                                                        /* renamed from: j */
                                                        final int f57502j;
                                                        /* renamed from: k */
                                                        final int f57503k;

                                                        LongCumulateTask(LongCumulateTask longCumulateTask, LongBinaryOperator longBinaryOperator, long[] jArr, int i, int i2, int i3, int i4, int i5) {
                                                            super(longCumulateTask);
                                                            this.f57494b = longBinaryOperator;
                                                            this.f57493a = jArr;
                                                            this.f57501i = i;
                                                            this.f57502j = i2;
                                                            this.f57503k = i3;
                                                            this.f57499g = i4;
                                                            this.f57500h = i5;
                                                        }

                                                        /* renamed from: a */
                                                        public final void mo13596a() {
                                                            LongBinaryOperator longBinaryOperator = this.f57494b;
                                                            if (longBinaryOperator != null) {
                                                                LongCumulateTask longCumulateTask;
                                                                long[] jArr = longCumulateTask.f57493a;
                                                                if (jArr != null) {
                                                                    int i;
                                                                    int i2;
                                                                    int i3;
                                                                    int i4;
                                                                    int c;
                                                                    int i5;
                                                                    long j;
                                                                    int i6 = longCumulateTask.f57503k;
                                                                    int i7 = longCumulateTask.f57501i;
                                                                    int i8 = longCumulateTask.f57502j;
                                                                    LongCumulateTask longCumulateTask2 = longCumulateTask;
                                                                    while (true) {
                                                                        i = longCumulateTask2.f57499g;
                                                                        if (i >= 0) {
                                                                            i2 = longCumulateTask2.f57500h;
                                                                            if (i2 <= jArr.length) {
                                                                                if (i2 - i <= i6) {
                                                                                    break;
                                                                                }
                                                                                LongCumulateTask longCumulateTask3;
                                                                                LongCumulateTask longCumulateTask4 = longCumulateTask2.f57495c;
                                                                                LongCumulateTask longCumulateTask5 = longCumulateTask2.f57496d;
                                                                                int i9;
                                                                                if (longCumulateTask4 == null) {
                                                                                    int i10 = (i + i2) >>> 1;
                                                                                    LongCumulateTask longCumulateTask6 = longCumulateTask2;
                                                                                    LongBinaryOperator longBinaryOperator2 = longBinaryOperator;
                                                                                    long[] jArr2 = jArr;
                                                                                    i3 = i7;
                                                                                    i4 = i8;
                                                                                    longCumulateTask = longCumulateTask4;
                                                                                    int i11 = i6;
                                                                                    i9 = i;
                                                                                    longCumulateTask4 = new LongCumulateTask(longCumulateTask6, longBinaryOperator2, jArr2, i3, i4, i11, i10, i2);
                                                                                    longCumulateTask2.f57496d = longCumulateTask;
                                                                                    LongCumulateTask longCumulateTask7 = longCumulateTask;
                                                                                    longCumulateTask = longCumulateTask4;
                                                                                    longCumulateTask4 = new LongCumulateTask(longCumulateTask6, longBinaryOperator2, jArr2, i3, i4, i11, i9, i10);
                                                                                    longCumulateTask2.f57495c = longCumulateTask;
                                                                                    longCumulateTask2 = longCumulateTask;
                                                                                    longCumulateTask3 = longCumulateTask7;
                                                                                } else {
                                                                                    int c2;
                                                                                    i9 = i;
                                                                                    long j2 = longCumulateTask2.f57497e;
                                                                                    longCumulateTask4.f57497e = j2;
                                                                                    longCumulateTask = null;
                                                                                    if (longCumulateTask5 != null) {
                                                                                        long j3 = longCumulateTask4.f57498f;
                                                                                        if (i9 != i7) {
                                                                                            j3 = longBinaryOperator.applyAsLong(j2, j3);
                                                                                        }
                                                                                        longCumulateTask5.f57497e = j3;
                                                                                        do {
                                                                                            c2 = longCumulateTask5.mo12940c();
                                                                                            if ((c2 & 1) != 0) {
                                                                                            }
                                                                                        } while (!longCumulateTask5.m63891a(c2, c2 | 1));
                                                                                        do {
                                                                                            c2 = longCumulateTask4.mo12940c();
                                                                                            if ((c2 & 1) != 0) {
                                                                                                longCumulateTask3 = null;
                                                                                                longCumulateTask4 = longCumulateTask5;
                                                                                                break;
                                                                                            }
                                                                                        } while (!longCumulateTask4.m63891a(c2, c2 | 1));
                                                                                        if (longCumulateTask5 != null) {
                                                                                            longCumulateTask = longCumulateTask5;
                                                                                        }
                                                                                        longCumulateTask3 = longCumulateTask;
                                                                                        if (longCumulateTask4 == null) {
                                                                                            longCumulateTask2 = longCumulateTask4;
                                                                                        } else {
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                    longCumulateTask5 = null;
                                                                                    do {
                                                                                        c2 = longCumulateTask4.mo12940c();
                                                                                        if ((c2 & 1) != 0) {
                                                                                            longCumulateTask3 = null;
                                                                                            longCumulateTask4 = longCumulateTask5;
                                                                                            break;
                                                                                        }
                                                                                    } while (!longCumulateTask4.m63891a(c2, c2 | 1));
                                                                                    if (longCumulateTask5 != null) {
                                                                                        longCumulateTask = longCumulateTask5;
                                                                                    }
                                                                                    longCumulateTask3 = longCumulateTask;
                                                                                    if (longCumulateTask4 == null) {
                                                                                        longCumulateTask2 = longCumulateTask4;
                                                                                    } else {
                                                                                        return;
                                                                                    }
                                                                                }
                                                                                if (longCumulateTask3 != null) {
                                                                                    longCumulateTask3.m59284j();
                                                                                }
                                                                                longCumulateTask = this;
                                                                            } else {
                                                                                return;
                                                                            }
                                                                        }
                                                                        return;
                                                                    }
                                                                    int i12 = i2;
                                                                    i2 = i;
                                                                    do {
                                                                        c = longCumulateTask2.mo12940c();
                                                                        if ((c & 4) == 0) {
                                                                            i5 = (c & 1) != 0 ? 4 : i2 > i7 ? 2 : 6;
                                                                        } else {
                                                                            return;
                                                                        }
                                                                    } while (!longCumulateTask2.m63891a(c, c | i5));
                                                                    if (i5 != 2) {
                                                                        if (i2 == i7) {
                                                                            j = jArr[i7];
                                                                            i2 = i7 + 1;
                                                                        } else {
                                                                            j = longCumulateTask2.f57497e;
                                                                        }
                                                                        c = i12;
                                                                        for (i2 = 
/*
Method generation error in method: java8.util.ArrayPrefixHelpers.LongCumulateTask.a():void, dex: classes4.dex
jadx.core.utils.exceptions.CodegenException: Error generate insn: PHI: (r8_6 'i2' int) = (r8_5 'i2' int), (r8_4 'i2' int) binds: {(r8_4 'i2' int)=B:58:0x00ce, (r8_5 'i2' int)=B:57:0x00c8} in method: java8.util.ArrayPrefixHelpers.LongCumulateTask.a():void, dex: classes4.dex
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:226)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:184)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:61)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:187)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:320)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:257)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:220)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
	at jadx.core.codegen.ClassGen.addInnerClasses(ClassGen.java:233)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:219)
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
	... 36 more

*/
                                                                    }

                                                                    private ArrayPrefixHelpers() {
                                                                    }
                                                                }
