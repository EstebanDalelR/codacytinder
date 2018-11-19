package com.tinder.addy;

import com.tinder.addy.cache.AdQueue;
import com.tinder.addy.cache.C7295a;
import com.tinder.addy.cache.ExpiringAdQueue;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.p494a.p496b.C19397a;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0003\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0003-./B/\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eJ\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\u0006\u0010\u001a\u001a\u00020\u0012J\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019J\u0006\u0010\u001c\u001a\u00020\u0012J\u0006\u0010\u001d\u001a\u00020\u0012J\b\u0010\u001e\u001a\u00020\u0012H\u0002J\u0006\u0010\u001f\u001a\u00020\nJ\u0006\u0010 \u001a\u00020\nJ\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007J\u0010\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u0019H\u0002J\u0018\u0010$\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u0016H\u0002J\u000e\u0010)\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eJ\u0006\u0010*\u001a\u00020\u0012J\u0006\u0010+\u001a\u00020\u0012J\u0006\u0010,\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/tinder/addy/AdAggregator;", "", "adQueue", "Lcom/tinder/addy/cache/AdQueue;", "loaderBroker", "Lcom/tinder/addy/LoaderBroker;", "postFetchInterceptors", "", "Lcom/tinder/addy/AdAggregator$PostLoadInterceptor;", "enabled", "", "(Lcom/tinder/addy/cache/AdQueue;Lcom/tinder/addy/LoaderBroker;Ljava/util/Set;Z)V", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/tinder/addy/AdAggregator$Listener;", "loaderSubscription", "Lrx/Subscription;", "addListener", "", "listener", "addLoader", "loader", "Lcom/tinder/addy/AdLoader;", "ads", "", "Lcom/tinder/addy/Ad;", "clearQueue", "consumeAd", "disable", "enable", "fetchForNextSource", "hasAdsAvailable", "isBuffering", "loaders", "notifyAdAdded", "ad", "notifyAdFailed", "throwable", "", "notifyAdRequestSent", "source", "removeListener", "shutdown", "startBuffering", "stopBuffering", "Builder", "Listener", "PostLoadInterceptor", "addy_release"}, k = 1, mv = {1, 1, 10})
public final class AdAggregator {
    /* renamed from: a */
    private final CopyOnWriteArraySet<Listener> f22712a;
    /* renamed from: b */
    private Subscription f22713b;
    /* renamed from: c */
    private final AdQueue f22714c;
    /* renamed from: d */
    private final C6183b f22715d;
    /* renamed from: e */
    private final Set<PostLoadInterceptor> f22716e;
    /* renamed from: f */
    private boolean f22717f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\f"}, d2 = {"Lcom/tinder/addy/AdAggregator$Listener;", "", "onAdAdded", "", "ad", "Lcom/tinder/addy/Ad;", "onAdRequestFailed", "adLoader", "Lcom/tinder/addy/AdLoader;", "exception", "", "onAdRequestSent", "addy_release"}, k = 1, mv = {1, 1, 10})
    public interface Listener {
        void onAdAdded(@NotNull Ad ad);

        void onAdRequestFailed(@NotNull AdLoader adLoader, @NotNull Throwable th);

        void onAdRequestSent(@NotNull AdLoader adLoader);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/tinder/addy/AdAggregator$PostLoadInterceptor;", "", "intercept", "Lcom/tinder/addy/Ad;", "ad", "addy_release"}, k = 1, mv = {1, 1, 10})
    public interface PostLoadInterceptor {
        @NotNull
        Ad intercept(@NotNull Ad ad);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/addy/AdAggregator$Builder;", "", "addy", "Lcom/tinder/addy/Addy;", "(Lcom/tinder/addy/Addy;)V", "adQueue", "Lcom/tinder/addy/cache/AdQueue;", "enabled", "", "loaderBroker", "Lcom/tinder/addy/LoaderBroker;", "postLoaderInterceptors", "", "Lcom/tinder/addy/AdAggregator$PostLoadInterceptor;", "addPostLoadInterceptor", "interceptor", "build", "Lcom/tinder/addy/AdAggregator;", "addy_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.addy.AdAggregator$a */
    public static final class C6178a {
        /* renamed from: a */
        private final Set<PostLoadInterceptor> f22707a = ((Set) new LinkedHashSet());
        /* renamed from: b */
        private final AdQueue f22708b = ((AdQueue) new ExpiringAdQueue(new C7295a()));
        /* renamed from: c */
        private final C6183b f22709c = new C6183b();
        /* renamed from: d */
        private boolean f22710d = true;
        /* renamed from: e */
        private final Addy f22711e;

        public C6178a(@NotNull Addy addy) {
            C2668g.b(addy, "addy");
            this.f22711e = addy;
        }

        @NotNull
        /* renamed from: a */
        public final C6178a m26751a(@NotNull PostLoadInterceptor postLoadInterceptor) {
            C2668g.b(postLoadInterceptor, "interceptor");
            this.f22707a.add(postLoadInterceptor);
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final AdAggregator m26752a() {
            AdAggregator adAggregator = new AdAggregator(this.f22708b, this.f22709c, C19301m.n(this.f22707a), this.f22710d);
            this.f22711e.m26781a(adAggregator);
            return adAggregator;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Observable;", "Lcom/tinder/addy/Ad;", "kotlin.jvm.PlatformType", "ad", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.addy.AdAggregator$b */
    static final class C7968b<T, R> implements Func1<T, Observable<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ AdAggregator f28578a;

        C7968b(AdAggregator adAggregator) {
            this.f28578a = adAggregator;
        }

        public /* synthetic */ Object call(Object obj) {
            return m33833a((Ad) obj);
        }

        /* renamed from: a */
        public final Observable<Ad> m33833a(final Ad ad) {
            if (this.f28578a.f22716e.isEmpty()) {
                return Observable.a(ad);
            }
            return Observable.a(this.f28578a.f22716e).k(new Func1<T, R>() {
                public /* synthetic */ Object call(Object obj) {
                    return m33832a((PostLoadInterceptor) obj);
                }

                @NotNull
                /* renamed from: a */
                public final Ad m33832a(PostLoadInterceptor postLoadInterceptor) {
                    Ad ad = ad;
                    C2668g.a(ad, "ad");
                    return postLoadInterceptor.intercept(ad);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.addy.AdAggregator$c */
    static final class C8116c implements Action0 {
        /* renamed from: a */
        final /* synthetic */ AdAggregator f29109a;
        /* renamed from: b */
        final /* synthetic */ AdLoader f29110b;

        C8116c(AdAggregator adAggregator, AdLoader adLoader) {
            this.f29109a = adAggregator;
            this.f29110b = adLoader;
        }

        public final void call() {
            this.f29109a.m26760b(this.f29110b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "ad", "Lcom/tinder/addy/Ad;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.addy.AdAggregator$d */
    static final class C8117d<T> implements Action1<Ad> {
        /* renamed from: a */
        final /* synthetic */ AdAggregator f29111a;

        C8117d(AdAggregator adAggregator) {
            this.f29111a = adAggregator;
        }

        public /* synthetic */ void call(Object obj) {
            m34524a((Ad) obj);
        }

        /* renamed from: a */
        public final void m34524a(Ad ad) {
            AdQueue b = this.f29111a.f22714c;
            C2668g.a(ad, "ad");
            b.add(ad);
            this.f29111a.m26754a(ad);
            this.f29111a.f22715d.m26788c();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.addy.AdAggregator$e */
    static final class C8118e<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ AdAggregator f29112a;
        /* renamed from: b */
        final /* synthetic */ AdLoader f29113b;

        C8118e(AdAggregator adAggregator, AdLoader adLoader) {
            this.f29112a = adAggregator;
            this.f29113b = adLoader;
        }

        public /* synthetic */ void call(Object obj) {
            m34525a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m34525a(Throwable th) {
            C0001a.c(th, "Failed to fetch ad for loader %s", new Object[]{this.f29113b});
            AdAggregator adAggregator = this.f29112a;
            AdLoader adLoader = this.f29113b;
            C2668g.a(th, "throwable");
            adAggregator.m26758a(adLoader, th);
            this.f29112a.m26763j();
        }
    }

    private AdAggregator(AdQueue adQueue, C6183b c6183b, Set<? extends PostLoadInterceptor> set, boolean z) {
        this.f22714c = adQueue;
        this.f22715d = c6183b;
        this.f22716e = set;
        this.f22717f = z;
        this.f22712a = new CopyOnWriteArraySet();
    }

    /* renamed from: a */
    public final void m26766a(@NotNull AdLoader adLoader) {
        C2668g.b(adLoader, "loader");
        this.f22715d.m26786a(adLoader);
    }

    /* renamed from: a */
    public final void m26764a() {
        if (this.f22717f) {
            Subscription subscription = this.f22713b;
            if (subscription == null || subscription.isUnsubscribed()) {
                m26763j();
                return;
            } else {
                C0001a.c("Already subscribed to Source Fetcher, waiting to hear back", new Object[0]);
                return;
            }
        }
        C0001a.c("Attempt to start buffering while AdsAggregator is disabled", new Object[0]);
    }

    /* renamed from: b */
    public final void m26767b() {
        Subscription subscription = this.f22713b;
        if (subscription != null) {
            subscription.unsubscribe();
        }
    }

    /* renamed from: c */
    public final void m26769c() {
        m26767b();
        m26775i();
        this.f22715d.m26787b();
    }

    /* renamed from: d */
    public final void m26770d() {
        this.f22717f = true;
    }

    /* renamed from: e */
    public final void m26771e() {
        this.f22717f = false;
        m26767b();
        this.f22714c.clear();
    }

    /* renamed from: f */
    public final boolean m26772f() {
        if (this.f22713b != null) {
            Subscription subscription = this.f22713b;
            if (subscription == null) {
                C2668g.a();
            }
            if (!subscription.isUnsubscribed()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final boolean m26773g() {
        return this.f22714c.isEmpty() ^ 1;
    }

    @Nullable
    /* renamed from: h */
    public final Ad m26774h() {
        return this.f22714c.poll();
    }

    /* renamed from: a */
    public final void m26765a(@NotNull Listener listener) {
        C2668g.b(listener, "listener");
        this.f22712a.add(listener);
    }

    /* renamed from: b */
    public final void m26768b(@NotNull Listener listener) {
        C2668g.b(listener, "listener");
        this.f22712a.remove(listener);
    }

    /* renamed from: i */
    public final void m26775i() {
        this.f22714c.clear();
    }

    /* renamed from: j */
    private final void m26763j() {
        AdLoader a = this.f22715d.m26785a();
        if (a != null) {
            this.f22713b = a.loadAd().b(new C7968b(this)).b(Schedulers.io()).a(C19397a.a()).b(new C8116c(this, a)).a(new C8117d(this), new C8118e(this, a));
        }
    }

    /* renamed from: a */
    private final void m26758a(AdLoader adLoader, Throwable th) {
        for (Listener onAdRequestFailed : this.f22712a) {
            onAdRequestFailed.onAdRequestFailed(adLoader, th);
        }
    }

    /* renamed from: a */
    private final void m26754a(Ad ad) {
        for (Listener onAdAdded : this.f22712a) {
            onAdAdded.onAdAdded(ad);
        }
    }

    /* renamed from: b */
    private final void m26760b(AdLoader adLoader) {
        for (Listener onAdRequestSent : this.f22712a) {
            onAdRequestSent.onAdRequestSent(adLoader);
        }
    }
}
