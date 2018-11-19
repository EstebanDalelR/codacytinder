package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Function;
import io.reactivex.internal.observers.C19001a;

/* renamed from: io.reactivex.internal.operators.observable.x */
public final class C19031x<T, K> extends C18394a<T, T> {
    /* renamed from: b */
    final Function<? super T, K> f59084b;
    /* renamed from: c */
    final BiPredicate<? super K, ? super K> f59085c;

    /* renamed from: io.reactivex.internal.operators.observable.x$a */
    static final class C19199a<T, K> extends C19001a<T, T> {
        /* renamed from: f */
        final Function<? super T, K> f59646f;
        /* renamed from: g */
        final BiPredicate<? super K, ? super K> f59647g;
        /* renamed from: h */
        K f59648h;
        /* renamed from: i */
        boolean f59649i;

        C19199a(Observer<? super T> observer, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
            super(observer);
            this.f59646f = function;
            this.f59647g = biPredicate;
        }

        public void onNext(T t) {
            if (!this.d) {
                if (this.e != 0) {
                    this.a.onNext(t);
                    return;
                }
                try {
                    Object apply = this.f59646f.apply(t);
                    if (this.f59649i) {
                        boolean test = this.f59647g.test(this.f59648h, apply);
                        this.f59648h = apply;
                        if (test) {
                            return;
                        }
                    }
                    this.f59649i = true;
                    this.f59648h = apply;
                    this.a.onNext(t);
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
            while (true) {
                T poll = this.c.poll();
                if (poll == null) {
                    return null;
                }
                Object apply = this.f59646f.apply(poll);
                if (!this.f59649i) {
                    this.f59649i = true;
                    this.f59648h = apply;
                    return poll;
                } else if (this.f59647g.test(this.f59648h, apply)) {
                    this.f59648h = apply;
                } else {
                    this.f59648h = apply;
                    return poll;
                }
            }
        }
    }

    public C19031x(ObservableSource<T> observableSource, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
        super(observableSource);
        this.f59084b = function;
        this.f59085c = biPredicate;
    }

    protected void subscribeActual(Observer<? super T> observer) {
        this.a.subscribe(new C19199a(observer, this.f59084b, this.f59085c));
    }
}
