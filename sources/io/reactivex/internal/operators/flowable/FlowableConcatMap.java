package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class FlowableConcatMap<T, R> extends C18364a<T, R> {
    /* renamed from: c */
    final Function<? super T, ? extends Publisher<? extends R>> f58799c;
    /* renamed from: d */
    final int f58800d;
    /* renamed from: e */
    final ErrorMode f58801e;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableConcatMap$a */
    interface C15689a<T> {
        /* renamed from: a */
        void mo13994a(T t);

        /* renamed from: a */
        void mo13995a(Throwable th);

        /* renamed from: c */
        void mo13561c();
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableConcatMap$b */
    static final class C17409b<T> implements Subscription {
        /* renamed from: a */
        final Subscriber<? super T> f53218a;
        /* renamed from: b */
        final T f53219b;
        /* renamed from: c */
        boolean f53220c;

        public void cancel() {
        }

        C17409b(T t, Subscriber<? super T> subscriber) {
            this.f53219b = t;
            this.f53218a = subscriber;
        }

        public void request(long j) {
            if (j > 0 && this.f53220c == null) {
                this.f53220c = 1;
                j = this.f53218a;
                j.onNext(this.f53219b);
                j.onComplete();
            }
        }
    }

    static abstract class BaseConcatMapSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, C15689a<R>, Subscription {
        private static final long serialVersionUID = -3511336836796789179L;
        /* renamed from: a */
        final ConcatMapInner<R> f56875a = new ConcatMapInner(this);
        /* renamed from: b */
        final Function<? super T, ? extends Publisher<? extends R>> f56876b;
        /* renamed from: c */
        final int f56877c;
        /* renamed from: d */
        final int f56878d;
        /* renamed from: e */
        Subscription f56879e;
        /* renamed from: f */
        int f56880f;
        /* renamed from: g */
        SimpleQueue<T> f56881g;
        /* renamed from: h */
        volatile boolean f56882h;
        /* renamed from: i */
        volatile boolean f56883i;
        /* renamed from: j */
        final AtomicThrowable f56884j = new AtomicThrowable();
        /* renamed from: k */
        volatile boolean f56885k;
        /* renamed from: l */
        int f56886l;

        /* renamed from: a */
        abstract void mo13993a();

        /* renamed from: b */
        abstract void mo13996b();

        BaseConcatMapSubscriber(Function<? super T, ? extends Publisher<? extends R>> function, int i) {
            this.f56876b = function;
            this.f56877c = i;
            this.f56878d = i - (i >> 2);
        }

        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f56879e, subscription)) {
                this.f56879e = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int requestFusion = queueSubscription.requestFusion(3);
                    if (requestFusion == 1) {
                        this.f56886l = requestFusion;
                        this.f56881g = queueSubscription;
                        this.f56882h = true;
                        mo13996b();
                        mo13993a();
                        return;
                    } else if (requestFusion == 2) {
                        this.f56886l = requestFusion;
                        this.f56881g = queueSubscription;
                        mo13996b();
                        subscription.request((long) this.f56877c);
                        return;
                    }
                }
                this.f56881g = new SpscArrayQueue(this.f56877c);
                mo13996b();
                subscription.request((long) this.f56877c);
            }
        }

        public final void onNext(T t) {
            if (this.f56886l == 2 || this.f56881g.offer(t) != null) {
                mo13993a();
                return;
            }
            this.f56879e.cancel();
            onError(new IllegalStateException("Queue full?!"));
        }

        public final void onComplete() {
            this.f56882h = true;
            mo13993a();
        }

        /* renamed from: c */
        public final void mo13561c() {
            this.f56885k = false;
            mo13993a();
        }
    }

    static final class ConcatMapInner<R> extends SubscriptionArbiter implements FlowableSubscriber<R> {
        private static final long serialVersionUID = 897683679971470653L;
        /* renamed from: a */
        final C15689a<R> f56887a;
        /* renamed from: b */
        long f56888b;

        ConcatMapInner(C15689a<R> c15689a) {
            this.f56887a = c15689a;
        }

        public void onSubscribe(Subscription subscription) {
            m63749a(subscription);
        }

        public void onNext(R r) {
            this.f56888b++;
            this.f56887a.mo13994a((Object) r);
        }

        public void onError(Throwable th) {
            long j = this.f56888b;
            if (j != 0) {
                this.f56888b = 0;
                m63748a(j);
            }
            this.f56887a.mo13995a(th);
        }

        public void onComplete() {
            long j = this.f56888b;
            if (j != 0) {
                this.f56888b = 0;
                m63748a(j);
            }
            this.f56887a.mo13561c();
        }
    }

    static final class ConcatMapDelayed<T, R> extends BaseConcatMapSubscriber<T, R> {
        private static final long serialVersionUID = -2945777694260521066L;
        /* renamed from: m */
        final Subscriber<? super R> f58795m;
        /* renamed from: n */
        final boolean f58796n;

        ConcatMapDelayed(Subscriber<? super R> subscriber, Function<? super T, ? extends Publisher<? extends R>> function, int i, boolean z) {
            super(function, i);
            this.f58795m = subscriber;
            this.f58796n = z;
        }

        /* renamed from: b */
        void mo13996b() {
            this.f58795m.onSubscribe(this);
        }

        public void onError(Throwable th) {
            if (this.j.m58961a(th)) {
                this.h = true;
                mo13993a();
                return;
            }
            C2667a.a(th);
        }

        /* renamed from: a */
        public void mo13994a(R r) {
            this.f58795m.onNext(r);
        }

        /* renamed from: a */
        public void mo13995a(Throwable th) {
            if (this.j.m58961a(th)) {
                if (this.f58796n == null) {
                    this.e.cancel();
                    this.h = true;
                }
                this.k = null;
                mo13993a();
                return;
            }
            C2667a.a(th);
        }

        public void request(long j) {
            this.a.request(j);
        }

        public void cancel() {
            if (!this.i) {
                this.i = true;
                this.a.cancel();
                this.e.cancel();
            }
        }

        /* renamed from: a */
        void mo13993a() {
            Throwable a;
            if (getAndIncrement() == 0) {
                while (!this.i) {
                    if (!this.k) {
                        boolean z = this.h;
                        if (!z || this.f58796n || ((Throwable) this.j.get()) == null) {
                            try {
                                Object poll = this.g.poll();
                                Object obj = poll == null ? 1 : null;
                                if (z && obj != null) {
                                    a = this.j.m58960a();
                                    if (a != null) {
                                        this.f58795m.onError(a);
                                    } else {
                                        this.f58795m.onComplete();
                                    }
                                    return;
                                } else if (obj == null) {
                                    try {
                                        Publisher publisher = (Publisher) C15684a.m58895a(this.b.apply(poll), "The mapper returned a null Publisher");
                                        if (this.l != 1) {
                                            int i = this.f + 1;
                                            if (i == this.d) {
                                                this.f = 0;
                                                this.e.request((long) i);
                                            } else {
                                                this.f = i;
                                            }
                                        }
                                        if (publisher instanceof Callable) {
                                            try {
                                                Object call = ((Callable) publisher).call();
                                                if (call != null) {
                                                    if (this.a.m63751c()) {
                                                        this.f58795m.onNext(call);
                                                    } else {
                                                        this.k = true;
                                                        this.a.m63749a(new C17409b(call, this.a));
                                                    }
                                                }
                                            } catch (Throwable a2) {
                                                C15678a.m58850b(a2);
                                                this.e.cancel();
                                                this.j.m58961a(a2);
                                                this.f58795m.onError(this.j.m58960a());
                                                return;
                                            }
                                        }
                                        this.k = true;
                                        publisher.subscribe(this.a);
                                    } catch (Throwable a22) {
                                        C15678a.m58850b(a22);
                                        this.e.cancel();
                                        this.j.m58961a(a22);
                                        this.f58795m.onError(this.j.m58960a());
                                        return;
                                    }
                                }
                            } catch (Throwable a222) {
                                C15678a.m58850b(a222);
                                this.e.cancel();
                                this.j.m58961a(a222);
                                this.f58795m.onError(this.j.m58960a());
                                return;
                            }
                        }
                        this.f58795m.onError(this.j.m58960a());
                        return;
                    }
                    if (decrementAndGet() == 0) {
                    }
                }
            }
        }
    }

    static final class ConcatMapImmediate<T, R> extends BaseConcatMapSubscriber<T, R> {
        private static final long serialVersionUID = 7898995095634264146L;
        /* renamed from: m */
        final Subscriber<? super R> f58797m;
        /* renamed from: n */
        final AtomicInteger f58798n = new AtomicInteger();

        ConcatMapImmediate(Subscriber<? super R> subscriber, Function<? super T, ? extends Publisher<? extends R>> function, int i) {
            super(function, i);
            this.f58797m = subscriber;
        }

        /* renamed from: b */
        void mo13996b() {
            this.f58797m.onSubscribe(this);
        }

        public void onError(Throwable th) {
            if (this.j.m58961a(th)) {
                this.a.cancel();
                if (getAndIncrement() == null) {
                    this.f58797m.onError(this.j.m58960a());
                    return;
                }
                return;
            }
            C2667a.a(th);
        }

        /* renamed from: a */
        public void mo13994a(R r) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f58797m.onNext(r);
                if (compareAndSet(1, 0) == null) {
                    this.f58797m.onError(this.j.m58960a());
                }
            }
        }

        /* renamed from: a */
        public void mo13995a(Throwable th) {
            if (this.j.m58961a(th)) {
                this.e.cancel();
                if (getAndIncrement() == null) {
                    this.f58797m.onError(this.j.m58960a());
                    return;
                }
                return;
            }
            C2667a.a(th);
        }

        public void request(long j) {
            this.a.request(j);
        }

        public void cancel() {
            if (!this.i) {
                this.i = true;
                this.a.cancel();
                this.e.cancel();
            }
        }

        /* renamed from: a */
        void mo13993a() {
            if (this.f58798n.getAndIncrement() == 0) {
                while (!this.i) {
                    if (!this.k) {
                        boolean z = this.h;
                        try {
                            Object poll = this.g.poll();
                            Object obj = poll == null ? 1 : null;
                            if (z && obj != null) {
                                this.f58797m.onComplete();
                                return;
                            } else if (obj == null) {
                                try {
                                    Publisher publisher = (Publisher) C15684a.m58895a(this.b.apply(poll), "The mapper returned a null Publisher");
                                    if (this.l != 1) {
                                        int i = this.f + 1;
                                        if (i == this.d) {
                                            this.f = 0;
                                            this.e.request((long) i);
                                        } else {
                                            this.f = i;
                                        }
                                    }
                                    if (publisher instanceof Callable) {
                                        try {
                                            Object call = ((Callable) publisher).call();
                                            if (call != null) {
                                                if (!this.a.m63751c()) {
                                                    this.k = true;
                                                    this.a.m63749a(new C17409b(call, this.a));
                                                } else if (get() == 0 && compareAndSet(0, 1)) {
                                                    this.f58797m.onNext(call);
                                                    if (!compareAndSet(1, 0)) {
                                                        this.f58797m.onError(this.j.m58960a());
                                                        return;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th) {
                                            C15678a.m58850b(th);
                                            this.e.cancel();
                                            this.j.m58961a(th);
                                            this.f58797m.onError(this.j.m58960a());
                                            return;
                                        }
                                    }
                                    this.k = true;
                                    publisher.subscribe(this.a);
                                } catch (Throwable th2) {
                                    C15678a.m58850b(th2);
                                    this.e.cancel();
                                    this.j.m58961a(th2);
                                    this.f58797m.onError(this.j.m58960a());
                                    return;
                                }
                            }
                        } catch (Throwable th22) {
                            C15678a.m58850b(th22);
                            this.e.cancel();
                            this.j.m58961a(th22);
                            this.f58797m.onError(this.j.m58960a());
                            return;
                        }
                    }
                    if (this.f58798n.decrementAndGet() == 0) {
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static <T, R> Subscriber<T> m67562a(Subscriber<? super R> subscriber, Function<? super T, ? extends Publisher<? extends R>> function, int i, ErrorMode errorMode) {
        switch (errorMode) {
            case BOUNDARY:
                return new ConcatMapDelayed(subscriber, function, i, false);
            case END:
                return new ConcatMapDelayed(subscriber, function, i, true);
            default:
                return new ConcatMapImmediate(subscriber, function, i);
        }
    }

    /* renamed from: a */
    protected void m67563a(Subscriber<? super R> subscriber) {
        if (!C15696q.m58901a(this.a, subscriber, this.f58799c)) {
            this.a.subscribe(m67562a(subscriber, this.f58799c, this.f58800d, this.f58801e));
        }
    }
}
