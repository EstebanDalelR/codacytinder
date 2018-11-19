package rx.internal.operators;

import rx.C19571c;
import rx.Observable;
import rx.Observable.OnSubscribe;
import rx.observers.C19450f;
import rx.p498c.C19401c;
import rx.p500e.C19407e;
import rx.p500e.C19575d;

/* renamed from: rx.internal.operators.j */
public final class C19881j<T, U> implements OnSubscribe<T> {
    /* renamed from: a */
    final Observable<? extends T> f62271a;
    /* renamed from: b */
    final Observable<U> f62272b;

    public /* synthetic */ void call(Object obj) {
        m71608a((C19571c) obj);
    }

    public C19881j(Observable<? extends T> observable, Observable<U> observable2) {
        this.f62271a = observable;
        this.f62272b = observable2;
    }

    /* renamed from: a */
    public void m71608a(C19571c<? super T> c19571c) {
        final C19575d c19575d = new C19575d();
        c19571c.add(c19575d);
        c19571c = C19450f.m69991a((C19571c) c19571c);
        C19571c c197341 = new C19571c<U>(this) {
            /* renamed from: a */
            boolean f61743a;
            /* renamed from: d */
            final /* synthetic */ C19881j f61746d;

            public void onNext(U u) {
                onCompleted();
            }

            public void onError(Throwable th) {
                if (this.f61743a) {
                    C19401c.m69811a(th);
                    return;
                }
                this.f61743a = true;
                c19571c.onError(th);
            }

            public void onCompleted() {
                if (!this.f61743a) {
                    this.f61743a = true;
                    c19575d.m70554a(C19407e.m69855b());
                    this.f61746d.f62271a.m69661a(c19571c);
                }
            }
        };
        c19575d.m70554a(c197341);
        this.f62272b.m69661a(c197341);
    }
}
