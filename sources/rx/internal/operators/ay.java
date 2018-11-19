package rx.internal.operators;

import com.google.android.exoplayer2.Format;
import rx.C19571c;
import rx.Observable;
import rx.Observable.Operator;
import rx.Subscription;
import rx.observers.C19781e;

public final class ay<T, E> implements Operator<T, T> {
    /* renamed from: a */
    private final Observable<? extends E> f62046a;

    public /* synthetic */ Object call(Object obj) {
        return m71466a((C19571c) obj);
    }

    public ay(Observable<? extends E> observable) {
        this.f62046a = observable;
    }

    /* renamed from: a */
    public C19571c<? super T> m71466a(C19571c<? super T> c19571c) {
        final Subscription c19781e = new C19781e(c19571c, false);
        final Object c197091 = new C19571c<T>(this, false, c19781e) {
            /* renamed from: b */
            final /* synthetic */ ay f61665b;

            public void onNext(T t) {
                c19781e.onNext(t);
            }

            public void onError(Throwable th) {
                try {
                    c19781e.onError(th);
                } finally {
                    c19781e.unsubscribe();
                }
            }

            public void onCompleted() {
                try {
                    c19781e.onCompleted();
                } finally {
                    c19781e.unsubscribe();
                }
            }
        };
        C19571c c197102 = new C19571c<E>(this) {
            /* renamed from: b */
            final /* synthetic */ ay f61667b;

            public void onStart() {
                request(Format.OFFSET_SAMPLE_RELATIVE);
            }

            public void onCompleted() {
                c197091.onCompleted();
            }

            public void onError(Throwable th) {
                c197091.onError(th);
            }

            public void onNext(E e) {
                onCompleted();
            }
        };
        c19781e.add(c197091);
        c19781e.add(c197102);
        c19571c.add(c19781e);
        this.f62046a.m69661a(c197102);
        return c197091;
    }
}
