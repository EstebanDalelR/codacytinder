package rx.observers;

import rx.C19571c;
import rx.Observer;

/* renamed from: rx.observers.f */
public final class C19450f {
    /* renamed from: a */
    public static <T> C19571c<T> m69989a() {
        return C19450f.m69990a(C19448a.m69987a());
    }

    /* renamed from: a */
    public static <T> C19571c<T> m69990a(final Observer<? super T> observer) {
        return new C19571c<T>() {
            public void onCompleted() {
                observer.onCompleted();
            }

            public void onError(Throwable th) {
                observer.onError(th);
            }

            public void onNext(T t) {
                observer.onNext(t);
            }
        };
    }

    /* renamed from: a */
    public static <T> C19571c<T> m69991a(final C19571c<? super T> c19571c) {
        return new C19571c<T>(c19571c) {
            public void onCompleted() {
                c19571c.onCompleted();
            }

            public void onError(Throwable th) {
                c19571c.onError(th);
            }

            public void onNext(T t) {
                c19571c.onNext(t);
            }
        };
    }
}
