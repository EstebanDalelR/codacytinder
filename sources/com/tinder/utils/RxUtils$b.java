package com.tinder.utils;

import rx.C2671a;
import rx.Completable;
import rx.Completable.Transformer;
import rx.Observable;
import rx.Observable$Transformer;
import rx.Single;
import rx.Single$Transformer;

public class RxUtils$b<T> implements Observable$Transformer<T, T> {
    /* renamed from: a */
    private final C2671a f58738a;
    /* renamed from: b */
    private final C2671a f58739b;

    public /* synthetic */ Object call(Object obj) {
        return m67517a((Observable) obj);
    }

    /* renamed from: a */
    public static <T> RxUtils$b<T> m67515a(C2671a c2671a, C2671a c2671a2) {
        return new RxUtils$b(c2671a, c2671a2);
    }

    private RxUtils$b(C2671a c2671a, C2671a c2671a2) {
        this.f58738a = c2671a;
        this.f58739b = c2671a2;
    }

    /* renamed from: a */
    public Observable<T> m67517a(Observable<T> observable) {
        return observable.b(this.f58738a).a(this.f58739b);
    }

    /* renamed from: a */
    public <R> Single$Transformer<R, R> m67518a() {
        return new ak(this);
    }

    /* renamed from: a */
    final /* synthetic */ Single m67519a(Single single) {
        return single.b(this.f58738a).a(this.f58739b);
    }

    /* renamed from: b */
    public Transformer m67520b() {
        return new al(this);
    }

    /* renamed from: a */
    final /* synthetic */ Completable m67516a(Completable completable) {
        return completable.b(this.f58738a).a(this.f58739b);
    }
}
