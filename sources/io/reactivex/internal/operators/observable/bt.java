package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.functions.Functions;
import java.util.Collection;
import java.util.concurrent.Callable;

public final class bt<T, U extends Collection<? super T>> extends C18394a<T, U> {
    /* renamed from: b */
    final Callable<U> f59047b;

    /* renamed from: io.reactivex.internal.operators.observable.bt$a */
    static final class C17486a<T, U extends Collection<? super T>> implements Observer<T>, Disposable {
        /* renamed from: a */
        U f53976a;
        /* renamed from: b */
        final Observer<? super U> f53977b;
        /* renamed from: c */
        Disposable f53978c;

        C17486a(Observer<? super U> observer, U u) {
            this.f53977b = observer;
            this.f53976a = u;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53978c, disposable)) {
                this.f53978c = disposable;
                this.f53977b.onSubscribe(this);
            }
        }

        public void dispose() {
            this.f53978c.dispose();
        }

        public boolean isDisposed() {
            return this.f53978c.isDisposed();
        }

        public void onNext(T t) {
            this.f53976a.add(t);
        }

        public void onError(Throwable th) {
            this.f53976a = null;
            this.f53977b.onError(th);
        }

        public void onComplete() {
            Collection collection = this.f53976a;
            this.f53976a = null;
            this.f53977b.onNext(collection);
            this.f53977b.onComplete();
        }
    }

    public bt(ObservableSource<T> observableSource, int i) {
        super(observableSource);
        this.f59047b = Functions.m58876a(i);
    }

    public bt(ObservableSource<T> observableSource, Callable<U> callable) {
        super(observableSource);
        this.f59047b = callable;
    }

    public void subscribeActual(Observer<? super U> observer) {
        try {
            this.a.subscribe(new C17486a(observer, (Collection) C15684a.m58895a(this.f59047b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C15678a.m58850b(th);
            EmptyDisposable.error(th, (Observer) observer);
        }
    }
}
