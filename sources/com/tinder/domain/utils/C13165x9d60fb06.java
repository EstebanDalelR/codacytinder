package com.tinder.domain.utils;

import com.tinder.domain.utils.RxUtils.RetryOnErrorTransformer;
import com.tinder.util.ConnectivityProvider.NoInternetConnectionException;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import rx.functions.Func2;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u00032\u000e\u0010\u0004\u001a\n \u0002*\u0004\u0018\u00010\u00050\u00052\u000e\u0010\u0006\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "T", "throwable", "", "i", "call", "(Ljava/lang/Throwable;Ljava/lang/Integer;)Ljava/lang/Integer;"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.domain.utils.RxUtils$RetryOnErrorTransformer$createRetryNotification$retryObservable$1 */
final class C13165x9d60fb06<T1, T2, R> implements Func2<T, T2, R> {
    final /* synthetic */ RetryOnErrorTransformer this$0;

    C13165x9d60fb06(RetryOnErrorTransformer retryOnErrorTransformer) {
        this.this$0 = retryOnErrorTransformer;
    }

    public final Integer call(Throwable th, Integer num) {
        boolean z = th instanceof NoInternetConnectionException;
        if (C2668g.a(num.intValue(), this.this$0.retryMaxCount) <= 0) {
            if (!z) {
                th = this.this$0.retryListener;
                if (th != null) {
                    if (num == null) {
                        C2668g.a();
                    }
                    th.onRetry(num.intValue());
                }
                return num;
            }
        }
        num = (RuntimeException) ((th instanceof RuntimeException) == null ? null : th);
        if (num == null) {
            num = new RuntimeException(th);
        }
        throw ((Throwable) num);
    }
}
