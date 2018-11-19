package com.snapchat.kit.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.gson.Gson;
import com.snapchat.kit.sdk.core.controller.C7136a;
import com.snapchat.kit.sdk.core.controller.LoginStateController;
import com.snapchat.kit.sdk.core.dagger.scope.SnapConnectScope;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.business.C5940e;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.networking.AuthTokenManager;
import com.snapchat.kit.sdk.core.networking.ClientFactory;
import com.snapchat.kit.sdk.core.networking.LoginClient;
import com.snapchat.kit.sdk.core.security.C7158g;
import com.squareup.okhttp.C5997b;
import com.squareup.okhttp.C6068p;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import java.util.List;
import javax.inject.Named;

@Module
/* renamed from: com.snapchat.kit.sdk.d */
class C5951d {
    /* renamed from: a */
    private final Context f21779a;
    /* renamed from: b */
    private final String f21780b;
    /* renamed from: c */
    private final String f21781c;
    /* renamed from: d */
    private final List<String> f21782d;

    @Provides
    /* renamed from: a */
    LoginStateController m25558a(C7136a c7136a) {
        return c7136a;
    }

    @Provides
    /* renamed from: a */
    AuthTokenManager m25559a(OAuth2Manager oAuth2Manager) {
        return oAuth2Manager;
    }

    C5951d(Context context, @NonNull String str, @NonNull String str2, @NonNull List<String> list) {
        this.f21779a = context;
        this.f21780b = str;
        this.f21781c = str2;
        this.f21782d = list;
    }

    @SnapConnectScope
    @Provides
    /* renamed from: a */
    Context m25556a() {
        return this.f21779a;
    }

    @Provides
    @Named("client_id")
    /* renamed from: b */
    String m25562b() {
        return this.f21780b;
    }

    @Provides
    @Named("redirect_url")
    /* renamed from: c */
    String m25563c() {
        return this.f21781c;
    }

    @SnapConnectScope
    @Provides
    /* renamed from: d */
    Gson m25564d() {
        return new Gson();
    }

    @SnapConnectScope
    @Provides
    /* renamed from: e */
    SharedPreferences m25565e() {
        return this.f21779a.getSharedPreferences("com.snapchat.connect.sdk.sharedPreferences", 0);
    }

    @SnapConnectScope
    @Provides
    /* renamed from: f */
    C5997b m25566f() {
        return new C5997b(this.f21779a.getCacheDir(), PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
    }

    @com.snapchat.kit.sdk.core.dagger.scope.SnapConnectScope
    @dagger.Provides
    /* renamed from: a */
    com.snapchat.kit.sdk.core.security.C7158g m25561a(com.google.gson.Gson r7, android.content.SharedPreferences r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        r0 = r6.f21779a;
        r1 = "com.snapchat.connect.sdk.secureSharedPreferences";
        r2 = 0;
        r0 = r0.getSharedPreferences(r1, r2);
        r1 = "AndroidKeyStore";	 Catch:{ KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, Exception -> 0x007d }
        r1 = java.security.KeyStore.getInstance(r1);	 Catch:{ KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, Exception -> 0x007d }
        r2 = 0;	 Catch:{ KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, Exception -> 0x007d }
        r1.load(r2);	 Catch:{ KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, Exception -> 0x007d }
        r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, Exception -> 0x007d }
        r4 = 23;	 Catch:{ KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, Exception -> 0x007d }
        if (r3 < r4) goto L_0x0027;	 Catch:{ KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, Exception -> 0x007d }
    L_0x0019:
        r3 = "rsa_public";	 Catch:{ KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, Exception -> 0x007d }
        r3 = r8.contains(r3);	 Catch:{ KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, Exception -> 0x007d }
        if (r3 == 0) goto L_0x0022;	 Catch:{ KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, Exception -> 0x007d }
    L_0x0021:
        goto L_0x0027;	 Catch:{ KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, Exception -> 0x007d }
    L_0x0022:
        r8 = com.snapchat.kit.sdk.core.security.C5950f.m25552a(r1);	 Catch:{ KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, Exception -> 0x007d }
        goto L_0x0062;
    L_0x0027:
        r3 = "rsa_public";	 Catch:{ JsonParseException -> 0x0036 }
        r3 = r8.getString(r3, r2);	 Catch:{ JsonParseException -> 0x0036 }
        r4 = com.snapchat.kit.sdk.core.security.C7157d.C5948a.class;	 Catch:{ JsonParseException -> 0x0036 }
        r3 = r7.fromJson(r3, r4);	 Catch:{ JsonParseException -> 0x0036 }
        r3 = (com.snapchat.kit.sdk.core.security.C7157d.C5948a) r3;	 Catch:{ JsonParseException -> 0x0036 }
        r2 = r3;
    L_0x0036:
        r3 = new com.snapchat.kit.sdk.core.security.d;	 Catch:{ KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, Exception -> 0x007d }
        r4 = r6.f21779a;	 Catch:{ KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, Exception -> 0x007d }
        r3.<init>(r1, r4, r2);	 Catch:{ KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, Exception -> 0x007d }
        r1 = r3.m30813a();	 Catch:{ KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, Exception -> 0x007d }
        r1 = r1.equals(r2);	 Catch:{ KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, Exception -> 0x007d }
        r1 = r1 ^ 1;	 Catch:{ KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, Exception -> 0x007d }
        if (r1 == 0) goto L_0x005e;	 Catch:{ KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, Exception -> 0x007d }
    L_0x0049:
        r2 = r8.edit();	 Catch:{ KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, Exception -> 0x007d }
        r4 = "rsa_public";	 Catch:{ KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, Exception -> 0x007d }
        r5 = r3.m30813a();	 Catch:{ KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, Exception -> 0x007d }
        r5 = r7.toJson(r5);	 Catch:{ KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, Exception -> 0x007d }
        r2 = r2.putString(r4, r5);	 Catch:{ KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, Exception -> 0x007d }
        r2.apply();	 Catch:{ KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, Exception -> 0x007d }
    L_0x005e:
        r8 = com.snapchat.kit.sdk.core.security.C5950f.m25551a(r8, r3, r1);	 Catch:{ KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, Exception -> 0x007d }
    L_0x0062:
        r1 = r8.m25550b();	 Catch:{ KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, Exception -> 0x007d }
        if (r1 == 0) goto L_0x0073;	 Catch:{ KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, Exception -> 0x007d }
    L_0x0068:
        r1 = r0.edit();	 Catch:{ KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, Exception -> 0x007d }
        r1 = r1.clear();	 Catch:{ KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, Exception -> 0x007d }
        r1.apply();	 Catch:{ KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, Exception -> 0x007d }
    L_0x0073:
        r1 = new com.snapchat.kit.sdk.core.security.a;	 Catch:{ KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, Exception -> 0x007d }
        r8 = r8.m25549a();	 Catch:{ KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, Exception -> 0x007d }
        r1.<init>(r8, r7);	 Catch:{ KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, KeyStoreException -> 0x0083, Exception -> 0x007d }
        goto L_0x0088;
    L_0x007d:
        r1 = new com.snapchat.kit.sdk.core.security.c;
        r1.<init>();
        goto L_0x0088;
    L_0x0083:
        r1 = new com.snapchat.kit.sdk.core.security.c;
        r1.<init>();
    L_0x0088:
        r8 = new com.snapchat.kit.sdk.core.security.g;
        r8.<init>(r0, r1, r7);
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.d.a(com.google.gson.Gson, android.content.SharedPreferences):com.snapchat.kit.sdk.core.security.g");
    }

    @SnapConnectScope
    @Provides
    /* renamed from: g */
    C6068p m25567g() {
        return new C6068p();
    }

    @SnapConnectScope
    @Provides
    /* renamed from: a */
    OAuth2Manager m25557a(C7158g c7158g, C7136a c7136a, C6068p c6068p, Gson gson, Lazy<MetricQueue<ServerEvent>> lazy, C5940e c5940e, Lazy<MetricQueue<OpMetric>> lazy2) {
        return new OAuth2Manager(this.f21780b, this.f21781c, this.f21782d, this.f21779a, c7158g, c7136a, c6068p, gson, lazy, c5940e, lazy2);
    }

    @SnapConnectScope
    @Provides
    /* renamed from: a */
    LoginClient m25560a(ClientFactory clientFactory) {
        return (LoginClient) clientFactory.generateClient("https://api.snapkit.com", LoginClient.class);
    }

    @Provides
    /* renamed from: h */
    Handler m25568h() {
        return new Handler(Looper.getMainLooper());
    }
}
