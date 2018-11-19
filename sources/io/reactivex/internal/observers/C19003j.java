package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.util.C15742i;
import io.reactivex.internal.util.ObservableQueueDrain;

/* renamed from: io.reactivex.internal.observers.j */
public abstract class C19003j<T, U, V> extends C18345l implements Observer<T>, ObservableQueueDrain<U, V> {
    /* renamed from: a */
    protected final Observer<? super V> f58790a;
    /* renamed from: b */
    protected final SimplePlainQueue<U> f58791b;
    /* renamed from: c */
    protected volatile boolean f58792c;
    /* renamed from: d */
    protected volatile boolean f58793d;
    /* renamed from: e */
    protected Throwable f58794e;

    public void accept(Observer<? super V> observer, U u) {
    }

    public C19003j(Observer<? super V> observer, SimplePlainQueue<U> simplePlainQueue) {
        this.f58790a = observer;
        this.f58791b = simplePlainQueue;
    }

    public final boolean cancelled() {
        return this.f58792c;
    }

    public final boolean done() {
        return this.f58793d;
    }

    public final boolean enter() {
        return this.f.getAndIncrement() == 0;
    }

    /* renamed from: a */
    public final boolean m67552a() {
        return this.f.get() == 0 && this.f.compareAndSet(0, 1);
    }

    /* renamed from: a */
    protected final void m67551a(U u, boolean z, Disposable disposable) {
        Observer observer = this.f58790a;
        SimplePlainQueue simplePlainQueue = this.f58791b;
        if (this.f.get() == 0 && this.f.compareAndSet(0, 1)) {
            accept(observer, u);
            if (leave(-1) == null) {
                return;
            }
        }
        simplePlainQueue.offer(u);
        if (enter() == null) {
            return;
        }
        C15742i.m58996a(simplePlainQueue, observer, z, disposable, this);
    }

    /* renamed from: b */
    protected final void m67553b(U u, boolean z, Disposable disposable) {
        Observer observer = this.f58790a;
        SimplePlainQueue simplePlainQueue = this.f58791b;
        if (this.f.get() != 0 || !this.f.compareAndSet(0, 1)) {
            simplePlainQueue.offer(u);
            if (enter() == null) {
                return;
            }
        } else if (simplePlainQueue.isEmpty()) {
            accept(observer, u);
            if (leave(-1) == null) {
                return;
            }
        } else {
            simplePlainQueue.offer(u);
        }
        C15742i.m58996a(simplePlainQueue, observer, z, disposable, this);
    }

    public final Throwable error() {
        return this.f58794e;
    }

    public final int leave(int i) {
        return this.f.addAndGet(i);
    }
}
