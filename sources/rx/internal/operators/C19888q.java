package rx.internal.operators;

import rx.C19571c;
import rx.Observable;
import rx.Observable.OnSubscribe;
import rx.exceptions.C19410a;
import rx.functions.Func2;

/* renamed from: rx.internal.operators.q */
public final class C19888q<T, R> implements OnSubscribe<R> {
    /* renamed from: a */
    final Observable<T> f62288a;
    /* renamed from: b */
    final R f62289b;
    /* renamed from: c */
    final Func2<R, ? super T, R> f62290c;

    /* renamed from: rx.internal.operators.q$a */
    static final class C19835a<T, R> extends C19731f<T, R> {
        /* renamed from: e */
        final Func2<R, ? super T, R> f62078e;

        public C19835a(C19571c<? super R> c19571c, R r, Func2<R, ? super T, R> func2) {
            super(c19571c);
            this.c = r;
            this.b = true;
            this.f62078e = func2;
        }

        public void onNext(T t) {
            try {
                this.c = this.f62078e.call(this.c, t);
            } catch (T t2) {
                C19410a.m69874b(t2);
                unsubscribe();
                this.a.onError(t2);
            }
        }
    }

    public /* synthetic */ void call(Object obj) {
        m71621a((C19571c) obj);
    }

    public C19888q(Observable<T> observable, R r, Func2<R, ? super T, R> func2) {
        this.f62288a = observable;
        this.f62289b = r;
        this.f62290c = func2;
    }

    /* renamed from: a */
    public void m71621a(C19571c<? super R> c19571c) {
        new C19835a(c19571c, this.f62289b, this.f62290c).m70997a((Observable) this.f62288a);
    }
}
