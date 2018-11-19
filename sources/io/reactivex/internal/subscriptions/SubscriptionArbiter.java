package io.reactivex.internal.subscriptions;

import com.google.android.exoplayer2.Format;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.util.C15735a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

public class SubscriptionArbiter extends AtomicInteger implements Subscription {
    private static final long serialVersionUID = -2189523197179400958L;
    /* renamed from: h */
    Subscription f54135h;
    /* renamed from: i */
    long f54136i;
    /* renamed from: j */
    final AtomicReference<Subscription> f54137j = new AtomicReference();
    /* renamed from: k */
    final AtomicLong f54138k = new AtomicLong();
    /* renamed from: l */
    final AtomicLong f54139l = new AtomicLong();
    /* renamed from: m */
    volatile boolean f54140m;
    /* renamed from: n */
    protected boolean f54141n;

    /* renamed from: a */
    public final void m63749a(Subscription subscription) {
        if (this.f54140m) {
            subscription.cancel();
            return;
        }
        C15684a.m58895a((Object) subscription, "s is null");
        if (get() == 0 && compareAndSet(0, 1)) {
            Subscription subscription2 = this.f54135h;
            if (subscription2 != null) {
                subscription2.cancel();
            }
            this.f54135h = subscription;
            long j = this.f54136i;
            if (decrementAndGet() != 0) {
                m63750b();
            }
            if (j != 0) {
                subscription.request(j);
            }
            return;
        }
        subscription = (Subscription) this.f54137j.getAndSet(subscription);
        if (subscription != null) {
            subscription.cancel();
        }
        m63747a();
    }

    public final void request(long j) {
        if (SubscriptionHelper.validate(j) && !this.f54141n) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j2 = this.f54136i;
                if (j2 != Format.OFFSET_SAMPLE_RELATIVE) {
                    j2 = C15735a.m58966a(j2, j);
                    this.f54136i = j2;
                    if (j2 == Format.OFFSET_SAMPLE_RELATIVE) {
                        this.f54141n = true;
                    }
                }
                Subscription subscription = this.f54135h;
                if (decrementAndGet() != 0) {
                    m63750b();
                }
                if (subscription != null) {
                    subscription.request(j);
                }
                return;
            }
            C15735a.m58967a(this.f54138k, j);
            m63747a();
        }
    }

    /* renamed from: a */
    public final void m63748a(long j) {
        if (!this.f54141n) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j2 = this.f54136i;
                if (j2 != Format.OFFSET_SAMPLE_RELATIVE) {
                    long j3 = j2 - j;
                    j = 0;
                    if (j3 < 0) {
                        SubscriptionHelper.reportMoreProduced(j3);
                    } else {
                        j = j3;
                    }
                    this.f54136i = j;
                }
                if (decrementAndGet() != null) {
                    m63750b();
                    return;
                }
                return;
            }
            C15735a.m58967a(this.f54139l, j);
            m63747a();
        }
    }

    public void cancel() {
        if (!this.f54140m) {
            this.f54140m = true;
            m63747a();
        }
    }

    /* renamed from: a */
    final void m63747a() {
        if (getAndIncrement() == 0) {
            m63750b();
        }
    }

    /* renamed from: b */
    final void m63750b() {
        SubscriptionArbiter subscriptionArbiter = this;
        Subscription subscription = null;
        long j = 0;
        int i = 1;
        do {
            int i2;
            Subscription subscription2;
            Subscription subscription3 = (Subscription) subscriptionArbiter.f54137j.get();
            if (subscription3 != null) {
                subscription3 = (Subscription) subscriptionArbiter.f54137j.getAndSet(null);
            }
            long j2 = subscriptionArbiter.f54138k.get();
            if (j2 != 0) {
                j2 = subscriptionArbiter.f54138k.getAndSet(0);
            }
            long j3 = subscriptionArbiter.f54139l.get();
            if (j3 != 0) {
                j3 = subscriptionArbiter.f54139l.getAndSet(0);
            }
            Subscription subscription4 = subscriptionArbiter.f54135h;
            if (subscriptionArbiter.f54140m) {
                if (subscription4 != null) {
                    subscription4.cancel();
                    subscriptionArbiter.f54135h = null;
                }
                if (subscription3 != null) {
                    subscription3.cancel();
                }
                i2 = i;
                subscription2 = subscription;
            } else {
                long j4 = subscriptionArbiter.f54136i;
                if (j4 != Format.OFFSET_SAMPLE_RELATIVE) {
                    j4 = C15735a.m58966a(j4, j2);
                    if (j4 != Format.OFFSET_SAMPLE_RELATIVE) {
                        i2 = i;
                        subscription2 = subscription;
                        long j5 = j4 - j3;
                        if (j5 < 0) {
                            SubscriptionHelper.reportMoreProduced(j5);
                            j5 = 0;
                        }
                        j4 = j5;
                    } else {
                        i2 = i;
                        subscription2 = subscription;
                    }
                    subscriptionArbiter.f54136i = j4;
                } else {
                    i2 = i;
                    subscription2 = subscription;
                }
                if (subscription3 != null) {
                    if (subscription4 != null) {
                        subscription4.cancel();
                    }
                    subscriptionArbiter.f54135h = subscription3;
                    if (j4 != 0) {
                        j = C15735a.m58966a(j, j4);
                        subscription = subscription3;
                    }
                } else if (!(subscription4 == null || j2 == 0)) {
                    j = C15735a.m58966a(j, j2);
                    subscription = subscription4;
                }
                i = i2;
                i = addAndGet(-i);
            }
            i = i2;
            subscription = subscription2;
            i = addAndGet(-i);
        } while (i != 0);
        if (j != 0) {
            subscription.request(j);
        }
    }

    /* renamed from: c */
    public final boolean m63751c() {
        return this.f54141n;
    }

    /* renamed from: d */
    public final boolean m63752d() {
        return this.f54140m;
    }
}
