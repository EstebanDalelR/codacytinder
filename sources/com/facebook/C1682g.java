package com.facebook;

import android.content.SharedPreferences;
import com.facebook.internal.C1749x;

/* renamed from: com.facebook.g */
final class C1682g {
    /* renamed from: a */
    private final SharedPreferences f4613a = FacebookSdk.m3994e().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);

    C1682g() {
    }

    /* renamed from: a */
    com.facebook.Profile m5697a() {
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
        r0 = r3.f4613a;
        r1 = "com.facebook.ProfileManager.CachedProfile";
        r2 = 0;
        r0 = r0.getString(r1, r2);
        if (r0 == 0) goto L_0x0016;
    L_0x000b:
        r1 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0016 }
        r1.<init>(r0);	 Catch:{ JSONException -> 0x0016 }
        r0 = new com.facebook.Profile;	 Catch:{ JSONException -> 0x0016 }
        r0.<init>(r1);	 Catch:{ JSONException -> 0x0016 }
        return r0;
    L_0x0016:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.g.a():com.facebook.Profile");
    }

    /* renamed from: a */
    void m5698a(Profile profile) {
        C1749x.m6064a((Object) profile, "profile");
        profile = profile.toJSONObject();
        if (profile != null) {
            this.f4613a.edit().putString("com.facebook.ProfileManager.CachedProfile", profile.toString()).apply();
        }
    }

    /* renamed from: b */
    void m5699b() {
        this.f4613a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }
}
