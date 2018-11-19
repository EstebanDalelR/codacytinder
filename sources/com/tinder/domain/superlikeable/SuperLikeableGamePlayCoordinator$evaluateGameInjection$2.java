package com.tinder.domain.superlikeable;

import com.tinder.domain.superlikeable.SuperLikeableGamePlayCoordinator.GamePlayFlow.Status;
import kotlin.Metadata;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
final class SuperLikeableGamePlayCoordinator$evaluateGameInjection$2 implements Action0 {
    final /* synthetic */ SuperLikeableGamePlayCoordinator this$0;

    SuperLikeableGamePlayCoordinator$evaluateGameInjection$2(SuperLikeableGamePlayCoordinator superLikeableGamePlayCoordinator) {
        this.this$0 = superLikeableGamePlayCoordinator;
    }

    public final void call() {
        this.this$0.logger.debug("Injected SuperLikeableGame into the cards stack.");
        this.this$0.updateStatusTo(Status.GAME_INJECTED);
    }
}
