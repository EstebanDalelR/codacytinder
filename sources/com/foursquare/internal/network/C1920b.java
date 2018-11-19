package com.foursquare.internal.network;

import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.foursquare.internal.util.FsLog;
import java.security.KeyStore;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.C15894f;
import okhttp3.C15896g;
import okhttp3.C15896g.C15895a;
import okhttp3.C17692o;
import okhttp3.C17692o.C15961a;
import okhttp3.HttpUrl;
import okhttp3.TlsVersion;

/* renamed from: com.foursquare.internal.network.b */
public class C1920b {
    @Nullable
    /* renamed from: a */
    private static C1920b f5152a;
    /* renamed from: n */
    private static final long f5153n = TimeUnit.SECONDS.toMillis(10);
    @NonNull
    /* renamed from: b */
    private final String f5154b;
    @NonNull
    /* renamed from: c */
    private final String f5155c = C1920b.m6691e();
    /* renamed from: d */
    private final String f5156d;
    /* renamed from: e */
    private final int f5157e;
    @NonNull
    /* renamed from: f */
    private final HttpUrl f5158f;
    @NonNull
    /* renamed from: g */
    private final String f5159g;
    @Nullable
    /* renamed from: h */
    private final String f5160h;
    /* renamed from: i */
    private final boolean f5161i;
    @NonNull
    /* renamed from: j */
    private C17692o f5162j = C1920b.m6692f();
    @Nullable
    /* renamed from: k */
    private String f5163k = null;
    @NonNull
    /* renamed from: l */
    private String f5164l;
    @NonNull
    /* renamed from: m */
    private String f5165m;

    /* renamed from: a */
    public static C1920b m6688a() {
        if (f5152a != null) {
            return f5152a;
        }
        throw new IllegalStateException("HttpFactory has not been initialized");
    }

    /* renamed from: a */
    public static void m6689a(@NonNull String str, @NonNull String str2, int i, @NonNull String str3, @NonNull String str4, @NonNull HttpUrl httpUrl, @NonNull String str5, @Nullable String str6, boolean z) {
        if (f5152a != null) {
            throw new IllegalStateException("HttpFactory initialized twice");
        }
        f5152a = new C1920b(str, str2, i, str3, str4, httpUrl, str5, str6, z);
    }

    private C1920b(@NonNull String str, @NonNull String str2, int i, @NonNull String str3, @NonNull String str4, @NonNull HttpUrl httpUrl, @NonNull String str5, @Nullable String str6, boolean z) {
        this.f5154b = str;
        this.f5156d = str2;
        this.f5157e = i;
        this.f5164l = str3;
        this.f5165m = str4;
        this.f5158f = httpUrl;
        this.f5159g = str5;
        this.f5160h = str6;
        this.f5161i = z;
    }

    @NonNull
    /* renamed from: b */
    public C1921c m6697b() {
        C1921c c1921c = new C1921c(this.f5162j, this.f5158f, this.f5159g, this.f5154b, this.f5156d, this.f5157e, this.f5160h);
        c1921c.m6715b(this.f5155c);
        c1921c.m6711a(this.f5161i);
        String str = this.f5163k;
        if (str != null) {
            c1921c.m6709a(str);
        }
        return c1921c;
    }

    /* renamed from: a */
    public void m6694a(@Nullable String str) {
        this.f5163k = str;
    }

    /* renamed from: a */
    public void m6696a(@NonNull C17692o c17692o) {
        this.f5162j = c17692o;
    }

    /* renamed from: a */
    public void m6695a(@NonNull String str, @NonNull String str2) {
        this.f5164l = str;
        this.f5165m = str2;
    }

    @NonNull
    /* renamed from: c */
    public String m6698c() {
        return this.f5164l;
    }

    @NonNull
    /* renamed from: d */
    public String m6699d() {
        return this.f5165m;
    }

    @NonNull
    /* renamed from: e */
    private static String m6691e() {
        Locale locale = Locale.getDefault();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(locale.getLanguage());
        stringBuilder.append("-");
        stringBuilder.append(locale.getCountry());
        String stringBuilder2 = stringBuilder.toString();
        return "ca-ES".equals(stringBuilder2) ? "es-ES" : stringBuilder2;
    }

    @NonNull
    /* renamed from: f */
    private static C17692o m6692f() {
        C15961a a = new C15961a().a(20, TimeUnit.SECONDS).b(20, TimeUnit.SECONDS).c(1, TimeUnit.MINUTES).a(new C15894f(5, f5153n, TimeUnit.MILLISECONDS));
        C1920b.m6690a(a);
        return a.b();
    }

    /* renamed from: a */
    public static void m6690a(C15961a c15961a) {
        if (VERSION.SDK_INT <= 21) {
            if (VERSION.SDK_INT >= 16) {
                try {
                    SSLContext instance = SSLContext.getInstance("TLSv1.2");
                    instance.init(null, null, null);
                    c15961a.a(new C1933h(instance.getSocketFactory()), C1920b.m6693g());
                    c15961a.b(Collections.singletonList(new C15895a(C15896g.f49202a).a(new TlsVersion[]{TlsVersion.TLS_1_2}).a()));
                } catch (C15961a c15961a2) {
                    FsLog.m6801a("PilgrimSdk", "Error while setting TLS 1.2", c15961a2);
                }
            }
        }
    }

    /* renamed from: g */
    private static X509TrustManager m6693g() {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init((KeyStore) null);
            return (X509TrustManager) instance.getTrustManagers()[0];
        } catch (Throwable e) {
            FsLog.m6801a("PilgrimSdk", "Error while setting TLS 1.2", e);
            return null;
        }
    }
}
