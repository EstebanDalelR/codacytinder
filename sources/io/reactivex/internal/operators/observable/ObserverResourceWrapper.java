package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class ObserverResourceWrapper<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
    private static final long serialVersionUID = -8612022020200669122L;
    /* renamed from: a */
    final Observer<? super T> f53848a;
    /* renamed from: b */
    final AtomicReference<Disposable> f53849b = new AtomicReference();

    public ObserverResourceWrapper(Observer<? super T> observer) {
        this.f53848a = observer;
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.setOnce(this.f53849b, disposable) != null) {
            this.f53848a.onSubscribe(this);
        }
    }

    public void onNext(T t) {
        this.f53848a.onNext(t);
    }

    public void onError(Throwable th) {
        dispose();
        this.f53848a.onError(th);
    }

    public void onComplete() {
        dispose();
        this.f53848a.onComplete();
    }

    public void dispose() {
        DisposableHelper.dispose(this.f53849b);
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return this.f53849b.get() == DisposableHelper.DISPOSED;
    }

    /* renamed from: a */
    public void m63705a(Disposable disposable) {
        DisposableHelper.set(this, disposable);
    }
}
