package com.tinder.recs.presenter;

import com.tinder.superlikeable.provider.SuperLikeableViewStateProviderAndNotifier.C15149b;
import com.tinder.superlikeable.provider.SuperLikeableViewStateProviderAndNotifier.State;
import kotlin.Metadata;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lcom/tinder/superlikeable/provider/SuperLikeableViewStateProviderAndNotifier$ViewProperty;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
final class RecsPresenter$subscribeToSuperLikeableViewStateChanges$1<T> implements Action1<C15149b> {
    final /* synthetic */ RecsPresenter this$0;

    RecsPresenter$subscribeToSuperLikeableViewStateChanges$1(RecsPresenter recsPresenter) {
        this.this$0 = recsPresenter;
    }

    public final void call(C15149b c15149b) {
        State a = c15149b.m57009a();
        c15149b = c15149b.m57010b();
        switch (a) {
            case MOVED_TO_TOP:
                this.this$0.getTarget().disableTouch();
                this.this$0.getTarget().showSuperLikeableGame();
                return;
            case LAYOUT_COMPLETE:
                this.this$0.getTarget().enableTouch();
                this.this$0.getTarget().startSuperLikeableEntranceAnimation(c15149b);
                return;
            default:
                this.this$0.getTarget().enableTouch();
                return;
        }
    }
}
