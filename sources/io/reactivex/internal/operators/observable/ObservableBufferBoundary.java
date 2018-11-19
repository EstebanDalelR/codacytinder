package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.C17356a;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.queue.C18423a;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.p079d.C2667a;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableBufferBoundary<T, U extends Collection<? super T>, Open, Close> extends C18394a<T, U> {
    /* renamed from: b */
    final Callable<U> f58904b;
    /* renamed from: c */
    final ObservableSource<? extends Open> f58905c;
    /* renamed from: d */
    final Function<? super Open, ? extends ObservableSource<? extends Close>> f58906d;

    static final class BufferBoundaryObserver<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements Observer<T>, Disposable {
        private static final long serialVersionUID = -8466418554264089604L;
        /* renamed from: a */
        final Observer<? super C> f53324a;
        /* renamed from: b */
        final Callable<C> f53325b;
        /* renamed from: c */
        final ObservableSource<? extends Open> f53326c;
        /* renamed from: d */
        final Function<? super Open, ? extends ObservableSource<? extends Close>> f53327d;
        /* renamed from: e */
        final C17356a f53328e = new C17356a();
        /* renamed from: f */
        final AtomicReference<Disposable> f53329f = new AtomicReference();
        /* renamed from: g */
        final AtomicThrowable f53330g = new AtomicThrowable();
        /* renamed from: h */
        volatile boolean f53331h;
        /* renamed from: i */
        final C18423a<C> f53332i = new C18423a(C3959e.bufferSize());
        /* renamed from: j */
        volatile boolean f53333j;
        /* renamed from: k */
        long f53334k;
        /* renamed from: l */
        Map<Long, C> f53335l = new LinkedHashMap();

        static final class BufferOpenObserver<Open> extends AtomicReference<Disposable> implements Observer<Open>, Disposable {
            private static final long serialVersionUID = -8498650778633225126L;
            /* renamed from: a */
            final BufferBoundaryObserver<?, ?, Open, ?> f53323a;

            BufferOpenObserver(BufferBoundaryObserver<?, ?, Open, ?> bufferBoundaryObserver) {
                this.f53323a = bufferBoundaryObserver;
            }

            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            public void onNext(Open open) {
                this.f53323a.m63517a((Object) open);
            }

            public void onError(Throwable th) {
                lazySet(DisposableHelper.DISPOSED);
                this.f53323a.m63514a((Disposable) this, th);
            }

            public void onComplete() {
                lazySet(DisposableHelper.DISPOSED);
                this.f53323a.m63515a(this);
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            public boolean isDisposed() {
                return get() == DisposableHelper.DISPOSED;
            }
        }

        BufferBoundaryObserver(Observer<? super C> observer, ObservableSource<? extends Open> observableSource, Function<? super Open, ? extends ObservableSource<? extends Close>> function, Callable<C> callable) {
            this.f53324a = observer;
            this.f53325b = callable;
            this.f53326c = observableSource;
            this.f53327d = function;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this.f53329f, disposable) != null) {
                disposable = new BufferOpenObserver(this);
                this.f53328e.add(disposable);
                this.f53326c.subscribe(disposable);
            }
        }

        public void onNext(T t) {
            synchronized (this) {
                Map map = this.f53335l;
                if (map == null) {
                    return;
                }
                for (Collection add : map.values()) {
                    add.add(t);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f53330g.m58961a(th)) {
                this.f53328e.dispose();
                synchronized (this) {
                    this.f53335l = null;
                }
                this.f53331h = true;
                m63513a();
                return;
            }
            C2667a.a(th);
        }

        public void onComplete() {
            this.f53328e.dispose();
            synchronized (this) {
                Map map = this.f53335l;
                if (map == null) {
                    return;
                }
                for (Collection offer : map.values()) {
                    this.f53332i.offer(offer);
                }
                this.f53335l = null;
                this.f53331h = true;
                m63513a();
            }
        }

        public void dispose() {
            if (DisposableHelper.dispose(this.f53329f)) {
                this.f53333j = true;
                this.f53328e.dispose();
                synchronized (this) {
                    this.f53335l = null;
                }
                if (getAndIncrement() != 0) {
                    this.f53332i.clear();
                }
            }
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) this.f53329f.get());
        }

        /* renamed from: a */
        void m63517a(Open open) {
            try {
                Collection collection = (Collection) C15684a.m58895a(this.f53325b.call(), "The bufferSupplier returned a null Collection");
                ObservableSource observableSource = (ObservableSource) C15684a.m58895a(this.f53327d.apply(open), "The bufferClose returned a null ObservableSource");
                long j = this.f53334k;
                this.f53334k = j + 1;
                synchronized (this) {
                    Map map = this.f53335l;
                    if (map == null) {
                        return;
                    }
                    map.put(Long.valueOf(j), collection);
                    Object bufferCloseObserver = new BufferCloseObserver(this, j);
                    this.f53328e.add(bufferCloseObserver);
                    observableSource.subscribe(bufferCloseObserver);
                }
            } catch (Open open2) {
                C15678a.m58850b(open2);
                DisposableHelper.dispose(this.f53329f);
                onError(open2);
            }
        }

        /* renamed from: a */
        void m63515a(BufferOpenObserver<Open> bufferOpenObserver) {
            this.f53328e.delete(bufferOpenObserver);
            if (this.f53328e.m63449b() == null) {
                DisposableHelper.dispose(this.f53329f);
                this.f53331h = true;
                m63513a();
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        void m63516a(io.reactivex.internal.operators.observable.ObservableBufferBoundary.BufferCloseObserver<T, C> r4, long r5) {
            /*
            r3 = this;
            r0 = r3.f53328e;
            r0.delete(r4);
            r4 = r3.f53328e;
            r4 = r4.m63449b();
            r0 = 1;
            if (r4 != 0) goto L_0x0015;
        L_0x000e:
            r4 = r3.f53329f;
            io.reactivex.internal.disposables.DisposableHelper.dispose(r4);
            r4 = 1;
            goto L_0x0016;
        L_0x0015:
            r4 = 0;
        L_0x0016:
            monitor-enter(r3);
            r1 = r3.f53335l;	 Catch:{ all -> 0x0035 }
            if (r1 != 0) goto L_0x001d;
        L_0x001b:
            monitor-exit(r3);	 Catch:{ all -> 0x0035 }
            return;
        L_0x001d:
            r1 = r3.f53332i;	 Catch:{ all -> 0x0035 }
            r2 = r3.f53335l;	 Catch:{ all -> 0x0035 }
            r5 = java.lang.Long.valueOf(r5);	 Catch:{ all -> 0x0035 }
            r5 = r2.remove(r5);	 Catch:{ all -> 0x0035 }
            r1.offer(r5);	 Catch:{ all -> 0x0035 }
            monitor-exit(r3);	 Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x0031;
        L_0x002f:
            r3.f53331h = r0;
        L_0x0031:
            r3.m63513a();
            return;
        L_0x0035:
            r4 = move-exception;
            monitor-exit(r3);	 Catch:{ all -> 0x0035 }
            throw r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableBufferBoundary.BufferBoundaryObserver.a(io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferCloseObserver, long):void");
        }

        /* renamed from: a */
        void m63514a(Disposable disposable, Throwable th) {
            DisposableHelper.dispose(this.f53329f);
            this.f53328e.delete(disposable);
            onError(th);
        }

        /* renamed from: a */
        void m63513a() {
            if (getAndIncrement() == 0) {
                Observer observer = this.f53324a;
                C18423a c18423a = this.f53332i;
                int i = 1;
                while (!this.f53333j) {
                    boolean z = this.f53331h;
                    if (!z || this.f53330g.get() == null) {
                        Collection collection = (Collection) c18423a.poll();
                        Object obj = collection == null ? 1 : null;
                        if (z && obj != null) {
                            observer.onComplete();
                            return;
                        } else if (obj != null) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            observer.onNext(collection);
                        }
                    } else {
                        c18423a.clear();
                        observer.onError(this.f53330g.m58960a());
                        return;
                    }
                }
                c18423a.clear();
            }
        }
    }

    static final class BufferCloseObserver<T, C extends Collection<? super T>> extends AtomicReference<Disposable> implements Observer<Object>, Disposable {
        private static final long serialVersionUID = -8498650778633225126L;
        /* renamed from: a */
        final BufferBoundaryObserver<T, C, ?, ?> f53336a;
        /* renamed from: b */
        final long f53337b;

        BufferCloseObserver(BufferBoundaryObserver<T, C, ?, ?> bufferBoundaryObserver, long j) {
            this.f53336a = bufferBoundaryObserver;
            this.f53337b = j;
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        public void onNext(Object obj) {
            Disposable disposable = (Disposable) get();
            if (disposable != DisposableHelper.DISPOSED) {
                lazySet(DisposableHelper.DISPOSED);
                disposable.dispose();
                this.f53336a.m63516a(this, this.f53337b);
            }
        }

        public void onError(Throwable th) {
            if (get() != DisposableHelper.DISPOSED) {
                lazySet(DisposableHelper.DISPOSED);
                this.f53336a.m63514a((Disposable) this, th);
                return;
            }
            C2667a.a(th);
        }

        public void onComplete() {
            if (get() != DisposableHelper.DISPOSED) {
                lazySet(DisposableHelper.DISPOSED);
                this.f53336a.m63516a(this, this.f53337b);
            }
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }
    }

    public ObservableBufferBoundary(ObservableSource<T> observableSource, ObservableSource<? extends Open> observableSource2, Function<? super Open, ? extends ObservableSource<? extends Close>> function, Callable<U> callable) {
        super(observableSource);
        this.f58905c = observableSource2;
        this.f58906d = function;
        this.f58904b = callable;
    }

    protected void subscribeActual(Observer<? super U> observer) {
        Object bufferBoundaryObserver = new BufferBoundaryObserver(observer, this.f58905c, this.f58906d, this.f58904b);
        observer.onSubscribe(bufferBoundaryObserver);
        this.a.subscribe(bufferBoundaryObserver);
    }
}
