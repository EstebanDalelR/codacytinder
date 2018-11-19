package com.facebook.ads.internal.p040g;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.g.a */
public class C1405a {
    /* renamed from: a */
    private final String f3852a;
    /* renamed from: b */
    private final JSONObject f3853b;
    /* renamed from: c */
    private final Map<C1417j, List<String>> f3854c = new HashMap();

    public C1405a(java.lang.String r6, org.json.JSONObject r7, @android.support.annotation.Nullable org.json.JSONArray r8) {
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
        r5 = this;
        r5.<init>();
        r0 = new java.util.HashMap;
        r0.<init>();
        r5.f3854c = r0;
        r5.f3852a = r6;
        r5.f3853b = r7;
        if (r8 == 0) goto L_0x0065;
    L_0x0010:
        r6 = r8.length();
        if (r6 != 0) goto L_0x0017;
    L_0x0016:
        return;
    L_0x0017:
        r6 = com.facebook.ads.internal.p040g.C1417j.values();
        r7 = r6.length;
        r0 = 0;
        r1 = 0;
    L_0x001e:
        if (r1 >= r7) goto L_0x002f;
    L_0x0020:
        r2 = r6[r1];
        r3 = r5.f3854c;
        r4 = new java.util.LinkedList;
        r4.<init>();
        r3.put(r2, r4);
        r1 = r1 + 1;
        goto L_0x001e;
    L_0x002f:
        r6 = r8.length();
        if (r0 >= r6) goto L_0x0065;
    L_0x0035:
        r6 = r8.getJSONObject(r0);	 Catch:{ Exception -> 0x0062 }
        r7 = "type";	 Catch:{ Exception -> 0x0062 }
        r7 = r6.getString(r7);	 Catch:{ Exception -> 0x0062 }
        r1 = "url";	 Catch:{ Exception -> 0x0062 }
        r6 = r6.getString(r1);	 Catch:{ Exception -> 0x0062 }
        r1 = java.util.Locale.US;	 Catch:{ Exception -> 0x0062 }
        r7 = r7.toUpperCase(r1);	 Catch:{ Exception -> 0x0062 }
        r7 = com.facebook.ads.internal.p040g.C1417j.valueOf(r7);	 Catch:{ Exception -> 0x0062 }
        if (r7 == 0) goto L_0x0062;	 Catch:{ Exception -> 0x0062 }
    L_0x0051:
        r1 = android.text.TextUtils.isEmpty(r6);	 Catch:{ Exception -> 0x0062 }
        if (r1 != 0) goto L_0x0062;	 Catch:{ Exception -> 0x0062 }
    L_0x0057:
        r1 = r5.f3854c;	 Catch:{ Exception -> 0x0062 }
        r7 = r1.get(r7);	 Catch:{ Exception -> 0x0062 }
        r7 = (java.util.List) r7;	 Catch:{ Exception -> 0x0062 }
        r7.add(r6);	 Catch:{ Exception -> 0x0062 }
    L_0x0062:
        r0 = r0 + 1;
        goto L_0x002f;
    L_0x0065:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.g.a.<init>(java.lang.String, org.json.JSONObject, org.json.JSONArray):void");
    }

    /* renamed from: a */
    public String m4888a() {
        return this.f3852a;
    }

    /* renamed from: a */
    public List<String> m4889a(C1417j c1417j) {
        return (List) this.f3854c.get(c1417j);
    }

    /* renamed from: b */
    public JSONObject m4890b() {
        return this.f3853b;
    }
}
