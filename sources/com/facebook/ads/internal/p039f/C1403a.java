package com.facebook.ads.internal.p039f;

import android.content.Context;
import android.os.Build.VERSION;

/* renamed from: com.facebook.ads.internal.f.a */
public class C1403a {
    /* renamed from: a */
    public static final String f3822a = VERSION.RELEASE;
    /* renamed from: b */
    public static String f3823b = "";
    /* renamed from: c */
    public static String f3824c = "";
    /* renamed from: d */
    public static String f3825d = "";
    /* renamed from: e */
    public static String f3826e = "";
    /* renamed from: f */
    public static String f3827f = "";
    /* renamed from: g */
    public static int f3828g = 0;
    /* renamed from: h */
    public static String f3829h = "";
    /* renamed from: i */
    public static String f3830i = "";
    /* renamed from: j */
    public static int f3831j = 0;
    /* renamed from: k */
    public static String f3832k = "";
    /* renamed from: l */
    public static int f3833l = 0;
    /* renamed from: m */
    public static String f3834m = "";
    /* renamed from: n */
    private static boolean f3835n = false;

    /* renamed from: a */
    public static synchronized void m4872a(Context context) {
        synchronized (C1403a.class) {
            if (!f3835n) {
                f3835n = true;
                C1403a.m4873b(context);
            }
            C1403a.m4874c(context);
        }
    }

    /* renamed from: b */
    private static void m4873b(android.content.Context r4) {
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
        r0 = r4.getPackageManager();
        r1 = 0;
        r2 = r4.getPackageName();	 Catch:{ NameNotFoundException -> 0x0019 }
        r2 = r0.getPackageInfo(r2, r1);	 Catch:{ NameNotFoundException -> 0x0019 }
        r3 = r2.packageName;	 Catch:{ NameNotFoundException -> 0x0019 }
        f3825d = r3;	 Catch:{ NameNotFoundException -> 0x0019 }
        r3 = r2.versionName;	 Catch:{ NameNotFoundException -> 0x0019 }
        f3827f = r3;	 Catch:{ NameNotFoundException -> 0x0019 }
        r2 = r2.versionCode;	 Catch:{ NameNotFoundException -> 0x0019 }
        f3828g = r2;	 Catch:{ NameNotFoundException -> 0x0019 }
    L_0x0019:
        r2 = f3825d;	 Catch:{ Exception -> 0x0035 }
        if (r2 == 0) goto L_0x0035;	 Catch:{ Exception -> 0x0035 }
    L_0x001d:
        r2 = f3825d;	 Catch:{ Exception -> 0x0035 }
        r2 = r2.length();	 Catch:{ Exception -> 0x0035 }
        if (r2 < 0) goto L_0x0035;	 Catch:{ Exception -> 0x0035 }
    L_0x0025:
        r2 = f3825d;	 Catch:{ Exception -> 0x0035 }
        r2 = r0.getInstallerPackageName(r2);	 Catch:{ Exception -> 0x0035 }
        if (r2 == 0) goto L_0x0035;	 Catch:{ Exception -> 0x0035 }
    L_0x002d:
        r3 = r2.length();	 Catch:{ Exception -> 0x0035 }
        if (r3 <= 0) goto L_0x0035;	 Catch:{ Exception -> 0x0035 }
    L_0x0033:
        f3829h = r2;	 Catch:{ Exception -> 0x0035 }
    L_0x0035:
        r2 = r4.getPackageName();	 Catch:{ NameNotFoundException -> 0x004f }
        r1 = r0.getApplicationInfo(r2, r1);	 Catch:{ NameNotFoundException -> 0x004f }
        r0 = r0.getApplicationLabel(r1);	 Catch:{ NameNotFoundException -> 0x004f }
        if (r0 == 0) goto L_0x004f;	 Catch:{ NameNotFoundException -> 0x004f }
    L_0x0043:
        r1 = r0.length();	 Catch:{ NameNotFoundException -> 0x004f }
        if (r1 <= 0) goto L_0x004f;	 Catch:{ NameNotFoundException -> 0x004f }
    L_0x0049:
        r0 = r0.toString();	 Catch:{ NameNotFoundException -> 0x004f }
        f3826e = r0;	 Catch:{ NameNotFoundException -> 0x004f }
    L_0x004f:
        r0 = "phone";
        r4 = r4.getSystemService(r0);
        r4 = (android.telephony.TelephonyManager) r4;
        if (r4 == 0) goto L_0x0067;
    L_0x0059:
        r4 = r4.getNetworkOperatorName();
        if (r4 == 0) goto L_0x0067;
    L_0x005f:
        r0 = r4.length();
        if (r0 <= 0) goto L_0x0067;
    L_0x0065:
        f3830i = r4;
    L_0x0067:
        r4 = android.os.Build.MANUFACTURER;
        if (r4 == 0) goto L_0x0073;
    L_0x006b:
        r0 = r4.length();
        if (r0 <= 0) goto L_0x0073;
    L_0x0071:
        f3823b = r4;
    L_0x0073:
        r4 = android.os.Build.MODEL;
        if (r4 == 0) goto L_0x0081;
    L_0x0077:
        r4 = r4.length();
        if (r4 <= 0) goto L_0x0081;
    L_0x007d:
        r4 = android.os.Build.MODEL;
        f3824c = r4;
    L_0x0081:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.f.a.b(android.content.Context):void");
    }

    /* renamed from: c */
    private static void m4874c(android.content.Context r1) {
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
        r0 = "connectivity";	 Catch:{ Exception -> 0x002c }
        r1 = r1.getSystemService(r0);	 Catch:{ Exception -> 0x002c }
        r1 = (android.net.ConnectivityManager) r1;	 Catch:{ Exception -> 0x002c }
        r1 = r1.getActiveNetworkInfo();	 Catch:{ Exception -> 0x002c }
        if (r1 == 0) goto L_0x002c;	 Catch:{ Exception -> 0x002c }
    L_0x000e:
        r0 = r1.isConnectedOrConnecting();	 Catch:{ Exception -> 0x002c }
        if (r0 == 0) goto L_0x002c;	 Catch:{ Exception -> 0x002c }
    L_0x0014:
        r0 = r1.getType();	 Catch:{ Exception -> 0x002c }
        f3831j = r0;	 Catch:{ Exception -> 0x002c }
        r0 = r1.getTypeName();	 Catch:{ Exception -> 0x002c }
        f3832k = r0;	 Catch:{ Exception -> 0x002c }
        r0 = r1.getSubtype();	 Catch:{ Exception -> 0x002c }
        f3833l = r0;	 Catch:{ Exception -> 0x002c }
        r1 = r1.getSubtypeName();	 Catch:{ Exception -> 0x002c }
        f3834m = r1;	 Catch:{ Exception -> 0x002c }
    L_0x002c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.f.a.c(android.content.Context):void");
    }
}
