package com.tinder.application;

import com.squareup.p070a.C2599b;
import com.tinder.api.module.LegacyNetworkModule;
import com.tinder.api.module.NetworkModule;
import com.tinder.api.module.OkHttpModule;
import com.tinder.api.module.RetrofitModule;
import com.tinder.api.module.ThirdPartyClientModule;
import com.tinder.api.module.TinderApiModule;
import com.tinder.api.module.VolleyModule;
import com.tinder.api.networkperf.module.NetworkPerfModule;
import com.tinder.app.dagger.module.C8244a;
import com.tinder.app.dagger.module.aa;
import com.tinder.app.dagger.module.p160b.C8245a;
import com.tinder.app.dagger.module.toppicks.TopPicksTinderApplicationModule;
import com.tinder.application.ApplicationComponent.Builder;
import com.tinder.auth.C8266a;
import com.tinder.base.module.ImageNetworkModule;
import com.tinder.core.experiment.C2644k;
import com.tinder.data.ads.C8618a;
import com.tinder.data.crash.module.C8639a;
import com.tinder.data.database.C8643b;
import com.tinder.data.loops.p223a.C8671a;
import com.tinder.data.message.C8698t;
import com.tinder.data.meta.module.C8702a;
import com.tinder.data.p206a.p207a.C8610a;
import com.tinder.data.p210b.C8620d;
import com.tinder.data.p211c.p212a.C8635a;
import com.tinder.data.profile.C8760g;
import com.tinder.domain.injection.modules.CommonDomainModule;
import com.tinder.domain.injection.modules.RxSchedulersModule;
import com.tinder.injection.p261a.C9707a;
import com.tinder.managers.ManagerApp;
import com.tinder.match.p292c.C9850a;
import com.tinder.module.C9939a;
import com.tinder.module.C9940d;
import com.tinder.module.FastMatchModule;
import com.tinder.module.au;
import com.tinder.module.be;
import com.tinder.module.bg;
import com.tinder.module.bj;
import com.tinder.module.bl;
import com.tinder.module.bs;
import com.tinder.module.dx;
import com.tinder.module.ea;
import com.tinder.module.ec;
import com.tinder.module.er;
import com.tinder.module.ew;
import com.tinder.module.ez;
import com.tinder.module.fb;
import com.tinder.module.fe;
import com.tinder.module.fh;
import com.tinder.module.fj;
import com.tinder.purchase.PurchaseModule;
import com.tinder.recs.module.RecsModule;
import com.tinder.video.injection.p448a.C15414a;
import dagger.internal.C15521i;

final class a$c implements Builder {
    /* renamed from: A */
    private bl f33453A;
    /* renamed from: B */
    private be f33454B;
    /* renamed from: C */
    private fh f33455C;
    /* renamed from: D */
    private ez f33456D;
    /* renamed from: E */
    private C8643b f33457E;
    /* renamed from: F */
    private C8698t f33458F;
    /* renamed from: G */
    private RxSchedulersModule f33459G;
    /* renamed from: H */
    private fj f33460H;
    /* renamed from: I */
    private com.tinder.data.message.be f33461I;
    /* renamed from: J */
    private C8610a f33462J;
    /* renamed from: K */
    private C8639a f33463K;
    /* renamed from: L */
    private C8671a f33464L;
    /* renamed from: M */
    private RecsModule f33465M;
    /* renamed from: N */
    private ThirdPartyClientModule f33466N;
    /* renamed from: O */
    private C9940d f33467O;
    /* renamed from: P */
    private C9939a f33468P;
    /* renamed from: Q */
    private aa f33469Q;
    /* renamed from: R */
    private ew f33470R;
    /* renamed from: S */
    private bg f33471S;
    /* renamed from: T */
    private C8244a f33472T;
    /* renamed from: U */
    private C9850a f33473U;
    /* renamed from: V */
    private ImageNetworkModule f33474V;
    /* renamed from: W */
    private er f33475W;
    /* renamed from: X */
    private C8618a f33476X;
    /* renamed from: Y */
    private C15414a f33477Y;
    /* renamed from: Z */
    private C8635a f33478Z;
    /* renamed from: a */
    private C8760g f33479a;
    private ManagerApp aa;
    private C2599b ab;
    private C2644k ac;
    /* renamed from: b */
    private RetrofitModule f33480b;
    /* renamed from: c */
    private bs f33481c;
    /* renamed from: d */
    private TinderApiModule f33482d;
    /* renamed from: e */
    private OkHttpModule f33483e;
    /* renamed from: f */
    private ec f33484f;
    /* renamed from: g */
    private C8266a f33485g;
    /* renamed from: h */
    private fe f33486h;
    /* renamed from: i */
    private NetworkPerfModule f33487i;
    /* renamed from: j */
    private com.tinder.module.aa f33488j;
    /* renamed from: k */
    private PurchaseModule f33489k;
    /* renamed from: l */
    private LegacyNetworkModule f33490l;
    /* renamed from: m */
    private VolleyModule f33491m;
    /* renamed from: n */
    private au f33492n;
    /* renamed from: o */
    private dx f33493o;
    /* renamed from: p */
    private C8702a f33494p;
    /* renamed from: q */
    private FastMatchModule f33495q;
    /* renamed from: r */
    private CommonDomainModule f33496r;
    /* renamed from: s */
    private TopPicksTinderApplicationModule f33497s;
    /* renamed from: t */
    private C8620d f33498t;
    /* renamed from: u */
    private fb f33499u;
    /* renamed from: v */
    private NetworkModule f33500v;
    /* renamed from: w */
    private C8245a f33501w;
    /* renamed from: x */
    private bj f33502x;
    /* renamed from: y */
    private C9707a f33503y;
    /* renamed from: z */
    private ea f33504z;

    private a$c() {
    }

    public /* synthetic */ Builder application(ManagerApp managerApp) {
        return m41802a(managerApp);
    }

    public /* synthetic */ Builder leanplumAbTestVariables(C2644k c2644k) {
        return m41801a(c2644k);
    }

    public /* synthetic */ Builder refWatcher(C2599b c2599b) {
        return m41800a(c2599b);
    }

    public ApplicationComponent build() {
        if (this.f33479a == null) {
            this.f33479a = new C8760g();
        }
        if (this.f33480b == null) {
            this.f33480b = new RetrofitModule();
        }
        if (this.f33481c == null) {
            this.f33481c = new bs();
        }
        if (this.f33482d == null) {
            this.f33482d = new TinderApiModule();
        }
        if (this.f33483e == null) {
            this.f33483e = new OkHttpModule();
        }
        if (this.f33484f == null) {
            this.f33484f = new ec();
        }
        if (this.f33485g == null) {
            this.f33485g = new C8266a();
        }
        if (this.f33486h == null) {
            this.f33486h = new fe();
        }
        if (this.f33487i == null) {
            this.f33487i = new NetworkPerfModule();
        }
        if (this.f33488j == null) {
            this.f33488j = new com.tinder.module.aa();
        }
        if (this.f33489k == null) {
            this.f33489k = new PurchaseModule();
        }
        if (this.f33490l == null) {
            this.f33490l = new LegacyNetworkModule();
        }
        if (this.f33491m == null) {
            this.f33491m = new VolleyModule();
        }
        if (this.f33492n == null) {
            this.f33492n = new au();
        }
        if (this.f33493o == null) {
            this.f33493o = new dx();
        }
        if (this.f33494p == null) {
            this.f33494p = new C8702a();
        }
        if (this.f33495q == null) {
            this.f33495q = new FastMatchModule();
        }
        if (this.f33496r == null) {
            this.f33496r = new CommonDomainModule();
        }
        if (this.f33497s == null) {
            this.f33497s = new TopPicksTinderApplicationModule();
        }
        if (this.f33498t == null) {
            this.f33498t = new C8620d();
        }
        if (this.f33499u == null) {
            this.f33499u = new fb();
        }
        if (this.f33500v == null) {
            this.f33500v = new NetworkModule();
        }
        if (this.f33501w == null) {
            this.f33501w = new C8245a();
        }
        if (this.f33502x == null) {
            this.f33502x = new bj();
        }
        if (this.f33503y == null) {
            this.f33503y = new C9707a();
        }
        if (this.f33504z == null) {
            this.f33504z = new ea();
        }
        if (this.f33453A == null) {
            this.f33453A = new bl();
        }
        if (this.f33454B == null) {
            this.f33454B = new be();
        }
        if (this.f33455C == null) {
            this.f33455C = new fh();
        }
        if (this.f33456D == null) {
            this.f33456D = new ez();
        }
        if (this.f33457E == null) {
            this.f33457E = new C8643b();
        }
        if (this.f33458F == null) {
            this.f33458F = new C8698t();
        }
        if (this.f33459G == null) {
            this.f33459G = new RxSchedulersModule();
        }
        if (this.f33460H == null) {
            this.f33460H = new fj();
        }
        if (this.f33461I == null) {
            this.f33461I = new com.tinder.data.message.be();
        }
        if (this.f33462J == null) {
            this.f33462J = new C8610a();
        }
        if (this.f33463K == null) {
            this.f33463K = new C8639a();
        }
        if (this.f33464L == null) {
            this.f33464L = new C8671a();
        }
        if (this.f33465M == null) {
            this.f33465M = new RecsModule();
        }
        if (this.f33466N == null) {
            this.f33466N = new ThirdPartyClientModule();
        }
        if (this.f33467O == null) {
            this.f33467O = new C9940d();
        }
        if (this.f33468P == null) {
            this.f33468P = new C9939a();
        }
        if (this.f33469Q == null) {
            this.f33469Q = new aa();
        }
        if (this.f33470R == null) {
            this.f33470R = new ew();
        }
        if (this.f33471S == null) {
            this.f33471S = new bg();
        }
        if (this.f33472T == null) {
            this.f33472T = new C8244a();
        }
        if (this.f33473U == null) {
            this.f33473U = new C9850a();
        }
        if (this.f33474V == null) {
            this.f33474V = new ImageNetworkModule();
        }
        if (this.f33475W == null) {
            this.f33475W = new er();
        }
        if (this.f33476X == null) {
            this.f33476X = new C8618a();
        }
        if (this.f33477Y == null) {
            this.f33477Y = new C15414a();
        }
        if (this.f33478Z == null) {
            this.f33478Z = new C8635a();
        }
        StringBuilder stringBuilder;
        if (this.aa == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(ManagerApp.class.getCanonicalName());
            stringBuilder.append(" must be set");
            throw new IllegalStateException(stringBuilder.toString());
        } else if (this.ab == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(C2599b.class.getCanonicalName());
            stringBuilder.append(" must be set");
            throw new IllegalStateException(stringBuilder.toString());
        } else if (this.ac != null) {
            return new C4423a(this, null);
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(C2644k.class.getCanonicalName());
            stringBuilder.append(" must be set");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public a$c m41802a(ManagerApp managerApp) {
        this.aa = (ManagerApp) C15521i.a(managerApp);
        return this;
    }

    /* renamed from: a */
    public a$c m41800a(C2599b c2599b) {
        this.ab = (C2599b) C15521i.a(c2599b);
        return this;
    }

    /* renamed from: a */
    public a$c m41801a(C2644k c2644k) {
        this.ac = (C2644k) C15521i.a(c2644k);
        return this;
    }
}
