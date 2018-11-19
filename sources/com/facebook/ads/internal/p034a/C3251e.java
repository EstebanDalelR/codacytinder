package com.facebook.ads.internal.p034a;

import android.content.Context;
import android.net.Uri;
import com.facebook.ads.internal.p041h.C1425f;
import com.facebook.ads.internal.p047k.C1481b.C1479a;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.a.e */
class C3251e extends C1348a {
    /* renamed from: d */
    private static final String f9962d = "e";
    /* renamed from: e */
    private final Uri f9963e;
    /* renamed from: f */
    private final Map<String, String> f9964f;

    C3251e(Context context, C1425f c1425f, String str, Uri uri, Map<String, String> map) {
        super(context, c1425f, str);
        this.f9963e = uri;
        this.f9964f = map;
    }

    /* renamed from: a */
    public C1479a mo1717a() {
        return null;
    }

    /* renamed from: b */
    public void mo1718b() {
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
        r6 = this;
        r0 = r6.a;
        r0 = com.facebook.ads.internal.p041h.C3288g.m12671a(r0);
        r1 = com.facebook.ads.internal.p041h.C1426h.IMMEDIATE;
        r2 = r6.f9963e;
        r3 = "priority";
        r2 = r2.getQueryParameter(r3);
        r3 = android.text.TextUtils.isEmpty(r2);
        if (r3 != 0) goto L_0x0025;
    L_0x0016:
        r3 = com.facebook.ads.internal.p041h.C1426h.values();	 Catch:{ Exception -> 0x0025 }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ Exception -> 0x0025 }
        r2 = r2.intValue();	 Catch:{ Exception -> 0x0025 }
        r2 = r3[r2];	 Catch:{ Exception -> 0x0025 }
        r1 = r2;
    L_0x0025:
        r2 = r6.c;
        r3 = r6.f9964f;
        r4 = r6.f9963e;
        r5 = "type";
        r4 = r4.getQueryParameter(r5);
        r0.mo1744a(r2, r3, r4, r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.a.e.b():void");
    }
}
