package com.tinder.recs.presenter;

import com.tinder.domain.superlike.SuperlikeStatus;
import kotlin.Metadata;
import rx.Observable;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lrx/Observable;", "Lcom/tinder/domain/superlike/SuperlikeStatus;", "kotlin.jvm.PlatformType", "it", "", "call", "(Ljava/lang/Boolean;)Lrx/Observable;"}, k = 3, mv = {1, 1, 10})
final class RecsPresenter$subscribeToSuperlikeProgress$2<T, R> implements Func1<T, Observable<? extends R>> {
    final /* synthetic */ RecsPresenter this$0;

    RecsPresenter$subscribeToSuperlikeProgress$2(RecsPresenter recsPresenter) {
        this.this$0 = recsPresenter;
    }

    public final Observable<SuperlikeStatus> call(Boolean bool) {
        return this.this$0.superlikeStatusProvider.m56837d().c(1);
    }
}
