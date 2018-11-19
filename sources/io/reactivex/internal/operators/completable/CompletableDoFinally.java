package io.reactivex.internal.operators.completable;

import io.reactivex.C3956a;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.annotations.Experimental;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Action;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicInteger;

@Experimental
public final class CompletableDoFinally extends C3956a {
    /* renamed from: a */
    final CompletableSource f56808a;
    /* renamed from: b */
    final Action f56809b;

    static final class DoFinallyObserver extends AtomicInteger implements CompletableObserver, Disposable {
        private static final long serialVersionUID = 4109457741734051389L;
        /* renamed from: a */
        final CompletableObserver f53183a;
        /* renamed from: b */
        final Action f53184b;
        /* renamed from: c */
        Disposable f53185c;

        DoFinallyObserver(CompletableObserver completableObserver, Action action) {
            this.f53183a = completableObserver;
            this.f53184b = action;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53185c, disposable)) {
                this.f53185c = disposable;
                this.f53183a.onSubscribe(this);
            }
        }

        public void onError(Throwable th) {
            this.f53183a.onError(th);
            m63486a();
        }

        public void onComplete() {
            this.f53183a.onComplete();
            m63486a();
        }

        public void dispose() {
            this.f53185c.dispose();
            m63486a();
        }

        public boolean isDisposed() {
            return this.f53185c.isDisposed();
        }

        /* renamed from: a */
        void m63486a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f53184b.run();
                } catch (Throwable th) {
                    C15678a.m58850b(th);
                    C2667a.a(th);
                }
            }
        }
    }

    public CompletableDoFinally(CompletableSource completableSource, Action action) {
        this.f56808a = completableSource;
        this.f56809b = action;
    }

    /* renamed from: a */
    protected void m66385a(CompletableObserver completableObserver) {
        this.f56808a.subscribe(new DoFinallyObserver(completableObserver, this.f56809b));
    }
}
