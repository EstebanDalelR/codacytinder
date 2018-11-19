package rx.internal.operators;

import rx.C19571c;
import rx.Observable.Operator;
import rx.functions.Action0;
import rx.observers.C19450f;

public class ah<T> implements Operator<T, T> {
    /* renamed from: a */
    private final Action0 f61999a;

    public /* synthetic */ Object call(Object obj) {
        return m71439a((C19571c) obj);
    }

    public ah(Action0 action0) {
        this.f61999a = action0;
    }

    /* renamed from: a */
    public C19571c<? super T> m71439a(C19571c<? super T> c19571c) {
        this.f61999a.call();
        return C19450f.m69991a((C19571c) c19571c);
    }
}
