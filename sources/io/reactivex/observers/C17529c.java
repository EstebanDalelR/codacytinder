package io.reactivex.observers;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.p079d.C2667a;

/* renamed from: io.reactivex.observers.c */
public final class C17529c<T> implements Observer<T>, Disposable {
    /* renamed from: a */
    final Observer<? super T> f54153a;
    /* renamed from: b */
    Disposable f54154b;
    /* renamed from: c */
    boolean f54155c;

    public C17529c(@NonNull Observer<? super T> observer) {
        this.f54153a = observer;
    }

    public void onSubscribe(@NonNull Disposable disposable) {
        if (DisposableHelper.validate(this.f54154b, disposable)) {
            this.f54154b = disposable;
            try {
                this.f54153a.onSubscribe(this);
            } catch (Disposable disposable2) {
                C15678a.m58850b(disposable2);
                C2667a.a(new CompositeException(th, disposable2));
            }
        }
    }

    public void dispose() {
        this.f54154b.dispose();
    }

    public boolean isDisposed() {
        return this.f54154b.isDisposed();
    }

    public void onNext(@NonNull T t) {
        if (!this.f54155c) {
            if (this.f54154b == null) {
                m63756a();
            } else if (t == null) {
                t = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                try {
                    this.f54154b.dispose();
                    onError(t);
                } catch (Throwable th) {
                    C15678a.m58850b(th);
                    onError(new CompositeException(t, th));
                }
            } else {
                try {
                    this.f54153a.onNext(t);
                } catch (Throwable th2) {
                    C15678a.m58850b(th2);
                    onError(new CompositeException(t, th2));
                }
            }
        }
    }

    /* renamed from: a */
    void m63756a() {
        this.f54155c = true;
        Throwable nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f54153a.onSubscribe(EmptyDisposable.INSTANCE);
            try {
                this.f54153a.onError(nullPointerException);
            } catch (Throwable th) {
                C15678a.m58850b(th);
                C2667a.a(new CompositeException(nullPointerException, th));
            }
        } catch (Throwable th2) {
            C15678a.m58850b(th2);
            C2667a.a(new CompositeException(nullPointerException, th2));
        }
    }

    public void onError(@NonNull Throwable th) {
        if (this.f54155c) {
            C2667a.a(th);
            return;
        }
        this.f54155c = true;
        if (this.f54154b == null) {
            NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
            try {
                this.f54153a.onSubscribe(EmptyDisposable.INSTANCE);
                try {
                    this.f54153a.onError(new CompositeException(th, nullPointerException));
                } catch (Throwable th2) {
                    C15678a.m58850b(th2);
                    C2667a.a(new CompositeException(th, nullPointerException, th2));
                }
                return;
            } catch (Throwable th22) {
                C15678a.m58850b(th22);
                C2667a.a(new CompositeException(th, nullPointerException, th22));
                return;
            }
        }
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        try {
            this.f54153a.onError(th);
        } catch (Throwable th3) {
            C15678a.m58850b(th3);
            C2667a.a(new CompositeException(th, th3));
        }
    }

    public void onComplete() {
        if (!this.f54155c) {
            this.f54155c = true;
            if (this.f54154b == null) {
                m63757b();
                return;
            }
            try {
                this.f54153a.onComplete();
            } catch (Throwable th) {
                C15678a.m58850b(th);
                C2667a.a(th);
            }
        }
    }

    /* renamed from: b */
    void m63757b() {
        Throwable nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f54153a.onSubscribe(EmptyDisposable.INSTANCE);
            try {
                this.f54153a.onError(nullPointerException);
            } catch (Throwable th) {
                C15678a.m58850b(th);
                C2667a.a(new CompositeException(nullPointerException, th));
            }
        } catch (Throwable th2) {
            C15678a.m58850b(th2);
            C2667a.a(new CompositeException(nullPointerException, th2));
        }
    }
}
