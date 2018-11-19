package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.C3960g;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.p079d.C2667a;
import java.util.NoSuchElementException;

public final class ad<T> extends C3960g<T> implements FuseToObservable<T> {
    /* renamed from: a */
    final ObservableSource<T> f57233a;
    /* renamed from: b */
    final long f57234b;
    /* renamed from: c */
    final T f57235c;

    /* renamed from: io.reactivex.internal.operators.observable.ad$a */
    static final class C17458a<T> implements Observer<T>, Disposable {
        /* renamed from: a */
        final SingleObserver<? super T> f53862a;
        /* renamed from: b */
        final long f53863b;
        /* renamed from: c */
        final T f53864c;
        /* renamed from: d */
        Disposable f53865d;
        /* renamed from: e */
        long f53866e;
        /* renamed from: f */
        boolean f53867f;

        C17458a(SingleObserver<? super T> singleObserver, long j, T t) {
            this.f53862a = singleObserver;
            this.f53863b = j;
            this.f53864c = t;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53865d, disposable)) {
                this.f53865d = disposable;
                this.f53862a.onSubscribe(this);
            }
        }

        public void dispose() {
            this.f53865d.dispose();
        }

        public boolean isDisposed() {
            return this.f53865d.isDisposed();
        }

        public void onNext(T t) {
            if (!this.f53867f) {
                long j = this.f53866e;
                if (j == this.f53863b) {
                    this.f53867f = true;
                    this.f53865d.dispose();
                    this.f53862a.onSuccess(t);
                    return;
                }
                this.f53866e = j + 1;
            }
        }

        public void onError(Throwable th) {
            if (this.f53867f) {
                C2667a.a(th);
                return;
            }
            this.f53867f = true;
            this.f53862a.onError(th);
        }

        public void onComplete() {
            if (!this.f53867f) {
                this.f53867f = true;
                Object obj = this.f53864c;
                if (obj != null) {
                    this.f53862a.onSuccess(obj);
                } else {
                    this.f53862a.onError(new NoSuchElementException());
                }
            }
        }
    }

    public ad(ObservableSource<T> observableSource, long j, T t) {
        this.f57233a = observableSource;
        this.f57234b = j;
        this.f57235c = t;
    }

    /* renamed from: a */
    public void m66509a(SingleObserver<? super T> singleObserver) {
        this.f57233a.subscribe(new C17458a(singleObserver, this.f57234b, this.f57235c));
    }

    public C3959e<T> fuseToObservable() {
        return C2667a.a(new ab(this.f57233a, this.f57234b, this.f57235c, true));
    }
}
