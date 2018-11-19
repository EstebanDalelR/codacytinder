package rx.internal.operators;

import java.util.concurrent.atomic.AtomicReference;
import rx.C19571c;
import rx.Observable;
import rx.Observable.Operator;
import rx.Observer;
import rx.exceptions.C19410a;
import rx.functions.Func2;
import rx.observers.C19781e;

public final class bc<T, U, R> implements Operator<R, T> {
    /* renamed from: c */
    static final Object f62050c = new Object();
    /* renamed from: a */
    final Func2<? super T, ? super U, ? extends R> f62051a;
    /* renamed from: b */
    final Observable<? extends U> f62052b;

    public /* synthetic */ Object call(Object obj) {
        return m71471a((C19571c) obj);
    }

    public bc(Observable<? extends U> observable, Func2<? super T, ? super U, ? extends R> func2) {
        this.f62052b = observable;
        this.f62051a = func2;
    }

    /* renamed from: a */
    public C19571c<? super T> m71471a(C19571c<? super R> c19571c) {
        final C19571c c19781e = new C19781e(c19571c, false);
        c19571c.add(c19781e);
        c19571c = new AtomicReference(f62050c);
        final C19571c<? super R> c19571c2 = c19571c;
        final C19571c c19571c3 = c19781e;
        C197151 c197151 = new C19571c<T>(this, c19781e, true) {
            /* renamed from: c */
            final /* synthetic */ bc f61683c;

            public void onNext(T t) {
                Object obj = c19571c2.get();
                if (obj != bc.f62050c) {
                    try {
                        c19571c3.onNext(this.f61683c.f62051a.call(t, obj));
                    } catch (Throwable th) {
                        C19410a.m69869a(th, (Observer) this);
                    }
                }
            }

            public void onError(Throwable th) {
                c19571c3.onError(th);
                c19571c3.unsubscribe();
            }

            public void onCompleted() {
                c19571c3.onCompleted();
                c19571c3.unsubscribe();
            }
        };
        C19571c c197162 = new C19571c<U>(this) {
            /* renamed from: c */
            final /* synthetic */ bc f61686c;

            public void onNext(U u) {
                c19571c.set(u);
            }

            public void onError(Throwable th) {
                c19781e.onError(th);
                c19781e.unsubscribe();
            }

            public void onCompleted() {
                if (c19571c.get() == bc.f62050c) {
                    c19781e.onCompleted();
                    c19781e.unsubscribe();
                }
            }
        };
        c19781e.add(c197151);
        c19781e.add(c197162);
        this.f62052b.m69661a(c197162);
        return c197151;
    }
}
