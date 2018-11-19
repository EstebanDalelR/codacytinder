package com.tinder.domain.utils;

import com.tinder.domain.utils.RxUtils.RetryOnErrorTransformer;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import rx.Observable;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u00042\u000e\u0010\u0005\u001a\n \u0003*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "Lrx/Observable;", "", "kotlin.jvm.PlatformType", "T", "it", "", "call", "(Ljava/lang/Integer;)Lrx/Observable;"}, k = 3, mv = {1, 1, 10})
final class RxUtils$RetryOnErrorTransformer$createRetryNotification$1<T, R> implements Func1<T, Observable<? extends R>> {
    final /* synthetic */ RetryOnErrorTransformer this$0;

    RxUtils$RetryOnErrorTransformer$createRetryNotification$1(RetryOnErrorTransformer retryOnErrorTransformer) {
        this.this$0 = retryOnErrorTransformer;
    }

    public final Observable<Long> call(Integer num) {
        return Observable.b(this.this$0.intervalMs, TimeUnit.MILLISECONDS);
    }
}
