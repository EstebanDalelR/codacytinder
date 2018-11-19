package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.observers.C17528b;
import io.reactivex.observers.C17530d;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.observable.q */
public final class C19026q<T, U> extends C18394a<T, T> {
    /* renamed from: b */
    final Function<? super T, ? extends ObservableSource<U>> f59077b;

    /* renamed from: io.reactivex.internal.operators.observable.q$a */
    static final class C17497a<T, U> implements Observer<T>, Disposable {
        /* renamed from: a */
        final Observer<? super T> f54019a;
        /* renamed from: b */
        final Function<? super T, ? extends ObservableSource<U>> f54020b;
        /* renamed from: c */
        Disposable f54021c;
        /* renamed from: d */
        final AtomicReference<Disposable> f54022d = new AtomicReference();
        /* renamed from: e */
        volatile long f54023e;
        /* renamed from: f */
        boolean f54024f;

        /* renamed from: io.reactivex.internal.operators.observable.q$a$a */
        static final class C18409a<T, U> extends C17528b<U> {
            /* renamed from: a */
            final C17497a<T, U> f57298a;
            /* renamed from: b */
            final long f57299b;
            /* renamed from: c */
            final T f57300c;
            /* renamed from: d */
            boolean f57301d;
            /* renamed from: e */
            final AtomicBoolean f57302e = new AtomicBoolean();

            C18409a(C17497a<T, U> c17497a, long j, T t) {
                this.f57298a = c17497a;
                this.f57299b = j;
                this.f57300c = t;
            }

            public void onNext(U u) {
                if (this.f57301d == null) {
                    this.f57301d = true;
                    dispose();
                    m66528a();
                }
            }

            /* renamed from: a */
            void m66528a() {
                if (this.f57302e.compareAndSet(false, true)) {
                    this.f57298a.m63710a(this.f57299b, this.f57300c);
                }
            }

            public void onError(Throwable th) {
                if (this.f57301d) {
                    C2667a.a(th);
                    return;
                }
                this.f57301d = true;
                this.f57298a.onError(th);
            }

            public void onComplete() {
                if (!this.f57301d) {
                    this.f57301d = true;
                    m66528a();
                }
            }
        }

        C17497a(Observer<? super T> observer, Function<? super T, ? extends ObservableSource<U>> function) {
            this.f54019a = observer;
            this.f54020b = function;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f54021c, disposable)) {
                this.f54021c = disposable;
                this.f54019a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            if (!this.f54024f) {
                long j = this.f54023e + 1;
                this.f54023e = j;
                Disposable disposable = (Disposable) this.f54022d.get();
                if (disposable != null) {
                    disposable.dispose();
                }
                try {
                    ObservableSource observableSource = (ObservableSource) C15684a.m58895a(this.f54020b.apply(t), "The ObservableSource supplied is null");
                    Observer c18409a = new C18409a(this, j, t);
                    if (this.f54022d.compareAndSet(disposable, c18409a) != null) {
                        observableSource.subscribe(c18409a);
                    }
                } catch (T t2) {
                    C15678a.m58850b(t2);
                    dispose();
                    this.f54019a.onError(t2);
                }
            }
        }

        public void onError(Throwable th) {
            DisposableHelper.dispose(this.f54022d);
            this.f54019a.onError(th);
        }

        public void onComplete() {
            if (!this.f54024f) {
                this.f54024f = true;
                Disposable disposable = (Disposable) this.f54022d.get();
                if (disposable != DisposableHelper.DISPOSED) {
                    ((C18409a) disposable).m66528a();
                    DisposableHelper.dispose(this.f54022d);
                    this.f54019a.onComplete();
                }
            }
        }

        public void dispose() {
            this.f54021c.dispose();
            DisposableHelper.dispose(this.f54022d);
        }

        public boolean isDisposed() {
            return this.f54021c.isDisposed();
        }

        /* renamed from: a */
        void m63710a(long j, T t) {
            if (j == this.f54023e) {
                this.f54019a.onNext(t);
            }
        }
    }

    public C19026q(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<U>> function) {
        super(observableSource);
        this.f59077b = function;
    }

    public void subscribeActual(Observer<? super T> observer) {
        this.a.subscribe(new C17497a(new C17530d(observer), this.f59077b));
    }
}
