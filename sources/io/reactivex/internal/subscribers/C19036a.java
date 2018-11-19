package io.reactivex.internal.subscribers;

import io.reactivex.exceptions.C15678a;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.p079d.C2667a;
import org.reactivestreams.Subscription;

/* renamed from: io.reactivex.internal.subscribers.a */
public abstract class C19036a<T, R> implements ConditionalSubscriber<T>, QueueSubscription<R> {
    /* renamed from: e */
    protected final ConditionalSubscriber<? super R> f59092e;
    /* renamed from: f */
    protected Subscription f59093f;
    /* renamed from: g */
    protected QueueSubscription<T> f59094g;
    /* renamed from: h */
    protected boolean f59095h;
    /* renamed from: i */
    protected int f59096i;

    /* renamed from: a */
    protected boolean m67647a() {
        return true;
    }

    /* renamed from: b */
    protected void m67648b() {
    }

    public C19036a(ConditionalSubscriber<? super R> conditionalSubscriber) {
        this.f59092e = conditionalSubscriber;
    }

    public final void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.f59093f, subscription)) {
            this.f59093f = subscription;
            if (subscription instanceof QueueSubscription) {
                this.f59094g = (QueueSubscription) subscription;
            }
            if (m67647a() != null) {
                this.f59092e.onSubscribe(this);
                m67648b();
            }
        }
    }

    public void onError(Throwable th) {
        if (this.f59095h) {
            C2667a.a(th);
            return;
        }
        this.f59095h = true;
        this.f59092e.onError(th);
    }

    /* renamed from: a */
    protected final void m67646a(Throwable th) {
        C15678a.m58850b(th);
        this.f59093f.cancel();
        onError(th);
    }

    public void onComplete() {
        if (!this.f59095h) {
            this.f59095h = true;
            this.f59092e.onComplete();
        }
    }

    /* renamed from: a */
    protected final int m67645a(int i) {
        QueueSubscription queueSubscription = this.f59094g;
        if (queueSubscription == null || (i & 4) != 0) {
            return 0;
        }
        i = queueSubscription.requestFusion(i);
        if (i != 0) {
            this.f59096i = i;
        }
        return i;
    }

    public void request(long j) {
        this.f59093f.request(j);
    }

    public void cancel() {
        this.f59093f.cancel();
    }

    public boolean isEmpty() {
        return this.f59094g.isEmpty();
    }

    public void clear() {
        this.f59094g.clear();
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final boolean offer(R r, R r2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
