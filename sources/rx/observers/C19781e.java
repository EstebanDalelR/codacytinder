package rx.observers;

import rx.C19571c;
import rx.Observer;

/* renamed from: rx.observers.e */
public class C19781e<T> extends C19571c<T> {
    /* renamed from: a */
    private final Observer<T> f61861a;

    public C19781e(C19571c<? super T> c19571c) {
        this(c19571c, true);
    }

    public C19781e(C19571c<? super T> c19571c, boolean z) {
        super(c19571c, z);
        this.f61861a = new C19620d(c19571c);
    }

    public void onCompleted() {
        this.f61861a.onCompleted();
    }

    public void onError(Throwable th) {
        this.f61861a.onError(th);
    }

    public void onNext(T t) {
        this.f61861a.onNext(t);
    }
}
