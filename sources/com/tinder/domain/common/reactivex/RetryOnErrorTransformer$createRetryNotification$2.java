package com.tinder.domain.common.reactivex;

import io.reactivex.C3957b;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Publisher;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "kotlin.jvm.PlatformType", "T", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "", "apply"}, k = 3, mv = {1, 1, 10})
final class RetryOnErrorTransformer$createRetryNotification$2<T, R> implements Function<T, Publisher<? extends R>> {
    final /* synthetic */ RetryOnErrorTransformer this$0;

    RetryOnErrorTransformer$createRetryNotification$2(RetryOnErrorTransformer retryOnErrorTransformer) {
        this.this$0 = retryOnErrorTransformer;
    }

    public final C3957b<Long> apply(@NotNull Pair<? extends Throwable, Integer> pair) {
        C2668g.b(pair, "<name for destructuring parameter 0>");
        Throwable th = (Throwable) pair.c();
        pair = ((Number) pair.d()).intValue();
        if (pair != this.this$0.retryMaxCount) {
            return C3957b.a(this.this$0.backoffStrategy.backoffDurationMillisAt(pair), TimeUnit.MILLISECONDS, this.this$0.scheduler).a(new Consumer<Long>() {
                public final void accept(Long l) {
                    l = this.this$0.retryListener;
                    if (l != null) {
                        l.onRetry(pair + 1);
                    }
                }
            });
        }
        throw th;
    }
}
