package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.C19571c;
import rx.Emitter;
import rx.Emitter.BackpressureMode;
import rx.Observable.OnSubscribe;
import rx.Producer;
import rx.Subscription;
import rx.exceptions.MissingBackpressureException;
import rx.functions.Action1;
import rx.functions.Cancellable;
import rx.internal.subscriptions.CancellableSubscription;
import rx.internal.util.C19613g;
import rx.internal.util.atomic.C19442g;
import rx.internal.util.unsafe.C19916z;
import rx.internal.util.unsafe.af;
import rx.p498c.C19401c;
import rx.p500e.C19575d;

public final class OnSubscribeCreate<T> implements OnSubscribe<T> {
    /* renamed from: a */
    final Action1<Emitter<T>> f62205a;
    /* renamed from: b */
    final BackpressureMode f62206b;

    static abstract class BaseEmitter<T> extends AtomicLong implements Emitter<T>, Producer, Subscription {
        private static final long serialVersionUID = 7326289992464377023L;
        /* renamed from: a */
        final C19571c<? super T> f61462a;
        /* renamed from: b */
        final C19575d f61463b = new C19575d();

        /* renamed from: a */
        void mo14815a() {
        }

        /* renamed from: b */
        void mo14816b() {
        }

        public BaseEmitter(C19571c<? super T> c19571c) {
            this.f61462a = c19571c;
        }

        public void onCompleted() {
            if (!this.f61462a.isUnsubscribed()) {
                try {
                    this.f61462a.onCompleted();
                } finally {
                    this.f61463b.unsubscribe();
                }
            }
        }

        public void onError(Throwable th) {
            if (!this.f61462a.isUnsubscribed()) {
                try {
                    this.f61462a.onError(th);
                } finally {
                    this.f61463b.unsubscribe();
                }
            }
        }

        public final void unsubscribe() {
            this.f61463b.unsubscribe();
            mo14815a();
        }

        public final boolean isUnsubscribed() {
            return this.f61463b.isUnsubscribed();
        }

        public final void request(long j) {
            if (C19419a.m69901a(j)) {
                C19419a.m69900a((AtomicLong) this, j);
                mo14816b();
            }
        }

        public final void setSubscription(Subscription subscription) {
            this.f61463b.m70554a(subscription);
        }

        public final void setCancellation(Cancellable cancellable) {
            setSubscription(new CancellableSubscription(cancellable));
        }

        public final long requested() {
            return get();
        }
    }

    static final class BufferEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 2427151001689639875L;
        /* renamed from: c */
        final Queue<Object> f61967c;
        /* renamed from: d */
        Throwable f61968d;
        /* renamed from: e */
        volatile boolean f61969e;
        /* renamed from: f */
        final AtomicInteger f61970f;

        public BufferEmitter(C19571c<? super T> c19571c, int i) {
            super(c19571c);
            this.f61967c = af.m69984a() != null ? new C19916z(i) : new C19442g(i);
            this.f61970f = new AtomicInteger();
        }

        public void onNext(T t) {
            this.f61967c.offer(NotificationLite.m69885a((Object) t));
            m71418c();
        }

        public void onError(Throwable th) {
            this.f61968d = th;
            this.f61969e = true;
            m71418c();
        }

        public void onCompleted() {
            this.f61969e = true;
            m71418c();
        }

        /* renamed from: b */
        void mo14816b() {
            m71418c();
        }

        /* renamed from: a */
        void mo14815a() {
            if (this.f61970f.getAndIncrement() == 0) {
                this.f61967c.clear();
            }
        }

        /* renamed from: c */
        void m71418c() {
            if (this.f61970f.getAndIncrement() == 0) {
                C19571c c19571c = this.a;
                Queue queue = this.f61967c;
                int i = 1;
                do {
                    Throwable th;
                    long j = get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (c19571c.isUnsubscribed()) {
                            queue.clear();
                            return;
                        }
                        boolean z = this.f61969e;
                        Object poll = queue.poll();
                        Object obj = poll == null ? 1 : null;
                        if (z && obj != null) {
                            th = this.f61968d;
                            if (th != null) {
                                super.onError(th);
                            } else {
                                super.onCompleted();
                            }
                            return;
                        } else if (obj != null) {
                            break;
                        } else {
                            c19571c.onNext(NotificationLite.m69891e(poll));
                            j2++;
                        }
                    }
                    if (j2 == j) {
                        if (c19571c.isUnsubscribed()) {
                            queue.clear();
                            return;
                        }
                        boolean z2 = this.f61969e;
                        boolean isEmpty = queue.isEmpty();
                        if (z2 && isEmpty) {
                            th = this.f61968d;
                            if (th != null) {
                                super.onError(th);
                            } else {
                                super.onCompleted();
                            }
                            return;
                        }
                    }
                    if (j2 != 0) {
                        C19419a.m69902b(this, j2);
                    }
                    i = this.f61970f.addAndGet(-i);
                } while (i != 0);
            }
        }
    }

    static final class LatestEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 4023437720691792495L;
        /* renamed from: c */
        final AtomicReference<Object> f61971c = new AtomicReference();
        /* renamed from: d */
        Throwable f61972d;
        /* renamed from: e */
        volatile boolean f61973e;
        /* renamed from: f */
        final AtomicInteger f61974f = new AtomicInteger();

        public LatestEmitter(C19571c<? super T> c19571c) {
            super(c19571c);
        }

        public void onNext(T t) {
            this.f61971c.set(NotificationLite.m69885a((Object) t));
            m71421c();
        }

        public void onError(Throwable th) {
            this.f61972d = th;
            this.f61973e = true;
            m71421c();
        }

        public void onCompleted() {
            this.f61973e = true;
            m71421c();
        }

        /* renamed from: b */
        void mo14816b() {
            m71421c();
        }

        /* renamed from: a */
        void mo14815a() {
            if (this.f61974f.getAndIncrement() == 0) {
                this.f61971c.lazySet(null);
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: c */
        void m71421c() {
            /*
            r15 = this;
            r0 = r15.f61974f;
            r0 = r0.getAndIncrement();
            if (r0 == 0) goto L_0x0009;
        L_0x0008:
            return;
        L_0x0009:
            r0 = r15.a;
            r1 = r15.f61971c;
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
            if (r10 == 0) goto L_0x0051;
        L_0x001c:
            r10 = r0.isUnsubscribed();
            if (r10 == 0) goto L_0x0026;
        L_0x0022:
            r1.lazySet(r12);
            return;
        L_0x0026:
            r10 = r15.f61973e;
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
            r0 = r15.f61972d;
            if (r0 == 0) goto L_0x003d;
        L_0x0039:
            super.onError(r0);
            goto L_0x0040;
        L_0x003d:
            super.onCompleted();
        L_0x0040:
            return;
        L_0x0041:
            if (r14 == 0) goto L_0x0044;
        L_0x0043:
            goto L_0x0051;
        L_0x0044:
            r10 = rx.internal.operators.NotificationLite.m69891e(r13);
            r0.onNext(r10);
            r10 = 1;
            r12 = r8 + r10;
            r8 = r12;
            goto L_0x0016;
        L_0x0051:
            r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
            if (r10 != 0) goto L_0x0078;
        L_0x0055:
            r4 = r0.isUnsubscribed();
            if (r4 == 0) goto L_0x005f;
        L_0x005b:
            r1.lazySet(r12);
            return;
        L_0x005f:
            r4 = r15.f61973e;
            r5 = r1.get();
            if (r5 != 0) goto L_0x0068;
        L_0x0067:
            r11 = 1;
        L_0x0068:
            if (r4 == 0) goto L_0x0078;
        L_0x006a:
            if (r11 == 0) goto L_0x0078;
        L_0x006c:
            r0 = r15.f61972d;
            if (r0 == 0) goto L_0x0074;
        L_0x0070:
            super.onError(r0);
            goto L_0x0077;
        L_0x0074:
            super.onCompleted();
        L_0x0077:
            return;
        L_0x0078:
            r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
            if (r4 == 0) goto L_0x007f;
        L_0x007c:
            rx.internal.operators.C19419a.m69902b(r15, r8);
        L_0x007f:
            r4 = r15.f61974f;
            r3 = -r3;
            r3 = r4.addAndGet(r3);
            if (r3 != 0) goto L_0x000f;
        L_0x0088:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.OnSubscribeCreate.LatestEmitter.c():void");
        }
    }

    static abstract class NoOverflowBaseEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        /* renamed from: c */
        abstract void mo14880c();

        public NoOverflowBaseEmitter(C19571c<? super T> c19571c) {
            super(c19571c);
        }

        public void onNext(T t) {
            if (!this.a.isUnsubscribed()) {
                if (get() != 0) {
                    this.a.onNext(t);
                    C19419a.m69902b(this, 1);
                } else {
                    mo14880c();
                }
            }
        }
    }

    static final class NoneEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        public NoneEmitter(C19571c<? super T> c19571c) {
            super(c19571c);
        }

        public void onNext(T t) {
            if (!this.a.isUnsubscribed()) {
                this.a.onNext(t);
                long j;
                do {
                    j = get();
                    if (j == 0) {
                        break;
                    }
                } while (compareAndSet(j, j - 1) == null);
            }
        }
    }

    static final class DropEmitter<T> extends NoOverflowBaseEmitter<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        /* renamed from: c */
        void mo14880c() {
        }

        public DropEmitter(C19571c<? super T> c19571c) {
            super(c19571c);
        }
    }

    static final class ErrorEmitter<T> extends NoOverflowBaseEmitter<T> {
        private static final long serialVersionUID = 338953216916120960L;
        /* renamed from: c */
        private boolean f62204c;

        public ErrorEmitter(C19571c<? super T> c19571c) {
            super(c19571c);
        }

        public void onNext(T t) {
            if (!this.f62204c) {
                super.onNext(t);
            }
        }

        public void onCompleted() {
            if (!this.f62204c) {
                this.f62204c = true;
                super.onCompleted();
            }
        }

        public void onError(Throwable th) {
            if (this.f62204c) {
                C19401c.m69811a(th);
                return;
            }
            this.f62204c = true;
            super.onError(th);
        }

        /* renamed from: c */
        void mo14880c() {
            onError(new MissingBackpressureException("create: could not emit value due to lack of requests"));
        }
    }

    public /* synthetic */ void call(Object obj) {
        m71571a((C19571c) obj);
    }

    public OnSubscribeCreate(Action1<Emitter<T>> action1, BackpressureMode backpressureMode) {
        this.f62205a = action1;
        this.f62206b = backpressureMode;
    }

    /* renamed from: a */
    public void m71571a(C19571c<? super T> c19571c) {
        Object noneEmitter;
        switch (this.f62206b) {
            case NONE:
                noneEmitter = new NoneEmitter(c19571c);
                break;
            case ERROR:
                noneEmitter = new ErrorEmitter(c19571c);
                break;
            case DROP:
                noneEmitter = new DropEmitter(c19571c);
                break;
            case LATEST:
                noneEmitter = new LatestEmitter(c19571c);
                break;
            default:
                noneEmitter = new BufferEmitter(c19571c, C19613g.f61292b);
                break;
        }
        c19571c.add(noneEmitter);
        c19571c.setProducer(noneEmitter);
        this.f62205a.call(noneEmitter);
    }
}
