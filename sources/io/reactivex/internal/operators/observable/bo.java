package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.p079d.C2667a;

public final class bo<T> extends C18394a<T, T> {
    /* renamed from: b */
    final long f59042b;

    /* renamed from: io.reactivex.internal.operators.observable.bo$a */
    static final class C17481a<T> implements Observer<T>, Disposable {
        /* renamed from: a */
        final Observer<? super T> f53956a;
        /* renamed from: b */
        boolean f53957b;
        /* renamed from: c */
        Disposable f53958c;
        /* renamed from: d */
        long f53959d;

        C17481a(Observer<? super T> observer, long j) {
            this.f53956a = observer;
            this.f53959d = j;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53958c, disposable)) {
                this.f53958c = disposable;
                if (this.f53959d == 0) {
                    this.f53957b = true;
                    disposable.dispose();
                    EmptyDisposable.complete(this.f53956a);
                    return;
                }
                this.f53956a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            if (!this.f53957b) {
                long j = this.f53959d;
                this.f53959d = j - 1;
                if (j > 0) {
                    Object obj = this.f53959d == 0 ? 1 : null;
                    this.f53956a.onNext(t);
                    if (obj != null) {
                        onComplete();
                    }
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f53957b) {
                C2667a.a(th);
                return;
            }
            this.f53957b = true;
            this.f53958c.dispose();
            this.f53956a.onError(th);
        }

        public void onComplete() {
            if (!this.f53957b) {
                this.f53957b = true;
                this.f53958c.dispose();
                this.f53956a.onComplete();
            }
        }

        public void dispose() {
            this.f53958c.dispose();
        }

        public boolean isDisposed() {
            return this.f53958c.isDisposed();
        }
    }

    public bo(ObservableSource<T> observableSource, long j) {
        super(observableSource);
        this.f59042b = j;
    }

    protected void subscribeActual(Observer<? super T> observer) {
        this.a.subscribe(new C17481a(observer, this.f59042b));
    }
}
