package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.C17530d;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableSampleWithObservable<T> extends C18394a<T, T> {
    /* renamed from: b */
    final ObservableSource<?> f58978b;
    /* renamed from: c */
    final boolean f58979c;

    static abstract class SampleMainObserver<T> extends AtomicReference<T> implements Observer<T>, Disposable {
        private static final long serialVersionUID = -3517602651313910099L;
        /* renamed from: c */
        final Observer<? super T> f53675c;
        /* renamed from: d */
        final ObservableSource<?> f53676d;
        /* renamed from: e */
        final AtomicReference<Disposable> f53677e = new AtomicReference();
        /* renamed from: f */
        Disposable f53678f;

        /* renamed from: a */
        abstract void mo13585a();

        /* renamed from: b */
        abstract void mo13586b();

        /* renamed from: c */
        abstract void mo13587c();

        SampleMainObserver(Observer<? super T> observer, ObservableSource<?> observableSource) {
            this.f53675c = observer;
            this.f53676d = observableSource;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53678f, disposable)) {
                this.f53678f = disposable;
                this.f53675c.onSubscribe(this);
                if (this.f53677e.get() == null) {
                    this.f53676d.subscribe(new C17448a(this));
                }
            }
        }

        public void onNext(T t) {
            lazySet(t);
        }

        public void onError(Throwable th) {
            DisposableHelper.dispose(this.f53677e);
            this.f53675c.onError(th);
        }

        public void onComplete() {
            DisposableHelper.dispose(this.f53677e);
            mo13585a();
        }

        /* renamed from: a */
        boolean m63661a(Disposable disposable) {
            return DisposableHelper.setOnce(this.f53677e, disposable);
        }

        public void dispose() {
            DisposableHelper.dispose(this.f53677e);
            this.f53678f.dispose();
        }

        public boolean isDisposed() {
            return this.f53677e.get() == DisposableHelper.DISPOSED;
        }

        /* renamed from: a */
        public void m63660a(Throwable th) {
            this.f53678f.dispose();
            this.f53675c.onError(th);
        }

        /* renamed from: d */
        public void m63664d() {
            this.f53678f.dispose();
            mo13586b();
        }

        /* renamed from: e */
        void m63665e() {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                this.f53675c.onNext(andSet);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableSampleWithObservable$a */
    static final class C17448a<T> implements Observer<Object> {
        /* renamed from: a */
        final SampleMainObserver<T> f53679a;

        C17448a(SampleMainObserver<T> sampleMainObserver) {
            this.f53679a = sampleMainObserver;
        }

        public void onSubscribe(Disposable disposable) {
            this.f53679a.m63661a(disposable);
        }

        public void onNext(Object obj) {
            this.f53679a.mo13587c();
        }

        public void onError(Throwable th) {
            this.f53679a.m63660a(th);
        }

        public void onComplete() {
            this.f53679a.m63664d();
        }
    }

    static final class SampleMainEmitLast<T> extends SampleMainObserver<T> {
        private static final long serialVersionUID = -3029755663834015785L;
        /* renamed from: a */
        final AtomicInteger f57203a = new AtomicInteger();
        /* renamed from: b */
        volatile boolean f57204b;

        SampleMainEmitLast(Observer<? super T> observer, ObservableSource<?> observableSource) {
            super(observer, observableSource);
        }

        /* renamed from: a */
        void mo13585a() {
            this.f57204b = true;
            if (this.f57203a.getAndIncrement() == 0) {
                m63665e();
                this.c.onComplete();
            }
        }

        /* renamed from: b */
        void mo13586b() {
            this.f57204b = true;
            if (this.f57203a.getAndIncrement() == 0) {
                m63665e();
                this.c.onComplete();
            }
        }

        /* renamed from: c */
        void mo13587c() {
            if (this.f57203a.getAndIncrement() == 0) {
                do {
                    boolean z = this.f57204b;
                    m63665e();
                    if (z) {
                        this.c.onComplete();
                        return;
                    }
                } while (this.f57203a.decrementAndGet() != 0);
            }
        }
    }

    static final class SampleMainNoLast<T> extends SampleMainObserver<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        SampleMainNoLast(Observer<? super T> observer, ObservableSource<?> observableSource) {
            super(observer, observableSource);
        }

        /* renamed from: a */
        void mo13585a() {
            this.c.onComplete();
        }

        /* renamed from: b */
        void mo13586b() {
            this.c.onComplete();
        }

        /* renamed from: c */
        void mo13587c() {
            m63665e();
        }
    }

    public ObservableSampleWithObservable(ObservableSource<T> observableSource, ObservableSource<?> observableSource2, boolean z) {
        super(observableSource);
        this.f58978b = observableSource2;
        this.f58979c = z;
    }

    public void subscribeActual(Observer<? super T> observer) {
        Observer c17530d = new C17530d(observer);
        if (this.f58979c != null) {
            this.a.subscribe(new SampleMainEmitLast(c17530d, this.f58978b));
        } else {
            this.a.subscribe(new SampleMainNoLast(c17530d, this.f58978b));
        }
    }
}
