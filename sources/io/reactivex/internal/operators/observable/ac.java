package io.reactivex.internal.operators.observable;

import io.reactivex.C3958c;
import io.reactivex.C3959e;
import io.reactivex.MaybeObserver;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.p079d.C2667a;

public final class ac<T> extends C3958c<T> implements FuseToObservable<T> {
    /* renamed from: a */
    final ObservableSource<T> f57231a;
    /* renamed from: b */
    final long f57232b;

    /* renamed from: io.reactivex.internal.operators.observable.ac$a */
    static final class C17457a<T> implements Observer<T>, Disposable {
        /* renamed from: a */
        final MaybeObserver<? super T> f53857a;
        /* renamed from: b */
        final long f53858b;
        /* renamed from: c */
        Disposable f53859c;
        /* renamed from: d */
        long f53860d;
        /* renamed from: e */
        boolean f53861e;

        C17457a(MaybeObserver<? super T> maybeObserver, long j) {
            this.f53857a = maybeObserver;
            this.f53858b = j;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53859c, disposable)) {
                this.f53859c = disposable;
                this.f53857a.onSubscribe(this);
            }
        }

        public void dispose() {
            this.f53859c.dispose();
        }

        public boolean isDisposed() {
            return this.f53859c.isDisposed();
        }

        public void onNext(T t) {
            if (!this.f53861e) {
                long j = this.f53860d;
                if (j == this.f53858b) {
                    this.f53861e = true;
                    this.f53859c.dispose();
                    this.f53857a.onSuccess(t);
                    return;
                }
                this.f53860d = j + 1;
            }
        }

        public void onError(Throwable th) {
            if (this.f53861e) {
                C2667a.a(th);
                return;
            }
            this.f53861e = true;
            this.f53857a.onError(th);
        }

        public void onComplete() {
            if (!this.f53861e) {
                this.f53861e = true;
                this.f53857a.onComplete();
            }
        }
    }

    public ac(ObservableSource<T> observableSource, long j) {
        this.f57231a = observableSource;
        this.f57232b = j;
    }

    /* renamed from: a */
    public void m66508a(MaybeObserver<? super T> maybeObserver) {
        this.f57231a.subscribe(new C17457a(maybeObserver, this.f57232b));
    }

    public C3959e<T> fuseToObservable() {
        return C2667a.a(new ab(this.f57231a, this.f57232b, null, false));
    }
}
