package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.C15738e;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class StrictSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
    private static final long serialVersionUID = -4945028590049415624L;
    /* renamed from: a */
    final Subscriber<? super T> f57400a;
    /* renamed from: b */
    final AtomicThrowable f57401b = new AtomicThrowable();
    /* renamed from: c */
    final AtomicLong f57402c = new AtomicLong();
    /* renamed from: d */
    final AtomicReference<Subscription> f57403d = new AtomicReference();
    /* renamed from: e */
    final AtomicBoolean f57404e = new AtomicBoolean();
    /* renamed from: f */
    volatile boolean f57405f;

    public StrictSubscriber(Subscriber<? super T> subscriber) {
        this.f57400a = subscriber;
    }

    public void request(long j) {
        if (j <= 0) {
            cancel();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("§3.9 violated: positive request amount required but it was ");
            stringBuilder.append(j);
            onError(new IllegalArgumentException(stringBuilder.toString()));
            return;
        }
        SubscriptionHelper.deferredRequest(this.f57403d, this.f57402c, j);
    }

    public void cancel() {
        if (!this.f57405f) {
            SubscriptionHelper.cancel(this.f57403d);
        }
    }

    public void onSubscribe(Subscription subscription) {
        if (this.f57404e.compareAndSet(false, true)) {
            this.f57400a.onSubscribe(this);
            SubscriptionHelper.deferredSetOnce(this.f57403d, this.f57402c, subscription);
            return;
        }
        subscription.cancel();
        cancel();
        onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    public void onNext(T t) {
        C15738e.m58981a(this.f57400a, (Object) t, (AtomicInteger) this, this.f57401b);
    }

    public void onError(Throwable th) {
        this.f57405f = true;
        C15738e.m58982a(this.f57400a, th, (AtomicInteger) this, this.f57401b);
    }

    public void onComplete() {
        this.f57405f = true;
        C15738e.m58983a(this.f57400a, (AtomicInteger) this, this.f57401b);
    }
}
