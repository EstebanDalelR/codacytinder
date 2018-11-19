package com.foursquare.internal.util;

import android.annotation.TargetApi;

@TargetApi(18)
/* renamed from: com.foursquare.internal.util.l */
public class C4370l extends C4229k {
    /* renamed from: b */
    public boolean mo2015b(android.content.Context r3) {
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
        r2 = this;
        r3 = r3.getApplicationContext();
        r0 = "wifi";
        r3 = r3.getSystemService(r0);
        r3 = (android.net.wifi.WifiManager) r3;
        r0 = 0;
        if (r3 != 0) goto L_0x0010;
    L_0x000f:
        return r0;
    L_0x0010:
        r1 = r3.isWifiEnabled();	 Catch:{ Exception -> 0x001e }
        if (r1 != 0) goto L_0x001c;	 Catch:{ Exception -> 0x001e }
    L_0x0016:
        r3 = r3.isScanAlwaysAvailable();	 Catch:{ Exception -> 0x001e }
        if (r3 == 0) goto L_0x001d;
    L_0x001c:
        r0 = 1;
    L_0x001d:
        return r0;
    L_0x001e:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.internal.util.l.b(android.content.Context):boolean");
    }
}
