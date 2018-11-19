package com.google.android.m4b.maps.bf;

/* renamed from: com.google.android.m4b.maps.bf.c */
public final class C4781c {
    /* renamed from: a */
    private static final byte[][] f17471a = new byte[][]{new byte[]{(byte) 16, (byte) 11, (byte) 12, (byte) 14, (byte) 12, (byte) 10, (byte) 16, (byte) 14, (byte) 13, (byte) 14, (byte) 18, (byte) 17, (byte) 16, (byte) 19, (byte) 24, (byte) 40, (byte) 26, (byte) 24, (byte) 22, (byte) 22, (byte) 24, (byte) 49, (byte) 35, (byte) 37, (byte) 29, (byte) 40, (byte) 58, (byte) 51, (byte) 61, (byte) 60, (byte) 57, (byte) 51, (byte) 56, (byte) 55, (byte) 64, (byte) 72, (byte) 92, (byte) 78, (byte) 64, (byte) 68, (byte) 87, (byte) 69, (byte) 55, (byte) 56, (byte) 80, (byte) 109, (byte) 81, (byte) 87, (byte) 95, (byte) 98, (byte) 103, (byte) 104, (byte) 103, (byte) 62, (byte) 77, (byte) 113, (byte) 121, (byte) 112, (byte) 100, (byte) 120, (byte) 92, (byte) 101, (byte) 103, (byte) 99}, new byte[]{(byte) 17, (byte) 18, (byte) 18, (byte) 24, (byte) 21, (byte) 24, (byte) 47, (byte) 26, (byte) 26, (byte) 47, (byte) 99, (byte) 66, (byte) 56, (byte) 66, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99, (byte) 99}};
    /* renamed from: b */
    private static final int[] f17472b = new int[]{-1, 1677721601, 838860801, 559240577, 419430401, 335544321, 279620289, 239674513, 209715201, 186413505, 167772161, 152520145, 139810145, 129055513, 119837257, 111848105, 104857601, 98689505, 93206753, 88301137, 83886081, 79891505, 76260073, 72944417, 69905073, 67108865, 64527757, 62137837, 59918629, 57852473, 55924053, 54120053, 52428801, 50840049, 49344753, 47934905, 46603377, 45343829, 44150569, 43018505, 41943041, 40920041, 39945753, 39016781, 38130037, 37282705, 36472209, 35696205, 34952537, 34239217, 33554433, 32883345, 32212257, 31541169, 30870077, 30198989, 29527901, 28856813, 28185725, 27514637, 26843545, 26172457, 25501369, 24830281, 24159193, 23488105, 22817013, 22145925, 21474837, 20803749, 20132661, 19461573, 18790481, 18119393, 17448305, 16777217, 16106129, 15435041, 14763953, 14092861, 13421773, 12750685, 12079597, 11408509, 10737421, 10066329, 9395241, 8724153, 8053065, 7381977, 6710889, 6039797, 5368709, 4697621, 4026533, 3355445, 2684357, 2013265, 1342177, 671089, 1};

    /* renamed from: a */
    public static synchronized byte[] m21174a(int i, int i2, int i3) {
        byte[] bArr;
        synchronized (C4781c.class) {
            bArr = new byte[64];
            i = f17471a[i];
            for (int i4 = 0; i4 < 64; i4++) {
                int i5 = 255;
                int i6 = i[i4] & 255;
                switch (i3) {
                    case 0:
                        if (i6 != 99 || i2 != 36) {
                            i6 = (int) ((((((long) i6) * ((long) f17472b[i2])) / 16777216) + 1) / 2);
                            break;
                        }
                        i6 = 138;
                        break;
                        break;
                    case 1:
                        int min;
                        if (i2 < 50) {
                            min = Math.min(5000 / i2, 5000);
                        } else {
                            min = Math.max(200 - (i2 * 2), 0);
                        }
                        i6 = ((i6 * min) + 50) / 100;
                        break;
                    default:
                        throw new IllegalArgumentException("qualityAlgorithm");
                }
                if (i6 <= 0) {
                    i5 = 1;
                } else if (i6 <= 255) {
                    i5 = i6;
                }
                bArr[i4] = (byte) i5;
            }
        }
        return bArr;
    }

    /* renamed from: a */
    private static byte[] m21176a(byte[] r19, int r20, int r21) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = r19;
        r1 = r21;
        r2 = 0;
        r3 = r0[r2];
        r4 = 1;
        r5 = -1;
        if (r3 != r5) goto L_0x0017;
    L_0x000b:
        r3 = r0[r4];
        r5 = -40;
        if (r3 != r5) goto L_0x0017;
    L_0x0011:
        r3 = new byte[r1];
        java.lang.System.arraycopy(r0, r2, r3, r2, r1);
        return r3;
    L_0x0017:
        r3 = r0[r2];
        r5 = 67;
        if (r3 != r5) goto L_0x00b5;
    L_0x001d:
        r3 = r0[r4];
        r4 = 74;
        if (r3 != r4) goto L_0x00b5;
    L_0x0023:
        r3 = 2;
        r3 = r0[r3];
        r4 = 80;
        if (r3 != r4) goto L_0x00b5;
    L_0x002a:
        r3 = 3;
        r3 = r0[r3];
        r4 = 71;
        if (r3 == r4) goto L_0x0033;
    L_0x0031:
        goto L_0x00b5;
    L_0x0033:
        r3 = 4;
        r3 = r0[r3];
        r5 = r3 & 255;
        r3 = 5;
        r3 = r0[r3];
        r3 = r3 & 255;
        r4 = 8;
        r3 = r3 << r4;
        r6 = 6;
        r6 = r0[r6];
        r6 = r6 & 255;
        r6 = r6 | r3;
        r3 = 7;
        r3 = r0[r3];
        r3 = r3 & 255;
        r3 = r3 << r4;
        r4 = r0[r4];
        r4 = r4 & 255;
        r7 = r3 | r4;
        r3 = 9;
        r3 = r0[r3];
        r8 = r3 & 255;
        r3 = 10;
        r3 = r0[r3];
        r9 = r3 & 255;
        r10 = com.google.android.m4b.maps.bf.C4779a.m21166a(r5);	 Catch:{ IllegalArgumentException -> 0x009c }
        r3 = r10 + r1;
        r11 = 11;
        r3 = r3 - r11;
        r3 = new byte[r3];
        r12 = new com.google.android.m4b.maps.bf.b;
        r4 = r12;
        r4.<init>(r5, r6, r7, r8, r9, r10);
        r1 = r1 - r11;
        r14 = r12.m21169a();
        r15 = r12.m21170b();
        r16 = r12.m21171c();
        r17 = r12.m21172d();
        r18 = r12.m21173e();
        if (r14 == 0) goto L_0x008e;
    L_0x0086:
        r0 = new java.lang.IllegalArgumentException;
        r1 = "variant";
        r0.<init>(r1);
        throw r0;
    L_0x008e:
        r4 = com.google.android.m4b.maps.bf.C4779a.m21166a(r14);
        r4 = r4 + r2;
        java.lang.System.arraycopy(r0, r11, r3, r4, r1);
        r13 = 0;
        r12 = r3;
        com.google.android.m4b.maps.bf.C4779a.m21167a(r12, r13, r14, r15, r16, r17, r18);
        return r3;
    L_0x009c:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r2 = 27;
        r1.<init>(r2);
        r2 = "Unknown variant ";
        r1.append(r2);
        r1.append(r5);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x00b5:
        r0 = new java.lang.IllegalArgumentException;
        r1 = "Input is not in compact JPEG format";
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bf.c.a(byte[], int, int):byte[]");
    }

    /* renamed from: a */
    public static byte[] m21175a(byte[] bArr) {
        return C4781c.m21176a(bArr, 0, bArr.length);
    }
}
