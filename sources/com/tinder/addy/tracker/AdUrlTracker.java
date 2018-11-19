package com.tinder.addy.tracker;

import com.tinder.addy.Ad.AdType;
import com.tinder.addy.ping.C6188a;
import com.tinder.addy.ping.C6189b;
import com.tinder.addy.ping.PingRepository;
import com.tinder.addy.tracker.TrackingUrl.EventType;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import okhttp3.C17692o;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Completable;
import rx.Observable;
import rx.Single;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u000267BE\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012J\u0014\u0010\u001a\u001a\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cJ\u000e\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\nJ\r\u0010 \u001a\u00020\u0007H\u0000¢\u0006\u0002\b!J \u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u001c0#2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cJ\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020)J\u0016\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u000eJ\u000e\u0010-\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012J\u0016\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202J\u0016\u0010.\u001a\u00020\u00182\u0006\u00103\u001a\u0002042\u0006\u00101\u001a\u000202J\u0010\u00105\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001dH\u0002R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0004¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/tinder/addy/tracker/AdUrlTracker;", "", "pingClient", "Lcom/tinder/addy/ping/PingClient;", "trackingUrlRepository", "Lcom/tinder/addy/tracker/TrackingUrlRepository;", "pingRepository", "Lcom/tinder/addy/ping/PingRepository;", "trackingUrlsDecorators", "", "Lcom/tinder/addy/tracker/TrackingUrlsDecorator;", "parsersForAdType", "", "Lcom/tinder/addy/Ad$AdType;", "Lcom/tinder/addy/tracker/TrackingUrlParser;", "(Lcom/tinder/addy/ping/PingClient;Lcom/tinder/addy/tracker/TrackingUrlRepository;Lcom/tinder/addy/ping/PingRepository;Ljava/util/Set;Ljava/util/Map;)V", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/tinder/addy/tracker/AdUrlTracker$Listener;", "getParsersForAdType$addy_release", "()Ljava/util/Map;", "getTrackingUrlRepository$addy_release", "()Lcom/tinder/addy/tracker/TrackingUrlRepository;", "addListener", "", "listener", "addTrackingUrls", "trackingUrls", "", "Lcom/tinder/addy/tracker/TrackingUrl;", "addTrackingUrlsDecorator", "trackingUrlsDecorator", "getPingStore", "getPingStore$addy_release", "loadPings", "Lrx/Single;", "Lcom/tinder/addy/ping/Ping;", "ping", "Lrx/Completable;", "trackingUrl", "pingTimeMs", "", "registerTrackingUrlParser", "adType", "parser", "removeListener", "trackEvent", "ad", "Lcom/tinder/addy/Ad;", "eventType", "Lcom/tinder/addy/tracker/TrackingUrl$EventType;", "adId", "", "trackUrl", "Builder", "Listener", "addy_release"}, k = 1, mv = {1, 1, 10})
public final class AdUrlTracker {
    /* renamed from: a */
    private final CopyOnWriteArraySet<Listener> f22760a = new CopyOnWriteArraySet();
    /* renamed from: b */
    private final C6189b f22761b;
    @NotNull
    /* renamed from: c */
    private final TrackingUrlRepository f22762c;
    /* renamed from: d */
    private final PingRepository f22763d;
    /* renamed from: e */
    private final Set<TrackingUrlsDecorator> f22764e;
    @NotNull
    /* renamed from: f */
    private final Map<AdType, TrackingUrlParser> f22765f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/tinder/addy/tracker/AdUrlTracker$Listener;", "", "onUrlTrackFailed", "", "url", "", "throwable", "", "onUrlTracked", "trackingUrl", "Lcom/tinder/addy/tracker/TrackingUrl;", "addy_release"}, k = 1, mv = {1, 1, 10})
    public interface Listener {
        void onUrlTrackFailed(@NotNull String str, @NotNull Throwable th);

        void onUrlTracked(@NotNull TrackingUrl trackingUrl);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u0014J\u0016\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\bJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/tinder/addy/tracker/AdUrlTracker$Builder;", "", "()V", "okHttpClient", "Lokhttp3/OkHttpClient;", "parsersForAdType", "", "Lcom/tinder/addy/Ad$AdType;", "Lcom/tinder/addy/tracker/TrackingUrlParser;", "pingRepository", "Lcom/tinder/addy/ping/PingRepository;", "trackingUrlRepository", "Lcom/tinder/addy/tracker/TrackingUrlRepository;", "trackingUrlsDecorators", "", "Lcom/tinder/addy/tracker/TrackingUrlsDecorator;", "addTrackingUrlsDecorator", "trackingUrlsDecorator", "build", "Lcom/tinder/addy/tracker/AdUrlTracker;", "pingRepository$addy_release", "registerParser", "adType", "parser", "trackingUrlRepository$addy_release", "addy_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.addy.tracker.AdUrlTracker$a */
    public static final class C6192a {
        /* renamed from: a */
        private final Set<TrackingUrlsDecorator> f22755a = new LinkedHashSet();
        /* renamed from: b */
        private final Map<AdType, TrackingUrlParser> f22756b = new LinkedHashMap();
        /* renamed from: c */
        private C17692o f22757c;
        /* renamed from: d */
        private TrackingUrlRepository f22758d;
        /* renamed from: e */
        private PingRepository f22759e;

        @NotNull
        /* renamed from: a */
        public final C6192a m26817a(@NotNull C17692o c17692o) {
            C2668g.b(c17692o, "okHttpClient");
            this.f22757c = c17692o;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C6192a m26815a(@NotNull TrackingUrlRepository trackingUrlRepository) {
            C2668g.b(trackingUrlRepository, "trackingUrlRepository");
            this.f22758d = trackingUrlRepository;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C6192a m26814a(@NotNull PingRepository pingRepository) {
            C2668g.b(pingRepository, "pingRepository");
            this.f22759e = pingRepository;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C6192a m26816a(@NotNull TrackingUrlsDecorator trackingUrlsDecorator) {
            C2668g.b(trackingUrlsDecorator, "trackingUrlsDecorator");
            this.f22755a.add(trackingUrlsDecorator);
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final AdUrlTracker m26818a() {
            C17692o c17692o = this.f22757c;
            if (c17692o == null) {
                C2668g.b("okHttpClient");
            }
            if (c17692o == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            C6189b c6189b = new C6189b(c17692o);
            TrackingUrlRepository trackingUrlRepository = this.f22758d;
            if (trackingUrlRepository == null) {
                C2668g.b("trackingUrlRepository");
            }
            if (trackingUrlRepository == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            PingRepository pingRepository = this.f22759e;
            if (pingRepository == null) {
                C2668g.b("pingRepository");
            }
            if (pingRepository != null) {
                return new AdUrlTracker(c6189b, trackingUrlRepository, pingRepository, this.f22755a, this.f22756b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Single;", "", "Lcom/tinder/addy/tracker/TrackingUrl;", "kotlin.jvm.PlatformType", "trackingUrls", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.addy.tracker.AdUrlTracker$d */
    static final class C7979d<T, R> implements Func1<T, Single<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ AdUrlTracker f28593a;

        C7979d(AdUrlTracker adUrlTracker) {
            this.f28593a = adUrlTracker;
        }

        public /* synthetic */ Object call(Object obj) {
            return m33860a((List) obj);
        }

        /* renamed from: a */
        public final Single<List<TrackingUrl>> m33860a(List<TrackingUrl> list) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("got ");
            stringBuilder.append(list);
            C0001a.b(stringBuilder.toString(), new Object[0]);
            if (this.f28593a.f22764e.isEmpty()) {
                return Single.a(list);
            }
            return Observable.a(this.f28593a.f22764e).a(list, new Func2<R, T, R>() {
                public /* synthetic */ Object call(Object obj, Object obj2) {
                    return m33859a((List) obj, (TrackingUrlsDecorator) obj2);
                }

                @NotNull
                /* renamed from: a */
                public final List<TrackingUrl> m33859a(@NotNull List<TrackingUrl> list, @NotNull TrackingUrlsDecorator trackingUrlsDecorator) {
                    C2668g.b(list, "decoratedUrls");
                    C2668g.b(trackingUrlsDecorator, "decorator");
                    return trackingUrlsDecorator.decorate(list, this.f28593a);
                }
            }).a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Observable;", "Lcom/tinder/addy/tracker/TrackingUrl;", "kotlin.jvm.PlatformType", "it", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.addy.tracker.AdUrlTracker$e */
    static final class C7980e<T, R> implements Func1<T, Observable<? extends R>> {
        /* renamed from: a */
        public static final C7980e f28594a = new C7980e();

        C7980e() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m33861a((List) obj);
        }

        /* renamed from: a */
        public final Observable<TrackingUrl> m33861a(List<TrackingUrl> list) {
            return Observable.a(list);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "it", "Lcom/tinder/addy/tracker/TrackingUrl;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.addy.tracker.AdUrlTracker$g */
    static final class C7981g<T, R> implements Func1<TrackingUrl, Completable> {
        /* renamed from: a */
        final /* synthetic */ AdUrlTracker f28595a;

        C7981g(AdUrlTracker adUrlTracker) {
            this.f28595a = adUrlTracker;
        }

        public /* synthetic */ Object call(Object obj) {
            return m33862a((TrackingUrl) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Completable m33862a(TrackingUrl trackingUrl) {
            AdUrlTracker adUrlTracker = this.f28595a;
            C2668g.a(trackingUrl, "it");
            return adUrlTracker.m26821a(trackingUrl);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.addy.tracker.AdUrlTracker$m */
    static final class C7982m<T, R> implements Func1<String, Completable> {
        /* renamed from: a */
        final /* synthetic */ AdUrlTracker f28596a;
        /* renamed from: b */
        final /* synthetic */ TrackingUrl f28597b;

        C7982m(AdUrlTracker adUrlTracker, TrackingUrl trackingUrl) {
            this.f28596a = adUrlTracker;
            this.f28597b = trackingUrl;
        }

        public /* synthetic */ Object call(Object obj) {
            return m33863a((String) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Completable m33863a(String str) {
            return this.f28596a.f22763d.createPing(this.f28597b, System.currentTimeMillis());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.addy.tracker.AdUrlTracker$b */
    static final class C8122b implements Action0 {
        /* renamed from: a */
        final /* synthetic */ List f29120a;

        C8122b(List list) {
            this.f29120a = list;
        }

        public final void call() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Inserted Tracking URLs ");
            stringBuilder.append(this.f29120a);
            C0001a.b(stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.addy.tracker.AdUrlTracker$c */
    static final class C8123c<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ List f29121a;

        C8123c(List list) {
            this.f29121a = list;
        }

        public /* synthetic */ void call(Object obj) {
            m34529a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m34529a(Throwable th) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to insert Tracking URLs ");
            stringBuilder.append(this.f29121a);
            C0001a.c(th, stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/addy/tracker/TrackingUrl;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.addy.tracker.AdUrlTracker$f */
    static final class C8124f<T> implements Action1<TrackingUrl> {
        /* renamed from: a */
        public static final C8124f f29122a = new C8124f();

        C8124f() {
        }

        public /* synthetic */ void call(Object obj) {
            m34530a((TrackingUrl) obj);
        }

        /* renamed from: a */
        public final void m34530a(TrackingUrl trackingUrl) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Pinging ");
            stringBuilder.append(trackingUrl.m26832c());
            C0001a.b(stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/addy/tracker/TrackingUrl;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.addy.tracker.AdUrlTracker$h */
    static final class C8125h<T> implements Action1<TrackingUrl> {
        /* renamed from: a */
        final /* synthetic */ EventType f29123a;
        /* renamed from: b */
        final /* synthetic */ String f29124b;

        C8125h(EventType eventType, String str) {
            this.f29123a = eventType;
            this.f29124b = str;
        }

        public /* synthetic */ void call(Object obj) {
            m34531a((TrackingUrl) obj);
        }

        /* renamed from: a */
        public final void m34531a(TrackingUrl trackingUrl) {
            trackingUrl = new StringBuilder();
            trackingUrl.append("Tracked ");
            trackingUrl.append(this.f29123a);
            trackingUrl.append("s for ad ");
            trackingUrl.append(this.f29124b);
            C0001a.b(trackingUrl.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.addy.tracker.AdUrlTracker$i */
    static final class C8126i<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ EventType f29125a;
        /* renamed from: b */
        final /* synthetic */ String f29126b;

        C8126i(EventType eventType, String str) {
            this.f29125a = eventType;
            this.f29126b = str;
        }

        public /* synthetic */ void call(Object obj) {
            m34532a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m34532a(Throwable th) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to track ");
            stringBuilder.append(this.f29125a);
            stringBuilder.append(" for ad ");
            stringBuilder.append(this.f29126b);
            C0001a.c(th, stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.addy.tracker.AdUrlTracker$j */
    static final class C8127j implements Action0 {
        /* renamed from: a */
        public static final C8127j f29127a = new C8127j();

        C8127j() {
        }

        public final void call() {
            C0001a.c("Tracking urls completed", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.addy.tracker.AdUrlTracker$k */
    static final class C8128k<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ AdUrlTracker f29128a;
        /* renamed from: b */
        final /* synthetic */ String f29129b;

        C8128k(AdUrlTracker adUrlTracker, String str) {
            this.f29128a = adUrlTracker;
            this.f29129b = str;
        }

        public /* synthetic */ void call(Object obj) {
            m34533a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m34533a(Throwable th) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to track URL ");
            stringBuilder.append(this.f29129b);
            C0001a.c(th, stringBuilder.toString(), new Object[0]);
            for (Listener listener : this.f29128a.f22760a) {
                String str = this.f29129b;
                C2668g.a(th, "error");
                listener.onUrlTrackFailed(str, th);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.addy.tracker.AdUrlTracker$l */
    static final class C8129l<T> implements Action1<String> {
        /* renamed from: a */
        final /* synthetic */ AdUrlTracker f29130a;
        /* renamed from: b */
        final /* synthetic */ String f29131b;
        /* renamed from: c */
        final /* synthetic */ TrackingUrl f29132c;

        C8129l(AdUrlTracker adUrlTracker, String str, TrackingUrl trackingUrl) {
            this.f29130a = adUrlTracker;
            this.f29131b = str;
            this.f29132c = trackingUrl;
        }

        public /* synthetic */ void call(Object obj) {
            m34534a((String) obj);
        }

        /* renamed from: a */
        public final void m34534a(String str) {
            for (Listener listener : this.f29130a.f22760a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("");
                stringBuilder.append(listener);
                stringBuilder.append(" Tracked URL ");
                stringBuilder.append(this.f29131b);
                C0001a.b(stringBuilder.toString(), new Object[0]);
                listener.onUrlTracked(this.f29132c);
            }
        }
    }

    public AdUrlTracker(@NotNull C6189b c6189b, @NotNull TrackingUrlRepository trackingUrlRepository, @NotNull PingRepository pingRepository, @NotNull Set<TrackingUrlsDecorator> set, @NotNull Map<AdType, TrackingUrlParser> map) {
        C2668g.b(c6189b, "pingClient");
        C2668g.b(trackingUrlRepository, "trackingUrlRepository");
        C2668g.b(pingRepository, "pingRepository");
        C2668g.b(set, "trackingUrlsDecorators");
        C2668g.b(map, "parsersForAdType");
        this.f22761b = c6189b;
        this.f22762c = trackingUrlRepository;
        this.f22763d = pingRepository;
        this.f22764e = set;
        this.f22765f = map;
    }

    @NotNull
    /* renamed from: a */
    public final TrackingUrlRepository m26824a() {
        return this.f22762c;
    }

    @NotNull
    /* renamed from: b */
    public final Map<AdType, TrackingUrlParser> m26828b() {
        return this.f22765f;
    }

    /* renamed from: a */
    public final void m26825a(@NotNull Listener listener) {
        C2668g.b(listener, "listener");
        this.f22760a.add(listener);
    }

    /* renamed from: a */
    public final void m26827a(@NotNull List<TrackingUrl> list) {
        C2668g.b(list, "trackingUrls");
        this.f22762c.insertTrackingUrls(list).a(new C8122b(list), new C8123c(list));
    }

    /* renamed from: a */
    public final void m26826a(@NotNull String str, @NotNull EventType eventType) {
        C2668g.b(str, "adId");
        C2668g.b(eventType, "eventType");
        this.f22762c.loadTrackingUrls(str, eventType).b(Schedulers.io()).a(Schedulers.io()).a(new C7979d(this)).b(C7980e.f28594a).b(C8124f.f29122a).i(new C7981g(this)).a(new C8125h(eventType, str), new C8126i(eventType, str), (Action0) C8127j.f29127a);
    }

    @NotNull
    /* renamed from: b */
    public final Single<List<C6188a>> m26829b(@NotNull List<TrackingUrl> list) {
        C2668g.b(list, "trackingUrls");
        return this.f22763d.loadLastPingForTrackingUrls(list);
    }

    /* renamed from: a */
    private final Completable m26821a(TrackingUrl trackingUrl) {
        String c = trackingUrl.m26832c();
        trackingUrl = this.f22761b.m26802a(trackingUrl.m26832c()).c(new C8128k(this, c)).b(c).d(new C8129l(this, c, trackingUrl)).c(new C7982m(this, trackingUrl));
        C2668g.a(trackingUrl, "pingClient.ping(tracking…          )\n            }");
        return trackingUrl;
    }
}
