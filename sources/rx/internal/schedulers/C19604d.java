package rx.internal.schedulers;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: rx.internal.schedulers.d */
public final class C19604d implements SchedulerLifecycle {
    /* renamed from: a */
    public static final C19604d f61267a = new C19604d();
    /* renamed from: b */
    private static final ScheduledExecutorService[] f61268b = new ScheduledExecutorService[0];
    /* renamed from: c */
    private static final ScheduledExecutorService f61269c = Executors.newScheduledThreadPool(0);
    /* renamed from: e */
    private static int f61270e;
    /* renamed from: d */
    private final AtomicReference<ScheduledExecutorService[]> f61271d = new AtomicReference(f61268b);

    static {
        f61269c.shutdown();
    }

    private C19604d() {
        start();
    }

    public void start() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (availableProcessors > 4) {
            availableProcessors /= 2;
        }
        if (availableProcessors > 8) {
            availableProcessors = 8;
        }
        Object obj = new ScheduledExecutorService[availableProcessors];
        int i = 0;
        for (int i2 = 0; i2 < availableProcessors; i2++) {
            obj[i2] = GenericScheduledExecutorServiceFactory.create();
        }
        if (this.f61271d.compareAndSet(f61268b, obj)) {
            availableProcessors = obj.length;
            while (i < availableProcessors) {
                ScheduledExecutorService scheduledExecutorService = obj[i];
                if (!C19755g.m71029b(scheduledExecutorService) && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
                    C19755g.m71028a((ScheduledThreadPoolExecutor) scheduledExecutorService);
                }
                i++;
            }
            return;
        }
        availableProcessors = obj.length;
        while (i < availableProcessors) {
            obj[i].shutdownNow();
            i++;
        }
    }

    public void shutdown() {
        ScheduledExecutorService[] scheduledExecutorServiceArr;
        do {
            scheduledExecutorServiceArr = (ScheduledExecutorService[]) this.f61271d.get();
            if (scheduledExecutorServiceArr == f61268b) {
                return;
            }
        } while (!this.f61271d.compareAndSet(scheduledExecutorServiceArr, f61268b));
        for (ScheduledExecutorService scheduledExecutorService : scheduledExecutorServiceArr) {
            C19755g.m71027a(scheduledExecutorService);
            scheduledExecutorService.shutdownNow();
        }
    }

    /* renamed from: a */
    public static ScheduledExecutorService m70616a() {
        ScheduledExecutorService[] scheduledExecutorServiceArr = (ScheduledExecutorService[]) f61267a.f61271d.get();
        if (scheduledExecutorServiceArr == f61268b) {
            return f61269c;
        }
        int i = f61270e + 1;
        if (i >= scheduledExecutorServiceArr.length) {
            i = 0;
        }
        f61270e = i;
        return scheduledExecutorServiceArr[i];
    }
}
