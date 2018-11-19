package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.C19000e;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.observers.C17392h;
import io.reactivex.observers.C17528b;
import io.reactivex.observers.C17530d;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableTimeout<T, U, V> extends C18394a<T, T> {
    /* renamed from: b */
    final ObservableSource<U> f59003b;
    /* renamed from: c */
    final Function<? super T, ? extends ObservableSource<V>> f59004c;
    /* renamed from: d */
    final ObservableSource<? extends T> f59005d;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableTimeout$a */
    interface C15707a {
        /* renamed from: a */
        void mo12913a(long j);

        /* renamed from: a */
        void mo12914a(Throwable th);
    }

    static final class TimeoutObserver<T, U, V> extends AtomicReference<Disposable> implements Observer<T>, Disposable, C15707a {
        private static final long serialVersionUID = 2672739326310051084L;
        /* renamed from: a */
        final Observer<? super T> f53765a;
        /* renamed from: b */
        final ObservableSource<U> f53766b;
        /* renamed from: c */
        final Function<? super T, ? extends ObservableSource<V>> f53767c;
        /* renamed from: d */
        Disposable f53768d;
        /* renamed from: e */
        volatile long f53769e;

        TimeoutObserver(Observer<? super T> observer, ObservableSource<U> observableSource, Function<? super T, ? extends ObservableSource<V>> function) {
            this.f53765a = observer;
            this.f53766b = observableSource;
            this.f53767c = function;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53768d, disposable)) {
                this.f53768d = disposable;
                disposable = this.f53765a;
                ObservableSource observableSource = this.f53766b;
                if (observableSource != null) {
                    Observer c18393b = new C18393b(this, 0);
                    if (compareAndSet(null, c18393b)) {
                        disposable.onSubscribe(this);
                        observableSource.subscribe(c18393b);
                        return;
                    }
                    return;
                }
                disposable.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            long j = this.f53769e + 1;
            this.f53769e = j;
            this.f53765a.onNext(t);
            Disposable disposable = (Disposable) get();
            if (disposable != null) {
                disposable.dispose();
            }
            try {
                ObservableSource observableSource = (ObservableSource) C15684a.m58895a(this.f53767c.apply(t), "The ObservableSource returned is null");
                Observer c18393b = new C18393b(this, j);
                if (compareAndSet(disposable, c18393b)) {
                    observableSource.subscribe(c18393b);
                }
            } catch (T t2) {
                C15678a.m58850b(t2);
                dispose();
                this.f53765a.onError(t2);
            }
        }

        public void onError(Throwable th) {
            DisposableHelper.dispose(this);
            this.f53765a.onError(th);
        }

        public void onComplete() {
            DisposableHelper.dispose(this);
            this.f53765a.onComplete();
        }

        public void dispose() {
            if (DisposableHelper.dispose(this)) {
                this.f53768d.dispose();
            }
        }

        public boolean isDisposed() {
            return this.f53768d.isDisposed();
        }

        /* renamed from: a */
        public void mo12913a(long j) {
            if (j == this.f53769e) {
                dispose();
                this.f53765a.onError(new TimeoutException());
            }
        }

        /* renamed from: a */
        public void mo12914a(Throwable th) {
            this.f53768d.dispose();
            this.f53765a.onError(th);
        }
    }

    static final class TimeoutOtherObserver<T, U, V> extends AtomicReference<Disposable> implements Observer<T>, Disposable, C15707a {
        private static final long serialVersionUID = -1957813281749686898L;
        /* renamed from: a */
        final Observer<? super T> f53770a;
        /* renamed from: b */
        final ObservableSource<U> f53771b;
        /* renamed from: c */
        final Function<? super T, ? extends ObservableSource<V>> f53772c;
        /* renamed from: d */
        final ObservableSource<? extends T> f53773d;
        /* renamed from: e */
        final C19000e<T> f53774e;
        /* renamed from: f */
        Disposable f53775f;
        /* renamed from: g */
        boolean f53776g;
        /* renamed from: h */
        volatile long f53777h;

        TimeoutOtherObserver(Observer<? super T> observer, ObservableSource<U> observableSource, Function<? super T, ? extends ObservableSource<V>> function, ObservableSource<? extends T> observableSource2) {
            this.f53770a = observer;
            this.f53771b = observableSource;
            this.f53772c = function;
            this.f53773d = observableSource2;
            this.f53774e = new C19000e(observer, this, 8);
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53775f, disposable)) {
                this.f53775f = disposable;
                this.f53774e.m67543a(disposable);
                disposable = this.f53770a;
                ObservableSource observableSource = this.f53771b;
                if (observableSource != null) {
                    Observer c18393b = new C18393b(this, 0);
                    if (compareAndSet(null, c18393b)) {
                        disposable.onSubscribe(this.f53774e);
                        observableSource.subscribe(c18393b);
                        return;
                    }
                    return;
                }
                disposable.onSubscribe(this.f53774e);
            }
        }

        public void onNext(T t) {
            if (!this.f53776g) {
                long j = this.f53777h + 1;
                this.f53777h = j;
                if (this.f53774e.m67544a((Object) t, this.f53775f)) {
                    Disposable disposable = (Disposable) get();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    try {
                        ObservableSource observableSource = (ObservableSource) C15684a.m58895a(this.f53772c.apply(t), "The ObservableSource returned is null");
                        Observer c18393b = new C18393b(this, j);
                        if (compareAndSet(disposable, c18393b)) {
                            observableSource.subscribe(c18393b);
                        }
                    } catch (T t2) {
                        C15678a.m58850b(t2);
                        this.f53770a.onError(t2);
                    }
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f53776g) {
                C2667a.a(th);
                return;
            }
            this.f53776g = true;
            dispose();
            this.f53774e.m67542a(th, this.f53775f);
        }

        public void onComplete() {
            if (!this.f53776g) {
                this.f53776g = true;
                dispose();
                this.f53774e.m67546b(this.f53775f);
            }
        }

        public void dispose() {
            if (DisposableHelper.dispose(this)) {
                this.f53775f.dispose();
            }
        }

        public boolean isDisposed() {
            return this.f53775f.isDisposed();
        }

        /* renamed from: a */
        public void mo12913a(long j) {
            if (j == this.f53777h) {
                dispose();
                this.f53773d.subscribe(new C17392h(this.f53774e));
            }
        }

        /* renamed from: a */
        public void mo12914a(Throwable th) {
            this.f53775f.dispose();
            this.f53770a.onError(th);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableTimeout$b */
    static final class C18393b<T, U, V> extends C17528b<Object> {
        /* renamed from: a */
        final C15707a f57215a;
        /* renamed from: b */
        final long f57216b;
        /* renamed from: c */
        boolean f57217c;

        C18393b(C15707a c15707a, long j) {
            this.f57215a = c15707a;
            this.f57216b = j;
        }

        public void onNext(Object obj) {
            if (this.f57217c == null) {
                this.f57217c = true;
                dispose();
                this.f57215a.mo12913a(this.f57216b);
            }
        }

        public void onError(Throwable th) {
            if (this.f57217c) {
                C2667a.a(th);
                return;
            }
            this.f57217c = true;
            this.f57215a.mo12914a(th);
        }

        public void onComplete() {
            if (!this.f57217c) {
                this.f57217c = true;
                this.f57215a.mo12913a(this.f57216b);
            }
        }
    }

    public ObservableTimeout(ObservableSource<T> observableSource, ObservableSource<U> observableSource2, Function<? super T, ? extends ObservableSource<V>> function, ObservableSource<? extends T> observableSource3) {
        super(observableSource);
        this.f59003b = observableSource2;
        this.f59004c = function;
        this.f59005d = observableSource3;
    }

    public void subscribeActual(Observer<? super T> observer) {
        if (this.f59005d == null) {
            this.a.subscribe(new TimeoutObserver(new C17530d(observer), this.f59003b, this.f59004c));
        } else {
            this.a.subscribe(new TimeoutOtherObserver(observer, this.f59003b, this.f59004c, this.f59005d));
        }
    }
}
