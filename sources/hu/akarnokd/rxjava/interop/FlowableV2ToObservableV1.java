package hu.akarnokd.rxjava.interop;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import rx.C19571c;
import rx.Observable.OnSubscribe;
import rx.Producer;

final class FlowableV2ToObservableV1<T> implements OnSubscribe<T> {
    /* renamed from: a */
    final Publisher<T> f59428a;

    static final class SourceSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Producer, rx.Subscription {
        private static final long serialVersionUID = -6567012932544037069L;
        /* renamed from: a */
        final C19571c<? super T> f56784a;
        /* renamed from: b */
        final AtomicLong f56785b = new AtomicLong();

        SourceSubscriber(C19571c<? super T> c19571c) {
            this.f56784a = c19571c;
        }

        public void request(long j) {
            if (j != 0) {
                SubscriptionHelper.deferredRequest(this, this.f56785b, j);
            }
        }

        public void unsubscribe() {
            SubscriptionHelper.cancel(this);
        }

        public boolean isUnsubscribed() {
            return SubscriptionHelper.isCancelled((Subscription) get());
        }

        public void onSubscribe(Subscription subscription) {
            SubscriptionHelper.deferredSetOnce(this, this.f56785b, subscription);
        }

        public void onNext(T t) {
            this.f56784a.onNext(t);
        }

        public void onError(Throwable th) {
            this.f56784a.onError(th);
        }

        public void onComplete() {
            this.f56784a.onCompleted();
        }
    }

    public /* synthetic */ void call(Object obj) {
        m68174a((C19571c) obj);
    }

    FlowableV2ToObservableV1(Publisher<T> publisher) {
        this.f59428a = publisher;
    }

    /* renamed from: a */
    public void m68174a(C19571c<? super T> c19571c) {
        Subscriber sourceSubscriber = new SourceSubscriber(c19571c);
        c19571c.add(sourceSubscriber);
        c19571c.setProducer(sourceSubscriber);
        this.f59428a.subscribe(sourceSubscriber);
    }
}
