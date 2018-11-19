package io.reactivex.internal.operators.flowable;

import io.reactivex.C3957b;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.HasUpstreamPublisher;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.C15735a;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.p079d.C2667a;
import io.reactivex.p490b.C18339a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class FlowablePublish<T> extends C18339a<T> implements HasUpstreamPublisher<T> {
    /* renamed from: a */
    final C3957b<T> f58840a;
    /* renamed from: c */
    final AtomicReference<PublishSubscriber<T>> f58841c;
    /* renamed from: d */
    final int f58842d;
    /* renamed from: e */
    final Publisher<T> f58843e;

    static final class InnerSubscriber<T> extends AtomicLong implements Subscription {
        private static final long serialVersionUID = -4453897557930727610L;
        /* renamed from: a */
        final Subscriber<? super T> f53229a;
        /* renamed from: b */
        volatile PublishSubscriber<T> f53230b;

        InnerSubscriber(Subscriber<? super T> subscriber) {
            this.f53229a = subscriber;
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C15735a.m58968b(this, j);
                j = this.f53230b;
                if (j != null) {
                    j.m66452a();
                }
            }
        }

        /* renamed from: a */
        public long m63494a(long j) {
            return C15735a.m58970d(this, j);
        }

        public void cancel() {
            if (get() != Long.MIN_VALUE && getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                PublishSubscriber publishSubscriber = this.f53230b;
                if (publishSubscriber != null) {
                    publishSubscriber.m66455b(this);
                    publishSubscriber.m66452a();
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowablePublish$a */
    static final class C17410a<T> implements Publisher<T> {
        /* renamed from: a */
        private final AtomicReference<PublishSubscriber<T>> f53231a;
        /* renamed from: b */
        private final int f53232b;

        C17410a(AtomicReference<PublishSubscriber<T>> atomicReference, int i) {
            this.f53231a = atomicReference;
            this.f53232b = i;
        }

        public void subscribe(Subscriber<? super T> subscriber) {
            InnerSubscriber innerSubscriber = new InnerSubscriber(subscriber);
            subscriber.onSubscribe(innerSubscriber);
            while (true) {
                subscriber = (PublishSubscriber) this.f53231a.get();
                if (subscriber == null || subscriber.isDisposed()) {
                    PublishSubscriber publishSubscriber = new PublishSubscriber(this.f53231a, this.f53232b);
                    if (this.f53231a.compareAndSet(subscriber, publishSubscriber) != null) {
                        subscriber = publishSubscriber;
                    }
                }
                if (subscriber.m66453a(innerSubscriber)) {
                    break;
                }
            }
            if (innerSubscriber.get() == Long.MIN_VALUE) {
                subscriber.m66455b(innerSubscriber);
            } else {
                innerSubscriber.f53230b = subscriber;
            }
            subscriber.m66452a();
        }
    }

    static final class PublishSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Disposable {
        /* renamed from: a */
        static final InnerSubscriber[] f56981a = new InnerSubscriber[0];
        /* renamed from: b */
        static final InnerSubscriber[] f56982b = new InnerSubscriber[0];
        private static final long serialVersionUID = -202316842419149694L;
        /* renamed from: c */
        final AtomicReference<PublishSubscriber<T>> f56983c;
        /* renamed from: d */
        final int f56984d;
        /* renamed from: e */
        final AtomicReference<InnerSubscriber[]> f56985e = new AtomicReference(f56981a);
        /* renamed from: f */
        final AtomicBoolean f56986f;
        /* renamed from: g */
        final AtomicReference<Subscription> f56987g = new AtomicReference();
        /* renamed from: h */
        volatile Object f56988h;
        /* renamed from: i */
        int f56989i;
        /* renamed from: j */
        volatile SimpleQueue<T> f56990j;

        PublishSubscriber(AtomicReference<PublishSubscriber<T>> atomicReference, int i) {
            this.f56983c = atomicReference;
            this.f56986f = new AtomicBoolean();
            this.f56984d = i;
        }

        public void dispose() {
            if (this.f56985e.get() != f56982b && ((InnerSubscriber[]) this.f56985e.getAndSet(f56982b)) != f56982b) {
                this.f56983c.compareAndSet(this, null);
                SubscriptionHelper.cancel(this.f56987g);
            }
        }

        public boolean isDisposed() {
            return this.f56985e.get() == f56982b;
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this.f56987g, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int requestFusion = queueSubscription.requestFusion(3);
                    if (requestFusion == 1) {
                        this.f56989i = requestFusion;
                        this.f56990j = queueSubscription;
                        this.f56988h = NotificationLite.complete();
                        m66452a();
                        return;
                    } else if (requestFusion == 2) {
                        this.f56989i = requestFusion;
                        this.f56990j = queueSubscription;
                        subscription.request((long) this.f56984d);
                        return;
                    }
                }
                this.f56990j = new SpscArrayQueue(this.f56984d);
                subscription.request((long) this.f56984d);
            }
        }

        public void onNext(T t) {
            if (this.f56989i == 0 && this.f56990j.offer(t) == null) {
                onError(new MissingBackpressureException("Prefetch queue is full?!"));
            } else {
                m66452a();
            }
        }

        public void onError(Throwable th) {
            if (this.f56988h == null) {
                this.f56988h = NotificationLite.error(th);
                m66452a();
                return;
            }
            C2667a.a(th);
        }

        public void onComplete() {
            if (this.f56988h == null) {
                this.f56988h = NotificationLite.complete();
                m66452a();
            }
        }

        /* renamed from: a */
        boolean m66453a(InnerSubscriber<T> innerSubscriber) {
            InnerSubscriber[] innerSubscriberArr;
            Object obj;
            do {
                innerSubscriberArr = (InnerSubscriber[]) this.f56985e.get();
                if (innerSubscriberArr == f56982b) {
                    return false;
                }
                int length = innerSubscriberArr.length;
                obj = new InnerSubscriber[(length + 1)];
                System.arraycopy(innerSubscriberArr, 0, obj, 0, length);
                obj[length] = innerSubscriber;
            } while (!this.f56985e.compareAndSet(innerSubscriberArr, obj));
            return true;
        }

        /* renamed from: b */
        void m66455b(InnerSubscriber<T> innerSubscriber) {
            InnerSubscriber[] innerSubscriberArr;
            Object obj;
            do {
                innerSubscriberArr = (InnerSubscriber[]) this.f56985e.get();
                int length = innerSubscriberArr.length;
                if (length == 0) {
                    break;
                }
                int i = -1;
                for (int i2 = 0; i2 < length; i2++) {
                    if (innerSubscriberArr[i2].equals(innerSubscriber)) {
                        i = i2;
                        break;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        obj = f56981a;
                    } else {
                        Object obj2 = new InnerSubscriber[(length - 1)];
                        System.arraycopy(innerSubscriberArr, 0, obj2, 0, i);
                        System.arraycopy(innerSubscriberArr, i + 1, obj2, i, (length - i) - 1);
                        obj = obj2;
                    }
                } else {
                    return;
                }
            } while (!this.f56985e.compareAndSet(innerSubscriberArr, obj));
        }

        /* renamed from: a */
        boolean m66454a(Object obj, boolean z) {
            int i = 0;
            if (obj != null) {
                if (!NotificationLite.isComplete(obj)) {
                    obj = NotificationLite.getError(obj);
                    this.f56983c.compareAndSet(this, null);
                    InnerSubscriber[] innerSubscriberArr = (InnerSubscriber[]) this.f56985e.getAndSet(f56982b);
                    if (innerSubscriberArr.length != 0) {
                        int length = innerSubscriberArr.length;
                        while (i < length) {
                            innerSubscriberArr[i].f53229a.onError(obj);
                            i++;
                        }
                    } else {
                        C2667a.a(obj);
                    }
                    return true;
                } else if (z) {
                    this.f56983c.compareAndSet(this, null);
                    InnerSubscriber[] innerSubscriberArr2 = (InnerSubscriber[]) this.f56985e.getAndSet(f56982b);
                    z = innerSubscriberArr2.length;
                    boolean z2;
                    while (z2 < z) {
                        innerSubscriberArr2[z2].f53229a.onComplete();
                        z2++;
                    }
                    return true;
                }
            }
            return false;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        void m66452a() {
            /*
            r21 = this;
            r1 = r21;
            r2 = r21.getAndIncrement();
            if (r2 == 0) goto L_0x0009;
        L_0x0008:
            return;
        L_0x0009:
            r3 = 1;
        L_0x000a:
            r4 = r1.f56988h;
            r5 = r1.f56990j;
            if (r5 == 0) goto L_0x0019;
        L_0x0010:
            r7 = r5.isEmpty();
            if (r7 == 0) goto L_0x0017;
        L_0x0016:
            goto L_0x0019;
        L_0x0017:
            r7 = 0;
            goto L_0x001a;
        L_0x0019:
            r7 = 1;
        L_0x001a:
            r4 = r1.m66454a(r4, r7);
            if (r4 == 0) goto L_0x0021;
        L_0x0020:
            return;
        L_0x0021:
            if (r7 != 0) goto L_0x0113;
        L_0x0023:
            r4 = r1.f56985e;
            r4 = r4.get();
            r4 = (io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[]) r4;
            r8 = r4.length;
            r9 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
            r11 = r4.length;
            r12 = r9;
            r9 = 0;
            r10 = 0;
        L_0x0035:
            r14 = 0;
            if (r9 >= r11) goto L_0x0058;
        L_0x0039:
            r6 = r4[r9];
            r16 = r3;
            r2 = r6.get();
            r6 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1));
            if (r6 < 0) goto L_0x004b;
        L_0x0045:
            r2 = java.lang.Math.min(r12, r2);
            r12 = r2;
            goto L_0x0053;
        L_0x004b:
            r14 = -9223372036854775808;
            r6 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1));
            if (r6 != 0) goto L_0x0053;
        L_0x0051:
            r10 = r10 + 1;
        L_0x0053:
            r9 = r9 + 1;
            r3 = r16;
            goto L_0x0035;
        L_0x0058:
            r16 = r3;
            r2 = 1;
            if (r8 != r10) goto L_0x009a;
        L_0x005e:
            r4 = r1.f56988h;
            r5 = r5.poll();	 Catch:{ Throwable -> 0x0065 }
            goto L_0x007b;
        L_0x0065:
            r0 = move-exception;
            io.reactivex.exceptions.C15678a.m58850b(r0);
            r4 = r1.f56987g;
            r4 = r4.get();
            r4 = (org.reactivestreams.Subscription) r4;
            r4.cancel();
            r4 = io.reactivex.internal.util.NotificationLite.error(r0);
            r1.f56988h = r4;
            r5 = 0;
        L_0x007b:
            if (r5 != 0) goto L_0x007f;
        L_0x007d:
            r5 = 1;
            goto L_0x0080;
        L_0x007f:
            r5 = 0;
        L_0x0080:
            r4 = r1.m66454a(r4, r5);
            if (r4 == 0) goto L_0x0087;
        L_0x0086:
            return;
        L_0x0087:
            r4 = r1.f56989i;
            r5 = 1;
            if (r4 == r5) goto L_0x0097;
        L_0x008c:
            r4 = r1.f56987g;
            r4 = r4.get();
            r4 = (org.reactivestreams.Subscription) r4;
            r4.request(r2);
        L_0x0097:
            r3 = 1;
            goto L_0x010f;
        L_0x009a:
            r8 = r7;
            r7 = 0;
        L_0x009c:
            r9 = (long) r7;
            r11 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1));
            if (r11 >= 0) goto L_0x00f2;
        L_0x00a1:
            r8 = r1.f56988h;
            r11 = r5.poll();	 Catch:{ Throwable -> 0x00a8 }
            goto L_0x00be;
        L_0x00a8:
            r0 = move-exception;
            io.reactivex.exceptions.C15678a.m58850b(r0);
            r8 = r1.f56987g;
            r8 = r8.get();
            r8 = (org.reactivestreams.Subscription) r8;
            r8.cancel();
            r8 = io.reactivex.internal.util.NotificationLite.error(r0);
            r1.f56988h = r8;
            r11 = 0;
        L_0x00be:
            if (r11 != 0) goto L_0x00c2;
        L_0x00c0:
            r6 = 1;
            goto L_0x00c3;
        L_0x00c2:
            r6 = 0;
        L_0x00c3:
            r8 = r1.m66454a(r8, r6);
            if (r8 == 0) goto L_0x00ca;
        L_0x00c9:
            return;
        L_0x00ca:
            if (r6 == 0) goto L_0x00cd;
        L_0x00cc:
            goto L_0x00f3;
        L_0x00cd:
            r8 = io.reactivex.internal.util.NotificationLite.getValue(r11);
            r9 = r4.length;
            r10 = 0;
        L_0x00d3:
            if (r10 >= r9) goto L_0x00ec;
        L_0x00d5:
            r11 = r4[r10];
            r17 = r11.get();
            r19 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1));
            if (r19 <= 0) goto L_0x00e7;
        L_0x00df:
            r14 = r11.f53229a;
            r14.onNext(r8);
            r11.m63494a(r2);
        L_0x00e7:
            r10 = r10 + 1;
            r14 = 0;
            goto L_0x00d3;
        L_0x00ec:
            r7 = r7 + 1;
            r8 = r6;
            r14 = 0;
            goto L_0x009c;
        L_0x00f2:
            r6 = r8;
        L_0x00f3:
            if (r7 <= 0) goto L_0x0106;
        L_0x00f5:
            r2 = r1.f56989i;
            r3 = 1;
            if (r2 == r3) goto L_0x0107;
        L_0x00fa:
            r2 = r1.f56987g;
            r2 = r2.get();
            r2 = (org.reactivestreams.Subscription) r2;
            r2.request(r9);
            goto L_0x0107;
        L_0x0106:
            r3 = 1;
        L_0x0107:
            r4 = 0;
            r2 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1));
            if (r2 == 0) goto L_0x0116;
        L_0x010d:
            if (r6 != 0) goto L_0x0116;
        L_0x010f:
            r3 = r16;
            goto L_0x000a;
        L_0x0113:
            r16 = r3;
            r3 = 1;
        L_0x0116:
            r2 = r16;
            r2 = -r2;
            r2 = r1.addAndGet(r2);
            if (r2 != 0) goto L_0x0120;
        L_0x011f:
            return;
        L_0x0120:
            r3 = r2;
            goto L_0x000a;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber.a():void");
        }
    }

    /* renamed from: a */
    public static <T> C18339a<T> m67585a(C3957b<T> c3957b, int i) {
        AtomicReference atomicReference = new AtomicReference();
        return C2667a.a(new FlowablePublish(new C17410a(atomicReference, i), c3957b, atomicReference, i));
    }

    private FlowablePublish(Publisher<T> publisher, C3957b<T> c3957b, AtomicReference<PublishSubscriber<T>> atomicReference, int i) {
        this.f58843e = publisher;
        this.f58840a = c3957b;
        this.f58841c = atomicReference;
        this.f58842d = i;
    }

    public Publisher<T> source() {
        return this.f58840a;
    }

    /* renamed from: a */
    protected void m67586a(Subscriber<? super T> subscriber) {
        this.f58843e.subscribe(subscriber);
    }

    /* renamed from: d */
    public void mo13999d(Consumer<? super Disposable> consumer) {
        FlowableSubscriber flowableSubscriber;
        PublishSubscriber publishSubscriber;
        while (true) {
            flowableSubscriber = (PublishSubscriber) this.f58841c.get();
            if (flowableSubscriber != null && !flowableSubscriber.isDisposed()) {
                break;
            }
            publishSubscriber = new PublishSubscriber(this.f58841c, this.f58842d);
            if (this.f58841c.compareAndSet(flowableSubscriber, publishSubscriber)) {
                break;
            }
        }
        flowableSubscriber = publishSubscriber;
        boolean z = true;
        if (flowableSubscriber.f56986f.get() || !flowableSubscriber.f56986f.compareAndSet(false, true)) {
            z = false;
        }
        try {
            consumer.accept(flowableSubscriber);
            if (z) {
                this.f58840a.a(flowableSubscriber);
            }
        } catch (Throwable th) {
            C15678a.m58850b(th);
            consumer = ExceptionHelper.m58962a(th);
        }
    }
}
