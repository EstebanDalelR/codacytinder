package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.Callable;

public final class bg<T, R> extends C18394a<T, R> {
    /* renamed from: b */
    final BiFunction<R, ? super T, R> f59036b;
    /* renamed from: c */
    final Callable<R> f59037c;

    /* renamed from: io.reactivex.internal.operators.observable.bg$a */
    static final class C17473a<T, R> implements Observer<T>, Disposable {
        /* renamed from: a */
        final Observer<? super R> f53921a;
        /* renamed from: b */
        final BiFunction<R, ? super T, R> f53922b;
        /* renamed from: c */
        R f53923c;
        /* renamed from: d */
        Disposable f53924d;
        /* renamed from: e */
        boolean f53925e;

        C17473a(Observer<? super R> observer, BiFunction<R, ? super T, R> biFunction, R r) {
            this.f53921a = observer;
            this.f53922b = biFunction;
            this.f53923c = r;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53924d, disposable)) {
                this.f53924d = disposable;
                this.f53921a.onSubscribe(this);
                this.f53921a.onNext(this.f53923c);
            }
        }

        public void dispose() {
            this.f53924d.dispose();
        }

        public boolean isDisposed() {
            return this.f53924d.isDisposed();
        }

        public void onNext(T t) {
            if (!this.f53925e) {
                try {
                    t = C15684a.m58895a(this.f53922b.apply(this.f53923c, t), "The accumulator returned a null value");
                    this.f53923c = t;
                    this.f53921a.onNext(t);
                } catch (T t2) {
                    C15678a.m58850b(t2);
                    this.f53924d.dispose();
                    onError(t2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f53925e) {
                C2667a.a(th);
                return;
            }
            this.f53925e = true;
            this.f53921a.onError(th);
        }

        public void onComplete() {
            if (!this.f53925e) {
                this.f53925e = true;
                this.f53921a.onComplete();
            }
        }
    }

    public bg(ObservableSource<T> observableSource, Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        super(observableSource);
        this.f59036b = biFunction;
        this.f59037c = callable;
    }

    public void subscribeActual(Observer<? super R> observer) {
        try {
            this.a.subscribe(new C17473a(observer, this.f59036b, C15684a.m58895a(this.f59037c.call(), "The seed supplied is null")));
        } catch (Throwable th) {
            C15678a.m58850b(th);
            EmptyDisposable.error(th, (Observer) observer);
        }
    }
}
