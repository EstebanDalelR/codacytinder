package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.observers.C19001a;

public final class aw<T, U> extends C18394a<T, U> {
    /* renamed from: b */
    final Function<? super T, ? extends U> f59028b;

    /* renamed from: io.reactivex.internal.operators.observable.aw$a */
    static final class C19186a<T, U> extends C19001a<T, U> {
        /* renamed from: f */
        final Function<? super T, ? extends U> f59556f;

        C19186a(Observer<? super U> observer, Function<? super T, ? extends U> function) {
            super(observer);
            this.f59556f = function;
        }

        public void onNext(T t) {
            if (!this.d) {
                if (this.e != 0) {
                    this.a.onNext(null);
                    return;
                }
                try {
                    this.a.onNext(C15684a.m58895a(this.f59556f.apply(t), "The mapper function returned a null value."));
                } catch (T t2) {
                    m67548a((Throwable) t2);
                }
            }
        }

        public int requestFusion(int i) {
            return m67547a(i);
        }

        @Nullable
        public U poll() throws Exception {
            Object poll = this.c.poll();
            return poll != null ? C15684a.m58895a(this.f59556f.apply(poll), "The mapper function returned a null value.") : null;
        }
    }

    public aw(ObservableSource<T> observableSource, Function<? super T, ? extends U> function) {
        super(observableSource);
        this.f59028b = function;
    }

    public void subscribeActual(Observer<? super U> observer) {
        this.a.subscribe(new C19186a(observer, this.f59028b));
    }
}
