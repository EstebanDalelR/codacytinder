package io.reactivex.internal.operators.flowable;

import com.google.android.exoplayer2.Format;
import io.reactivex.C3957b;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.C15678a;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.C15735a;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class FlowableSwitchMap<T, R> extends C18364a<T, R> {
    /* renamed from: c */
    final Function<? super T, ? extends Publisher<? extends R>> f58856c;
    /* renamed from: d */
    final int f58857d;
    /* renamed from: e */
    final boolean f58858e;

    static final class SwitchMapInnerSubscriber<T, R> extends AtomicReference<Subscription> implements FlowableSubscriber<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        /* renamed from: a */
        final SwitchMapSubscriber<T, R> f57029a;
        /* renamed from: b */
        final long f57030b;
        /* renamed from: c */
        final int f57031c;
        /* renamed from: d */
        volatile SimpleQueue<R> f57032d;
        /* renamed from: e */
        volatile boolean f57033e;
        /* renamed from: f */
        int f57034f;

        SwitchMapInnerSubscriber(SwitchMapSubscriber<T, R> switchMapSubscriber, long j, int i) {
            this.f57029a = switchMapSubscriber;
            this.f57030b = j;
            this.f57031c = i;
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int requestFusion = queueSubscription.requestFusion(3);
                    if (requestFusion == 1) {
                        this.f57034f = requestFusion;
                        this.f57032d = queueSubscription;
                        this.f57033e = true;
                        this.f57029a.m66464b();
                        return;
                    } else if (requestFusion == 2) {
                        this.f57034f = requestFusion;
                        this.f57032d = queueSubscription;
                        subscription.request((long) this.f57031c);
                        return;
                    }
                }
                this.f57032d = new SpscArrayQueue(this.f57031c);
                subscription.request((long) this.f57031c);
            }
        }

        public void onNext(R r) {
            SwitchMapSubscriber switchMapSubscriber = this.f57029a;
            if (this.f57030b == switchMapSubscriber.f57046l) {
                if (this.f57034f == 0 && this.f57032d.offer(r) == null) {
                    onError(new MissingBackpressureException("Queue full?!"));
                    return;
                }
                switchMapSubscriber.m66464b();
            }
        }

        public void onError(Throwable th) {
            SwitchMapSubscriber switchMapSubscriber = this.f57029a;
            if (this.f57030b == switchMapSubscriber.f57046l && switchMapSubscriber.f57041f.m58961a(th)) {
                if (switchMapSubscriber.f57039d == null) {
                    switchMapSubscriber.f57043h.cancel();
                }
                this.f57033e = true;
                switchMapSubscriber.m66464b();
                return;
            }
            C2667a.a(th);
        }

        public void onComplete() {
            SwitchMapSubscriber switchMapSubscriber = this.f57029a;
            if (this.f57030b == switchMapSubscriber.f57046l) {
                this.f57033e = true;
                switchMapSubscriber.m66464b();
            }
        }

        /* renamed from: a */
        public void m66462a() {
            SubscriptionHelper.cancel(this);
        }
    }

    static final class SwitchMapSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        /* renamed from: k */
        static final SwitchMapInnerSubscriber<Object, Object> f57035k = new SwitchMapInnerSubscriber(null, -1, 1);
        private static final long serialVersionUID = -3491074160481096299L;
        /* renamed from: a */
        final Subscriber<? super R> f57036a;
        /* renamed from: b */
        final Function<? super T, ? extends Publisher<? extends R>> f57037b;
        /* renamed from: c */
        final int f57038c;
        /* renamed from: d */
        final boolean f57039d;
        /* renamed from: e */
        volatile boolean f57040e;
        /* renamed from: f */
        final AtomicThrowable f57041f;
        /* renamed from: g */
        volatile boolean f57042g;
        /* renamed from: h */
        Subscription f57043h;
        /* renamed from: i */
        final AtomicReference<SwitchMapInnerSubscriber<T, R>> f57044i = new AtomicReference();
        /* renamed from: j */
        final AtomicLong f57045j = new AtomicLong();
        /* renamed from: l */
        volatile long f57046l;

        static {
            f57035k.m66462a();
        }

        SwitchMapSubscriber(Subscriber<? super R> subscriber, Function<? super T, ? extends Publisher<? extends R>> function, int i, boolean z) {
            this.f57036a = subscriber;
            this.f57037b = function;
            this.f57038c = i;
            this.f57039d = z;
            this.f57041f = new AtomicThrowable();
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f57043h, subscription)) {
                this.f57043h = subscription;
                this.f57036a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            if (!this.f57040e) {
                long j = this.f57046l + 1;
                this.f57046l = j;
                SwitchMapInnerSubscriber switchMapInnerSubscriber = (SwitchMapInnerSubscriber) this.f57044i.get();
                if (switchMapInnerSubscriber != null) {
                    switchMapInnerSubscriber.m66462a();
                }
                try {
                    Publisher publisher = (Publisher) C15684a.m58895a(this.f57037b.apply(t), "The publisher returned is null");
                    Subscriber switchMapInnerSubscriber2 = new SwitchMapInnerSubscriber(this, j, this.f57038c);
                    SwitchMapInnerSubscriber switchMapInnerSubscriber3;
                    do {
                        switchMapInnerSubscriber3 = (SwitchMapInnerSubscriber) this.f57044i.get();
                        if (switchMapInnerSubscriber3 == f57035k) {
                            break;
                        }
                    } while (!this.f57044i.compareAndSet(switchMapInnerSubscriber3, switchMapInnerSubscriber2));
                    publisher.subscribe(switchMapInnerSubscriber2);
                } catch (T t2) {
                    C15678a.m58850b(t2);
                    this.f57043h.cancel();
                    onError(t2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f57040e || !this.f57041f.m58961a(th)) {
                C2667a.a(th);
                return;
            }
            if (this.f57039d == null) {
                m66463a();
            }
            this.f57040e = true;
            m66464b();
        }

        public void onComplete() {
            if (!this.f57040e) {
                this.f57040e = true;
                m66464b();
            }
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C15735a.m58967a(this.f57045j, j);
                if (this.f57046l == 0) {
                    this.f57043h.request(Format.OFFSET_SAMPLE_RELATIVE);
                } else {
                    m66464b();
                }
            }
        }

        public void cancel() {
            if (!this.f57042g) {
                this.f57042g = true;
                this.f57043h.cancel();
                m66463a();
            }
        }

        /* renamed from: a */
        void m66463a() {
            if (((SwitchMapInnerSubscriber) this.f57044i.get()) != f57035k) {
                SwitchMapInnerSubscriber switchMapInnerSubscriber = (SwitchMapInnerSubscriber) this.f57044i.getAndSet(f57035k);
                if (switchMapInnerSubscriber != f57035k && switchMapInnerSubscriber != null) {
                    switchMapInnerSubscriber.m66462a();
                }
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: b */
        void m66464b() {
            /*
            r19 = this;
            r1 = r19;
            r2 = r19.getAndIncrement();
            if (r2 == 0) goto L_0x0009;
        L_0x0008:
            return;
        L_0x0009:
            r2 = r1.f57036a;
            r4 = 1;
        L_0x000c:
            r5 = r1.f57042g;
            r6 = 0;
            if (r5 == 0) goto L_0x0017;
        L_0x0011:
            r2 = r1.f57044i;
            r2.lazySet(r6);
            return;
        L_0x0017:
            r5 = r1.f57040e;
            if (r5 == 0) goto L_0x0062;
        L_0x001b:
            r5 = r1.f57039d;
            if (r5 == 0) goto L_0x003f;
        L_0x001f:
            r5 = r1.f57044i;
            r5 = r5.get();
            if (r5 != 0) goto L_0x0062;
        L_0x0027:
            r3 = r1.f57041f;
            r3 = r3.get();
            r3 = (java.lang.Throwable) r3;
            if (r3 == 0) goto L_0x003b;
        L_0x0031:
            r3 = r1.f57041f;
            r3 = r3.m58960a();
            r2.onError(r3);
            goto L_0x003e;
        L_0x003b:
            r2.onComplete();
        L_0x003e:
            return;
        L_0x003f:
            r5 = r1.f57041f;
            r5 = r5.get();
            r5 = (java.lang.Throwable) r5;
            if (r5 == 0) goto L_0x0056;
        L_0x0049:
            r19.m66463a();
            r3 = r1.f57041f;
            r3 = r3.m58960a();
            r2.onError(r3);
            return;
        L_0x0056:
            r5 = r1.f57044i;
            r5 = r5.get();
            if (r5 != 0) goto L_0x0062;
        L_0x005e:
            r2.onComplete();
            return;
        L_0x0062:
            r5 = r1.f57044i;
            r5 = r5.get();
            r5 = (io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapInnerSubscriber) r5;
            if (r5 == 0) goto L_0x006f;
        L_0x006c:
            r7 = r5.f57032d;
            goto L_0x0070;
        L_0x006f:
            r7 = r6;
        L_0x0070:
            if (r7 == 0) goto L_0x0146;
        L_0x0072:
            r8 = r5.f57033e;
            if (r8 == 0) goto L_0x00ab;
        L_0x0076:
            r8 = r1.f57039d;
            if (r8 != 0) goto L_0x009e;
        L_0x007a:
            r8 = r1.f57041f;
            r8 = r8.get();
            r8 = (java.lang.Throwable) r8;
            if (r8 == 0) goto L_0x0091;
        L_0x0084:
            r19.m66463a();
            r3 = r1.f57041f;
            r3 = r3.m58960a();
            r2.onError(r3);
            return;
        L_0x0091:
            r8 = r7.isEmpty();
            if (r8 == 0) goto L_0x00ab;
        L_0x0097:
            r7 = r1.f57044i;
            r7.compareAndSet(r5, r6);
            goto L_0x000c;
        L_0x009e:
            r8 = r7.isEmpty();
            if (r8 == 0) goto L_0x00ab;
        L_0x00a4:
            r7 = r1.f57044i;
            r7.compareAndSet(r5, r6);
            goto L_0x000c;
        L_0x00ab:
            r8 = r1.f57045j;
            r8 = r8.get();
            r10 = 0;
            r12 = r10;
        L_0x00b4:
            r14 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1));
            r15 = 0;
            if (r14 == 0) goto L_0x0122;
        L_0x00b9:
            r14 = r1.f57042g;
            if (r14 == 0) goto L_0x00be;
        L_0x00bd:
            return;
        L_0x00be:
            r14 = r5.f57033e;
            r16 = r7.poll();	 Catch:{ Throwable -> 0x00cb }
            r18 = r16;
            r16 = r14;
            r14 = r18;
            goto L_0x00da;
        L_0x00cb:
            r0 = move-exception;
            io.reactivex.exceptions.C15678a.m58850b(r0);
            r5.m66462a();
            r14 = r1.f57041f;
            r14.m58961a(r0);
            r14 = r6;
            r16 = 1;
        L_0x00da:
            if (r14 != 0) goto L_0x00df;
        L_0x00dc:
            r17 = 1;
            goto L_0x00e1;
        L_0x00df:
            r17 = 0;
        L_0x00e1:
            r3 = r1.f57044i;
            r3 = r3.get();
            if (r5 == r3) goto L_0x00eb;
        L_0x00e9:
            r15 = 1;
            goto L_0x0122;
        L_0x00eb:
            if (r16 == 0) goto L_0x0115;
        L_0x00ed:
            r3 = r1.f57039d;
            if (r3 != 0) goto L_0x010d;
        L_0x00f1:
            r3 = r1.f57041f;
            r3 = r3.get();
            r3 = (java.lang.Throwable) r3;
            if (r3 == 0) goto L_0x0105;
        L_0x00fb:
            r3 = r1.f57041f;
            r3 = r3.m58960a();
            r2.onError(r3);
            return;
        L_0x0105:
            if (r17 == 0) goto L_0x0115;
        L_0x0107:
            r3 = r1.f57044i;
            r3.compareAndSet(r5, r6);
            goto L_0x00e9;
        L_0x010d:
            if (r17 == 0) goto L_0x0115;
        L_0x010f:
            r3 = r1.f57044i;
            r3.compareAndSet(r5, r6);
            goto L_0x00e9;
        L_0x0115:
            if (r17 == 0) goto L_0x0118;
        L_0x0117:
            goto L_0x0122;
        L_0x0118:
            r2.onNext(r14);
            r14 = 1;
            r16 = r12 + r14;
            r12 = r16;
            goto L_0x00b4;
        L_0x0122:
            r3 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1));
            if (r3 == 0) goto L_0x0142;
        L_0x0126:
            r3 = r1.f57042g;
            if (r3 != 0) goto L_0x0142;
        L_0x012a:
            r6 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
            r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
            if (r3 == 0) goto L_0x0139;
        L_0x0133:
            r3 = r1.f57045j;
            r6 = -r12;
            r3.addAndGet(r6);
        L_0x0139:
            r3 = r5.get();
            r3 = (org.reactivestreams.Subscription) r3;
            r3.request(r12);
        L_0x0142:
            if (r15 == 0) goto L_0x0146;
        L_0x0144:
            goto L_0x000c;
        L_0x0146:
            r3 = -r4;
            r4 = r1.addAndGet(r3);
            if (r4 != 0) goto L_0x000c;
        L_0x014d:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapSubscriber.b():void");
        }
    }

    public FlowableSwitchMap(C3957b<T> c3957b, Function<? super T, ? extends Publisher<? extends R>> function, int i, boolean z) {
        super(c3957b);
        this.f58856c = function;
        this.f58857d = i;
        this.f58858e = z;
    }

    /* renamed from: a */
    protected void m67598a(Subscriber<? super R> subscriber) {
        if (!C15696q.m58901a(this.a, subscriber, this.f58856c)) {
            this.a.a(new SwitchMapSubscriber(subscriber, this.f58856c, this.f58857d, this.f58858e));
        }
    }
}
