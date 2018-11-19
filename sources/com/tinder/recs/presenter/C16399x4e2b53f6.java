package com.tinder.recs.presenter;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.recs.presenter.RecsPresenter$observeShouldShowNudgeAnimation$shouldShowNudgeAnimationDisposable$3 */
final class C16399x4e2b53f6<T> implements Consumer<Boolean> {
    final /* synthetic */ RecsPresenter this$0;

    C16399x4e2b53f6(RecsPresenter recsPresenter) {
        this.this$0 = recsPresenter;
    }

    public final void accept(Boolean bool) {
        this.this$0.getTarget().showNudgeAnimation();
    }
}
