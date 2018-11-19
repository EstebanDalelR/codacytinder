package rx.observers;

import rx.Observer;
import rx.exceptions.OnErrorNotImplementedException;

/* renamed from: rx.observers.a */
public final class C19448a {
    /* renamed from: a */
    private static final Observer<Object> f60681a = new C196181();

    /* renamed from: rx.observers.a$1 */
    static class C196181 implements Observer<Object> {
        public final void onCompleted() {
        }

        public final void onNext(Object obj) {
        }

        C196181() {
        }

        public final void onError(Throwable th) {
            throw new OnErrorNotImplementedException(th);
        }
    }

    /* renamed from: a */
    public static <T> Observer<T> m69987a() {
        return f60681a;
    }
}
