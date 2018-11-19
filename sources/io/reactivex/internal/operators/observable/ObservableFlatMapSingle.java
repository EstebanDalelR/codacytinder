package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
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

public final class ObservableFlatMapSingle<T, R> extends C18394a<T, R> {
    /* renamed from: b */
    final Function<? super T, ? extends SingleSource<? extends R>> f58931b;
    /* renamed from: c */
    final boolean f58932c;

    static final class FlatMapSingleObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        private static final long serialVersionUID = 8600231336733376951L;
        /* renamed from: a */
        final Observer<? super R> f53480a;
        /* renamed from: b */
        final boolean f53481b;
        /* renamed from: c */
        final C17356a f53482c = new C17356a();
        /* renamed from: d */
        final AtomicInteger f53483d = new AtomicInteger(1);
        /* renamed from: e */
        final AtomicThrowable f53484e = new AtomicThrowable();
        /* renamed from: f */
        final Function<? super T, ? extends SingleSource<? extends R>> f53485f;
        /* renamed from: g */
        final AtomicReference<C18423a<R>> f53486g = new AtomicReference();
        /* renamed from: h */
        Disposable f53487h;
        /* renamed from: i */
        volatile boolean f53488i;

        final class InnerObserver extends AtomicReference<Disposable> implements SingleObserver<R>, Disposable {
            private static final long serialVersionUID = -502562646270949838L;
            /* renamed from: a */
            final /* synthetic */ FlatMapSingleObserver f53479a;

            InnerObserver(FlatMapSingleObserver flatMapSingleObserver) {
                this.f53479a = flatMapSingleObserver;
            }

            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            public void onSuccess(R r) {
                this.f53479a.m63561a(this, (Object) r);
            }

            public void onError(Throwable th) {
                this.f53479a.m63562a(this, th);
            }

            public boolean isDisposed() {
                return DisposableHelper.isDisposed((Disposable) get());
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }
        }

        FlatMapSingleObserver(Observer<? super R> observer, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z) {
            this.f53480a = observer;
            this.f53485f = function;
            this.f53481b = z;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53487h, disposable)) {
                this.f53487h = disposable;
                this.f53480a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            try {
                SingleSource singleSource = (SingleSource) C15684a.m58895a(this.f53485f.apply(t), "The mapper returned a null SingleSource");
                this.f53483d.getAndIncrement();
                Object innerObserver = new InnerObserver(this);
                if (!this.f53488i && this.f53482c.add(innerObserver)) {
                    singleSource.subscribe(innerObserver);
                }
            } catch (T t2) {
                C15678a.m58850b(t2);
                this.f53487h.dispose();
                onError(t2);
            }
        }

        public void onError(Throwable th) {
            this.f53483d.decrementAndGet();
            if (this.f53484e.m58961a(th)) {
                if (this.f53481b == null) {
                    this.f53482c.dispose();
                }
                m63563b();
                return;
            }
            C2667a.a(th);
        }

        public void onComplete() {
            this.f53483d.decrementAndGet();
            m63563b();
        }

        public void dispose() {
            this.f53488i = true;
            this.f53487h.dispose();
            this.f53482c.dispose();
        }

        public boolean isDisposed() {
            return this.f53488i;
        }

        /* renamed from: a */
        void m63561a(InnerObserver innerObserver, R r) {
            this.f53482c.delete(innerObserver);
            if (get() == null) {
                innerObserver = true;
                if (compareAndSet(0, 1)) {
                    this.f53480a.onNext(r);
                    if (this.f53483d.decrementAndGet() != null) {
                        innerObserver = null;
                    }
                    C18423a c18423a = (C18423a) this.f53486g.get();
                    if (innerObserver == null || (c18423a != null && c18423a.isEmpty() == null)) {
                        if (decrementAndGet() == null) {
                            return;
                        }
                        m63565d();
                    }
                    innerObserver = this.f53484e.m58960a();
                    if (innerObserver != null) {
                        this.f53480a.onError(innerObserver);
                    } else {
                        this.f53480a.onComplete();
                    }
                    return;
                }
            }
            innerObserver = m63560a();
            synchronized (innerObserver) {
                innerObserver.offer(r);
            }
            this.f53483d.decrementAndGet();
            if (getAndIncrement() != null) {
                return;
            }
            m63565d();
        }

        /* renamed from: a */
        C18423a<R> m63560a() {
            C18423a<R> c18423a;
            do {
                c18423a = (C18423a) this.f53486g.get();
                if (c18423a != null) {
                    return c18423a;
                }
                c18423a = new C18423a(C3959e.bufferSize());
            } while (!this.f53486g.compareAndSet(null, c18423a));
            return c18423a;
        }

        /* renamed from: a */
        void m63562a(InnerObserver innerObserver, Throwable th) {
            this.f53482c.delete(innerObserver);
            if (this.f53484e.m58961a(th) != null) {
                if (this.f53481b == null) {
                    this.f53487h.dispose();
                    this.f53482c.dispose();
                }
                this.f53483d.decrementAndGet();
                m63563b();
                return;
            }
            C2667a.a(th);
        }

        /* renamed from: b */
        void m63563b() {
            if (getAndIncrement() == 0) {
                m63565d();
            }
        }

        /* renamed from: c */
        void m63564c() {
            C18423a c18423a = (C18423a) this.f53486g.get();
            if (c18423a != null) {
                c18423a.clear();
            }
        }

        /* renamed from: d */
        void m63565d() {
            Observer observer = this.f53480a;
            AtomicInteger atomicInteger = this.f53483d;
            AtomicReference atomicReference = this.f53486g;
            int i = 1;
            while (!this.f53488i) {
                Throwable a;
                if (this.f53481b || ((Throwable) this.f53484e.get()) == null) {
                    Object obj = null;
                    Object obj2 = atomicInteger.get() == 0 ? 1 : null;
                    C18423a c18423a = (C18423a) atomicReference.get();
                    Object poll = c18423a != null ? c18423a.poll() : null;
                    if (poll == null) {
                        obj = 1;
                    }
                    if (obj2 != null && obj != null) {
                        a = this.f53484e.m58960a();
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
                    a = this.f53484e.m58960a();
                    m63564c();
                    observer.onError(a);
                    return;
                }
            }
            m63564c();
        }
    }

    public ObservableFlatMapSingle(ObservableSource<T> observableSource, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z) {
        super(observableSource);
        this.f58931b = function;
        this.f58932c = z;
    }

    protected void subscribeActual(Observer<? super R> observer) {
        this.a.subscribe(new FlatMapSingleObserver(observer, this.f58931b, this.f58932c));
    }
}
