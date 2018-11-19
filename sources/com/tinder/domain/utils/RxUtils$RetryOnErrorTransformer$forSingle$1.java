package com.tinder.domain.utils;

import com.tinder.domain.utils.RxUtils.RetryOnErrorTransformer;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.Single;
import rx.Single$Transformer;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00042*\u0010\u0005\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Single;", "R", "kotlin.jvm.PlatformType", "T", "single", "call"}, k = 3, mv = {1, 1, 10})
final class RxUtils$RetryOnErrorTransformer$forSingle$1<T, R> implements Single$Transformer<R, R> {
    final /* synthetic */ RetryOnErrorTransformer this$0;

    RxUtils$RetryOnErrorTransformer$forSingle$1(RetryOnErrorTransformer retryOnErrorTransformer) {
        this.this$0 = retryOnErrorTransformer;
    }

    public final Single<R> call(Single<R> single) {
        return single.g(new Func1<Observable<? extends Throwable>, Observable<?>>() {
            @Nullable
            public final Observable<?> call(Observable<? extends Throwable> observable) {
                RetryOnErrorTransformer retryOnErrorTransformer = this.this$0;
                C2668g.a(observable, "it");
                return retryOnErrorTransformer.createRetryNotification(observable);
            }
        });
    }
}
