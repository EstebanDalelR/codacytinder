package rx.internal.operators;

import rx.C19571c;
import rx.Observable.OnSubscribe;
import rx.Observable.Operator;
import rx.exceptions.C19410a;
import rx.p498c.C19401c;

/* renamed from: rx.internal.operators.n */
public final class C19885n<T, R> implements OnSubscribe<R> {
    /* renamed from: a */
    final OnSubscribe<T> f62278a;
    /* renamed from: b */
    final Operator<? extends R, ? super T> f62279b;

    public /* synthetic */ void call(Object obj) {
        m71612a((C19571c) obj);
    }

    public C19885n(OnSubscribe<T> onSubscribe, Operator<? extends R, ? super T> operator) {
        this.f62278a = onSubscribe;
        this.f62279b = operator;
    }

    /* renamed from: a */
    public void m71612a(C19571c<? super R> c19571c) {
        C19571c c19571c2;
        try {
            c19571c2 = (C19571c) C19401c.m69804a(this.f62279b).call(c19571c);
            c19571c2.onStart();
            this.f62278a.call(c19571c2);
        } catch (Throwable th) {
            C19410a.m69874b(th);
            c19571c.onError(th);
        }
    }
}
