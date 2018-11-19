package com.tinder.domain.superlikeable;

import com.tinder.domain.recs.model.RecsUpdate;
import com.tinder.domain.superlikeable.SuperLikeableGamePlayCoordinator.GamePlayFlow.Status;
import kotlin.C15813i;
import kotlin.Metadata;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/recs/model/RecsUpdate;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.domain.superlikeable.SuperLikeableGamePlayCoordinator$subscribeToRecsUpdatesIfUnsubscribed$3 */
final class C13911xb89f54c7<T> implements Action1<RecsUpdate> {
    final /* synthetic */ SuperLikeableGamePlayCoordinator this$0;

    C13911xb89f54c7(SuperLikeableGamePlayCoordinator superLikeableGamePlayCoordinator) {
        this.this$0 = superLikeableGamePlayCoordinator;
    }

    public final void call(RecsUpdate recsUpdate) {
        synchronized (this.this$0) {
            this.this$0.swipeTracker.reset();
            if (this.this$0.getStatus() == Status.GAME_INJECTED) {
                this.this$0.clearInjectionStatus();
            }
            C15813i c15813i = C15813i.f49016a;
        }
    }
}
