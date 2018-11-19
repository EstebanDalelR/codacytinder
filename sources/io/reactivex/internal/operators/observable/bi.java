package io.reactivex.internal.operators.observable;

import io.reactivex.C3958c;
import io.reactivex.MaybeObserver;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.p079d.C2667a;

public final class bi<T> extends C3958c<T> {
    /* renamed from: a */
    final ObservableSource<T> f57268a;

    /* renamed from: io.reactivex.internal.operators.observable.bi$a */
    static final class C17474a<T> implements Observer<T>, Disposable {
        /* renamed from: a */
        final MaybeObserver<? super T> f53926a;
        /* renamed from: b */
        Disposable f53927b;
        /* renamed from: c */
        T f53928c;
        /* renamed from: d */
        boolean f53929d;

        C17474a(MaybeObserver<? super T> maybeObserver) {
            this.f53926a = maybeObserver;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53927b, disposable)) {
                this.f53927b = disposable;
                this.f53926a.onSubscribe(this);
            }
        }

        public void dispose() {
            this.f53927b.dispose();
        }

        public boolean isDisposed() {
            return this.f53927b.isDisposed();
        }

        public void onNext(T t) {
            if (!this.f53929d) {
                if (this.f53928c != null) {
                    this.f53929d = true;
                    this.f53927b.dispose();
                    this.f53926a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f53928c = t;
            }
        }

        public void onError(Throwable th) {
            if (this.f53929d) {
                C2667a.a(th);
                return;
            }
            this.f53929d = true;
            this.f53926a.onError(th);
        }

        public void onComplete() {
            if (!this.f53929d) {
                this.f53929d = true;
                Object obj = this.f53928c;
                this.f53928c = null;
                if (obj == null) {
                    this.f53926a.onComplete();
                } else {
                    this.f53926a.onSuccess(obj);
                }
            }
        }
    }

    public bi(ObservableSource<T> observableSource) {
        this.f57268a = observableSource;
    }

    /* renamed from: a */
    public void m66517a(MaybeObserver<? super T> maybeObserver) {
        this.f57268a.subscribe(new C17474a(maybeObserver));
    }
}
