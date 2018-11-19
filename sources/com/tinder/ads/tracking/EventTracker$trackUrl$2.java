package com.tinder.ads.tracking;

import com.tinder.ads.tracking.EventTracker.Listener;
import kotlin.Metadata;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 7})
final class EventTracker$trackUrl$2 implements Action0 {
    final /* synthetic */ String $url;
    final /* synthetic */ EventTracker this$0;

    EventTracker$trackUrl$2(EventTracker eventTracker, String str) {
        this.this$0 = eventTracker;
        this.$url = str;
    }

    public final void call() {
        Listener listener = this.this$0.getListener();
        if (listener != null) {
            listener.onUrlTracked(this.$url);
        }
    }
}
