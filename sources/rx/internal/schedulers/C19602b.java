package rx.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import rx.C2671a;
import rx.Subscription;
import rx.a$a;
import rx.functions.Action0;
import rx.internal.util.C19615i;
import rx.internal.util.RxThreadFactory;
import rx.p500e.C19407e;
import rx.p500e.C19573b;

/* renamed from: rx.internal.schedulers.b */
public final class C19602b extends C2671a implements SchedulerLifecycle {
    /* renamed from: a */
    static final int f61261a;
    /* renamed from: b */
    static final C19848c f61262b = new C19848c(RxThreadFactory.f60641a);
    /* renamed from: c */
    static final C19435b f61263c = new C19435b(null, 0);
    /* renamed from: d */
    final ThreadFactory f61264d;
    /* renamed from: e */
    final AtomicReference<C19435b> f61265e = new AtomicReference(f61263c);

    /* renamed from: rx.internal.schedulers.b$b */
    static final class C19435b {
        /* renamed from: a */
        final int f60635a;
        /* renamed from: b */
        final C19848c[] f60636b;
        /* renamed from: c */
        long f60637c;

        C19435b(ThreadFactory threadFactory, int i) {
            this.f60635a = i;
            this.f60636b = new C19848c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f60636b[i2] = new C19848c(threadFactory);
            }
        }

        /* renamed from: a */
        public C19848c m69914a() {
            int i = this.f60635a;
            if (i == 0) {
                return C19602b.f61262b;
            }
            C19848c[] c19848cArr = this.f60636b;
            long j = this.f60637c;
            this.f60637c = j + 1;
            return c19848cArr[(int) (j % ((long) i))];
        }

        /* renamed from: b */
        public void m69915b() {
            for (C19848c unsubscribe : this.f60636b) {
                unsubscribe.unsubscribe();
            }
        }
    }

    /* renamed from: rx.internal.schedulers.b$a */
    static final class C19752a extends a$a {
        /* renamed from: a */
        private final C19615i f61802a = new C19615i();
        /* renamed from: b */
        private final C19573b f61803b = new C19573b();
        /* renamed from: c */
        private final C19615i f61804c = new C19615i(this.f61802a, this.f61803b);
        /* renamed from: d */
        private final C19848c f61805d;

        C19752a(C19848c c19848c) {
            this.f61805d = c19848c;
        }

        public void unsubscribe() {
            this.f61804c.unsubscribe();
        }

        public boolean isUnsubscribed() {
            return this.f61804c.isUnsubscribed();
        }

        /* renamed from: a */
        public Subscription mo14740a(final Action0 action0) {
            if (isUnsubscribed()) {
                return C19407e.m69855b();
            }
            return this.f61805d.m71035a(new Action0(this) {
                /* renamed from: b */
                final /* synthetic */ C19752a f62112b;

                public void call() {
                    if (!this.f62112b.isUnsubscribed()) {
                        action0.call();
                    }
                }
            }, 0, null, this.f61802a);
        }

        /* renamed from: a */
        public Subscription mo14741a(final Action0 action0, long j, TimeUnit timeUnit) {
            if (isUnsubscribed()) {
                return C19407e.m69855b();
            }
            return this.f61805d.m71034a(new Action0(this) {
                /* renamed from: b */
                final /* synthetic */ C19752a f62114b;

                public void call() {
                    if (!this.f62114b.isUnsubscribed()) {
                        action0.call();
                    }
                }
            }, j, timeUnit, this.f61803b);
        }
    }

    /* renamed from: rx.internal.schedulers.b$c */
    static final class C19848c extends C19755g {
        C19848c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        int intValue = Integer.getInteger("rx.scheduler.max-computation-threads", 0).intValue();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (intValue <= 0 || intValue > availableProcessors) {
            intValue = availableProcessors;
        }
        f61261a = intValue;
        f61262b.unsubscribe();
    }

    public C19602b(ThreadFactory threadFactory) {
        this.f61264d = threadFactory;
        start();
    }

    public a$a createWorker() {
        return new C19752a(((C19435b) this.f61265e.get()).m69914a());
    }

    public void start() {
        C19435b c19435b = new C19435b(this.f61264d, f61261a);
        if (!this.f61265e.compareAndSet(f61263c, c19435b)) {
            c19435b.m69915b();
        }
    }

    public void shutdown() {
        C19435b c19435b;
        do {
            c19435b = (C19435b) this.f61265e.get();
            if (c19435b == f61263c) {
                return;
            }
        } while (!this.f61265e.compareAndSet(c19435b, f61263c));
        c19435b.m69915b();
    }

    /* renamed from: a */
    public Subscription m70615a(Action0 action0) {
        return ((C19435b) this.f61265e.get()).m69914a().m71036b(action0, -1, TimeUnit.NANOSECONDS);
    }
}
