package com.tinder.recs.data;

import com.tinder.api.model.rating.SuperLikeRatingResponse;
import com.tinder.api.request.SuperLikeRatingRequest;
import com.tinder.domain.recs.model.Swipe;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import okhttp3.C15966s;
import retrofit2.Response;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "response", "Lretrofit2/Response;", "Lcom/tinder/api/model/rating/SuperLikeRatingResponse;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
final class DefaultRatingsApiClient$rate$6<T> implements Action1<Response<SuperLikeRatingResponse>> {
    final /* synthetic */ SuperLikeRatingRequest $request;
    final /* synthetic */ Swipe $swipe;
    final /* synthetic */ DefaultRatingsApiClient this$0;

    DefaultRatingsApiClient$rate$6(DefaultRatingsApiClient defaultRatingsApiClient, SuperLikeRatingRequest superLikeRatingRequest, Swipe swipe) {
        this.this$0 = defaultRatingsApiClient;
        this.$request = superLikeRatingRequest;
        this.$swipe = swipe;
    }

    public final void call(Response<SuperLikeRatingResponse> response) {
        String recId = this.$request.recId();
        C2668g.a(recId, "request.recId()");
        C15966s raw = response.raw();
        C2668g.a(raw, "response.raw()");
        this.this$0.fireRecsPerformanceEvent("SUPER_LIKE_TIMER_KEY", recId, raw);
        DefaultRatingsApiClient defaultRatingsApiClient = this.this$0;
        response = response.body();
        if (response == null) {
            C2668g.a();
        }
        C2668g.a(response, "response.body()!!");
        defaultRatingsApiClient.handleSuperLikeRatingResponse((SuperLikeRatingResponse) response, this.$swipe);
    }
}
