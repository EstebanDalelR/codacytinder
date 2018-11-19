package rx.internal.operators;

import rx.C19571c;
import rx.Observable.Operator;
import rx.functions.Action0;
import rx.observers.C19450f;
import rx.p500e.C19407e;

public class ai<T> implements Operator<T, T> {
    /* renamed from: a */
    private final Action0 f62000a;

    public /* synthetic */ Object call(Object obj) {
        return m71440a((C19571c) obj);
    }

    public ai(Action0 action0) {
        this.f62000a = action0;
    }

    /* renamed from: a */
    public C19571c<? super T> m71440a(C19571c<? super T> c19571c) {
        c19571c.add(C19407e.m69854a(this.f62000a));
        return C19450f.m69991a((C19571c) c19571c);
    }
}
