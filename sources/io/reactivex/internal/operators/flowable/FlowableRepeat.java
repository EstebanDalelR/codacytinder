package io.reactivex.internal.operators.flowable;

import com.google.android.exoplayer2.Format;
import io.reactivex.C3957b;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class FlowableRepeat<T> extends C18364a<T, T> {
    /* renamed from: c */
    final long f58848c;

    static final class RepeatSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        /* renamed from: a */
        final Subscriber<? super T> f56998a;
        /* renamed from: b */
        final SubscriptionArbiter f56999b;
        /* renamed from: c */
        final Publisher<? extends T> f57000c;
        /* renamed from: d */
        long f57001d;
        /* renamed from: e */
        long f57002e;

        RepeatSubscriber(Subscriber<? super T> subscriber, long j, SubscriptionArbiter subscriptionArbiter, Publisher<? extends T> publisher) {
            this.f56998a = subscriber;
            this.f56999b = subscriptionArbiter;
            this.f57000c = publisher;
            this.f57001d = j;
        }

        public void onSubscribe(Subscription subscription) {
            this.f56999b.m63749a(subscription);
        }

        public void onNext(T t) {
            this.f57002e++;
            this.f56998a.onNext(t);
        }

        public void onError(Throwable th) {
            this.f56998a.onError(th);
        }

        public void onComplete() {
            long j = this.f57001d;
            if (j != Format.OFFSET_SAMPLE_RELATIVE) {
                this.f57001d = j - 1;
            }
            if (j != 0) {
                m66458a();
            } else {
                this.f56998a.onComplete();
            }
        }

        /* renamed from: a */
        void m66458a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.f56999b.m63752d()) {
                    long j = this.f57002e;
                    if (j != 0) {
                        this.f57002e = 0;
                        this.f56999b.m63748a(j);
                    }
                    this.f57000c.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                    }
                }
            }
        }
    }

    public FlowableRepeat(C3957b<T> c3957b, long j) {
        super(c3957b);
        this.f58848c = j;
    }

    /* renamed from: a */
    public void m67592a(Subscriber<? super T> subscriber) {
        Object subscriptionArbiter = new SubscriptionArbiter();
        subscriber.onSubscribe(subscriptionArbiter);
        long j = this.f58848c;
        long j2 = Format.OFFSET_SAMPLE_RELATIVE;
        if (j != Format.OFFSET_SAMPLE_RELATIVE) {
            j2 = this.f58848c - 1;
        }
        new RepeatSubscriber(subscriber, j2, subscriptionArbiter, this.a).m66458a();
    }
}
