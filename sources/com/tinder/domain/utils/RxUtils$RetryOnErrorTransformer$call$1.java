package com.tinder.domain.utils;

import com.tinder.domain.utils.RxUtils.RetryOnErrorTransformer;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022.\u0010\u0003\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Observable;", "T", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
final class RxUtils$RetryOnErrorTransformer$call$1<T, R> implements Func1<Observable<? extends Throwable>, Observable<?>> {
    final /* synthetic */ RetryOnErrorTransformer this$0;

    RxUtils$RetryOnErrorTransformer$call$1(RetryOnErrorTransformer retryOnErrorTransformer) {
        this.this$0 = retryOnErrorTransformer;
    }

    @Nullable
    public final Observable<?> call(Observable<? extends Throwable> observable) {
        RetryOnErrorTransformer retryOnErrorTransformer = this.this$0;
        C2668g.a(observable, "it");
        return retryOnErrorTransformer.createRetryNotification(observable);
    }
}
