package io.reactivex.internal.operators.flowable;

import com.google.android.exoplayer2.Format;
import io.reactivex.C3957b;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.subscribers.C18434b;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class FlowableWithLatestFrom<T, U, R> extends C18364a<T, R> {
    /* renamed from: c */
    final BiFunction<? super T, ? super U, ? extends R> f58870c;
    /* renamed from: d */
    final Publisher<? extends U> f58871d;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableWithLatestFrom$a */
    final class C18363a implements FlowableSubscriber<U> {
        /* renamed from: a */
        final /* synthetic */ FlowableWithLatestFrom f57069a;
        /* renamed from: b */
        private final WithLatestFromSubscriber<T, U, R> f57070b;

        public void onComplete() {
        }

        C18363a(FlowableWithLatestFrom flowableWithLatestFrom, WithLatestFromSubscriber<T, U, R> withLatestFromSubscriber) {
            this.f57069a = flowableWithLatestFrom;
            this.f57070b = withLatestFromSubscriber;
        }

        public void onSubscribe(Subscription subscription) {
            if (this.f57070b.m67604a(subscription)) {
                subscription.request(Format.OFFSET_SAMPLE_RELATIVE);
            }
        }

        public void onNext(U u) {
            this.f57070b.lazySet(u);
        }

        public void onError(Throwable th) {
            this.f57070b.m67603a(th);
        }
    }

    static final class WithLatestFromSubscriber<T, U, R> extends AtomicReference<U> implements ConditionalSubscriber<T>, Subscription {
        private static final long serialVersionUID = -312246233408980075L;
        /* renamed from: a */
        final Subscriber<? super R> f58865a;
        /* renamed from: b */
        final BiFunction<? super T, ? super U, ? extends R> f58866b;
        /* renamed from: c */
        final AtomicReference<Subscription> f58867c = new AtomicReference();
        /* renamed from: d */
        final AtomicLong f58868d = new AtomicLong();
        /* renamed from: e */
        final AtomicReference<Subscription> f58869e = new AtomicReference();

        WithLatestFromSubscriber(Subscriber<? super R> subscriber, BiFunction<? super T, ? super U, ? extends R> biFunction) {
            this.f58865a = subscriber;
            this.f58866b = biFunction;
        }

        public void onSubscribe(Subscription subscription) {
            SubscriptionHelper.deferredSetOnce(this.f58867c, this.f58868d, subscription);
        }

        public void onNext(T t) {
            if (tryOnNext(t) == null) {
                ((Subscription) this.f58867c.get()).request(1);
            }
        }

        public boolean tryOnNext(T t) {
            Object obj = get();
            if (obj == null) {
                return false;
            }
            try {
                this.f58865a.onNext(C15684a.m58895a(this.f58866b.apply(t, obj), "The combiner returned a null value"));
                return true;
            } catch (T t2) {
                C15678a.m58850b(t2);
                cancel();
                this.f58865a.onError(t2);
                return false;
            }
        }

        public void onError(Throwable th) {
            SubscriptionHelper.cancel(this.f58869e);
            this.f58865a.onError(th);
        }

        public void onComplete() {
            SubscriptionHelper.cancel(this.f58869e);
            this.f58865a.onComplete();
        }

        public void request(long j) {
            SubscriptionHelper.deferredRequest(this.f58867c, this.f58868d, j);
        }

        public void cancel() {
            SubscriptionHelper.cancel(this.f58867c);
            SubscriptionHelper.cancel(this.f58869e);
        }

        /* renamed from: a */
        public boolean m67604a(Subscription subscription) {
            return SubscriptionHelper.setOnce(this.f58869e, subscription);
        }

        /* renamed from: a */
        public void m67603a(Throwable th) {
            SubscriptionHelper.cancel(this.f58867c);
            this.f58865a.onError(th);
        }
    }

    public FlowableWithLatestFrom(C3957b<T> c3957b, BiFunction<? super T, ? super U, ? extends R> biFunction, Publisher<? extends U> publisher) {
        super(c3957b);
        this.f58870c = biFunction;
        this.f58871d = publisher;
    }

    /* renamed from: a */
    protected void m67605a(Subscriber<? super R> subscriber) {
        Object c18434b = new C18434b(subscriber);
        subscriber = new WithLatestFromSubscriber(c18434b, this.f58870c);
        c18434b.onSubscribe(subscriber);
        this.f58871d.subscribe(new C18363a(this, subscriber));
        this.a.a(subscriber);
    }
}
