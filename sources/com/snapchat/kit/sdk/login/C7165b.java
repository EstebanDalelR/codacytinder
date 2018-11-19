package com.snapchat.kit.sdk.login;

import com.google.gson.Gson;
import com.snapchat.kit.sdk.SnapKitComponent;
import com.snapchat.kit.sdk.core.controller.LoginStateController;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.networking.AuthTokenManager;
import com.snapchat.kit.sdk.core.networking.LoginClient;
import com.snapchat.kit.sdk.login.networking.C5958a;
import com.snapchat.kit.sdk.login.networking.C7936b;
import com.snapchat.kit.sdk.login.p150a.C5954a;
import com.snapchat.kit.sdk.login.p150a.C7934b;
import com.snapchat.kit.sdk.login.p158b.C7164a;
import com.snapchat.kit.sdk.login.p158b.C7935b;
import dagger.internal.C15521i;
import dagger.internal.C17281c;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.login.b */
public final class C7165b implements LoginComponent {
    /* renamed from: a */
    private Provider<AuthTokenManager> f25915a;
    /* renamed from: b */
    private Provider<LoginStateController> f25916b;
    /* renamed from: c */
    private Provider<MetricQueue<OpMetric>> f25917c;
    /* renamed from: d */
    private Provider<C5954a> f25918d;
    /* renamed from: e */
    private Provider<C7164a> f25919e;
    /* renamed from: f */
    private Provider<LoginClient> f25920f;
    /* renamed from: g */
    private Provider<Gson> f25921g;
    /* renamed from: h */
    private Provider<C5958a> f25922h;

    /* renamed from: com.snapchat.kit.sdk.login.b$a */
    public static final class C5957a {
        /* renamed from: a */
        private SnapKitComponent f21785a;

        private C5957a() {
        }

        /* renamed from: a */
        public LoginComponent m25573a() {
            if (this.f21785a != null) {
                return new C7165b();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(SnapKitComponent.class.getCanonicalName());
            stringBuilder.append(" must be set");
            throw new IllegalStateException(stringBuilder.toString());
        }

        /* renamed from: a */
        public C5957a m25574a(SnapKitComponent snapKitComponent) {
            this.f21785a = (SnapKitComponent) C15521i.a(snapKitComponent);
            return this;
        }
    }

    /* renamed from: com.snapchat.kit.sdk.login.b$b */
    private static class C7159b implements Provider<AuthTokenManager> {
        /* renamed from: a */
        private final SnapKitComponent f25904a;

        public /* synthetic */ Object get() {
            return m30814a();
        }

        C7159b(SnapKitComponent snapKitComponent) {
            this.f25904a = snapKitComponent;
        }

        /* renamed from: a */
        public AuthTokenManager m30814a() {
            return (AuthTokenManager) C15521i.a(this.f25904a.authTokenManager(), "Cannot return null from a non-@Nullable component method");
        }
    }

    /* renamed from: com.snapchat.kit.sdk.login.b$c */
    private static class C7160c implements Provider<Gson> {
        /* renamed from: a */
        private final SnapKitComponent f25905a;

        public /* synthetic */ Object get() {
            return m30815a();
        }

        C7160c(SnapKitComponent snapKitComponent) {
            this.f25905a = snapKitComponent;
        }

        /* renamed from: a */
        public Gson m30815a() {
            return (Gson) C15521i.a(this.f25905a.gson(), "Cannot return null from a non-@Nullable component method");
        }
    }

    /* renamed from: com.snapchat.kit.sdk.login.b$d */
    private static class C7161d implements Provider<LoginClient> {
        /* renamed from: a */
        private final SnapKitComponent f25906a;

        public /* synthetic */ Object get() {
            return m30816a();
        }

        C7161d(SnapKitComponent snapKitComponent) {
            this.f25906a = snapKitComponent;
        }

        /* renamed from: a */
        public LoginClient m30816a() {
            return (LoginClient) C15521i.a(this.f25906a.loginClient(), "Cannot return null from a non-@Nullable component method");
        }
    }

    /* renamed from: com.snapchat.kit.sdk.login.b$e */
    private static class C7162e implements Provider<LoginStateController> {
        /* renamed from: a */
        private final SnapKitComponent f25907a;

        public /* synthetic */ Object get() {
            return m30817a();
        }

        C7162e(SnapKitComponent snapKitComponent) {
            this.f25907a = snapKitComponent;
        }

        /* renamed from: a */
        public LoginStateController m30817a() {
            return (LoginStateController) C15521i.a(this.f25907a.logoutController(), "Cannot return null from a non-@Nullable component method");
        }
    }

    /* renamed from: com.snapchat.kit.sdk.login.b$f */
    private static class C7163f implements Provider<MetricQueue<OpMetric>> {
        /* renamed from: a */
        private final SnapKitComponent f25908a;

        public /* synthetic */ Object get() {
            return m30818a();
        }

        C7163f(SnapKitComponent snapKitComponent) {
            this.f25908a = snapKitComponent;
        }

        /* renamed from: a */
        public MetricQueue<OpMetric> m30818a() {
            return (MetricQueue) C15521i.a(this.f25908a.operationalMetricsQueue(), "Cannot return null from a non-@Nullable component method");
        }
    }

    private C7165b(C5957a c5957a) {
        m30822a(c5957a);
    }

    /* renamed from: a */
    public static C5957a m30821a() {
        return new C5957a();
    }

    /* renamed from: a */
    private void m30822a(C5957a c5957a) {
        this.f25915a = new C7159b(c5957a.f21785a);
        this.f25916b = new C7162e(c5957a.f21785a);
        this.f25917c = new C7163f(c5957a.f21785a);
        this.f25918d = C7934b.m33785a(this.f25917c);
        this.f25919e = C17281c.a(C7935b.m33787a(this.f25915a, this.f25916b, this.f25918d));
        this.f25920f = new C7161d(c5957a.f21785a);
        this.f25921g = new C7160c(c5957a.f21785a);
        this.f25922h = C17281c.a(C7936b.m33789a(this.f25920f, this.f25921g, this.f25918d));
    }

    public C7164a loginButtonController() {
        return (C7164a) this.f25919e.get();
    }

    public C5958a snapLoginClient() {
        return (C5958a) this.f25922h.get();
    }
}
