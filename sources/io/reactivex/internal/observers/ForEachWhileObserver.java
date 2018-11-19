package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicReference;

public final class ForEachWhileObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
    private static final long serialVersionUID = -4403180040475402120L;
    /* renamed from: a */
    final Predicate<? super T> f53143a;
    /* renamed from: b */
    final Consumer<? super Throwable> f53144b;
    /* renamed from: c */
    final Action f53145c;
    /* renamed from: d */
    boolean f53146d;

    public ForEachWhileObserver(Predicate<? super T> predicate, Consumer<? super Throwable> consumer, Action action) {
        this.f53143a = predicate;
        this.f53144b = consumer;
        this.f53145c = action;
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }

    public void onNext(T t) {
        if (!this.f53146d) {
            try {
                if (this.f53143a.test(t) == null) {
                    dispose();
                    onComplete();
                }
            } catch (T t2) {
                C15678a.m58850b(t2);
                dispose();
                onError(t2);
            }
        }
    }

    public void onError(Throwable th) {
        if (this.f53146d) {
            C2667a.a(th);
            return;
        }
        this.f53146d = true;
        try {
            this.f53144b.accept(th);
        } catch (Throwable th2) {
            C15678a.m58850b(th2);
            C2667a.a(new CompositeException(th, th2));
        }
    }

    public void onComplete() {
        if (!this.f53146d) {
            this.f53146d = true;
            try {
                this.f53145c.run();
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
        return DisposableHelper.isDisposed((Disposable) get());
    }
}
