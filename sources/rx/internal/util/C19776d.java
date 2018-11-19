package rx.internal.util;

import rx.C19571c;
import rx.Observer;

/* renamed from: rx.internal.util.d */
public final class C19776d<T> extends C19571c<T> {
    /* renamed from: a */
    final Observer<? super T> f61851a;

    public C19776d(Observer<? super T> observer) {
        this.f61851a = observer;
    }

    public void onNext(T t) {
        this.f61851a.onNext(t);
    }

    public void onError(Throwable th) {
        this.f61851a.onError(th);
    }

    public void onCompleted() {
        this.f61851a.onCompleted();
    }
}
