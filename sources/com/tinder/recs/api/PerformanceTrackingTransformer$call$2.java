package com.tinder.recs.api;

import com.tinder.api.response.RecsResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import retrofit2.Response;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "httpResponse", "Lretrofit2/Response;", "Lcom/tinder/api/response/RecsResponse;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
final class PerformanceTrackingTransformer$call$2<T> implements Action1<Response<RecsResponse>> {
    final /* synthetic */ PerformanceTrackingTransformer this$0;

    PerformanceTrackingTransformer$call$2(PerformanceTrackingTransformer performanceTrackingTransformer) {
        this.this$0 = performanceTrackingTransformer;
    }

    public final void call(Response<RecsResponse> response) {
        this.this$0.recsEvent.b(PerformanceTrackingTransformer.GET_RECS_TIMER_KEY);
        PerformanceTrackingTransformer performanceTrackingTransformer = this.this$0;
        String access$getGET_RECS_TIMER_KEY$cp = PerformanceTrackingTransformer.GET_RECS_TIMER_KEY;
        C2668g.a(response, "httpResponse");
        performanceTrackingTransformer.fireRecsV2PerformanceEvent(access$getGET_RECS_TIMER_KEY$cp, response);
    }
}
