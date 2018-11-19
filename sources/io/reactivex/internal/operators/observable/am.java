package io.reactivex.internal.operators.observable;

import com.google.android.exoplayer2.Format;
import io.reactivex.C3959e;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

public final class am<T> extends C3959e<T> {
    /* renamed from: a */
    final Publisher<? extends T> f57246a;

    /* renamed from: io.reactivex.internal.operators.observable.am$a */
    static final class C18395a<T> implements FlowableSubscriber<T>, Disposable {
        /* renamed from: a */
        final Observer<? super T> f57244a;
        /* renamed from: b */
        Subscription f57245b;

        C18395a(Observer<? super T> observer) {
            this.f57244a = observer;
        }

        public void onComplete() {
            this.f57244a.onComplete();
        }

        public void onError(Throwable th) {
            this.f57244a.onError(th);
        }

        public void onNext(T t) {
            this.f57244a.onNext(t);
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f57245b, subscription)) {
                this.f57245b = subscription;
                this.f57244a.onSubscribe(this);
                subscription.request(Format.OFFSET_SAMPLE_RELATIVE);
            }
        }

        public void dispose() {
            this.f57245b.cancel();
            this.f57245b = SubscriptionHelper.CANCELLED;
        }

        public boolean isDisposed() {
            return this.f57245b == SubscriptionHelper.CANCELLED;
        }
    }

    public am(Publisher<? extends T> publisher) {
        this.f57246a = publisher;
    }

    protected void subscribeActual(Observer<? super T> observer) {
        this.f57246a.subscribe(new C18395a(observer));
    }
}
