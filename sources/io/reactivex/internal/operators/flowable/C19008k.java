package io.reactivex.internal.operators.flowable;

import io.reactivex.C3957b;
import io.reactivex.annotations.Nullable;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscribers.C19036a;
import io.reactivex.internal.subscribers.C19037b;
import org.reactivestreams.Subscriber;

/* renamed from: io.reactivex.internal.operators.flowable.k */
public final class C19008k<T> extends C18364a<T, T> {
    /* renamed from: c */
    final Predicate<? super T> f58885c;

    /* renamed from: io.reactivex.internal.operators.flowable.k$a */
    static final class C19179a<T> extends C19036a<T, T> {
        /* renamed from: a */
        final Predicate<? super T> f59509a;

        C19179a(ConditionalSubscriber<? super T> conditionalSubscriber, Predicate<? super T> predicate) {
            super(conditionalSubscriber);
            this.f59509a = predicate;
        }

        public void onNext(T t) {
            if (tryOnNext(t) == null) {
                this.f.request(1);
            }
        }

        public boolean tryOnNext(T t) {
            if (this.h) {
                return false;
            }
            if (this.i != 0) {
                return this.e.tryOnNext(null);
            }
            boolean z = true;
            try {
                if (!this.f59509a.test(t) || this.e.tryOnNext(t) == null) {
                    z = false;
                }
                return z;
            } catch (T t2) {
                m67646a((Throwable) t2);
                return true;
            }
        }

        public int requestFusion(int i) {
            return m67645a(i);
        }

        @Nullable
        public T poll() throws Exception {
            QueueSubscription queueSubscription = this.g;
            Predicate predicate = this.f59509a;
            while (true) {
                T poll = queueSubscription.poll();
                if (poll == null) {
                    return null;
                }
                if (predicate.test(poll)) {
                    return poll;
                }
                if (this.i == 2) {
                    queueSubscription.request(1);
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.k$b */
    static final class C19180b<T> extends C19037b<T, T> implements ConditionalSubscriber<T> {
        /* renamed from: a */
        final Predicate<? super T> f59510a;

        C19180b(Subscriber<? super T> subscriber, Predicate<? super T> predicate) {
            super(subscriber);
            this.f59510a = predicate;
        }

        public void onNext(T t) {
            if (tryOnNext(t) == null) {
                this.f.request(1);
            }
        }

        public boolean tryOnNext(T t) {
            if (this.h) {
                return null;
            }
            if (this.i != 0) {
                this.e.onNext(null);
                return true;
            }
            try {
                boolean test = this.f59510a.test(t);
                if (test) {
                    this.e.onNext(t);
                }
                return test;
            } catch (T t2) {
                m67650a((Throwable) t2);
                return true;
            }
        }

        public int requestFusion(int i) {
            return m67649a(i);
        }

        @Nullable
        public T poll() throws Exception {
            QueueSubscription queueSubscription = this.g;
            Predicate predicate = this.f59510a;
            while (true) {
                T poll = queueSubscription.poll();
                if (poll == null) {
                    return null;
                }
                if (predicate.test(poll)) {
                    return poll;
                }
                if (this.i == 2) {
                    queueSubscription.request(1);
                }
            }
        }
    }

    public C19008k(C3957b<T> c3957b, Predicate<? super T> predicate) {
        super(c3957b);
        this.f58885c = predicate;
    }

    /* renamed from: a */
    protected void m67610a(Subscriber<? super T> subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            this.a.a(new C19179a((ConditionalSubscriber) subscriber, this.f58885c));
        } else {
            this.a.a(new C19180b(subscriber, this.f58885c));
        }
    }
}
