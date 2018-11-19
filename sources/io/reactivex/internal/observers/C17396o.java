package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* renamed from: io.reactivex.internal.observers.o */
public final class C17396o<T> implements CompletableObserver, Subscription {
    /* renamed from: a */
    final Subscriber<? super T> f53176a;
    /* renamed from: b */
    Disposable f53177b;

    public void request(long j) {
    }

    public C17396o(Subscriber<? super T> subscriber) {
        this.f53176a = subscriber;
    }

    public void onComplete() {
        this.f53176a.onComplete();
    }

    public void onError(Throwable th) {
        this.f53176a.onError(th);
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.f53177b, disposable)) {
            this.f53177b = disposable;
            this.f53176a.onSubscribe(this);
        }
    }

    public void cancel() {
        this.f53177b.dispose();
    }
}
