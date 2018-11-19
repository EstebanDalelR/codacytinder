package com.google.android.m4b.maps.ay;

import android.util.Log;

/* renamed from: com.google.android.m4b.maps.ay.u */
public final class C4728u {
    /* renamed from: a */
    private static final int f17366a;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static {
        /*
        r0 = "debug.mapview.logs";
        r0 = com.google.android.m4b.maps.ay.C4731z.m21053a(r0);
        r1 = "NOTHING";
        r0 = r0.mo5813a(r1);
        r0 = (java.lang.String) r0;
        r0 = r0.toUpperCase();
        r1 = r0.hashCode();
        r2 = 7;
        r3 = 1;
        r4 = 4;
        r5 = 5;
        r6 = 3;
        r7 = 6;
        r8 = 2;
        r9 = 0;
        switch(r1) {
            case -1938386595: goto L_0x0068;
            case -1447660627: goto L_0x005e;
            case 64897: goto L_0x0054;
            case 2251950: goto L_0x004a;
            case 2656902: goto L_0x0040;
            case 64921139: goto L_0x0036;
            case 66247144: goto L_0x002c;
            case 1069090146: goto L_0x0022;
            default: goto L_0x0021;
        };
    L_0x0021:
        goto L_0x0072;
    L_0x0022:
        r1 = "VERBOSE";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0072;
    L_0x002a:
        r0 = 2;
        goto L_0x0073;
    L_0x002c:
        r1 = "ERROR";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0072;
    L_0x0034:
        r0 = 6;
        goto L_0x0073;
    L_0x0036:
        r1 = "DEBUG";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0072;
    L_0x003e:
        r0 = 3;
        goto L_0x0073;
    L_0x0040:
        r1 = "WARN";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0072;
    L_0x0048:
        r0 = 5;
        goto L_0x0073;
    L_0x004a:
        r1 = "INFO";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0072;
    L_0x0052:
        r0 = 4;
        goto L_0x0073;
    L_0x0054:
        r1 = "ALL";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0072;
    L_0x005c:
        r0 = 0;
        goto L_0x0073;
    L_0x005e:
        r1 = "NOTHING";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0072;
    L_0x0066:
        r0 = 1;
        goto L_0x0073;
    L_0x0068:
        r1 = "PERTAG";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0072;
    L_0x0070:
        r0 = 7;
        goto L_0x0073;
    L_0x0072:
        r0 = -1;
    L_0x0073:
        switch(r0) {
            case 0: goto L_0x0083;
            case 1: goto L_0x0084;
            case 2: goto L_0x0081;
            case 3: goto L_0x007f;
            case 4: goto L_0x007d;
            case 5: goto L_0x007b;
            case 6: goto L_0x0079;
            case 7: goto L_0x0077;
            default: goto L_0x0076;
        };
    L_0x0076:
        goto L_0x0084;
    L_0x0077:
        r9 = 7;
        goto L_0x0084;
    L_0x0079:
        r9 = 6;
        goto L_0x0084;
    L_0x007b:
        r9 = 5;
        goto L_0x0084;
    L_0x007d:
        r9 = 4;
        goto L_0x0084;
    L_0x007f:
        r9 = 3;
        goto L_0x0084;
    L_0x0081:
        r9 = 2;
        goto L_0x0084;
    L_0x0083:
        r9 = 1;
    L_0x0084:
        f17366a = r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.ay.u.<clinit>():void");
    }

    /* renamed from: a */
    public static final boolean m21050a(String str, int i) {
        switch (f17366a) {
            case 0:
                return false;
            case 1:
                return true;
            case 2:
                return i >= 2;
            case 3:
                return i >= 3;
            case 4:
                return i >= 4;
            case 5:
                return i >= 5;
            case 6:
                return i >= 6;
            case 7:
                return Log.isLoggable(str, i);
            default:
                return false;
        }
    }

    /* renamed from: a */
    public static void m21048a(int i, String str) {
        Log.println(i, "Google Maps Android API", str);
    }

    /* renamed from: a */
    public static void m21049a(String str) {
        C4728u.m21048a(6, str);
    }
}
