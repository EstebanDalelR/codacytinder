package com.tinder.addy.tracker;

import com.tinder.addy.Ad;
import com.tinder.addy.Ad.AdType;
import com.tinder.addy.AdAggregator.PostLoadInterceptor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/addy/tracker/TrackingUrlPostLoaderInterceptor;", "Lcom/tinder/addy/AdAggregator$PostLoadInterceptor;", "repository", "Lcom/tinder/addy/tracker/TrackingUrlRepository;", "parserForAdType", "", "Lcom/tinder/addy/Ad$AdType;", "Lcom/tinder/addy/tracker/TrackingUrlParser;", "(Lcom/tinder/addy/tracker/TrackingUrlRepository;Ljava/util/Map;)V", "intercept", "Lcom/tinder/addy/Ad;", "ad", "addy_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.addy.tracker.a */
public final class C7305a implements PostLoadInterceptor {
    /* renamed from: a */
    private final TrackingUrlRepository f26423a;
    /* renamed from: b */
    private final Map<AdType, TrackingUrlParser> f26424b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "call", "com/tinder/addy/tracker/TrackingUrlPostLoaderInterceptor$intercept$1$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.addy.tracker.a$a */
    static final class C8130a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C7305a f29134a;
        /* renamed from: b */
        final /* synthetic */ Ad f29135b;

        C8130a(C7305a c7305a, Ad ad) {
            this.f29134a = c7305a;
            this.f29135b = ad;
        }

        public final void call() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Inserted Tracking URLs for ad ");
            stringBuilder.append(this.f29135b.id());
            C0001a.b(stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call", "com/tinder/addy/tracker/TrackingUrlPostLoaderInterceptor$intercept$1$2"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.addy.tracker.a$b */
    static final class C8131b<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C7305a f29136a;
        /* renamed from: b */
        final /* synthetic */ Ad f29137b;

        C8131b(C7305a c7305a, Ad ad) {
            this.f29136a = c7305a;
            this.f29137b = ad;
        }

        public /* synthetic */ void call(Object obj) {
            m34536a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m34536a(Throwable th) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to insert Tracking URLs for ad ");
            stringBuilder.append(this.f29137b.id());
            C0001a.c(th, stringBuilder.toString(), new Object[0]);
        }
    }

    public C7305a(@NotNull TrackingUrlRepository trackingUrlRepository, @NotNull Map<AdType, ? extends TrackingUrlParser> map) {
        C2668g.b(trackingUrlRepository, "repository");
        C2668g.b(map, "parserForAdType");
        this.f26423a = trackingUrlRepository;
        this.f26424b = map;
    }

    @NotNull
    public Ad intercept(@NotNull Ad ad) {
        C2668g.b(ad, "ad");
        TrackingUrlParser trackingUrlParser = (TrackingUrlParser) this.f26424b.get(ad.adType());
        if (trackingUrlParser != null) {
            this.f26423a.insertTrackingUrls(trackingUrlParser.parseTrackingUrls(ad)).b(Schedulers.io()).a(new C8130a(this, ad), new C8131b(this, ad));
        }
        return ad;
    }
}
