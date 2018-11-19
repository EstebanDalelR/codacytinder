package com.tinder.domain.recs.engine.dispatcher;

import com.tinder.domain.recs.model.Swipe;
import com.tinder.domain.recs.model.SwipeRatingStatus.Ended;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Single;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Single;", "Lcom/tinder/domain/recs/model/SwipeRatingStatus$Ended;", "it", "Lcom/tinder/domain/recs/model/Swipe;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 9})
/* renamed from: com.tinder.domain.recs.engine.dispatcher.NonBlockingSwipeDispatcher$resume$fetchRatingResultSubscription$1 */
final class C13161x85eb282c<T, R> implements Func1<T, Single<? extends R>> {
    final /* synthetic */ NonBlockingSwipeDispatcher this$0;

    C13161x85eb282c(NonBlockingSwipeDispatcher nonBlockingSwipeDispatcher) {
        this.this$0 = nonBlockingSwipeDispatcher;
    }

    @NotNull
    public final Single<Ended> call(Swipe swipe) {
        RatingProcessor access$getRatingProcessor$p = this.this$0.ratingProcessor;
        C2668g.a(swipe, "it");
        return access$getRatingProcessor$p.rate(swipe);
    }
}
