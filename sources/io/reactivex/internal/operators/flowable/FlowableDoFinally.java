package io.reactivex.internal.operators.flowable;

import io.reactivex.C3957b;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Experimental;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Action;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.p079d.C2667a;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

@Experimental
public final class FlowableDoFinally<T> extends C18364a<T, T> {
    /* renamed from: c */
    final Action f58813c;

    static final class DoFinallyConditionalSubscriber<T> extends BasicIntQueueSubscription<T> implements ConditionalSubscriber<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        /* renamed from: a */
        final ConditionalSubscriber<? super T> f59446a;
        /* renamed from: b */
        final Action f59447b;
        /* renamed from: c */
        Subscription f59448c;
        /* renamed from: d */
        QueueSubscription<T> f59449d;
        /* renamed from: e */
        boolean f59450e;

        DoFinallyConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, Action action) {
            this.f59446a = conditionalSubscriber;
            this.f59447b = action;
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f59448c, subscription)) {
                this.f59448c = subscription;
                if (subscription instanceof QueueSubscription) {
                    this.f59449d = (QueueSubscription) subscription;
                }
                this.f59446a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            this.f59446a.onNext(t);
        }

        public boolean tryOnNext(T t) {
            return this.f59446a.tryOnNext(t);
        }

        public void onError(Throwable th) {
            this.f59446a.onError(th);
            m68191a();
        }

        public void onComplete() {
            this.f59446a.onComplete();
            m68191a();
        }

        public void cancel() {
            this.f59448c.cancel();
            m68191a();
        }

        public void request(long j) {
            this.f59448c.request(j);
        }

        public int requestFusion(int i) {
            QueueSubscription queueSubscription = this.f59449d;
            if (queueSubscription == null || (i & 4) != 0) {
                return 0;
            }
            i = queueSubscription.requestFusion(i);
            if (i != 0) {
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                this.f59450e = z;
            }
            return i;
        }

        public void clear() {
            this.f59449d.clear();
        }

        public boolean isEmpty() {
            return this.f59449d.isEmpty();
        }

        @Nullable
        public T poll() throws Exception {
            T poll = this.f59449d.poll();
            if (poll == null && this.f59450e) {
                m68191a();
            }
            return poll;
        }

        /* renamed from: a */
        void m68191a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f59447b.run();
                } catch (Throwable th) {
                    C15678a.m58850b(th);
                    C2667a.a(th);
                }
            }
        }
    }

    static final class DoFinallySubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        /* renamed from: a */
        final Subscriber<? super T> f59451a;
        /* renamed from: b */
        final Action f59452b;
        /* renamed from: c */
        Subscription f59453c;
        /* renamed from: d */
        QueueSubscription<T> f59454d;
        /* renamed from: e */
        boolean f59455e;

        DoFinallySubscriber(Subscriber<? super T> subscriber, Action action) {
            this.f59451a = subscriber;
            this.f59452b = action;
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f59453c, subscription)) {
                this.f59453c = subscription;
                if (subscription instanceof QueueSubscription) {
                    this.f59454d = (QueueSubscription) subscription;
                }
                this.f59451a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            this.f59451a.onNext(t);
        }

        public void onError(Throwable th) {
            this.f59451a.onError(th);
            m68192a();
        }

        public void onComplete() {
            this.f59451a.onComplete();
            m68192a();
        }

        public void cancel() {
            this.f59453c.cancel();
            m68192a();
        }

        public void request(long j) {
            this.f59453c.request(j);
        }

        public int requestFusion(int i) {
            QueueSubscription queueSubscription = this.f59454d;
            if (queueSubscription == null || (i & 4) != 0) {
                return 0;
            }
            i = queueSubscription.requestFusion(i);
            if (i != 0) {
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                this.f59455e = z;
            }
            return i;
        }

        public void clear() {
            this.f59454d.clear();
        }

        public boolean isEmpty() {
            return this.f59454d.isEmpty();
        }

        @Nullable
        public T poll() throws Exception {
            T poll = this.f59454d.poll();
            if (poll == null && this.f59455e) {
                m68192a();
            }
            return poll;
        }

        /* renamed from: a */
        void m68192a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f59452b.run();
                } catch (Throwable th) {
                    C15678a.m58850b(th);
                    C2667a.a(th);
                }
            }
        }
    }

    public FlowableDoFinally(C3957b<T> c3957b, Action action) {
        super(c3957b);
        this.f58813c = action;
    }

    /* renamed from: a */
    protected void m67572a(Subscriber<? super T> subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            this.a.a(new DoFinallyConditionalSubscriber((ConditionalSubscriber) subscriber, this.f58813c));
        } else {
            this.a.a(new DoFinallySubscriber(subscriber, this.f58813c));
        }
    }
}
