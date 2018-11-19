package io.reactivex.internal.operators.flowable;

import com.google.android.exoplayer2.Format;
import io.reactivex.C3957b;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.operators.flowable.C19010p.C19182b;
import io.reactivex.internal.queue.C18423a;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.C15735a;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.p079d.C2667a;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class FlowableCombineLatest<T, R> extends C3957b<R> {
    @Nullable
    /* renamed from: a */
    final Publisher<? extends T>[] f56861a;
    @Nullable
    /* renamed from: c */
    final Iterable<? extends Publisher<? extends T>> f56862c;
    /* renamed from: d */
    final Function<? super Object[], ? extends R> f56863d;
    /* renamed from: e */
    final int f56864e;
    /* renamed from: f */
    final boolean f56865f;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCombineLatest$a */
    final class C17408a implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ FlowableCombineLatest f53217a;

        C17408a(FlowableCombineLatest flowableCombineLatest) {
            this.f53217a = flowableCombineLatest;
        }

        public R apply(T t) throws Exception {
            return this.f53217a.f56863d.apply(new Object[]{t});
        }
    }

    static final class CombineLatestInnerSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -8730235182291002949L;
        /* renamed from: a */
        final CombineLatestCoordinator<T, ?> f56856a;
        /* renamed from: b */
        final int f56857b;
        /* renamed from: c */
        final int f56858c;
        /* renamed from: d */
        final int f56859d;
        /* renamed from: e */
        int f56860e;

        CombineLatestInnerSubscriber(CombineLatestCoordinator<T, ?> combineLatestCoordinator, int i, int i2) {
            this.f56856a = combineLatestCoordinator;
            this.f56857b = i;
            this.f56858c = i2;
            this.f56859d = i2 - (i2 >> 2);
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this, subscription)) {
                subscription.request((long) this.f56858c);
            }
        }

        public void onNext(T t) {
            this.f56856a.m68182a(this.f56857b, (Object) t);
        }

        public void onError(Throwable th) {
            this.f56856a.m68183a(this.f56857b, th);
        }

        public void onComplete() {
            this.f56856a.m68181a(this.f56857b);
        }

        /* renamed from: a */
        public void m66405a() {
            SubscriptionHelper.cancel(this);
        }

        /* renamed from: b */
        public void m66406b() {
            int i = this.f56860e + 1;
            if (i == this.f56859d) {
                this.f56860e = 0;
                ((Subscription) get()).request((long) i);
                return;
            }
            this.f56860e = i;
        }
    }

    static final class CombineLatestCoordinator<T, R> extends BasicIntQueueSubscription<R> {
        private static final long serialVersionUID = -5082275438355852221L;
        /* renamed from: a */
        final Subscriber<? super R> f59433a;
        /* renamed from: b */
        final Function<? super Object[], ? extends R> f59434b;
        /* renamed from: c */
        final CombineLatestInnerSubscriber<T>[] f59435c;
        /* renamed from: d */
        final C18423a<Object> f59436d;
        /* renamed from: e */
        final Object[] f59437e;
        /* renamed from: f */
        final boolean f59438f;
        /* renamed from: g */
        boolean f59439g;
        /* renamed from: h */
        int f59440h;
        /* renamed from: i */
        int f59441i;
        /* renamed from: j */
        volatile boolean f59442j;
        /* renamed from: k */
        final AtomicLong f59443k;
        /* renamed from: l */
        volatile boolean f59444l;
        /* renamed from: m */
        final AtomicReference<Throwable> f59445m;

        CombineLatestCoordinator(Subscriber<? super R> subscriber, Function<? super Object[], ? extends R> function, int i, int i2, boolean z) {
            this.f59433a = subscriber;
            this.f59434b = function;
            subscriber = new CombineLatestInnerSubscriber[i];
            for (function = null; function < i; function++) {
                subscriber[function] = new CombineLatestInnerSubscriber(this, function, i2);
            }
            this.f59435c = subscriber;
            this.f59437e = new Object[i];
            this.f59436d = new C18423a(i2);
            this.f59443k = new AtomicLong();
            this.f59445m = new AtomicReference();
            this.f59438f = z;
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C15735a.m58967a(this.f59443k, j);
                m68187c();
            }
        }

        public void cancel() {
            this.f59442j = true;
            m68188d();
        }

        /* renamed from: a */
        void m68184a(Publisher<? extends T>[] publisherArr, int i) {
            CombineLatestInnerSubscriber[] combineLatestInnerSubscriberArr = this.f59435c;
            for (int i2 = 0; i2 < i && !this.f59444l; i2++) {
                if (this.f59442j) {
                    break;
                }
                publisherArr[i2].subscribe(combineLatestInnerSubscriberArr[i2]);
            }
        }

        /* renamed from: a */
        void m68182a(int i, T t) {
            synchronized (this) {
                Object obj = this.f59437e;
                T t2 = this.f59440h;
                if (obj[i] == null) {
                    t2++;
                    this.f59440h = t2;
                }
                obj[i] = t;
                if (obj.length == t2) {
                    this.f59436d.offer(this.f59435c[i], obj.clone());
                    t = null;
                } else {
                    t = true;
                }
            }
            if (t != null) {
                this.f59435c[i].m66406b();
            } else {
                m68187c();
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        void m68181a(int r3) {
            /*
            r2 = this;
            monitor-enter(r2);
            r0 = r2.f59437e;	 Catch:{ all -> 0x001c }
            r3 = r0[r3];	 Catch:{ all -> 0x001c }
            r1 = 1;
            if (r3 == 0) goto L_0x0015;
        L_0x0008:
            r3 = r2.f59441i;	 Catch:{ all -> 0x001c }
            r3 = r3 + r1;
            r0 = r0.length;	 Catch:{ all -> 0x001c }
            if (r3 != r0) goto L_0x0011;
        L_0x000e:
            r2.f59444l = r1;	 Catch:{ all -> 0x001c }
            goto L_0x0017;
        L_0x0011:
            r2.f59441i = r3;	 Catch:{ all -> 0x001c }
            monitor-exit(r2);	 Catch:{ all -> 0x001c }
            return;
        L_0x0015:
            r2.f59444l = r1;	 Catch:{ all -> 0x001c }
        L_0x0017:
            monitor-exit(r2);	 Catch:{ all -> 0x001c }
            r2.m68187c();
            return;
        L_0x001c:
            r3 = move-exception;
            monitor-exit(r2);	 Catch:{ all -> 0x001c }
            throw r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestCoordinator.a(int):void");
        }

        /* renamed from: a */
        void m68183a(int i, Throwable th) {
            if (!ExceptionHelper.m58964a(this.f59445m, th)) {
                C2667a.a(th);
            } else if (this.f59438f == null) {
                m68188d();
                this.f59444l = true;
                m68187c();
            } else {
                m68181a(i);
            }
        }

        /* renamed from: a */
        void m68180a() {
            Subscriber subscriber = this.f59433a;
            C18423a c18423a = this.f59436d;
            int i = 1;
            while (!this.f59442j) {
                Throwable th = (Throwable) this.f59445m.get();
                if (th != null) {
                    c18423a.clear();
                    subscriber.onError(th);
                    return;
                }
                boolean z = this.f59444l;
                boolean isEmpty = c18423a.isEmpty();
                if (!isEmpty) {
                    subscriber.onNext(null);
                }
                if (z && isEmpty) {
                    subscriber.onComplete();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
            c18423a.clear();
        }

        /* renamed from: b */
        void m68186b() {
            Subscriber subscriber = this.f59433a;
            C18423a c18423a = this.f59436d;
            int i = 1;
            do {
                long j = this.f59443k.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z = this.f59444l;
                    Object poll = c18423a.poll();
                    boolean z2 = poll == null;
                    if (!m68185a(z, z2, subscriber, c18423a)) {
                        if (z2) {
                            break;
                        }
                        try {
                            subscriber.onNext(C15684a.m58895a(this.f59434b.apply((Object[]) c18423a.poll()), "The combiner returned a null value"));
                            ((CombineLatestInnerSubscriber) poll).m66406b();
                            j2++;
                        } catch (Throwable th) {
                            C15678a.m58850b(th);
                            m68188d();
                            ExceptionHelper.m58964a(this.f59445m, th);
                            subscriber.onError(ExceptionHelper.m58963a(this.f59445m));
                            return;
                        }
                    }
                    return;
                }
                if (j2 != j || !m68185a(this.f59444l, c18423a.isEmpty(), subscriber, c18423a)) {
                    if (!(j2 == 0 || j == Format.OFFSET_SAMPLE_RELATIVE)) {
                        this.f59443k.addAndGet(-j2);
                    }
                    i = addAndGet(-i);
                } else {
                    return;
                }
            } while (i != 0);
        }

        /* renamed from: c */
        void m68187c() {
            if (getAndIncrement() == 0) {
                if (this.f59439g) {
                    m68180a();
                } else {
                    m68186b();
                }
            }
        }

        /* renamed from: a */
        boolean m68185a(boolean z, boolean z2, Subscriber<?> subscriber, C18423a<?> c18423a) {
            if (this.f59442j) {
                m68188d();
                c18423a.clear();
                return true;
            }
            if (z) {
                if (!this.f59438f) {
                    z = ExceptionHelper.m58963a(this.f59445m);
                    if (z && z != ExceptionHelper.f48655a) {
                        m68188d();
                        c18423a.clear();
                        subscriber.onError(z);
                        return true;
                    } else if (z2) {
                        m68188d();
                        subscriber.onComplete();
                        return true;
                    }
                } else if (z2) {
                    m68188d();
                    z = ExceptionHelper.m58963a(this.f59445m);
                    if (!z || z == ExceptionHelper.f48655a) {
                        subscriber.onComplete();
                    } else {
                        subscriber.onError(z);
                    }
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        void m68188d() {
            for (CombineLatestInnerSubscriber a : this.f59435c) {
                a.m66405a();
            }
        }

        public int requestFusion(int i) {
            boolean z = false;
            if ((i & 4) != 0) {
                return 0;
            }
            i &= 2;
            if (i != 0) {
                z = true;
            }
            this.f59439g = z;
            return i;
        }

        @Nullable
        public R poll() throws Exception {
            Object poll = this.f59436d.poll();
            if (poll == null) {
                return null;
            }
            R a = C15684a.m58895a(this.f59434b.apply((Object[]) this.f59436d.poll()), "The combiner returned a null value");
            ((CombineLatestInnerSubscriber) poll).m66406b();
            return a;
        }

        public void clear() {
            this.f59436d.clear();
        }

        public boolean isEmpty() {
            return this.f59436d.isEmpty();
        }
    }

    public FlowableCombineLatest(@NonNull Publisher<? extends T>[] publisherArr, @NonNull Function<? super Object[], ? extends R> function, int i, boolean z) {
        this.f56861a = publisherArr;
        this.f56862c = null;
        this.f56863d = function;
        this.f56864e = i;
        this.f56865f = z;
    }

    public FlowableCombineLatest(@NonNull Iterable<? extends Publisher<? extends T>> iterable, @NonNull Function<? super Object[], ? extends R> function, int i, boolean z) {
        this.f56861a = null;
        this.f56862c = iterable;
        this.f56863d = function;
        this.f56864e = i;
        this.f56865f = z;
    }

    /* renamed from: a */
    public void m66407a(Subscriber<? super R> subscriber) {
        Publisher[] publisherArr = this.f56861a;
        int i;
        if (publisherArr == null) {
            publisherArr = new Publisher[8];
            try {
                Iterator it = (Iterator) C15684a.m58895a(this.f56862c.iterator(), "The iterator returned is null");
                i = 0;
                while (it.hasNext()) {
                    try {
                        try {
                            Publisher publisher = (Publisher) C15684a.m58895a(it.next(), "The publisher returned by the iterator is null");
                            if (i == publisherArr.length) {
                                Object obj = new Publisher[((i >> 2) + i)];
                                System.arraycopy(publisherArr, 0, obj, 0, i);
                                publisherArr = obj;
                            }
                            int i2 = i + 1;
                            publisherArr[i] = publisher;
                            i = i2;
                        } catch (Throwable th) {
                            C15678a.m58850b(th);
                            EmptySubscription.error(th, subscriber);
                            return;
                        }
                    } catch (Throwable th2) {
                        C15678a.m58850b(th2);
                        EmptySubscription.error(th2, subscriber);
                        return;
                    }
                }
            } catch (Throwable th22) {
                C15678a.m58850b(th22);
                EmptySubscription.error(th22, subscriber);
                return;
            }
        }
        i = publisherArr.length;
        if (i == 0) {
            EmptySubscription.complete(subscriber);
        } else if (i == 1) {
            publisherArr[0].subscribe(new C19182b(subscriber, new C17408a(this)));
        } else {
            CombineLatestCoordinator combineLatestCoordinator = new CombineLatestCoordinator(subscriber, this.f56863d, i, this.f56864e, this.f56865f);
            subscriber.onSubscribe(combineLatestCoordinator);
            combineLatestCoordinator.m68184a(publisherArr, i);
        }
    }
}
