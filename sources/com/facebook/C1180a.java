package com.facebook;

import android.content.SharedPreferences;
import android.os.Bundle;

/* renamed from: com.facebook.a */
class C1180a {
    /* renamed from: a */
    private final SharedPreferences f3144a;
    /* renamed from: b */
    private final C1179a f3145b;
    /* renamed from: c */
    private C1681f f3146c;

    /* renamed from: com.facebook.a$a */
    static class C1179a {
        C1179a() {
        }

        /* renamed from: a */
        public C1681f m4096a() {
            return new C1681f(FacebookSdk.m3994e());
        }
    }

    C1180a(SharedPreferences sharedPreferences, C1179a c1179a) {
        this.f3144a = sharedPreferences;
        this.f3145b = c1179a;
    }

    public C1180a() {
        this(FacebookSdk.m3994e().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0), new C1179a());
    }

    /* renamed from: a */
    public AccessToken m4102a() {
        if (m4097c()) {
            return m4098d();
        }
        if (!m4099e()) {
            return null;
        }
        AccessToken f = m4100f();
        if (f == null) {
            return f;
        }
        m4103a(f);
        m4101g().m5696b();
        return f;
    }

    /* renamed from: a */
    public void m4103a(com.facebook.AccessToken r3) {
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
        r0 = "accessToken";
        com.facebook.internal.C1749x.m6064a(r3, r0);
        r3 = r3.toJSONObject();	 Catch:{ JSONException -> 0x001c }
        r0 = r2.f3144a;	 Catch:{ JSONException -> 0x001c }
        r0 = r0.edit();	 Catch:{ JSONException -> 0x001c }
        r1 = "com.facebook.AccessTokenManager.CachedAccessToken";	 Catch:{ JSONException -> 0x001c }
        r3 = r3.toString();	 Catch:{ JSONException -> 0x001c }
        r3 = r0.putString(r1, r3);	 Catch:{ JSONException -> 0x001c }
        r3.apply();	 Catch:{ JSONException -> 0x001c }
    L_0x001c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.a.a(com.facebook.AccessToken):void");
    }

    /* renamed from: b */
    public void m4104b() {
        this.f3144a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (m4099e()) {
            m4101g().m5696b();
        }
    }

    /* renamed from: c */
    private boolean m4097c() {
        return this.f3144a.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    /* renamed from: d */
    private com.facebook.AccessToken m4098d() {
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
        r3 = this;
        r0 = r3.f3144a;
        r1 = "com.facebook.AccessTokenManager.CachedAccessToken";
        r2 = 0;
        r0 = r0.getString(r1, r2);
        if (r0 == 0) goto L_0x0016;
    L_0x000b:
        r1 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0015 }
        r1.<init>(r0);	 Catch:{ JSONException -> 0x0015 }
        r0 = com.facebook.AccessToken.createFromJSONObject(r1);	 Catch:{ JSONException -> 0x0015 }
        return r0;
    L_0x0015:
        return r2;
    L_0x0016:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.a.d():com.facebook.AccessToken");
    }

    /* renamed from: e */
    private boolean m4099e() {
        return FacebookSdk.m3988b();
    }

    /* renamed from: f */
    private AccessToken m4100f() {
        Bundle a = m4101g().m5695a();
        return (a == null || !C1681f.m5691a(a)) ? null : AccessToken.createFromLegacyCache(a);
    }

    /* renamed from: g */
    private C1681f m4101g() {
        if (this.f3146c == null) {
            synchronized (this) {
                if (this.f3146c == null) {
                    this.f3146c = this.f3145b.m4096a();
                }
            }
        }
        return this.f3146c;
    }
}
