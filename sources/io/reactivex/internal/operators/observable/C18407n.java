package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.C3960g;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiConsumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.Callable;

/* renamed from: io.reactivex.internal.operators.observable.n */
public final class C18407n<T, U> extends C3960g<U> implements FuseToObservable<U> {
    /* renamed from: a */
    final ObservableSource<T> f57294a;
    /* renamed from: b */
    final Callable<? extends U> f57295b;
    /* renamed from: c */
    final BiConsumer<? super U, ? super T> f57296c;

    /* renamed from: io.reactivex.internal.operators.observable.n$a */
    static final class C17494a<T, U> implements Observer<T>, Disposable {
        /* renamed from: a */
        final SingleObserver<? super U> f54008a;
        /* renamed from: b */
        final BiConsumer<? super U, ? super T> f54009b;
        /* renamed from: c */
        final U f54010c;
        /* renamed from: d */
        Disposable f54011d;
        /* renamed from: e */
        boolean f54012e;

        C17494a(SingleObserver<? super U> singleObserver, U u, BiConsumer<? super U, ? super T> biConsumer) {
            this.f54008a = singleObserver;
            this.f54009b = biConsumer;
            this.f54010c = u;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f54011d, disposable)) {
                this.f54011d = disposable;
                this.f54008a.onSubscribe(this);
            }
        }

        public void dispose() {
            this.f54011d.dispose();
        }

        public boolean isDisposed() {
            return this.f54011d.isDisposed();
        }

        public void onNext(T t) {
            if (!this.f54012e) {
                try {
                    this.f54009b.accept(this.f54010c, t);
                } catch (T t2) {
                    this.f54011d.dispose();
                    onError(t2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f54012e) {
                C2667a.a(th);
                return;
            }
            this.f54012e = true;
            this.f54008a.onError(th);
        }

        public void onComplete() {
            if (!this.f54012e) {
                this.f54012e = true;
                this.f54008a.onSuccess(this.f54010c);
            }
        }
    }

    public C18407n(ObservableSource<T> observableSource, Callable<? extends U> callable, BiConsumer<? super U, ? super T> biConsumer) {
        this.f57294a = observableSource;
        this.f57295b = callable;
        this.f57296c = biConsumer;
    }

    /* renamed from: a */
    protected void m66526a(SingleObserver<? super U> singleObserver) {
        try {
            this.f57294a.subscribe(new C17494a(singleObserver, C15684a.m58895a(this.f57295b.call(), "The initialSupplier returned a null value"), this.f57296c));
        } catch (Throwable th) {
            EmptyDisposable.error(th, (SingleObserver) singleObserver);
        }
    }

    public C3959e<U> fuseToObservable() {
        return C2667a.a(new C19024m(this.f57294a, this.f57295b, this.f57296c));
    }
}
