package io.reactivex.internal.operators.single;

import io.reactivex.C3959e;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.operators.single.k */
public final class C18422k<T> extends C3959e<T> {
    /* renamed from: a */
    final SingleSource<? extends T> f57343a;

    /* renamed from: io.reactivex.internal.operators.single.k$a */
    static final class C17511a<T> implements SingleObserver<T>, Disposable {
        /* renamed from: a */
        final Observer<? super T> f54090a;
        /* renamed from: b */
        Disposable f54091b;

        C17511a(Observer<? super T> observer) {
            this.f54090a = observer;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f54091b, disposable)) {
                this.f54091b = disposable;
                this.f54090a.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f54090a.onNext(t);
            this.f54090a.onComplete();
        }

        public void onError(Throwable th) {
            this.f54090a.onError(th);
        }

        public void dispose() {
            this.f54091b.dispose();
        }

        public boolean isDisposed() {
            return this.f54091b.isDisposed();
        }
    }

    public C18422k(SingleSource<? extends T> singleSource) {
        this.f57343a = singleSource;
    }

    public void subscribeActual(Observer<? super T> observer) {
        this.f57343a.subscribe(new C17511a(observer));
    }
}
