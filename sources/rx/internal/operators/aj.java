package rx.internal.operators;

import rx.C19571c;
import rx.Observable.Operator;

public class aj<T> implements Operator<T, T> {

    /* renamed from: rx.internal.operators.aj$a */
    static final class C19424a {
        /* renamed from: a */
        static final aj<?> f60617a = new aj();
    }

    public /* synthetic */ Object call(Object obj) {
        return m71442a((C19571c) obj);
    }

    /* renamed from: a */
    public static <T> aj<T> m71441a() {
        return C19424a.f60617a;
    }

    aj() {
    }

    /* renamed from: a */
    public C19571c<? super T> m71442a(final C19571c<? super T> c19571c) {
        Object c196901 = new C19571c<T>(this) {
            /* renamed from: b */
            final /* synthetic */ aj f61585b;

            public void onNext(T t) {
            }

            public void onCompleted() {
                c19571c.onCompleted();
            }

            public void onError(Throwable th) {
                c19571c.onError(th);
            }
        };
        c19571c.add(c196901);
        return c196901;
    }
}
