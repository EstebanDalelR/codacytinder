package io.reactivex.processors;

import com.google.android.exoplayer2.Format;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.queue.C18423a;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.C15735a;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class UnicastProcessor<T> extends C18430a<T> {
    /* renamed from: a */
    final C18423a<T> f59118a;
    /* renamed from: c */
    final AtomicReference<Runnable> f59119c;
    /* renamed from: d */
    final boolean f59120d;
    /* renamed from: e */
    volatile boolean f59121e;
    /* renamed from: f */
    Throwable f59122f;
    /* renamed from: g */
    final AtomicReference<Subscriber<? super T>> f59123g;
    /* renamed from: h */
    volatile boolean f59124h;
    /* renamed from: i */
    final AtomicBoolean f59125i;
    /* renamed from: j */
    final BasicIntQueueSubscription<T> f59126j;
    /* renamed from: k */
    final AtomicLong f59127k;
    /* renamed from: l */
    boolean f59128l;

    final class UnicastQueueSubscription extends BasicIntQueueSubscription<T> {
        private static final long serialVersionUID = -4896760517184205454L;
        /* renamed from: a */
        final /* synthetic */ UnicastProcessor f59653a;

        UnicastQueueSubscription(UnicastProcessor unicastProcessor) {
            this.f59653a = unicastProcessor;
        }

        @Nullable
        public T poll() {
            return this.f59653a.f59118a.poll();
        }

        public boolean isEmpty() {
            return this.f59653a.f59118a.isEmpty();
        }

        public void clear() {
            this.f59653a.f59118a.clear();
        }

        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f59653a.f59128l = true;
            return 2;
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C15735a.m58967a(this.f59653a.f59127k, j);
                this.f59653a.m67675s();
            }
        }

        public void cancel() {
            if (!this.f59653a.f59124h) {
                this.f59653a.f59124h = true;
                this.f59653a.m67673q();
                if (!this.f59653a.f59128l && this.f59653a.f59126j.getAndIncrement() == 0) {
                    this.f59653a.f59118a.clear();
                    this.f59653a.f59123g.lazySet(null);
                }
            }
        }
    }

    @CheckReturnValue
    /* renamed from: b */
    public static <T> UnicastProcessor<T> m67668b(int i) {
        return new UnicastProcessor(i);
    }

    UnicastProcessor(int i) {
        this(i, null, true);
    }

    UnicastProcessor(int i, Runnable runnable, boolean z) {
        this.f59118a = new C18423a(C15684a.m58891a(i, "capacityHint"));
        this.f59119c = new AtomicReference(runnable);
        this.f59120d = z;
        this.f59123g = new AtomicReference();
        this.f59125i = new AtomicBoolean();
        this.f59126j = new UnicastQueueSubscription(this);
        this.f59127k = new AtomicLong();
    }

    /* renamed from: q */
    void m67673q() {
        Runnable runnable = (Runnable) this.f59119c.get();
        if (runnable != null && this.f59119c.compareAndSet(runnable, null)) {
            runnable.run();
        }
    }

    /* renamed from: b */
    void m67671b(Subscriber<? super T> subscriber) {
        C18423a c18423a = this.f59118a;
        boolean z = this.f59120d ^ 1;
        int i = 1;
        do {
            long j;
            long j2 = r6.f59127k.get();
            long j3 = 0;
            while (j2 != j3) {
                boolean z2 = r6.f59121e;
                Object poll = c18423a.poll();
                boolean z3 = poll == null;
                j = j3;
                if (!m67670a(z, z2, z3, subscriber, c18423a)) {
                    if (z3) {
                        break;
                    }
                    subscriber.onNext(poll);
                    j3 = j + 1;
                } else {
                    return;
                }
            }
            j = j3;
            Subscriber<? super T> subscriber2 = subscriber;
            if (j2 == j) {
                if (m67670a(z, r6.f59121e, c18423a.isEmpty(), subscriber2, c18423a)) {
                    return;
                }
            }
            if (!(j == 0 || j2 == Format.OFFSET_SAMPLE_RELATIVE)) {
                r6.f59127k.addAndGet(-j);
            }
            i = r6.f59126j.addAndGet(-i);
        } while (i != 0);
    }

    /* renamed from: c */
    void m67672c(Subscriber<? super T> subscriber) {
        C18423a c18423a = this.f59118a;
        int i = 1;
        int i2 = this.f59120d ^ 1;
        while (!this.f59124h) {
            boolean z = this.f59121e;
            if (i2 == 0 || !z || this.f59122f == null) {
                subscriber.onNext(null);
                if (z) {
                    this.f59123g.lazySet(null);
                    Throwable th = this.f59122f;
                    if (th != null) {
                        subscriber.onError(th);
                    } else {
                        subscriber.onComplete();
                    }
                    return;
                }
                i = this.f59126j.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
            c18423a.clear();
            this.f59123g.lazySet(null);
            subscriber.onError(this.f59122f);
            return;
        }
        c18423a.clear();
        this.f59123g.lazySet(null);
    }

    /* renamed from: s */
    void m67675s() {
        if (this.f59126j.getAndIncrement() == 0) {
            int i = 1;
            Subscriber subscriber = (Subscriber) this.f59123g.get();
            while (subscriber == null) {
                i = this.f59126j.addAndGet(-i);
                if (i != 0) {
                    subscriber = (Subscriber) this.f59123g.get();
                } else {
                    return;
                }
            }
            if (this.f59128l) {
                m67672c(subscriber);
            } else {
                m67671b(subscriber);
            }
        }
    }

    /* renamed from: a */
    boolean m67670a(boolean z, boolean z2, boolean z3, Subscriber<? super T> subscriber, C18423a<T> c18423a) {
        if (this.f59124h) {
            c18423a.clear();
            this.f59123g.lazySet(null);
            return true;
        }
        if (z2) {
            if (z && this.f59122f) {
                c18423a.clear();
                this.f59123g.lazySet(null);
                subscriber.onError(this.f59122f);
                return true;
            } else if (z3) {
                z = this.f59122f;
                this.f59123g.lazySet(null);
                if (z) {
                    subscriber.onError(z);
                } else {
                    subscriber.onComplete();
                }
                return true;
            }
        }
        return false;
    }

    public void onSubscribe(Subscription subscription) {
        if (!this.f59121e) {
            if (!this.f59124h) {
                subscription.request(Format.OFFSET_SAMPLE_RELATIVE);
                return;
            }
        }
        subscription.cancel();
    }

    public void onNext(T t) {
        C15684a.m58895a((Object) t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f59121e) {
            if (!this.f59124h) {
                this.f59118a.offer(t);
                m67675s();
            }
        }
    }

    public void onError(Throwable th) {
        C15684a.m58895a((Object) th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f59121e) {
            if (!this.f59124h) {
                this.f59122f = th;
                this.f59121e = true;
                m67673q();
                m67675s();
                return;
            }
        }
        C2667a.a(th);
    }

    public void onComplete() {
        if (!this.f59121e) {
            if (!this.f59124h) {
                this.f59121e = true;
                m67673q();
                m67675s();
            }
        }
    }

    /* renamed from: a */
    protected void m67669a(Subscriber<? super T> subscriber) {
        if (this.f59125i.get() || !this.f59125i.compareAndSet(false, true)) {
            EmptySubscription.error(new IllegalStateException("This processor allows only a single Subscriber"), subscriber);
            return;
        }
        subscriber.onSubscribe(this.f59126j);
        this.f59123g.set(subscriber);
        if (this.f59124h != null) {
            this.f59123g.lazySet(null);
        } else {
            m67675s();
        }
    }

    /* renamed from: r */
    public boolean mo14002r() {
        return this.f59123g.get() != null;
    }
}
