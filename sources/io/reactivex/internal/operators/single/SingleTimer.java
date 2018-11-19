package io.reactivex.internal.operators.single;

import io.reactivex.C15679f;
import io.reactivex.C3960g;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleTimer extends C3960g<Long> {
    /* renamed from: a */
    final long f57322a;
    /* renamed from: b */
    final TimeUnit f57323b;
    /* renamed from: c */
    final C15679f f57324c;

    static final class TimerDisposable extends AtomicReference<Disposable> implements Disposable, Runnable {
        private static final long serialVersionUID = 8465401857522493082L;
        /* renamed from: a */
        final SingleObserver<? super Long> f54070a;

        TimerDisposable(SingleObserver<? super Long> singleObserver) {
            this.f54070a = singleObserver;
        }

        public void run() {
            this.f54070a.onSuccess(Long.valueOf(0));
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        /* renamed from: a */
        void m63713a(Disposable disposable) {
            DisposableHelper.replace(this, disposable);
        }
    }

    public SingleTimer(long j, TimeUnit timeUnit, C15679f c15679f) {
        this.f57322a = j;
        this.f57323b = timeUnit;
        this.f57324c = c15679f;
    }

    /* renamed from: a */
    protected void m66537a(SingleObserver<? super Long> singleObserver) {
        TimerDisposable timerDisposable = new TimerDisposable(singleObserver);
        singleObserver.onSubscribe(timerDisposable);
        timerDisposable.m63713a(this.f57324c.mo12871a(timerDisposable, this.f57322a, this.f57323b));
    }
}
