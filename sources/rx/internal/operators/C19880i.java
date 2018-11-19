package rx.internal.operators;

import rx.C19571c;
import rx.Observable;
import rx.Observable.OnSubscribe;
import rx.Observer;
import rx.exceptions.C19410a;
import rx.functions.Func0;
import rx.observers.C19450f;

/* renamed from: rx.internal.operators.i */
public final class C19880i<T> implements OnSubscribe<T> {
    /* renamed from: a */
    final Func0<? extends Observable<? extends T>> f62270a;

    public /* synthetic */ void call(Object obj) {
        m71607a((C19571c) obj);
    }

    public C19880i(Func0<? extends Observable<? extends T>> func0) {
        this.f62270a = func0;
    }

    /* renamed from: a */
    public void m71607a(C19571c<? super T> c19571c) {
        try {
            ((Observable) this.f62270a.call()).m69661a(C19450f.m69991a((C19571c) c19571c));
        } catch (Throwable th) {
            C19410a.m69869a(th, (Observer) c19571c);
        }
    }
}
