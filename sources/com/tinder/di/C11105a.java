package com.tinder.di;

import com.tinder.data.recs.C10992i;
import com.tinder.data.recs.C13095a;
import com.tinder.data.recs.C13096b;
import com.tinder.data.recs.C13097c;
import com.tinder.data.recs.C13104j;
import com.tinder.data.recs.C13105m;
import com.tinder.data.recs.C8776g;
import com.tinder.data.recs.C8788l;
import com.tinder.data.recs.CardStackRecsDataRepository;
import com.tinder.di.RecsEngineComponent.Builder;
import com.tinder.domain.recs.GlobalRecsConsumptionEventPublisher;
import com.tinder.domain.recs.GlobalRecsConsumptionListenerRegistry;
import com.tinder.domain.recs.RecsAdditionalDataPrefetcher;
import com.tinder.domain.recs.RecsApiClient;
import com.tinder.domain.recs.RecsEngine;
import com.tinder.domain.recs.RecsEngine.Config;
import com.tinder.domain.recs.RecsRepository;
import com.tinder.domain.recs.engine.RecsLoader;
import com.tinder.domain.recs.engine.SwipeProcessingRulesResolver;
import com.tinder.domain.recs.engine.SwipeProcessor;
import com.tinder.domain.recs.engine.SwipeProcessor.SwipeRulesProcessor;
import com.tinder.domain.recs.engine.SwipeProcessor_Factory;
import com.tinder.domain.recs.engine.cardgrid.CardGridRecsLoader;
import com.tinder.domain.recs.engine.cardgrid.CardGridRecsLoader_Factory;
import com.tinder.domain.recs.engine.cardstack.CardStackRecsLoader;
import com.tinder.domain.recs.engine.cardstack.CardStackRecsLoader_Factory;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.Rec$Source;
import com.tinder.util.ConnectivityProvider;
import dagger.internal.C15521i;
import dagger.internal.C17281c;
import dagger.internal.C18317d;
import javax.inject.Provider;

/* renamed from: com.tinder.di.a */
public final class C11105a implements RecsEngineComponent {
    /* renamed from: a */
    private Rec$Source f35918a;
    /* renamed from: b */
    private Provider<Config> f35919b;
    /* renamed from: c */
    private Provider<Rec$Source> f35920c;
    /* renamed from: d */
    private Provider<C8788l> f35921d;
    /* renamed from: e */
    private Provider<C10992i> f35922e;
    /* renamed from: f */
    private Provider<RecsApiClient> f35923f;
    /* renamed from: g */
    private Provider<C8776g> f35924g;
    /* renamed from: h */
    private Provider<ConnectivityProvider> f35925h;
    /* renamed from: i */
    private Provider<CardStackRecsDataRepository> f35926i;
    /* renamed from: j */
    private Provider<C13095a> f35927j;
    /* renamed from: k */
    private Provider<RecsRepository> f35928k;
    /* renamed from: l */
    private Provider<RecsAdditionalDataPrefetcher<? super Rec>> f35929l;
    /* renamed from: m */
    private Provider<CardStackRecsLoader> f35930m;
    /* renamed from: n */
    private Provider<CardGridRecsLoader> f35931n;
    /* renamed from: o */
    private Provider<RecsLoader> f35932o;
    /* renamed from: p */
    private Provider<SwipeProcessingRulesResolver> f35933p;
    /* renamed from: q */
    private Provider<GlobalRecsConsumptionEventPublisher> f35934q;
    /* renamed from: r */
    private Provider<SwipeRulesProcessor> f35935r;
    /* renamed from: s */
    private C13140m f35936s;
    /* renamed from: t */
    private C13141n f35937t;
    /* renamed from: u */
    private Provider<SwipeProcessor> f35938u;
    /* renamed from: v */
    private Provider<GlobalRecsConsumptionListenerRegistry> f35939v;

    /* renamed from: com.tinder.di.a$a */
    private static final class C11104a implements Builder {
        /* renamed from: a */
        private C8839d f35909a;
        /* renamed from: b */
        private C8842l f35910b;
        /* renamed from: c */
        private Rec$Source f35911c;
        /* renamed from: d */
        private Config f35912d;
        /* renamed from: e */
        private RecsApiClient f35913e;
        /* renamed from: f */
        private C8776g f35914f;
        /* renamed from: g */
        private ConnectivityProvider f35915g;
        /* renamed from: h */
        private RecsAdditionalDataPrefetcher<? super Rec> f35916h;
        /* renamed from: i */
        private SwipeProcessingRulesResolver f35917i;

        private C11104a() {
        }

        public /* synthetic */ Builder config(Config config) {
            return m43809a(config);
        }

        public /* synthetic */ Builder connectivityProvider(ConnectivityProvider connectivityProvider) {
            return m43812a(connectivityProvider);
        }

        public /* synthetic */ Builder recSource(Rec$Source rec$Source) {
            return m43811a(rec$Source);
        }

        public /* synthetic */ Builder recsAdditionalDataPrefetcher(RecsAdditionalDataPrefetcher recsAdditionalDataPrefetcher) {
            return m43807a(recsAdditionalDataPrefetcher);
        }

        public /* synthetic */ Builder recsAlreadySwipedProvider(C8776g c8776g) {
            return m43806a(c8776g);
        }

        public /* synthetic */ Builder recsApiClient(RecsApiClient recsApiClient) {
            return m43808a(recsApiClient);
        }

        public /* synthetic */ Builder swipeProcessingRulesResolver(SwipeProcessingRulesResolver swipeProcessingRulesResolver) {
            return m43810a(swipeProcessingRulesResolver);
        }

        public RecsEngineComponent build() {
            if (this.f35909a == null) {
                this.f35909a = new C8839d();
            }
            if (this.f35910b == null) {
                this.f35910b = new C8842l();
            }
            StringBuilder stringBuilder;
            if (this.f35911c == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(Rec$Source.class.getCanonicalName());
                stringBuilder.append(" must be set");
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.f35912d == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(Config.class.getCanonicalName());
                stringBuilder.append(" must be set");
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.f35913e == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(RecsApiClient.class.getCanonicalName());
                stringBuilder.append(" must be set");
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.f35914f == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(C8776g.class.getCanonicalName());
                stringBuilder.append(" must be set");
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.f35915g == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ConnectivityProvider.class.getCanonicalName());
                stringBuilder.append(" must be set");
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.f35916h == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(RecsAdditionalDataPrefetcher.class.getCanonicalName());
                stringBuilder.append(" must be set");
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.f35917i != null) {
                return new C11105a();
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(SwipeProcessingRulesResolver.class.getCanonicalName());
                stringBuilder.append(" must be set");
                throw new IllegalStateException(stringBuilder.toString());
            }
        }

        /* renamed from: a */
        public C11104a m43811a(Rec$Source rec$Source) {
            this.f35911c = (Rec$Source) C15521i.a(rec$Source);
            return this;
        }

        /* renamed from: a */
        public C11104a m43809a(Config config) {
            this.f35912d = (Config) C15521i.a(config);
            return this;
        }

        /* renamed from: a */
        public C11104a m43808a(RecsApiClient recsApiClient) {
            this.f35913e = (RecsApiClient) C15521i.a(recsApiClient);
            return this;
        }

        /* renamed from: a */
        public C11104a m43806a(C8776g c8776g) {
            this.f35914f = (C8776g) C15521i.a(c8776g);
            return this;
        }

        /* renamed from: a */
        public C11104a m43812a(ConnectivityProvider connectivityProvider) {
            this.f35915g = (ConnectivityProvider) C15521i.a(connectivityProvider);
            return this;
        }

        /* renamed from: a */
        public C11104a m43807a(RecsAdditionalDataPrefetcher<? super Rec> recsAdditionalDataPrefetcher) {
            this.f35916h = (RecsAdditionalDataPrefetcher) C15521i.a(recsAdditionalDataPrefetcher);
            return this;
        }

        /* renamed from: a */
        public C11104a m43810a(SwipeProcessingRulesResolver swipeProcessingRulesResolver) {
            this.f35917i = (SwipeProcessingRulesResolver) C15521i.a(swipeProcessingRulesResolver);
            return this;
        }
    }

    private C11105a(C11104a c11104a) {
        m43814a(c11104a);
    }

    /* renamed from: a */
    public static Builder m43813a() {
        return new C11104a();
    }

    /* renamed from: a */
    private void m43814a(C11104a c11104a) {
        this.f35918a = c11104a.f35911c;
        this.f35919b = C18317d.a(c11104a.f35912d);
        this.f35920c = C18317d.a(c11104a.f35911c);
        this.f35921d = C17281c.a(C13105m.m50963a(this.f35920c));
        this.f35922e = C17281c.a(C13104j.m50961a(this.f35920c, this.f35921d));
        this.f35923f = C18317d.a(c11104a.f35913e);
        this.f35924g = C18317d.a(c11104a.f35914f);
        this.f35925h = C18317d.a(c11104a.f35915g);
        this.f35926i = C17281c.a(C13097c.m50951a(this.f35922e, this.f35923f, this.f35924g, this.f35925h, this.f35920c));
        this.f35927j = C17281c.a(C13096b.m50949a(this.f35922e, this.f35923f, this.f35924g, this.f35925h, this.f35920c));
        this.f35928k = C17281c.a(C13138i.m51050a(c11104a.f35909a, this.f35919b, this.f35926i, this.f35927j));
        this.f35929l = C18317d.a(c11104a.f35916h);
        this.f35930m = C17281c.a(CardStackRecsLoader_Factory.create(this.f35928k, this.f35929l, this.f35925h, this.f35919b, this.f35920c));
        this.f35931n = C17281c.a(CardGridRecsLoader_Factory.create(this.f35928k, this.f35925h, this.f35919b, this.f35920c));
        this.f35932o = C17281c.a(C13137h.m51048a(c11104a.f35909a, this.f35919b, this.f35930m, this.f35931n));
        this.f35933p = C18317d.a(c11104a.f35917i);
        this.f35934q = C17281c.a(C13135f.m51044a(c11104a.f35909a));
        this.f35935r = C17281c.a(C13139j.m51052a(c11104a.f35909a));
        this.f35936s = C13140m.m51054a(c11104a.f35910b);
        this.f35937t = C13141n.m51056a(c11104a.f35910b);
        this.f35938u = C17281c.a(SwipeProcessor_Factory.create(this.f35928k, this.f35933p, this.f35920c, this.f35919b, this.f35934q, this.f35935r, this.f35936s, this.f35937t));
        this.f35939v = C17281c.a(C13136g.m51046a(c11104a.f35909a));
    }

    public RecsEngine recsEngine() {
        return new RecsEngine(this.f35918a, (RecsRepository) this.f35928k.get(), (C10992i) this.f35922e.get(), (RecsLoader) this.f35932o.get(), (SwipeProcessor) this.f35938u.get(), (C8788l) this.f35921d.get(), (GlobalRecsConsumptionListenerRegistry) this.f35939v.get());
    }
}
