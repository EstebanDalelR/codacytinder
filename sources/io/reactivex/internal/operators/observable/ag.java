package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.observers.C19001a;

public final class ag<T> extends C18394a<T, T> {
    /* renamed from: b */
    final Predicate<? super T> f59025b;

    /* renamed from: io.reactivex.internal.operators.observable.ag$a */
    static final class C19183a<T> extends C19001a<T, T> {
        /* renamed from: f */
        final Predicate<? super T> f59544f;

        C19183a(Observer<? super T> observer, Predicate<? super T> predicate) {
            super(observer);
            this.f59544f = predicate;
        }

        public void onNext(T t) {
            if (this.e == 0) {
                try {
                    if (this.f59544f.test(t)) {
                        this.a.onNext(t);
                    }
                } catch (T t2) {
                    m67548a((Throwable) t2);
                    return;
                }
            }
            this.a.onNext(null);
        }

        public int requestFusion(int i) {
            return m67547a(i);
        }

        @Nullable
        public T poll() throws Exception {
            T poll;
            do {
                poll = this.c.poll();
                if (poll == null) {
                    break;
                }
            } while (!this.f59544f.test(poll));
            return poll;
        }
    }

    public ag(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        super(observableSource);
        this.f59025b = predicate;
    }

    public void subscribeActual(Observer<? super T> observer) {
        this.a.subscribe(new C19183a(observer, this.f59025b));
    }
}
