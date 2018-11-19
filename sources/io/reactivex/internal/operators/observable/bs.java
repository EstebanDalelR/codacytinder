package io.reactivex.internal.operators.observable;

import io.reactivex.C15679f;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.schedulers.C15757b;
import java.util.concurrent.TimeUnit;

public final class bs<T> extends C18394a<T, C15757b<T>> {
    /* renamed from: b */
    final C15679f f59045b;
    /* renamed from: c */
    final TimeUnit f59046c;

    /* renamed from: io.reactivex.internal.operators.observable.bs$a */
    static final class C17485a<T> implements Observer<T>, Disposable {
        /* renamed from: a */
        final Observer<? super C15757b<T>> f53971a;
        /* renamed from: b */
        final TimeUnit f53972b;
        /* renamed from: c */
        final C15679f f53973c;
        /* renamed from: d */
        long f53974d;
        /* renamed from: e */
        Disposable f53975e;

        C17485a(Observer<? super C15757b<T>> observer, TimeUnit timeUnit, C15679f c15679f) {
            this.f53971a = observer;
            this.f53973c = c15679f;
            this.f53972b = timeUnit;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53975e, disposable)) {
                this.f53975e = disposable;
                this.f53974d = this.f53973c.m58851a(this.f53972b);
                this.f53971a.onSubscribe(this);
            }
        }

        public void dispose() {
            this.f53975e.dispose();
        }

        public boolean isDisposed() {
            return this.f53975e.isDisposed();
        }

        public void onNext(T t) {
            long a = this.f53973c.m58851a(this.f53972b);
            long j = this.f53974d;
            this.f53974d = a;
            this.f53971a.onNext(new C15757b(t, a - j, this.f53972b));
        }

        public void onError(Throwable th) {
            this.f53971a.onError(th);
        }

        public void onComplete() {
            this.f53971a.onComplete();
        }
    }

    public bs(ObservableSource<T> observableSource, TimeUnit timeUnit, C15679f c15679f) {
        super(observableSource);
        this.f59045b = c15679f;
        this.f59046c = timeUnit;
    }

    public void subscribeActual(Observer<? super C15757b<T>> observer) {
        this.a.subscribe(new C17485a(observer, this.f59046c, this.f59045b));
    }
}
