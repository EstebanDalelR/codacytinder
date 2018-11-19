package com.appsflyer;

/* renamed from: com.appsflyer.g */
public class C0929g {
    @android.support.annotation.Nullable
    /* renamed from: a */
    static org.json.JSONObject m3168a(java.lang.String r2) {
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
        r0 = 0;
        r1 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0040, Throwable -> 0x0028 }
        r1.<init>(r2);	 Catch:{ JSONException -> 0x0040, Throwable -> 0x0028 }
        r2 = "monitor";	 Catch:{ JSONException -> 0x0041, Throwable -> 0x0026 }
        r0 = 0;	 Catch:{ JSONException -> 0x0041, Throwable -> 0x0026 }
        r2 = r1.optBoolean(r2, r0);	 Catch:{ JSONException -> 0x0041, Throwable -> 0x0026 }
        if (r2 == 0) goto L_0x0017;	 Catch:{ JSONException -> 0x0041, Throwable -> 0x0026 }
    L_0x000f:
        r2 = com.appsflyer.aa.m3121a();	 Catch:{ JSONException -> 0x0041, Throwable -> 0x0026 }
        r2.m3137b();	 Catch:{ JSONException -> 0x0041, Throwable -> 0x0026 }
        goto L_0x004f;	 Catch:{ JSONException -> 0x0041, Throwable -> 0x0026 }
    L_0x0017:
        r2 = com.appsflyer.aa.m3121a();	 Catch:{ JSONException -> 0x0041, Throwable -> 0x0026 }
        r2.m3141e();	 Catch:{ JSONException -> 0x0041, Throwable -> 0x0026 }
        r2 = com.appsflyer.aa.m3121a();	 Catch:{ JSONException -> 0x0041, Throwable -> 0x0026 }
        r2.m3139c();	 Catch:{ JSONException -> 0x0041, Throwable -> 0x0026 }
        goto L_0x004f;
    L_0x0026:
        r2 = move-exception;
        goto L_0x002a;
    L_0x0028:
        r2 = move-exception;
        r1 = r0;
    L_0x002a:
        r0 = r2.getMessage();
        com.appsflyer.AFLogger.m3073a(r0, r2);
        r2 = com.appsflyer.aa.m3121a();
        r2.m3141e();
        r2 = com.appsflyer.aa.m3121a();
        r2.m3139c();
        goto L_0x004f;
    L_0x0040:
        r1 = r0;
    L_0x0041:
        r2 = com.appsflyer.aa.m3121a();
        r2.m3141e();
        r2 = com.appsflyer.aa.m3121a();
        r2.m3139c();
    L_0x004f:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.g.a(java.lang.String):org.json.JSONObject");
    }

    /* renamed from: b */
    public static String m3169b(String str) {
        return String.format(str, new Object[]{C3010d.m11689c().m11751f()});
    }
}
