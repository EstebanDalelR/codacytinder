package com.tinder.recs.data;

import com.tinder.api.model.rating.LikeRatingResponse;
import com.tinder.domain.recs.model.RatingResult;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012#\u0010\u0004\u001a\u001f\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00050\u00050\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lrx/Observable;", "Lcom/tinder/domain/recs/model/RatingResult;", "kotlin.jvm.PlatformType", "p1", "Lcom/tinder/api/model/rating/LikeRatingResponse;", "Lkotlin/ParameterName;", "name", "likeRatingResponse", "invoke"}, k = 3, mv = {1, 1, 10})
final class DefaultRatingsApiClient$rate$4 extends FunctionReference implements Function1<Observable<LikeRatingResponse>, Observable<RatingResult>> {
    DefaultRatingsApiClient$rate$4(RatingResultAdapter ratingResultAdapter) {
        super(1, ratingResultAdapter);
    }

    public final String getName() {
        return "fromLikeRatingResponse";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.m59860a(RatingResultAdapter.class);
    }

    public final String getSignature() {
        return "fromLikeRatingResponse(Lrx/Observable;)Lrx/Observable;";
    }

    @NotNull
    public final Observable<RatingResult> invoke(@NotNull Observable<LikeRatingResponse> observable) {
        C2668g.b(observable, "p1");
        return ((RatingResultAdapter) this.receiver).fromLikeRatingResponse(observable);
    }
}
