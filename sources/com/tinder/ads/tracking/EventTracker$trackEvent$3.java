package com.tinder.ads.tracking;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/ads/tracking/TrackingUrl;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 7})
final class EventTracker$trackEvent$3<T, R> implements Func1<T, R> {
    final /* synthetic */ EventTracker this$0;

    EventTracker$trackEvent$3(EventTracker eventTracker) {
        this.this$0 = eventTracker;
    }

    public final void call(TrackingUrl trackingUrl) {
        EventTracker eventTracker = this.this$0;
        C2668g.a(trackingUrl, "it");
        eventTracker.trackUrl(trackingUrl);
    }
}
