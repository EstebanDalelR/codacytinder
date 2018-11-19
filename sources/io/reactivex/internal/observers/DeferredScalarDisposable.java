package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.p079d.C2667a;

public class DeferredScalarDisposable<T> extends BasicIntQueueDisposable<T> {
    private static final long serialVersionUID = -5502432239815349361L;
    /* renamed from: a */
    protected final Observer<? super T> f59431a;
    /* renamed from: b */
    protected T f59432b;

    public DeferredScalarDisposable(Observer<? super T> observer) {
        this.f59431a = observer;
    }

    public final int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    /* renamed from: a */
    public final void m68178a(T t) {
        int i = get();
        if ((i & 54) == 0) {
            if (i == 8) {
                this.f59432b = t;
                lazySet(16);
            } else {
                lazySet(2);
            }
            Observer observer = this.f59431a;
            observer.onNext(t);
            if (get() != 4) {
                observer.onComplete();
            }
        }
    }

    /* renamed from: a */
    public final void m68179a(Throwable th) {
        if ((get() & 54) != 0) {
            C2667a.a(th);
            return;
        }
        lazySet(2);
        this.f59431a.onError(th);
    }

    /* renamed from: a */
    public final void m68177a() {
        if ((get() & 54) == 0) {
            lazySet(2);
            this.f59431a.onComplete();
        }
    }

    @Nullable
    public final T poll() throws Exception {
        if (get() != 16) {
            return null;
        }
        T t = this.f59432b;
        this.f59432b = null;
        lazySet(32);
        return t;
    }

    public final boolean isEmpty() {
        return get() != 16;
    }

    public final void clear() {
        lazySet(32);
        this.f59432b = null;
    }

    public void dispose() {
        set(4);
        this.f59432b = null;
    }

    public final boolean isDisposed() {
        return get() == 4;
    }
}
