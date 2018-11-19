package io.reactivex.internal.operators.flowable;

import com.google.android.exoplayer2.Format;
import io.reactivex.C3957b;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.C15678a;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Collection;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class FlowableToList<T, U extends Collection<? super T>> extends C18364a<T, U> {
    /* renamed from: c */
    final Callable<U> f58864c;

    static final class ToListSubscriber<T, U extends Collection<? super T>> extends DeferredScalarSubscription<U> implements FlowableSubscriber<T>, Subscription {
        private static final long serialVersionUID = -8134157938864266736L;
        /* renamed from: a */
        Subscription f59914a;

        ToListSubscriber(Subscriber<? super U> subscriber, U u) {
            super(subscriber);
            this.h = u;
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f59914a, subscription)) {
                this.f59914a = subscription;
                this.g.onSubscribe(this);
                subscription.request(Format.OFFSET_SAMPLE_RELATIVE);
            }
        }

        public void onNext(T t) {
            Collection collection = (Collection) this.h;
            if (collection != null) {
                collection.add(t);
            }
        }

        public void onError(Throwable th) {
            this.h = null;
            this.g.onError(th);
        }

        public void onComplete() {
            m68249a(this.h);
        }

        public void cancel() {
            super.cancel();
            this.f59914a.cancel();
        }
    }

    public FlowableToList(C3957b<T> c3957b, Callable<U> callable) {
        super(c3957b);
        this.f58864c = callable;
    }

    /* renamed from: a */
    protected void m67602a(Subscriber<? super U> subscriber) {
        try {
            this.a.a(new ToListSubscriber(subscriber, (Collection) C15684a.m58895a(this.f58864c.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C15678a.m58850b(th);
            EmptySubscription.error(th, subscriber);
        }
    }
}
