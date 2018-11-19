package com.tinder.recs.presenter;

import com.tinder.domain.superlike.SuperlikeStatus;
import java8.util.Optional;
import java8.util.function.Consumer;
import kotlin.Metadata;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "superLikeStatus", "Lcom/tinder/domain/superlike/SuperlikeStatus;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
final class RecsPresenter$subscribeToSuperlikeProgress$3<T> implements Action1<SuperlikeStatus> {
    final /* synthetic */ RecsPresenter this$0;

    RecsPresenter$subscribeToSuperlikeProgress$3(RecsPresenter recsPresenter) {
        this.this$0 = recsPresenter;
    }

    public final void call(SuperlikeStatus superlikeStatus) {
        Optional.m59121b((Object) superlikeStatus).m59125a((Consumer) new Consumer<SuperlikeStatus>() {
            public final void accept(SuperlikeStatus superlikeStatus) {
                this.this$0.getTarget().animateSuperlikeButton(superlikeStatus.remainingCount());
            }
        });
    }
}
