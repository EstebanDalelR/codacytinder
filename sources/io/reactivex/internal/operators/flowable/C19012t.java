package io.reactivex.internal.operators.flowable;

import io.reactivex.C3957b;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* renamed from: io.reactivex.internal.operators.flowable.t */
public final class C19012t<T> extends C18364a<T, T> {
    /* renamed from: c */
    final Predicate<? super T> f58888c;

    /* renamed from: io.reactivex.internal.operators.flowable.t$a */
    static final class C18382a<T> implements FlowableSubscriber<T>, Subscription {
        /* renamed from: a */
        final Subscriber<? super T> f57134a;
        /* renamed from: b */
        final Predicate<? super T> f57135b;
        /* renamed from: c */
        Subscription f57136c;
        /* renamed from: d */
        boolean f57137d;

        C18382a(Subscriber<? super T> subscriber, Predicate<? super T> predicate) {
            this.f57134a = subscriber;
            this.f57135b = predicate;
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f57136c, subscription)) {
                this.f57136c = subscription;
                this.f57134a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            if (this.f57137d) {
                this.f57134a.onNext(t);
            } else {
                try {
                    if (this.f57135b.test(t)) {
                        this.f57136c.request(1);
                    } else {
                        this.f57137d = true;
                        this.f57134a.onNext(t);
                    }
                } catch (T t2) {
                    C15678a.m58850b(t2);
                    this.f57136c.cancel();
                    this.f57134a.onError(t2);
                }
            }
        }

        public void onError(Throwable th) {
            this.f57134a.onError(th);
        }

        public void onComplete() {
            this.f57134a.onComplete();
        }

        public void request(long j) {
            this.f57136c.request(j);
        }

        public void cancel() {
            this.f57136c.cancel();
        }
    }

    public C19012t(C3957b<T> c3957b, Predicate<? super T> predicate) {
        super(c3957b);
        this.f58888c = predicate;
    }

    /* renamed from: a */
    protected void m67614a(Subscriber<? super T> subscriber) {
        this.a.a(new C18382a(subscriber, this.f58888c));
    }
}
