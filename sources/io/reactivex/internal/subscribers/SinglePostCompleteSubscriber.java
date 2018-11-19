package io.reactivex.internal.subscribers;

import com.google.android.exoplayer2.Format;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.C15735a;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public abstract class SinglePostCompleteSubscriber<T, R> extends AtomicLong implements FlowableSubscriber<T>, Subscription {
    private static final long serialVersionUID = 7917814472626990048L;
    /* renamed from: b */
    protected final Subscriber<? super R> f57396b;
    /* renamed from: c */
    protected Subscription f57397c;
    /* renamed from: d */
    protected R f57398d;
    /* renamed from: e */
    protected long f57399e;

    /* renamed from: b */
    protected void m66597b(R r) {
    }

    public SinglePostCompleteSubscriber(Subscriber<? super R> subscriber) {
        this.f57396b = subscriber;
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.f57397c, subscription)) {
            this.f57397c = subscription;
            this.f57396b.onSubscribe(this);
        }
    }

    /* renamed from: a */
    protected final void m66596a(R r) {
        long j = this.f57399e;
        if (j != 0) {
            C15735a.m58969c(this, j);
        }
        while (true) {
            j = get();
            if ((j & Long.MIN_VALUE) != 0) {
                m66597b(r);
                return;
            } else if ((j & Format.OFFSET_SAMPLE_RELATIVE) != 0) {
                lazySet(-9223372036854775807L);
                this.f57396b.onNext(r);
                this.f57396b.onComplete();
                return;
            } else {
                this.f57398d = r;
                if (!compareAndSet(0, Long.MIN_VALUE)) {
                    this.f57398d = null;
                } else {
                    return;
                }
            }
        }
    }

    public final void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            long j2;
            do {
                j2 = get();
                if ((j2 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, -9223372036854775807L) != null) {
                        this.f57396b.onNext(this.f57398d);
                        this.f57396b.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j2, C15735a.m58966a(j2, j)));
            this.f57397c.request(j);
        }
    }

    public void cancel() {
        this.f57397c.cancel();
    }
}
