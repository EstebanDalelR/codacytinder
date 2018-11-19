package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

public final class BlockingObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
    /* renamed from: a */
    public static final Object f53137a = new Object();
    private static final long serialVersionUID = -4875965440900746268L;
    /* renamed from: b */
    final Queue<Object> f53138b;

    public BlockingObserver(Queue<Object> queue) {
        this.f53138b = queue;
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }

    public void onNext(T t) {
        this.f53138b.offer(NotificationLite.next(t));
    }

    public void onError(Throwable th) {
        this.f53138b.offer(NotificationLite.error(th));
    }

    public void onComplete() {
        this.f53138b.offer(NotificationLite.complete());
    }

    public void dispose() {
        if (DisposableHelper.dispose(this)) {
            this.f53138b.offer(f53137a);
        }
    }

    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }
}
