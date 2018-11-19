package io.reactivex.internal.operators.flowable;

import com.google.android.exoplayer2.Format;
import io.reactivex.C3957b;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.C15738e;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class FlowableTakeUntil<T, U> extends C18364a<T, T> {
    /* renamed from: c */
    final Publisher<? extends U> f58860c;

    static final class TakeUntilMainSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        private static final long serialVersionUID = -4945480365982832967L;
        /* renamed from: a */
        final Subscriber<? super T> f57053a;
        /* renamed from: b */
        final AtomicLong f57054b = new AtomicLong();
        /* renamed from: c */
        final AtomicReference<Subscription> f57055c = new AtomicReference();
        /* renamed from: d */
        final AtomicThrowable f57056d = new AtomicThrowable();
        /* renamed from: e */
        final OtherSubscriber f57057e = new OtherSubscriber(this);

        final class OtherSubscriber extends AtomicReference<Subscription> implements FlowableSubscriber<Object> {
            private static final long serialVersionUID = -3592821756711087922L;
            /* renamed from: a */
            final /* synthetic */ TakeUntilMainSubscriber f57052a;

            OtherSubscriber(TakeUntilMainSubscriber takeUntilMainSubscriber) {
                this.f57052a = takeUntilMainSubscriber;
            }

            public void onSubscribe(Subscription subscription) {
                if (SubscriptionHelper.setOnce(this, subscription)) {
                    subscription.request(Format.OFFSET_SAMPLE_RELATIVE);
                }
            }

            public void onNext(Object obj) {
                SubscriptionHelper.cancel(this);
                onComplete();
            }

            public void onError(Throwable th) {
                SubscriptionHelper.cancel(this.f57052a.f57055c);
                C15738e.m58982a(this.f57052a.f57053a, th, this.f57052a, this.f57052a.f57056d);
            }

            public void onComplete() {
                SubscriptionHelper.cancel(this.f57052a.f57055c);
                C15738e.m58983a(this.f57052a.f57053a, this.f57052a, this.f57052a.f57056d);
            }
        }

        TakeUntilMainSubscriber(Subscriber<? super T> subscriber) {
            this.f57053a = subscriber;
        }

        public void onSubscribe(Subscription subscription) {
            SubscriptionHelper.deferredSetOnce(this.f57055c, this.f57054b, subscription);
        }

        public void onNext(T t) {
            C15738e.m58981a(this.f57053a, (Object) t, (AtomicInteger) this, this.f57056d);
        }

        public void onError(Throwable th) {
            SubscriptionHelper.cancel(this.f57057e);
            C15738e.m58982a(this.f57053a, th, (AtomicInteger) this, this.f57056d);
        }

        public void onComplete() {
            SubscriptionHelper.cancel(this.f57057e);
            C15738e.m58983a(this.f57053a, (AtomicInteger) this, this.f57056d);
        }

        public void request(long j) {
            SubscriptionHelper.deferredRequest(this.f57055c, this.f57054b, j);
        }

        public void cancel() {
            SubscriptionHelper.cancel(this.f57055c);
            SubscriptionHelper.cancel(this.f57057e);
        }
    }

    public FlowableTakeUntil(C3957b<T> c3957b, Publisher<? extends U> publisher) {
        super(c3957b);
        this.f58860c = publisher;
    }

    /* renamed from: a */
    protected void m67600a(Subscriber<? super T> subscriber) {
        FlowableSubscriber takeUntilMainSubscriber = new TakeUntilMainSubscriber(subscriber);
        subscriber.onSubscribe(takeUntilMainSubscriber);
        this.f58860c.subscribe(takeUntilMainSubscriber.f57057e);
        this.a.a(takeUntilMainSubscriber);
    }
}
