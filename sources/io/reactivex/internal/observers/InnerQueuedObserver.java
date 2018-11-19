package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.util.C15742i;
import java.util.concurrent.atomic.AtomicReference;

public final class InnerQueuedObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
    private static final long serialVersionUID = -5417183359794346637L;
    /* renamed from: a */
    final InnerQueuedObserverSupport<T> f53147a;
    /* renamed from: b */
    final int f53148b;
    /* renamed from: c */
    SimpleQueue<T> f53149c;
    /* renamed from: d */
    volatile boolean f53150d;
    /* renamed from: e */
    int f53151e;

    public InnerQueuedObserver(InnerQueuedObserverSupport<T> innerQueuedObserverSupport, int i) {
        this.f53147a = innerQueuedObserverSupport;
        this.f53148b = i;
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.setOnce(this, disposable)) {
            if (disposable instanceof QueueDisposable) {
                QueueDisposable queueDisposable = (QueueDisposable) disposable;
                int requestFusion = queueDisposable.requestFusion(3);
                if (requestFusion == 1) {
                    this.f53151e = requestFusion;
                    this.f53149c = queueDisposable;
                    this.f53150d = true;
                    this.f53147a.innerComplete(this);
                    return;
                } else if (requestFusion == 2) {
                    this.f53151e = requestFusion;
                    this.f53149c = queueDisposable;
                    return;
                }
            }
            this.f53149c = C15742i.m58995a(-this.f53148b);
        }
    }

    public void onNext(T t) {
        if (this.f53151e == 0) {
            this.f53147a.innerNext(this, t);
        } else {
            this.f53147a.drain();
        }
    }

    public void onError(Throwable th) {
        this.f53147a.innerError(this, th);
    }

    public void onComplete() {
        this.f53147a.innerComplete(this);
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    /* renamed from: a */
    public boolean m63478a() {
        return this.f53150d;
    }

    /* renamed from: b */
    public void m63479b() {
        this.f53150d = true;
    }

    /* renamed from: c */
    public SimpleQueue<T> m63480c() {
        return this.f53149c;
    }
}
