package io.reactivex.internal.operators.observable;

import io.reactivex.C15679f;
import io.reactivex.C15679f.C17362c;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.C17530d;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableDebounceTimed<T> extends C18394a<T, T> {
    /* renamed from: b */
    final long f58919b;
    /* renamed from: c */
    final TimeUnit f58920c;
    /* renamed from: d */
    final C15679f f58921d;

    static final class DebounceEmitter<T> extends AtomicReference<Disposable> implements Disposable, Runnable {
        private static final long serialVersionUID = 6812032969491025141L;
        /* renamed from: a */
        final T f53425a;
        /* renamed from: b */
        final long f53426b;
        /* renamed from: c */
        final C17426a<T> f53427c;
        /* renamed from: d */
        final AtomicBoolean f53428d = new AtomicBoolean();

        DebounceEmitter(T t, long j, C17426a<T> c17426a) {
            this.f53425a = t;
            this.f53426b = j;
            this.f53427c = c17426a;
        }

        public void run() {
            if (this.f53428d.compareAndSet(false, true)) {
                this.f53427c.m63540a(this.f53426b, this.f53425a, this);
            }
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        /* renamed from: a */
        public void m63539a(Disposable disposable) {
            DisposableHelper.replace(this, disposable);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableDebounceTimed$a */
    static final class C17426a<T> implements Observer<T>, Disposable {
        /* renamed from: a */
        final Observer<? super T> f53429a;
        /* renamed from: b */
        final long f53430b;
        /* renamed from: c */
        final TimeUnit f53431c;
        /* renamed from: d */
        final C17362c f53432d;
        /* renamed from: e */
        Disposable f53433e;
        /* renamed from: f */
        final AtomicReference<Disposable> f53434f = new AtomicReference();
        /* renamed from: g */
        volatile long f53435g;
        /* renamed from: h */
        boolean f53436h;

        C17426a(Observer<? super T> observer, long j, TimeUnit timeUnit, C17362c c17362c) {
            this.f53429a = observer;
            this.f53430b = j;
            this.f53431c = timeUnit;
            this.f53432d = c17362c;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53433e, disposable)) {
                this.f53433e = disposable;
                this.f53429a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            if (!this.f53436h) {
                long j = this.f53435g + 1;
                this.f53435g = j;
                Disposable disposable = (Disposable) this.f53434f.get();
                if (disposable != null) {
                    disposable.dispose();
                }
                Object debounceEmitter = new DebounceEmitter(t, j, this);
                if (this.f53434f.compareAndSet(disposable, debounceEmitter) != null) {
                    debounceEmitter.m63539a(this.f53432d.mo13559a(debounceEmitter, this.f53430b, this.f53431c));
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f53436h) {
                C2667a.a(th);
                return;
            }
            this.f53436h = true;
            this.f53429a.onError(th);
            this.f53432d.dispose();
        }

        public void onComplete() {
            if (!this.f53436h) {
                this.f53436h = true;
                Disposable disposable = (Disposable) this.f53434f.get();
                if (disposable != DisposableHelper.DISPOSED) {
                    DebounceEmitter debounceEmitter = (DebounceEmitter) disposable;
                    if (debounceEmitter != null) {
                        debounceEmitter.run();
                    }
                    this.f53429a.onComplete();
                    this.f53432d.dispose();
                }
            }
        }

        public void dispose() {
            this.f53433e.dispose();
            this.f53432d.dispose();
        }

        public boolean isDisposed() {
            return this.f53432d.isDisposed();
        }

        /* renamed from: a */
        void m63540a(long j, T t, DebounceEmitter<T> debounceEmitter) {
            if (j == this.f53435g) {
                this.f53429a.onNext(t);
                debounceEmitter.dispose();
            }
        }
    }

    public ObservableDebounceTimed(ObservableSource<T> observableSource, long j, TimeUnit timeUnit, C15679f c15679f) {
        super(observableSource);
        this.f58919b = j;
        this.f58920c = timeUnit;
        this.f58921d = c15679f;
    }

    public void subscribeActual(Observer<? super T> observer) {
        this.a.subscribe(new C17426a(new C17530d(observer), this.f58919b, this.f58920c, this.f58921d.mo12872a()));
    }
}
