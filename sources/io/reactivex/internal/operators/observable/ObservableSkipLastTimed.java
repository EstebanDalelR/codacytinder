package io.reactivex.internal.operators.observable;

import io.reactivex.C15679f;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.C18423a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class ObservableSkipLastTimed<T> extends C18394a<T, T> {
    /* renamed from: b */
    final long f58983b;
    /* renamed from: c */
    final TimeUnit f58984c;
    /* renamed from: d */
    final C15679f f58985d;
    /* renamed from: e */
    final int f58986e;
    /* renamed from: f */
    final boolean f58987f;

    static final class SkipLastTimedObserver<T> extends AtomicInteger implements Observer<T>, Disposable {
        private static final long serialVersionUID = -5677354903406201275L;
        /* renamed from: a */
        final Observer<? super T> f53711a;
        /* renamed from: b */
        final long f53712b;
        /* renamed from: c */
        final TimeUnit f53713c;
        /* renamed from: d */
        final C15679f f53714d;
        /* renamed from: e */
        final C18423a<Object> f53715e;
        /* renamed from: f */
        final boolean f53716f;
        /* renamed from: g */
        Disposable f53717g;
        /* renamed from: h */
        volatile boolean f53718h;
        /* renamed from: i */
        volatile boolean f53719i;
        /* renamed from: j */
        Throwable f53720j;

        SkipLastTimedObserver(Observer<? super T> observer, long j, TimeUnit timeUnit, C15679f c15679f, int i, boolean z) {
            this.f53711a = observer;
            this.f53712b = j;
            this.f53713c = timeUnit;
            this.f53714d = c15679f;
            this.f53715e = new C18423a(i);
            this.f53716f = z;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53717g, disposable)) {
                this.f53717g = disposable;
                this.f53711a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            this.f53715e.offer(Long.valueOf(this.f53714d.m58851a(this.f53713c)), t);
            m63674a();
        }

        public void onError(Throwable th) {
            this.f53720j = th;
            this.f53719i = true;
            m63674a();
        }

        public void onComplete() {
            this.f53719i = true;
            m63674a();
        }

        public void dispose() {
            if (!this.f53718h) {
                this.f53718h = true;
                this.f53717g.dispose();
                if (getAndIncrement() == 0) {
                    this.f53715e.clear();
                }
            }
        }

        public boolean isDisposed() {
            return this.f53718h;
        }

        /* renamed from: a */
        void m63674a() {
            SkipLastTimedObserver skipLastTimedObserver = this;
            if (getAndIncrement() == 0) {
                Observer observer = skipLastTimedObserver.f53711a;
                C18423a c18423a = skipLastTimedObserver.f53715e;
                boolean z = skipLastTimedObserver.f53716f;
                TimeUnit timeUnit = skipLastTimedObserver.f53713c;
                C15679f c15679f = skipLastTimedObserver.f53714d;
                long j = skipLastTimedObserver.f53712b;
                int i = 1;
                while (!skipLastTimedObserver.f53718h) {
                    boolean z2 = skipLastTimedObserver.f53719i;
                    Long l = (Long) c18423a.m66578a();
                    Object obj = l == null ? 1 : null;
                    long a = c15679f.m58851a(timeUnit);
                    if (obj == null && l.longValue() > a - j) {
                        obj = 1;
                    }
                    if (z2) {
                        if (!z) {
                            Throwable th = skipLastTimedObserver.f53720j;
                            if (th != null) {
                                skipLastTimedObserver.f53715e.clear();
                                observer.onError(th);
                                return;
                            } else if (obj != null) {
                                observer.onComplete();
                                return;
                            }
                        } else if (obj != null) {
                            Throwable th2 = skipLastTimedObserver.f53720j;
                            if (th2 != null) {
                                observer.onError(th2);
                            } else {
                                observer.onComplete();
                            }
                            return;
                        }
                    }
                    if (obj != null) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        c18423a.poll();
                        observer.onNext(c18423a.poll());
                    }
                }
                skipLastTimedObserver.f53715e.clear();
            }
        }
    }

    public ObservableSkipLastTimed(ObservableSource<T> observableSource, long j, TimeUnit timeUnit, C15679f c15679f, int i, boolean z) {
        super(observableSource);
        this.f58983b = j;
        this.f58984c = timeUnit;
        this.f58985d = c15679f;
        this.f58986e = i;
        this.f58987f = z;
    }

    public void subscribeActual(Observer<? super T> observer) {
        this.a.subscribe(new SkipLastTimedObserver(observer, this.f58983b, this.f58984c, this.f58985d, this.f58986e, this.f58987f));
    }
}
