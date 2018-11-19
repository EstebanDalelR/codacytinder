package com.tinder.ads.tracking;

import java.util.List;
import kotlin.Metadata;
import rx.Observable;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Observable;", "Lcom/tinder/ads/tracking/TrackingUrl;", "kotlin.jvm.PlatformType", "it", "", "call"}, k = 3, mv = {1, 1, 7})
final class EventTracker$trackEvent$2<T, R> implements Func1<T, Observable<? extends R>> {
    public static final EventTracker$trackEvent$2 INSTANCE = new EventTracker$trackEvent$2();

    EventTracker$trackEvent$2() {
    }

    public final Observable<TrackingUrl> call(List<TrackingUrl> list) {
        return Observable.a(list);
    }
}
