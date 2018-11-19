package io.reactivex.internal.operators.flowable;

import com.google.android.exoplayer2.Format;
import io.reactivex.C3957b;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.C15735a;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;

public final class FlowableFromArray<T> extends C3957b<T> {
    /* renamed from: a */
    final T[] f56966a;

    static abstract class BaseArraySubscription<T> extends BasicQueueSubscription<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        /* renamed from: b */
        final T[] f59464b;
        /* renamed from: c */
        int f59465c;
        /* renamed from: d */
        volatile boolean f59466d;

        /* renamed from: a */
        abstract void mo14275a();

        /* renamed from: a */
        abstract void mo14276a(long j);

        public final int requestFusion(int i) {
            return i & 1;
        }

        BaseArraySubscription(T[] tArr) {
            this.f59464b = tArr;
        }

        @Nullable
        public final T poll() {
            int i = this.f59465c;
            Object[] objArr = this.f59464b;
            if (i == objArr.length) {
                return null;
            }
            this.f59465c = i + 1;
            return C15684a.m58895a(objArr[i], "array element is null");
        }

        public final boolean isEmpty() {
            return this.f59465c == this.f59464b.length;
        }

        public final void clear() {
            this.f59465c = this.f59464b.length;
        }

        public final void request(long j) {
            if (!SubscriptionHelper.validate(j) || C15735a.m58967a((AtomicLong) this, j) != 0) {
                return;
            }
            if (j == Format.OFFSET_SAMPLE_RELATIVE) {
                mo14275a();
            } else {
                mo14276a(j);
            }
        }

        public final void cancel() {
            this.f59466d = true;
        }
    }

    static final class ArrayConditionalSubscription<T> extends BaseArraySubscription<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        /* renamed from: a */
        final ConditionalSubscriber<? super T> f59904a;

        ArrayConditionalSubscription(ConditionalSubscriber<? super T> conditionalSubscriber, T[] tArr) {
            super(tArr);
            this.f59904a = conditionalSubscriber;
        }

        /* renamed from: a */
        void mo14275a() {
            Object[] objArr = this.b;
            int length = objArr.length;
            ConditionalSubscriber conditionalSubscriber = this.f59904a;
            int i = this.c;
            while (i != length) {
                if (!this.d) {
                    Object obj = objArr[i];
                    if (obj == null) {
                        conditionalSubscriber.onError(new NullPointerException("array element is null"));
                        return;
                    } else {
                        conditionalSubscriber.tryOnNext(obj);
                        i++;
                    }
                } else {
                    return;
                }
            }
            if (!this.d) {
                conditionalSubscriber.onComplete();
            }
        }

        /* renamed from: a */
        void mo14276a(long j) {
            Object[] objArr = this.b;
            int length = objArr.length;
            int i = this.c;
            ConditionalSubscriber conditionalSubscriber = this.f59904a;
            long j2 = j;
            loop0:
            do {
                j = 0;
                while (true) {
                    if (j == j2 || i == length) {
                        if (i == length) {
                            break loop0;
                        }
                        j2 = get();
                        if (j == j2) {
                            this.c = i;
                            j2 = addAndGet(-j);
                        }
                    } else if (!this.d) {
                        Object obj = objArr[i];
                        if (obj == null) {
                            conditionalSubscriber.onError(new NullPointerException("array element is null"));
                            return;
                        }
                        if (conditionalSubscriber.tryOnNext(obj)) {
                            j++;
                        }
                        i++;
                    } else {
                        return;
                    }
                }
                if (this.d == null) {
                    conditionalSubscriber.onComplete();
                }
                return;
            } while (j2 != 0);
        }
    }

    static final class ArraySubscription<T> extends BaseArraySubscription<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        /* renamed from: a */
        final Subscriber<? super T> f59905a;

        ArraySubscription(Subscriber<? super T> subscriber, T[] tArr) {
            super(tArr);
            this.f59905a = subscriber;
        }

        /* renamed from: a */
        void mo14275a() {
            Object[] objArr = this.b;
            int length = objArr.length;
            Subscriber subscriber = this.f59905a;
            int i = this.c;
            while (i != length) {
                if (!this.d) {
                    Object obj = objArr[i];
                    if (obj == null) {
                        subscriber.onError(new NullPointerException("array element is null"));
                        return;
                    } else {
                        subscriber.onNext(obj);
                        i++;
                    }
                } else {
                    return;
                }
            }
            if (!this.d) {
                subscriber.onComplete();
            }
        }

        /* renamed from: a */
        void mo14276a(long j) {
            Object[] objArr = this.b;
            int length = objArr.length;
            int i = this.c;
            Subscriber subscriber = this.f59905a;
            long j2 = j;
            loop0:
            do {
                j = 0;
                while (true) {
                    if (j == j2 || i == length) {
                        if (i == length) {
                            break loop0;
                        }
                        j2 = get();
                        if (j == j2) {
                            this.c = i;
                            j2 = addAndGet(-j);
                        }
                    } else if (!this.d) {
                        Object obj = objArr[i];
                        if (obj == null) {
                            subscriber.onError(new NullPointerException("array element is null"));
                            return;
                        }
                        subscriber.onNext(obj);
                        i++;
                        j++;
                    } else {
                        return;
                    }
                }
                if (this.d == null) {
                    subscriber.onComplete();
                }
                return;
            } while (j2 != 0);
        }
    }

    public FlowableFromArray(T[] tArr) {
        this.f56966a = tArr;
    }

    /* renamed from: a */
    public void m66449a(Subscriber<? super T> subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            subscriber.onSubscribe(new ArrayConditionalSubscription((ConditionalSubscriber) subscriber, this.f56966a));
        } else {
            subscriber.onSubscribe(new ArraySubscription(subscriber, this.f56966a));
        }
    }
}
