package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.Functions;
import io.reactivex.observers.LambdaConsumerIntrospection;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicReference;

public final class LambdaObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable, LambdaConsumerIntrospection {
    private static final long serialVersionUID = -7251123623727029452L;
    /* renamed from: a */
    final Consumer<? super T> f53152a;
    /* renamed from: b */
    final Consumer<? super Throwable> f53153b;
    /* renamed from: c */
    final Action f53154c;
    /* renamed from: d */
    final Consumer<? super Disposable> f53155d;

    public LambdaObserver(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Consumer<? super Disposable> consumer3) {
        this.f53152a = consumer;
        this.f53153b = consumer2;
        this.f53154c = action;
        this.f53155d = consumer3;
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.setOnce(this, disposable)) {
            try {
                this.f53155d.accept(this);
            } catch (Throwable th) {
                C15678a.m58850b(th);
                disposable.dispose();
                onError(th);
            }
        }
    }

    public void onNext(T t) {
        if (!isDisposed()) {
            try {
                this.f53152a.accept(t);
            } catch (T t2) {
                C15678a.m58850b(t2);
                ((Disposable) get()).dispose();
                onError(t2);
            }
        }
    }

    public void onError(Throwable th) {
        if (!isDisposed()) {
            lazySet(DisposableHelper.DISPOSED);
            try {
                this.f53153b.accept(th);
            } catch (Throwable th2) {
                C15678a.m58850b(th2);
                C2667a.a(new CompositeException(th, th2));
            }
        }
    }

    public void onComplete() {
        if (!isDisposed()) {
            lazySet(DisposableHelper.DISPOSED);
            try {
                this.f53154c.run();
            } catch (Throwable th) {
                C15678a.m58850b(th);
                C2667a.a(th);
            }
        }
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    public boolean hasCustomOnError() {
        return this.f53153b != Functions.f48544f;
    }
}
