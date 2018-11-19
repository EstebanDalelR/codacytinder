package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.C15742i;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

public final class InnerQueuedSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Subscription {
    private static final long serialVersionUID = 22876611072430776L;
    /* renamed from: a */
    final InnerQueuedSubscriberSupport<T> f57385a;
    /* renamed from: b */
    final int f57386b;
    /* renamed from: c */
    final int f57387c;
    /* renamed from: d */
    volatile SimpleQueue<T> f57388d;
    /* renamed from: e */
    volatile boolean f57389e;
    /* renamed from: f */
    long f57390f;
    /* renamed from: g */
    int f57391g;

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.setOnce(this, subscription)) {
            if (subscription instanceof QueueSubscription) {
                QueueSubscription queueSubscription = (QueueSubscription) subscription;
                int requestFusion = queueSubscription.requestFusion(3);
                if (requestFusion == 1) {
                    this.f57391g = requestFusion;
                    this.f57388d = queueSubscription;
                    this.f57389e = true;
                    this.f57385a.innerComplete(this);
                    return;
                } else if (requestFusion == 2) {
                    this.f57391g = requestFusion;
                    this.f57388d = queueSubscription;
                    C15742i.m58997a(subscription, this.f57386b);
                    return;
                }
            }
            this.f57388d = C15742i.m58995a(this.f57386b);
            C15742i.m58997a(subscription, this.f57386b);
        }
    }

    public void onNext(T t) {
        if (this.f57391g == 0) {
            this.f57385a.innerNext(this, t);
        } else {
            this.f57385a.drain();
        }
    }

    public void onError(Throwable th) {
        this.f57385a.innerError(this, th);
    }

    public void onComplete() {
        this.f57385a.innerComplete(this);
    }

    public void request(long j) {
        if (this.f57391g != 1) {
            long j2 = this.f57390f + j;
            if (j2 >= ((long) this.f57387c)) {
                this.f57390f = 0;
                ((Subscription) get()).request(j2);
                return;
            }
            this.f57390f = j2;
        }
    }

    public void cancel() {
        SubscriptionHelper.cancel(this);
    }
}
