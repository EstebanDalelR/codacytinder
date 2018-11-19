package rx.internal.producers;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.C19571c;
import rx.Observer;
import rx.Producer;
import rx.exceptions.C19410a;

public final class SingleProducer<T> extends AtomicBoolean implements Producer {
    private static final long serialVersionUID = -3353584923995471404L;
    /* renamed from: a */
    final C19571c<? super T> f61233a;
    /* renamed from: b */
    final T f61234b;

    public SingleProducer(C19571c<? super T> c19571c, T t) {
        this.f61233a = c19571c;
        this.f61234b = t;
    }

    public void request(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (!(j == 0 || compareAndSet(0, true) == null)) {
            Observer observer = this.f61233a;
            if (!observer.isUnsubscribed()) {
                Object obj = this.f61234b;
                try {
                    observer.onNext(obj);
                    if (!observer.isUnsubscribed()) {
                        observer.onCompleted();
                    }
                } catch (Throwable th) {
                    C19410a.m69870a(th, observer, obj);
                }
            }
        }
    }
}
