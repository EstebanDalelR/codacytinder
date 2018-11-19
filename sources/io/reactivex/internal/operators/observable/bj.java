package io.reactivex.internal.operators.observable;

import io.reactivex.C3960g;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.p079d.C2667a;
import java.util.NoSuchElementException;

public final class bj<T> extends C3960g<T> {
    /* renamed from: a */
    final ObservableSource<? extends T> f57269a;
    /* renamed from: b */
    final T f57270b;

    /* renamed from: io.reactivex.internal.operators.observable.bj$a */
    static final class C17475a<T> implements Observer<T>, Disposable {
        /* renamed from: a */
        final SingleObserver<? super T> f53930a;
        /* renamed from: b */
        final T f53931b;
        /* renamed from: c */
        Disposable f53932c;
        /* renamed from: d */
        T f53933d;
        /* renamed from: e */
        boolean f53934e;

        C17475a(SingleObserver<? super T> singleObserver, T t) {
            this.f53930a = singleObserver;
            this.f53931b = t;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53932c, disposable)) {
                this.f53932c = disposable;
                this.f53930a.onSubscribe(this);
            }
        }

        public void dispose() {
            this.f53932c.dispose();
        }

        public boolean isDisposed() {
            return this.f53932c.isDisposed();
        }

        public void onNext(T t) {
            if (!this.f53934e) {
                if (this.f53933d != null) {
                    this.f53934e = true;
                    this.f53932c.dispose();
                    this.f53930a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f53933d = t;
            }
        }

        public void onError(Throwable th) {
            if (this.f53934e) {
                C2667a.a(th);
                return;
            }
            this.f53934e = true;
            this.f53930a.onError(th);
        }

        public void onComplete() {
            if (!this.f53934e) {
                this.f53934e = true;
                Object obj = this.f53933d;
                this.f53933d = null;
                if (obj == null) {
                    obj = this.f53931b;
                }
                if (obj != null) {
                    this.f53930a.onSuccess(obj);
                } else {
                    this.f53930a.onError(new NoSuchElementException());
                }
            }
        }
    }

    public bj(ObservableSource<? extends T> observableSource, T t) {
        this.f57269a = observableSource;
        this.f57270b = t;
    }

    /* renamed from: a */
    public void m66518a(SingleObserver<? super T> singleObserver) {
        this.f57269a.subscribe(new C17475a(singleObserver, this.f57270b));
    }
}
