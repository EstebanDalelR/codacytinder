package io.reactivex.internal.operators.flowable;

import com.google.android.exoplayer2.Format;
import io.reactivex.C15679f;
import io.reactivex.C15679f.C17362c;
import io.reactivex.C3957b;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.C15735a;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class FlowableObserveOn<T> extends C18364a<T, T> {
    /* renamed from: c */
    final C15679f f58830c;
    /* renamed from: d */
    final boolean f58831d;
    /* renamed from: e */
    final int f58832e;

    static abstract class BaseObserveOnSubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T>, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;
        /* renamed from: a */
        final C17362c f59467a;
        /* renamed from: b */
        final boolean f59468b;
        /* renamed from: c */
        final int f59469c;
        /* renamed from: d */
        final int f59470d;
        /* renamed from: e */
        final AtomicLong f59471e = new AtomicLong();
        /* renamed from: f */
        Subscription f59472f;
        /* renamed from: g */
        SimpleQueue<T> f59473g;
        /* renamed from: h */
        volatile boolean f59474h;
        /* renamed from: i */
        volatile boolean f59475i;
        /* renamed from: j */
        Throwable f59476j;
        /* renamed from: k */
        int f59477k;
        /* renamed from: l */
        long f59478l;
        /* renamed from: m */
        boolean f59479m;

        /* renamed from: b */
        abstract void mo14277b();

        /* renamed from: c */
        abstract void mo14278c();

        /* renamed from: d */
        abstract void mo14279d();

        BaseObserveOnSubscriber(C17362c c17362c, boolean z, int i) {
            this.f59467a = c17362c;
            this.f59468b = z;
            this.f59469c = i;
            this.f59470d = i - (i >> 2);
        }

        public final void onNext(T t) {
            if (!this.f59475i) {
                if (this.f59477k == 2) {
                    m68197a();
                    return;
                }
                if (this.f59473g.offer(t) == null) {
                    this.f59472f.cancel();
                    this.f59476j = new MissingBackpressureException("Queue is full?!");
                    this.f59475i = true;
                }
                m68197a();
            }
        }

        public final void onError(Throwable th) {
            if (this.f59475i) {
                C2667a.a(th);
                return;
            }
            this.f59476j = th;
            this.f59475i = true;
            m68197a();
        }

        public final void onComplete() {
            if (!this.f59475i) {
                this.f59475i = true;
                m68197a();
            }
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C15735a.m58967a(this.f59471e, j);
                m68197a();
            }
        }

        public final void cancel() {
            if (!this.f59474h) {
                this.f59474h = true;
                this.f59472f.cancel();
                this.f59467a.dispose();
                if (getAndIncrement() == 0) {
                    this.f59473g.clear();
                }
            }
        }

        /* renamed from: a */
        final void m68197a() {
            if (getAndIncrement() == 0) {
                this.f59467a.mo13593a((Runnable) this);
            }
        }

        public final void run() {
            if (this.f59479m) {
                mo14277b();
            } else if (this.f59477k == 1) {
                mo14278c();
            } else {
                mo14279d();
            }
        }

        /* renamed from: a */
        final boolean m68198a(boolean z, boolean z2, Subscriber<?> subscriber) {
            if (this.f59474h) {
                clear();
                return true;
            }
            if (z) {
                if (!this.f59468b) {
                    z = this.f59476j;
                    if (z) {
                        clear();
                        subscriber.onError(z);
                        this.f59467a.dispose();
                        return true;
                    } else if (z2) {
                        subscriber.onComplete();
                        this.f59467a.dispose();
                        return true;
                    }
                } else if (z2) {
                    z = this.f59476j;
                    if (z) {
                        subscriber.onError(z);
                    } else {
                        subscriber.onComplete();
                    }
                    this.f59467a.dispose();
                    return true;
                }
            }
            return false;
        }

        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f59479m = true;
            return 2;
        }

        public final void clear() {
            this.f59473g.clear();
        }

        public final boolean isEmpty() {
            return this.f59473g.isEmpty();
        }
    }

    static final class ObserveOnConditionalSubscriber<T> extends BaseObserveOnSubscriber<T> {
        private static final long serialVersionUID = 644624475404284533L;
        /* renamed from: n */
        final ConditionalSubscriber<? super T> f59906n;
        /* renamed from: o */
        long f59907o;

        ObserveOnConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, C17362c c17362c, boolean z, int i) {
            super(c17362c, z, i);
            this.f59906n = conditionalSubscriber;
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f, subscription)) {
                this.f = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int requestFusion = queueSubscription.requestFusion(7);
                    if (requestFusion == 1) {
                        this.k = 1;
                        this.g = queueSubscription;
                        this.i = true;
                        this.f59906n.onSubscribe(this);
                        return;
                    } else if (requestFusion == 2) {
                        this.k = 2;
                        this.g = queueSubscription;
                        this.f59906n.onSubscribe(this);
                        subscription.request((long) this.c);
                        return;
                    }
                }
                this.g = new SpscArrayQueue(this.c);
                this.f59906n.onSubscribe(this);
                subscription.request((long) this.c);
            }
        }

        /* renamed from: c */
        void mo14278c() {
            ConditionalSubscriber conditionalSubscriber = this.f59906n;
            SimpleQueue simpleQueue = this.g;
            long j = this.l;
            int i = 1;
            while (true) {
                long j2 = this.e.get();
                while (j != j2) {
                    try {
                        Object poll = simpleQueue.poll();
                        if (!this.h) {
                            if (poll == null) {
                                conditionalSubscriber.onComplete();
                                this.a.dispose();
                                return;
                            } else if (conditionalSubscriber.tryOnNext(poll)) {
                                j++;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C15678a.m58850b(th);
                        this.f.cancel();
                        conditionalSubscriber.onError(th);
                        this.a.dispose();
                        return;
                    }
                }
                if (!this.h) {
                    if (simpleQueue.isEmpty()) {
                        conditionalSubscriber.onComplete();
                        this.a.dispose();
                        return;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.l = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: d */
        void mo14279d() {
            Subscriber subscriber = this.f59906n;
            SimpleQueue simpleQueue = this.g;
            long j = this.l;
            long j2 = this.f59907o;
            int i = 1;
            while (true) {
                long j3 = this.e.get();
                while (j != j3) {
                    boolean z = this.i;
                    try {
                        Object poll = simpleQueue.poll();
                        boolean z2 = poll == null;
                        if (!m68198a(z, z2, subscriber)) {
                            if (z2) {
                                break;
                            }
                            if (subscriber.tryOnNext(poll)) {
                                j++;
                            }
                            long j4 = j2 + 1;
                            if (j4 == ((long) this.d)) {
                                this.f.request(j4);
                                j2 = 0;
                            } else {
                                j2 = j4;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C15678a.m58850b(th);
                        this.f.cancel();
                        simpleQueue.clear();
                        subscriber.onError(th);
                        this.a.dispose();
                        return;
                    }
                }
                if (j != j3 || !m68198a(this.i, simpleQueue.isEmpty(), subscriber)) {
                    int i2 = get();
                    if (i == i2) {
                        this.l = j;
                        this.f59907o = j2;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: b */
        void mo14277b() {
            int i = 1;
            while (!this.h) {
                boolean z = this.i;
                this.f59906n.onNext(null);
                if (z) {
                    Throwable th = this.j;
                    if (th != null) {
                        this.f59906n.onError(th);
                    } else {
                        this.f59906n.onComplete();
                    }
                    this.a.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        @Nullable
        public T poll() throws Exception {
            T poll = this.g.poll();
            if (!(poll == null || this.k == 1)) {
                long j = this.f59907o + 1;
                if (j == ((long) this.d)) {
                    this.f59907o = 0;
                    this.f.request(j);
                } else {
                    this.f59907o = j;
                }
            }
            return poll;
        }
    }

    static final class ObserveOnSubscriber<T> extends BaseObserveOnSubscriber<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -4547113800637756442L;
        /* renamed from: n */
        final Subscriber<? super T> f59908n;

        ObserveOnSubscriber(Subscriber<? super T> subscriber, C17362c c17362c, boolean z, int i) {
            super(c17362c, z, i);
            this.f59908n = subscriber;
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f, subscription)) {
                this.f = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int requestFusion = queueSubscription.requestFusion(7);
                    if (requestFusion == 1) {
                        this.k = 1;
                        this.g = queueSubscription;
                        this.i = true;
                        this.f59908n.onSubscribe(this);
                        return;
                    } else if (requestFusion == 2) {
                        this.k = 2;
                        this.g = queueSubscription;
                        this.f59908n.onSubscribe(this);
                        subscription.request((long) this.c);
                        return;
                    }
                }
                this.g = new SpscArrayQueue(this.c);
                this.f59908n.onSubscribe(this);
                subscription.request((long) this.c);
            }
        }

        /* renamed from: c */
        void mo14278c() {
            Subscriber subscriber = this.f59908n;
            SimpleQueue simpleQueue = this.g;
            long j = this.l;
            int i = 1;
            while (true) {
                long j2 = this.e.get();
                while (j != j2) {
                    try {
                        Object poll = simpleQueue.poll();
                        if (!this.h) {
                            if (poll == null) {
                                subscriber.onComplete();
                                this.a.dispose();
                                return;
                            }
                            subscriber.onNext(poll);
                            j++;
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C15678a.m58850b(th);
                        this.f.cancel();
                        subscriber.onError(th);
                        this.a.dispose();
                        return;
                    }
                }
                if (!this.h) {
                    if (simpleQueue.isEmpty()) {
                        subscriber.onComplete();
                        this.a.dispose();
                        return;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.l = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: d */
        void mo14279d() {
            Subscriber subscriber = this.f59908n;
            SimpleQueue simpleQueue = this.g;
            long j = this.l;
            int i = 1;
            while (true) {
                long j2 = this.e.get();
                while (j != j2) {
                    boolean z = this.i;
                    try {
                        Object poll = simpleQueue.poll();
                        boolean z2 = poll == null;
                        if (!m68198a(z, z2, subscriber)) {
                            if (z2) {
                                break;
                            }
                            subscriber.onNext(poll);
                            long j3 = j + 1;
                            if (j3 == ((long) this.d)) {
                                if (j2 != Format.OFFSET_SAMPLE_RELATIVE) {
                                    j2 = this.e.addAndGet(-j3);
                                }
                                this.f.request(j3);
                                j = 0;
                            } else {
                                j = j3;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C15678a.m58850b(th);
                        this.f.cancel();
                        simpleQueue.clear();
                        subscriber.onError(th);
                        this.a.dispose();
                        return;
                    }
                }
                if (j != j2 || !m68198a(this.i, simpleQueue.isEmpty(), subscriber)) {
                    int i2 = get();
                    if (i == i2) {
                        this.l = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: b */
        void mo14277b() {
            int i = 1;
            while (!this.h) {
                boolean z = this.i;
                this.f59908n.onNext(null);
                if (z) {
                    Throwable th = this.j;
                    if (th != null) {
                        this.f59908n.onError(th);
                    } else {
                        this.f59908n.onComplete();
                    }
                    this.a.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        @Nullable
        public T poll() throws Exception {
            T poll = this.g.poll();
            if (!(poll == null || this.k == 1)) {
                long j = this.l + 1;
                if (j == ((long) this.d)) {
                    this.l = 0;
                    this.f.request(j);
                } else {
                    this.l = j;
                }
            }
            return poll;
        }
    }

    public FlowableObserveOn(C3957b<T> c3957b, C15679f c15679f, boolean z, int i) {
        super(c3957b);
        this.f58830c = c15679f;
        this.f58831d = z;
        this.f58832e = i;
    }

    /* renamed from: a */
    public void m67579a(Subscriber<? super T> subscriber) {
        C17362c a = this.f58830c.mo12872a();
        if (subscriber instanceof ConditionalSubscriber) {
            this.a.a(new ObserveOnConditionalSubscriber((ConditionalSubscriber) subscriber, a, this.f58831d, this.f58832e));
        } else {
            this.a.a(new ObserveOnSubscriber(subscriber, a, this.f58831d, this.f58832e));
        }
    }
}
