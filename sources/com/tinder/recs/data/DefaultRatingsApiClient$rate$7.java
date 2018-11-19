package com.tinder.recs.data;

import com.tinder.api.model.rating.SuperLikeRatingResponse;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/api/model/rating/SuperLikeRatingResponse;", "it", "Lretrofit2/Response;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
final class DefaultRatingsApiClient$rate$7<T, R> implements Func1<T, R> {
    public static final DefaultRatingsApiClient$rate$7 INSTANCE = new DefaultRatingsApiClient$rate$7();

    DefaultRatingsApiClient$rate$7() {
    }

    @Nullable
    public final SuperLikeRatingResponse call(Response<SuperLikeRatingResponse> response) {
        return (SuperLikeRatingResponse) response.body();
    }
}
