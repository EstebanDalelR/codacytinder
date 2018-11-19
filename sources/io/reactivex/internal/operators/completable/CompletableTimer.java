package io.reactivex.internal.operators.completable;

import io.reactivex.C15679f;
import io.reactivex.C3956a;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class CompletableTimer extends C3956a {
    /* renamed from: a */
    final long f56814a;
    /* renamed from: b */
    final TimeUnit f56815b;
    /* renamed from: c */
    final C15679f f56816c;

    static final class TimerDisposable extends AtomicReference<Disposable> implements Disposable, Runnable {
        private static final long serialVersionUID = 3167244060586201109L;
        /* renamed from: a */
        final CompletableObserver f53192a;

        TimerDisposable(CompletableObserver completableObserver) {
            this.f53192a = completableObserver;
        }

        public void run() {
            this.f53192a.onComplete();
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        /* renamed from: a */
        void m63487a(Disposable disposable) {
            DisposableHelper.replace(this, disposable);
        }
    }

    public CompletableTimer(long j, TimeUnit timeUnit, C15679f c15679f) {
        this.f56814a = j;
        this.f56815b = timeUnit;
        this.f56816c = c15679f;
    }

    /* renamed from: a */
    protected void m66388a(CompletableObserver completableObserver) {
        TimerDisposable timerDisposable = new TimerDisposable(completableObserver);
        completableObserver.onSubscribe(timerDisposable);
        timerDisposable.m63487a(this.f56816c.mo12871a(timerDisposable, this.f56814a, this.f56815b));
    }
}
