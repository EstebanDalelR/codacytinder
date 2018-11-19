package rx.p498c;

import rx.Observable.OnSubscribe;
import rx.Observable.Operator;
import rx.Single;
import rx.Subscription;

/* renamed from: rx.c.h */
public abstract class C19405h {
    @Deprecated
    /* renamed from: a */
    public <T> Throwable m69845a(Throwable th) {
        return th;
    }

    @Deprecated
    /* renamed from: a */
    public <T> OnSubscribe<T> m69846a(Single<? extends T> single, OnSubscribe<T> onSubscribe) {
        return onSubscribe;
    }

    @Deprecated
    /* renamed from: a */
    public <T, R> Operator<? extends R, ? super T> m69847a(Operator<? extends R, ? super T> operator) {
        return operator;
    }

    @Deprecated
    /* renamed from: a */
    public <T> Single.OnSubscribe<T> m69848a(Single.OnSubscribe<T> onSubscribe) {
        return onSubscribe;
    }

    @Deprecated
    /* renamed from: a */
    public <T> Subscription m69849a(Subscription subscription) {
        return subscription;
    }
}
