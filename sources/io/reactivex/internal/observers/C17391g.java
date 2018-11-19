package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.p079d.C2667a;

/* renamed from: io.reactivex.internal.observers.g */
public final class C17391g<T> implements Observer<T>, Disposable {
    /* renamed from: a */
    final Observer<? super T> f53164a;
    /* renamed from: b */
    final Consumer<? super Disposable> f53165b;
    /* renamed from: c */
    final Action f53166c;
    /* renamed from: d */
    Disposable f53167d;

    public C17391g(Observer<? super T> observer, Consumer<? super Disposable> consumer, Action action) {
        this.f53164a = observer;
        this.f53165b = consumer;
        this.f53166c = action;
    }

    public void onSubscribe(Disposable disposable) {
        try {
            this.f53165b.accept(disposable);
            if (DisposableHelper.validate(this.f53167d, disposable)) {
                this.f53167d = disposable;
                this.f53164a.onSubscribe(this);
            }
        } catch (Throwable th) {
            C15678a.m58850b(th);
            disposable.dispose();
            this.f53167d = DisposableHelper.DISPOSED;
            EmptyDisposable.error(th, this.f53164a);
        }
    }

    public void onNext(T t) {
        this.f53164a.onNext(t);
    }

    public void onError(Throwable th) {
        if (this.f53167d != DisposableHelper.DISPOSED) {
            this.f53164a.onError(th);
        } else {
            C2667a.a(th);
        }
    }

    public void onComplete() {
        if (this.f53167d != DisposableHelper.DISPOSED) {
            this.f53164a.onComplete();
        }
    }

    public void dispose() {
        try {
            this.f53166c.run();
        } catch (Throwable th) {
            C15678a.m58850b(th);
            C2667a.a(th);
        }
        this.f53167d.dispose();
    }

    public boolean isDisposed() {
        return this.f53167d.isDisposed();
    }
}
