package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.C15738e;
import io.reactivex.subjects.C18432c;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableRetryWhen<T> extends C18394a<T, T> {
    /* renamed from: b */
    final Function<? super C3959e<Throwable>, ? extends ObservableSource<?>> f58973b;

    static final class RepeatWhenObserver<T> extends AtomicInteger implements Observer<T>, Disposable {
        private static final long serialVersionUID = 802743776666017014L;
        /* renamed from: a */
        final Observer<? super T> f53661a;
        /* renamed from: b */
        final AtomicInteger f53662b = new AtomicInteger();
        /* renamed from: c */
        final AtomicThrowable f53663c = new AtomicThrowable();
        /* renamed from: d */
        final C18432c<Throwable> f53664d;
        /* renamed from: e */
        final InnerRepeatObserver f53665e = new InnerRepeatObserver(this);
        /* renamed from: f */
        final AtomicReference<Disposable> f53666f = new AtomicReference();
        /* renamed from: g */
        final ObservableSource<T> f53667g;
        /* renamed from: h */
        volatile boolean f53668h;

        final class InnerRepeatObserver extends AtomicReference<Disposable> implements Observer<Object> {
            private static final long serialVersionUID = 3254781284376480842L;
            /* renamed from: a */
            final /* synthetic */ RepeatWhenObserver f53660a;

            InnerRepeatObserver(RepeatWhenObserver repeatWhenObserver) {
                this.f53660a = repeatWhenObserver;
            }

            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            public void onNext(Object obj) {
                this.f53660a.m63652a();
            }

            public void onError(Throwable th) {
                this.f53660a.m63653a(th);
            }

            public void onComplete() {
                this.f53660a.m63654b();
            }
        }

        RepeatWhenObserver(Observer<? super T> observer, C18432c<Throwable> c18432c, ObservableSource<T> observableSource) {
            this.f53661a = observer;
            this.f53664d = c18432c;
            this.f53667g = observableSource;
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this.f53666f, disposable);
        }

        public void onNext(T t) {
            C15738e.m58978a(this.f53661a, (Object) t, (AtomicInteger) this, this.f53663c);
        }

        public void onError(Throwable th) {
            this.f53668h = false;
            this.f53664d.onNext(th);
        }

        public void onComplete() {
            DisposableHelper.dispose(this.f53665e);
            C15738e.m58980a(this.f53661a, (AtomicInteger) this, this.f53663c);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) this.f53666f.get());
        }

        public void dispose() {
            DisposableHelper.dispose(this.f53666f);
            DisposableHelper.dispose(this.f53665e);
        }

        /* renamed from: a */
        void m63652a() {
            m63655c();
        }

        /* renamed from: a */
        void m63653a(Throwable th) {
            DisposableHelper.dispose(this.f53666f);
            C15738e.m58979a(this.f53661a, th, (AtomicInteger) this, this.f53663c);
        }

        /* renamed from: b */
        void m63654b() {
            DisposableHelper.dispose(this.f53666f);
            C15738e.m58980a(this.f53661a, (AtomicInteger) this, this.f53663c);
        }

        /* renamed from: c */
        void m63655c() {
            if (this.f53662b.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.f53668h) {
                        this.f53668h = true;
                        this.f53667g.subscribe(this);
                    }
                    if (this.f53662b.decrementAndGet() == 0) {
                    }
                }
            }
        }
    }

    public ObservableRetryWhen(ObservableSource<T> observableSource, Function<? super C3959e<Throwable>, ? extends ObservableSource<?>> function) {
        super(observableSource);
        this.f58973b = function;
    }

    protected void subscribeActual(Observer<? super T> observer) {
        C18432c d = PublishSubject.m67682a().m66611d();
        try {
            ObservableSource observableSource = (ObservableSource) C15684a.m58895a(this.f58973b.apply(d), "The handler returned a null ObservableSource");
            RepeatWhenObserver repeatWhenObserver = new RepeatWhenObserver(observer, d, this.a);
            observer.onSubscribe(repeatWhenObserver);
            observableSource.subscribe(repeatWhenObserver.f53665e);
            repeatWhenObserver.m63655c();
        } catch (Throwable th) {
            C15678a.m58850b(th);
            EmptyDisposable.error(th, (Observer) observer);
        }
    }
}
