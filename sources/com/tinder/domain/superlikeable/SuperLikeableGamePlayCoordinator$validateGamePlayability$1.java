package com.tinder.domain.superlikeable;

import com.tinder.domain.superlikeable.model.SuperLikeableGame;
import java8.util.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import rx.Observable;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Observable;", "Lcom/tinder/domain/superlikeable/model/SuperLikeableGame;", "kotlin.jvm.PlatformType", "it", "Ljava8/util/Optional;", "call"}, k = 3, mv = {1, 1, 10})
final class SuperLikeableGamePlayCoordinator$validateGamePlayability$1<T, R> implements Func1<T, Observable<? extends R>> {
    final /* synthetic */ SuperLikeableGamePlayCoordinator this$0;

    SuperLikeableGamePlayCoordinator$validateGamePlayability$1(SuperLikeableGamePlayCoordinator superLikeableGamePlayCoordinator) {
        this.this$0 = superLikeableGamePlayCoordinator;
    }

    public final Observable<SuperLikeableGame> call(Optional<SuperLikeableGame> optional) {
        C2668g.a(optional, "it");
        if (optional.c()) {
            return Observable.a(optional.b());
        }
        this.this$0.logger.debug("Game is not playable.");
        this.this$0.endGame();
        return Observable.c();
    }
}
