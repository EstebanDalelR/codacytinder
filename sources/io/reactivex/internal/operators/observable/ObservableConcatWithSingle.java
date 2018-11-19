package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableConcatWithSingle<T> extends C18394a<T, T> {
    /* renamed from: b */
    final SingleSource<? extends T> f58918b;

    static final class ConcatWithObserver<T> extends AtomicReference<Disposable> implements Observer<T>, SingleObserver<T>, Disposable {
        private static final long serialVersionUID = -1953724749712440952L;
        /* renamed from: a */
        final Observer<? super T> f53422a;
        /* renamed from: b */
        SingleSource<? extends T> f53423b;
        /* renamed from: c */
        boolean f53424c;

        ConcatWithObserver(Observer<? super T> observer, SingleSource<? extends T> singleSource) {
            this.f53422a = observer;
            this.f53423b = singleSource;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable) != null && this.f53424c == null) {
                this.f53422a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            this.f53422a.onNext(t);
        }

        public void onSuccess(T t) {
            this.f53422a.onNext(t);
            this.f53422a.onComplete();
        }

        public void onError(Throwable th) {
            this.f53422a.onError(th);
        }

        public void onComplete() {
            this.f53424c = true;
            DisposableHelper.replace(this, null);
            SingleSource singleSource = this.f53423b;
            this.f53423b = null;
            singleSource.subscribe(this);
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }
    }

    public ObservableConcatWithSingle(C3959e<T> c3959e, SingleSource<? extends T> singleSource) {
        super(c3959e);
        this.f58918b = singleSource;
    }

    protected void subscribeActual(Observer<? super T> observer) {
        this.a.subscribe(new ConcatWithObserver(observer, this.f58918b));
    }
}
