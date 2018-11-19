package com.facebook.ads.internal.p042i;

import com.facebook.ads.internal.adapters.C1357f;

/* renamed from: com.facebook.ads.internal.i.a */
public class C1431a {
    /* renamed from: a */
    private static final String[] f3947a = new String[]{"com.flurry.android.FlurryAgent", "com.flurry.android.ads.FlurryAdErrorType", "com.flurry.android.ads.FlurryAdNative", "com.flurry.android.ads.FlurryAdNativeAsset", "com.flurry.android.ads.FlurryAdNativeListener"};
    /* renamed from: b */
    private static final String[] f3948b = new String[]{"com.inmobi.ads.InMobiNative", "com.inmobi.sdk.InMobiSdk"};
    /* renamed from: c */
    private static final String[] f3949c = new String[]{"com.google.android.gms.ads.formats.NativeAdView"};

    /* renamed from: a */
    public static boolean m5002a(C1357f c1357f) {
        String[] strArr;
        switch (c1357f) {
            case AN:
                return true;
            case YAHOO:
                strArr = f3947a;
                break;
            case INMOBI:
                strArr = f3948b;
                break;
            case ADMOB:
                strArr = f3949c;
                break;
            default:
                return false;
        }
        return C1431a.m5004a(strArr);
    }

    /* renamed from: a */
    private static boolean m5003a(java.lang.String r0) {
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
        java.lang.Class.forName(r0);	 Catch:{ Throwable -> 0x0005 }
        r0 = 1;
        return r0;
    L_0x0005:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.i.a.a(java.lang.String):boolean");
    }

    /* renamed from: a */
    private static boolean m5004a(String[] strArr) {
        if (strArr == null) {
            return false;
        }
        for (String a : strArr) {
            if (!C1431a.m5003a(a)) {
                return false;
            }
        }
        return true;
    }
}
