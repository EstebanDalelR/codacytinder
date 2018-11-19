package rx.internal.schedulers;

import com.facebook.ads.AdError;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import rx.Subscription;
import rx.a$a;
import rx.exceptions.C19410a;
import rx.functions.Action0;
import rx.internal.util.C19445f;
import rx.internal.util.C19615i;
import rx.internal.util.RxThreadFactory;
import rx.p498c.C19401c;
import rx.p500e.C19407e;
import rx.p500e.C19573b;

/* renamed from: rx.internal.schedulers.g */
public class C19755g extends a$a implements Subscription {
    /* renamed from: b */
    public static final int f61813b = Integer.getInteger("rx.scheduler.jdk6.purge-frequency-millis", AdError.NETWORK_ERROR_CODE).intValue();
    /* renamed from: d */
    private static final boolean f61814d;
    /* renamed from: e */
    private static final ConcurrentHashMap<ScheduledThreadPoolExecutor, ScheduledThreadPoolExecutor> f61815e = new ConcurrentHashMap();
    /* renamed from: f */
    private static final AtomicReference<ScheduledExecutorService> f61816f = new AtomicReference();
    /* renamed from: g */
    private static volatile Object f61817g;
    /* renamed from: h */
    private static final Object f61818h = new Object();
    /* renamed from: a */
    volatile boolean f61819a;
    /* renamed from: c */
    private final ScheduledExecutorService f61820c;

    /* renamed from: rx.internal.schedulers.g$1 */
    static class C194361 implements Runnable {
        C194361() {
        }

        public void run() {
            C19755g.m71031c();
        }
    }

    static {
        boolean z = Boolean.getBoolean("rx.scheduler.jdk6.purge-force");
        int b = C19445f.m69981b();
        z = !z && (b == 0 || b >= 21);
        f61814d = z;
    }

    /* renamed from: a */
    public static void m71028a(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        while (((ScheduledExecutorService) f61816f.get()) == null) {
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge-"));
            if (f61816f.compareAndSet(null, newScheduledThreadPool)) {
                newScheduledThreadPool.scheduleAtFixedRate(new C194361(), (long) f61813b, (long) f61813b, TimeUnit.MILLISECONDS);
                break;
            }
            newScheduledThreadPool.shutdownNow();
        }
        f61815e.putIfAbsent(scheduledThreadPoolExecutor, scheduledThreadPoolExecutor);
    }

    /* renamed from: a */
    public static void m71027a(ScheduledExecutorService scheduledExecutorService) {
        f61815e.remove(scheduledExecutorService);
    }

    /* renamed from: c */
    static void m71031c() {
        try {
            Iterator it = f61815e.keySet().iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    it.remove();
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        } catch (Throwable th) {
            C19410a.m69874b(th);
            C19401c.m69811a(th);
        }
    }

    /* renamed from: b */
    public static boolean m71029b(ScheduledExecutorService scheduledExecutorService) {
        if (f61814d) {
            Method c;
            if (scheduledExecutorService instanceof ScheduledThreadPoolExecutor) {
                Object obj = f61817g;
                if (obj == f61818h) {
                    return false;
                }
                if (obj == null) {
                    Object obj2;
                    c = C19755g.m71030c(scheduledExecutorService);
                    if (c != null) {
                        obj2 = c;
                    } else {
                        obj2 = f61818h;
                    }
                    f61817g = obj2;
                } else {
                    c = (Method) obj;
                }
            } else {
                c = C19755g.m71030c(scheduledExecutorService);
            }
            if (c != null) {
                try {
                    c.invoke(scheduledExecutorService, new Object[]{Boolean.valueOf(true)});
                    return true;
                } catch (Throwable e) {
                    C19401c.m69811a(e);
                } catch (Throwable e2) {
                    C19401c.m69811a(e2);
                } catch (Throwable e22) {
                    C19401c.m69811a(e22);
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    static Method m71030c(ScheduledExecutorService scheduledExecutorService) {
        for (Method method : scheduledExecutorService.getClass().getMethods()) {
            if (method.getName().equals("setRemoveOnCancelPolicy")) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0] == Boolean.TYPE) {
                    return method;
                }
            }
        }
        return null;
    }

    public C19755g(ThreadFactory threadFactory) {
        threadFactory = Executors.newScheduledThreadPool(1, threadFactory);
        if (!C19755g.m71029b(threadFactory) && (threadFactory instanceof ScheduledThreadPoolExecutor)) {
            C19755g.m71028a((ScheduledThreadPoolExecutor) threadFactory);
        }
        this.f61820c = threadFactory;
    }

    /* renamed from: a */
    public Subscription mo14740a(Action0 action0) {
        return mo14741a(action0, 0, null);
    }

    /* renamed from: a */
    public Subscription mo14741a(Action0 action0, long j, TimeUnit timeUnit) {
        if (this.f61819a) {
            return C19407e.m69855b();
        }
        return m71036b(action0, j, timeUnit);
    }

    /* renamed from: b */
    public ScheduledAction m71036b(Action0 action0, long j, TimeUnit timeUnit) {
        Future submit;
        ScheduledAction scheduledAction = new ScheduledAction(C19401c.m69809a(action0));
        if (j <= 0) {
            submit = this.f61820c.submit(scheduledAction);
        } else {
            submit = this.f61820c.schedule(scheduledAction, j, timeUnit);
        }
        scheduledAction.m70609a(submit);
        return scheduledAction;
    }

    /* renamed from: a */
    public ScheduledAction m71034a(Action0 action0, long j, TimeUnit timeUnit, C19573b c19573b) {
        Future submit;
        Subscription scheduledAction = new ScheduledAction(C19401c.m69809a(action0), c19573b);
        c19573b.m70548a(scheduledAction);
        if (j <= 0) {
            submit = this.f61820c.submit(scheduledAction);
        } else {
            submit = this.f61820c.schedule(scheduledAction, j, timeUnit);
        }
        scheduledAction.m70609a(submit);
        return scheduledAction;
    }

    /* renamed from: a */
    public ScheduledAction m71035a(Action0 action0, long j, TimeUnit timeUnit, C19615i c19615i) {
        Future submit;
        Subscription scheduledAction = new ScheduledAction(C19401c.m69809a(action0), c19615i);
        c19615i.m70647a(scheduledAction);
        if (j <= 0) {
            submit = this.f61820c.submit(scheduledAction);
        } else {
            submit = this.f61820c.schedule(scheduledAction, j, timeUnit);
        }
        scheduledAction.m70609a(submit);
        return scheduledAction;
    }

    public void unsubscribe() {
        this.f61819a = true;
        this.f61820c.shutdownNow();
        C19755g.m71027a(this.f61820c);
    }

    public boolean isUnsubscribed() {
        return this.f61819a;
    }
}
