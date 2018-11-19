package com.trello.rxlifecycle;

import javax.annotation.Nonnull;
import rx.Observable;
import rx.functions.Func1;

/* renamed from: com.trello.rxlifecycle.c */
final class C2663c {
    @Nonnull
    /* renamed from: a */
    static <T> Observable<T> m10239a(@Nonnull Observable<T> observable, @Nonnull T t) {
        return observable.q(new c$1(t));
    }

    @Nonnull
    /* renamed from: a */
    static <T> Observable<Boolean> m10240a(@Nonnull Observable<T> observable, @Nonnull Func1<T, T> func1) {
        return Observable.a(observable.c(1).k(func1), observable.b(1), new c$2()).m(C15488a.f47927a).q(C15488a.f47928b);
    }
}
