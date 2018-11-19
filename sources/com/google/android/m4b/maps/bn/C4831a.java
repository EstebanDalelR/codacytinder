package com.google.android.m4b.maps.bn;

import com.google.android.m4b.maps.bi.C4785a;

/* renamed from: com.google.android.m4b.maps.bn.a */
public final class C4831a {
    /* renamed from: e */
    private static final C4833c f17621e = C4833c.m21420a(22);
    /* renamed from: f */
    private static int[] f17622f;
    /* renamed from: g */
    private static int[] f17623g;
    /* renamed from: a */
    private final int f17624a;
    /* renamed from: b */
    private final int f17625b;
    /* renamed from: c */
    private final int f17626c;
    /* renamed from: d */
    private final int f17627d;

    /* renamed from: a */
    private static int m21407a(int i) {
        while (i < -180000000) {
            i += 360000000;
        }
        while (i > 180000000) {
            i -= 360000000;
        }
        return i;
    }

    public C4831a(int i, int i2) {
        C4831a c4831a = this;
        int a = C4831a.m21407a(i2);
        int i3 = 80000000;
        int i4 = i;
        if (i4 <= 80000000) {
            i3 = i4;
        }
        if (i3 < -80000000) {
            i3 = -80000000;
        }
        c4831a.f17626c = i3;
        c4831a.f17627d = a;
        C4833c c4833c = f17621e;
        c4831a.f17624a = (int) ((((long) c4833c.m21421a()) / 2) + ((((long) a) * ((long) c4833c.m21421a())) / 360000000));
        C4833c c4833c2 = f17621e;
        i4 = (Math.abs(i3) / 1000000) + 1;
        int abs = Math.abs(i3) % 1000000;
        int[] c = C4831a.m21410c();
        int i5 = i4 - 1;
        int i6 = i4 + 1;
        int i7 = i4 + 2;
        int i8 = ((((c[i5] * -1) + (c[i4] * 3)) - (c[i6] * 3)) + c[i7]) / 6;
        int i9 = (((c[i5] * 3) - (c[i4] * 6)) + (c[i6] * 3)) / 6;
        i5 = ((((c[i5] * -2) - (c[i4] * 3)) + (c[i6] * 6)) - c[i7]) / 6;
        i4 = c[i4];
        long j = (long) abs;
        i4 = (int) (((((((((((long) i8) * j) * j) / 1000000) * j) / 1000000) / 1000000) + ((((((long) i9) * j) * j) / 1000000) / 1000000)) + ((((long) i5) * j) / 1000000)) + ((long) i4));
        if (i3 < 0) {
            i4 = -i4;
        }
        c4831a.f17625b = (int) ((((long) c4833c2.m21421a()) / 2) - ((long) (((int) (((((long) i4) * ((long) c4833c2.m21421a())) * 10) / 360000000)) / 10)));
    }

    /* renamed from: c */
    private static synchronized int[] m21410c() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = com.google.android.m4b.maps.bn.C4831a.class;
        monitor-enter(r0);
        r1 = f17622f;	 Catch:{ all -> 0x004d }
        if (r1 != 0) goto L_0x0049;	 Catch:{ all -> 0x004d }
    L_0x0007:
        r1 = 84;	 Catch:{ all -> 0x004d }
        r1 = new int[r1];	 Catch:{ all -> 0x004d }
        f17622f = r1;	 Catch:{ all -> 0x004d }
        r1 = 253; // 0xfd float:3.55E-43 double:1.25E-321;
        r1 = new byte[r1];	 Catch:{ IOException -> 0x0041 }
        r1 = {-1, -16, -67, -115, 15, 66, 115, 15, 66, 115, 15, 67, -93, 15, 70, 6, 15, 73, -103, 15, 78, 97, 15, 84, 94, 15, 91, -109, 15, 100, 2, 15, 109, -80, 15, 120, -97, 15, -124, -44, 15, -110, 84, 15, -95, 38, 15, -79, 78, 15, -62, -45, 15, -43, -67, 15, -22, 21, 15, -1, -31, 16, 23, 45, 16, 48, 1, 16, 74, 107, 16, 102, 116, 16, -124, 43, 16, -93, -100, 16, -60, -41, 16, -25, -19, 17, 12, -18, 17, 51, -20, 17, 92, -4, 17, -120, 52, 17, -75, -87, 17, -27, 118, 18, 23, -76, 18, 76, -127, 18, -125, -3, 18, -66, 70, 18, -5, -124, 19, 59, -37, 19, 127, 119, 19, -58, -122, 20, 17, 56, 20, 95, -60, 20, -78, 100, 21, 9, 87, 21, 100, -27, 21, -59, 86, 22, 42, -1, 22, -106, 58, 23, 7, 109, 23, 127, 2, 23, -3, 117, 24, -125, 72, 25, 17, 20, 25, -89, 120, 26, 71, 46, 26, -15, 3, 27, -91, -39, 28, 102, -77, 29, 52, -77, 30, 17, 31, 30, -3, 111, 31, -5, 74, 33, 12, -105, 34, 51, -120, 35, 114, -91, 36, -52, -30, 38, 69, -76, 39, -31, 42, 41, -92, 25, 43, -108, 70, 45, -72, -91, 48, 25, -84, 50, -63, -63, 53, -67, -47, 57, 30, 28, 60, -9, 105, 65, 100, -96, 70, -119, 82, 76, -107, 115, 83, -53, 79, 92, -119, 52, 103, 90, 12};	 Catch:{ IOException -> 0x0041 }
        r1 = com.google.android.m4b.maps.ap.C4655c.m20768a(r1);	 Catch:{ IOException -> 0x0041 }
        r2 = f17622f;	 Catch:{ IOException -> 0x0041 }
        r3 = 0;	 Catch:{ IOException -> 0x0041 }
        r4 = r1.readInt();	 Catch:{ IOException -> 0x0041 }
        r2[r3] = r4;	 Catch:{ IOException -> 0x0041 }
        r3 = 1;	 Catch:{ IOException -> 0x0041 }
    L_0x0022:
        r4 = r2.length;	 Catch:{ IOException -> 0x0041 }
        if (r3 >= r4) goto L_0x0049;	 Catch:{ IOException -> 0x0041 }
    L_0x0025:
        r4 = r3 + -1;	 Catch:{ IOException -> 0x0041 }
        r4 = r2[r4];	 Catch:{ IOException -> 0x0041 }
        r5 = r1.readUnsignedByte();	 Catch:{ IOException -> 0x0041 }
        r5 = r5 << 16;	 Catch:{ IOException -> 0x0041 }
        r6 = r1.readUnsignedByte();	 Catch:{ IOException -> 0x0041 }
        r6 = r6 << 8;	 Catch:{ IOException -> 0x0041 }
        r5 = r5 | r6;	 Catch:{ IOException -> 0x0041 }
        r6 = r1.readUnsignedByte();	 Catch:{ IOException -> 0x0041 }
        r5 = r5 | r6;	 Catch:{ IOException -> 0x0041 }
        r4 = r4 + r5;	 Catch:{ IOException -> 0x0041 }
        r2[r3] = r4;	 Catch:{ IOException -> 0x0041 }
        r3 = r3 + 1;
        goto L_0x0022;
    L_0x0041:
        r1 = new java.lang.RuntimeException;	 Catch:{ all -> 0x004d }
        r2 = "Can't read mercator.dat";	 Catch:{ all -> 0x004d }
        r1.<init>(r2);	 Catch:{ all -> 0x004d }
        throw r1;	 Catch:{ all -> 0x004d }
    L_0x0049:
        r1 = f17622f;	 Catch:{ all -> 0x004d }
        monitor-exit(r0);
        return r1;
    L_0x004d:
        r1 = move-exception;
        monitor-exit(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bn.a.c():int[]");
    }

    /* renamed from: a */
    public final int m21411a() {
        return this.f17626c;
    }

    /* renamed from: b */
    public final int m21412b() {
        return this.f17627d;
    }

    public final String toString() {
        int i = this.f17626c;
        int i2 = this.f17627d;
        String a = C4785a.m21188a(i);
        String a2 = C4785a.m21188a(i2);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(a).length() + 1) + String.valueOf(a2).length());
        stringBuilder.append(a);
        stringBuilder.append(',');
        stringBuilder.append(a2);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static com.google.android.m4b.maps.bn.C4831a m21408a(java.lang.String r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = 44;
        r1 = r4.indexOf(r0);
        r2 = 0;
        r3 = -1;
        if (r1 == r3) goto L_0x0023;
    L_0x000a:
        r4 = com.google.android.m4b.maps.bi.C4785a.m21190a(r4, r0);	 Catch:{ NumberFormatException -> 0x0022 }
        r0 = 0;	 Catch:{ NumberFormatException -> 0x0022 }
        r0 = r4[r0];	 Catch:{ NumberFormatException -> 0x0022 }
        r0 = com.google.android.m4b.maps.bn.C4831a.m21409b(r0);	 Catch:{ NumberFormatException -> 0x0022 }
        r1 = 1;	 Catch:{ NumberFormatException -> 0x0022 }
        r4 = r4[r1];	 Catch:{ NumberFormatException -> 0x0022 }
        r4 = com.google.android.m4b.maps.bn.C4831a.m21409b(r4);	 Catch:{ NumberFormatException -> 0x0022 }
        r1 = new com.google.android.m4b.maps.bn.a;	 Catch:{ NumberFormatException -> 0x0022 }
        r1.<init>(r0, r4);	 Catch:{ NumberFormatException -> 0x0022 }
        return r1;
    L_0x0022:
        return r2;
    L_0x0023:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bn.a.a(java.lang.String):com.google.android.m4b.maps.bn.a");
    }

    /* renamed from: b */
    private static int m21409b(String str) {
        str = str.trim();
        int i = -1;
        if (str.indexOf(46) == -1) {
            return Integer.parseInt(str) * 1000000;
        }
        String[] a = C4785a.m21190a(str, '.');
        if (a.length > 2) {
            String str2 = "Coordinate has more than one decimal point: ";
            str = String.valueOf(str);
            throw new NumberFormatException(str.length() != 0 ? str2.concat(str) : new String(str2));
        }
        int parseInt = Integer.parseInt(a[0]);
        Object obj = a[0].indexOf("-") != -1 ? 1 : null;
        String substring = a[1].substring(0, Math.min(6, a[1].length()));
        if (substring.length() != 0 && substring.charAt(0) >= '0') {
            if (substring.charAt(0) <= '9') {
                str = Integer.parseInt(C4785a.m21189a(substring, 6, '0'));
                parseInt *= 1000000;
                if (obj == null) {
                    i = 1;
                }
                return parseInt + (str * i);
            }
        }
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 29);
        stringBuilder.append("Invalid fractional part in \"");
        stringBuilder.append(str);
        stringBuilder.append("\"");
        throw new NumberFormatException(stringBuilder.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4831a)) {
            return false;
        }
        C4831a c4831a = (C4831a) obj;
        return (this.f17626c == c4831a.f17626c && this.f17627d == c4831a.f17627d) || (this.f17624a == c4831a.f17624a && this.f17625b == c4831a.f17625b);
    }

    public final int hashCode() {
        return (this.f17626c * 29) + this.f17627d;
    }
}
