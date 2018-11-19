package com.tinder.recs.rule;

import com.tinder.domain.superlikeable.SuperLikeableGamePlayCoordinator.GamePlayFlow.Status;
import kotlin.Metadata;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "status", "Lcom/tinder/domain/superlikeable/SuperLikeableGamePlayCoordinator$GamePlayFlow$Status;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
final class SuperLikeableGamePlayRule$observeAndTrackSuperlikeableGame$1<T> implements Action1<Status> {
    final /* synthetic */ SuperLikeableGamePlayRule this$0;

    SuperLikeableGamePlayRule$observeAndTrackSuperlikeableGame$1(SuperLikeableGamePlayRule superLikeableGamePlayRule) {
        this.this$0 = superLikeableGamePlayRule;
    }

    public final void call(Status status) {
        if (status == Status.GAME_INJECTED) {
            this.this$0.trackSuperlikeableAvailableEvent.a();
        }
    }
}
