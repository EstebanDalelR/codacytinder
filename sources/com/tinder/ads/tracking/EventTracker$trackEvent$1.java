package com.tinder.ads.tracking;

import com.tinder.ads.tracking.EventTracker.TrackingUrlFilter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0004*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/tinder/ads/tracking/TrackingUrl;", "it", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 7})
final class EventTracker$trackEvent$1<T, R> implements Func1<T, R> {
    final /* synthetic */ EventTracker this$0;

    EventTracker$trackEvent$1(EventTracker eventTracker) {
        this.this$0 = eventTracker;
    }

    @NotNull
    public final List<TrackingUrl> call(List<TrackingUrl> list) {
        TrackingUrlFilter access$getTrackingUrlFilter$p = this.this$0.trackingUrlFilter;
        PingStore access$getPingStore$p = this.this$0.pingStore;
        C2668g.a(list, "it");
        return access$getTrackingUrlFilter$p.filterTrackingUrls(access$getPingStore$p, list);
    }
}
