package com.tinder.recs.api;

import kotlin.Metadata;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
final class PerformanceTrackingTransformer$call$1 implements Action0 {
    final /* synthetic */ PerformanceTrackingTransformer this$0;

    PerformanceTrackingTransformer$call$1(PerformanceTrackingTransformer performanceTrackingTransformer) {
        this.this$0 = performanceTrackingTransformer;
    }

    public final void call() {
        this.this$0.recsEvent.a(PerformanceTrackingTransformer.GET_RECS_TIMER_KEY);
    }
}
