package com.google.android.m4b.maps.bk;

import com.google.android.m4b.maps.bk.C4791a.C4790b;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.bk.e */
public final class C4800e {

    /* renamed from: com.google.android.m4b.maps.bk.e$b */
    public static class C4796b extends Exception {
        /* renamed from: a */
        private C4799d f17498a;

        public C4796b(String str, Throwable th) {
            super(str, th);
        }

        /* renamed from: a */
        public final void m21244a(C4799d c4799d) {
            this.f17498a = c4799d;
        }
    }

    /* renamed from: com.google.android.m4b.maps.bk.e$c */
    static class C4798c {
        /* renamed from: a */
        public C4797a f17503a;
        /* renamed from: b */
        public C6467j f17504b;
        /* renamed from: c */
        public C4793b f17505c;
        /* renamed from: d */
        public int f17506d;
        /* renamed from: e */
        public int f17507e;
        /* renamed from: f */
        public C4790b f17508f;
        /* renamed from: g */
        public List<Object> f17509g;
        /* renamed from: h */
        public int[] f17510h;
        /* renamed from: i */
        public int f17511i;

        /* renamed from: com.google.android.m4b.maps.bk.e$c$a */
        public enum C4797a {
            EMPTY_MESH,
            TESSELLATE_MONOTONE,
            CUT_AND_TESSELLATE
        }

        private C4798c() {
        }

        /* renamed from: a */
        public final C4798c m21245a(C4797a c4797a, C6467j c6467j, C4793b c4793b, int i, int i2, C4790b c4790b, List<Object> list) {
            this.f17503a = c4797a;
            this.f17504b = c6467j;
            this.f17505c = c4793b;
            this.f17506d = i;
            this.f17507e = i2;
            this.f17508f = c4790b;
            this.f17509g = list;
            return this;
        }
    }

    /* renamed from: com.google.android.m4b.maps.bk.e$d */
    public enum C4799d {
        CCW_OUTLINE,
        CW_HOLES,
        NON_SELF_INTERSECTING,
        NO_LINES_STICKING_OUT
    }

    /* renamed from: com.google.android.m4b.maps.bk.e$a */
    public static class C6465a extends C4796b {
        public C6465a(String str) {
            super(str, null);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static com.google.android.m4b.maps.bk.C4805k m21247a(com.google.android.m4b.maps.bk.C4794d r12) {
        /*
        r12 = r12.m21243f();	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        r0 = r12.mo5024a();	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        r1 = 0;
        r2 = 2;
        r3 = 0;
        if (r0 != 0) goto L_0x0031;
    L_0x000d:
        r0 = r12.a;	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        r4 = 3;
        if (r0 >= r4) goto L_0x0017;
    L_0x0012:
        r12 = com.google.android.m4b.maps.bk.C4805k.m21268a();	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        return r12;
    L_0x0017:
        r0 = r12.a;	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        if (r0 != r4) goto L_0x0028;
    L_0x001b:
        r12 = r12.m28350b();	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        r12 = com.google.android.m4b.maps.bk.C4805k.m21269a(r12);	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        r0 = 1;
        r12.mo5038a(r3, r0, r2);	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        return r12;
    L_0x0028:
        r12 = r12.m28353c();	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        r12 = com.google.android.m4b.maps.bk.C4800e.m21248a(r12, r1);	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        return r12;
    L_0x0031:
        r0 = new com.google.android.m4b.maps.bk.c;	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        r0.<init>(r12);	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        r12 = r0.m21296d();	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        if (r12 != 0) goto L_0x003d;
    L_0x003c:
        goto L_0x0091;
    L_0x003d:
        r4 = new com.google.android.m4b.maps.bk.b;	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        r4.<init>(r0);	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        r12 = r12 * 2;
        r2 = new int[r12];	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        r5 = 0;
    L_0x0047:
        r6 = r0.c;	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        if (r3 >= r6) goto L_0x00aa;
    L_0x004b:
        r6 = r0.m21310j(r3);	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        r7 = r0.m21297d(r6);	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        r8 = r0.m21299e(r6);	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        r9 = r0.m21302f(r6);	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        r10 = com.google.android.m4b.maps.bk.C4800e.C47951.f17496a;	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        r11 = r9.ordinal();	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        r10 = r10[r11];	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        switch(r10) {
            case 1: goto L_0x00a1;
            case 2: goto L_0x009a;
            case 3: goto L_0x0079;
            case 4: goto L_0x0072;
            case 5: goto L_0x006e;
            case 6: goto L_0x0067;
            default: goto L_0x0066;
        };	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
    L_0x0066:
        goto L_0x00a7;
    L_0x0067:
        r4.m21233b(r7, r6, r9);	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        r4.m21233b(r6, r8, r9);	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        goto L_0x00a7;
    L_0x006e:
        r4.m21230a(r7, r6, r8);	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        goto L_0x00a7;
    L_0x0072:
        r4.m21233b(r6, r8, r9);	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        r4.m21233b(r7, r6, r9);	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        goto L_0x00a7;
    L_0x0079:
        r9 = r4.m21227a(r6);	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        r10 = r0.mo7055c(r6, r9);	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        if (r10 == 0) goto L_0x0096;
    L_0x0083:
        r2[r5] = r6;	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        r10 = r5 + 1;
        r2[r10] = r9;	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        r5 = r5 + 2;
        if (r5 != r12) goto L_0x0096;
    L_0x008d:
        r0 = r0.m32171a(r2);	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
    L_0x0091:
        r12 = com.google.android.m4b.maps.bk.C4800e.m21248a(r0, r1);	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        return r12;
    L_0x0096:
        r4.m21234b(r7, r6, r8);	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        goto L_0x00a7;
    L_0x009a:
        r4.m21228a(r6, r8, r9);	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        r4.m21233b(r7, r6, r9);	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        goto L_0x00a7;
    L_0x00a1:
        r4.m21228a(r7, r6, r9);	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        r4.m21233b(r6, r8, r9);	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
    L_0x00a7:
        r3 = r3 + 1;
        goto L_0x0047;
    L_0x00aa:
        r12 = new java.lang.NullPointerException;	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        r0 = "Tesselation could not cut all holes open.";
        r12.<init>(r0);	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
        throw r12;	 Catch:{ b -> 0x00d4, Exception -> 0x00b2 }
    L_0x00b2:
        r12 = move-exception;
        r0 = new com.google.android.m4b.maps.bk.e$b;
        r1 = "Error when tessellating polygon: ";
        r2 = r12.getMessage();
        r2 = java.lang.String.valueOf(r2);
        r3 = r2.length();
        if (r3 == 0) goto L_0x00ca;
    L_0x00c5:
        r1 = r1.concat(r2);
        goto L_0x00d0;
    L_0x00ca:
        r2 = new java.lang.String;
        r2.<init>(r1);
        r1 = r2;
    L_0x00d0:
        r0.<init>(r1, r12);
        throw r0;
    L_0x00d4:
        r12 = move-exception;
        throw r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bk.e.a(com.google.android.m4b.maps.bk.d):com.google.android.m4b.maps.bk.k");
    }

    /* renamed from: b */
    public static C4799d m21251b(C4794d c4794d) {
        if (c4794d.m21239b()) {
            return C4799d.CCW_OUTLINE;
        }
        if (c4794d.m21240c()) {
            return C4799d.CW_HOLES;
        }
        if (c4794d.m21241d()) {
            return C4799d.NO_LINES_STICKING_OUT;
        }
        return c4794d.m21242e() != null ? C4799d.NON_SELF_INTERSECTING : null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static com.google.android.m4b.maps.bk.C4805k m21248a(com.google.android.m4b.maps.bk.C6467j r32, java.util.List<java.lang.Object> r33) {
        /*
        r0 = r32;
        r1 = new com.google.android.m4b.maps.bk.b;
        r1.<init>(r0);
        r2 = 0;
        r3 = 0;
        r0 = com.google.android.m4b.maps.bk.C4800e.m21246a(r0, r1, r3, r2, r2);
        r1 = com.google.android.m4b.maps.bk.C4800e.C47951.f17497b;
        r4 = r0.f17503a;
        r4 = r4.ordinal();
        r1 = r1[r4];
        switch(r1) {
            case 1: goto L_0x040b;
            case 2: goto L_0x03fd;
            case 3: goto L_0x0022;
            default: goto L_0x001a;
        };
    L_0x001a:
        r0 = new com.google.android.m4b.maps.bk.e$a;
        r1 = "Unknown subdivide result in tessellation";
        r0.<init>(r1);
        throw r0;
    L_0x0022:
        r1 = r0.f17504b;
        r4 = r0.f17505c;
        r5 = r0.f17506d;
        r6 = r0.f17507e;
        r7 = r0.f17508f;
        r0 = r0.f17509g;
        r8 = com.google.android.m4b.maps.bk.C4805k.m21269a(r1);
        r9 = new java.util.LinkedList;
        r9.<init>();
        r10 = 1;
        r12 = r2;
        r13 = r12;
        r14 = r13;
        r11 = r7;
        r15 = 0;
        r7 = r4;
        r4 = r1;
        r1 = r0;
        r0 = 0;
    L_0x0041:
        if (r0 != 0) goto L_0x03fb;
    L_0x0043:
        if (r1 == 0) goto L_0x0067;
    L_0x0045:
        r2 = 4;
        r2 = new double[r2];
        r16 = r4.m21289b(r5);
        r2[r3] = r16;
        r16 = r4.m21293c(r5);
        r2[r10] = r16;
        r16 = 2;
        r17 = r4.m21289b(r6);
        r2[r16] = r17;
        r16 = 3;
        r17 = r4.m21293c(r6);
        r2[r16] = r17;
        r1.add(r2);
    L_0x0067:
        if (r5 <= r6) goto L_0x006b;
    L_0x0069:
        r2 = r6;
        goto L_0x006c;
    L_0x006b:
        r2 = r5;
    L_0x006c:
        if (r5 <= r6) goto L_0x0070;
    L_0x006e:
        r10 = r5;
        goto L_0x0071;
    L_0x0070:
        r10 = r6;
    L_0x0071:
        r16 = r4.m21305g(r2, r10);
        if (r16 != 0) goto L_0x0090;
    L_0x0077:
        r16 = r4.m21297d(r10);
        r17 = r4.m21299e(r10);
        r19 = r0;
        r0 = r2;
        r20 = r9;
        r22 = r14;
        r21 = r15;
        r9 = r16;
        r15 = r17;
        r3 = 1;
        r14 = r0;
        goto L_0x010b;
    L_0x0090:
        r3 = r4.m21297d(r10);
        r3 = r4.m21305g(r2, r3);
        if (r3 != 0) goto L_0x00ad;
    L_0x009a:
        r3 = r4.m21297d(r10);
        r19 = r0;
        r0 = r2;
        r20 = r9;
        r22 = r14;
        r21 = r15;
        r14 = r0;
        r9 = r3;
        r15 = r10;
    L_0x00aa:
        r3 = 1;
        goto L_0x010b;
    L_0x00ad:
        r3 = r4.m21299e(r10);
        r3 = r4.m21305g(r2, r3);
        if (r3 != 0) goto L_0x00c8;
    L_0x00b7:
        r3 = r4.m21299e(r10);
        r19 = r0;
        r0 = r2;
        r20 = r9;
        r9 = r10;
        r22 = r14;
        r21 = r15;
        r14 = r0;
        r15 = r3;
        goto L_0x00aa;
    L_0x00c8:
        r3 = r4.m21297d(r2);
        r3 = r4.m21305g(r3, r10);
        if (r3 != 0) goto L_0x00e3;
    L_0x00d2:
        r3 = r4.m21297d(r2);
        r19 = r0;
        r0 = r2;
        r20 = r9;
        r9 = r10;
        r22 = r14;
        r21 = r15;
        r14 = r3;
        r15 = r9;
        goto L_0x00aa;
    L_0x00e3:
        r3 = r4.m21299e(r2);
        r3 = r4.m21305g(r3, r10);
        if (r3 != 0) goto L_0x00fe;
    L_0x00ed:
        r3 = r4.m21299e(r2);
        r19 = r0;
        r0 = r3;
        r20 = r9;
        r9 = r10;
        r22 = r14;
        r21 = r15;
        r3 = 1;
        r14 = r2;
        goto L_0x010a;
    L_0x00fe:
        r19 = r0;
        r0 = r2;
        r20 = r9;
        r9 = r10;
        r22 = r14;
        r21 = r15;
        r3 = 0;
        r14 = r0;
    L_0x010a:
        r15 = r9;
    L_0x010b:
        if (r3 == 0) goto L_0x0135;
    L_0x010d:
        r2 = r4.m28369d(r0, r9);
        r3 = r4.m28369d(r15, r14);
        r9 = new com.google.android.m4b.maps.bk.b;
        r9.<init>(r2);
        r10 = new com.google.android.m4b.maps.bk.b;
        r10.<init>(r3);
        r8.m21275b();
        r26 = r0;
        r0 = r1;
        r23 = r8;
        r8 = r12;
        r27 = r13;
        r25 = r14;
        r24 = r15;
        r1 = 0;
        r15 = r3;
        r14 = r10;
        r3 = r2;
        r2 = 0;
        goto L_0x02cf;
    L_0x0135:
        r3 = r4.m28369d(r2, r10);
        r9 = r7.m21229a(r3, r2, r10);
        r23 = r8;
        r8 = r5 - r2;
        r24 = r15;
        r15 = 0;
        r16 = r3.m21307h(r8, r15);
        r15 = r4.m28369d(r10, r2);
        r25 = r14;
        r14 = r7.m21229a(r15, r10, r2);
        r17 = r10 - r2;
        r18 = 1;
        r17 = r17 + -1;
        if (r6 > r2) goto L_0x015e;
    L_0x015a:
        r26 = r0;
        r0 = r6;
        goto L_0x0164;
    L_0x015e:
        r18 = r6 - r17;
        r26 = r0;
        r0 = r18;
    L_0x0164:
        if (r5 > r2) goto L_0x016d;
    L_0x0166:
        r28 = r1;
        r27 = r13;
        r1 = 0;
        r13 = r5;
        goto L_0x0176;
    L_0x016d:
        r18 = r5 - r17;
        r28 = r1;
        r27 = r13;
        r13 = r18;
        r1 = 0;
    L_0x0176:
        r18 = r15.m21307h(r13, r1);
        r1 = r4.m21297d(r5);
        r29 = r12;
        r12 = r4.m21299e(r5);
        r30 = com.google.android.m4b.maps.bk.C4800e.C47951.f17496a;
        r31 = r11.ordinal();
        r30 = r30[r31];
        switch(r30) {
            case 1: goto L_0x0293;
            case 2: goto L_0x0265;
            case 3: goto L_0x025c;
            case 4: goto L_0x01ec;
            case 5: goto L_0x01e4;
            case 6: goto L_0x0191;
            default: goto L_0x018f;
        };
    L_0x018f:
        goto L_0x02c7;
    L_0x0191:
        r0 = -1;
        if (r12 < r2) goto L_0x01b5;
    L_0x0194:
        if (r12 > r10) goto L_0x01b5;
    L_0x0196:
        r12 = r12 - r2;
        r1 = r9.m21236c(r12, r8);
        if (r1 == 0) goto L_0x01ad;
    L_0x019d:
        r1 = com.google.android.m4b.maps.bk.C4791a.C4790b.END_VERTEX;
        r1 = r9.m21233b(r12, r8, r1);
        if (r1 == r0) goto L_0x01d6;
    L_0x01a5:
        r0 = new java.lang.NullPointerException;
        r1 = "Impossible case in cutAndTessellate.";
        r0.<init>(r1);
        throw r0;
    L_0x01ad:
        r0 = new java.lang.NullPointerException;
        r1 = "Impossible case in cutAndTessellate.";
        r0.<init>(r1);
        throw r0;
    L_0x01b5:
        if (r12 > r2) goto L_0x01b9;
    L_0x01b7:
        r1 = r12;
        goto L_0x01bb;
    L_0x01b9:
        r1 = r12 - r17;
    L_0x01bb:
        r1 = r14.m21236c(r1, r13);
        if (r1 == 0) goto L_0x01dc;
    L_0x01c1:
        if (r12 > r2) goto L_0x01c4;
    L_0x01c3:
        goto L_0x01c6;
    L_0x01c4:
        r12 = r12 - r17;
    L_0x01c6:
        r1 = com.google.android.m4b.maps.bk.C4791a.C4790b.END_VERTEX;
        r1 = r14.m21233b(r12, r13, r1);
        if (r1 == r0) goto L_0x01d6;
    L_0x01ce:
        r0 = new java.lang.NullPointerException;
        r1 = "Impossible case in cutAndTessellate.";
        r0.<init>(r1);
        throw r0;
    L_0x01d6:
        r0 = r16 + 1;
        r1 = r18 + 1;
        goto L_0x02c0;
    L_0x01dc:
        r0 = new java.lang.NullPointerException;
        r1 = "Impossible case in cutAndTessellate.";
        r0.<init>(r1);
        throw r0;
    L_0x01e4:
        r0 = new java.lang.NullPointerException;
        r1 = "Impossible case in cutAndTessellate.";
        r0.<init>(r1);
        throw r0;
    L_0x01ec:
        if (r1 < r2) goto L_0x0228;
    L_0x01ee:
        if (r1 > r10) goto L_0x0228;
    L_0x01f0:
        r0 = r7.m21236c(r1, r5);
        if (r0 == 0) goto L_0x0212;
    L_0x01f6:
        r0 = r6 - r2;
        r9.m21237d(r0, r8);
        r0 = r15.m21302f(r13);
        r1 = com.google.android.m4b.maps.bk.C4791a.C4790b.END_VERTEX;
        if (r0 == r1) goto L_0x020b;
    L_0x0203:
        r0 = new java.lang.NullPointerException;
        r1 = "Impossible case in cutAndTessellate.";
        r0.<init>(r1);
        throw r0;
    L_0x020b:
        r0 = r18 + 1;
        r2 = r0;
        r1 = r16;
        goto L_0x02cb;
    L_0x0212:
        r0 = r3.m21302f(r8);
        r1 = com.google.android.m4b.maps.bk.C4791a.C4790b.END_VERTEX;
        if (r0 == r1) goto L_0x0222;
    L_0x021a:
        r0 = new java.lang.NullPointerException;
        r1 = "Impossible case in cutAndTessellate.";
        r0.<init>(r1);
        throw r0;
    L_0x0222:
        r0 = r16 + 1;
        r1 = r18 + 1;
        goto L_0x02c0;
    L_0x0228:
        r1 = r7.m21236c(r1, r5);
        if (r1 == 0) goto L_0x0245;
    L_0x022e:
        r1 = r3.m21302f(r8);
        r2 = com.google.android.m4b.maps.bk.C4791a.C4790b.END_VERTEX;
        if (r1 == r2) goto L_0x023e;
    L_0x0236:
        r0 = new java.lang.NullPointerException;
        r1 = "Impossible case in cutAndTessellate.";
        r0.<init>(r1);
        throw r0;
    L_0x023e:
        r1 = r16 + 1;
        r14.m21237d(r0, r13);
        goto L_0x02c9;
    L_0x0245:
        r0 = r15.m21302f(r13);
        r1 = com.google.android.m4b.maps.bk.C4791a.C4790b.END_VERTEX;
        if (r0 == r1) goto L_0x0255;
    L_0x024d:
        r0 = new java.lang.NullPointerException;
        r1 = "Impossible case in cutAndTessellate.";
        r0.<init>(r1);
        throw r0;
    L_0x0255:
        r0 = r18 + 1;
        r1 = r16 + 1;
        r2 = r0;
        goto L_0x02cb;
    L_0x025c:
        r1 = r6 - r2;
        r9.m21237d(r1, r8);
        r14.m21237d(r0, r13);
        goto L_0x02c7;
    L_0x0265:
        if (r1 < r2) goto L_0x027e;
    L_0x0267:
        if (r1 > r10) goto L_0x027e;
    L_0x0269:
        r0 = r3.m21302f(r8);
        r1 = com.google.android.m4b.maps.bk.C4791a.C4790b.END_VERTEX;
        if (r0 == r1) goto L_0x0279;
    L_0x0271:
        r0 = new java.lang.NullPointerException;
        r1 = "Impossible case in cutAndTessellate.";
        r0.<init>(r1);
        throw r0;
    L_0x0279:
        r0 = r16 + 1;
        r1 = r18 + 1;
        goto L_0x02c0;
    L_0x027e:
        r0 = r16 + 1;
        r1 = r15.m21302f(r13);
        r2 = com.google.android.m4b.maps.bk.C4791a.C4790b.END_VERTEX;
        if (r1 == r2) goto L_0x0290;
    L_0x0288:
        r0 = new java.lang.NullPointerException;
        r1 = "Impossible case in cutAndTessellate.";
        r0.<init>(r1);
        throw r0;
    L_0x0290:
        r1 = r18 + 1;
        goto L_0x02c0;
    L_0x0293:
        if (r1 < r2) goto L_0x02ac;
    L_0x0295:
        if (r1 > r10) goto L_0x02ac;
    L_0x0297:
        r0 = r16 + 1;
        r1 = r15.m21302f(r13);
        r2 = com.google.android.m4b.maps.bk.C4791a.C4790b.END_VERTEX;
        if (r1 == r2) goto L_0x02a9;
    L_0x02a1:
        r0 = new java.lang.NullPointerException;
        r1 = "Impossible case in cutAndTessellate.";
        r0.<init>(r1);
        throw r0;
    L_0x02a9:
        r1 = r18 + 1;
        goto L_0x02c0;
    L_0x02ac:
        r0 = r3.m21302f(r8);
        r1 = com.google.android.m4b.maps.bk.C4791a.C4790b.END_VERTEX;
        if (r0 == r1) goto L_0x02bc;
    L_0x02b4:
        r0 = new java.lang.NullPointerException;
        r1 = "Impossible case in cutAndTessellate.";
        r0.<init>(r1);
        throw r0;
    L_0x02bc:
        r0 = r16 + 1;
        r1 = r18 + 1;
    L_0x02c0:
        r2 = r1;
        r8 = r29;
        r1 = r0;
        r0 = r28;
        goto L_0x02cf;
    L_0x02c7:
        r1 = r16;
    L_0x02c9:
        r2 = r18;
    L_0x02cb:
        r0 = r28;
        r8 = r29;
    L_0x02cf:
        r1 = com.google.android.m4b.maps.bk.C4800e.m21246a(r3, r9, r1, r0, r8);
        r8 = r27;
        r2 = com.google.android.m4b.maps.bk.C4800e.m21246a(r15, r14, r2, r0, r8);
        if (r22 == 0) goto L_0x02fa;
    L_0x02db:
        r3 = r3.m21298e();
        r8 = r1.f17510h;
        if (r8 == 0) goto L_0x02e8;
    L_0x02e3:
        r8 = r1.f17510h;
        r8 = r8.length;
        if (r8 >= r3) goto L_0x02ec;
    L_0x02e8:
        r8 = new int[r3];
        r1.f17510h = r8;
    L_0x02ec:
        r8 = 0;
    L_0x02ed:
        if (r8 >= r3) goto L_0x0301;
    L_0x02ef:
        r9 = r1.f17510h;
        r10 = r26 + r8;
        r10 = r22[r10];
        r9[r8] = r10;
        r8 = r8 + 1;
        goto L_0x02ed;
    L_0x02fa:
        r3 = 0;
        r1.f17510h = r3;
        r3 = r21 + r26;
        r1.f17511i = r3;
    L_0x0301:
        r3 = r15.m21298e();
        r8 = r2.f17510h;
        if (r8 == 0) goto L_0x030e;
    L_0x0309:
        r8 = r2.f17510h;
        r8 = r8.length;
        if (r8 >= r3) goto L_0x0312;
    L_0x030e:
        r8 = new int[r3];
        r2.f17510h = r8;
    L_0x0312:
        if (r22 == 0) goto L_0x032e;
    L_0x0314:
        r8 = r2.f17510h;
        r14 = r25 + 1;
        r9 = r22;
        r10 = 0;
        java.lang.System.arraycopy(r9, r10, r8, r10, r14);
        r8 = r9.length;
        r10 = r24;
        if (r10 >= r8) goto L_0x032c;
    L_0x0323:
        r8 = r2.f17510h;
        r3 = r3 - r25;
        r12 = 1;
        r3 = r3 - r12;
        java.lang.System.arraycopy(r9, r10, r8, r14, r3);
    L_0x032c:
        r8 = 1;
        goto L_0x0351;
    L_0x032e:
        r9 = r22;
        r10 = r24;
        r8 = 0;
    L_0x0333:
        r14 = r25 + 1;
        if (r8 >= r14) goto L_0x0340;
    L_0x0337:
        r12 = r2.f17510h;
        r15 = r8 + r21;
        r12[r8] = r15;
        r8 = r8 + 1;
        goto L_0x0333;
    L_0x0340:
        r15 = r10 - r25;
        r8 = 1;
        r15 = r15 - r8;
        r15 = r15 + r21;
    L_0x0346:
        if (r14 >= r3) goto L_0x0351;
    L_0x0348:
        r10 = r2.f17510h;
        r12 = r14 + r15;
        r10[r14] = r12;
        r14 = r14 + 1;
        goto L_0x0346;
    L_0x0351:
        r3 = r1.f17503a;
        r10 = com.google.android.m4b.maps.bk.C4800e.C4798c.C4797a.CUT_AND_TESSELLATE;
        if (r3 != r10) goto L_0x0360;
    L_0x0357:
        r3 = r2.f17503a;
        r10 = com.google.android.m4b.maps.bk.C4800e.C4798c.C4797a.CUT_AND_TESSELLATE;
        if (r3 == r10) goto L_0x0360;
    L_0x035d:
        r13 = r1;
        r1 = r2;
        goto L_0x0361;
    L_0x0360:
        r13 = r2;
    L_0x0361:
        r2 = com.google.android.m4b.maps.bk.C4800e.C47951.f17497b;
        r3 = r1.f17503a;
        r3 = r3.ordinal();
        r2 = r2[r3];
        switch(r2) {
            case 1: goto L_0x038d;
            case 2: goto L_0x037f;
            case 3: goto L_0x0376;
            default: goto L_0x036e;
        };
    L_0x036e:
        r0 = new com.google.android.m4b.maps.bk.e$a;
        r1 = "Unknown subdivide result in tessellation";
        r0.<init>(r1);
        throw r0;
    L_0x0376:
        r2 = r20;
        r2.add(r1);
        r14 = r23;
        r12 = 0;
        goto L_0x0392;
    L_0x037f:
        r2 = r20;
        r3 = r1.f17504b;
        r10 = r1.f17510h;
        r12 = r1.f17511i;
        r14 = r23;
        com.google.android.m4b.maps.bk.C4800e.m21249a(r3, r14, r10, r12);
        goto L_0x0391;
    L_0x038d:
        r2 = r20;
        r14 = r23;
    L_0x0391:
        r12 = r1;
    L_0x0392:
        r1 = com.google.android.m4b.maps.bk.C4800e.C47951.f17497b;
        r3 = r13.f17503a;
        r3 = r3.ordinal();
        r1 = r1[r3];
        switch(r1) {
            case 1: goto L_0x03c9;
            case 2: goto L_0x03c1;
            case 3: goto L_0x03a7;
            default: goto L_0x039f;
        };
    L_0x039f:
        r0 = new com.google.android.m4b.maps.bk.e$a;
        r1 = "Unknown subdivide result in tessellation";
        r0.<init>(r1);
        throw r0;
    L_0x03a7:
        r4 = r13.f17504b;
        r7 = r13.f17505c;
        r5 = r13.f17506d;
        r6 = r13.f17507e;
        r11 = r13.f17508f;
        r1 = r13.f17509g;
        r0 = r13.f17510h;
        r15 = r13.f17511i;
        r9 = r2;
        r8 = r14;
        r2 = 0;
        r3 = 0;
        r10 = 1;
        r14 = r0;
        r0 = r19;
        goto L_0x0041;
    L_0x03c1:
        r1 = r13.f17504b;
        r3 = r13.f17510h;
        r10 = 0;
        com.google.android.m4b.maps.bk.C4800e.m21249a(r1, r14, r3, r10);
    L_0x03c9:
        r1 = r2.isEmpty();
        if (r1 != 0) goto L_0x03ef;
    L_0x03cf:
        r0 = r2.poll();
        r0 = (com.google.android.m4b.maps.bk.C4800e.C4798c) r0;
        r4 = r0.f17504b;
        r7 = r0.f17505c;
        r5 = r0.f17506d;
        r6 = r0.f17507e;
        r11 = r0.f17508f;
        r1 = r0.f17509g;
        r3 = r0.f17510h;
        r15 = r0.f17511i;
        r9 = r2;
        r8 = r14;
        r0 = r19;
        r2 = 0;
        r10 = 1;
        r14 = r3;
        r3 = 0;
        goto L_0x0041;
    L_0x03ef:
        r1 = r0;
        r8 = r14;
        r15 = r21;
        r0 = 1;
        r3 = 0;
        r10 = 1;
        r14 = r9;
        r9 = r2;
        r2 = 0;
        goto L_0x0041;
    L_0x03fb:
        r14 = r8;
        goto L_0x040f;
    L_0x03fd:
        r1 = r0.f17504b;
        r8 = com.google.android.m4b.maps.bk.C4805k.m21269a(r1);
        r0 = r0.f17504b;
        r1 = 0;
        r2 = 0;
        com.google.android.m4b.maps.bk.C4800e.m21249a(r0, r8, r2, r1);
        goto L_0x040f;
    L_0x040b:
        r8 = com.google.android.m4b.maps.bk.C4805k.m21268a();
    L_0x040f:
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bk.e.a(com.google.android.m4b.maps.bk.j, java.util.List):com.google.android.m4b.maps.bk.k");
    }

    /* renamed from: a */
    private static C4798c m21246a(C6467j c6467j, C4793b c4793b, int i, List<Object> list, C4798c c4798c) {
        if (c4798c == null) {
            c4798c = new C4798c();
        }
        C4798c c4798c2 = c4798c;
        if (c6467j.m21298e() < 3) {
            return c4798c2.m21245a(C4797a.EMPTY_MESH, null, null, 0, 0, null, null);
        }
        while (i < c6467j.c) {
            int j = c6467j.m21310j(i);
            int d = c6467j.m21297d(j);
            int e = c6467j.m21299e(j);
            C4790b f = c6467j.m21302f(j);
            int a;
            switch (f) {
                case LEFT_VERTEX:
                    a = c4793b.m21228a(d, j, f);
                    if (a == -1) {
                        a = c4793b.m21233b(j, e, f);
                        if (a == -1) {
                            break;
                        }
                        return c4798c2.m21245a(C4797a.CUT_AND_TESSELLATE, c6467j, c4793b, j, a, f, list);
                    }
                    return c4798c2.m21245a(C4797a.CUT_AND_TESSELLATE, c6467j, c4793b, j, a, f, list);
                case RIGHT_VERTEX:
                    a = c4793b.m21228a(j, e, f);
                    if (a == -1) {
                        a = c4793b.m21233b(d, j, f);
                        if (a == -1) {
                            break;
                        }
                        return c4798c2.m21245a(C4797a.CUT_AND_TESSELLATE, c6467j, c4793b, j, a, f, list);
                    }
                    return c4798c2.m21245a(C4797a.CUT_AND_TESSELLATE, c6467j, c4793b, j, a, f, list);
                case SPLIT_VERTEX:
                    return c4798c2.m21245a(C4797a.CUT_AND_TESSELLATE, c6467j, c4793b, j, c4793b.m21232b(j), f, list);
                case MERGE_VERTEX:
                    a = c4793b.m21233b(j, e, f);
                    if (a == -1) {
                        a = c4793b.m21233b(d, j, f);
                        if (a == -1) {
                            break;
                        }
                        return c4798c2.m21245a(C4797a.CUT_AND_TESSELLATE, c6467j, c4793b, j, a, f, list);
                    }
                    return c4798c2.m21245a(C4797a.CUT_AND_TESSELLATE, c6467j, c4793b, j, a, f, list);
                case START_VERTEX:
                    c4793b.m21230a(d, j, e);
                    break;
                case END_VERTEX:
                    a = c4793b.m21233b(d, j, f);
                    if (a == -1) {
                        a = c4793b.m21233b(j, e, f);
                        if (a == -1) {
                            break;
                        }
                        return c4798c2.m21245a(C4797a.CUT_AND_TESSELLATE, c6467j, c4793b, j, a, f, list);
                    }
                    return c4798c2.m21245a(C4797a.CUT_AND_TESSELLATE, c6467j, c4793b, j, a, f, list);
                default:
                    break;
            }
            i++;
        }
        return c4798c2.m21245a(C4797a.TESSELLATE_MONOTONE, c6467j, null, 0, 0, null, null);
    }

    /* renamed from: a */
    private static void m21249a(C6467j c6467j, C4805k c4805k, int[] iArr, int i) {
        C6467j c6467j2 = c6467j;
        int e = c6467j.m21298e();
        if (e >= 3) {
            C4807m c = c6467j.m21295c();
            int j = c6467j2.m21310j(0);
            int j2 = c6467j2.m21310j(1);
            c.mo5035b(j);
            c.mo5035b(j2);
            j = 2;
            while (j < e) {
                int j3 = c6467j2.m21310j(j);
                int f;
                int i2;
                if (c6467j2.m21311k(j)) {
                    f = c.m21301f();
                    while (true) {
                        i2 = j2;
                        j2 = f;
                        if (c.f17533c <= 1 || c6467j2.m21285a(j3, i2, j2) <= 0.0d) {
                            c.mo5035b(j3);
                        } else {
                            C4800e.m21250a(c4805k, j3, i2, j2, iArr, i);
                            c.mo5033b();
                            f = c.m21301f();
                        }
                    }
                    c.mo5035b(j3);
                } else if (c6467j2.m21312l(j)) {
                    f = c.m21301f();
                    while (true) {
                        i2 = j2;
                        j2 = f;
                        if (c.f17533c <= 1 || c6467j2.m21285a(j2, i2, j3) <= 0.0d) {
                            c.mo5035b(j3);
                        } else {
                            C4800e.m21250a(c4805k, j2, i2, j3, iArr, i);
                            c.mo5033b();
                            f = c.m21301f();
                        }
                    }
                    c.mo5035b(j3);
                } else {
                    int j4 = c.m21310j(0);
                    j2 = 1;
                    while (j2 < c.f17533c) {
                        int i3;
                        int j5 = c.m21310j(j2);
                        if (c6467j2.m21285a(j4, j5, j3) < 0.0d) {
                            i3 = j5;
                            C4800e.m21250a(c4805k, j3, j5, j4, iArr, i);
                        } else {
                            i3 = j5;
                            C4800e.m21250a(c4805k, j4, i3, j3, iArr, i);
                        }
                        j2++;
                        j4 = i3;
                    }
                    c.mo5030a();
                    c.mo5035b(j4);
                    c.mo5035b(j3);
                }
                j++;
                j2 = j3;
            }
        }
    }

    /* renamed from: a */
    private static void m21250a(C4805k c4805k, int i, int i2, int i3, int[] iArr, int i4) {
        if (iArr != null) {
            c4805k.mo5038a(iArr[i], iArr[i2], iArr[i3]);
        } else {
            c4805k.mo5038a(i + i4, i2 + i4, i3 + i4);
        }
    }
}
