package com.tinder.recs.presenter;

import com.tinder.domain.recs.model.Swipe;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/domain/recs/model/Swipe;", "it", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
final class RecsPresenter$subscribeToSwipeTutorialEvents$1<T, R> implements Func1<T, R> {
    final /* synthetic */ RecsPresenter this$0;

    RecsPresenter$subscribeToSwipeTutorialEvents$1(RecsPresenter recsPresenter) {
        this.this$0 = recsPresenter;
    }

    @NotNull
    public final Swipe call(Swipe swipe) {
        RecsPresenter recsPresenter = this.this$0;
        C2668g.a(swipe, "it");
        return recsPresenter.markTutorialAsSeen(swipe);
    }
}
