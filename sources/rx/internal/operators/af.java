package rx.internal.operators;

import java.util.HashSet;
import java.util.Set;
import rx.C19571c;
import rx.Observable.Operator;
import rx.functions.Func1;
import rx.internal.util.UtilityFunctions;

public final class af<T, U> implements Operator<T, T> {
    /* renamed from: a */
    final Func1<? super T, ? extends U> f61996a;

    /* renamed from: rx.internal.operators.af$a */
    static final class C19422a {
        /* renamed from: a */
        static final af<?, ?> f60615a = new af(UtilityFunctions.m69918b());
    }

    public /* synthetic */ Object call(Object obj) {
        return m71435a((C19571c) obj);
    }

    /* renamed from: a */
    public static <T> af<T, T> m71434a() {
        return C19422a.f60615a;
    }

    public af(Func1<? super T, ? extends U> func1) {
        this.f61996a = func1;
    }

    /* renamed from: a */
    public C19571c<? super T> m71435a(final C19571c<? super T> c19571c) {
        return new C19571c<T>(this, c19571c) {
            /* renamed from: a */
            Set<U> f61577a = new HashSet();
            /* renamed from: c */
            final /* synthetic */ af f61579c;

            public void onNext(T t) {
                if (this.f61577a.add(this.f61579c.f61996a.call(t))) {
                    c19571c.onNext(t);
                } else {
                    request(1);
                }
            }

            public void onError(Throwable th) {
                this.f61577a = null;
                c19571c.onError(th);
            }

            public void onCompleted() {
                this.f61577a = null;
                c19571c.onCompleted();
            }
        };
    }
}
