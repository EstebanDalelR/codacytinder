package com.snapchat.kit.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import com.google.gson.Gson;
import com.snapchat.kit.sdk.core.controller.C7136a;
import com.snapchat.kit.sdk.core.controller.C7886b;
import com.snapchat.kit.sdk.core.controller.LoginStateController;
import com.snapchat.kit.sdk.core.metrics.C7140a;
import com.snapchat.kit.sdk.core.metrics.C7893d;
import com.snapchat.kit.sdk.core.metrics.C7894e;
import com.snapchat.kit.sdk.core.metrics.C7895f;
import com.snapchat.kit.sdk.core.metrics.C7896g;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.MetricsClient;
import com.snapchat.kit.sdk.core.metrics.business.C5940e;
import com.snapchat.kit.sdk.core.metrics.business.C5941h;
import com.snapchat.kit.sdk.core.metrics.business.C7143a;
import com.snapchat.kit.sdk.core.metrics.business.C7144c;
import com.snapchat.kit.sdk.core.metrics.business.C7889b;
import com.snapchat.kit.sdk.core.metrics.business.C7890d;
import com.snapchat.kit.sdk.core.metrics.business.C7891f;
import com.snapchat.kit.sdk.core.metrics.business.C7892g;
import com.snapchat.kit.sdk.core.metrics.business.KitEventBaseFactory;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.metrics.p148a.C7139a;
import com.snapchat.kit.sdk.core.metrics.p148a.C7887b;
import com.snapchat.kit.sdk.core.metrics.p149b.C5938a;
import com.snapchat.kit.sdk.core.metrics.p149b.C7888b;
import com.snapchat.kit.sdk.core.networking.AuthTokenManager;
import com.snapchat.kit.sdk.core.networking.C7154e;
import com.snapchat.kit.sdk.core.networking.C7921a;
import com.snapchat.kit.sdk.core.networking.C7922c;
import com.snapchat.kit.sdk.core.networking.C7923d;
import com.snapchat.kit.sdk.core.networking.C7924f;
import com.snapchat.kit.sdk.core.networking.ClientFactory;
import com.snapchat.kit.sdk.core.networking.LoginClient;
import com.snapchat.kit.sdk.core.security.C7158g;
import com.snapchat.kit.sdk.core.security.C7925b;
import com.snapchat.kit.sdk.core.security.Fingerprint;
import com.squareup.okhttp.C5997b;
import com.squareup.okhttp.C6068p;
import dagger.internal.C15521i;
import dagger.internal.C17281c;
import dagger.internal.C18316b;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.b */
public final class C7112b implements SnapKitComponent {
    /* renamed from: a */
    private Provider<Context> f25719a;
    /* renamed from: b */
    private Provider<Gson> f25720b;
    /* renamed from: c */
    private Provider<SharedPreferences> f25721c;
    /* renamed from: d */
    private Provider<C7158g> f25722d;
    /* renamed from: e */
    private Provider<Handler> f25723e;
    /* renamed from: f */
    private Provider<C7136a> f25724f;
    /* renamed from: g */
    private Provider<C6068p> f25725g;
    /* renamed from: h */
    private Provider<C5941h> f25726h;
    /* renamed from: i */
    private Provider<C5997b> f25727i;
    /* renamed from: j */
    private Provider<String> f25728j;
    /* renamed from: k */
    private Provider<C7154e> f25729k;
    /* renamed from: l */
    private Provider<Fingerprint> f25730l;
    /* renamed from: m */
    private Provider<C7922c> f25731m;
    /* renamed from: n */
    private Provider<ClientFactory> f25732n;
    /* renamed from: o */
    private Provider<MetricsClient> f25733o;
    /* renamed from: p */
    private Provider<C5938a> f25734p;
    /* renamed from: q */
    private Provider<C7143a> f25735q;
    /* renamed from: r */
    private Provider<C7140a<ServerEvent>> f25736r;
    /* renamed from: s */
    private Provider<C7144c> f25737s;
    /* renamed from: t */
    private Provider<KitEventBaseFactory> f25738t;
    /* renamed from: u */
    private Provider<C5940e> f25739u;
    /* renamed from: v */
    private Provider<C7139a> f25740v;
    /* renamed from: w */
    private Provider<MetricQueue<OpMetric>> f25741w;
    /* renamed from: x */
    private Provider<OAuth2Manager> f25742x;
    /* renamed from: y */
    private C5951d f25743y;
    /* renamed from: z */
    private Provider<LoginClient> f25744z;

    /* renamed from: com.snapchat.kit.sdk.b$a */
    public static final class C5879a {
        /* renamed from: a */
        private C5951d f21569a;

        private C5879a() {
        }

        /* renamed from: a */
        public SnapKitComponent m25396a() {
            if (this.f21569a != null) {
                return new C7112b();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(C5951d.class.getCanonicalName());
            stringBuilder.append(" must be set");
            throw new IllegalStateException(stringBuilder.toString());
        }

        /* renamed from: a */
        public C5879a m25397a(C5951d c5951d) {
            this.f21569a = (C5951d) C15521i.a(c5951d);
            return this;
        }
    }

    private C7112b(C5879a c5879a) {
        m30692a(c5879a);
    }

    /* renamed from: a */
    public static C5879a m30691a() {
        return new C5879a();
    }

    /* renamed from: a */
    private void m30692a(C5879a c5879a) {
        this.f25719a = C17281c.a(C7928g.m33773a(c5879a.f21569a));
        this.f25720b = C17281c.a(C7929h.m33775a(c5879a.f21569a));
        this.f25721c = C17281c.a(C7937m.m33791a(c5879a.f21569a));
        this.f25722d = C17281c.a(C7933l.m33783a(c5879a.f21569a, this.f25720b, this.f25721c));
        this.f25723e = C7938n.m33793a(c5879a.f21569a);
        this.f25724f = C17281c.a(C7886b.m33737a(this.f25723e));
        this.f25725g = C17281c.a(C7932k.m33781a(c5879a.f21569a));
        this.f25726h = C7896g.m33758a(this.f25721c);
        this.f25727i = C17281c.a(C7926e.m33769a(c5879a.f21569a));
        this.f25742x = new C18316b();
        this.f25728j = C7927f.m33771a(c5879a.f21569a);
        this.f25729k = C17281c.a(C7924f.m33765a(this.f25742x, this.f25724f, this.f25728j));
        this.f25730l = C7925b.m33767a(this.f25719a);
        this.f25731m = C7923d.m33763a(this.f25742x, this.f25724f, this.f25728j, this.f25730l);
        this.f25732n = C17281c.a(C7921a.m33760a(this.f25727i, this.f25720b, this.f25729k, this.f25731m));
        this.f25733o = C17281c.a(C7894e.m33754a(this.f25732n));
        this.f25734p = C7888b.m33741a(this.f25720b);
        this.f25735q = C17281c.a(C7889b.m33743a(this.f25721c, this.f25726h, this.f25733o, this.f25734p));
        this.f25736r = C7893d.m33752a(this.f25735q, this.f25723e);
        this.f25737s = C17281c.a(C7890d.m33745a(this.f25726h, this.f25736r));
        this.f25738t = C7892g.m33750a(this.f25728j);
        this.f25739u = C7891f.m33747a(this.f25738t);
        this.f25740v = C17281c.a(C7887b.m33739a(this.f25721c, this.f25733o, this.f25734p));
        this.f25741w = C17281c.a(C7895f.m33756a(this.f25740v, this.f25723e));
        C18316b c18316b = (C18316b) this.f25742x;
        this.f25742x = C17281c.a(C7931j.m33779a(c5879a.f21569a, this.f25722d, this.f25724f, this.f25725g, this.f25720b, this.f25737s, this.f25739u, this.f25741w));
        c18316b.a(this.f25742x);
        this.f25743y = c5879a.f21569a;
        this.f25744z = C17281c.a(C7930i.m33777a(c5879a.f21569a, this.f25732n));
    }

    public Context context() {
        return (Context) this.f25719a.get();
    }

    public Gson gson() {
        return (Gson) this.f25720b.get();
    }

    public AuthTokenManager authTokenManager() {
        return (AuthTokenManager) C15521i.a(this.f25743y.m25559a((OAuth2Manager) this.f25742x.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public MetricQueue<ServerEvent> analyticsEventQueue() {
        return (MetricQueue) this.f25737s.get();
    }

    public MetricQueue<OpMetric> operationalMetricsQueue() {
        return (MetricQueue) this.f25741w.get();
    }

    public ClientFactory apiFactory() {
        return (ClientFactory) this.f25732n.get();
    }

    public SharedPreferences sharedPreferences() {
        return (SharedPreferences) this.f25721c.get();
    }

    public LoginStateController logoutController() {
        return (LoginStateController) C15521i.a(this.f25743y.m25558a((C7136a) this.f25724f.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public LoginClient loginClient() {
        return (LoginClient) this.f25744z.get();
    }

    public KitEventBaseFactory kitEventBaseFactory() {
        return C7892g.m33749a(clientId());
    }

    public String clientId() {
        return (String) C15521i.a(this.f25743y.m25562b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public String redirectUrl() {
        return (String) C15521i.a(this.f25743y.m25563c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public void inject(SnapKitActivity snapKitActivity) {
        m30690a(snapKitActivity);
    }

    /* renamed from: a */
    private SnapKitActivity m30690a(SnapKitActivity snapKitActivity) {
        C7135c.m30780a(snapKitActivity, (OAuth2Manager) this.f25742x.get());
        return snapKitActivity;
    }
}
