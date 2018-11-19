package io.reactivex.internal.operators.single;

import io.reactivex.C3960g;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.annotations.Experimental;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Action;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicInteger;

@Experimental
public final class SingleDoFinally<T> extends C3960g<T> {
    /* renamed from: a */
    final SingleSource<T> f57308a;
    /* renamed from: b */
    final Action f57309b;

    static final class DoFinallyObserver<T> extends AtomicInteger implements SingleObserver<T>, Disposable {
        private static final long serialVersionUID = 4109457741734051389L;
        /* renamed from: a */
        final SingleObserver<? super T> f54050a;
        /* renamed from: b */
        final Action f54051b;
        /* renamed from: c */
        Disposable f54052c;

        DoFinallyObserver(SingleObserver<? super T> singleObserver, Action action) {
            this.f54050a = singleObserver;
            this.f54051b = action;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f54052c, disposable)) {
                this.f54052c = disposable;
                this.f54050a.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f54050a.onSuccess(t);
            m63712a();
        }

        public void onError(Throwable th) {
            this.f54050a.onError(th);
            m63712a();
        }

        public void dispose() {
            this.f54052c.dispose();
            m63712a();
        }

        public boolean isDisposed() {
            return this.f54052c.isDisposed();
        }

        /* renamed from: a */
        void m63712a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f54051b.run();
                } catch (Throwable th) {
                    C15678a.m58850b(th);
                    C2667a.a(th);
                }
            }
        }
    }

    public SingleDoFinally(SingleSource<T> singleSource, Action action) {
        this.f57308a = singleSource;
        this.f57309b = action;
    }

    /* renamed from: a */
    protected void m66530a(SingleObserver<? super T> singleObserver) {
        this.f57308a.subscribe(new DoFinallyObserver(singleObserver, this.f57309b));
    }
}
