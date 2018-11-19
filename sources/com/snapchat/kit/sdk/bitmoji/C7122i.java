package com.snapchat.kit.sdk.bitmoji;

import android.content.Context;
import com.google.gson.Gson;
import com.snapchat.kit.sdk.SnapKitComponent;
import com.snapchat.kit.sdk.bitmoji.FragmentComponent.Builder;
import com.snapchat.kit.sdk.bitmoji.networking.C5900a;
import com.snapchat.kit.sdk.bitmoji.networking.C7863b;
import com.snapchat.kit.sdk.bitmoji.networking.C7864c;
import com.snapchat.kit.sdk.bitmoji.networking.C7865d;
import com.snapchat.kit.sdk.bitmoji.p143a.p144a.C5885a;
import com.snapchat.kit.sdk.bitmoji.p143a.p144a.C5886c;
import com.snapchat.kit.sdk.bitmoji.p143a.p144a.C5887d;
import com.snapchat.kit.sdk.bitmoji.p143a.p144a.C5888f;
import com.snapchat.kit.sdk.bitmoji.p143a.p144a.C7845b;
import com.snapchat.kit.sdk.bitmoji.p143a.p144a.C7846e;
import com.snapchat.kit.sdk.bitmoji.p143a.p144a.C7847g;
import com.snapchat.kit.sdk.bitmoji.p143a.p145b.C5890a;
import com.snapchat.kit.sdk.bitmoji.p143a.p145b.C5891c;
import com.snapchat.kit.sdk.bitmoji.p143a.p145b.C5892d;
import com.snapchat.kit.sdk.bitmoji.p143a.p145b.C7848b;
import com.snapchat.kit.sdk.bitmoji.p143a.p145b.C7849e;
import com.snapchat.kit.sdk.bitmoji.p143a.p145b.C7850f;
import com.snapchat.kit.sdk.bitmoji.p143a.p145b.C7851g;
import com.snapchat.kit.sdk.bitmoji.p143a.p145b.C7852h;
import com.snapchat.kit.sdk.bitmoji.persistence.C7868a;
import com.snapchat.kit.sdk.bitmoji.persistence.StickerPacksCache;
import com.snapchat.kit.sdk.bitmoji.search.C7871b;
import com.snapchat.kit.sdk.bitmoji.search.C7872c;
import com.snapchat.kit.sdk.bitmoji.search.StickerIndexingTask;
import com.snapchat.kit.sdk.bitmoji.search.StickerIndexingTask.OnIndexCompleteListener;
import com.snapchat.kit.sdk.bitmoji.ui.BitmojiFragment;
import com.snapchat.kit.sdk.bitmoji.ui.BitmojiIconFragment;
import com.snapchat.kit.sdk.bitmoji.ui.C7131a;
import com.snapchat.kit.sdk.bitmoji.ui.C7132b;
import com.snapchat.kit.sdk.bitmoji.ui.controller.BitmojiTagResultsViewController;
import com.snapchat.kit.sdk.bitmoji.ui.controller.C5918a;
import com.snapchat.kit.sdk.bitmoji.ui.controller.C7876b;
import com.snapchat.kit.sdk.bitmoji.ui.controller.C7877c;
import com.snapchat.kit.sdk.bitmoji.ui.controller.C7878d;
import com.snapchat.kit.sdk.bitmoji.ui.controller.C7879e;
import com.snapchat.kit.sdk.bitmoji.ui.controller.C7880f;
import com.snapchat.kit.sdk.bitmoji.ui.controller.C7881g;
import com.snapchat.kit.sdk.bitmoji.ui.controller.C7882h;
import com.snapchat.kit.sdk.bitmoji.ui.controller.C7883i;
import com.snapchat.kit.sdk.bitmoji.ui.controller.C7884k;
import com.snapchat.kit.sdk.bitmoji.ui.controller.C7885l;
import com.snapchat.kit.sdk.bitmoji.ui.p146b.C5911a;
import com.snapchat.kit.sdk.bitmoji.ui.p146b.C7875b;
import com.snapchat.kit.sdk.bitmoji.ui.p157a.C7129a;
import com.snapchat.kit.sdk.bitmoji.ui.p157a.C7874b;
import com.snapchat.kit.sdk.bitmoji.ui.view.C5927a;
import com.snapchat.kit.sdk.core.controller.LoginStateController;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.business.KitEventBaseFactory;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.networking.AuthTokenManager;
import com.snapchat.kit.sdk.core.networking.LoginClient;
import com.squareup.okhttp.C5997b;
import com.squareup.okhttp.C6068p;
import com.squareup.picasso.Picasso;
import dagger.internal.C15521i;
import dagger.internal.C17281c;
import java.io.File;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.bitmoji.i */
public final class C7122i implements BitmojiComponent {
    /* renamed from: a */
    private SnapKitComponent f25780a;
    /* renamed from: b */
    private Provider<LoginClient> f25781b;
    /* renamed from: c */
    private Provider<MetricQueue<OpMetric>> f25782c;
    /* renamed from: d */
    private Provider<Random> f25783d;
    /* renamed from: e */
    private Provider<C5890a> f25784e;
    /* renamed from: f */
    private Provider<Gson> f25785f;
    /* renamed from: g */
    private Provider<C5900a> f25786g;
    /* renamed from: h */
    private Provider<Context> f25787h;
    /* renamed from: i */
    private Provider<File> f25788i;
    /* renamed from: j */
    private Provider<C5997b> f25789j;
    /* renamed from: k */
    private Provider<C6068p> f25790k;
    /* renamed from: l */
    private Provider<C7864c> f25791l;
    /* renamed from: m */
    private Provider<Picasso> f25792m;
    /* renamed from: n */
    private Provider<KitEventBaseFactory> f25793n;
    /* renamed from: o */
    private Provider<MetricQueue<ServerEvent>> f25794o;
    /* renamed from: p */
    private Provider<String> f25795p;
    /* renamed from: q */
    private Provider<ExecutorService> f25796q;
    /* renamed from: r */
    private Provider<StickerPacksCache> f25797r;

    /* renamed from: com.snapchat.kit.sdk.bitmoji.i$a */
    public static final class C5896a {
        /* renamed from: a */
        private C5894b f21598a;
        /* renamed from: b */
        private SnapKitComponent f21599b;

        private C5896a() {
        }

        /* renamed from: a */
        public BitmojiComponent m25445a() {
            if (this.f21598a == null) {
                this.f21598a = new C5894b();
            }
            if (this.f21599b != null) {
                return new C7122i();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(SnapKitComponent.class.getCanonicalName());
            stringBuilder.append(" must be set");
            throw new IllegalStateException(stringBuilder.toString());
        }

        /* renamed from: a */
        public C5896a m25447a(C5894b c5894b) {
            this.f21598a = (C5894b) C15521i.a(c5894b);
            return this;
        }

        /* renamed from: a */
        public C5896a m25446a(SnapKitComponent snapKitComponent) {
            this.f21599b = (SnapKitComponent) C15521i.a(snapKitComponent);
            return this;
        }
    }

    /* renamed from: com.snapchat.kit.sdk.bitmoji.i$b */
    private final class C7113b implements Builder {
        /* renamed from: a */
        final /* synthetic */ C7122i f25745a;
        /* renamed from: b */
        private C5897j f25746b;
        /* renamed from: c */
        private C5892d f25747c;

        private C7113b(C7122i c7122i) {
            this.f25745a = c7122i;
        }

        public /* synthetic */ Builder fragmentModule(C5897j c5897j) {
            return m30695a(c5897j);
        }

        public FragmentComponent build() {
            if (this.f25746b == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(C5897j.class.getCanonicalName());
                stringBuilder.append(" must be set");
                throw new IllegalStateException(stringBuilder.toString());
            }
            if (this.f25747c == null) {
                this.f25747c = new C5892d();
            }
            return new C7114c(this);
        }

        /* renamed from: a */
        public C7113b m30695a(C5897j c5897j) {
            this.f25746b = (C5897j) C15521i.a(c5897j);
            return this;
        }
    }

    /* renamed from: com.snapchat.kit.sdk.bitmoji.i$c */
    private final class C7114c implements FragmentComponent {
        /* renamed from: a */
        final /* synthetic */ C7122i f25748a;
        /* renamed from: b */
        private Provider<C5888f> f25749b;
        /* renamed from: c */
        private Provider<C5885a> f25750c;
        /* renamed from: d */
        private Provider<C5927a> f25751d;
        /* renamed from: e */
        private Provider<C7880f> f25752e;
        /* renamed from: f */
        private Provider<C5927a> f25753f;
        /* renamed from: g */
        private Provider<C7878d> f25754g;
        /* renamed from: h */
        private Provider<C5887d> f25755h;
        /* renamed from: i */
        private Provider<C5911a> f25756i;
        /* renamed from: j */
        private Provider<C5927a> f25757j;
        /* renamed from: k */
        private Provider<C5886c> f25758k;
        /* renamed from: l */
        private Provider<C5891c> f25759l;
        /* renamed from: m */
        private Provider<C5891c> f25760m;
        /* renamed from: n */
        private Provider<C7129a> f25761n;
        /* renamed from: o */
        private Provider<C5927a> f25762o;
        /* renamed from: p */
        private Provider<C5918a> f25763p;
        /* renamed from: q */
        private Provider<BitmojiTagResultsViewController> f25764q;
        /* renamed from: r */
        private Provider<OnBitmojiSearchFocusChangeListener> f25765r;
        /* renamed from: s */
        private Provider<C7884k> f25766s;
        /* renamed from: t */
        private Provider<C5927a> f25767t;
        /* renamed from: u */
        private Provider<C7882h> f25768u;
        /* renamed from: v */
        private Provider<OnIndexCompleteListener> f25769v;
        /* renamed from: w */
        private Provider<C5891c> f25770w;
        /* renamed from: x */
        private Provider<StickerIndexingTask> f25771x;
        /* renamed from: y */
        private Provider<C5891c> f25772y;

        private C7114c(C7122i c7122i, C7113b c7113b) {
            this.f25748a = c7122i;
            m30697a(c7113b);
        }

        /* renamed from: a */
        private void m30697a(C7113b c7113b) {
            this.f25749b = C17281c.a(C7847g.m33626b());
            this.f25750c = C17281c.a(C7845b.m33622a(this.f25748a.f25793n, this.f25749b));
            this.f25751d = C17281c.a(C7861m.m33654a(c7113b.f25746b));
            this.f25752e = C17281c.a(C7881g.m33716a(this.f25751d));
            this.f25753f = C17281c.a(C7860l.m33652a(c7113b.f25746b));
            this.f25754g = C17281c.a(C7879e.m33709a(this.f25748a.f25787h, this.f25753f, this.f25750c, this.f25748a.f25794o, this.f25748a.f25795p));
            this.f25755h = C17281c.a(C7846e.m33624b());
            this.f25756i = C17281c.a(C7875b.m33695a(this.f25750c, this.f25748a.f25794o));
            this.f25757j = C17281c.a(C7869q.m33669a(c7113b.f25746b));
            this.f25758k = C17281c.a(C7859k.m33650a(c7113b.f25746b, this.f25748a.f25794o, this.f25750c, this.f25755h, this.f25748a.f25784e));
            this.f25759l = C17281c.a(C7850f.m33632a(c7113b.f25747c, this.f25748a.f25784e));
            this.f25760m = C17281c.a(C7849e.m33630a(c7113b.f25747c, this.f25748a.f25784e));
            this.f25761n = C7874b.m33693a(this.f25758k, this.f25759l, this.f25760m, this.f25748a.f25792m);
            this.f25762o = C17281c.a(C7870r.m33671a(c7113b.f25746b));
            this.f25763p = C7876b.m33697a(this.f25748a.f25787h);
            this.f25764q = C17281c.a(C7877c.m33699a(this.f25748a.f25787h, this.f25762o, this.f25761n, this.f25763p, this.f25755h));
            this.f25765r = C7866o.m33663a(c7113b.f25746b);
            this.f25766s = C17281c.a(C7885l.m33735a(this.f25748a.f25787h, this.f25757j, C7871b.m33673b(), this.f25761n, this.f25764q, this.f25763p, this.f25760m, this.f25755h, this.f25765r));
            this.f25767t = C17281c.a(C7862n.m33656a(c7113b.f25746b));
            this.f25768u = C17281c.a(C7883i.m33724a(this.f25748a.f25787h, this.f25767t, this.f25748a.f25794o, this.f25750c));
            this.f25769v = C7867p.m33665a(c7113b.f25746b);
            this.f25770w = C17281c.a(C7852h.m33636a(c7113b.f25747c, this.f25748a.f25784e));
            this.f25771x = C7872c.m33675a(this.f25769v, this.f25770w);
            this.f25772y = C17281c.a(C7851g.m33634a(c7113b.f25747c, this.f25748a.f25784e));
        }

        public void inject(BitmojiFragment bitmojiFragment) {
            m30696a(bitmojiFragment);
        }

        /* renamed from: a */
        private BitmojiFragment m30696a(BitmojiFragment bitmojiFragment) {
            C7131a.m30746a(bitmojiFragment, (AuthTokenManager) C15521i.a(this.f25748a.f25780a.authTokenManager(), "Cannot return null from a non-@Nullable component method"));
            C7131a.m30745a(bitmojiFragment, (MetricQueue) C15521i.a(this.f25748a.f25780a.analyticsEventQueue(), "Cannot return null from a non-@Nullable component method"));
            C7131a.m30732a(bitmojiFragment, (C5885a) this.f25750c.get());
            C7131a.m30737a(bitmojiFragment, (C5900a) this.f25748a.f25786g.get());
            C7131a.m30741a(bitmojiFragment, (C7880f) this.f25752e.get());
            C7131a.m30740a(bitmojiFragment, (C7878d) this.f25754g.get());
            C7131a.m30733a(bitmojiFragment, (C5887d) this.f25755h.get());
            C7131a.m30739a(bitmojiFragment, (C5911a) this.f25756i.get());
            C7131a.m30734a(bitmojiFragment, (C5888f) this.f25749b.get());
            C7131a.m30743a(bitmojiFragment, (C7884k) this.f25766s.get());
            C7131a.m30742a(bitmojiFragment, (C7882h) this.f25768u.get());
            C7131a.m30744a(bitmojiFragment, (LoginStateController) C15521i.a(this.f25748a.f25780a.logoutController(), "Cannot return null from a non-@Nullable component method"));
            C7131a.m30735a(bitmojiFragment, (C5890a) this.f25748a.f25784e.get());
            C7131a.m30738a(bitmojiFragment, (StickerPacksCache) this.f25748a.f25797r.get());
            C7131a.m30748a(bitmojiFragment, this.f25771x);
            C7131a.m30736a(bitmojiFragment, (C5891c) this.f25759l.get());
            C7131a.m30749b(bitmojiFragment, (C5891c) this.f25772y.get());
            C7131a.m30747a(bitmojiFragment, (C5997b) this.f25748a.f25789j.get());
            return bitmojiFragment;
        }
    }

    /* renamed from: com.snapchat.kit.sdk.bitmoji.i$d */
    private static class C7115d implements Provider<MetricQueue<ServerEvent>> {
        /* renamed from: a */
        private final SnapKitComponent f25773a;

        public /* synthetic */ Object get() {
            return m30698a();
        }

        C7115d(SnapKitComponent snapKitComponent) {
            this.f25773a = snapKitComponent;
        }

        /* renamed from: a */
        public MetricQueue<ServerEvent> m30698a() {
            return (MetricQueue) C15521i.a(this.f25773a.analyticsEventQueue(), "Cannot return null from a non-@Nullable component method");
        }
    }

    /* renamed from: com.snapchat.kit.sdk.bitmoji.i$e */
    private static class C7116e implements Provider<String> {
        /* renamed from: a */
        private final SnapKitComponent f25774a;

        public /* synthetic */ Object get() {
            return m30699a();
        }

        C7116e(SnapKitComponent snapKitComponent) {
            this.f25774a = snapKitComponent;
        }

        /* renamed from: a */
        public String m30699a() {
            return (String) C15521i.a(this.f25774a.clientId(), "Cannot return null from a non-@Nullable component method");
        }
    }

    /* renamed from: com.snapchat.kit.sdk.bitmoji.i$f */
    private static class C7117f implements Provider<Context> {
        /* renamed from: a */
        private final SnapKitComponent f25775a;

        public /* synthetic */ Object get() {
            return m30700a();
        }

        C7117f(SnapKitComponent snapKitComponent) {
            this.f25775a = snapKitComponent;
        }

        /* renamed from: a */
        public Context m30700a() {
            return (Context) C15521i.a(this.f25775a.context(), "Cannot return null from a non-@Nullable component method");
        }
    }

    /* renamed from: com.snapchat.kit.sdk.bitmoji.i$g */
    private static class C7118g implements Provider<Gson> {
        /* renamed from: a */
        private final SnapKitComponent f25776a;

        public /* synthetic */ Object get() {
            return m30701a();
        }

        C7118g(SnapKitComponent snapKitComponent) {
            this.f25776a = snapKitComponent;
        }

        /* renamed from: a */
        public Gson m30701a() {
            return (Gson) C15521i.a(this.f25776a.gson(), "Cannot return null from a non-@Nullable component method");
        }
    }

    /* renamed from: com.snapchat.kit.sdk.bitmoji.i$h */
    private static class C7119h implements Provider<KitEventBaseFactory> {
        /* renamed from: a */
        private final SnapKitComponent f25777a;

        public /* synthetic */ Object get() {
            return m30702a();
        }

        C7119h(SnapKitComponent snapKitComponent) {
            this.f25777a = snapKitComponent;
        }

        /* renamed from: a */
        public KitEventBaseFactory m30702a() {
            return (KitEventBaseFactory) C15521i.a(this.f25777a.kitEventBaseFactory(), "Cannot return null from a non-@Nullable component method");
        }
    }

    /* renamed from: com.snapchat.kit.sdk.bitmoji.i$i */
    private static class C7120i implements Provider<LoginClient> {
        /* renamed from: a */
        private final SnapKitComponent f25778a;

        public /* synthetic */ Object get() {
            return m30703a();
        }

        C7120i(SnapKitComponent snapKitComponent) {
            this.f25778a = snapKitComponent;
        }

        /* renamed from: a */
        public LoginClient m30703a() {
            return (LoginClient) C15521i.a(this.f25778a.loginClient(), "Cannot return null from a non-@Nullable component method");
        }
    }

    /* renamed from: com.snapchat.kit.sdk.bitmoji.i$j */
    private static class C7121j implements Provider<MetricQueue<OpMetric>> {
        /* renamed from: a */
        private final SnapKitComponent f25779a;

        public /* synthetic */ Object get() {
            return m30704a();
        }

        C7121j(SnapKitComponent snapKitComponent) {
            this.f25779a = snapKitComponent;
        }

        /* renamed from: a */
        public MetricQueue<OpMetric> m30704a() {
            return (MetricQueue) C15521i.a(this.f25779a.operationalMetricsQueue(), "Cannot return null from a non-@Nullable component method");
        }
    }

    private C7122i(C5896a c5896a) {
        m30708a(c5896a);
    }

    /* renamed from: a */
    public static C5896a m30705a() {
        return new C5896a();
    }

    /* renamed from: a */
    private void m30708a(C5896a c5896a) {
        this.f25780a = c5896a.f21599b;
        this.f25781b = new C7120i(c5896a.f21599b);
        this.f25782c = new C7121j(c5896a.f21599b);
        this.f25783d = C7858h.m33648a(c5896a.f21598a);
        this.f25784e = C17281c.a(C7848b.m33628a(this.f25782c, this.f25783d));
        this.f25785f = new C7118g(c5896a.f21599b);
        this.f25786g = C17281c.a(C7863b.m33658a(this.f25781b, this.f25784e, this.f25785f));
        this.f25787h = new C7117f(c5896a.f21599b);
        this.f25788i = C7853c.m33638a(c5896a.f21598a, this.f25787h);
        this.f25789j = C17281c.a(C7854d.m33640a(c5896a.f21598a, this.f25787h, this.f25788i));
        this.f25790k = C7856f.m33644a(c5896a.f21598a, this.f25789j);
        this.f25791l = C7865d.m33661a(this.f25784e, this.f25790k);
        this.f25792m = C17281c.a(C7857g.m33646a(c5896a.f21598a, this.f25787h, this.f25791l));
        this.f25793n = new C7119h(c5896a.f21599b);
        this.f25794o = new C7115d(c5896a.f21599b);
        this.f25795p = new C7116e(c5896a.f21599b);
        this.f25796q = C7855e.m33642a(c5896a.f21598a);
        this.f25797r = C17281c.a(C7868a.m33667a(this.f25796q, this.f25788i, this.f25785f));
    }

    public void inject(BitmojiIconFragment bitmojiIconFragment) {
        m30706a(bitmojiIconFragment);
    }

    public C5900a bitmojiClient() {
        return (C5900a) this.f25786g.get();
    }

    public Builder fragmentComponentBuilder() {
        return new C7113b();
    }

    /* renamed from: a */
    private BitmojiIconFragment m30706a(BitmojiIconFragment bitmojiIconFragment) {
        C7132b.m30753a(bitmojiIconFragment, (AuthTokenManager) C15521i.a(this.f25780a.authTokenManager(), "Cannot return null from a non-@Nullable component method"));
        C7132b.m30751a(bitmojiIconFragment, (C5900a) this.f25786g.get());
        C7132b.m30752a(bitmojiIconFragment, (LoginStateController) C15521i.a(this.f25780a.logoutController(), "Cannot return null from a non-@Nullable component method"));
        C7132b.m30754a(bitmojiIconFragment, (Picasso) this.f25792m.get());
        return bitmojiIconFragment;
    }
}
