package io.reactivex.internal.operators.flowable;

import com.google.android.exoplayer2.Format;
import io.reactivex.C3957b;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.C15735a;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;

public final class FlowableRange extends C3957b<Integer> {
    /* renamed from: a */
    final int f56991a;
    /* renamed from: c */
    final int f56992c;

    static abstract class BaseRangeSubscription extends BasicQueueSubscription<Integer> {
        private static final long serialVersionUID = -2252972430506210021L;
        /* renamed from: a */
        final int f59490a;
        /* renamed from: b */
        int f59491b;
        /* renamed from: c */
        volatile boolean f59492c;

        /* renamed from: a */
        abstract void mo14280a(long j);

        /* renamed from: b */
        abstract void mo14281b();

        public final int requestFusion(int i) {
            return i & 1;
        }

        @Nullable
        public /* synthetic */ Object poll() throws Exception {
            return m68204a();
        }

        BaseRangeSubscription(int i, int i2) {
            this.f59491b = i;
            this.f59490a = i2;
        }

        @Nullable
        /* renamed from: a */
        public final Integer m68204a() {
            int i = this.f59491b;
            if (i == this.f59490a) {
                return null;
            }
            this.f59491b = i + 1;
            return Integer.valueOf(i);
        }

        public final boolean isEmpty() {
            return this.f59491b == this.f59490a;
        }

        public final void clear() {
            this.f59491b = this.f59490a;
        }

        public final void request(long j) {
            if (!SubscriptionHelper.validate(j) || C15735a.m58967a((AtomicLong) this, j) != 0) {
                return;
            }
            if (j == Format.OFFSET_SAMPLE_RELATIVE) {
                mo14281b();
            } else {
                mo14280a(j);
            }
        }

        public final void cancel() {
            this.f59492c = true;
        }
    }

    static final class RangeConditionalSubscription extends BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        /* renamed from: d */
        final ConditionalSubscriber<? super Integer> f59909d;

        RangeConditionalSubscription(ConditionalSubscriber<? super Integer> conditionalSubscriber, int i, int i2) {
            super(i, i2);
            this.f59909d = conditionalSubscriber;
        }

        /* renamed from: b */
        void mo14281b() {
            int i = this.a;
            ConditionalSubscriber conditionalSubscriber = this.f59909d;
            int i2 = this.b;
            while (i2 != i) {
                if (!this.c) {
                    conditionalSubscriber.tryOnNext(Integer.valueOf(i2));
                    i2++;
                } else {
                    return;
                }
            }
            if (!this.c) {
                conditionalSubscriber.onComplete();
            }
        }

        /* renamed from: a */
        void mo14280a(long j) {
            int i = this.a;
            int i2 = this.b;
            ConditionalSubscriber conditionalSubscriber = this.f59909d;
            long j2 = j;
            loop0:
            do {
                j = 0;
                while (true) {
                    if (j == j2 || i2 == i) {
                        if (i2 == i) {
                            break loop0;
                        }
                        j2 = get();
                        if (j == j2) {
                            this.b = i2;
                            j2 = addAndGet(-j);
                        }
                    } else if (!this.c) {
                        if (conditionalSubscriber.tryOnNext(Integer.valueOf(i2))) {
                            j++;
                        }
                        i2++;
                    } else {
                        return;
                    }
                }
                if (this.c == null) {
                    conditionalSubscriber.onComplete();
                }
                return;
            } while (j2 != 0);
        }
    }

    static final class RangeSubscription extends BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        /* renamed from: d */
        final Subscriber<? super Integer> f59910d;

        RangeSubscription(Subscriber<? super Integer> subscriber, int i, int i2) {
            super(i, i2);
            this.f59910d = subscriber;
        }

        /* renamed from: b */
        void mo14281b() {
            int i = this.a;
            Subscriber subscriber = this.f59910d;
            int i2 = this.b;
            while (i2 != i) {
                if (!this.c) {
                    subscriber.onNext(Integer.valueOf(i2));
                    i2++;
                } else {
                    return;
                }
            }
            if (!this.c) {
                subscriber.onComplete();
            }
        }

        /* renamed from: a */
        void mo14280a(long j) {
            int i = this.a;
            int i2 = this.b;
            Subscriber subscriber = this.f59910d;
            long j2 = j;
            loop0:
            do {
                j = 0;
                while (true) {
                    if (j == j2 || i2 == i) {
                        if (i2 == i) {
                            break loop0;
                        }
                        j2 = get();
                        if (j == j2) {
                            this.b = i2;
                            j2 = addAndGet(-j);
                        }
                    } else if (!this.c) {
                        subscriber.onNext(Integer.valueOf(i2));
                        i2++;
                        j++;
                    } else {
                        return;
                    }
                }
                if (this.c == null) {
                    subscriber.onComplete();
                }
                return;
            } while (j2 != 0);
        }
    }

    public FlowableRange(int i, int i2) {
        this.f56991a = i;
        this.f56992c = i + i2;
    }

    /* renamed from: a */
    public void m66456a(Subscriber<? super Integer> subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            subscriber.onSubscribe(new RangeConditionalSubscription((ConditionalSubscriber) subscriber, this.f56991a, this.f56992c));
        } else {
            subscriber.onSubscribe(new RangeSubscription(subscriber, this.f56991a, this.f56992c));
        }
    }
}
