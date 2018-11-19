package rx.internal.operators;

import java.util.concurrent.atomic.AtomicReference;
import rx.C19571c;
import rx.Observable;
import rx.Observable.Operator;
import rx.Subscription;
import rx.observers.C19781e;

public final class aq<T, U> implements Operator<T, T> {
    /* renamed from: b */
    static final Object f62022b = new Object();
    /* renamed from: a */
    final Observable<U> f62023a;

    public /* synthetic */ Object call(Object obj) {
        return m71456a((C19571c) obj);
    }

    public aq(Observable<U> observable) {
        this.f62023a = observable;
    }

    /* renamed from: a */
    public C19571c<? super T> m71456a(C19571c<? super T> c19571c) {
        final C19781e c19781e = new C19781e(c19571c);
        final AtomicReference atomicReference = new AtomicReference(f62022b);
        final AtomicReference atomicReference2 = new AtomicReference();
        final C19571c c196991 = new C19571c<U>(this) {
            /* renamed from: d */
            final /* synthetic */ aq f61622d;

            public void onNext(U u) {
                u = atomicReference.getAndSet(aq.f62022b);
                if (u != aq.f62022b) {
                    c19781e.onNext(u);
                }
            }

            public void onError(Throwable th) {
                c19781e.onError(th);
                ((Subscription) atomicReference2.get()).unsubscribe();
            }

            public void onCompleted() {
                onNext(null);
                c19781e.onCompleted();
                ((Subscription) atomicReference2.get()).unsubscribe();
            }
        };
        Object c197002 = new C19571c<T>(this) {
            /* renamed from: d */
            final /* synthetic */ aq f61626d;

            public void onNext(T t) {
                atomicReference.set(t);
            }

            public void onError(Throwable th) {
                c19781e.onError(th);
                c196991.unsubscribe();
            }

            public void onCompleted() {
                c196991.onNext(null);
                c19781e.onCompleted();
                c196991.unsubscribe();
            }
        };
        atomicReference2.lazySet(c197002);
        c19571c.add(c197002);
        c19571c.add(c196991);
        this.f62023a.m69661a(c196991);
        return c197002;
    }
}
