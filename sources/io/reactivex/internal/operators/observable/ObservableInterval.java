package io.reactivex.internal.operators.observable;

import io.reactivex.C15679f;
import io.reactivex.C3959e;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.schedulers.C17519i;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableInterval extends C3959e<Long> {
    /* renamed from: a */
    final C15679f f57181a;
    /* renamed from: b */
    final long f57182b;
    /* renamed from: c */
    final long f57183c;
    /* renamed from: d */
    final TimeUnit f57184d;

    static final class IntervalObserver extends AtomicReference<Disposable> implements Disposable, Runnable {
        private static final long serialVersionUID = 346773832286157679L;
        /* renamed from: a */
        final Observer<? super Long> f53544a;
        /* renamed from: b */
        long f53545b;

        IntervalObserver(Observer<? super Long> observer) {
            this.f53544a = observer;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        public void run() {
            if (get() != DisposableHelper.DISPOSED) {
                Observer observer = this.f53544a;
                long j = this.f53545b;
                this.f53545b = j + 1;
                observer.onNext(Long.valueOf(j));
            }
        }

        /* renamed from: a */
        public void m63590a(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    public ObservableInterval(long j, long j2, TimeUnit timeUnit, C15679f c15679f) {
        this.f57182b = j;
        this.f57183c = j2;
        this.f57184d = timeUnit;
        this.f57181a = c15679f;
    }

    public void subscribeActual(Observer<? super Long> observer) {
        IntervalObserver intervalObserver = new IntervalObserver(observer);
        observer.onSubscribe(intervalObserver);
        C15679f c15679f = this.f57181a;
        if ((c15679f instanceof C17519i) != null) {
            Object a = c15679f.mo12872a();
            intervalObserver.m63590a(a);
            a.m63454a(intervalObserver, this.f57182b, this.f57183c, this.f57184d);
            return;
        }
        intervalObserver.m63590a(c15679f.mo12919a(intervalObserver, this.f57182b, this.f57183c, this.f57184d));
    }
}
