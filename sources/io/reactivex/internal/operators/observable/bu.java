package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.C3960g;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.p079d.C2667a;
import java.util.Collection;
import java.util.concurrent.Callable;

public final class bu<T, U extends Collection<? super T>> extends C3960g<U> implements FuseToObservable<U> {
    /* renamed from: a */
    final ObservableSource<T> f57271a;
    /* renamed from: b */
    final Callable<U> f57272b;

    /* renamed from: io.reactivex.internal.operators.observable.bu$a */
    static final class C17487a<T, U extends Collection<? super T>> implements Observer<T>, Disposable {
        /* renamed from: a */
        final SingleObserver<? super U> f53979a;
        /* renamed from: b */
        U f53980b;
        /* renamed from: c */
        Disposable f53981c;

        C17487a(SingleObserver<? super U> singleObserver, U u) {
            this.f53979a = singleObserver;
            this.f53980b = u;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53981c, disposable)) {
                this.f53981c = disposable;
                this.f53979a.onSubscribe(this);
            }
        }

        public void dispose() {
            this.f53981c.dispose();
        }

        public boolean isDisposed() {
            return this.f53981c.isDisposed();
        }

        public void onNext(T t) {
            this.f53980b.add(t);
        }

        public void onError(Throwable th) {
            this.f53980b = null;
            this.f53979a.onError(th);
        }

        public void onComplete() {
            Collection collection = this.f53980b;
            this.f53980b = null;
            this.f53979a.onSuccess(collection);
        }
    }

    public bu(ObservableSource<T> observableSource, int i) {
        this.f57271a = observableSource;
        this.f57272b = Functions.m58876a(i);
    }

    public bu(ObservableSource<T> observableSource, Callable<U> callable) {
        this.f57271a = observableSource;
        this.f57272b = callable;
    }

    /* renamed from: a */
    public void m66519a(SingleObserver<? super U> singleObserver) {
        try {
            this.f57271a.subscribe(new C17487a(singleObserver, (Collection) C15684a.m58895a(this.f57272b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C15678a.m58850b(th);
            EmptyDisposable.error(th, (SingleObserver) singleObserver);
        }
    }

    public C3959e<U> fuseToObservable() {
        return C2667a.a(new bt(this.f57271a, this.f57272b));
    }
}
