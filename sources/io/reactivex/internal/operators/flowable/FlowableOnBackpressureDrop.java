package io.reactivex.internal.operators.flowable;

import com.google.android.exoplayer2.Format;
import io.reactivex.C3957b;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.C15735a;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class FlowableOnBackpressureDrop<T> extends C18364a<T, T> implements Consumer<T> {
    /* renamed from: c */
    final Consumer<? super T> f58837c = this;

    static final class BackpressureDropSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, Subscription {
        private static final long serialVersionUID = -6246093802440953054L;
        /* renamed from: a */
        final Subscriber<? super T> f56967a;
        /* renamed from: b */
        final Consumer<? super T> f56968b;
        /* renamed from: c */
        Subscription f56969c;
        /* renamed from: d */
        boolean f56970d;

        BackpressureDropSubscriber(Subscriber<? super T> subscriber, Consumer<? super T> consumer) {
            this.f56967a = subscriber;
            this.f56968b = consumer;
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f56969c, subscription)) {
                this.f56969c = subscription;
                this.f56967a.onSubscribe(this);
                subscription.request(Format.OFFSET_SAMPLE_RELATIVE);
            }
        }

        public void onNext(T t) {
            if (!this.f56970d) {
                if (get() != 0) {
                    this.f56967a.onNext(t);
                    C15735a.m58969c(this, 1);
                } else {
                    try {
                        this.f56968b.accept(t);
                    } catch (T t2) {
                        C15678a.m58850b(t2);
                        cancel();
                        onError(t2);
                    }
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f56970d) {
                C2667a.a(th);
                return;
            }
            this.f56970d = true;
            this.f56967a.onError(th);
        }

        public void onComplete() {
            if (!this.f56970d) {
                this.f56970d = true;
                this.f56967a.onComplete();
            }
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C15735a.m58967a((AtomicLong) this, j);
            }
        }

        public void cancel() {
            this.f56969c.cancel();
        }
    }

    public void accept(T t) {
    }

    public FlowableOnBackpressureDrop(C3957b<T> c3957b) {
        super(c3957b);
    }

    /* renamed from: a */
    protected void m67581a(Subscriber<? super T> subscriber) {
        this.a.a(new BackpressureDropSubscriber(subscriber, this.f58837c));
    }
}
