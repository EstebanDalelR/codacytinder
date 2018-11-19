package io.reactivex.internal.operators.observable;

import io.reactivex.C15679f;
import io.reactivex.C3959e;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableTimer extends C3959e<Long> {
    /* renamed from: a */
    final C15679f f57218a;
    /* renamed from: b */
    final long f57219b;
    /* renamed from: c */
    final TimeUnit f57220c;

    static final class TimerObserver extends AtomicReference<Disposable> implements Disposable, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        /* renamed from: a */
        final Observer<? super Long> f53794a;

        TimerObserver(Observer<? super Long> observer) {
            this.f53794a = observer;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        public void run() {
            if (!isDisposed()) {
                this.f53794a.onNext(Long.valueOf(0));
                lazySet(EmptyDisposable.INSTANCE);
                this.f53794a.onComplete();
            }
        }

        /* renamed from: a */
        public void m63688a(Disposable disposable) {
            DisposableHelper.trySet(this, disposable);
        }
    }

    public ObservableTimer(long j, TimeUnit timeUnit, C15679f c15679f) {
        this.f57219b = j;
        this.f57220c = timeUnit;
        this.f57218a = c15679f;
    }

    public void subscribeActual(Observer<? super Long> observer) {
        TimerObserver timerObserver = new TimerObserver(observer);
        observer.onSubscribe(timerObserver);
        timerObserver.m63688a(this.f57218a.mo12871a(timerObserver, this.f57219b, this.f57220c));
    }
}
