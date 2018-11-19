package com.tinder.ads.tracking;

import com.tinder.ads.tracking.EventTracker.Listener;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 7})
final class EventTracker$trackUrl$3<T> implements Action1<Throwable> {
    final /* synthetic */ String $url;
    final /* synthetic */ EventTracker this$0;

    EventTracker$trackUrl$3(EventTracker eventTracker, String str) {
        this.this$0 = eventTracker;
        this.$url = str;
    }

    public final void call(Throwable th) {
        Listener listener = this.this$0.getListener();
        if (listener != null) {
            String str = this.$url;
            C2668g.a(th, "it");
            listener.onUrlTrackFailed(str, th);
        }
    }
}
