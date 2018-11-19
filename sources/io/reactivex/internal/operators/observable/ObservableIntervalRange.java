package io.reactivex.internal.operators.observable;

import io.reactivex.C15679f;
import io.reactivex.C3959e;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.schedulers.C17519i;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableIntervalRange extends C3959e<Long> {
    /* renamed from: a */
    final C15679f f57185a;
    /* renamed from: b */
    final long f57186b;
    /* renamed from: c */
    final long f57187c;
    /* renamed from: d */
    final long f57188d;
    /* renamed from: e */
    final long f57189e;
    /* renamed from: f */
    final TimeUnit f57190f;

    static final class IntervalRangeObserver extends AtomicReference<Disposable> implements Disposable, Runnable {
        private static final long serialVersionUID = 1891866368734007884L;
        /* renamed from: a */
        final Observer<? super Long> f53546a;
        /* renamed from: b */
        final long f53547b;
        /* renamed from: c */
        long f53548c;

        IntervalRangeObserver(Observer<? super Long> observer, long j, long j2) {
            this.f53546a = observer;
            this.f53548c = j;
            this.f53547b = j2;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        public void run() {
            if (!isDisposed()) {
                long j = this.f53548c;
                this.f53546a.onNext(Long.valueOf(j));
                if (j == this.f53547b) {
                    DisposableHelper.dispose(this);
                    this.f53546a.onComplete();
                    return;
                }
                this.f53548c = j + 1;
            }
        }

        /* renamed from: a */
        public void m63591a(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    public ObservableIntervalRange(long j, long j2, long j3, long j4, TimeUnit timeUnit, C15679f c15679f) {
        this.f57188d = j3;
        this.f57189e = j4;
        this.f57190f = timeUnit;
        this.f57185a = c15679f;
        this.f57186b = j;
        this.f57187c = j2;
    }

    public void subscribeActual(Observer<? super Long> observer) {
        IntervalRangeObserver intervalRangeObserver = new IntervalRangeObserver(observer, this.f57186b, this.f57187c);
        observer.onSubscribe(intervalRangeObserver);
        C15679f c15679f = this.f57185a;
        if ((c15679f instanceof C17519i) != null) {
            Object a = c15679f.mo12872a();
            intervalRangeObserver.m63591a(a);
            a.m63454a(intervalRangeObserver, this.f57188d, this.f57189e, this.f57190f);
            return;
        }
        intervalRangeObserver.m63591a(c15679f.mo12919a(intervalRangeObserver, this.f57188d, this.f57189e, this.f57190f));
    }
}
