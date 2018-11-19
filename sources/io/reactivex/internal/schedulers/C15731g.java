package io.reactivex.internal.schedulers;

import io.reactivex.p079d.C2667a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.schedulers.g */
public final class C15731g {
    /* renamed from: a */
    public static final boolean f48638a;
    /* renamed from: b */
    public static final int f48639b;
    /* renamed from: c */
    static final AtomicReference<ScheduledExecutorService> f48640c = new AtomicReference();
    /* renamed from: d */
    static final Map<ScheduledThreadPoolExecutor, Object> f48641d = new ConcurrentHashMap();

    /* renamed from: io.reactivex.internal.schedulers.g$a */
    static final class C15730a implements Runnable {
        C15730a() {
        }

        public void run() {
            try {
                Iterator it = new ArrayList(C15731g.f48641d.keySet()).iterator();
                while (it.hasNext()) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                    if (scheduledThreadPoolExecutor.isShutdown()) {
                        C15731g.f48641d.remove(scheduledThreadPoolExecutor);
                    } else {
                        scheduledThreadPoolExecutor.purge();
                    }
                }
            } catch (Throwable th) {
                C2667a.a(th);
            }
        }
    }

    static {
        Properties properties = System.getProperties();
        int i = 1;
        boolean z = properties.containsKey("rx2.purge-enabled") ? Boolean.getBoolean("rx2.purge-enabled") : true;
        if (z && properties.containsKey("rx2.purge-period-seconds")) {
            i = Integer.getInteger("rx2.purge-period-seconds", 1).intValue();
        }
        f48638a = z;
        f48639b = i;
        C15731g.m58953a();
    }

    /* renamed from: a */
    public static void m58953a() {
        if (f48638a) {
            while (true) {
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) f48640c.get();
                if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
                    ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge"));
                    if (f48640c.compareAndSet(scheduledExecutorService, newScheduledThreadPool)) {
                        newScheduledThreadPool.scheduleAtFixedRate(new C15730a(), (long) f48639b, (long) f48639b, TimeUnit.SECONDS);
                        return;
                    }
                    newScheduledThreadPool.shutdownNow();
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static ScheduledExecutorService m58952a(ThreadFactory threadFactory) {
        threadFactory = Executors.newScheduledThreadPool(1, threadFactory);
        if (f48638a && (threadFactory instanceof ScheduledThreadPoolExecutor)) {
            f48641d.put((ScheduledThreadPoolExecutor) threadFactory, threadFactory);
        }
        return threadFactory;
    }
}
