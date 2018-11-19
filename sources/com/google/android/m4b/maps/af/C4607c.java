package com.google.android.m4b.maps.af;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.facebook.ads.AdError;
import java.math.RoundingMode;

/* renamed from: com.google.android.m4b.maps.af.c */
public final class C4607c {
    /* renamed from: a */
    private static byte[] f17018a = new byte[]{(byte) 9, (byte) 9, (byte) 9, (byte) 8, (byte) 8, (byte) 8, (byte) 7, (byte) 7, (byte) 7, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 5, (byte) 5, (byte) 5, (byte) 4, (byte) 4, (byte) 4, (byte) 3, (byte) 3, (byte) 3, (byte) 3, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    /* renamed from: b */
    private static int[] f17019b = new int[]{1, 10, 100, AdError.NETWORK_ERROR_CODE, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    /* renamed from: c */
    private static int[] f17020c = new int[]{3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED};
    /* renamed from: d */
    private static final int[] f17021d = new int[]{1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};
    /* renamed from: e */
    private static int[] f17022e = new int[]{ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    /* renamed from: com.google.android.m4b.maps.af.c$1 */
    static /* synthetic */ class C46061 {
        /* renamed from: a */
        static final /* synthetic */ int[] f17017a = new int[RoundingMode.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = java.math.RoundingMode.values();
            r0 = r0.length;
            r0 = new int[r0];
            f17017a = r0;
            r0 = f17017a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = java.math.RoundingMode.UNNECESSARY;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f17017a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = java.math.RoundingMode.DOWN;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = f17017a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = java.math.RoundingMode.FLOOR;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = f17017a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = java.math.RoundingMode.UP;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r0 = f17017a;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = java.math.RoundingMode.CEILING;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2 = 5;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r0 = f17017a;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1 = java.math.RoundingMode.HALF_DOWN;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x004b }
            r2 = 6;	 Catch:{ NoSuchFieldError -> 0x004b }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            r0 = f17017a;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r1 = java.math.RoundingMode.HALF_UP;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0056 }
            r2 = 7;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0056 }
        L_0x0056:
            r0 = f17017a;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r1 = java.math.RoundingMode.HALF_EVEN;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0062 }
            r2 = 8;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0062 }
        L_0x0062:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.af.c.1.<clinit>():void");
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static int m20695a(int r5, int r6, java.math.RoundingMode r7) {
        /*
        com.google.android.m4b.maps.p125y.C5571j.m24292a(r7);
        if (r6 != 0) goto L_0x000d;
    L_0x0005:
        r5 = new java.lang.ArithmeticException;
        r6 = "/ by zero";
        r5.<init>(r6);
        throw r5;
    L_0x000d:
        r0 = r5 / r6;
        r1 = r6 * r0;
        r1 = r5 - r1;
        if (r1 != 0) goto L_0x0016;
    L_0x0015:
        return r0;
    L_0x0016:
        r5 = r5 ^ r6;
        r5 = r5 >> 31;
        r2 = 1;
        r5 = r5 | r2;
        r3 = com.google.android.m4b.maps.af.C4607c.C46061.f17017a;
        r4 = r7.ordinal();
        r3 = r3[r4];
        r4 = 0;
        switch(r3) {
            case 1: goto L_0x0058;
            case 2: goto L_0x005f;
            case 3: goto L_0x0055;
            case 4: goto L_0x0060;
            case 5: goto L_0x0052;
            case 6: goto L_0x002d;
            case 7: goto L_0x002d;
            case 8: goto L_0x002d;
            default: goto L_0x0027;
        };
    L_0x0027:
        r5 = new java.lang.AssertionError;
        r5.<init>();
        throw r5;
    L_0x002d:
        r1 = java.lang.Math.abs(r1);
        r6 = java.lang.Math.abs(r6);
        r6 = r6 - r1;
        r1 = r1 - r6;
        if (r1 != 0) goto L_0x004f;
    L_0x0039:
        r6 = java.math.RoundingMode.HALF_UP;
        if (r7 == r6) goto L_0x0060;
    L_0x003d:
        r6 = java.math.RoundingMode.HALF_EVEN;
        if (r7 != r6) goto L_0x0043;
    L_0x0041:
        r6 = 1;
        goto L_0x0044;
    L_0x0043:
        r6 = 0;
    L_0x0044:
        r7 = r0 & 1;
        if (r7 == 0) goto L_0x004a;
    L_0x0048:
        r7 = 1;
        goto L_0x004b;
    L_0x004a:
        r7 = 0;
    L_0x004b:
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x005f;
    L_0x004e:
        goto L_0x0060;
    L_0x004f:
        if (r1 <= 0) goto L_0x005f;
    L_0x0051:
        goto L_0x0060;
    L_0x0052:
        if (r5 <= 0) goto L_0x005f;
    L_0x0054:
        goto L_0x0060;
    L_0x0055:
        if (r5 >= 0) goto L_0x005f;
    L_0x0057:
        goto L_0x0060;
    L_0x0058:
        if (r1 != 0) goto L_0x005b;
    L_0x005a:
        goto L_0x005c;
    L_0x005b:
        r2 = 0;
    L_0x005c:
        com.google.android.m4b.maps.af.C4608d.m20697a(r2);
    L_0x005f:
        r2 = 0;
    L_0x0060:
        if (r2 == 0) goto L_0x0063;
    L_0x0062:
        r0 = r0 + r5;
    L_0x0063:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.af.c.a(int, int, java.math.RoundingMode):int");
    }

    /* renamed from: a */
    public static int m20696a(int i, RoundingMode roundingMode) {
        String str = "x";
        if (i <= 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" (");
            stringBuilder.append(i);
            stringBuilder.append(") must be > 0");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        switch (C46061.f17017a[roundingMode.ordinal()]) {
            case 1:
                roundingMode = null;
                int i2 = i > 0 ? 1 : 0;
                if (((i - 1) & i) == 0) {
                    roundingMode = true;
                }
                C4608d.m20697a(roundingMode & i2);
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                roundingMode = Integer.numberOfLeadingZeros(i);
                return (31 - roundingMode) + (((((-1257966797 >>> roundingMode) - i) ^ -1) ^ -1) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }
}
