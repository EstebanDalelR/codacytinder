package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ObservableUsing<T, D> extends C3959e<T> {
    /* renamed from: a */
    final Callable<? extends D> f57221a;
    /* renamed from: b */
    final Function<? super D, ? extends ObservableSource<? extends T>> f57222b;
    /* renamed from: c */
    final Consumer<? super D> f57223c;
    /* renamed from: d */
    final boolean f57224d;

    static final class UsingObserver<T, D> extends AtomicBoolean implements Observer<T>, Disposable {
        private static final long serialVersionUID = 5904473792286235046L;
        /* renamed from: a */
        final Observer<? super T> f53798a;
        /* renamed from: b */
        final D f53799b;
        /* renamed from: c */
        final Consumer<? super D> f53800c;
        /* renamed from: d */
        final boolean f53801d;
        /* renamed from: e */
        Disposable f53802e;

        UsingObserver(Observer<? super T> observer, D d, Consumer<? super D> consumer, boolean z) {
            this.f53798a = observer;
            this.f53799b = d;
            this.f53800c = consumer;
            this.f53801d = z;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53802e, disposable)) {
                this.f53802e = disposable;
                this.f53798a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            this.f53798a.onNext(t);
        }

        public void onError(Throwable th) {
            if (this.f53801d) {
                if (compareAndSet(false, true)) {
                    try {
                        this.f53800c.accept(this.f53799b);
                    } catch (Throwable th2) {
                        C15678a.m58850b(th2);
                        th = new CompositeException(th, th2);
                    }
                }
                this.f53802e.dispose();
                this.f53798a.onError(th);
                return;
            }
            this.f53798a.onError(th);
            this.f53802e.dispose();
            m63689a();
        }

        public void onComplete() {
            if (this.f53801d) {
                if (compareAndSet(false, true)) {
                    try {
                        this.f53800c.accept(this.f53799b);
                    } catch (Throwable th) {
                        C15678a.m58850b(th);
                        this.f53798a.onError(th);
                        return;
                    }
                }
                this.f53802e.dispose();
                this.f53798a.onComplete();
            } else {
                this.f53798a.onComplete();
                this.f53802e.dispose();
                m63689a();
            }
        }

        public void dispose() {
            m63689a();
            this.f53802e.dispose();
        }

        public boolean isDisposed() {
            return get();
        }

        /* renamed from: a */
        void m63689a() {
            if (compareAndSet(false, true)) {
                try {
                    this.f53800c.accept(this.f53799b);
                } catch (Throwable th) {
                    C15678a.m58850b(th);
                    C2667a.a(th);
                }
            }
        }
    }

    public ObservableUsing(Callable<? extends D> callable, Function<? super D, ? extends ObservableSource<? extends T>> function, Consumer<? super D> consumer, boolean z) {
        this.f57221a = callable;
        this.f57222b = function;
        this.f57223c = consumer;
        this.f57224d = z;
    }

    public void subscribeActual(Observer<? super T> observer) {
        try {
            Object call = this.f57221a.call();
            try {
                ((ObservableSource) C15684a.m58895a(this.f57222b.apply(call), "The sourceSupplier returned a null ObservableSource")).subscribe(new UsingObserver(observer, call, this.f57223c, this.f57224d));
            } catch (Throwable th) {
                C15678a.m58850b(th);
                EmptyDisposable.error(new CompositeException(th, th), (Observer) observer);
            }
        } catch (Throwable th2) {
            C15678a.m58850b(th2);
            EmptyDisposable.error(th2, (Observer) observer);
        }
    }
}
