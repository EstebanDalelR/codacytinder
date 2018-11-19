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

public final class ObservableRepeatWhen<T> extends C18394a<T, T> {
    /* renamed from: b */
    final Function<? super C3959e<Object>, ? extends ObservableSource<?>> f58962b;

    static final class RepeatWhenObserver<T> extends AtomicInteger implements Observer<T>, Disposable {
        private static final long serialVersionUID = 802743776666017014L;
        /* renamed from: a */
        final Observer<? super T> f53621a;
        /* renamed from: b */
        final AtomicInteger f53622b = new AtomicInteger();
        /* renamed from: c */
        final AtomicThrowable f53623c = new AtomicThrowable();
        /* renamed from: d */
        final C18432c<Object> f53624d;
        /* renamed from: e */
        final InnerRepeatObserver f53625e = new InnerRepeatObserver(this);
        /* renamed from: f */
        final AtomicReference<Disposable> f53626f = new AtomicReference();
        /* renamed from: g */
        final ObservableSource<T> f53627g;
        /* renamed from: h */
        volatile boolean f53628h;

        final class InnerRepeatObserver extends AtomicReference<Disposable> implements Observer<Object> {
            private static final long serialVersionUID = 3254781284376480842L;
            /* renamed from: a */
            final /* synthetic */ RepeatWhenObserver f53620a;

            InnerRepeatObserver(RepeatWhenObserver repeatWhenObserver) {
                this.f53620a = repeatWhenObserver;
            }

            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            public void onNext(Object obj) {
                this.f53620a.m63621a();
            }

            public void onError(Throwable th) {
                this.f53620a.m63622a(th);
            }

            public void onComplete() {
                this.f53620a.m63623b();
            }
        }

        RepeatWhenObserver(Observer<? super T> observer, C18432c<Object> c18432c, ObservableSource<T> observableSource) {
            this.f53621a = observer;
            this.f53624d = c18432c;
            this.f53627g = observableSource;
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this.f53626f, disposable);
        }

        public void onNext(T t) {
            C15738e.m58978a(this.f53621a, (Object) t, (AtomicInteger) this, this.f53623c);
        }

        public void onError(Throwable th) {
            DisposableHelper.dispose(this.f53625e);
            C15738e.m58979a(this.f53621a, th, (AtomicInteger) this, this.f53623c);
        }

        public void onComplete() {
            this.f53628h = false;
            this.f53624d.onNext(Integer.valueOf(0));
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) this.f53626f.get());
        }

        public void dispose() {
            DisposableHelper.dispose(this.f53626f);
            DisposableHelper.dispose(this.f53625e);
        }

        /* renamed from: a */
        void m63621a() {
            m63624c();
        }

        /* renamed from: a */
        void m63622a(Throwable th) {
            DisposableHelper.dispose(this.f53626f);
            C15738e.m58979a(this.f53621a, th, (AtomicInteger) this, this.f53623c);
        }

        /* renamed from: b */
        void m63623b() {
            DisposableHelper.dispose(this.f53626f);
            C15738e.m58980a(this.f53621a, (AtomicInteger) this, this.f53623c);
        }

        /* renamed from: c */
        void m63624c() {
            if (this.f53622b.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.f53628h) {
                        this.f53628h = true;
                        this.f53627g.subscribe(this);
                    }
                    if (this.f53622b.decrementAndGet() == 0) {
                    }
                }
            }
        }
    }

    public ObservableRepeatWhen(ObservableSource<T> observableSource, Function<? super C3959e<Object>, ? extends ObservableSource<?>> function) {
        super(observableSource);
        this.f58962b = function;
    }

    protected void subscribeActual(Observer<? super T> observer) {
        C18432c d = PublishSubject.m67682a().m66611d();
        try {
            ObservableSource observableSource = (ObservableSource) C15684a.m58895a(this.f58962b.apply(d), "The handler returned a null ObservableSource");
            RepeatWhenObserver repeatWhenObserver = new RepeatWhenObserver(observer, d, this.a);
            observer.onSubscribe(repeatWhenObserver);
            observableSource.subscribe(repeatWhenObserver.f53625e);
            repeatWhenObserver.m63624c();
        } catch (Throwable th) {
            C15678a.m58850b(th);
            EmptyDisposable.error(th, (Observer) observer);
        }
    }
}
