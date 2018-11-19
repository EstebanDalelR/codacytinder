package com.tinder.ads.tracking;

import com.tinder.ads.tracking.EventTracker.TrackingUrlFilter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¨\u0006\t"}, d2 = {"Lcom/tinder/ads/tracking/UniqueTrackingUrlFilter;", "Lcom/tinder/ads/tracking/EventTracker$TrackingUrlFilter;", "()V", "filterTrackingUrls", "", "Lcom/tinder/ads/tracking/TrackingUrl;", "pingStore", "Lcom/tinder/ads/tracking/PingStore;", "trackingUrls", "tracking_release"}, k = 1, mv = {1, 1, 7})
public final class UniqueTrackingUrlFilter implements TrackingUrlFilter {
    @NotNull
    public List<TrackingUrl> filterTrackingUrls(@NotNull PingStore pingStore, @NotNull List<TrackingUrl> list) {
        C2668g.b(pingStore, "pingStore");
        C2668g.b(list, "trackingUrls");
        pingStore = Observable.a(list).f(new UniqueTrackingUrlFilter$filterTrackingUrls$1(pingStore)).v().u().a();
        C2668g.a(pingStore, "Observable.from(tracking…                 .first()");
        return (List) pingStore;
    }
}
