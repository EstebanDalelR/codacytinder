package com.tinder.recs.presenter;

import com.tinder.domain.tinderplus.LikeStatus;
import kotlin.Metadata;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "likeStatus", "Lcom/tinder/domain/tinderplus/LikeStatus;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.recs.presenter.GamepadPresenter$subscribeToLikeStatusChanges$likeStatusUpdatesSubscription$1 */
final class C18768xb8266e99<T> implements Action1<LikeStatus> {
    final /* synthetic */ GamepadPresenter this$0;

    C18768xb8266e99(GamepadPresenter gamepadPresenter) {
        this.this$0 = gamepadPresenter;
    }

    public final void call(LikeStatus likeStatus) {
        this.this$0.getTarget$Tinder_release().updateLikesButton(likeStatus.likesPercentRemaining());
    }
}
