package io.reactivex.internal.operators.single;

import io.reactivex.C3960g;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Action;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleDoOnDispose<T> extends C3960g<T> {
    /* renamed from: a */
    final SingleSource<T> f57310a;
    /* renamed from: b */
    final Action f57311b;

    static final class DoOnDisposeObserver<T> extends AtomicReference<Action> implements SingleObserver<T>, Disposable {
        private static final long serialVersionUID = -8583764624474935784L;
        /* renamed from: a */
        final SingleObserver<? super T> f54053a;
        /* renamed from: b */
        Disposable f54054b;

        DoOnDisposeObserver(SingleObserver<? super T> singleObserver, Action action) {
            this.f54053a = singleObserver;
            lazySet(action);
        }

        public void dispose() {
            Action action = (Action) getAndSet(null);
            if (action != null) {
                try {
                    action.run();
                } catch (Throwable th) {
                    C15678a.m58850b(th);
                    C2667a.a(th);
                }
                this.f54054b.dispose();
            }
        }

        public boolean isDisposed() {
            return this.f54054b.isDisposed();
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f54054b, disposable)) {
                this.f54054b = disposable;
                this.f54053a.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f54053a.onSuccess(t);
        }

        public void onError(Throwable th) {
            this.f54053a.onError(th);
        }
    }

    public SingleDoOnDispose(SingleSource<T> singleSource, Action action) {
        this.f57310a = singleSource;
        this.f57311b = action;
    }

    /* renamed from: a */
    protected void m66531a(SingleObserver<? super T> singleObserver) {
        this.f57310a.subscribe(new DoOnDisposeObserver(singleObserver, this.f57311b));
    }
}
