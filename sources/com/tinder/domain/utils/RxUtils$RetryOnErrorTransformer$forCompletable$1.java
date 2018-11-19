package com.tinder.domain.utils;

import com.tinder.domain.utils.RxUtils.RetryOnErrorTransformer;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.Nullable;
import rx.Completable;
import rx.Completable.Transformer;
import rx.Observable;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u00032\u000e\u0010\u0004\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "kotlin.jvm.PlatformType", "T", "completable", "call"}, k = 3, mv = {1, 1, 10})
final class RxUtils$RetryOnErrorTransformer$forCompletable$1 implements Transformer {
    final /* synthetic */ RetryOnErrorTransformer this$0;

    RxUtils$RetryOnErrorTransformer$forCompletable$1(RetryOnErrorTransformer retryOnErrorTransformer) {
        this.this$0 = retryOnErrorTransformer;
    }

    public final Completable call(Completable completable) {
        return completable.d(new Func1<Observable<? extends Throwable>, Observable<?>>() {
            @Nullable
            public final Observable<?> call(Observable<? extends Throwable> observable) {
                RetryOnErrorTransformer retryOnErrorTransformer = this.this$0;
                C2668g.a(observable, "it");
                return retryOnErrorTransformer.createRetryNotification(observable);
            }
        });
    }
}
