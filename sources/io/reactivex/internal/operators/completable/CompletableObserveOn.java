package io.reactivex.internal.operators.completable;

import io.reactivex.C15679f;
import io.reactivex.C3956a;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class CompletableObserveOn extends C3956a {
    /* renamed from: a */
    final CompletableSource f56810a;
    /* renamed from: b */
    final C15679f f56811b;

    static final class ObserveOnCompletableObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;
        /* renamed from: a */
        final CompletableObserver f53186a;
        /* renamed from: b */
        final C15679f f53187b;
        /* renamed from: c */
        Throwable f53188c;

        ObserveOnCompletableObserver(CompletableObserver completableObserver, C15679f c15679f) {
            this.f53186a = completableObserver;
            this.f53187b = c15679f;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable) != null) {
                this.f53186a.onSubscribe(this);
            }
        }

        public void onError(Throwable th) {
            this.f53188c = th;
            DisposableHelper.replace(this, this.f53187b.mo12918a((Runnable) this));
        }

        public void onComplete() {
            DisposableHelper.replace(this, this.f53187b.mo12918a((Runnable) this));
        }

        public void run() {
            Throwable th = this.f53188c;
            if (th != null) {
                this.f53188c = null;
                this.f53186a.onError(th);
                return;
            }
            this.f53186a.onComplete();
        }
    }

    public CompletableObserveOn(CompletableSource completableSource, C15679f c15679f) {
        this.f56810a = completableSource;
        this.f56811b = c15679f;
    }

    /* renamed from: a */
    protected void m66386a(CompletableObserver completableObserver) {
        this.f56810a.subscribe(new ObserveOnCompletableObserver(completableObserver, this.f56811b));
    }
}
