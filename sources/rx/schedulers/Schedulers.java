package rx.schedulers;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import rx.C2671a;
import rx.internal.schedulers.C19603c;
import rx.internal.schedulers.C19604d;
import rx.internal.schedulers.C19605e;
import rx.internal.schedulers.C19607i;
import rx.internal.schedulers.SchedulerLifecycle;
import rx.p498c.C19401c;
import rx.p498c.C19403f;
import rx.p498c.C19404g;

public final class Schedulers {
    /* renamed from: d */
    private static final AtomicReference<Schedulers> f8469d = new AtomicReference();
    /* renamed from: a */
    private final C2671a f8470a;
    /* renamed from: b */
    private final C2671a f8471b;
    /* renamed from: c */
    private final C2671a f8472c;

    /* renamed from: c */
    private static Schedulers m10406c() {
        while (true) {
            Schedulers schedulers = (Schedulers) f8469d.get();
            if (schedulers != null) {
                return schedulers;
            }
            schedulers = new Schedulers();
            if (f8469d.compareAndSet(null, schedulers)) {
                return schedulers;
            }
            schedulers.m10408b();
        }
    }

    private Schedulers() {
        C19404g f = C19403f.a().f();
        C2671a d = f.d();
        if (d != null) {
            this.f8470a = d;
        } else {
            this.f8470a = C19404g.a();
        }
        d = f.e();
        if (d != null) {
            this.f8471b = d;
        } else {
            this.f8471b = C19404g.b();
        }
        C2671a f2 = f.f();
        if (f2 != null) {
            this.f8472c = f2;
        } else {
            this.f8472c = C19404g.c();
        }
    }

    public static C2671a immediate() {
        return C19605e.f61272a;
    }

    public static C2671a trampoline() {
        return C19607i.f61274a;
    }

    public static C2671a newThread() {
        return C19401c.c(m10406c().f8472c);
    }

    public static C2671a computation() {
        return C19401c.a(m10406c().f8470a);
    }

    public static C2671a io() {
        return C19401c.b(m10406c().f8471b);
    }

    public static TestScheduler test() {
        return new TestScheduler();
    }

    public static C2671a from(Executor executor) {
        return new C19603c(executor);
    }

    public static void reset() {
        Schedulers schedulers = (Schedulers) f8469d.getAndSet(null);
        if (schedulers != null) {
            schedulers.m10408b();
        }
    }

    public static void start() {
        Schedulers c = m10406c();
        c.m10407a();
        synchronized (c) {
            C19604d.f61267a.start();
        }
    }

    public static void shutdown() {
        Schedulers c = m10406c();
        c.m10408b();
        synchronized (c) {
            C19604d.f61267a.shutdown();
        }
    }

    /* renamed from: a */
    synchronized void m10407a() {
        if (this.f8470a instanceof SchedulerLifecycle) {
            ((SchedulerLifecycle) this.f8470a).start();
        }
        if (this.f8471b instanceof SchedulerLifecycle) {
            ((SchedulerLifecycle) this.f8471b).start();
        }
        if (this.f8472c instanceof SchedulerLifecycle) {
            ((SchedulerLifecycle) this.f8472c).start();
        }
    }

    /* renamed from: b */
    synchronized void m10408b() {
        if (this.f8470a instanceof SchedulerLifecycle) {
            ((SchedulerLifecycle) this.f8470a).shutdown();
        }
        if (this.f8471b instanceof SchedulerLifecycle) {
            ((SchedulerLifecycle) this.f8471b).shutdown();
        }
        if (this.f8472c instanceof SchedulerLifecycle) {
            ((SchedulerLifecycle) this.f8472c).shutdown();
        }
    }
}
