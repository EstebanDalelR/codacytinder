package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.LambdaConsumerIntrospection;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicReference;

public final class CallbackCompletableObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable, Consumer<Throwable>, LambdaConsumerIntrospection {
    private static final long serialVersionUID = -4361286194466301354L;
    /* renamed from: a */
    final Consumer<? super Throwable> f53139a;
    /* renamed from: b */
    final Action f53140b;

    public /* synthetic */ void accept(Object obj) throws Exception {
        m63477a((Throwable) obj);
    }

    public CallbackCompletableObserver(Consumer<? super Throwable> consumer, Action action) {
        this.f53139a = consumer;
        this.f53140b = action;
    }

    /* renamed from: a */
    public void m63477a(Throwable th) {
        C2667a.a(new OnErrorNotImplementedException(th));
    }

    public void onComplete() {
        try {
            this.f53140b.run();
        } catch (Throwable th) {
            C15678a.m58850b(th);
            C2667a.a(th);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    public void onError(Throwable th) {
        try {
            this.f53139a.accept(th);
        } catch (Throwable th2) {
            C15678a.m58850b(th2);
            C2667a.a(th2);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    public boolean hasCustomOnError() {
        return this.f53139a != this;
    }
}
