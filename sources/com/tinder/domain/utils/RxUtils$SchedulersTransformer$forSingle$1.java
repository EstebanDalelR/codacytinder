package com.tinder.domain.utils;

import com.tinder.domain.utils.RxUtils.SchedulersTransformer;
import kotlin.Metadata;
import rx.Single;
import rx.Single$Transformer;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u00022*\u0010\u0004\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Single;", "T", "kotlin.jvm.PlatformType", "single", "call"}, k = 3, mv = {1, 1, 10})
final class RxUtils$SchedulersTransformer$forSingle$1<T, R> implements Single$Transformer<T, T> {
    final /* synthetic */ SchedulersTransformer this$0;

    RxUtils$SchedulersTransformer$forSingle$1(SchedulersTransformer schedulersTransformer) {
        this.this$0 = schedulersTransformer;
    }

    public final Single<T> call(Single<T> single) {
        return single.b(this.this$0.mSchedulerSubscribedOn).a(this.this$0.mSchedulerObservedOn);
    }
}
