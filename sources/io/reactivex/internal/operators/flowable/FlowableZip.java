package io.reactivex.internal.operators.flowable;

import com.google.android.exoplayer2.Format;
import io.reactivex.C3957b;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.C15735a;
import io.reactivex.p079d.C2667a;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class FlowableZip<T, R> extends C3957b<R> {
    /* renamed from: a */
    final Publisher<? extends T>[] f57078a;
    /* renamed from: c */
    final Iterable<? extends Publisher<? extends T>> f57079c;
    /* renamed from: d */
    final Function<? super Object[], ? extends R> f57080d;
    /* renamed from: e */
    final int f57081e;
    /* renamed from: f */
    final boolean f57082f;

    static final class ZipCoordinator<T, R> extends AtomicInteger implements Subscription {
        private static final long serialVersionUID = -2434867452883857743L;
        /* renamed from: a */
        final Subscriber<? super R> f53238a;
        /* renamed from: b */
        final ZipSubscriber<T, R>[] f53239b;
        /* renamed from: c */
        final Function<? super Object[], ? extends R> f53240c;
        /* renamed from: d */
        final AtomicLong f53241d;
        /* renamed from: e */
        final AtomicThrowable f53242e;
        /* renamed from: f */
        final boolean f53243f;
        /* renamed from: g */
        volatile boolean f53244g;
        /* renamed from: h */
        final Object[] f53245h;

        ZipCoordinator(Subscriber<? super R> subscriber, Function<? super Object[], ? extends R> function, int i, int i2, boolean z) {
            this.f53238a = subscriber;
            this.f53240c = function;
            this.f53243f = z;
            subscriber = new ZipSubscriber[i];
            for (function = null; function < i; function++) {
                subscriber[function] = new ZipSubscriber(this, i2);
            }
            this.f53245h = new Object[i];
            this.f53239b = subscriber;
            this.f53241d = new AtomicLong();
            this.f53242e = new AtomicThrowable();
        }

        /* renamed from: a */
        void m63499a(Publisher<? extends T>[] publisherArr, int i) {
            ZipSubscriber[] zipSubscriberArr = this.f53239b;
            for (int i2 = 0; i2 < i && !this.f53244g; i2++) {
                if (!this.f53243f && this.f53242e.get() != null) {
                    break;
                }
                publisherArr[i2].subscribe(zipSubscriberArr[i2]);
            }
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C15735a.m58967a(this.f53241d, j);
                m63500b();
            }
        }

        public void cancel() {
            if (!this.f53244g) {
                this.f53244g = true;
                m63497a();
            }
        }

        /* renamed from: a */
        void m63498a(ZipSubscriber<T, R> zipSubscriber, Throwable th) {
            if (this.f53242e.m58961a(th)) {
                zipSubscriber.f57076f = true;
                m63500b();
                return;
            }
            C2667a.a(th);
        }

        /* renamed from: a */
        void m63497a() {
            for (ZipSubscriber cancel : this.f53239b) {
                cancel.cancel();
            }
        }

        /* renamed from: b */
        void m63500b() {
            ZipCoordinator zipCoordinator = this;
            if (getAndIncrement() == 0) {
                Subscriber subscriber = zipCoordinator.f53238a;
                ZipSubscriber[] zipSubscriberArr = zipCoordinator.f53239b;
                int length = zipSubscriberArr.length;
                Object obj = zipCoordinator.f53245h;
                int i = 1;
                do {
                    int i2;
                    long j = zipCoordinator.f53241d.get();
                    long j2 = 0;
                    while (j != j2) {
                        if (!zipCoordinator.f53244g) {
                            if (zipCoordinator.f53243f || zipCoordinator.f53242e.get() == null) {
                                Object obj2 = null;
                                for (int i3 = 0; i3 < length; i3++) {
                                    ZipSubscriber zipSubscriber = zipSubscriberArr[i3];
                                    if (obj[i3] == null) {
                                        try {
                                            boolean z = zipSubscriber.f57076f;
                                            SimpleQueue simpleQueue = zipSubscriber.f57074d;
                                            Object poll = simpleQueue != null ? simpleQueue.poll() : null;
                                            Object obj3 = poll == null ? 1 : null;
                                            if (!z || obj3 == null) {
                                                if (obj3 == null) {
                                                    obj[i3] = poll;
                                                    poll = obj2;
                                                } else {
                                                    poll = 1;
                                                }
                                                obj2 = poll;
                                            } else {
                                                m63497a();
                                                if (((Throwable) zipCoordinator.f53242e.get()) != null) {
                                                    subscriber.onError(zipCoordinator.f53242e.m58960a());
                                                } else {
                                                    subscriber.onComplete();
                                                }
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            Throwable th2 = th;
                                            C15678a.m58850b(th2);
                                            zipCoordinator.f53242e.m58961a(th2);
                                            if (zipCoordinator.f53243f) {
                                                obj2 = 1;
                                            } else {
                                                m63497a();
                                                subscriber.onError(zipCoordinator.f53242e.m58960a());
                                                return;
                                            }
                                        }
                                    }
                                }
                                if (obj2 != null) {
                                    break;
                                }
                                try {
                                    subscriber.onNext(C15684a.m58895a(zipCoordinator.f53240c.apply(obj.clone()), "The zipper returned a null value"));
                                    long j3 = j2 + 1;
                                    Arrays.fill(obj, null);
                                    j2 = j3;
                                } catch (Throwable th3) {
                                    Throwable th4 = th3;
                                    C15678a.m58850b(th4);
                                    m63497a();
                                    zipCoordinator.f53242e.m58961a(th4);
                                    subscriber.onError(zipCoordinator.f53242e.m58960a());
                                    return;
                                }
                            }
                            m63497a();
                            subscriber.onError(zipCoordinator.f53242e.m58960a());
                            return;
                        }
                        return;
                    }
                    if (j == j2) {
                        if (!zipCoordinator.f53244g) {
                            if (zipCoordinator.f53243f || zipCoordinator.f53242e.get() == null) {
                                for (i2 = 0; i2 < length; i2++) {
                                    ZipSubscriber zipSubscriber2 = zipSubscriberArr[i2];
                                    if (obj[i2] == null) {
                                        try {
                                            boolean z2 = zipSubscriber2.f57076f;
                                            SimpleQueue simpleQueue2 = zipSubscriber2.f57074d;
                                            Object poll2 = simpleQueue2 != null ? simpleQueue2.poll() : null;
                                            Object obj4 = poll2 == null ? 1 : null;
                                            if (z2 && obj4 != null) {
                                                m63497a();
                                                if (((Throwable) zipCoordinator.f53242e.get()) != null) {
                                                    subscriber.onError(zipCoordinator.f53242e.m58960a());
                                                } else {
                                                    subscriber.onComplete();
                                                }
                                                return;
                                            } else if (obj4 == null) {
                                                obj[i2] = poll2;
                                            }
                                        } catch (Throwable th32) {
                                            Throwable th5 = th32;
                                            C15678a.m58850b(th5);
                                            zipCoordinator.f53242e.m58961a(th5);
                                            if (!zipCoordinator.f53243f) {
                                                m63497a();
                                                subscriber.onError(zipCoordinator.f53242e.m58960a());
                                                return;
                                            }
                                        }
                                    }
                                }
                            } else {
                                m63497a();
                                subscriber.onError(zipCoordinator.f53242e.m58960a());
                                return;
                            }
                        }
                        return;
                    }
                    if (j2 != 0) {
                        for (ZipSubscriber request : zipSubscriberArr) {
                            request.request(j2);
                        }
                        if (j != Format.OFFSET_SAMPLE_RELATIVE) {
                            zipCoordinator.f53241d.addAndGet(-j2);
                        }
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }
    }

    static final class ZipSubscriber<T, R> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Subscription {
        private static final long serialVersionUID = -4627193790118206028L;
        /* renamed from: a */
        final ZipCoordinator<T, R> f57071a;
        /* renamed from: b */
        final int f57072b;
        /* renamed from: c */
        final int f57073c;
        /* renamed from: d */
        SimpleQueue<T> f57074d;
        /* renamed from: e */
        long f57075e;
        /* renamed from: f */
        volatile boolean f57076f;
        /* renamed from: g */
        int f57077g;

        ZipSubscriber(ZipCoordinator<T, R> zipCoordinator, int i) {
            this.f57071a = zipCoordinator;
            this.f57072b = i;
            this.f57073c = i - (i >> 2);
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int requestFusion = queueSubscription.requestFusion(7);
                    if (requestFusion == 1) {
                        this.f57077g = requestFusion;
                        this.f57074d = queueSubscription;
                        this.f57076f = true;
                        this.f57071a.m63500b();
                        return;
                    } else if (requestFusion == 2) {
                        this.f57077g = requestFusion;
                        this.f57074d = queueSubscription;
                        subscription.request((long) this.f57072b);
                        return;
                    }
                }
                this.f57074d = new SpscArrayQueue(this.f57072b);
                subscription.request((long) this.f57072b);
            }
        }

        public void onNext(T t) {
            if (this.f57077g != 2) {
                this.f57074d.offer(t);
            }
            this.f57071a.m63500b();
        }

        public void onError(Throwable th) {
            this.f57071a.m63498a(this, th);
        }

        public void onComplete() {
            this.f57076f = true;
            this.f57071a.m63500b();
        }

        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        public void request(long j) {
            if (this.f57077g != 1) {
                long j2 = this.f57075e + j;
                if (j2 >= ((long) this.f57073c)) {
                    this.f57075e = 0;
                    ((Subscription) get()).request(j2);
                    return;
                }
                this.f57075e = j2;
            }
        }
    }

    public FlowableZip(Publisher<? extends T>[] publisherArr, Iterable<? extends Publisher<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i, boolean z) {
        this.f57078a = publisherArr;
        this.f57079c = iterable;
        this.f57080d = function;
        this.f57081e = i;
        this.f57082f = z;
    }

    /* renamed from: a */
    public void m66466a(Subscriber<? super R> subscriber) {
        int i;
        Publisher[] publisherArr;
        Publisher[] publisherArr2 = this.f57078a;
        if (publisherArr2 == null) {
            Object obj = new Publisher[8];
            Object obj2 = obj;
            i = 0;
            for (Publisher publisher : this.f57079c) {
                if (i == obj2.length) {
                    Object obj3 = new Publisher[((i >> 2) + i)];
                    System.arraycopy(obj2, 0, obj3, 0, i);
                    obj2 = obj3;
                }
                int i2 = i + 1;
                obj2[i] = publisher;
                i = i2;
            }
            publisherArr = obj2;
        } else {
            publisherArr = publisherArr2;
            i = publisherArr2.length;
        }
        if (i == 0) {
            EmptySubscription.complete(subscriber);
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(subscriber, this.f57080d, i, this.f57081e, this.f57082f);
        subscriber.onSubscribe(zipCoordinator);
        zipCoordinator.m63499a(publisherArr, i);
    }
}
