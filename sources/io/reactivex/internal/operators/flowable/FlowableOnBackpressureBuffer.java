package io.reactivex.internal.operators.flowable;

import com.google.android.exoplayer2.Format;
import io.reactivex.C3957b;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Action;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.C18423a;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.C15735a;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class FlowableOnBackpressureBuffer<T> extends C18364a<T, T> {
    /* renamed from: c */
    final int f58833c;
    /* renamed from: d */
    final boolean f58834d;
    /* renamed from: e */
    final boolean f58835e;
    /* renamed from: f */
    final Action f58836f;

    static final class BackpressureBufferSubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -2514538129242366402L;
        /* renamed from: a */
        final Subscriber<? super T> f59480a;
        /* renamed from: b */
        final SimplePlainQueue<T> f59481b;
        /* renamed from: c */
        final boolean f59482c;
        /* renamed from: d */
        final Action f59483d;
        /* renamed from: e */
        Subscription f59484e;
        /* renamed from: f */
        volatile boolean f59485f;
        /* renamed from: g */
        volatile boolean f59486g;
        /* renamed from: h */
        Throwable f59487h;
        /* renamed from: i */
        final AtomicLong f59488i = new AtomicLong();
        /* renamed from: j */
        boolean f59489j;

        BackpressureBufferSubscriber(Subscriber<? super T> subscriber, int i, boolean z, boolean z2, Action action) {
            this.f59480a = subscriber;
            this.f59483d = action;
            this.f59482c = z2;
            if (z) {
                subscriber = new C18423a(i);
            } else {
                subscriber = new SpscArrayQueue(i);
            }
            this.f59481b = subscriber;
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f59484e, subscription)) {
                this.f59484e = subscription;
                this.f59480a.onSubscribe(this);
                subscription.request(Format.OFFSET_SAMPLE_RELATIVE);
            }
        }

        public void onNext(T t) {
            if (this.f59481b.offer(t) == null) {
                this.f59484e.cancel();
                t = new MissingBackpressureException("Buffer is full");
                try {
                    this.f59483d.run();
                } catch (Throwable th) {
                    C15678a.m58850b(th);
                    t.initCause(th);
                }
                onError(t);
                return;
            }
            if (this.f59489j != null) {
                this.f59480a.onNext(null);
            } else {
                m68202a();
            }
        }

        public void onError(Throwable th) {
            this.f59487h = th;
            this.f59486g = true;
            if (this.f59489j) {
                this.f59480a.onError(th);
            } else {
                m68202a();
            }
        }

        public void onComplete() {
            this.f59486g = true;
            if (this.f59489j) {
                this.f59480a.onComplete();
            } else {
                m68202a();
            }
        }

        public void request(long j) {
            if (!this.f59489j && SubscriptionHelper.validate(j)) {
                C15735a.m58967a(this.f59488i, j);
                m68202a();
            }
        }

        public void cancel() {
            if (!this.f59485f) {
                this.f59485f = true;
                this.f59484e.cancel();
                if (getAndIncrement() == 0) {
                    this.f59481b.clear();
                }
            }
        }

        /* renamed from: a */
        void m68202a() {
            if (getAndIncrement() == 0) {
                SimplePlainQueue simplePlainQueue = this.f59481b;
                Subscriber subscriber = this.f59480a;
                int i = 1;
                while (!m68203a(this.f59486g, simplePlainQueue.isEmpty(), subscriber)) {
                    long j = this.f59488i.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z = this.f59486g;
                        Object poll = simplePlainQueue.poll();
                        boolean z2 = poll == null;
                        if (!m68203a(z, z2, subscriber)) {
                            if (z2) {
                                break;
                            }
                            subscriber.onNext(poll);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (j2 != j || !m68203a(this.f59486g, simplePlainQueue.isEmpty(), subscriber)) {
                        if (!(j2 == 0 || j == Format.OFFSET_SAMPLE_RELATIVE)) {
                            this.f59488i.addAndGet(-j2);
                        }
                        i = addAndGet(-i);
                        if (i == 0) {
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: a */
        boolean m68203a(boolean z, boolean z2, Subscriber<? super T> subscriber) {
            if (this.f59485f) {
                this.f59481b.clear();
                return true;
            }
            if (z) {
                if (!this.f59482c) {
                    z = this.f59487h;
                    if (z) {
                        this.f59481b.clear();
                        subscriber.onError(z);
                        return true;
                    } else if (z2) {
                        subscriber.onComplete();
                        return true;
                    }
                } else if (z2) {
                    z = this.f59487h;
                    if (z) {
                        subscriber.onError(z);
                    } else {
                        subscriber.onComplete();
                    }
                    return true;
                }
            }
            return false;
        }

        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f59489j = true;
            return 2;
        }

        @Nullable
        public T poll() throws Exception {
            return this.f59481b.poll();
        }

        public void clear() {
            this.f59481b.clear();
        }

        public boolean isEmpty() {
            return this.f59481b.isEmpty();
        }
    }

    public FlowableOnBackpressureBuffer(C3957b<T> c3957b, int i, boolean z, boolean z2, Action action) {
        super(c3957b);
        this.f58833c = i;
        this.f58834d = z;
        this.f58835e = z2;
        this.f58836f = action;
    }

    /* renamed from: a */
    protected void m67580a(Subscriber<? super T> subscriber) {
        this.a.a(new BackpressureBufferSubscriber(subscriber, this.f58833c, this.f58834d, this.f58835e, this.f58836f));
    }
}
