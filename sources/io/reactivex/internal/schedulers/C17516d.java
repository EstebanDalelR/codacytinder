package io.reactivex.internal.schedulers;

import io.reactivex.C15679f;
import io.reactivex.C15679f.C17362c;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.C17356a;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.schedulers.d */
public final class C17516d extends C15679f {
    /* renamed from: b */
    static final RxThreadFactory f54121b;
    /* renamed from: c */
    static final RxThreadFactory f54122c;
    /* renamed from: d */
    static final C19035c f54123d = new C19035c(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
    /* renamed from: g */
    static final C15729a f54124g = new C15729a(0, null, f54121b);
    /* renamed from: h */
    private static final TimeUnit f54125h = TimeUnit.SECONDS;
    /* renamed from: e */
    final ThreadFactory f54126e;
    /* renamed from: f */
    final AtomicReference<C15729a> f54127f;

    /* renamed from: io.reactivex.internal.schedulers.d$a */
    static final class C15729a implements Runnable {
        /* renamed from: a */
        final C17356a f48632a;
        /* renamed from: b */
        private final long f48633b;
        /* renamed from: c */
        private final ConcurrentLinkedQueue<C19035c> f48634c;
        /* renamed from: d */
        private final ScheduledExecutorService f48635d;
        /* renamed from: e */
        private final Future<?> f48636e;
        /* renamed from: f */
        private final ThreadFactory f48637f;

        C15729a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            Future scheduleWithFixedDelay;
            this.f48633b = timeUnit != null ? timeUnit.toNanos(j) : 0;
            this.f48634c = new ConcurrentLinkedQueue();
            this.f48632a = new C17356a();
            this.f48637f = threadFactory;
            j = null;
            if (timeUnit != null) {
                j = Executors.newScheduledThreadPool(1, C17516d.f54122c);
                scheduleWithFixedDelay = j.scheduleWithFixedDelay(this, this.f48633b, this.f48633b, TimeUnit.NANOSECONDS);
            } else {
                scheduleWithFixedDelay = null;
            }
            this.f48635d = j;
            this.f48636e = scheduleWithFixedDelay;
        }

        public void run() {
            m58949b();
        }

        /* renamed from: a */
        C19035c m58947a() {
            if (this.f48632a.isDisposed()) {
                return C17516d.f54123d;
            }
            while (!this.f48634c.isEmpty()) {
                C19035c c19035c = (C19035c) this.f48634c.poll();
                if (c19035c != null) {
                    return c19035c;
                }
            }
            Object c19035c2 = new C19035c(this.f48637f);
            this.f48632a.add(c19035c2);
            return c19035c2;
        }

        /* renamed from: a */
        void m58948a(C19035c c19035c) {
            c19035c.m67644a(m58950c() + this.f48633b);
            this.f48634c.offer(c19035c);
        }

        /* renamed from: b */
        void m58949b() {
            if (!this.f48634c.isEmpty()) {
                long c = m58950c();
                Iterator it = this.f48634c.iterator();
                while (it.hasNext()) {
                    C19035c c19035c = (C19035c) it.next();
                    if (c19035c.m67643a() > c) {
                        return;
                    }
                    if (this.f48634c.remove(c19035c)) {
                        this.f48632a.remove(c19035c);
                    }
                }
            }
        }

        /* renamed from: c */
        long m58950c() {
            return System.nanoTime();
        }

        /* renamed from: d */
        void m58951d() {
            this.f48632a.dispose();
            if (this.f48636e != null) {
                this.f48636e.cancel(true);
            }
            if (this.f48635d != null) {
                this.f48635d.shutdownNow();
            }
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.d$b */
    static final class C18425b extends C17362c {
        /* renamed from: a */
        final AtomicBoolean f57372a = new AtomicBoolean();
        /* renamed from: b */
        private final C17356a f57373b;
        /* renamed from: c */
        private final C15729a f57374c;
        /* renamed from: d */
        private final C19035c f57375d;

        C18425b(C15729a c15729a) {
            this.f57374c = c15729a;
            this.f57373b = new C17356a();
            this.f57375d = c15729a.m58947a();
        }

        public void dispose() {
            if (this.f57372a.compareAndSet(false, true)) {
                this.f57373b.dispose();
                this.f57374c.m58948a(this.f57375d);
            }
        }

        public boolean isDisposed() {
            return this.f57372a.get();
        }

        @NonNull
        /* renamed from: a */
        public Disposable mo13559a(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
            if (this.f57373b.isDisposed()) {
                return EmptyDisposable.INSTANCE;
            }
            return this.f57375d.m66588a(runnable, j, timeUnit, this.f57373b);
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.d$c */
    static final class C19035c extends C18426f {
        /* renamed from: b */
        private long f59091b = 0;

        C19035c(ThreadFactory threadFactory) {
            super(threadFactory);
        }

        /* renamed from: a */
        public long m67643a() {
            return this.f59091b;
        }

        /* renamed from: a */
        public void m67644a(long j) {
            this.f59091b = j;
        }
    }

    static {
        f54123d.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        f54121b = new RxThreadFactory("RxCachedThreadScheduler", max);
        f54122c = new RxThreadFactory("RxCachedWorkerPoolEvictor", max);
        f54124g.m58951d();
    }

    public C17516d() {
        this(f54121b);
    }

    public C17516d(ThreadFactory threadFactory) {
        this.f54126e = threadFactory;
        this.f54127f = new AtomicReference(f54124g);
        mo12921b();
    }

    /* renamed from: b */
    public void mo12921b() {
        C15729a c15729a = new C15729a(60, f54125h, this.f54126e);
        if (!this.f54127f.compareAndSet(f54124g, c15729a)) {
            c15729a.m58951d();
        }
    }

    @NonNull
    /* renamed from: a */
    public C17362c mo12872a() {
        return new C18425b((C15729a) this.f54127f.get());
    }
}
