package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.C18423a;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableMergeWithMaybe<T> extends C18394a<T, T> {
    /* renamed from: b */
    final MaybeSource<? extends T> f58947b;

    static final class MergeWithObserver<T> extends AtomicInteger implements Observer<T>, Disposable {
        private static final long serialVersionUID = -4592979584110982903L;
        /* renamed from: a */
        final Observer<? super T> f53574a;
        /* renamed from: b */
        final AtomicReference<Disposable> f53575b = new AtomicReference();
        /* renamed from: c */
        final OtherObserver<T> f53576c = new OtherObserver(this);
        /* renamed from: d */
        final AtomicThrowable f53577d = new AtomicThrowable();
        /* renamed from: e */
        volatile SimplePlainQueue<T> f53578e;
        /* renamed from: f */
        T f53579f;
        /* renamed from: g */
        volatile boolean f53580g;
        /* renamed from: h */
        volatile boolean f53581h;
        /* renamed from: i */
        volatile int f53582i;

        static final class OtherObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {
            private static final long serialVersionUID = -2935427570954647017L;
            /* renamed from: a */
            final MergeWithObserver<T> f53573a;

            OtherObserver(MergeWithObserver<T> mergeWithObserver) {
                this.f53573a = mergeWithObserver;
            }

            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            public void onSuccess(T t) {
                this.f53573a.m63604a((Object) t);
            }

            public void onError(Throwable th) {
                this.f53573a.m63605a(th);
            }

            public void onComplete() {
                this.f53573a.m63603a();
            }
        }

        MergeWithObserver(Observer<? super T> observer) {
            this.f53574a = observer;
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f53575b, disposable);
        }

        public void onNext(T t) {
            if (compareAndSet(0, 1)) {
                this.f53574a.onNext(t);
                if (decrementAndGet() == null) {
                    return;
                }
            }
            m63606b().offer(t);
            if (getAndIncrement() != null) {
                return;
            }
            m63608d();
        }

        public void onError(Throwable th) {
            if (this.f53577d.m58961a(th)) {
                DisposableHelper.dispose(this.f53575b);
                m63607c();
                return;
            }
            C2667a.a(th);
        }

        public void onComplete() {
            this.f53581h = true;
            m63607c();
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) this.f53575b.get());
        }

        public void dispose() {
            this.f53580g = true;
            DisposableHelper.dispose(this.f53575b);
            DisposableHelper.dispose(this.f53576c);
            if (getAndIncrement() == 0) {
                this.f53578e = null;
                this.f53579f = null;
            }
        }

        /* renamed from: a */
        void m63604a(T t) {
            if (compareAndSet(0, 1)) {
                this.f53574a.onNext(t);
                this.f53582i = 2;
            } else {
                this.f53579f = t;
                this.f53582i = 1;
                if (getAndIncrement() != null) {
                    return;
                }
            }
            m63608d();
        }

        /* renamed from: a */
        void m63605a(Throwable th) {
            if (this.f53577d.m58961a(th)) {
                DisposableHelper.dispose(this.f53575b);
                m63607c();
                return;
            }
            C2667a.a(th);
        }

        /* renamed from: a */
        void m63603a() {
            this.f53582i = 2;
            m63607c();
        }

        /* renamed from: b */
        SimplePlainQueue<T> m63606b() {
            SimplePlainQueue<T> simplePlainQueue = this.f53578e;
            if (simplePlainQueue != null) {
                return simplePlainQueue;
            }
            simplePlainQueue = new C18423a(C3959e.bufferSize());
            this.f53578e = simplePlainQueue;
            return simplePlainQueue;
        }

        /* renamed from: c */
        void m63607c() {
            if (getAndIncrement() == 0) {
                m63608d();
            }
        }

        /* renamed from: d */
        void m63608d() {
            Observer observer = this.f53574a;
            int i = 1;
            while (!this.f53580g) {
                if (this.f53577d.get() != null) {
                    this.f53579f = null;
                    this.f53578e = null;
                    observer.onError(this.f53577d.m58960a());
                    return;
                }
                int i2 = this.f53582i;
                if (i2 == 1) {
                    Object obj = this.f53579f;
                    this.f53579f = null;
                    this.f53582i = 2;
                    observer.onNext(obj);
                    i2 = 2;
                }
                boolean z = this.f53581h;
                SimplePlainQueue simplePlainQueue = this.f53578e;
                Object poll = simplePlainQueue != null ? simplePlainQueue.poll() : null;
                Object obj2 = poll == null ? 1 : null;
                if (z && obj2 != null && r3 == 2) {
                    this.f53578e = null;
                    observer.onComplete();
                    return;
                } else if (obj2 != null) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    observer.onNext(poll);
                }
            }
            this.f53579f = null;
            this.f53578e = null;
        }
    }

    public ObservableMergeWithMaybe(C3959e<T> c3959e, MaybeSource<? extends T> maybeSource) {
        super(c3959e);
        this.f58947b = maybeSource;
    }

    protected void subscribeActual(Observer<? super T> observer) {
        MergeWithObserver mergeWithObserver = new MergeWithObserver(observer);
        observer.onSubscribe(mergeWithObserver);
        this.a.subscribe(mergeWithObserver);
        this.f58947b.subscribe(mergeWithObserver.f53576c);
    }
}
