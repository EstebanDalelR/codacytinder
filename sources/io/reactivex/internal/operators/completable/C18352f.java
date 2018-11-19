package io.reactivex.internal.operators.completable;

import com.google.android.exoplayer2.Format;
import io.reactivex.C3956a;
import io.reactivex.CompletableObserver;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* renamed from: io.reactivex.internal.operators.completable.f */
public final class C18352f<T> extends C3956a {
    /* renamed from: a */
    final Publisher<T> f56828a;

    /* renamed from: io.reactivex.internal.operators.completable.f$a */
    static final class C18351a<T> implements FlowableSubscriber<T>, Disposable {
        /* renamed from: a */
        final CompletableObserver f56826a;
        /* renamed from: b */
        Subscription f56827b;

        public void onNext(T t) {
        }

        C18351a(CompletableObserver completableObserver) {
            this.f56826a = completableObserver;
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f56827b, subscription)) {
                this.f56827b = subscription;
                this.f56826a.onSubscribe(this);
                subscription.request(Format.OFFSET_SAMPLE_RELATIVE);
            }
        }

        public void onError(Throwable th) {
            this.f56826a.onError(th);
        }

        public void onComplete() {
            this.f56826a.onComplete();
        }

        public void dispose() {
            this.f56827b.cancel();
            this.f56827b = SubscriptionHelper.CANCELLED;
        }

        public boolean isDisposed() {
            return this.f56827b == SubscriptionHelper.CANCELLED;
        }
    }

    public C18352f(Publisher<T> publisher) {
        this.f56828a = publisher;
    }

    /* renamed from: a */
    protected void m66394a(CompletableObserver completableObserver) {
        this.f56828a.subscribe(new C18351a(completableObserver));
    }
}
