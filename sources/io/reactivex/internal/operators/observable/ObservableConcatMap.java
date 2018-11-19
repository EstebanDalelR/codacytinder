package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.C18423a;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.observers.C17530d;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableConcatMap<T, U> extends C18394a<T, U> {
    /* renamed from: b */
    final Function<? super T, ? extends ObservableSource<? extends U>> f58909b;
    /* renamed from: c */
    final int f58910c;
    /* renamed from: d */
    final ErrorMode f58911d;

    static final class ConcatMapDelayErrorObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        private static final long serialVersionUID = -6951100001833242599L;
        /* renamed from: a */
        final Observer<? super R> f53366a;
        /* renamed from: b */
        final Function<? super T, ? extends ObservableSource<? extends R>> f53367b;
        /* renamed from: c */
        final int f53368c;
        /* renamed from: d */
        final AtomicThrowable f53369d = new AtomicThrowable();
        /* renamed from: e */
        final DelayErrorInnerObserver<R> f53370e;
        /* renamed from: f */
        final boolean f53371f;
        /* renamed from: g */
        SimpleQueue<T> f53372g;
        /* renamed from: h */
        Disposable f53373h;
        /* renamed from: i */
        volatile boolean f53374i;
        /* renamed from: j */
        volatile boolean f53375j;
        /* renamed from: k */
        volatile boolean f53376k;
        /* renamed from: l */
        int f53377l;

        static final class DelayErrorInnerObserver<R> extends AtomicReference<Disposable> implements Observer<R> {
            private static final long serialVersionUID = 2620149119579502636L;
            /* renamed from: a */
            final Observer<? super R> f53364a;
            /* renamed from: b */
            final ConcatMapDelayErrorObserver<?, R> f53365b;

            DelayErrorInnerObserver(Observer<? super R> observer, ConcatMapDelayErrorObserver<?, R> concatMapDelayErrorObserver) {
                this.f53364a = observer;
                this.f53365b = concatMapDelayErrorObserver;
            }

            public void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }

            public void onNext(R r) {
                this.f53364a.onNext(r);
            }

            public void onError(Throwable th) {
                ConcatMapDelayErrorObserver concatMapDelayErrorObserver = this.f53365b;
                if (concatMapDelayErrorObserver.f53369d.m58961a(th)) {
                    if (concatMapDelayErrorObserver.f53371f == null) {
                        concatMapDelayErrorObserver.f53373h.dispose();
                    }
                    concatMapDelayErrorObserver.f53374i = null;
                    concatMapDelayErrorObserver.m63531a();
                    return;
                }
                C2667a.a(th);
            }

            public void onComplete() {
                ConcatMapDelayErrorObserver concatMapDelayErrorObserver = this.f53365b;
                concatMapDelayErrorObserver.f53374i = false;
                concatMapDelayErrorObserver.m63531a();
            }

            /* renamed from: a */
            void m63530a() {
                DisposableHelper.dispose(this);
            }
        }

        ConcatMapDelayErrorObserver(Observer<? super R> observer, Function<? super T, ? extends ObservableSource<? extends R>> function, int i, boolean z) {
            this.f53366a = observer;
            this.f53367b = function;
            this.f53368c = i;
            this.f53371f = z;
            this.f53370e = new DelayErrorInnerObserver(observer, this);
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53373h, disposable)) {
                this.f53373h = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int requestFusion = queueDisposable.requestFusion(3);
                    if (requestFusion == 1) {
                        this.f53377l = requestFusion;
                        this.f53372g = queueDisposable;
                        this.f53375j = true;
                        this.f53366a.onSubscribe(this);
                        m63531a();
                        return;
                    } else if (requestFusion == 2) {
                        this.f53377l = requestFusion;
                        this.f53372g = queueDisposable;
                        this.f53366a.onSubscribe(this);
                        return;
                    }
                }
                this.f53372g = new C18423a(this.f53368c);
                this.f53366a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            if (this.f53377l == 0) {
                this.f53372g.offer(t);
            }
            m63531a();
        }

        public void onError(Throwable th) {
            if (this.f53369d.m58961a(th)) {
                this.f53375j = true;
                m63531a();
                return;
            }
            C2667a.a(th);
        }

        public void onComplete() {
            this.f53375j = true;
            m63531a();
        }

        public boolean isDisposed() {
            return this.f53376k;
        }

        public void dispose() {
            this.f53376k = true;
            this.f53373h.dispose();
            this.f53370e.m63530a();
        }

        /* renamed from: a */
        void m63531a() {
            if (getAndIncrement() == 0) {
                Observer observer = this.f53366a;
                SimpleQueue simpleQueue = this.f53372g;
                AtomicThrowable atomicThrowable = this.f53369d;
                while (true) {
                    if (!this.f53374i) {
                        if (this.f53376k) {
                            simpleQueue.clear();
                            return;
                        } else if (this.f53371f || ((Throwable) atomicThrowable.get()) == null) {
                            boolean z = this.f53375j;
                            try {
                                Object poll = simpleQueue.poll();
                                Object obj = poll == null ? 1 : null;
                                if (z && obj != null) {
                                    break;
                                } else if (obj == null) {
                                    try {
                                        ObservableSource observableSource = (ObservableSource) C15684a.m58895a(this.f53367b.apply(poll), "The mapper returned a null ObservableSource");
                                        if (observableSource instanceof Callable) {
                                            try {
                                                Object call = ((Callable) observableSource).call();
                                                if (!(call == null || this.f53376k)) {
                                                    observer.onNext(call);
                                                }
                                            } catch (Throwable th) {
                                                C15678a.m58850b(th);
                                                atomicThrowable.m58961a(th);
                                            }
                                        } else {
                                            this.f53374i = true;
                                            observableSource.subscribe(this.f53370e);
                                        }
                                    } catch (Throwable th2) {
                                        C15678a.m58850b(th2);
                                        this.f53376k = true;
                                        this.f53373h.dispose();
                                        simpleQueue.clear();
                                        atomicThrowable.m58961a(th2);
                                        observer.onError(atomicThrowable.m58960a());
                                        return;
                                    }
                                }
                            } catch (Throwable th3) {
                                C15678a.m58850b(th3);
                                this.f53376k = true;
                                this.f53373h.dispose();
                                atomicThrowable.m58961a(th3);
                                observer.onError(atomicThrowable.m58960a());
                                return;
                            }
                        } else {
                            simpleQueue.clear();
                            this.f53376k = true;
                            observer.onError(atomicThrowable.m58960a());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                this.f53376k = true;
                Throwable th32 = atomicThrowable.m58960a();
                if (th32 != null) {
                    observer.onError(th32);
                } else {
                    observer.onComplete();
                }
            }
        }
    }

    static final class SourceObserver<T, U> extends AtomicInteger implements Observer<T>, Disposable {
        private static final long serialVersionUID = 8828587559905699186L;
        /* renamed from: a */
        final Observer<? super U> f53380a;
        /* renamed from: b */
        final Function<? super T, ? extends ObservableSource<? extends U>> f53381b;
        /* renamed from: c */
        final InnerObserver<U> f53382c;
        /* renamed from: d */
        final int f53383d;
        /* renamed from: e */
        SimpleQueue<T> f53384e;
        /* renamed from: f */
        Disposable f53385f;
        /* renamed from: g */
        volatile boolean f53386g;
        /* renamed from: h */
        volatile boolean f53387h;
        /* renamed from: i */
        volatile boolean f53388i;
        /* renamed from: j */
        int f53389j;

        static final class InnerObserver<U> extends AtomicReference<Disposable> implements Observer<U> {
            private static final long serialVersionUID = -7449079488798789337L;
            /* renamed from: a */
            final Observer<? super U> f53378a;
            /* renamed from: b */
            final SourceObserver<?, ?> f53379b;

            InnerObserver(Observer<? super U> observer, SourceObserver<?, ?> sourceObserver) {
                this.f53378a = observer;
                this.f53379b = sourceObserver;
            }

            public void onSubscribe(Disposable disposable) {
                DisposableHelper.set(this, disposable);
            }

            public void onNext(U u) {
                this.f53378a.onNext(u);
            }

            public void onError(Throwable th) {
                this.f53379b.dispose();
                this.f53378a.onError(th);
            }

            public void onComplete() {
                this.f53379b.m63533a();
            }

            /* renamed from: a */
            void m63532a() {
                DisposableHelper.dispose(this);
            }
        }

        SourceObserver(Observer<? super U> observer, Function<? super T, ? extends ObservableSource<? extends U>> function, int i) {
            this.f53380a = observer;
            this.f53381b = function;
            this.f53383d = i;
            this.f53382c = new InnerObserver(observer, this);
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53385f, disposable)) {
                this.f53385f = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int requestFusion = queueDisposable.requestFusion(3);
                    if (requestFusion == 1) {
                        this.f53389j = requestFusion;
                        this.f53384e = queueDisposable;
                        this.f53388i = true;
                        this.f53380a.onSubscribe(this);
                        m63534b();
                        return;
                    } else if (requestFusion == 2) {
                        this.f53389j = requestFusion;
                        this.f53384e = queueDisposable;
                        this.f53380a.onSubscribe(this);
                        return;
                    }
                }
                this.f53384e = new C18423a(this.f53383d);
                this.f53380a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            if (!this.f53388i) {
                if (this.f53389j == 0) {
                    this.f53384e.offer(t);
                }
                m63534b();
            }
        }

        public void onError(Throwable th) {
            if (this.f53388i) {
                C2667a.a(th);
                return;
            }
            this.f53388i = true;
            dispose();
            this.f53380a.onError(th);
        }

        public void onComplete() {
            if (!this.f53388i) {
                this.f53388i = true;
                m63534b();
            }
        }

        /* renamed from: a */
        void m63533a() {
            this.f53386g = false;
            m63534b();
        }

        public boolean isDisposed() {
            return this.f53387h;
        }

        public void dispose() {
            this.f53387h = true;
            this.f53382c.m63532a();
            this.f53385f.dispose();
            if (getAndIncrement() == 0) {
                this.f53384e.clear();
            }
        }

        /* renamed from: b */
        void m63534b() {
            if (getAndIncrement() == 0) {
                while (!this.f53387h) {
                    if (!this.f53386g) {
                        boolean z = this.f53388i;
                        try {
                            Object poll = this.f53384e.poll();
                            Object obj = poll == null ? 1 : null;
                            if (z && obj != null) {
                                this.f53387h = true;
                                this.f53380a.onComplete();
                                return;
                            } else if (obj == null) {
                                try {
                                    ObservableSource observableSource = (ObservableSource) C15684a.m58895a(this.f53381b.apply(poll), "The mapper returned a null ObservableSource");
                                    this.f53386g = true;
                                    observableSource.subscribe(this.f53382c);
                                } catch (Throwable th) {
                                    C15678a.m58850b(th);
                                    dispose();
                                    this.f53384e.clear();
                                    this.f53380a.onError(th);
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            C15678a.m58850b(th2);
                            dispose();
                            this.f53384e.clear();
                            this.f53380a.onError(th2);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                this.f53384e.clear();
            }
        }
    }

    public ObservableConcatMap(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends U>> function, int i, ErrorMode errorMode) {
        super(observableSource);
        this.f58909b = function;
        this.f58911d = errorMode;
        this.f58910c = Math.max(8, i);
    }

    public void subscribeActual(Observer<? super U> observer) {
        if (!ObservableScalarXMap.m58934a(this.a, observer, this.f58909b)) {
            if (this.f58911d == ErrorMode.IMMEDIATE) {
                this.a.subscribe(new SourceObserver(new C17530d(observer), this.f58909b, this.f58910c));
            } else {
                this.a.subscribe(new ConcatMapDelayErrorObserver(observer, this.f58909b, this.f58910c, this.f58911d == ErrorMode.END));
            }
        }
    }
}
