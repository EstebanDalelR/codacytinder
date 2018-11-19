package io.reactivex.internal.operators.observable;

import io.reactivex.C15679f;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.C17530d;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableSampleTimed<T> extends C18394a<T, T> {
    /* renamed from: b */
    final long f58974b;
    /* renamed from: c */
    final TimeUnit f58975c;
    /* renamed from: d */
    final C15679f f58976d;
    /* renamed from: e */
    final boolean f58977e;

    static abstract class SampleTimedObserver<T> extends AtomicReference<T> implements Observer<T>, Disposable, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;
        /* renamed from: b */
        final Observer<? super T> f53669b;
        /* renamed from: c */
        final long f53670c;
        /* renamed from: d */
        final TimeUnit f53671d;
        /* renamed from: e */
        final C15679f f53672e;
        /* renamed from: f */
        final AtomicReference<Disposable> f53673f = new AtomicReference();
        /* renamed from: g */
        Disposable f53674g;

        /* renamed from: a */
        abstract void mo13584a();

        SampleTimedObserver(Observer<? super T> observer, long j, TimeUnit timeUnit, C15679f c15679f) {
            this.f53669b = observer;
            this.f53670c = j;
            this.f53671d = timeUnit;
            this.f53672e = c15679f;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53674g, disposable)) {
                this.f53674g = disposable;
                this.f53669b.onSubscribe(this);
                DisposableHelper.replace(this.f53673f, this.f53672e.mo12919a(this, this.f53670c, this.f53670c, this.f53671d));
            }
        }

        public void onNext(T t) {
            lazySet(t);
        }

        public void onError(Throwable th) {
            m63657b();
            this.f53669b.onError(th);
        }

        public void onComplete() {
            m63657b();
            mo13584a();
        }

        /* renamed from: b */
        void m63657b() {
            DisposableHelper.dispose(this.f53673f);
        }

        public void dispose() {
            m63657b();
            this.f53674g.dispose();
        }

        public boolean isDisposed() {
            return this.f53674g.isDisposed();
        }

        /* renamed from: c */
        void m63658c() {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                this.f53669b.onNext(andSet);
            }
        }
    }

    static final class SampleTimedEmitLast<T> extends SampleTimedObserver<T> {
        private static final long serialVersionUID = -7139995637533111443L;
        /* renamed from: a */
        final AtomicInteger f57202a = new AtomicInteger(1);

        SampleTimedEmitLast(Observer<? super T> observer, long j, TimeUnit timeUnit, C15679f c15679f) {
            super(observer, j, timeUnit, c15679f);
        }

        /* renamed from: a */
        void mo13584a() {
            m63658c();
            if (this.f57202a.decrementAndGet() == 0) {
                this.b.onComplete();
            }
        }

        public void run() {
            if (this.f57202a.incrementAndGet() == 2) {
                m63658c();
                if (this.f57202a.decrementAndGet() == 0) {
                    this.b.onComplete();
                }
            }
        }
    }

    static final class SampleTimedNoLast<T> extends SampleTimedObserver<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        SampleTimedNoLast(Observer<? super T> observer, long j, TimeUnit timeUnit, C15679f c15679f) {
            super(observer, j, timeUnit, c15679f);
        }

        /* renamed from: a */
        void mo13584a() {
            this.b.onComplete();
        }

        public void run() {
            m63658c();
        }
    }

    public ObservableSampleTimed(ObservableSource<T> observableSource, long j, TimeUnit timeUnit, C15679f c15679f, boolean z) {
        super(observableSource);
        this.f58974b = j;
        this.f58975c = timeUnit;
        this.f58976d = c15679f;
        this.f58977e = z;
    }

    public void subscribeActual(Observer<? super T> observer) {
        Observer c17530d = new C17530d(observer);
        if (this.f58977e != null) {
            this.a.subscribe(new SampleTimedEmitLast(c17530d, this.f58974b, this.f58975c, this.f58976d));
        } else {
            this.a.subscribe(new SampleTimedNoLast(c17530d, this.f58974b, this.f58975c, this.f58976d));
        }
    }
}
