package com.tinder.domain.common.reactivex;

import com.tinder.domain.common.reactivex.RxUtils.RetryListener;
import io.reactivex.C15679f;
import io.reactivex.C3957b;
import io.reactivex.CompletableTransformer;
import io.reactivex.FlowableTransformer;
import io.reactivex.SingleTransformer;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.reactivestreams.Publisher;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00010\u0002B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\u001c\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u000fH\u0002J\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u00170\u0016\"\u0004\b\u0001\u0010\u0017R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/domain/common/reactivex/RetryOnErrorTransformer;", "T", "Lio/reactivex/FlowableTransformer;", "retryMaxCount", "", "backoffStrategy", "Lcom/tinder/domain/common/reactivex/BackoffStrategy;", "retryListener", "Lcom/tinder/domain/common/reactivex/RxUtils$RetryListener;", "scheduler", "Lio/reactivex/Scheduler;", "(ILcom/tinder/domain/common/reactivex/BackoffStrategy;Lcom/tinder/domain/common/reactivex/RxUtils$RetryListener;Lio/reactivex/Scheduler;)V", "apply", "Lorg/reactivestreams/Publisher;", "observable", "Lio/reactivex/Flowable;", "createRetryNotification", "errorFlowable", "", "forCompletable", "Lio/reactivex/CompletableTransformer;", "forSingle", "Lio/reactivex/SingleTransformer;", "R", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class RetryOnErrorTransformer<T> implements FlowableTransformer<T, T> {
    private final BackoffStrategy backoffStrategy;
    private final RetryListener retryListener;
    private final int retryMaxCount;
    private final C15679f scheduler;

    public RetryOnErrorTransformer(int i, @NotNull BackoffStrategy backoffStrategy, @Nullable RetryListener retryListener, @NotNull C15679f c15679f) {
        C2668g.b(backoffStrategy, "backoffStrategy");
        C2668g.b(c15679f, "scheduler");
        this.retryMaxCount = i;
        this.backoffStrategy = backoffStrategy;
        this.retryListener = retryListener;
        this.scheduler = c15679f;
    }

    @NotNull
    public Publisher<T> apply(@NotNull C3957b<T> c3957b) {
        C2668g.b(c3957b, "observable");
        c3957b = c3957b.h(new RetryOnErrorTransformer$sam$io_reactivex_functions_Function$0(new RetryOnErrorTransformer$apply$1(this)));
        C2668g.a(c3957b, "observable.retryWhen(::createRetryNotification)");
        return c3957b;
    }

    @NotNull
    public final <R> SingleTransformer<R, R> forSingle() {
        return new RetryOnErrorTransformer$forSingle$1(this);
    }

    @NotNull
    public final CompletableTransformer forCompletable() {
        return new RetryOnErrorTransformer$forCompletable$1(this);
    }

    private final C3957b<?> createRetryNotification(C3957b<? extends Throwable> c3957b) {
        c3957b = C3957b.b(c3957b, C3957b.a(0, this.retryMaxCount + 1), RetryOnErrorTransformer$createRetryNotification$1.INSTANCE).b(new RetryOnErrorTransformer$createRetryNotification$2(this));
        C2668g.a(c3957b, "Flowable.zip<Throwable, …          }\n            }");
        return c3957b;
    }
}
