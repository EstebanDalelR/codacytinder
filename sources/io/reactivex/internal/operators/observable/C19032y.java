package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.annotations.Experimental;
import io.reactivex.annotations.Nullable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.observers.C19001a;

@Experimental
/* renamed from: io.reactivex.internal.operators.observable.y */
public final class C19032y<T> extends C18394a<T, T> {
    /* renamed from: b */
    final Consumer<? super T> f59086b;

    /* renamed from: io.reactivex.internal.operators.observable.y$a */
    static final class C19200a<T> extends C19001a<T, T> {
        /* renamed from: f */
        final Consumer<? super T> f59650f;

        C19200a(Observer<? super T> observer, Consumer<? super T> consumer) {
            super(observer);
            this.f59650f = consumer;
        }

        public void onNext(T t) {
            this.a.onNext(t);
            if (this.e == 0) {
                try {
                    this.f59650f.accept(t);
                } catch (T t2) {
                    m67548a((Throwable) t2);
                }
            }
        }

        public int requestFusion(int i) {
            return m67547a(i);
        }

        @Nullable
        public T poll() throws Exception {
            T poll = this.c.poll();
            if (poll != null) {
                this.f59650f.accept(poll);
            }
            return poll;
        }
    }

    public C19032y(ObservableSource<T> observableSource, Consumer<? super T> consumer) {
        super(observableSource);
        this.f59086b = consumer;
    }

    protected void subscribeActual(Observer<? super T> observer) {
        this.a.subscribe(new C19200a(observer, this.f59086b));
    }
}
