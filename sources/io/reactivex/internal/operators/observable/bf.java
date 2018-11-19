package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.p079d.C2667a;

public final class bf<T> extends C18394a<T, T> {
    /* renamed from: b */
    final BiFunction<T, T, T> f59035b;

    /* renamed from: io.reactivex.internal.operators.observable.bf$a */
    static final class C17472a<T> implements Observer<T>, Disposable {
        /* renamed from: a */
        final Observer<? super T> f53916a;
        /* renamed from: b */
        final BiFunction<T, T, T> f53917b;
        /* renamed from: c */
        Disposable f53918c;
        /* renamed from: d */
        T f53919d;
        /* renamed from: e */
        boolean f53920e;

        C17472a(Observer<? super T> observer, BiFunction<T, T, T> biFunction) {
            this.f53916a = observer;
            this.f53917b = biFunction;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53918c, disposable)) {
                this.f53918c = disposable;
                this.f53916a.onSubscribe(this);
            }
        }

        public void dispose() {
            this.f53918c.dispose();
        }

        public boolean isDisposed() {
            return this.f53918c.isDisposed();
        }

        public void onNext(T t) {
            if (!this.f53920e) {
                Observer observer = this.f53916a;
                Object obj = this.f53919d;
                if (obj == null) {
                    this.f53919d = t;
                    observer.onNext(t);
                } else {
                    try {
                        t = C15684a.m58895a(this.f53917b.apply(obj, t), "The value returned by the accumulator is null");
                        this.f53919d = t;
                        observer.onNext(t);
                    } catch (T t2) {
                        C15678a.m58850b(t2);
                        this.f53918c.dispose();
                        onError(t2);
                    }
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f53920e) {
                C2667a.a(th);
                return;
            }
            this.f53920e = true;
            this.f53916a.onError(th);
        }

        public void onComplete() {
            if (!this.f53920e) {
                this.f53920e = true;
                this.f53916a.onComplete();
            }
        }
    }

    public bf(ObservableSource<T> observableSource, BiFunction<T, T, T> biFunction) {
        super(observableSource);
        this.f59035b = biFunction;
    }

    public void subscribeActual(Observer<? super T> observer) {
        this.a.subscribe(new C17472a(observer, this.f59035b));
    }
}
