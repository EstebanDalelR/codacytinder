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
import io.reactivex.internal.observers.InnerQueuedObserver;
import io.reactivex.internal.observers.InnerQueuedObserverSupport;
import io.reactivex.internal.queue.C18423a;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.p079d.C2667a;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

public final class ObservableConcatMapEager<T, R> extends C18394a<T, R> {
    /* renamed from: b */
    final Function<? super T, ? extends ObservableSource<? extends R>> f58912b;
    /* renamed from: c */
    final ErrorMode f58913c;
    /* renamed from: d */
    final int f58914d;
    /* renamed from: e */
    final int f58915e;

    static final class ConcatMapEagerMainObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable, InnerQueuedObserverSupport<R> {
        private static final long serialVersionUID = 8080567949447303262L;
        /* renamed from: a */
        final Observer<? super R> f53402a;
        /* renamed from: b */
        final Function<? super T, ? extends ObservableSource<? extends R>> f53403b;
        /* renamed from: c */
        final int f53404c;
        /* renamed from: d */
        final int f53405d;
        /* renamed from: e */
        final ErrorMode f53406e;
        /* renamed from: f */
        final AtomicThrowable f53407f = new AtomicThrowable();
        /* renamed from: g */
        final ArrayDeque<InnerQueuedObserver<R>> f53408g = new ArrayDeque();
        /* renamed from: h */
        SimpleQueue<T> f53409h;
        /* renamed from: i */
        Disposable f53410i;
        /* renamed from: j */
        volatile boolean f53411j;
        /* renamed from: k */
        int f53412k;
        /* renamed from: l */
        volatile boolean f53413l;
        /* renamed from: m */
        InnerQueuedObserver<R> f53414m;
        /* renamed from: n */
        int f53415n;

        ConcatMapEagerMainObserver(Observer<? super R> observer, Function<? super T, ? extends ObservableSource<? extends R>> function, int i, int i2, ErrorMode errorMode) {
            this.f53402a = observer;
            this.f53403b = function;
            this.f53404c = i;
            this.f53405d = i2;
            this.f53406e = errorMode;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53410i, disposable)) {
                this.f53410i = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int requestFusion = queueDisposable.requestFusion(3);
                    if (requestFusion == 1) {
                        this.f53412k = requestFusion;
                        this.f53409h = queueDisposable;
                        this.f53411j = true;
                        this.f53402a.onSubscribe(this);
                        drain();
                        return;
                    } else if (requestFusion == 2) {
                        this.f53412k = requestFusion;
                        this.f53409h = queueDisposable;
                        this.f53402a.onSubscribe(this);
                        return;
                    }
                }
                this.f53409h = new C18423a(this.f53405d);
                this.f53402a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            if (this.f53412k == 0) {
                this.f53409h.offer(t);
            }
            drain();
        }

        public void onError(Throwable th) {
            if (this.f53407f.m58961a(th)) {
                this.f53411j = true;
                drain();
                return;
            }
            C2667a.a(th);
        }

        public void onComplete() {
            this.f53411j = true;
            drain();
        }

        public void dispose() {
            this.f53413l = true;
            if (getAndIncrement() == 0) {
                this.f53409h.clear();
                m63538a();
            }
        }

        public boolean isDisposed() {
            return this.f53413l;
        }

        /* renamed from: a */
        void m63538a() {
            InnerQueuedObserver innerQueuedObserver = this.f53414m;
            if (innerQueuedObserver != null) {
                innerQueuedObserver.dispose();
            }
            while (true) {
                innerQueuedObserver = (InnerQueuedObserver) this.f53408g.poll();
                if (innerQueuedObserver != null) {
                    innerQueuedObserver.dispose();
                } else {
                    return;
                }
            }
        }

        public void innerNext(InnerQueuedObserver<R> innerQueuedObserver, R r) {
            innerQueuedObserver.m63480c().offer(r);
            drain();
        }

        public void innerError(InnerQueuedObserver<R> innerQueuedObserver, Throwable th) {
            if (this.f53407f.m58961a(th)) {
                if (this.f53406e == ErrorMode.IMMEDIATE) {
                    this.f53410i.dispose();
                }
                innerQueuedObserver.m63479b();
                drain();
                return;
            }
            C2667a.a(th);
        }

        public void innerComplete(InnerQueuedObserver<R> innerQueuedObserver) {
            innerQueuedObserver.m63479b();
            drain();
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                SimpleQueue simpleQueue = this.f53409h;
                ArrayDeque arrayDeque = this.f53408g;
                Observer observer = this.f53402a;
                ErrorMode errorMode = this.f53406e;
                int i = 1;
                while (true) {
                    int i2 = this.f53415n;
                    while (i2 != this.f53404c) {
                        if (this.f53413l) {
                            simpleQueue.clear();
                            m63538a();
                            return;
                        } else if (errorMode != ErrorMode.IMMEDIATE || ((Throwable) this.f53407f.get()) == null) {
                            try {
                                Object poll = simpleQueue.poll();
                                if (poll == null) {
                                    break;
                                }
                                ObservableSource observableSource = (ObservableSource) C15684a.m58895a(this.f53403b.apply(poll), "The mapper returned a null ObservableSource");
                                Observer innerQueuedObserver = new InnerQueuedObserver(this, this.f53405d);
                                arrayDeque.offer(innerQueuedObserver);
                                observableSource.subscribe(innerQueuedObserver);
                                i2++;
                            } catch (Throwable th) {
                                C15678a.m58850b(th);
                                this.f53410i.dispose();
                                simpleQueue.clear();
                                m63538a();
                                this.f53407f.m58961a(th);
                                observer.onError(this.f53407f.m58960a());
                                return;
                            }
                        } else {
                            simpleQueue.clear();
                            m63538a();
                            observer.onError(this.f53407f.m58960a());
                            return;
                        }
                    }
                    this.f53415n = i2;
                    if (this.f53413l) {
                        simpleQueue.clear();
                        m63538a();
                        return;
                    } else if (errorMode != ErrorMode.IMMEDIATE || ((Throwable) this.f53407f.get()) == null) {
                        InnerQueuedObserver innerQueuedObserver2 = this.f53414m;
                        if (innerQueuedObserver2 == null) {
                            if (errorMode != ErrorMode.BOUNDARY || ((Throwable) this.f53407f.get()) == null) {
                                boolean z = this.f53411j;
                                InnerQueuedObserver innerQueuedObserver3 = (InnerQueuedObserver) arrayDeque.poll();
                                Object obj = innerQueuedObserver3 == null ? 1 : null;
                                if (z && obj != null) {
                                    break;
                                }
                                if (obj == null) {
                                    this.f53414m = innerQueuedObserver3;
                                }
                                innerQueuedObserver2 = innerQueuedObserver3;
                            } else {
                                simpleQueue.clear();
                                m63538a();
                                observer.onError(this.f53407f.m58960a());
                                return;
                            }
                        }
                        if (innerQueuedObserver2 != null) {
                            SimpleQueue c = innerQueuedObserver2.m63480c();
                            while (!this.f53413l) {
                                boolean a = innerQueuedObserver2.m63478a();
                                if (errorMode != ErrorMode.IMMEDIATE || ((Throwable) this.f53407f.get()) == null) {
                                    try {
                                        Object poll2 = c.poll();
                                        Object obj2 = poll2 == null ? 1 : null;
                                        if (a && obj2 != null) {
                                            this.f53414m = null;
                                            this.f53415n--;
                                        } else if (obj2 == null) {
                                            observer.onNext(poll2);
                                        }
                                    } catch (Throwable th2) {
                                        C15678a.m58850b(th2);
                                        this.f53407f.m58961a(th2);
                                        this.f53414m = null;
                                        this.f53415n--;
                                    }
                                } else {
                                    simpleQueue.clear();
                                    m63538a();
                                    observer.onError(this.f53407f.m58960a());
                                    return;
                                }
                            }
                            simpleQueue.clear();
                            m63538a();
                            return;
                        }
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        simpleQueue.clear();
                        m63538a();
                        observer.onError(this.f53407f.m58960a());
                        return;
                    }
                }
                if (((Throwable) this.f53407f.get()) != null) {
                    simpleQueue.clear();
                    m63538a();
                    observer.onError(this.f53407f.m58960a());
                } else {
                    observer.onComplete();
                }
            }
        }
    }

    public ObservableConcatMapEager(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends R>> function, ErrorMode errorMode, int i, int i2) {
        super(observableSource);
        this.f58912b = function;
        this.f58913c = errorMode;
        this.f58914d = i;
        this.f58915e = i2;
    }

    protected void subscribeActual(Observer<? super R> observer) {
        this.a.subscribe(new ConcatMapEagerMainObserver(observer, this.f58912b, this.f58914d, this.f58915e, this.f58913c));
    }
}
