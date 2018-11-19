package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
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
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableFlatMapMaybe<T, R> extends C18394a<T, R> {
    /* renamed from: b */
    final Function<? super T, ? extends MaybeSource<? extends R>> f58929b;
    /* renamed from: c */
    final boolean f58930c;

    static final class FlatMapMaybeObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        private static final long serialVersionUID = 8600231336733376951L;
        /* renamed from: a */
        final Observer<? super R> f53470a;
        /* renamed from: b */
        final boolean f53471b;
        /* renamed from: c */
        final C17356a f53472c = new C17356a();
        /* renamed from: d */
        final AtomicInteger f53473d = new AtomicInteger(1);
        /* renamed from: e */
        final AtomicThrowable f53474e = new AtomicThrowable();
        /* renamed from: f */
        final Function<? super T, ? extends MaybeSource<? extends R>> f53475f;
        /* renamed from: g */
        final AtomicReference<C18423a<R>> f53476g = new AtomicReference();
        /* renamed from: h */
        Disposable f53477h;
        /* renamed from: i */
        volatile boolean f53478i;

        final class InnerObserver extends AtomicReference<Disposable> implements MaybeObserver<R>, Disposable {
            private static final long serialVersionUID = -502562646270949838L;
            /* renamed from: a */
            final /* synthetic */ FlatMapMaybeObserver f53469a;

            InnerObserver(FlatMapMaybeObserver flatMapMaybeObserver) {
                this.f53469a = flatMapMaybeObserver;
            }

            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            public void onSuccess(R r) {
                this.f53469a.m63555a(this, (Object) r);
            }

            public void onError(Throwable th) {
                this.f53469a.m63556a(this, th);
            }

            public void onComplete() {
                this.f53469a.m63554a(this);
            }

            public boolean isDisposed() {
                return DisposableHelper.isDisposed((Disposable) get());
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }
        }

        FlatMapMaybeObserver(Observer<? super R> observer, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z) {
            this.f53470a = observer;
            this.f53475f = function;
            this.f53471b = z;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53477h, disposable)) {
                this.f53477h = disposable;
                this.f53470a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            try {
                MaybeSource maybeSource = (MaybeSource) C15684a.m58895a(this.f53475f.apply(t), "The mapper returned a null MaybeSource");
                this.f53473d.getAndIncrement();
                Object innerObserver = new InnerObserver(this);
                if (!this.f53478i && this.f53472c.add(innerObserver)) {
                    maybeSource.subscribe(innerObserver);
                }
            } catch (T t2) {
                C15678a.m58850b(t2);
                this.f53477h.dispose();
                onError(t2);
            }
        }

        public void onError(Throwable th) {
            this.f53473d.decrementAndGet();
            if (this.f53474e.m58961a(th)) {
                if (this.f53471b == null) {
                    this.f53472c.dispose();
                }
                m63557b();
                return;
            }
            C2667a.a(th);
        }

        public void onComplete() {
            this.f53473d.decrementAndGet();
            m63557b();
        }

        public void dispose() {
            this.f53478i = true;
            this.f53477h.dispose();
            this.f53472c.dispose();
        }

        public boolean isDisposed() {
            return this.f53478i;
        }

        /* renamed from: a */
        void m63555a(InnerObserver innerObserver, R r) {
            this.f53472c.delete(innerObserver);
            if (get() == null) {
                innerObserver = true;
                if (compareAndSet(0, 1)) {
                    this.f53470a.onNext(r);
                    if (this.f53473d.decrementAndGet() != null) {
                        innerObserver = null;
                    }
                    C18423a c18423a = (C18423a) this.f53476g.get();
                    if (innerObserver == null || (c18423a != null && c18423a.isEmpty() == null)) {
                        if (decrementAndGet() == null) {
                            return;
                        }
                        m63559d();
                    }
                    innerObserver = this.f53474e.m58960a();
                    if (innerObserver != null) {
                        this.f53470a.onError(innerObserver);
                    } else {
                        this.f53470a.onComplete();
                    }
                    return;
                }
            }
            innerObserver = m63553a();
            synchronized (innerObserver) {
                innerObserver.offer(r);
            }
            this.f53473d.decrementAndGet();
            if (getAndIncrement() != null) {
                return;
            }
            m63559d();
        }

        /* renamed from: a */
        C18423a<R> m63553a() {
            C18423a<R> c18423a;
            do {
                c18423a = (C18423a) this.f53476g.get();
                if (c18423a != null) {
                    return c18423a;
                }
                c18423a = new C18423a(C3959e.bufferSize());
            } while (!this.f53476g.compareAndSet(null, c18423a));
            return c18423a;
        }

        /* renamed from: a */
        void m63556a(InnerObserver innerObserver, Throwable th) {
            this.f53472c.delete(innerObserver);
            if (this.f53474e.m58961a(th) != null) {
                if (this.f53471b == null) {
                    this.f53477h.dispose();
                    this.f53472c.dispose();
                }
                this.f53473d.decrementAndGet();
                m63557b();
                return;
            }
            C2667a.a(th);
        }

        /* renamed from: a */
        void m63554a(InnerObserver innerObserver) {
            this.f53472c.delete(innerObserver);
            if (get() == null) {
                innerObserver = true;
                if (compareAndSet(0, 1)) {
                    if (this.f53473d.decrementAndGet() != 0) {
                        innerObserver = null;
                    }
                    C18423a c18423a = (C18423a) this.f53476g.get();
                    if (innerObserver != null && (c18423a == null || c18423a.isEmpty() != null)) {
                        innerObserver = this.f53474e.m58960a();
                        if (innerObserver != null) {
                            this.f53470a.onError(innerObserver);
                        } else {
                            this.f53470a.onComplete();
                        }
                        return;
                    } else if (decrementAndGet() != null) {
                        m63559d();
                    } else {
                        return;
                    }
                }
            }
            this.f53473d.decrementAndGet();
            m63557b();
        }

        /* renamed from: b */
        void m63557b() {
            if (getAndIncrement() == 0) {
                m63559d();
            }
        }

        /* renamed from: c */
        void m63558c() {
            C18423a c18423a = (C18423a) this.f53476g.get();
            if (c18423a != null) {
                c18423a.clear();
            }
        }

        /* renamed from: d */
        void m63559d() {
            Observer observer = this.f53470a;
            AtomicInteger atomicInteger = this.f53473d;
            AtomicReference atomicReference = this.f53476g;
            int i = 1;
            while (!this.f53478i) {
                Throwable a;
                if (this.f53471b || ((Throwable) this.f53474e.get()) == null) {
                    Object obj = null;
                    Object obj2 = atomicInteger.get() == 0 ? 1 : null;
                    C18423a c18423a = (C18423a) atomicReference.get();
                    Object poll = c18423a != null ? c18423a.poll() : null;
                    if (poll == null) {
                        obj = 1;
                    }
                    if (obj2 != null && obj != null) {
                        a = this.f53474e.m58960a();
                        if (a != null) {
                            observer.onError(a);
                        } else {
                            observer.onComplete();
                        }
                        return;
                    } else if (obj != null) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        observer.onNext(poll);
                    }
                } else {
                    a = this.f53474e.m58960a();
                    m63558c();
                    observer.onError(a);
                    return;
                }
            }
            m63558c();
        }
    }

    public ObservableFlatMapMaybe(ObservableSource<T> observableSource, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z) {
        super(observableSource);
        this.f58929b = function;
        this.f58930c = z;
    }

    protected void subscribeActual(Observer<? super R> observer) {
        this.a.subscribe(new FlatMapMaybeObserver(observer, this.f58929b, this.f58930c));
    }
}
