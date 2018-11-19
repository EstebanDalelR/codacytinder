package io.reactivex.internal.operators.flowable;

import io.reactivex.C3957b;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.C15735a;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class FlowableScanSeed<T, R> extends C18364a<T, R> {
    /* renamed from: c */
    final BiFunction<R, ? super T, R> f58851c;
    /* renamed from: d */
    final Callable<R> f58852d;

    static final class ScanSeedSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        private static final long serialVersionUID = -1776795561228106469L;
        /* renamed from: a */
        final Subscriber<? super R> f57011a;
        /* renamed from: b */
        final BiFunction<R, ? super T, R> f57012b;
        /* renamed from: c */
        final SimplePlainQueue<R> f57013c;
        /* renamed from: d */
        final AtomicLong f57014d = new AtomicLong();
        /* renamed from: e */
        final int f57015e;
        /* renamed from: f */
        final int f57016f;
        /* renamed from: g */
        volatile boolean f57017g;
        /* renamed from: h */
        volatile boolean f57018h;
        /* renamed from: i */
        Throwable f57019i;
        /* renamed from: j */
        Subscription f57020j;
        /* renamed from: k */
        R f57021k;
        /* renamed from: l */
        int f57022l;

        ScanSeedSubscriber(Subscriber<? super R> subscriber, BiFunction<R, ? super T, R> biFunction, R r, int i) {
            this.f57011a = subscriber;
            this.f57012b = biFunction;
            this.f57021k = r;
            this.f57015e = i;
            this.f57016f = i - (i >> 2);
            this.f57013c = new SpscArrayQueue(i);
            this.f57013c.offer(r);
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f57020j, subscription)) {
                this.f57020j = subscription;
                this.f57011a.onSubscribe(this);
                subscription.request((long) (this.f57015e - 1));
            }
        }

        public void onNext(T t) {
            if (!this.f57018h) {
                try {
                    t = C15684a.m58895a(this.f57012b.apply(this.f57021k, t), "The accumulator returned a null value");
                    this.f57021k = t;
                    this.f57013c.offer(t);
                    m66460a();
                } catch (T t2) {
                    C15678a.m58850b(t2);
                    this.f57020j.cancel();
                    onError(t2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f57018h) {
                C2667a.a(th);
                return;
            }
            this.f57019i = th;
            this.f57018h = true;
            m66460a();
        }

        public void onComplete() {
            if (!this.f57018h) {
                this.f57018h = true;
                m66460a();
            }
        }

        public void cancel() {
            this.f57017g = true;
            this.f57020j.cancel();
            if (getAndIncrement() == 0) {
                this.f57013c.clear();
            }
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C15735a.m58967a(this.f57014d, j);
                m66460a();
            }
        }

        /* renamed from: a */
        void m66460a() {
            ScanSeedSubscriber scanSeedSubscriber = this;
            if (getAndIncrement() == 0) {
                Subscriber subscriber = scanSeedSubscriber.f57011a;
                SimplePlainQueue simplePlainQueue = scanSeedSubscriber.f57013c;
                int i = scanSeedSubscriber.f57016f;
                int i2 = scanSeedSubscriber.f57022l;
                int i3 = 1;
                do {
                    long j = scanSeedSubscriber.f57014d.get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (scanSeedSubscriber.f57017g) {
                            simplePlainQueue.clear();
                            return;
                        }
                        boolean z = scanSeedSubscriber.f57018h;
                        if (z) {
                            Throwable th = scanSeedSubscriber.f57019i;
                            if (th != null) {
                                simplePlainQueue.clear();
                                subscriber.onError(th);
                                return;
                            }
                        }
                        Object poll = simplePlainQueue.poll();
                        Object obj = poll == null ? 1 : null;
                        if (z && obj != null) {
                            subscriber.onComplete();
                            return;
                        } else if (obj != null) {
                            break;
                        } else {
                            subscriber.onNext(poll);
                            long j3 = j2 + 1;
                            i2++;
                            if (i2 == i) {
                                scanSeedSubscriber.f57020j.request((long) i);
                                i2 = 0;
                            }
                            j2 = j3;
                        }
                    }
                    if (j2 == j && scanSeedSubscriber.f57018h) {
                        Throwable th2 = scanSeedSubscriber.f57019i;
                        if (th2 != null) {
                            simplePlainQueue.clear();
                            subscriber.onError(th2);
                            return;
                        } else if (simplePlainQueue.isEmpty()) {
                            subscriber.onComplete();
                            return;
                        }
                    }
                    if (j2 != 0) {
                        C15735a.m58969c(scanSeedSubscriber.f57014d, j2);
                    }
                    scanSeedSubscriber.f57022l = i2;
                    i3 = addAndGet(-i3);
                } while (i3 != 0);
            }
        }
    }

    public FlowableScanSeed(C3957b<T> c3957b, Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        super(c3957b);
        this.f58851c = biFunction;
        this.f58852d = callable;
    }

    /* renamed from: a */
    protected void m67595a(Subscriber<? super R> subscriber) {
        try {
            this.a.a(new ScanSeedSubscriber(subscriber, this.f58851c, C15684a.m58895a(this.f58852d.call(), "The seed supplied is null"), a()));
        } catch (Throwable th) {
            C15678a.m58850b(th);
            EmptySubscription.error(th, subscriber);
        }
    }
}
