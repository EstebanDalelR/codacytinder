package rx.p498c;

import rx.Observable;
import rx.Observable.OnSubscribe;
import rx.Observable.Operator;
import rx.Subscription;

/* renamed from: rx.c.d */
public abstract class C19402d {
    @Deprecated
    /* renamed from: a */
    public <T> Throwable m69822a(Throwable th) {
        return th;
    }

    @Deprecated
    /* renamed from: a */
    public <T> OnSubscribe<T> m69823a(OnSubscribe<T> onSubscribe) {
        return onSubscribe;
    }

    @Deprecated
    /* renamed from: a */
    public <T> OnSubscribe<T> m69824a(Observable<? extends T> observable, OnSubscribe<T> onSubscribe) {
        return onSubscribe;
    }

    @Deprecated
    /* renamed from: a */
    public <T, R> Operator<? extends R, ? super T> m69825a(Operator<? extends R, ? super T> operator) {
        return operator;
    }

    @Deprecated
    /* renamed from: a */
    public <T> Subscription m69826a(Subscription subscription) {
        return subscription;
    }
}
