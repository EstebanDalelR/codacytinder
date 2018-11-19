package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.observers.C19001a;
import io.reactivex.p079d.C2667a;
import java.util.Collection;
import java.util.concurrent.Callable;

/* renamed from: io.reactivex.internal.operators.observable.w */
public final class C19030w<T, K> extends C18394a<T, T> {
    /* renamed from: b */
    final Function<? super T, K> f59082b;
    /* renamed from: c */
    final Callable<? extends Collection<? super K>> f59083c;

    /* renamed from: io.reactivex.internal.operators.observable.w$a */
    static final class C19198a<T, K> extends C19001a<T, T> {
        /* renamed from: f */
        final Collection<? super K> f59644f;
        /* renamed from: g */
        final Function<? super T, K> f59645g;

        C19198a(Observer<? super T> observer, Function<? super T, K> function, Collection<? super K> collection) {
            super(observer);
            this.f59645g = function;
            this.f59644f = collection;
        }

        public void onNext(T t) {
            if (!this.d) {
                if (this.e == 0) {
                    try {
                        if (this.f59644f.add(C15684a.m58895a(this.f59645g.apply(t), "The keySelector returned a null key"))) {
                            this.a.onNext(t);
                        }
                    } catch (T t2) {
                        m67548a((Throwable) t2);
                        return;
                    }
                }
                this.a.onNext(null);
            }
        }

        public void onError(Throwable th) {
            if (this.d) {
                C2667a.a(th);
                return;
            }
            this.d = true;
            this.f59644f.clear();
            this.a.onError(th);
        }

        public void onComplete() {
            if (!this.d) {
                this.d = true;
                this.f59644f.clear();
                this.a.onComplete();
            }
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
            } while (!this.f59644f.add(C15684a.m58895a(this.f59645g.apply(poll), "The keySelector returned a null key")));
            return poll;
        }

        public void clear() {
            this.f59644f.clear();
            super.clear();
        }
    }

    public C19030w(ObservableSource<T> observableSource, Function<? super T, K> function, Callable<? extends Collection<? super K>> callable) {
        super(observableSource);
        this.f59082b = function;
        this.f59083c = callable;
    }

    protected void subscribeActual(Observer<? super T> observer) {
        try {
            this.a.subscribe(new C19198a(observer, this.f59082b, (Collection) C15684a.m58895a(this.f59083c.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C15678a.m58850b(th);
            EmptyDisposable.error(th, (Observer) observer);
        }
    }
}
