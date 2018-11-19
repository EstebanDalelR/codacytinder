package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.C15736b;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;

/* renamed from: io.reactivex.internal.observers.f */
public final class C17390f<T> extends CountDownLatch implements CompletableObserver, MaybeObserver<T>, SingleObserver<T> {
    /* renamed from: a */
    T f53160a;
    /* renamed from: b */
    Throwable f53161b;
    /* renamed from: c */
    Disposable f53162c;
    /* renamed from: d */
    volatile boolean f53163d;

    public C17390f() {
        super(1);
    }

    /* renamed from: a */
    void m63482a() {
        this.f53163d = true;
        Disposable disposable = this.f53162c;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    public void onSubscribe(Disposable disposable) {
        this.f53162c = disposable;
        if (this.f53163d) {
            disposable.dispose();
        }
    }

    public void onSuccess(T t) {
        this.f53160a = t;
        countDown();
    }

    public void onError(Throwable th) {
        this.f53161b = th;
        countDown();
    }

    public void onComplete() {
        countDown();
    }

    /* renamed from: b */
    public T m63483b() {
        if (getCount() != 0) {
            try {
                C15736b.m58971a();
                await();
            } catch (Throwable e) {
                m63482a();
                throw ExceptionHelper.m58962a(e);
            }
        }
        Throwable e2 = this.f53161b;
        if (e2 == null) {
            return this.f53160a;
        }
        throw ExceptionHelper.m58962a(e2);
    }

    /* renamed from: c */
    public Throwable m63484c() {
        if (getCount() != 0) {
            try {
                C15736b.m58971a();
                await();
            } catch (Throwable e) {
                m63482a();
                return e;
            }
        }
        return this.f53161b;
    }
}
