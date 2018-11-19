package com.tinder.utils;

import android.support.annotation.Nullable;
import com.tinder.util.ConnectivityProvider.NoInternetConnectionException;
import com.tinder.util.RxUtils.RetryListener;
import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Observable$Transformer;

public class RxUtils$a<T> implements Observable$Transformer<T, T> {
    /* renamed from: a */
    private final int f58735a;
    /* renamed from: b */
    private final long f58736b;
    @Nullable
    /* renamed from: c */
    private final RetryListener f58737c;

    /* renamed from: b */
    final /* synthetic */ Observable m67514b(Observable observable) {
        return m67510c(observable);
    }

    public /* synthetic */ Object call(Object obj) {
        return m67513a((Observable) obj);
    }

    /* renamed from: b */
    private static <T> RxUtils$a<T> m67509b(int i, long j, @Nullable RetryListener retryListener) {
        return new RxUtils$a(i, j, retryListener);
    }

    private RxUtils$a(int i, long j, @Nullable RetryListener retryListener) {
        this.f58735a = i;
        this.f58736b = j;
        this.f58737c = retryListener;
    }

    /* renamed from: a */
    public Observable<T> m67513a(Observable<T> observable) {
        return observable.o(new ah(this));
    }

    /* renamed from: c */
    private Observable<?> m67510c(Observable<? extends Throwable> observable) {
        observable = observable.b(Observable.a(1, this.f58735a + 1), new ai(this));
        return this.f58736b > 0 ? observable.h(new aj(this)) : observable;
    }

    /* renamed from: a */
    final /* synthetic */ Integer m67511a(Throwable th, Integer num) {
        boolean z = th instanceof NoInternetConnectionException;
        if (num.intValue() <= this.f58735a) {
            if (!z) {
                if (this.f58737c != null) {
                    this.f58737c.onRetry(num.intValue());
                }
                return num;
            }
        }
        throw ((th instanceof RuntimeException) != null ? (RuntimeException) th : new RuntimeException(th));
    }

    /* renamed from: a */
    final /* synthetic */ Observable m67512a(Integer num) {
        return Observable.b(this.f58736b, TimeUnit.MILLISECONDS);
    }
}
