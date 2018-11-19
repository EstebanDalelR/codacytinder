package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.queue.C18423a;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class UnicastSubject<T> extends C18432c<T> {
    /* renamed from: a */
    final C18423a<T> f59140a;
    /* renamed from: b */
    final AtomicReference<Observer<? super T>> f59141b;
    /* renamed from: c */
    final AtomicReference<Runnable> f59142c;
    /* renamed from: d */
    final boolean f59143d;
    /* renamed from: e */
    volatile boolean f59144e;
    /* renamed from: f */
    volatile boolean f59145f;
    /* renamed from: g */
    Throwable f59146g;
    /* renamed from: h */
    final AtomicBoolean f59147h;
    /* renamed from: i */
    final BasicIntQueueDisposable<T> f59148i;
    /* renamed from: j */
    boolean f59149j;

    final class UnicastQueueDisposable extends BasicIntQueueDisposable<T> {
        private static final long serialVersionUID = 7926949470189395511L;
        /* renamed from: a */
        final /* synthetic */ UnicastSubject f59655a;

        UnicastQueueDisposable(UnicastSubject unicastSubject) {
            this.f59655a = unicastSubject;
        }

        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f59655a.f59149j = true;
            return 2;
        }

        @Nullable
        public T poll() throws Exception {
            return this.f59655a.f59140a.poll();
        }

        public boolean isEmpty() {
            return this.f59655a.f59140a.isEmpty();
        }

        public void clear() {
            this.f59655a.f59140a.clear();
        }

        public void dispose() {
            if (!this.f59655a.f59144e) {
                this.f59655a.f59144e = true;
                this.f59655a.m67690b();
                this.f59655a.f59141b.lazySet(null);
                if (this.f59655a.f59148i.getAndIncrement() == 0) {
                    this.f59655a.f59141b.lazySet(null);
                    this.f59655a.f59140a.clear();
                }
            }
        }

        public boolean isDisposed() {
            return this.f59655a.f59144e;
        }
    }

    @CheckReturnValue
    /* renamed from: a */
    public static <T> UnicastSubject<T> m67685a() {
        return new UnicastSubject(bufferSize(), true);
    }

    @CheckReturnValue
    /* renamed from: a */
    public static <T> UnicastSubject<T> m67686a(int i) {
        return new UnicastSubject(i, true);
    }

    @CheckReturnValue
    /* renamed from: a */
    public static <T> UnicastSubject<T> m67687a(int i, Runnable runnable) {
        return new UnicastSubject(i, runnable, true);
    }

    UnicastSubject(int i, boolean z) {
        this.f59140a = new C18423a(C15684a.m58891a(i, "capacityHint"));
        this.f59142c = new AtomicReference();
        this.f59143d = z;
        this.f59141b = new AtomicReference();
        this.f59147h = new AtomicBoolean();
        this.f59148i = new UnicastQueueDisposable(this);
    }

    UnicastSubject(int i, Runnable runnable, boolean z) {
        this.f59140a = new C18423a(C15684a.m58891a(i, "capacityHint"));
        this.f59142c = new AtomicReference(C15684a.m58895a((Object) runnable, "onTerminate"));
        this.f59143d = z;
        this.f59141b = new AtomicReference();
        this.f59147h = new AtomicBoolean();
        this.f59148i = new UnicastQueueDisposable(this);
    }

    protected void subscribeActual(Observer<? super T> observer) {
        if (this.f59147h.get() || !this.f59147h.compareAndSet(false, true)) {
            EmptyDisposable.error(new IllegalStateException("Only a single observer allowed."), (Observer) observer);
        } else {
            observer.onSubscribe(this.f59148i);
            this.f59141b.lazySet(observer);
            if (this.f59144e != null) {
                this.f59141b.lazySet(null);
                return;
            }
            m67692c();
        }
    }

    /* renamed from: b */
    void m67690b() {
        Runnable runnable = (Runnable) this.f59142c.get();
        if (runnable != null && this.f59142c.compareAndSet(runnable, null)) {
            runnable.run();
        }
    }

    public void onSubscribe(Disposable disposable) {
        if (this.f59145f || this.f59144e) {
            disposable.dispose();
        }
    }

    public void onNext(T t) {
        C15684a.m58895a((Object) t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f59145f) {
            if (!this.f59144e) {
                this.f59140a.offer(t);
                m67692c();
            }
        }
    }

    public void onError(Throwable th) {
        C15684a.m58895a((Object) th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f59145f) {
            if (!this.f59144e) {
                this.f59146g = th;
                this.f59145f = true;
                m67690b();
                m67692c();
                return;
            }
        }
        C2667a.a(th);
    }

    public void onComplete() {
        if (!this.f59145f) {
            if (!this.f59144e) {
                this.f59145f = true;
                m67690b();
                m67692c();
            }
        }
    }

    /* renamed from: a */
    void m67688a(Observer<? super T> observer) {
        SimpleQueue simpleQueue = this.f59140a;
        int i = this.f59143d ^ 1;
        Object obj = 1;
        int i2 = 1;
        while (!this.f59144e) {
            boolean z = this.f59145f;
            Object poll = this.f59140a.poll();
            Object obj2 = poll == null ? 1 : null;
            if (z) {
                if (!(i == 0 || r3 == null)) {
                    if (!m67689a(simpleQueue, (Observer) observer)) {
                        obj = null;
                    } else {
                        return;
                    }
                }
                if (obj2 != null) {
                    m67693c(observer);
                    return;
                }
            }
            if (obj2 != null) {
                i2 = this.f59148i.addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
            } else {
                observer.onNext(poll);
            }
        }
        this.f59141b.lazySet(null);
        simpleQueue.clear();
    }

    /* renamed from: b */
    void m67691b(Observer<? super T> observer) {
        SimpleQueue simpleQueue = this.f59140a;
        int i = 1;
        int i2 = this.f59143d ^ 1;
        while (!this.f59144e) {
            boolean z = this.f59145f;
            if (i2 == 0 || !z || !m67689a(simpleQueue, (Observer) observer)) {
                observer.onNext(null);
                if (z) {
                    m67693c(observer);
                    return;
                }
                i = this.f59148i.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
            return;
        }
        this.f59141b.lazySet(null);
        simpleQueue.clear();
    }

    /* renamed from: c */
    void m67693c(Observer<? super T> observer) {
        this.f59141b.lazySet(null);
        Throwable th = this.f59146g;
        if (th != null) {
            observer.onError(th);
        } else {
            observer.onComplete();
        }
    }

    /* renamed from: a */
    boolean m67689a(SimpleQueue<T> simpleQueue, Observer<? super T> observer) {
        Throwable th = this.f59146g;
        if (th == null) {
            return null;
        }
        this.f59141b.lazySet(null);
        simpleQueue.clear();
        observer.onError(th);
        return true;
    }

    /* renamed from: c */
    void m67692c() {
        if (this.f59148i.getAndIncrement() == 0) {
            Observer observer = (Observer) this.f59141b.get();
            int i = 1;
            while (observer == null) {
                i = this.f59148i.addAndGet(-i);
                if (i != 0) {
                    observer = (Observer) this.f59141b.get();
                } else {
                    return;
                }
            }
            if (this.f59149j) {
                m67691b(observer);
            } else {
                m67688a(observer);
            }
        }
    }
}
