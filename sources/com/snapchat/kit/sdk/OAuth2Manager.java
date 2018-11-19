package com.snapchat.kit.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.snapchat.kit.sdk.core.controller.C7136a;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.business.C5940e;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.models.AuthToken;
import com.snapchat.kit.sdk.core.models.AuthorizationRequest;
import com.snapchat.kit.sdk.core.models.TokenErrorResponse;
import com.snapchat.kit.sdk.core.networking.AuthTokenManager;
import com.snapchat.kit.sdk.core.security.C7158g;
import com.snapchat.kit.sdk.p142a.C5876a;
import com.snapchat.kit.sdk.p142a.C5876a.C5875a;
import com.snapchat.kit.sdk.util.SnapUtils;
import com.squareup.okhttp.C6062l;
import com.squareup.okhttp.C6068p;
import com.squareup.okhttp.C6071q;
import com.squareup.okhttp.C6071q.C6070a;
import com.squareup.okhttp.C6072r;
import com.squareup.okhttp.C6075s;
import com.squareup.okhttp.Callback;
import com.tinder.api.ManagerWebServices;
import dagger.Lazy;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class OAuth2Manager implements AuthTokenManager {
    /* renamed from: a */
    static final Set<String> f25703a = new C58701();
    /* renamed from: b */
    private final String f25704b;
    /* renamed from: c */
    private final String f25705c;
    /* renamed from: d */
    private final List<String> f25706d;
    /* renamed from: e */
    private final Context f25707e;
    /* renamed from: f */
    private final C7158g f25708f;
    /* renamed from: g */
    private final C7136a f25709g;
    /* renamed from: h */
    private final C6068p f25710h;
    /* renamed from: i */
    private final Gson f25711i;
    /* renamed from: j */
    private final Lazy<MetricQueue<ServerEvent>> f25712j;
    /* renamed from: k */
    private final C5940e f25713k;
    /* renamed from: l */
    private final C5876a f25714l;
    /* renamed from: m */
    private AuthorizationRequest f25715m;
    /* renamed from: n */
    private AtomicReference<AuthToken> f25716n;
    /* renamed from: o */
    private final AtomicBoolean f25717o = new AtomicBoolean(false);
    /* renamed from: p */
    private boolean f25718p;

    /* renamed from: com.snapchat.kit.sdk.OAuth2Manager$1 */
    static class C58701 extends HashSet<String> {
        C58701() {
            add("invalid_grant");
            add("invalid_request");
            add("invalid_scope");
            add("unsupported_grant_type");
        }
    }

    public interface OnTokenRefreshCallback {
        void onTokenRefreshFailed(boolean z);

        void onTokenRefreshSucceeded(boolean z);
    }

    /* renamed from: com.snapchat.kit.sdk.OAuth2Manager$2 */
    class C71092 implements Callback {
        /* renamed from: a */
        final /* synthetic */ OAuth2Manager f25699a;

        C71092(OAuth2Manager oAuth2Manager) {
            this.f25699a = oAuth2Manager;
        }

        public void onFailure(C6071q c6071q, IOException iOException) {
            this.f25699a.f25714l.m25390a(C5875a.REVOKE, false);
        }

        public void onResponse(C6075s c6075s) throws IOException {
            this.f25699a.f25714l.m25390a(C5875a.REVOKE, true);
        }
    }

    /* renamed from: com.snapchat.kit.sdk.OAuth2Manager$4 */
    class C71114 implements Callback {
        /* renamed from: a */
        final /* synthetic */ OAuth2Manager f25702a;

        /* renamed from: com.snapchat.kit.sdk.OAuth2Manager$4$1 */
        class C58711 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C71114 f21548a;

            C58711(C71114 c71114) {
                this.f21548a = c71114;
            }

            public void run() {
                ((MetricQueue) this.f21548a.f25702a.f25712j.get()).push(this.f21548a.f25702a.f25713k.m25538a(false));
                this.f21548a.f25702a.f25714l.m25390a(C5875a.GRANT, false);
                this.f21548a.f25702a.f25709g.m30788c();
            }
        }

        /* renamed from: com.snapchat.kit.sdk.OAuth2Manager$4$2 */
        class C58722 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C71114 f21549a;

            C58722(C71114 c71114) {
                this.f21549a = c71114;
            }

            public void run() {
                ((MetricQueue) this.f21549a.f25702a.f25712j.get()).push(this.f21549a.f25702a.f25713k.m25538a(true));
                this.f21549a.f25702a.f25709g.m30787b();
            }
        }

        /* renamed from: com.snapchat.kit.sdk.OAuth2Manager$4$3 */
        class C58733 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C71114 f21550a;

            C58733(C71114 c71114) {
                this.f21550a = c71114;
            }

            public void run() {
                ((MetricQueue) this.f21550a.f25702a.f25712j.get()).push(this.f21550a.f25702a.f25713k.m25538a(false));
                this.f21550a.f25702a.f25714l.m25390a(C5875a.GRANT, false);
                this.f21550a.f25702a.f25709g.m30788c();
            }
        }

        C71114(OAuth2Manager oAuth2Manager) {
            this.f25702a = oAuth2Manager;
        }

        public void onFailure(C6071q c6071q, IOException iOException) {
            this.f25702a.m30666a(new C58711(this));
        }

        public void onResponse(C6075s c6075s) throws IOException {
            if (!(c6075s == null || !c6075s.m26398d() || c6075s.m26402h() == null || c6075s.m26402h().m26413e() == null)) {
                AuthToken authToken = (AuthToken) this.f25702a.f25711i.fromJson(c6075s.m26402h().m26413e(), AuthToken.class);
                if (this.f25702a.m30687b(authToken)) {
                    authToken.setLastUpdated(System.currentTimeMillis());
                    this.f25702a.m30680a(authToken);
                    this.f25702a.m30665a(null);
                    this.f25702a.f25714l.m25390a(C5875a.GRANT, true);
                    this.f25702a.m30666a(new C58722(this));
                    return;
                }
            }
            this.f25702a.m30666a(new C58733(this));
        }
    }

    OAuth2Manager(String str, String str2, List<String> list, Context context, C7158g c7158g, C7136a c7136a, C6068p c6068p, Gson gson, Lazy<MetricQueue<ServerEvent>> lazy, C5940e c5940e, Lazy<MetricQueue<OpMetric>> lazy2) {
        this.f25704b = str;
        this.f25705c = str2;
        this.f25706d = list;
        this.f25707e = context;
        this.f25708f = c7158g;
        this.f25709g = c7136a;
        this.f25710h = c6068p;
        this.f25711i = gson;
        this.f25712j = lazy;
        this.f25713k = c5940e;
        this.f25714l = new C5876a(lazy2);
        this.f25716n = new AtomicReference(null);
    }

    public boolean isUserLoggedIn() {
        return TextUtils.isEmpty(m30676a()) ^ 1;
    }

    public void setAccessToken(@Nullable String str) {
        if (str == null) {
            this.f25716n.set(null);
            m30689c(null);
            return;
        }
        this.f25716n.set(new AuthToken(str));
    }

    @Nullable
    /* renamed from: a */
    public String m30676a() {
        m30686b();
        AuthToken authToken = (AuthToken) this.f25716n.get();
        if (authToken == null) {
            return null;
        }
        return authToken.getAccessToken();
    }

    @Nullable
    /* renamed from: d */
    private String m30672d() {
        m30686b();
        AuthToken authToken = (AuthToken) this.f25716n.get();
        if (authToken == null) {
            return null;
        }
        return authToken.getRefreshToken();
    }

    /* renamed from: a */
    public void m30678a(@NonNull OnTokenRefreshCallback onTokenRefreshCallback) {
        m30683a(true, onTokenRefreshCallback);
    }

    public void revokeToken() {
        m30686b();
        AuthToken authToken = (AuthToken) this.f25716n.get();
        if (authToken != null) {
            C6062l c6062l = new C6062l();
            c6062l.m26266a(ManagerWebServices.PARAM_TOKEN, authToken.getRefreshToken());
            c6062l.m26266a("client_id", this.f25704b);
            C6071q a = m30660a(c6062l.m26267a(), "/accounts/oauth2/revoke");
            if (a != null) {
                this.f25714l.m25389a(C5875a.REVOKE);
                this.f25710h.m26293a(a).m25812a(new C71092(this));
                this.f25716n.set(null);
                m30689c(null);
                this.f25709g.m30786a();
            }
        }
    }

    /* renamed from: a */
    public void m30682a(boolean r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r3.m30686b();
        r0 = r3.f25716n;
        r0 = r0.get();
        r0 = (com.snapchat.kit.sdk.core.models.AuthToken) r0;
        r4 = r3.m30661a(r4, r0);
        if (r4 != 0) goto L_0x0012;
    L_0x0011:
        return;
    L_0x0012:
        r0 = r3.f25717o;
        r1 = 1;
        r2 = 0;
        r0 = r0.compareAndSet(r2, r1);
        if (r0 != 0) goto L_0x001d;
    L_0x001c:
        return;
    L_0x001d:
        r0 = r3.f25714l;
        r1 = com.snapchat.kit.sdk.p142a.C5876a.C5875a.REFRESH;
        r0.m25389a(r1);
        r0 = r3.f25710h;	 Catch:{ Exception -> 0x003a, all -> 0x0033 }
        r4 = r0.m26293a(r4);	 Catch:{ Exception -> 0x003a, all -> 0x0033 }
        r4 = r4.m25810a();	 Catch:{ Exception -> 0x003a, all -> 0x0033 }
        r0 = 0;	 Catch:{ Exception -> 0x003a, all -> 0x0033 }
        r3.m30681a(r4, r0);	 Catch:{ Exception -> 0x003a, all -> 0x0033 }
        goto L_0x003a;
    L_0x0033:
        r4 = move-exception;
        r0 = r3.f25717o;
        r0.set(r2);
        throw r4;
    L_0x003a:
        r4 = r3.f25717o;
        r4.set(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.OAuth2Manager.a(boolean):void");
    }

    /* renamed from: a */
    public void m30683a(boolean z, @NonNull final OnTokenRefreshCallback onTokenRefreshCallback) {
        boolean z2 = true;
        if (!this.f25717o.getAndSet(true)) {
            m30686b();
            AuthToken authToken = (AuthToken) this.f25716n.get();
            C6071q a = m30661a(z, authToken);
            if (a == null) {
                if (authToken == null || m30669b(z, authToken)) {
                    z2 = false;
                }
                m30679a(onTokenRefreshCallback, z2, false, false);
                return;
            }
            this.f25710h.m26293a(a).m25812a(new Callback(this) {
                /* renamed from: b */
                final /* synthetic */ OAuth2Manager f25701b;

                public void onFailure(C6071q c6071q, IOException iOException) {
                    this.f25701b.m30679a(onTokenRefreshCallback, false, false, false);
                }

                public void onResponse(C6075s c6075s) throws IOException {
                    this.f25701b.m30681a(c6075s, onTokenRefreshCallback);
                }
            });
        }
    }

    @Nullable
    /* renamed from: a */
    private C6071q m30661a(boolean z, @Nullable AuthToken authToken) {
        if (!m30687b(authToken) || !m30669b(z, authToken)) {
            return null;
        }
        z = new C6062l();
        z.m26266a("grant_type", "refresh_token");
        z.m26266a("refresh_token", authToken.getRefreshToken());
        z.m26266a("client_id", this.f25704b);
        return m30660a(z.m26267a(), "/accounts/oauth2/token");
    }

    /* renamed from: b */
    private static boolean m30669b(boolean z, @NonNull AuthToken authToken) {
        Object obj = ((double) (System.currentTimeMillis() - authToken.getLastUpdated())) >= Math.min(3600000.0d, ((double) authToken.getExpiresInMillis()) / 2.0d) ? 1 : null;
        authToken = System.currentTimeMillis() >= authToken.getLastUpdated() + authToken.getExpiresInMillis() ? true : null;
        if (!z && obj == null && authToken == null) {
            return false;
        }
        return true;
    }

    @VisibleForTesting
    /* renamed from: a */
    void m30681a(@Nullable C6075s c6075s, @Nullable OnTokenRefreshCallback onTokenRefreshCallback) throws IOException {
        AuthToken a = m30675a(c6075s);
        if (a != null) {
            if (TextUtils.isEmpty(a.getRefreshToken())) {
                a.setRefreshToken(m30672d());
            }
            if (m30687b(a)) {
                a.setLastUpdated(System.currentTimeMillis());
                m30680a(a);
                this.f25714l.m25390a(C5875a.REFRESH, true);
                m30679a(onTokenRefreshCallback, true, true, false);
                return;
            }
        }
        c6075s = m30685b(c6075s);
        if (c6075s == null || TextUtils.isEmpty(c6075s.getError()) || f25703a.contains(c6075s.getError().toLowerCase()) == null) {
            this.f25714l.m25390a(C5875a.REFRESH, false);
            m30679a(onTokenRefreshCallback, false, false, false);
            return;
        }
        setAccessToken(null);
        this.f25714l.m25390a(C5875a.REFRESH, false);
        m30679a(onTokenRefreshCallback, false, false, true);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.VisibleForTesting
    /* renamed from: b */
    synchronized void m30686b() {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.f25716n;	 Catch:{ all -> 0x0018 }
        r0 = r0.get();	 Catch:{ all -> 0x0018 }
        if (r0 != 0) goto L_0x0016;
    L_0x0009:
        r0 = r2.m30688c();	 Catch:{ all -> 0x0018 }
        if (r0 != 0) goto L_0x0011;
    L_0x000f:
        monitor-exit(r2);
        return;
    L_0x0011:
        r1 = r2.f25716n;	 Catch:{ all -> 0x0018 }
        r1.set(r0);	 Catch:{ all -> 0x0018 }
    L_0x0016:
        monitor-exit(r2);
        return;
    L_0x0018:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.OAuth2Manager.b():void");
    }

    @VisibleForTesting
    /* renamed from: a */
    synchronized void m30680a(@NonNull AuthToken authToken) {
        AuthToken c = m30688c();
        if (m30687b(authToken) && (c == null || c.getLastUpdated() <= authToken.getLastUpdated())) {
            m30689c(authToken);
            this.f25716n.set(authToken);
        }
    }

    @VisibleForTesting
    /* renamed from: b */
    boolean m30687b(@Nullable AuthToken authToken) {
        return (authToken == null || TextUtils.isEmpty(authToken.getAccessToken()) || TextUtils.isEmpty(authToken.getRefreshToken()) || !TextUtils.equals(authToken.getTokenType(), "Bearer") || authToken.getExpiresIn() <= 0) ? null : true;
    }

    @VisibleForTesting
    /* renamed from: c */
    AuthToken m30688c() {
        return (AuthToken) this.f25708f.get("auth_token", AuthToken.class);
    }

    @VisibleForTesting
    /* renamed from: c */
    synchronized void m30689c(AuthToken authToken) {
        this.f25708f.put("auth_token", authToken);
    }

    public void startTokenGrant() {
        if (TextUtils.isEmpty(this.f25705c)) {
            throw new IllegalStateException("Redirect URL must be set!");
        }
        if (this.f25706d != null) {
            if (!this.f25706d.isEmpty()) {
                AuthorizationRequest a = C5877a.m25392a(this.f25704b, this.f25705c, this.f25706d);
                m30665a(a);
                PackageManager packageManager = this.f25707e.getPackageManager();
                String str = "com.snapchat.android";
                if (!this.f25718p && SnapUtils.isSnapchatInstalled(packageManager, str) && m30667a(this.f25707e, packageManager, str, a.toUri("snapchat://", "oauth2", this.f25707e.getPackageName()))) {
                    this.f25714l.m25391a("authSnapchat");
                    ((MetricQueue) this.f25712j.get()).push(this.f25713k.m25537a());
                    this.f25718p = true;
                    return;
                }
                Uri toUri = a.toUri("https://accounts.snapchat.com/accounts", "/oauth2/auth", null);
                this.f25714l.m25391a("authWeb");
                m30662a(toUri, this.f25707e);
                ((MetricQueue) this.f25712j.get()).push(this.f25713k.m25537a());
                return;
            }
        }
        throw new IllegalStateException("Valid scopes must be set");
    }

    /* renamed from: a */
    public void m30677a(@Nullable Uri uri) {
        AuthorizationRequest e = m30674e();
        if (!(uri == null || TextUtils.isEmpty(uri.getQueryParameter("code")) || TextUtils.isEmpty(uri.getQueryParameter("state")) || e == null || !TextUtils.equals(uri.getQueryParameter("state"), e.getState()) || TextUtils.isEmpty(e.getRedirectUri()))) {
            if (!TextUtils.isEmpty(e.getCodeVerifier())) {
                this.f25718p = false;
                C6062l c6062l = new C6062l();
                c6062l.m26266a("grant_type", "authorization_code");
                c6062l.m26266a("code", uri.getQueryParameter("code"));
                c6062l.m26266a(QueryParams.REDIRECT_URI, e.getRedirectUri());
                c6062l.m26266a("client_id", this.f25704b);
                c6062l.m26266a("code_verifier", e.getCodeVerifier());
                C6071q a = m30660a(c6062l.m26267a(), "/accounts/oauth2/token");
                if (a == null) {
                    ((MetricQueue) this.f25712j.get()).push(this.f25713k.m25538a(false));
                    this.f25709g.m30788c();
                    return;
                }
                this.f25709g.m30789d();
                this.f25714l.m25389a(C5875a.GRANT);
                this.f25710h.m26293a(a).m25812a(new C71114(this));
                return;
            }
        }
        ((MetricQueue) this.f25712j.get()).push(this.f25713k.m25538a(false));
        this.f25709g.m30788c();
    }

    /* renamed from: a */
    public boolean m30684a(Intent intent) {
        if (intent == null) {
            return false;
        }
        intent = intent.getData();
        if (intent == null) {
            return false;
        }
        return intent.toString().startsWith(this.f25705c);
    }

    @Nullable
    /* renamed from: a */
    private C6071q m30660a(@NonNull C6072r c6072r, @NonNull String str) {
        return new C6070a().m26334a(ManagerWebServices.PARAM_CONTENT_TYPE, "application/x-www-form-urlencoded").m26332a(String.format("%s%s", new Object[]{"https://accounts.snapchat.com", str})).m26331a(c6072r).m26335a();
    }

    @VisibleForTesting
    /* renamed from: a */
    void m30679a(@Nullable OnTokenRefreshCallback onTokenRefreshCallback, boolean z, boolean z2, boolean z3) {
        if (onTokenRefreshCallback != null) {
            final boolean z4 = z;
            final OnTokenRefreshCallback onTokenRefreshCallback2 = onTokenRefreshCallback;
            final boolean z5 = z2;
            final boolean z6 = z3;
            m30666a(new Runnable(this) {
                /* renamed from: e */
                final /* synthetic */ OAuth2Manager f21555e;

                public void run() {
                    if (z4) {
                        onTokenRefreshCallback2.onTokenRefreshSucceeded(z5);
                    } else {
                        onTokenRefreshCallback2.onTokenRefreshFailed(z6);
                    }
                }
            });
        }
    }

    @Nullable
    @VisibleForTesting
    /* renamed from: a */
    AuthToken m30675a(@Nullable C6075s c6075s) throws IOException {
        return (c6075s == null || !c6075s.m26398d() || c6075s.m26402h() == null || c6075s.m26402h().m26413e() == null) ? null : (AuthToken) this.f25711i.fromJson(c6075s.m26402h().m26413e(), AuthToken.class);
    }

    @Nullable
    @VisibleForTesting
    /* renamed from: b */
    TokenErrorResponse m30685b(@Nullable C6075s c6075s) throws IOException {
        return (c6075s == null || c6075s.m26398d() || c6075s.m26397c() != 400) ? null : (TokenErrorResponse) this.f25711i.fromJson(c6075s.m26402h().m26413e(), TokenErrorResponse.class);
    }

    /* renamed from: a */
    private void m30666a(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    /* renamed from: e */
    private AuthorizationRequest m30674e() {
        return this.f25715m;
    }

    /* renamed from: a */
    private void m30665a(@Nullable AuthorizationRequest authorizationRequest) {
        this.f25715m = authorizationRequest;
    }

    /* renamed from: a */
    private void m30662a(android.net.Uri r3, android.content.Context r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = new android.content.Intent;	 Catch:{ Exception -> 0x000f }
        r1 = "android.intent.action.VIEW";	 Catch:{ Exception -> 0x000f }
        r0.<init>(r1, r3);	 Catch:{ Exception -> 0x000f }
        r3 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;	 Catch:{ Exception -> 0x000f }
        r0.setFlags(r3);	 Catch:{ Exception -> 0x000f }
        r4.startActivity(r0);	 Catch:{ Exception -> 0x000f }
    L_0x000f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.OAuth2Manager.a(android.net.Uri, android.content.Context):void");
    }

    /* renamed from: a */
    private boolean m30667a(@NonNull Context context, @NonNull PackageManager packageManager, @NonNull String str, @NonNull Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setPackage(str);
        intent.setFlags(268435456);
        if (intent.resolveActivity(packageManager) == null) {
            return null;
        }
        context.startActivity(intent);
        return true;
    }
}
