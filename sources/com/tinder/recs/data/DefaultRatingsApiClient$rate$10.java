package com.tinder.recs.data;

import com.tinder.api.model.rating.PassRatingResponse;
import com.tinder.api.request.PassRatingRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import retrofit2.Response;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "passRatingResponse", "Lretrofit2/Response;", "Lcom/tinder/api/model/rating/PassRatingResponse;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
final class DefaultRatingsApiClient$rate$10<T> implements Action1<Response<PassRatingResponse>> {
    final /* synthetic */ PassRatingRequest $request;
    final /* synthetic */ DefaultRatingsApiClient this$0;

    DefaultRatingsApiClient$rate$10(DefaultRatingsApiClient defaultRatingsApiClient, PassRatingRequest passRatingRequest) {
        this.this$0 = defaultRatingsApiClient;
        this.$request = passRatingRequest;
    }

    public final void call(Response<PassRatingResponse> response) {
        String recId = this.$request.recId();
        C2668g.a(recId, "request.recId()");
        response = response.raw();
        C2668g.a(response, "passRatingResponse.raw()");
        this.this$0.fireRecsPerformanceEvent("PASS_TIMER_KEY", recId, response);
    }
}
