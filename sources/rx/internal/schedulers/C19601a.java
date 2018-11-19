package rx.internal.schedulers;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rx.C2671a;
import rx.Subscription;
import rx.a$a;
import rx.functions.Action0;
import rx.internal.util.RxThreadFactory;
import rx.p500e.C19407e;
import rx.p500e.C19573b;

/* renamed from: rx.internal.schedulers.a */
public final class C19601a extends C2671a implements SchedulerLifecycle {
    /* renamed from: a */
    static final C19845c f61255a = new C19845c(RxThreadFactory.f60641a);
    /* renamed from: b */
    static final C19434a f61256b = new C19434a(null, 0, null);
    /* renamed from: e */
    private static final long f61257e = ((long) Integer.getInteger("rx.io-scheduler.keepalive", 60).intValue());
    /* renamed from: f */
    private static final TimeUnit f61258f = TimeUnit.SECONDS;
    /* renamed from: c */
    final ThreadFactory f61259c;
    /* renamed from: d */
    final AtomicReference<C19434a> f61260d = new AtomicReference(f61256b);

    /* renamed from: rx.internal.schedulers.a$a */
    static final class C19434a {
        /* renamed from: a */
        private final ThreadFactory f60629a;
        /* renamed from: b */
        private final long f60630b;
        /* renamed from: c */
        private final ConcurrentLinkedQueue<C19845c> f60631c;
        /* renamed from: d */
        private final C19573b f60632d;
        /* renamed from: e */
        private final ScheduledExecutorService f60633e;
        /* renamed from: f */
        private final Future<?> f60634f;

        /* renamed from: rx.internal.schedulers.a$a$2 */
        class C194332 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C19434a f60628a;

            C194332(C19434a c19434a) {
                this.f60628a = c19434a;
            }

            public void run() {
                this.f60628a.m69911b();
            }
        }

        C19434a(final ThreadFactory threadFactory, long j, TimeUnit timeUnit) {
            this.f60629a = threadFactory;
            this.f60630b = timeUnit != null ? timeUnit.toNanos(j) : 0;
            this.f60631c = new ConcurrentLinkedQueue();
            this.f60632d = new C19573b();
            j = null;
            if (timeUnit != null) {
                threadFactory = Executors.newScheduledThreadPool(1, new ThreadFactory(this) {
                    /* renamed from: b */
                    final /* synthetic */ C19434a f60627b;

                    public Thread newThread(Runnable runnable) {
                        runnable = threadFactory.newThread(runnable);
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(runnable.getName());
                        stringBuilder.append(" (Evictor)");
                        runnable.setName(stringBuilder.toString());
                        return runnable;
                    }
                });
                C19755g.m71029b(threadFactory);
                j = threadFactory.scheduleWithFixedDelay(new C194332(this), this.f60630b, this.f60630b, TimeUnit.NANOSECONDS);
            } else {
                threadFactory = null;
            }
            this.f60633e = threadFactory;
            this.f60634f = j;
        }

        /* renamed from: a */
        C19845c m69909a() {
            if (this.f60632d.isUnsubscribed()) {
                return C19601a.f61255a;
            }
            while (!this.f60631c.isEmpty()) {
                C19845c c19845c = (C19845c) this.f60631c.poll();
                if (c19845c != null) {
                    return c19845c;
                }
            }
            Subscription c19845c2 = new C19845c(this.f60629a);
            this.f60632d.m70548a(c19845c2);
            return c19845c2;
        }

        /* renamed from: a */
        void m69910a(C19845c c19845c) {
            c19845c.m71478a(m69912c() + this.f60630b);
            this.f60631c.offer(c19845c);
        }

        /* renamed from: b */
        void m69911b() {
            if (!this.f60631c.isEmpty()) {
                long c = m69912c();
                Iterator it = this.f60631c.iterator();
                while (it.hasNext()) {
                    C19845c c19845c = (C19845c) it.next();
                    if (c19845c.m71479b() > c) {
                        return;
                    }
                    if (this.f60631c.remove(c19845c)) {
                        this.f60632d.m70550b(c19845c);
                    }
                }
            }
        }

        /* renamed from: c */
        long m69912c() {
            return System.nanoTime();
        }

        /* renamed from: d */
        void m69913d() {
            try {
                if (this.f60634f != null) {
                    this.f60634f.cancel(true);
                }
                if (this.f60633e != null) {
                    this.f60633e.shutdownNow();
                }
                this.f60632d.unsubscribe();
            } catch (Throwable th) {
                this.f60632d.unsubscribe();
            }
        }
    }

    /* renamed from: rx.internal.schedulers.a$b */
    static final class C19844b extends a$a implements Action0 {
        /* renamed from: a */
        final AtomicBoolean f62106a;
        /* renamed from: b */
        private final C19573b f62107b = new C19573b();
        /* renamed from: c */
        private final C19434a f62108c;
        /* renamed from: d */
        private final C19845c f62109d;

        C19844b(C19434a c19434a) {
            this.f62108c = c19434a;
            this.f62106a = new AtomicBoolean();
            this.f62109d = c19434a.m69909a();
        }

        public void unsubscribe() {
            if (this.f62106a.compareAndSet(false, true)) {
                this.f62109d.mo14740a((Action0) this);
            }
            this.f62107b.unsubscribe();
        }

        public void call() {
            this.f62108c.m69910a(this.f62109d);
        }

        public boolean isUnsubscribed() {
            return this.f62107b.isUnsubscribed();
        }

        /* renamed from: a */
        public Subscription mo14740a(Action0 action0) {
            return mo14741a(action0, 0, null);
        }

        /* renamed from: a */
        public Subscription mo14741a(final Action0 action0, long j, TimeUnit timeUnit) {
            if (this.f62107b.isUnsubscribed()) {
                return C19407e.m69855b();
            }
            Subscription b = this.f62109d.m71036b(new Action0(this) {
                /* renamed from: b */
                final /* synthetic */ C19844b f62105b;

                public void call() {
                    if (!this.f62105b.isUnsubscribed()) {
                        action0.call();
                    }
                }
            }, j, timeUnit);
            this.f62107b.m70548a(b);
            b.m70611a(this.f62107b);
            return b;
        }
    }

    /* renamed from: rx.internal.schedulers.a$c */
    static final class C19845c extends C19755g {
        /* renamed from: c */
        private long f62110c = 0;

        C19845c(ThreadFactory threadFactory) {
            super(threadFactory);
        }

        /* renamed from: b */
        public long m71479b() {
            return this.f62110c;
        }

        /* renamed from: a */
        public void m71478a(long j) {
            this.f62110c = j;
        }
    }

    static {
        f61255a.unsubscribe();
        f61256b.m69913d();
    }

    public C19601a(ThreadFactory threadFactory) {
        this.f61259c = threadFactory;
        start();
    }

    public void start() {
        C19434a c19434a = new C19434a(this.f61259c, f61257e, f61258f);
        if (!this.f61260d.compareAndSet(f61256b, c19434a)) {
            c19434a.m69913d();
        }
    }

    public void shutdown() {
        C19434a c19434a;
        do {
            c19434a = (C19434a) this.f61260d.get();
            if (c19434a == f61256b) {
                return;
            }
        } while (!this.f61260d.compareAndSet(c19434a, f61256b));
        c19434a.m69913d();
    }

    public a$a createWorker() {
        return new C19844b((C19434a) this.f61260d.get());
    }
}
