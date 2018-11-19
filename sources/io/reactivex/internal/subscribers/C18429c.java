package io.reactivex.internal.subscribers;

import com.google.android.exoplayer2.Format;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.C15736b;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;
import org.reactivestreams.Subscription;

/* renamed from: io.reactivex.internal.subscribers.c */
public abstract class C18429c<T> extends CountDownLatch implements FlowableSubscriber<T> {
    /* renamed from: a */
    T f57406a;
    /* renamed from: b */
    Throwable f57407b;
    /* renamed from: c */
    Subscription f57408c;
    /* renamed from: d */
    volatile boolean f57409d;

    public C18429c() {
        super(1);
    }

    public final void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.f57408c, subscription)) {
            this.f57408c = subscription;
            if (!this.f57409d) {
                subscription.request(Format.OFFSET_SAMPLE_RELATIVE);
                if (this.f57409d) {
                    this.f57408c = SubscriptionHelper.CANCELLED;
                    subscription.cancel();
                }
            }
        }
    }

    public final void onComplete() {
        countDown();
    }

    /* renamed from: a */
    public final T m66598a() {
        if (getCount() != 0) {
            try {
                C15736b.m58971a();
                await();
            } catch (Throwable e) {
                Subscription subscription = this.f57408c;
                this.f57408c = SubscriptionHelper.CANCELLED;
                if (subscription != null) {
                    subscription.cancel();
                }
                throw ExceptionHelper.m58962a(e);
            }
        }
        Throwable e2 = this.f57407b;
        if (e2 == null) {
            return this.f57406a;
        }
        throw ExceptionHelper.m58962a(e2);
    }
}
