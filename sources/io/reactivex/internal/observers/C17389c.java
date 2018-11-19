package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.C15736b;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;

/* renamed from: io.reactivex.internal.observers.c */
public abstract class C17389c<T> extends CountDownLatch implements Observer<T>, Disposable {
    /* renamed from: a */
    T f53156a;
    /* renamed from: b */
    Throwable f53157b;
    /* renamed from: c */
    Disposable f53158c;
    /* renamed from: d */
    volatile boolean f53159d;

    public C17389c() {
        super(1);
    }

    public final void onSubscribe(Disposable disposable) {
        this.f53158c = disposable;
        if (this.f53159d) {
            disposable.dispose();
        }
    }

    public final void onComplete() {
        countDown();
    }

    public final void dispose() {
        this.f53159d = true;
        Disposable disposable = this.f53158c;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    public final boolean isDisposed() {
        return this.f53159d;
    }

    /* renamed from: a */
    public final T m63481a() {
        if (getCount() != 0) {
            try {
                C15736b.m58971a();
                await();
            } catch (Throwable e) {
                dispose();
                throw ExceptionHelper.m58962a(e);
            }
        }
        Throwable e2 = this.f53157b;
        if (e2 == null) {
            return this.f53156a;
        }
        throw ExceptionHelper.m58962a(e2);
    }
}
