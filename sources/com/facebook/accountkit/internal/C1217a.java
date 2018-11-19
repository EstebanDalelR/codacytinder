package com.facebook.accountkit.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.VisibleForTesting;
import com.facebook.accountkit.AccessToken;
import com.facebook.accountkit.AccountKitError.Type;
import com.facebook.accountkit.AccountKitException;
import com.tinder.api.ManagerWebServices;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.accountkit.internal.a */
final class C1217a {
    /* renamed from: a */
    private final SharedPreferences f3256a;

    @VisibleForTesting
    C1217a(SharedPreferences sharedPreferences) {
        this.f3256a = sharedPreferences;
    }

    C1217a(Context context) {
        this(context.getSharedPreferences("com.facebook.accountkit.AccessTokenManager.SharedPreferences", 0));
    }

    /* renamed from: a */
    public void m4249a() {
        this.f3256a.edit().remove("com.facebook.accountkit.AccessTokenManager.CachedAccessToken").apply();
    }

    /* renamed from: b */
    public com.facebook.accountkit.AccessToken m4251b() {
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
        r0 = r3.f3256a;
        r1 = "com.facebook.accountkit.AccessTokenManager.CachedAccessToken";
        r2 = 0;
        r0 = r0.getString(r1, r2);
        if (r0 == 0) goto L_0x0016;
    L_0x000b:
        r1 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0015 }
        r1.<init>(r0);	 Catch:{ JSONException -> 0x0015 }
        r0 = com.facebook.accountkit.internal.C1217a.m4247a(r1);	 Catch:{ JSONException -> 0x0015 }
        return r0;
    L_0x0015:
        return r2;
    L_0x0016:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.a.b():com.facebook.accountkit.AccessToken");
    }

    /* renamed from: a */
    public void m4250a(@android.support.annotation.NonNull com.facebook.accountkit.AccessToken r3) {
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
        r3 = com.facebook.accountkit.internal.C1217a.m4248b(r3);	 Catch:{ JSONException -> 0x0017 }
        r0 = r2.f3256a;	 Catch:{ JSONException -> 0x0017 }
        r0 = r0.edit();	 Catch:{ JSONException -> 0x0017 }
        r1 = "com.facebook.accountkit.AccessTokenManager.CachedAccessToken";	 Catch:{ JSONException -> 0x0017 }
        r3 = r3.toString();	 Catch:{ JSONException -> 0x0017 }
        r3 = r0.putString(r1, r3);	 Catch:{ JSONException -> 0x0017 }
        r3.apply();	 Catch:{ JSONException -> 0x0017 }
    L_0x0017:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.a.a(com.facebook.accountkit.AccessToken):void");
    }

    @VisibleForTesting
    /* renamed from: a */
    static AccessToken m4247a(JSONObject jSONObject) throws JSONException {
        if (jSONObject.getInt("version") <= 1) {
            return new AccessToken(jSONObject.getString(ManagerWebServices.PARAM_TOKEN), jSONObject.getString("account_id"), jSONObject.getString("application_id"), jSONObject.getLong("tokenRefreshIntervalInSeconds"), new Date(jSONObject.getLong("last_refresh")));
        }
        throw new AccountKitException(Type.INTERNAL_ERROR, InternalAccountKitError.INVALID_ACCESS_TOKEN_FORMAT);
    }

    @VisibleForTesting
    /* renamed from: b */
    static JSONObject m4248b(AccessToken accessToken) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("account_id", accessToken.getAccountId());
        jSONObject.put("application_id", accessToken.getApplicationId());
        jSONObject.put("tokenRefreshIntervalInSeconds", accessToken.getTokenRefreshIntervalSeconds());
        jSONObject.put("last_refresh", accessToken.getLastRefresh().getTime());
        jSONObject.put(ManagerWebServices.PARAM_TOKEN, accessToken.getToken());
        return jSONObject;
    }
}
