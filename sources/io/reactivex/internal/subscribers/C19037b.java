package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.C15678a;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.p079d.C2667a;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* renamed from: io.reactivex.internal.subscribers.b */
public abstract class C19037b<T, R> implements FlowableSubscriber<T>, QueueSubscription<R> {
    /* renamed from: e */
    protected final Subscriber<? super R> f59097e;
    /* renamed from: f */
    protected Subscription f59098f;
    /* renamed from: g */
    protected QueueSubscription<T> f59099g;
    /* renamed from: h */
    protected boolean f59100h;
    /* renamed from: i */
    protected int f59101i;

    /* renamed from: a */
    protected boolean m67651a() {
        return true;
    }

    /* renamed from: b */
    protected void m67652b() {
    }

    public C19037b(Subscriber<? super R> subscriber) {
        this.f59097e = subscriber;
    }

    public final void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.f59098f, subscription)) {
            this.f59098f = subscription;
            if (subscription instanceof QueueSubscription) {
                this.f59099g = (QueueSubscription) subscription;
            }
            if (m67651a() != null) {
                this.f59097e.onSubscribe(this);
                m67652b();
            }
        }
    }

    public void onError(Throwable th) {
        if (this.f59100h) {
            C2667a.a(th);
            return;
        }
        this.f59100h = true;
        this.f59097e.onError(th);
    }

    /* renamed from: a */
    protected final void m67650a(Throwable th) {
        C15678a.m58850b(th);
        this.f59098f.cancel();
        onError(th);
    }

    public void onComplete() {
        if (!this.f59100h) {
            this.f59100h = true;
            this.f59097e.onComplete();
        }
    }

    /* renamed from: a */
    protected final int m67649a(int i) {
        QueueSubscription queueSubscription = this.f59099g;
        if (queueSubscription == null || (i & 4) != 0) {
            return 0;
        }
        i = queueSubscription.requestFusion(i);
        if (i != 0) {
            this.f59101i = i;
        }
        return i;
    }

    public void request(long j) {
        this.f59098f.request(j);
    }

    public void cancel() {
        this.f59098f.cancel();
    }

    public boolean isEmpty() {
        return this.f59099g.isEmpty();
    }

    public void clear() {
        this.f59099g.clear();
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final boolean offer(R r, R r2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
