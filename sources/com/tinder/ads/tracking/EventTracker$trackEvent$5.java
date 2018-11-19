package com.tinder.ads.tracking;

import kotlin.Metadata;
import p000a.p001a.C0001a;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 7})
final class EventTracker$trackEvent$5<T> implements Action1<Throwable> {
    final /* synthetic */ TrackingEvent $trackingEvent;

    EventTracker$trackEvent$5(TrackingEvent trackingEvent) {
        this.$trackingEvent = trackingEvent;
    }

    public final void call(Throwable th) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Failed to track URLs for event ");
        stringBuilder.append(this.$trackingEvent);
        C0001a.c(th, stringBuilder.toString(), new Object[0]);
    }
}
