package com.tinder.domain.common.reactivex;

import io.reactivex.C15679f;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.C15756a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J.\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0013"}, d2 = {"Lcom/tinder/domain/common/reactivex/RxUtils;", "", "()V", "isSubscribed", "", "disposable", "Lio/reactivex/disposables/Disposable;", "retryOnError", "Lcom/tinder/domain/common/reactivex/RetryOnErrorTransformer;", "T", "retryMaxCount", "", "backoffStrategy", "Lcom/tinder/domain/common/reactivex/BackoffStrategy;", "retryListener", "Lcom/tinder/domain/common/reactivex/RxUtils$RetryListener;", "unsubscribe", "", "RetryListener", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class RxUtils {
    public static final RxUtils INSTANCE = new RxUtils();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/domain/common/reactivex/RxUtils$RetryListener;", "", "onRetry", "", "retryCount", "", "domain_release"}, k = 1, mv = {1, 1, 10})
    public interface RetryListener {
        void onRetry(int i);
    }

    private RxUtils() {
    }

    @NotNull
    public static /* synthetic */ RetryOnErrorTransformer retryOnError$default(RxUtils rxUtils, int i, BackoffStrategy backoffStrategy, RetryListener retryListener, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            retryListener = null;
        }
        return rxUtils.retryOnError(i, backoffStrategy, retryListener);
    }

    @NotNull
    public final <T> RetryOnErrorTransformer<T> retryOnError(int i, @NotNull BackoffStrategy backoffStrategy, @Nullable RetryListener retryListener) {
        C2668g.b(backoffStrategy, "backoffStrategy");
        C15679f a = C15756a.a();
        C2668g.a(a, "Schedulers.computation()");
        return new RetryOnErrorTransformer(i, backoffStrategy, retryListener, a);
    }

    public final boolean isSubscribed(@Nullable Disposable disposable) {
        return (disposable == null || disposable.isDisposed() != null) ? null : true;
    }

    public final void unsubscribe(@Nullable Disposable disposable) {
        if (disposable != null) {
            disposable.dispose();
        }
    }
}
