package io.reactivex.internal.operators.flowable;

import io.reactivex.BackpressureStrategy;
import io.reactivex.C3957b;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Cancellable;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.C18423a;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.C15735a;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class FlowableCreate<T> extends C3957b<T> {
    /* renamed from: a */
    final FlowableOnSubscribe<T> f56895a;
    /* renamed from: c */
    final BackpressureStrategy f56896c;

    static abstract class BaseEmitter<T> extends AtomicLong implements FlowableEmitter<T>, Subscription {
        private static final long serialVersionUID = 7326289992464377023L;
        /* renamed from: a */
        final Subscriber<? super T> f56889a;
        /* renamed from: b */
        final SequentialDisposable f56890b = new SequentialDisposable();

        /* renamed from: b */
        void mo13997b() {
        }

        /* renamed from: c */
        void mo13998c() {
        }

        BaseEmitter(Subscriber<? super T> subscriber) {
            this.f56889a = subscriber;
        }

        public void onComplete() {
            m66412a();
        }

        /* renamed from: a */
        protected void m66412a() {
            if (!isCancelled()) {
                try {
                    this.f56889a.onComplete();
                } finally {
                    this.f56890b.dispose();
                }
            }
        }

        public final void onError(Throwable th) {
            if (!tryOnError(th)) {
                C2667a.a(th);
            }
        }

        public boolean tryOnError(Throwable th) {
            return m66413a(th);
        }

        /* renamed from: a */
        protected boolean m66413a(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isCancelled()) {
                return null;
            }
            try {
                this.f56889a.onError(th);
                return true;
            } finally {
                this.f56890b.dispose();
            }
        }

        public final void cancel() {
            this.f56890b.dispose();
            mo13997b();
        }

        public final boolean isCancelled() {
            return this.f56890b.isDisposed();
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C15735a.m58967a((AtomicLong) this, j);
                mo13998c();
            }
        }

        public final void setDisposable(Disposable disposable) {
            this.f56890b.m63457a(disposable);
        }

        public final void setCancellable(Cancellable cancellable) {
            setDisposable(new CancellableDisposable(cancellable));
        }

        public final long requested() {
            return get();
        }

        public final FlowableEmitter<T> serialize() {
            return new SerializedEmitter(this);
        }
    }

    static final class SerializedEmitter<T> extends AtomicInteger implements FlowableEmitter<T> {
        private static final long serialVersionUID = 4883307006032401862L;
        /* renamed from: a */
        final BaseEmitter<T> f56891a;
        /* renamed from: b */
        final AtomicThrowable f56892b = new AtomicThrowable();
        /* renamed from: c */
        final SimplePlainQueue<T> f56893c = new C18423a(16);
        /* renamed from: d */
        volatile boolean f56894d;

        public FlowableEmitter<T> serialize() {
            return this;
        }

        SerializedEmitter(BaseEmitter<T> baseEmitter) {
            this.f56891a = baseEmitter;
        }

        public void onNext(T t) {
            if (!this.f56891a.isCancelled()) {
                if (!this.f56894d) {
                    if (t == null) {
                        onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                        return;
                    }
                    if (get() == 0 && compareAndSet(0, 1)) {
                        this.f56891a.onNext(t);
                        if (decrementAndGet() == null) {
                            return;
                        }
                    }
                    SimplePlainQueue simplePlainQueue = this.f56893c;
                    synchronized (simplePlainQueue) {
                        simplePlainQueue.offer(t);
                    }
                    if (getAndIncrement() != null) {
                        return;
                    }
                    m66417b();
                }
            }
        }

        public void onError(Throwable th) {
            if (!tryOnError(th)) {
                C2667a.a(th);
            }
        }

        public boolean tryOnError(Throwable th) {
            if (!this.f56891a.isCancelled()) {
                if (!this.f56894d) {
                    if (th == null) {
                        th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                    }
                    if (this.f56892b.m58961a(th) == null) {
                        return false;
                    }
                    this.f56894d = true;
                    m66416a();
                    return true;
                }
            }
            return false;
        }

        public void onComplete() {
            if (!this.f56891a.isCancelled()) {
                if (!this.f56894d) {
                    this.f56894d = true;
                    m66416a();
                }
            }
        }

        /* renamed from: a */
        void m66416a() {
            if (getAndIncrement() == 0) {
                m66417b();
            }
        }

        /* renamed from: b */
        void m66417b() {
            BaseEmitter baseEmitter = this.f56891a;
            SimplePlainQueue simplePlainQueue = this.f56893c;
            AtomicThrowable atomicThrowable = this.f56892b;
            int i = 1;
            while (!baseEmitter.isCancelled()) {
                if (atomicThrowable.get() != null) {
                    simplePlainQueue.clear();
                    baseEmitter.onError(atomicThrowable.m58960a());
                    return;
                }
                boolean z = this.f56894d;
                Object poll = simplePlainQueue.poll();
                Object obj = poll == null ? 1 : null;
                if (z && obj != null) {
                    baseEmitter.onComplete();
                    return;
                } else if (obj != null) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    baseEmitter.onNext(poll);
                }
            }
            simplePlainQueue.clear();
        }

        public void setDisposable(Disposable disposable) {
            this.f56891a.setDisposable(disposable);
        }

        public void setCancellable(Cancellable cancellable) {
            this.f56891a.setCancellable(cancellable);
        }

        public long requested() {
            return this.f56891a.requested();
        }

        public boolean isCancelled() {
            return this.f56891a.isCancelled();
        }
    }

    static final class BufferAsyncEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 2427151001689639875L;
        /* renamed from: c */
        final C18423a<T> f58802c;
        /* renamed from: d */
        Throwable f58803d;
        /* renamed from: e */
        volatile boolean f58804e;
        /* renamed from: f */
        final AtomicInteger f58805f = new AtomicInteger();

        BufferAsyncEmitter(Subscriber<? super T> subscriber, int i) {
            super(subscriber);
            this.f58802c = new C18423a(i);
        }

        public void onNext(T t) {
            if (!this.f58804e) {
                if (!isCancelled()) {
                    if (t == null) {
                        onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                        return;
                    }
                    this.f58802c.offer(t);
                    m67566d();
                }
            }
        }

        public boolean tryOnError(Throwable th) {
            if (!this.f58804e) {
                if (!isCancelled()) {
                    if (th == null) {
                        th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                    }
                    this.f58803d = th;
                    this.f58804e = true;
                    m67566d();
                    return true;
                }
            }
            return null;
        }

        public void onComplete() {
            this.f58804e = true;
            m67566d();
        }

        /* renamed from: c */
        void mo13998c() {
            m67566d();
        }

        /* renamed from: b */
        void mo13997b() {
            if (this.f58805f.getAndIncrement() == 0) {
                this.f58802c.clear();
            }
        }

        /* renamed from: d */
        void m67566d() {
            if (this.f58805f.getAndIncrement() == 0) {
                Subscriber subscriber = this.a;
                C18423a c18423a = this.f58802c;
                int i = 1;
                do {
                    Throwable th;
                    long j = get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (isCancelled()) {
                            c18423a.clear();
                            return;
                        }
                        boolean z = this.f58804e;
                        Object poll = c18423a.poll();
                        Object obj = poll == null ? 1 : null;
                        if (z && obj != null) {
                            th = this.f58803d;
                            if (th != null) {
                                m66413a(th);
                            } else {
                                m66412a();
                            }
                            return;
                        } else if (obj != null) {
                            break;
                        } else {
                            subscriber.onNext(poll);
                            j2++;
                        }
                    }
                    if (j2 == j) {
                        if (isCancelled()) {
                            c18423a.clear();
                            return;
                        }
                        boolean z2 = this.f58804e;
                        boolean isEmpty = c18423a.isEmpty();
                        if (z2 && isEmpty) {
                            th = this.f58803d;
                            if (th != null) {
                                m66413a(th);
                            } else {
                                m66412a();
                            }
                            return;
                        }
                    }
                    if (j2 != 0) {
                        C15735a.m58969c(this, j2);
                    }
                    i = this.f58805f.addAndGet(-i);
                } while (i != 0);
            }
        }
    }

    static final class LatestAsyncEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 4023437720691792495L;
        /* renamed from: c */
        final AtomicReference<T> f58806c = new AtomicReference();
        /* renamed from: d */
        Throwable f58807d;
        /* renamed from: e */
        volatile boolean f58808e;
        /* renamed from: f */
        final AtomicInteger f58809f = new AtomicInteger();

        LatestAsyncEmitter(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        public void onNext(T t) {
            if (!this.f58808e) {
                if (!isCancelled()) {
                    if (t == null) {
                        onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                        return;
                    }
                    this.f58806c.set(t);
                    m67569d();
                }
            }
        }

        public boolean tryOnError(Throwable th) {
            if (!this.f58808e) {
                if (!isCancelled()) {
                    if (th == null) {
                        onError(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
                    }
                    this.f58807d = th;
                    this.f58808e = true;
                    m67569d();
                    return true;
                }
            }
            return null;
        }

        public void onComplete() {
            this.f58808e = true;
            m67569d();
        }

        /* renamed from: c */
        void mo13998c() {
            m67569d();
        }

        /* renamed from: b */
        void mo13997b() {
            if (this.f58809f.getAndIncrement() == 0) {
                this.f58806c.lazySet(null);
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: d */
        void m67569d() {
            /*
            r15 = this;
            r0 = r15.f58809f;
            r0 = r0.getAndIncrement();
            if (r0 == 0) goto L_0x0009;
        L_0x0008:
            return;
        L_0x0009:
            r0 = r15.a;
            r1 = r15.f58806c;
            r2 = 1;
            r3 = 1;
        L_0x000f:
            r4 = r15.get();
            r6 = 0;
            r8 = r6;
        L_0x0016:
            r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
            r11 = 0;
            r12 = 0;
            if (r10 == 0) goto L_0x004d;
        L_0x001c:
            r10 = r15.isCancelled();
            if (r10 == 0) goto L_0x0026;
        L_0x0022:
            r1.lazySet(r12);
            return;
        L_0x0026:
            r10 = r15.f58808e;
            r13 = r1.getAndSet(r12);
            if (r13 != 0) goto L_0x0030;
        L_0x002e:
            r14 = 1;
            goto L_0x0031;
        L_0x0030:
            r14 = 0;
        L_0x0031:
            if (r10 == 0) goto L_0x0041;
        L_0x0033:
            if (r14 == 0) goto L_0x0041;
        L_0x0035:
            r0 = r15.f58807d;
            if (r0 == 0) goto L_0x003d;
        L_0x0039:
            r15.m66413a(r0);
            goto L_0x0040;
        L_0x003d:
            r15.m66412a();
        L_0x0040:
            return;
        L_0x0041:
            if (r14 == 0) goto L_0x0044;
        L_0x0043:
            goto L_0x004d;
        L_0x0044:
            r0.onNext(r13);
            r10 = 1;
            r12 = r8 + r10;
            r8 = r12;
            goto L_0x0016;
        L_0x004d:
            r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
            if (r10 != 0) goto L_0x0074;
        L_0x0051:
            r4 = r15.isCancelled();
            if (r4 == 0) goto L_0x005b;
        L_0x0057:
            r1.lazySet(r12);
            return;
        L_0x005b:
            r4 = r15.f58808e;
            r5 = r1.get();
            if (r5 != 0) goto L_0x0064;
        L_0x0063:
            r11 = 1;
        L_0x0064:
            if (r4 == 0) goto L_0x0074;
        L_0x0066:
            if (r11 == 0) goto L_0x0074;
        L_0x0068:
            r0 = r15.f58807d;
            if (r0 == 0) goto L_0x0070;
        L_0x006c:
            r15.m66413a(r0);
            goto L_0x0073;
        L_0x0070:
            r15.m66412a();
        L_0x0073:
            return;
        L_0x0074:
            r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
            if (r4 == 0) goto L_0x007b;
        L_0x0078:
            io.reactivex.internal.util.C15735a.m58969c(r15, r8);
        L_0x007b:
            r4 = r15.f58809f;
            r3 = -r3;
            r3 = r4.addAndGet(r3);
            if (r3 != 0) goto L_0x000f;
        L_0x0084:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableCreate.LatestAsyncEmitter.d():void");
        }
    }

    static final class MissingEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        MissingEmitter(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        public void onNext(T t) {
            if (!isCancelled()) {
                if (t != null) {
                    this.a.onNext(t);
                    long j;
                    do {
                        j = get();
                        if (j == 0) {
                            break;
                        }
                    } while (compareAndSet(j, j - 1) == null);
                    return;
                }
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
        }
    }

    static abstract class NoOverflowBaseAsyncEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        /* renamed from: d */
        abstract void mo14140d();

        NoOverflowBaseAsyncEmitter(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        public final void onNext(T t) {
            if (!isCancelled()) {
                if (t == null) {
                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                if (get() != 0) {
                    this.a.onNext(t);
                    C15735a.m58969c(this, 1);
                } else {
                    mo14140d();
                }
            }
        }
    }

    static final class DropAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        /* renamed from: d */
        void mo14140d() {
        }

        DropAsyncEmitter(Subscriber<? super T> subscriber) {
            super(subscriber);
        }
    }

    static final class ErrorAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        private static final long serialVersionUID = 338953216916120960L;

        ErrorAsyncEmitter(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        /* renamed from: d */
        void mo14140d() {
            onError(new MissingBackpressureException("create: could not emit value due to lack of requests"));
        }
    }

    public FlowableCreate(FlowableOnSubscribe<T> flowableOnSubscribe, BackpressureStrategy backpressureStrategy) {
        this.f56895a = flowableOnSubscribe;
        this.f56896c = backpressureStrategy;
    }

    /* renamed from: a */
    public void m66418a(Subscriber<? super T> subscriber) {
        BaseEmitter missingEmitter;
        switch (this.f56896c) {
            case MISSING:
                missingEmitter = new MissingEmitter(subscriber);
                break;
            case ERROR:
                missingEmitter = new ErrorAsyncEmitter(subscriber);
                break;
            case DROP:
                missingEmitter = new DropAsyncEmitter(subscriber);
                break;
            case LATEST:
                missingEmitter = new LatestAsyncEmitter(subscriber);
                break;
            default:
                missingEmitter = new BufferAsyncEmitter(subscriber, a());
                break;
        }
        subscriber.onSubscribe(missingEmitter);
        try {
            this.f56895a.subscribe(missingEmitter);
        } catch (Subscriber<? super T> subscriber2) {
            C15678a.m58850b(subscriber2);
            missingEmitter.onError(subscriber2);
        }
    }
}
