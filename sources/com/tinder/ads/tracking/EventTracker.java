package com.tinder.ads.tracking;

import com.tinder.ads.Ad;
import com.tinder.ads.Ad.AdType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import okhttp3.C17692o;
import okhttp3.C17692o.C15961a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u001a\u001b\u001cB'\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001a\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/tinder/ads/tracking/EventTracker;", "", "client", "Lcom/tinder/ads/tracking/TrackingClient;", "pingStore", "Lcom/tinder/ads/tracking/PingStore;", "factoryRegistry", "Lcom/tinder/ads/tracking/TrackingUrlFactoryRegistry;", "trackingUrlFilter", "Lcom/tinder/ads/tracking/EventTracker$TrackingUrlFilter;", "(Lcom/tinder/ads/tracking/TrackingClient;Lcom/tinder/ads/tracking/PingStore;Lcom/tinder/ads/tracking/TrackingUrlFactoryRegistry;Lcom/tinder/ads/tracking/EventTracker$TrackingUrlFilter;)V", "listener", "Lcom/tinder/ads/tracking/EventTracker$Listener;", "getListener", "()Lcom/tinder/ads/tracking/EventTracker$Listener;", "setListener", "(Lcom/tinder/ads/tracking/EventTracker$Listener;)V", "trackEvent", "", "ad", "Lcom/tinder/ads/Ad;", "trackingEvent", "Lcom/tinder/ads/tracking/TrackingEvent;", "trackUrl", "trackingUrl", "Lcom/tinder/ads/tracking/TrackingUrl;", "Builder", "Listener", "TrackingUrlFilter", "tracking_release"}, k = 1, mv = {1, 1, 7})
public final class EventTracker {
    private final TrackingClient client;
    private final TrackingUrlFactoryRegistry factoryRegistry;
    @Nullable
    private Listener listener;
    private final PingStore pingStore;
    private final TrackingUrlFilter trackingUrlFilter;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/ads/tracking/EventTracker$Builder;", "", "()V", "factoryRegistry", "Lcom/tinder/ads/tracking/TrackingUrlFactoryRegistry;", "okHttpClient", "Lokhttp3/OkHttpClient;", "pingStore", "Lcom/tinder/ads/tracking/PingStore;", "trackingUrlFilter", "Lcom/tinder/ads/tracking/EventTracker$TrackingUrlFilter;", "build", "Lcom/tinder/ads/tracking/EventTracker;", "registerFactory", "adType", "Lcom/tinder/ads/Ad$AdType;", "factory", "Lcom/tinder/ads/tracking/TrackingUrlFactory;", "tracking_release"}, k = 1, mv = {1, 1, 7})
    public static final class Builder {
        private final TrackingUrlFactoryRegistry factoryRegistry = new TrackingUrlFactoryRegistry();
        private C17692o okHttpClient;
        private PingStore pingStore;
        private TrackingUrlFilter trackingUrlFilter;

        @NotNull
        public final Builder okHttpClient(@NotNull C17692o c17692o) {
            C2668g.b(c17692o, "okHttpClient");
            this.okHttpClient = c17692o;
            return this;
        }

        @NotNull
        public final Builder pingStore(@NotNull PingStore pingStore) {
            C2668g.b(pingStore, "pingStore");
            this.pingStore = pingStore;
            return this;
        }

        @NotNull
        public final Builder registerFactory(@NotNull AdType adType, @NotNull TrackingUrlFactory trackingUrlFactory) {
            C2668g.b(adType, "adType");
            C2668g.b(trackingUrlFactory, "factory");
            this.factoryRegistry.register(adType, trackingUrlFactory);
            return this;
        }

        @NotNull
        public final Builder trackingUrlFilter(@NotNull TrackingUrlFilter trackingUrlFilter) {
            C2668g.b(trackingUrlFilter, "trackingUrlFilter");
            this.trackingUrlFilter = trackingUrlFilter;
            return this;
        }

        @NotNull
        public final EventTracker build() {
            C17692o c17692o = this.okHttpClient;
            if (c17692o == null) {
                c17692o = new C15961a().b();
                C2668g.a(c17692o, "OkHttpClient.Builder().build()");
            }
            TrackingClient trackingClient = new TrackingClient(c17692o);
            PingStore pingStore = this.pingStore;
            if (pingStore == null) {
                pingStore = new MemoryPingStore();
            }
            TrackingUrlFactoryRegistry trackingUrlFactoryRegistry = this.factoryRegistry;
            TrackingUrlFilter trackingUrlFilter = this.trackingUrlFilter;
            if (trackingUrlFilter != null) {
                return new EventTracker(trackingClient, pingStore, trackingUrlFactoryRegistry, trackingUrlFilter);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lcom/tinder/ads/tracking/EventTracker$Listener;", "", "onUrlTrackFailed", "", "url", "", "throwable", "", "onUrlTracked", "tracking_release"}, k = 1, mv = {1, 1, 7})
    public interface Listener {
        void onUrlTrackFailed(@NotNull String str, @NotNull Throwable th);

        void onUrlTracked(@NotNull String str);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\b"}, d2 = {"Lcom/tinder/ads/tracking/EventTracker$TrackingUrlFilter;", "", "filterTrackingUrls", "", "Lcom/tinder/ads/tracking/TrackingUrl;", "pingStore", "Lcom/tinder/ads/tracking/PingStore;", "trackingUrls", "tracking_release"}, k = 1, mv = {1, 1, 7})
    public interface TrackingUrlFilter {
        @NotNull
        List<TrackingUrl> filterTrackingUrls(@NotNull PingStore pingStore, @NotNull List<TrackingUrl> list);
    }

    public EventTracker(@NotNull TrackingClient trackingClient, @NotNull PingStore pingStore, @NotNull TrackingUrlFactoryRegistry trackingUrlFactoryRegistry, @NotNull TrackingUrlFilter trackingUrlFilter) {
        C2668g.b(trackingClient, "client");
        C2668g.b(pingStore, "pingStore");
        C2668g.b(trackingUrlFactoryRegistry, "factoryRegistry");
        C2668g.b(trackingUrlFilter, "trackingUrlFilter");
        this.client = trackingClient;
        this.pingStore = pingStore;
        this.factoryRegistry = trackingUrlFactoryRegistry;
        this.trackingUrlFilter = trackingUrlFilter;
    }

    @Nullable
    public final Listener getListener() {
        return this.listener;
    }

    public final void setListener(@Nullable Listener listener) {
        this.listener = listener;
    }

    public final void trackEvent(@NotNull Ad<?> ad, @NotNull TrackingEvent trackingEvent) {
        C2668g.b(ad, "ad");
        C2668g.b(trackingEvent, "trackingEvent");
        TrackingUrlFactory trackingUrlFactory = this.factoryRegistry.get(ad.adType());
        if (trackingUrlFactory == null) {
            trackingEvent = new StringBuilder();
            trackingEvent.append("No TrackingUrlFactory registered for AdType ");
            trackingEvent.append(ad.adType());
            throw ((Throwable) new IllegalArgumentException(trackingEvent.toString().toString()));
        }
        List createTrackingUrls = trackingUrlFactory.createTrackingUrls(ad, trackingEvent);
        if (createTrackingUrls.isEmpty()) {
            trackingEvent = new StringBuilder();
            trackingEvent.append("No Tracking URLs found for Ad: ");
            trackingEvent.append(ad);
            C0001a.d(trackingEvent.toString(), new Object[null]);
            return;
        }
        Observable.a(createTrackingUrls).h().k(new EventTracker$trackEvent$1(this)).h(EventTracker$trackEvent$2.INSTANCE).k(new EventTracker$trackEvent$3(this)).a(new EventTracker$trackEvent$4(trackingEvent), new EventTracker$trackEvent$5(trackingEvent));
    }

    public final void trackUrl(@NotNull TrackingUrl trackingUrl) {
        C2668g.b(trackingUrl, "trackingUrl");
        String url = trackingUrl.getUrl();
        this.client.ping(trackingUrl.getUrl()).b(url).b(Schedulers.io()).c(new EventTracker$trackUrl$1(this)).a(new EventTracker$trackUrl$2(this, url), new EventTracker$trackUrl$3(this, url));
    }
}
