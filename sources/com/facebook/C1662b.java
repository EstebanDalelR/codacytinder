package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.C0436c;
import android.util.Log;
import com.facebook.AccessToken.AccessTokenRefreshCallback;
import com.facebook.GraphRequest.Callback;
import com.facebook.internal.C1749x;
import com.facebook.internal.Utility;
import com.tinder.api.ManagerWebServices;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.facebook.b */
public final class C1662b {
    /* renamed from: a */
    private static volatile C1662b f4581a;
    /* renamed from: b */
    private final C0436c f4582b;
    /* renamed from: c */
    private final C1180a f4583c;
    /* renamed from: d */
    private AccessToken f4584d;
    /* renamed from: e */
    private AtomicBoolean f4585e = new AtomicBoolean(false);
    /* renamed from: f */
    private Date f4586f = new Date(0);

    /* renamed from: com.facebook.b$a */
    private static class C1661a {
        /* renamed from: a */
        public String f4579a;
        /* renamed from: b */
        public int f4580b;

        private C1661a() {
        }
    }

    C1662b(C0436c c0436c, C1180a c1180a) {
        C1749x.m6064a((Object) c0436c, "localBroadcastManager");
        C1749x.m6064a((Object) c1180a, "accessTokenCache");
        this.f4582b = c0436c;
        this.f4583c = c1180a;
    }

    /* renamed from: a */
    static C1662b m5631a() {
        if (f4581a == null) {
            synchronized (C1662b.class) {
                if (f4581a == null) {
                    f4581a = new C1662b(C0436c.m1648a(FacebookSdk.m3994e()), new C1180a());
                }
            }
        }
        return f4581a;
    }

    /* renamed from: b */
    AccessToken m5642b() {
        return this.f4584d;
    }

    /* renamed from: c */
    boolean m5643c() {
        AccessToken a = this.f4583c.m4102a();
        if (a == null) {
            return false;
        }
        m5634a(a, false);
        return true;
    }

    /* renamed from: a */
    void m5641a(AccessToken accessToken) {
        m5634a(accessToken, true);
    }

    /* renamed from: a */
    private void m5634a(AccessToken accessToken, boolean z) {
        AccessToken accessToken2 = this.f4584d;
        this.f4584d = accessToken;
        this.f4585e.set(false);
        this.f4586f = new Date(0);
        if (z) {
            if (accessToken != null) {
                this.f4583c.m4103a(accessToken);
            } else {
                this.f4583c.m4104b();
                Utility.m5792b(FacebookSdk.m3994e());
            }
        }
        if (!Utility.m5784a((Object) accessToken2, (Object) accessToken)) {
            m5633a(accessToken2, accessToken);
            m5638f();
        }
    }

    /* renamed from: d */
    void m5644d() {
        m5633a(this.f4584d, this.f4584d);
    }

    /* renamed from: a */
    private void m5633a(AccessToken accessToken, AccessToken accessToken2) {
        Intent intent = new Intent(FacebookSdk.m3994e(), CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken2);
        this.f4582b.m1653a(intent);
    }

    /* renamed from: f */
    private void m5638f() {
        Context e = FacebookSdk.m3994e();
        AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
        AlarmManager alarmManager = (AlarmManager) e.getSystemService("alarm");
        if (AccessToken.isCurrentAccessTokenActive() && currentAccessToken.getExpires() != null) {
            if (alarmManager != null) {
                Intent intent = new Intent(e, CurrentAccessTokenExpirationBroadcastReceiver.class);
                intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
                alarmManager.set(1, currentAccessToken.getExpires().getTime(), PendingIntent.getBroadcast(e, 0, intent, 0));
            }
        }
    }

    /* renamed from: e */
    void m5645e() {
        if (m5639g()) {
            m5640a(null);
        }
    }

    /* renamed from: g */
    private boolean m5639g() {
        boolean z = false;
        if (this.f4584d == null) {
            return false;
        }
        Long valueOf = Long.valueOf(new Date().getTime());
        if (this.f4584d.getSource().canExtendToken() && valueOf.longValue() - this.f4586f.getTime() > 3600000 && valueOf.longValue() - this.f4584d.getLastRefresh().getTime() > 86400000) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    private static GraphRequest m5630a(AccessToken accessToken, Callback callback) {
        return new GraphRequest(accessToken, "me/permissions", new Bundle(), HttpMethod.GET, callback);
    }

    /* renamed from: b */
    private static GraphRequest m5636b(AccessToken accessToken, Callback callback) {
        Bundle bundle = new Bundle();
        bundle.putString("grant_type", "fb_extend_sso_token");
        return new GraphRequest(accessToken, "oauth/access_token", bundle, HttpMethod.GET, callback);
    }

    /* renamed from: a */
    void m5640a(final AccessTokenRefreshCallback accessTokenRefreshCallback) {
        if (Looper.getMainLooper().equals(Looper.myLooper())) {
            m5637b(accessTokenRefreshCallback);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ C1662b f4578b;

                public void run() {
                    this.f4578b.m5637b(accessTokenRefreshCallback);
                }
            });
        }
    }

    /* renamed from: b */
    private void m5637b(AccessTokenRefreshCallback accessTokenRefreshCallback) {
        final AccessToken accessToken = this.f4584d;
        if (accessToken == null) {
            if (accessTokenRefreshCallback != null) {
                accessTokenRefreshCallback.OnTokenRefreshFailed(new FacebookException("No current access token to refresh"));
            }
        } else if (this.f4585e.compareAndSet(false, true)) {
            this.f4586f = new Date();
            final Set hashSet = new HashSet();
            final Set hashSet2 = new HashSet();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final C1661a c1661a = new C1661a();
            GraphRequestBatch graphRequestBatch = new GraphRequestBatch(C1662b.m5630a(accessToken, new Callback(this) {
                /* renamed from: d */
                final /* synthetic */ C1662b f10359d;

                public void onCompleted(GraphResponse graphResponse) {
                    graphResponse = graphResponse.m4093b();
                    if (graphResponse != null) {
                        graphResponse = graphResponse.optJSONArray(ManagerWebServices.FB_DATA);
                        if (graphResponse != null) {
                            atomicBoolean.set(true);
                            for (int i = 0; i < graphResponse.length(); i++) {
                                JSONObject optJSONObject = graphResponse.optJSONObject(i);
                                if (optJSONObject != null) {
                                    String optString = optJSONObject.optString("permission");
                                    String optString2 = optJSONObject.optString("status");
                                    if (!(Utility.m5785a(optString) || Utility.m5785a(optString2))) {
                                        optString2 = optString2.toLowerCase(Locale.US);
                                        if (optString2.equals("granted")) {
                                            hashSet.add(optString);
                                        } else if (optString2.equals("declined")) {
                                            hashSet2.add(optString);
                                        } else {
                                            StringBuilder stringBuilder = new StringBuilder();
                                            stringBuilder.append("Unexpected status: ");
                                            stringBuilder.append(optString2);
                                            Log.w("AccessTokenManager", stringBuilder.toString());
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }), C1662b.m5636b(accessToken, new Callback(this) {
                /* renamed from: b */
                final /* synthetic */ C1662b f10361b;

                public void onCompleted(GraphResponse graphResponse) {
                    graphResponse = graphResponse.m4093b();
                    if (graphResponse != null) {
                        c1661a.f4579a = graphResponse.optString("access_token");
                        c1661a.f4580b = graphResponse.optInt(ManagerWebServices.PARAM_EXPIRES_AT);
                    }
                }
            }));
            final AccessTokenRefreshCallback accessTokenRefreshCallback2 = accessTokenRefreshCallback;
            graphRequestBatch.m4073a(new GraphRequestBatch.Callback(this) {
                /* renamed from: g */
                final /* synthetic */ C1662b f10368g;

                public void onBatchCompleted(GraphRequestBatch graphRequestBatch) {
                    Throwable th;
                    AccessToken accessToken = null;
                    try {
                        if (C1662b.m5631a().m5642b() != null) {
                            if (C1662b.m5631a().m5642b().getUserId() == accessToken.getUserId()) {
                                if (!atomicBoolean.get() && c1661a.f4579a == null && c1661a.f4580b == 0) {
                                    if (accessTokenRefreshCallback2 != null) {
                                        accessTokenRefreshCallback2.OnTokenRefreshFailed(new FacebookException("Failed to refresh access token"));
                                    }
                                    this.f10368g.f4585e.set(false);
                                    graphRequestBatch = accessTokenRefreshCallback2;
                                    return;
                                }
                                String str;
                                Set set;
                                Date date;
                                if (c1661a.f4579a != null) {
                                    str = c1661a.f4579a;
                                } else {
                                    str = accessToken.getToken();
                                }
                                String str2 = str;
                                String applicationId = accessToken.getApplicationId();
                                String userId = accessToken.getUserId();
                                if (atomicBoolean.get()) {
                                    set = hashSet;
                                } else {
                                    set = accessToken.getPermissions();
                                }
                                Set set2 = set;
                                if (atomicBoolean.get()) {
                                    set = hashSet2;
                                } else {
                                    set = accessToken.getDeclinedPermissions();
                                }
                                Set set3 = set;
                                AccessTokenSource source = accessToken.getSource();
                                if (c1661a.f4580b != 0) {
                                    date = new Date(((long) c1661a.f4580b) * 1000);
                                } else {
                                    date = accessToken.getExpires();
                                }
                                AccessToken accessToken2 = new AccessToken(str2, applicationId, userId, set2, set3, source, date, new Date());
                                try {
                                    C1662b.m5631a().m5641a(accessToken2);
                                    this.f10368g.f4585e.set(false);
                                    if (!(accessTokenRefreshCallback2 == null || accessToken2 == null)) {
                                        accessTokenRefreshCallback2.OnTokenRefreshed(accessToken2);
                                    }
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    accessToken = accessToken2;
                                    this.f10368g.f4585e.set(false);
                                    if (!(accessTokenRefreshCallback2 == null || accessToken == null)) {
                                        accessTokenRefreshCallback2.OnTokenRefreshed(accessToken);
                                    }
                                    throw th;
                                }
                            }
                        }
                        if (accessTokenRefreshCallback2 != null) {
                            accessTokenRefreshCallback2.OnTokenRefreshFailed(new FacebookException("No current access token to refresh"));
                        }
                        this.f10368g.f4585e.set(false);
                        graphRequestBatch = accessTokenRefreshCallback2;
                    } catch (Throwable th3) {
                        th = th3;
                        this.f10368g.f4585e.set(false);
                        accessTokenRefreshCallback2.OnTokenRefreshed(accessToken);
                        throw th;
                    }
                }
            });
            graphRequestBatch.m4083h();
        } else {
            if (accessTokenRefreshCallback != null) {
                accessTokenRefreshCallback.OnTokenRefreshFailed(new FacebookException("Refresh already in progress"));
            }
        }
    }
}
