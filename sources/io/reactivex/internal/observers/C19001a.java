package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.p079d.C2667a;

/* renamed from: io.reactivex.internal.observers.a */
public abstract class C19001a<T, R> implements Observer<T>, QueueDisposable<R> {
    /* renamed from: a */
    protected final Observer<? super R> f58785a;
    /* renamed from: b */
    protected Disposable f58786b;
    /* renamed from: c */
    protected QueueDisposable<T> f58787c;
    /* renamed from: d */
    protected boolean f58788d;
    /* renamed from: e */
    protected int f58789e;

    /* renamed from: a */
    protected boolean m67549a() {
        return true;
    }

    /* renamed from: b */
    protected void m67550b() {
    }

    public C19001a(Observer<? super R> observer) {
        this.f58785a = observer;
    }

    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.f58786b, disposable)) {
            this.f58786b = disposable;
            if (disposable instanceof QueueDisposable) {
                this.f58787c = (QueueDisposable) disposable;
            }
            if (m67549a() != null) {
                this.f58785a.onSubscribe(this);
                m67550b();
            }
        }
    }

    public void onError(Throwable th) {
        if (this.f58788d) {
            C2667a.a(th);
            return;
        }
        this.f58788d = true;
        this.f58785a.onError(th);
    }

    /* renamed from: a */
    protected final void m67548a(Throwable th) {
        C15678a.m58850b(th);
        this.f58786b.dispose();
        onError(th);
    }

    public void onComplete() {
        if (!this.f58788d) {
            this.f58788d = true;
            this.f58785a.onComplete();
        }
    }

    /* renamed from: a */
    protected final int m67547a(int i) {
        QueueDisposable queueDisposable = this.f58787c;
        if (queueDisposable == null || (i & 4) != 0) {
            return 0;
        }
        i = queueDisposable.requestFusion(i);
        if (i != 0) {
            this.f58789e = i;
        }
        return i;
    }

    public void dispose() {
        this.f58786b.dispose();
    }

    public boolean isDisposed() {
        return this.f58786b.isDisposed();
    }

    public boolean isEmpty() {
        return this.f58787c.isEmpty();
    }

    public void clear() {
        this.f58787c.clear();
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final boolean offer(R r, R r2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
