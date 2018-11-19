package com.tinder.domain.superlikeable.usecase;

import com.tinder.domain.superlikeable.SuperLikeableGamePlayCoordinator.GamePlayFlow.Status;
import com.tinder.domain.superlikeable.model.SuperLikeableGame;
import com.tinder.domain.superlikeable.usecase.EndSuperLikeableGame.Reason;
import java8.util.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Ljava8/util/Optional;", "Lcom/tinder/domain/superlikeable/model/SuperLikeableGame;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
final class EndSuperLikeableGame$execute$1<T> implements Action1<Optional<SuperLikeableGame>> {
    final /* synthetic */ Reason $reason;
    final /* synthetic */ EndSuperLikeableGame this$0;

    EndSuperLikeableGame$execute$1(EndSuperLikeableGame endSuperLikeableGame, Reason reason) {
        this.this$0 = endSuperLikeableGame;
        this.$reason = reason;
    }

    public final void call(Optional<SuperLikeableGame> optional) {
        C2668g.a(optional, "it");
        if (optional.c()) {
            Object obj = this.this$0.gamePlayCoordinator.getStatus() == Status.GAME_INJECTED ? 1 : null;
            this.this$0.gamePlayCoordinator.endGame();
            if (obj != null) {
                SuperLikeableGame superLikeableGame = (SuperLikeableGame) optional.b();
                EndSuperLikeableGame endSuperLikeableGame = this.this$0;
                C2668g.a(superLikeableGame, "game");
                endSuperLikeableGame.swipeTeaserRecAwayFromCardStack(superLikeableGame, this.$reason);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
