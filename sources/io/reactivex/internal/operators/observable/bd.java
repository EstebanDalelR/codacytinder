package io.reactivex.internal.operators.observable;

import io.reactivex.C3960g;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.p079d.C2667a;

public final class bd<T, R> extends C3960g<R> {
    /* renamed from: a */
    final ObservableSource<T> f57262a;
    /* renamed from: b */
    final R f57263b;
    /* renamed from: c */
    final BiFunction<R, ? super T, R> f57264c;

    /* renamed from: io.reactivex.internal.operators.observable.bd$a */
    static final class C17471a<T, R> implements Observer<T>, Disposable {
        /* renamed from: a */
        final SingleObserver<? super R> f53912a;
        /* renamed from: b */
        final BiFunction<R, ? super T, R> f53913b;
        /* renamed from: c */
        R f53914c;
        /* renamed from: d */
        Disposable f53915d;

        C17471a(SingleObserver<? super R> singleObserver, BiFunction<R, ? super T, R> biFunction, R r) {
            this.f53912a = singleObserver;
            this.f53914c = r;
            this.f53913b = biFunction;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53915d, disposable)) {
                this.f53915d = disposable;
                this.f53912a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            Object obj = this.f53914c;
            if (obj != null) {
                try {
                    this.f53914c = C15684a.m58895a(this.f53913b.apply(obj, t), "The reducer returned a null value");
                } catch (T t2) {
                    C15678a.m58850b(t2);
                    this.f53915d.dispose();
                    onError(t2);
                }
            }
        }

        public void onError(Throwable th) {
            Object obj = this.f53914c;
            this.f53914c = null;
            if (obj != null) {
                this.f53912a.onError(th);
            } else {
                C2667a.a(th);
            }
        }

        public void onComplete() {
            Object obj = this.f53914c;
            this.f53914c = null;
            if (obj != null) {
                this.f53912a.onSuccess(obj);
            }
        }

        public void dispose() {
            this.f53915d.dispose();
        }

        public boolean isDisposed() {
            return this.f53915d.isDisposed();
        }
    }

    public bd(ObservableSource<T> observableSource, R r, BiFunction<R, ? super T, R> biFunction) {
        this.f57262a = observableSource;
        this.f57263b = r;
        this.f57264c = biFunction;
    }

    /* renamed from: a */
    protected void m66515a(SingleObserver<? super R> singleObserver) {
        this.f57262a.subscribe(new C17471a(singleObserver, this.f57264c, this.f57263b));
    }
}
