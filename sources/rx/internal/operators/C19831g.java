package rx.internal.operators;

import rx.C19571c;
import rx.p498c.C19401c;

/* renamed from: rx.internal.operators.g */
public abstract class C19831g<T, R> extends C19731f<T, R> {
    /* renamed from: e */
    protected boolean f62063e;

    public C19831g(C19571c<? super R> c19571c) {
        super(c19571c);
    }

    public void onError(Throwable th) {
        if (this.f62063e) {
            C19401c.m69811a(th);
            return;
        }
        this.f62063e = true;
        super.onError(th);
    }

    public void onCompleted() {
        if (!this.f62063e) {
            this.f62063e = true;
            super.onCompleted();
        }
    }
}
