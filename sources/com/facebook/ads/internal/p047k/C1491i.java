package com.facebook.ads.internal.p047k;

import android.text.TextUtils;
import android.webkit.WebView;
import com.facebook.ads.AdSettings;

/* renamed from: com.facebook.ads.internal.k.i */
public class C1491i {
    /* renamed from: a */
    public static String m5258a() {
        if (TextUtils.isEmpty(AdSettings.getUrlPrefix())) {
            return "https://www.facebook.com/";
        }
        return String.format("https://www.%s.facebook.com", new Object[]{AdSettings.getUrlPrefix()});
    }

    /* renamed from: a */
    public static void m5259a(WebView webView) {
        webView.loadUrl("about:blank");
        webView.clearCache(true);
    }

    @android.annotation.TargetApi(21)
    /* renamed from: b */
    public static void m5260b(android.webkit.WebView r4) {
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
        r4 = r4.getSettings();
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 0;
        r2 = 21;
        if (r0 < r2) goto L_0x000f;
    L_0x000b:
        r4.setMixedContentMode(r1);
        return;
    L_0x000f:
        r0 = android.webkit.WebSettings.class;	 Catch:{ Exception -> 0x0025 }
        r2 = "setMixedContentMode";	 Catch:{ Exception -> 0x0025 }
        r3 = new java.lang.Class[r1];	 Catch:{ Exception -> 0x0025 }
        r0 = r0.getMethod(r2, r3);	 Catch:{ Exception -> 0x0025 }
        r2 = 1;	 Catch:{ Exception -> 0x0025 }
        r2 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x0025 }
        r3 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0025 }
        r2[r1] = r3;	 Catch:{ Exception -> 0x0025 }
        r0.invoke(r4, r2);	 Catch:{ Exception -> 0x0025 }
    L_0x0025:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.k.i.b(android.webkit.WebView):void");
    }
}
