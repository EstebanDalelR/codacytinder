package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.p079d.C2667a;

public final class ah<T, R> extends C18394a<T, R> {
    /* renamed from: b */
    final Function<? super T, ? extends Iterable<? extends R>> f59026b;

    /* renamed from: io.reactivex.internal.operators.observable.ah$a */
    static final class C17459a<T, R> implements Observer<T>, Disposable {
        /* renamed from: a */
        final Observer<? super R> f53868a;
        /* renamed from: b */
        final Function<? super T, ? extends Iterable<? extends R>> f53869b;
        /* renamed from: c */
        Disposable f53870c;

        C17459a(Observer<? super R> observer, Function<? super T, ? extends Iterable<? extends R>> function) {
            this.f53868a = observer;
            this.f53869b = function;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53870c, disposable)) {
                this.f53870c = disposable;
                this.f53868a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            if (this.f53870c != DisposableHelper.DISPOSED) {
                try {
                    Observer observer = this.f53868a;
                    for (Object a : (Iterable) this.f53869b.apply(t)) {
                        try {
                            try {
                                observer.onNext(C15684a.m58895a(a, "The iterator returned a null value"));
                            } catch (T t2) {
                                C15678a.m58850b(t2);
                                this.f53870c.dispose();
                                onError(t2);
                                return;
                            }
                        } catch (T t22) {
                            C15678a.m58850b(t22);
                            this.f53870c.dispose();
                            onError(t22);
                            return;
                        }
                    }
                } catch (T t222) {
                    C15678a.m58850b(t222);
                    this.f53870c.dispose();
                    onError(t222);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f53870c == DisposableHelper.DISPOSED) {
                C2667a.a(th);
                return;
            }
            this.f53870c = DisposableHelper.DISPOSED;
            this.f53868a.onError(th);
        }

        public void onComplete() {
            if (this.f53870c != DisposableHelper.DISPOSED) {
                this.f53870c = DisposableHelper.DISPOSED;
                this.f53868a.onComplete();
            }
        }

        public boolean isDisposed() {
            return this.f53870c.isDisposed();
        }

        public void dispose() {
            this.f53870c.dispose();
            this.f53870c = DisposableHelper.DISPOSED;
        }
    }

    public ah(ObservableSource<T> observableSource, Function<? super T, ? extends Iterable<? extends R>> function) {
        super(observableSource);
        this.f59026b = function;
    }

    protected void subscribeActual(Observer<? super R> observer) {
        this.a.subscribe(new C17459a(observer, this.f59026b));
    }
}
