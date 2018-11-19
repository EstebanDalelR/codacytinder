package com.tinder.domain.utils;

import com.tinder.domain.utils.RxUtils.SchedulersTransformer;
import kotlin.Metadata;
import rx.Completable;
import rx.Completable.Transformer;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u00032\u000e\u0010\u0004\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "kotlin.jvm.PlatformType", "T", "completable", "call"}, k = 3, mv = {1, 1, 10})
final class RxUtils$SchedulersTransformer$forCompletable$1 implements Transformer {
    final /* synthetic */ SchedulersTransformer this$0;

    RxUtils$SchedulersTransformer$forCompletable$1(SchedulersTransformer schedulersTransformer) {
        this.this$0 = schedulersTransformer;
    }

    public final Completable call(Completable completable) {
        return completable.b(this.this$0.mSchedulerSubscribedOn).a(this.this$0.mSchedulerObservedOn);
    }
}
