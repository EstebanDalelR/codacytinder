package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.C18423a;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableMergeWithSingle<T> extends C18394a<T, T> {
    /* renamed from: b */
    final SingleSource<? extends T> f58948b;

    static final class MergeWithObserver<T> extends AtomicInteger implements Observer<T>, Disposable {
        private static final long serialVersionUID = -4592979584110982903L;
        /* renamed from: a */
        final Observer<? super T> f53584a;
        /* renamed from: b */
        final AtomicReference<Disposable> f53585b = new AtomicReference();
        /* renamed from: c */
        final OtherObserver<T> f53586c = new OtherObserver(this);
        /* renamed from: d */
        final AtomicThrowable f53587d = new AtomicThrowable();
        /* renamed from: e */
        volatile SimplePlainQueue<T> f53588e;
        /* renamed from: f */
        T f53589f;
        /* renamed from: g */
        volatile boolean f53590g;
        /* renamed from: h */
        volatile boolean f53591h;
        /* renamed from: i */
        volatile int f53592i;

        static final class OtherObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T> {
            private static final long serialVersionUID = -2935427570954647017L;
            /* renamed from: a */
            final MergeWithObserver<T> f53583a;

            OtherObserver(MergeWithObserver<T> mergeWithObserver) {
                this.f53583a = mergeWithObserver;
            }

            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            public void onSuccess(T t) {
                this.f53583a.m63610a((Object) t);
            }

            public void onError(Throwable th) {
                this.f53583a.m63611a(th);
            }
        }

        MergeWithObserver(Observer<? super T> observer) {
            this.f53584a = observer;
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f53585b, disposable);
        }

        public void onNext(T t) {
            if (compareAndSet(0, 1)) {
                this.f53584a.onNext(t);
                if (decrementAndGet() == null) {
                    return;
                }
            }
            m63609a().offer(t);
            if (getAndIncrement() != null) {
                return;
            }
            m63613c();
        }

        public void onError(Throwable th) {
            if (this.f53587d.m58961a(th)) {
                DisposableHelper.dispose(this.f53585b);
                m63612b();
                return;
            }
            C2667a.a(th);
        }

        public void onComplete() {
            this.f53591h = true;
            m63612b();
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) this.f53585b.get());
        }

        public void dispose() {
            this.f53590g = true;
            DisposableHelper.dispose(this.f53585b);
            DisposableHelper.dispose(this.f53586c);
            if (getAndIncrement() == 0) {
                this.f53588e = null;
                this.f53589f = null;
            }
        }

        /* renamed from: a */
        void m63610a(T t) {
            if (compareAndSet(0, 1)) {
                this.f53584a.onNext(t);
                this.f53592i = 2;
            } else {
                this.f53589f = t;
                this.f53592i = 1;
                if (getAndIncrement() != null) {
                    return;
                }
            }
            m63613c();
        }

        /* renamed from: a */
        void m63611a(Throwable th) {
            if (this.f53587d.m58961a(th)) {
                DisposableHelper.dispose(this.f53585b);
                m63612b();
                return;
            }
            C2667a.a(th);
        }

        /* renamed from: a */
        SimplePlainQueue<T> m63609a() {
            SimplePlainQueue<T> simplePlainQueue = this.f53588e;
            if (simplePlainQueue != null) {
                return simplePlainQueue;
            }
            simplePlainQueue = new C18423a(C3959e.bufferSize());
            this.f53588e = simplePlainQueue;
            return simplePlainQueue;
        }

        /* renamed from: b */
        void m63612b() {
            if (getAndIncrement() == 0) {
                m63613c();
            }
        }

        /* renamed from: c */
        void m63613c() {
            Observer observer = this.f53584a;
            int i = 1;
            while (!this.f53590g) {
                if (this.f53587d.get() != null) {
                    this.f53589f = null;
                    this.f53588e = null;
                    observer.onError(this.f53587d.m58960a());
                    return;
                }
                int i2 = this.f53592i;
                if (i2 == 1) {
                    Object obj = this.f53589f;
                    this.f53589f = null;
                    this.f53592i = 2;
                    observer.onNext(obj);
                    i2 = 2;
                }
                boolean z = this.f53591h;
                SimplePlainQueue simplePlainQueue = this.f53588e;
                Object poll = simplePlainQueue != null ? simplePlainQueue.poll() : null;
                Object obj2 = poll == null ? 1 : null;
                if (z && obj2 != null && r3 == 2) {
                    this.f53588e = null;
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
            this.f53589f = null;
            this.f53588e = null;
        }
    }

    public ObservableMergeWithSingle(C3959e<T> c3959e, SingleSource<? extends T> singleSource) {
        super(c3959e);
        this.f58948b = singleSource;
    }

    protected void subscribeActual(Observer<? super T> observer) {
        MergeWithObserver mergeWithObserver = new MergeWithObserver(observer);
        observer.onSubscribe(mergeWithObserver);
        this.a.subscribe(mergeWithObserver);
        this.f58948b.subscribe(mergeWithObserver.f53586c);
    }
}
