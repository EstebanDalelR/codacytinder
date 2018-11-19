package com.tinder.ads.tracking;

import kotlin.C15813i;
import kotlin.Metadata;
import p000a.p001a.C0001a;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "call", "(Lkotlin/Unit;)V"}, k = 3, mv = {1, 1, 7})
final class EventTracker$trackEvent$4<T> implements Action1<C15813i> {
    final /* synthetic */ TrackingEvent $trackingEvent;

    EventTracker$trackEvent$4(TrackingEvent trackingEvent) {
        this.$trackingEvent = trackingEvent;
    }

    public final void call(C15813i c15813i) {
        c15813i = new StringBuilder();
        c15813i.append("Tracked URLs for event: ");
        c15813i.append(this.$trackingEvent);
        C0001a.b(c15813i.toString(), new Object[0]);
    }
}
