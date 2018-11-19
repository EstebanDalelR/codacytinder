package rx.p497b;

import rx.Observable;
import rx.Observable.OnSubscribe;
import rx.Subscription;
import rx.functions.Action1;
import rx.internal.operators.C19889r;

/* renamed from: rx.b.b */
public abstract class C19565b<T> extends Observable<T> {
    /* renamed from: e */
    public abstract void mo14748e(Action1<? super Subscription> action1);

    protected C19565b(OnSubscribe<T> onSubscribe) {
        super(onSubscribe);
    }

    /* renamed from: w */
    public Observable<T> m70539w() {
        return Observable.m69634b(new C19889r(this));
    }
}
