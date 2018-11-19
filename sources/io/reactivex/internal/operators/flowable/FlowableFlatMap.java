package io.reactivex.internal.operators.flowable;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.google.android.exoplayer2.Format;
import io.reactivex.C3957b;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.C18423a;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.C15735a;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class FlowableFlatMap<T, U> extends C18364a<T, U> {
    /* renamed from: c */
    final Function<? super T, ? extends Publisher<? extends U>> f58817c;
    /* renamed from: d */
    final boolean f58818d;
    /* renamed from: e */
    final int f58819e;
    /* renamed from: f */
    final int f58820f;

    static final class InnerSubscriber<T, U> extends AtomicReference<Subscription> implements FlowableSubscriber<U>, Disposable {
        private static final long serialVersionUID = -4606175640614850599L;
        /* renamed from: a */
        final long f56905a;
        /* renamed from: b */
        final MergeSubscriber<T, U> f56906b;
        /* renamed from: c */
        final int f56907c = (this.f56908d >> 2);
        /* renamed from: d */
        final int f56908d;
        /* renamed from: e */
        volatile boolean f56909e;
        /* renamed from: f */
        volatile SimpleQueue<U> f56910f;
        /* renamed from: g */
        long f56911g;
        /* renamed from: h */
        int f56912h;

        InnerSubscriber(MergeSubscriber<T, U> mergeSubscriber, long j) {
            this.f56905a = j;
            this.f56906b = mergeSubscriber;
            this.f56908d = mergeSubscriber.f56919e;
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int requestFusion = queueSubscription.requestFusion(7);
                    if (requestFusion == 1) {
                        this.f56912h = requestFusion;
                        this.f56910f = queueSubscription;
                        this.f56909e = true;
                        this.f56906b.m66426b();
                        return;
                    } else if (requestFusion == 2) {
                        this.f56912h = requestFusion;
                        this.f56910f = queueSubscription;
                    }
                }
                subscription.request((long) this.f56908d);
            }
        }

        public void onNext(U u) {
            if (this.f56912h != 2) {
                this.f56906b.m66424a((Object) u, this);
            } else {
                this.f56906b.m66426b();
            }
        }

        public void onError(Throwable th) {
            lazySet(SubscriptionHelper.CANCELLED);
            this.f56906b.m66422a(this, th);
        }

        public void onComplete() {
            this.f56909e = true;
            this.f56906b.m66426b();
        }

        /* renamed from: a */
        void m66420a(long j) {
            if (this.f56912h != 1) {
                long j2 = this.f56911g + j;
                if (j2 >= ((long) this.f56907c)) {
                    this.f56911g = 0;
                    ((Subscription) get()).request(j2);
                    return;
                }
                this.f56911g = j2;
            }
        }

        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        public boolean isDisposed() {
            return get() == SubscriptionHelper.CANCELLED;
        }
    }

    static final class MergeSubscriber<T, U> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        /* renamed from: k */
        static final InnerSubscriber<?, ?>[] f56913k = new InnerSubscriber[0];
        /* renamed from: l */
        static final InnerSubscriber<?, ?>[] f56914l = new InnerSubscriber[0];
        private static final long serialVersionUID = -2117620485640801370L;
        /* renamed from: a */
        final Subscriber<? super U> f56915a;
        /* renamed from: b */
        final Function<? super T, ? extends Publisher<? extends U>> f56916b;
        /* renamed from: c */
        final boolean f56917c;
        /* renamed from: d */
        final int f56918d;
        /* renamed from: e */
        final int f56919e;
        /* renamed from: f */
        volatile SimplePlainQueue<U> f56920f;
        /* renamed from: g */
        volatile boolean f56921g;
        /* renamed from: h */
        final AtomicThrowable f56922h = new AtomicThrowable();
        /* renamed from: i */
        volatile boolean f56923i;
        /* renamed from: j */
        final AtomicReference<InnerSubscriber<?, ?>[]> f56924j = new AtomicReference();
        /* renamed from: m */
        final AtomicLong f56925m = new AtomicLong();
        /* renamed from: n */
        Subscription f56926n;
        /* renamed from: o */
        long f56927o;
        /* renamed from: p */
        long f56928p;
        /* renamed from: q */
        int f56929q;
        /* renamed from: r */
        int f56930r;
        /* renamed from: s */
        final int f56931s;

        MergeSubscriber(Subscriber<? super U> subscriber, Function<? super T, ? extends Publisher<? extends U>> function, boolean z, int i, int i2) {
            this.f56915a = subscriber;
            this.f56916b = function;
            this.f56917c = z;
            this.f56918d = i;
            this.f56919e = i2;
            this.f56931s = Math.max(1, i >> 1);
            this.f56924j.lazySet(f56913k);
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f56926n, subscription)) {
                this.f56926n = subscription;
                this.f56915a.onSubscribe(this);
                if (!this.f56923i) {
                    if (this.f56918d == ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
                        subscription.request(Format.OFFSET_SAMPLE_RELATIVE);
                    } else {
                        subscription.request((long) this.f56918d);
                    }
                }
            }
        }

        public void onNext(T t) {
            if (!this.f56921g) {
                try {
                    Publisher publisher = (Publisher) C15684a.m58895a(this.f56916b.apply(t), "The mapper returned a null Publisher");
                    if (publisher instanceof Callable) {
                        try {
                            Object call = ((Callable) publisher).call();
                            if (call != null) {
                                m66423a(call);
                            } else if (this.f56918d != 2147483647 && this.f56923i == null) {
                                t = this.f56930r + 1;
                                this.f56930r = t;
                                if (t == this.f56931s) {
                                    this.f56930r = null;
                                    this.f56926n.request((long) this.f56931s);
                                }
                            }
                        } catch (T t2) {
                            C15678a.m58850b(t2);
                            this.f56922h.m58961a(t2);
                            m66426b();
                            return;
                        }
                    }
                    long j = this.f56927o;
                    this.f56927o = j + 1;
                    InnerSubscriber innerSubscriber = new InnerSubscriber(this, j);
                    if (m66425a(innerSubscriber)) {
                        publisher.subscribe(innerSubscriber);
                    }
                } catch (T t22) {
                    C15678a.m58850b(t22);
                    this.f56926n.cancel();
                    onError(t22);
                }
            }
        }

        /* renamed from: a */
        boolean m66425a(InnerSubscriber<T, U> innerSubscriber) {
            InnerSubscriber[] innerSubscriberArr;
            Object obj;
            do {
                innerSubscriberArr = (InnerSubscriber[]) this.f56924j.get();
                if (innerSubscriberArr == f56914l) {
                    innerSubscriber.dispose();
                    return false;
                }
                int length = innerSubscriberArr.length;
                obj = new InnerSubscriber[(length + 1)];
                System.arraycopy(innerSubscriberArr, 0, obj, 0, length);
                obj[length] = innerSubscriber;
            } while (!this.f56924j.compareAndSet(innerSubscriberArr, obj));
            return true;
        }

        /* renamed from: b */
        void m66427b(InnerSubscriber<T, U> innerSubscriber) {
            InnerSubscriber[] innerSubscriberArr;
            Object obj;
            do {
                innerSubscriberArr = (InnerSubscriber[]) this.f56924j.get();
                if (innerSubscriberArr != f56914l) {
                    if (innerSubscriberArr != f56913k) {
                        int length = innerSubscriberArr.length;
                        int i = -1;
                        for (int i2 = 0; i2 < length; i2++) {
                            if (innerSubscriberArr[i2] == innerSubscriber) {
                                i = i2;
                                break;
                            }
                        }
                        if (i >= 0) {
                            if (length == 1) {
                                obj = f56913k;
                            } else {
                                Object obj2 = new InnerSubscriber[(length - 1)];
                                System.arraycopy(innerSubscriberArr, 0, obj2, 0, i);
                                System.arraycopy(innerSubscriberArr, i + 1, obj2, i, (length - i) - 1);
                                obj = obj2;
                            }
                        } else {
                            return;
                        }
                    }
                }
                return;
            } while (!this.f56924j.compareAndSet(innerSubscriberArr, obj));
        }

        /* renamed from: a */
        SimpleQueue<U> m66421a() {
            SimpleQueue<U> simpleQueue = this.f56920f;
            if (simpleQueue == null) {
                if (this.f56918d == ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
                    simpleQueue = new C18423a(this.f56919e);
                } else {
                    simpleQueue = new SpscArrayQueue(this.f56918d);
                }
                this.f56920f = simpleQueue;
            }
            return simpleQueue;
        }

        /* renamed from: a */
        void m66423a(U u) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.f56925m.get();
                SimpleQueue simpleQueue = this.f56920f;
                if (j == 0 || !(simpleQueue == null || simpleQueue.isEmpty())) {
                    if (simpleQueue == null) {
                        simpleQueue = m66421a();
                    }
                    if (simpleQueue.offer(u) == null) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return;
                    }
                }
                this.f56915a.onNext(u);
                if (j != Format.OFFSET_SAMPLE_RELATIVE) {
                    this.f56925m.decrementAndGet();
                }
                if (this.f56918d != 2147483647 && this.f56923i == null) {
                    u = this.f56930r + 1;
                    this.f56930r = u;
                    if (u == this.f56931s) {
                        this.f56930r = 0;
                        this.f56926n.request((long) this.f56931s);
                    }
                }
                if (decrementAndGet() == null) {
                    return;
                }
            } else if (m66421a().offer(u) == null) {
                onError(new IllegalStateException("Scalar queue full?!"));
                return;
            } else if (getAndIncrement() != null) {
                return;
            }
            m66429c();
        }

        /* renamed from: c */
        SimpleQueue<U> m66428c(InnerSubscriber<T, U> innerSubscriber) {
            SimpleQueue<U> simpleQueue = innerSubscriber.f56910f;
            if (simpleQueue != null) {
                return simpleQueue;
            }
            simpleQueue = new SpscArrayQueue(this.f56919e);
            innerSubscriber.f56910f = simpleQueue;
            return simpleQueue;
        }

        /* renamed from: a */
        void m66424a(U u, InnerSubscriber<T, U> innerSubscriber) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.f56925m.get();
                SimpleQueue simpleQueue = innerSubscriber.f56910f;
                if (j == 0 || !(simpleQueue == null || simpleQueue.isEmpty())) {
                    if (simpleQueue == null) {
                        simpleQueue = m66428c(innerSubscriber);
                    }
                    if (simpleQueue.offer(u) == null) {
                        onError(new MissingBackpressureException("Inner queue full?!"));
                        return;
                    }
                }
                this.f56915a.onNext(u);
                if (j != Format.OFFSET_SAMPLE_RELATIVE) {
                    this.f56925m.decrementAndGet();
                }
                innerSubscriber.m66420a(1);
                if (decrementAndGet() == null) {
                    return;
                }
            }
            SimpleQueue simpleQueue2 = innerSubscriber.f56910f;
            if (simpleQueue2 == null) {
                simpleQueue2 = new SpscArrayQueue(this.f56919e);
                innerSubscriber.f56910f = simpleQueue2;
            }
            if (simpleQueue2.offer(u) == null) {
                onError(new MissingBackpressureException("Inner queue full?!"));
                return;
            } else if (getAndIncrement() != null) {
                return;
            }
            m66429c();
        }

        public void onError(Throwable th) {
            if (this.f56921g) {
                C2667a.a(th);
                return;
            }
            if (this.f56922h.m58961a(th)) {
                this.f56921g = true;
                m66426b();
            } else {
                C2667a.a(th);
            }
        }

        public void onComplete() {
            if (!this.f56921g) {
                this.f56921g = true;
                m66426b();
            }
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C15735a.m58967a(this.f56925m, j);
                m66426b();
            }
        }

        public void cancel() {
            if (!this.f56923i) {
                this.f56923i = true;
                this.f56926n.cancel();
                m66432f();
                if (getAndIncrement() == 0) {
                    SimpleQueue simpleQueue = this.f56920f;
                    if (simpleQueue != null) {
                        simpleQueue.clear();
                    }
                }
            }
        }

        /* renamed from: b */
        void m66426b() {
            if (getAndIncrement() == 0) {
                m66429c();
            }
        }

        /* renamed from: c */
        void m66429c() {
            int i;
            Subscriber subscriber = this.f56915a;
            int i2 = 1;
            while (!m66430d()) {
                long j;
                SimplePlainQueue simplePlainQueue = r1.f56920f;
                long j2 = r1.f56925m.get();
                Object obj = j2 == Format.OFFSET_SAMPLE_RELATIVE ? 1 : null;
                if (simplePlainQueue != null) {
                    j = 0;
                    while (true) {
                        long j3 = 0;
                        Object obj2 = null;
                        while (j2 != 0) {
                            Object poll = simplePlainQueue.poll();
                            if (!m66430d()) {
                                if (poll == null) {
                                    obj2 = poll;
                                    break;
                                }
                                subscriber.onNext(poll);
                                j2--;
                                j3++;
                                j++;
                                obj2 = poll;
                            } else {
                                return;
                            }
                        }
                        if (j3 != 0) {
                            if (obj != null) {
                                j2 = Format.OFFSET_SAMPLE_RELATIVE;
                            } else {
                                j2 = r1.f56925m.addAndGet(-j3);
                            }
                        }
                        if (j2 == 0) {
                            break;
                        } else if (obj2 == null) {
                            break;
                        }
                    }
                } else {
                    j = 0;
                }
                boolean z = r1.f56921g;
                SimplePlainQueue simplePlainQueue2 = r1.f56920f;
                InnerSubscriber[] innerSubscriberArr = (InnerSubscriber[]) r1.f56924j.get();
                int length = innerSubscriberArr.length;
                if (z && ((simplePlainQueue2 == null || simplePlainQueue2.isEmpty()) && length == 0)) {
                    Throwable a = r1.f56922h.m58960a();
                    if (a != ExceptionHelper.f48655a) {
                        if (a == null) {
                            subscriber.onComplete();
                        } else {
                            subscriber.onError(a);
                        }
                    }
                    return;
                }
                int i3;
                Object obj3;
                Subscriber subscriber2;
                long addAndGet;
                if (length != 0) {
                    int i4;
                    i3 = i2;
                    long j4 = r1.f56928p;
                    int i5 = r1.f56929q;
                    if (length <= i5 || innerSubscriberArr[i5].f56905a != j4) {
                        if (length <= i5) {
                            i5 = 0;
                        }
                        i4 = i5;
                        for (i5 = 0; i5 < length; i5++) {
                            if (innerSubscriberArr[i4].f56905a == j4) {
                                break;
                            }
                            i4++;
                            if (i4 == length) {
                                i4 = 0;
                            }
                        }
                        r1.f56929q = i4;
                        r1.f56928p = innerSubscriberArr[i4].f56905a;
                        i5 = i4;
                    }
                    int i6 = 0;
                    obj3 = null;
                    while (i6 < length) {
                        if (!m66430d()) {
                            InnerSubscriber innerSubscriber = innerSubscriberArr[i5];
                            Object obj4 = null;
                            while (!m66430d()) {
                                int i7;
                                SimpleQueue simpleQueue = innerSubscriber.f56910f;
                                if (simpleQueue == null) {
                                    subscriber2 = subscriber;
                                    i7 = i6;
                                    i = length;
                                } else {
                                    i = length;
                                    Object obj5 = obj4;
                                    long j5 = 0;
                                    while (j2 != 0) {
                                        try {
                                            obj5 = simpleQueue.poll();
                                            if (obj5 == null) {
                                                break;
                                            }
                                            subscriber.onNext(obj5);
                                            if (!m66430d()) {
                                                j5++;
                                                j2--;
                                            } else {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            C15678a.m58850b(th);
                                            innerSubscriber.dispose();
                                            r1.f56922h.m58961a(th);
                                            if (!r1.f56917c) {
                                                r1.f56926n.cancel();
                                            }
                                            if (!m66430d()) {
                                                m66427b(innerSubscriber);
                                                subscriber2 = subscriber;
                                                i7 = i6 + 1;
                                                i4 = i;
                                                obj3 = 1;
                                            } else {
                                                return;
                                            }
                                        }
                                    }
                                    if (j5 != 0) {
                                        if (obj == null) {
                                            subscriber2 = subscriber;
                                            i7 = i6;
                                            addAndGet = r1.f56925m.addAndGet(-j5);
                                        } else {
                                            subscriber2 = subscriber;
                                            i7 = i6;
                                            addAndGet = Format.OFFSET_SAMPLE_RELATIVE;
                                        }
                                        innerSubscriber.m66420a(j5);
                                        j2 = addAndGet;
                                    } else {
                                        subscriber2 = subscriber;
                                        i7 = i6;
                                    }
                                    if (j2 != 0) {
                                        if (obj5 != null) {
                                            obj4 = obj5;
                                            length = i;
                                            subscriber = subscriber2;
                                            i6 = i7;
                                        }
                                    }
                                }
                                boolean z2 = innerSubscriber.f56909e;
                                SimpleQueue simpleQueue2 = innerSubscriber.f56910f;
                                if (z2 && (simpleQueue2 == null || simpleQueue2.isEmpty())) {
                                    m66427b(innerSubscriber);
                                    if (!m66430d()) {
                                        j++;
                                        obj3 = 1;
                                    } else {
                                        return;
                                    }
                                }
                                if (j2 == 0) {
                                    break;
                                }
                                length = i5 + 1;
                                i4 = i;
                                i5 = length == i4 ? 0 : length;
                                length = i4;
                                i6 = i7 + 1;
                                subscriber = subscriber2;
                            }
                            return;
                        }
                        return;
                    }
                    subscriber2 = subscriber;
                    r1.f56929q = i5;
                    r1.f56928p = innerSubscriberArr[i5].f56905a;
                    addAndGet = j;
                } else {
                    subscriber2 = subscriber;
                    i3 = i2;
                    addAndGet = j;
                    obj3 = null;
                }
                if (!(addAndGet == 0 || r1.f56923i)) {
                    r1.f56926n.request(addAndGet);
                }
                if (obj3 != null) {
                    i2 = i3;
                } else {
                    i2 = addAndGet(-i3);
                    if (i2 == 0) {
                        return;
                    }
                }
                subscriber = subscriber2;
            }
        }

        /* renamed from: d */
        boolean m66430d() {
            if (this.f56923i) {
                m66431e();
                return true;
            } else if (this.f56917c || this.f56922h.get() == null) {
                return false;
            } else {
                m66431e();
                Throwable a = this.f56922h.m58960a();
                if (a != ExceptionHelper.f48655a) {
                    this.f56915a.onError(a);
                }
                return true;
            }
        }

        /* renamed from: e */
        void m66431e() {
            SimpleQueue simpleQueue = this.f56920f;
            if (simpleQueue != null) {
                simpleQueue.clear();
            }
        }

        /* renamed from: f */
        void m66432f() {
            if (((InnerSubscriber[]) this.f56924j.get()) != f56914l) {
                InnerSubscriber[] innerSubscriberArr = (InnerSubscriber[]) this.f56924j.getAndSet(f56914l);
                if (innerSubscriberArr != f56914l) {
                    for (InnerSubscriber dispose : innerSubscriberArr) {
                        dispose.dispose();
                    }
                    Throwable a = this.f56922h.m58960a();
                    if (a != null && a != ExceptionHelper.f48655a) {
                        C2667a.a(a);
                    }
                }
            }
        }

        /* renamed from: a */
        void m66422a(InnerSubscriber<T, U> innerSubscriber, Throwable th) {
            if (this.f56922h.m58961a(th)) {
                innerSubscriber.f56909e = true;
                if (this.f56917c == null) {
                    this.f56926n.cancel();
                    for (InnerSubscriber dispose : (InnerSubscriber[]) this.f56924j.getAndSet(f56914l)) {
                        dispose.dispose();
                    }
                }
                m66426b();
                return;
            }
            C2667a.a(th);
        }
    }

    public FlowableFlatMap(C3957b<T> c3957b, Function<? super T, ? extends Publisher<? extends U>> function, boolean z, int i, int i2) {
        super(c3957b);
        this.f58817c = function;
        this.f58818d = z;
        this.f58819e = i;
        this.f58820f = i2;
    }

    /* renamed from: a */
    protected void m67575a(Subscriber<? super U> subscriber) {
        if (!C15696q.m58901a(this.a, subscriber, this.f58817c)) {
            this.a.a(m67574a(subscriber, this.f58817c, this.f58818d, this.f58819e, this.f58820f));
        }
    }

    /* renamed from: a */
    public static <T, U> FlowableSubscriber<T> m67574a(Subscriber<? super U> subscriber, Function<? super T, ? extends Publisher<? extends U>> function, boolean z, int i, int i2) {
        return new MergeSubscriber(subscriber, function, z, i, i2);
    }
}
