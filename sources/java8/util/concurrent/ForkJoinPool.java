package java8.util.concurrent;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import java.lang.Thread.State;
import java.lang.Thread.UncaughtExceptionHandler;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;
import java.security.PrivilegedAction;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;
import java8.util.Objects;
import java8.util.function.Predicate;
import sun.misc.Unsafe;

public class ForkJoinPool extends AbstractExecutorService {
    /* renamed from: a */
    public static final ForkJoinWorkerThreadFactory f48812a = new DefaultForkJoinWorkerThreadFactory();
    /* renamed from: b */
    static final RuntimePermission f48813b = new RuntimePermission("modifyThread");
    /* renamed from: c */
    static final ForkJoinPool f48814c = ((ForkJoinPool) AccessController.doPrivileged(new C157671()));
    /* renamed from: d */
    static final int f48815d = Math.max(f48814c.f48829j & 65535, 1);
    /* renamed from: p */
    private static final int f48816p;
    /* renamed from: q */
    private static int f48817q;
    /* renamed from: r */
    private static final Unsafe f48818r = UnsafeAccess.f48872a;
    /* renamed from: s */
    private static final long f48819s;
    /* renamed from: t */
    private static final long f48820t;
    /* renamed from: u */
    private static final int f48821u;
    /* renamed from: v */
    private static final int f48822v;
    /* renamed from: w */
    private static final Class<?> f48823w;
    /* renamed from: e */
    volatile long f48824e;
    /* renamed from: f */
    volatile long f48825f;
    /* renamed from: g */
    final long f48826g;
    /* renamed from: h */
    int f48827h;
    /* renamed from: i */
    final int f48828i;
    /* renamed from: j */
    volatile int f48829j;
    /* renamed from: k */
    WorkQueue[] f48830k;
    /* renamed from: l */
    final String f48831l;
    /* renamed from: m */
    final ForkJoinWorkerThreadFactory f48832m;
    /* renamed from: n */
    final UncaughtExceptionHandler f48833n;
    /* renamed from: o */
    final Predicate<? super ForkJoinPool> f48834o;

    /* renamed from: java8.util.concurrent.ForkJoinPool$1 */
    static class C157671 implements PrivilegedAction<ForkJoinPool> {
        C157671() {
        }

        public /* synthetic */ Object run() {
            return m59219a();
        }

        /* renamed from: a */
        public ForkJoinPool m59219a() {
            return new ForkJoinPool();
        }
    }

    public interface ForkJoinWorkerThreadFactory {
        ForkJoinWorkerThread newThread(ForkJoinPool forkJoinPool);
    }

    public interface ManagedBlocker {
        boolean block() throws InterruptedException;

        boolean isReleasable();
    }

    static final class MemBar {
        /* renamed from: a */
        private static final AtomicInteger f48795a = new AtomicInteger();
        /* renamed from: b */
        private static final Unsafe f48796b = UnsafeAccess.f48872a;
        /* renamed from: c */
        private static final long f48797c;

        static {
            try {
                f48797c = f48796b.objectFieldOffset(AtomicInteger.class.getDeclaredField("value"));
            } catch (Throwable e) {
                throw new Error(e);
            }
        }

        /* renamed from: a */
        static void m59222a() {
            f48796b.putOrderedInt(f48795a, f48797c, 0);
        }

        /* renamed from: b */
        static void m59223b() {
            f48796b.putIntVolatile(f48795a, f48797c, 0);
        }

        private MemBar() {
        }
    }

    static final class WorkQueue {
        /* renamed from: k */
        private static final Unsafe f48798k = UnsafeAccess.f48872a;
        /* renamed from: l */
        private static final long f48799l;
        /* renamed from: m */
        private static final int f48800m;
        /* renamed from: n */
        private static final int f48801n;
        /* renamed from: a */
        volatile int f48802a;
        /* renamed from: b */
        int f48803b;
        /* renamed from: c */
        int f48804c;
        /* renamed from: d */
        int f48805d;
        /* renamed from: e */
        volatile int f48806e;
        /* renamed from: f */
        volatile int f48807f = 4096;
        /* renamed from: g */
        int f48808g = 4096;
        /* renamed from: h */
        ForkJoinTask<?>[] f48809h;
        /* renamed from: i */
        final ForkJoinPool f48810i;
        /* renamed from: j */
        final ForkJoinWorkerThread f48811j;

        WorkQueue(ForkJoinPool forkJoinPool, ForkJoinWorkerThread forkJoinWorkerThread) {
            this.f48810i = forkJoinPool;
            this.f48811j = forkJoinWorkerThread;
        }

        /* renamed from: a */
        final int m59225a() {
            int i = this.f48807f - this.f48808g;
            return i >= 0 ? 0 : -i;
        }

        /* renamed from: a */
        final void m59228a(ForkJoinTask<?> forkJoinTask) {
            int i = this.f48808g;
            Object obj = this.f48809h;
            if (obj != null) {
                int length = obj.length;
                if (length > 0) {
                    long j = (((long) ((length - 1) & i)) << f48801n) + ((long) f48800m);
                    ForkJoinPool forkJoinPool = this.f48810i;
                    this.f48808g = i + 1;
                    f48798k.putOrderedObject(obj, j, forkJoinTask);
                    forkJoinTask = this.f48807f - i;
                    if (forkJoinTask == null && forkJoinPool != null) {
                        MemBar.m59223b();
                        forkJoinPool.m59258a();
                    } else if (forkJoinTask + length == 1) {
                        m59232b();
                    }
                }
            }
        }

        /* renamed from: b */
        final ForkJoinTask<?>[] m59232b() {
            Object obj = this.f48809h;
            int length = obj != null ? obj.length : 0;
            int i = length > 0 ? length << 1 : 8192;
            if (i >= 8192) {
                if (i <= 67108864) {
                    ForkJoinTask<?>[] forkJoinTaskArr = new ForkJoinTask[i];
                    this.f48809h = forkJoinTaskArr;
                    if (obj != null) {
                        int i2 = length - 1;
                        if (i2 > 0) {
                            int i3 = this.f48808g;
                            length = this.f48807f;
                            if (i3 - length > 0) {
                                int i4 = i - 1;
                                int i5 = length;
                                do {
                                    long j = (((long) (i5 & i2)) << f48801n) + ((long) f48800m);
                                    ForkJoinTask forkJoinTask = (ForkJoinTask) f48798k.getObjectVolatile(obj, j);
                                    if (forkJoinTask != null && f48798k.compareAndSwapObject(obj, j, forkJoinTask, null)) {
                                        forkJoinTaskArr[i5 & i4] = forkJoinTask;
                                    }
                                    i5++;
                                } while (i5 != i3);
                                MemBar.m59222a();
                            }
                        }
                    }
                    return forkJoinTaskArr;
                }
            }
            throw new RejectedExecutionException("Queue capacity exceeded");
        }

        /* renamed from: c */
        final ForkJoinTask<?> m59233c() {
            while (true) {
                int i = this.f48807f;
                int i2 = this.f48808g;
                Object obj = this.f48809h;
                if (obj == null) {
                    break;
                }
                i2 = i - i2;
                if (i2 >= 0) {
                    break;
                }
                int length = obj.length;
                if (length <= 0) {
                    break;
                }
                long j = (((long) ((length - 1) & i)) << f48801n) + ((long) f48800m);
                ForkJoinTask<?> forkJoinTask = (ForkJoinTask) f48798k.getObjectVolatile(obj, j);
                int i3 = i + 1;
                if (i == this.f48807f) {
                    if (forkJoinTask != null) {
                        if (f48798k.compareAndSwapObject(obj, j, forkJoinTask, null)) {
                            this.f48807f = i3;
                            return forkJoinTask;
                        }
                    } else if (i2 == -1) {
                        break;
                    }
                }
            }
            return null;
        }

        /* renamed from: b */
        final boolean m59231b(ForkJoinTask<?> forkJoinTask) {
            int i = this.f48807f;
            int i2 = this.f48808g;
            Object obj = this.f48809h;
            if (!(obj == null || i == i2)) {
                i = obj.length;
                if (i > 0) {
                    i2--;
                    if (f48798k.compareAndSwapObject(obj, (((long) ((i - 1) & i2)) << f48801n) + ((long) f48800m), forkJoinTask, null) != null) {
                        this.f48808g = i2;
                        MemBar.m59222a();
                        return true;
                    }
                }
            }
            return null;
        }

        /* renamed from: d */
        final void m59235d() {
            while (true) {
                ForkJoinTask c = m59233c();
                if (c != null) {
                    ForkJoinTask.m59267a(c);
                } else {
                    return;
                }
            }
        }

        /* renamed from: a */
        private static Object m59224a(Object obj, long j, Object obj2) {
            Object objectVolatile;
            do {
                objectVolatile = f48798k.getObjectVolatile(obj, j);
            } while (!f48798k.compareAndSwapObject(obj, j, objectVolatile, obj2));
            return objectVolatile;
        }

        /* renamed from: a */
        final void m59227a(int i) {
            while (true) {
                int i2 = this.f48807f;
                int i3 = this.f48808g;
                Object obj = this.f48809h;
                if (obj != null && i2 != i3) {
                    i2 = obj.length;
                    if (i2 > 0) {
                        i3--;
                        ForkJoinTask forkJoinTask = (ForkJoinTask) m59224a(obj, (((long) ((i2 - 1) & i3)) << f48801n) + ((long) f48800m), null);
                        if (forkJoinTask != null) {
                            this.f48808g = i3;
                            MemBar.m59222a();
                            forkJoinTask.m59283h();
                            if (i != 0) {
                                i--;
                                if (i == 0) {
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }

        /* renamed from: b */
        final void m59230b(int i) {
            int i2;
            do {
                int i3 = 0;
                while (true) {
                    int i4 = this.f48807f;
                    i2 = this.f48808g;
                    Object obj = this.f48809h;
                    if (obj != null) {
                        i2 = i4 - i2;
                        if (i2 < 0) {
                            int length = obj.length;
                            if (length > 0) {
                                int i5 = i4 + 1;
                                ForkJoinTask forkJoinTask = (ForkJoinTask) m59224a(obj, (((long) (i4 & (length - 1))) << f48801n) + ((long) f48800m), null);
                                if (forkJoinTask != null) {
                                    this.f48807f = i5;
                                    forkJoinTask.m59283h();
                                    if (i != 0) {
                                        i3++;
                                        if (i3 == i) {
                                            return;
                                        }
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
            } while (i2 != -1);
        }

        /* renamed from: c */
        final void m59234c(ForkJoinTask<?> forkJoinTask) {
            int i = this.f48807f;
            int i2 = this.f48808g;
            if (i - i2 < 0) {
                Object obj = this.f48809h;
                if (obj != null) {
                    int length = obj.length;
                    if (length > 0) {
                        long j;
                        ForkJoinTask<?> forkJoinTask2;
                        int i3 = length - 1;
                        i2--;
                        int i4 = i2;
                        while (true) {
                            j = (long) (((i4 & i3) << f48801n) + f48800m);
                            forkJoinTask2 = (ForkJoinTask) f48798k.getObject(obj, j);
                            if (forkJoinTask2 != null) {
                                if (forkJoinTask2 == forkJoinTask) {
                                    break;
                                }
                                i4--;
                            } else {
                                return;
                            }
                        }
                        if (f48798k.compareAndSwapObject(obj, j, forkJoinTask2, null) != null) {
                            this.f48808g = i2;
                            while (i4 != i2) {
                                forkJoinTask = i4 + 1;
                                long j2 = (long) (((forkJoinTask & i3) << f48801n) + f48800m);
                                ForkJoinTask forkJoinTask3 = (ForkJoinTask) f48798k.getObject(obj, j2);
                                f48798k.putObjectVolatile(obj, j2, null);
                                f48798k.putOrderedObject(obj, (long) (((i4 & i3) << f48801n) + f48800m), forkJoinTask3);
                                i4 = forkJoinTask;
                            }
                            MemBar.m59222a();
                            forkJoinTask2.m59283h();
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        final int m59226a(CountedCompleter<?> countedCompleter, int i) {
            if (countedCompleter == null) {
                return 0;
            }
            int i2 = countedCompleter.n;
            if (i2 < 0) {
                return i2;
            }
            int i3;
            while (true) {
                Object obj;
                i2 = this.f48807f;
                i3 = this.f48808g;
                Object obj2 = this.f48809h;
                if (obj2 != null && i2 != i3) {
                    i2 = obj2.length;
                    if (i2 > 0) {
                        i3--;
                        long j = (((long) ((i2 - 1) & i3)) << f48801n) + ((long) f48800m);
                        ForkJoinTask forkJoinTask = (ForkJoinTask) f48798k.getObject(obj2, j);
                        if (forkJoinTask instanceof CountedCompleter) {
                            CountedCompleter<?> countedCompleter2 = (CountedCompleter) forkJoinTask;
                            CountedCompleter<?> countedCompleter3 = countedCompleter2;
                            while (countedCompleter3 != countedCompleter) {
                                countedCompleter3 = countedCompleter3.f54338l;
                                if (countedCompleter3 == null) {
                                    break;
                                }
                            }
                            if (f48798k.compareAndSwapObject(obj2, j, countedCompleter2, null)) {
                                this.f48808g = i3;
                                MemBar.m59222a();
                                countedCompleter2.m59283h();
                                obj = 1;
                                i3 = countedCompleter.n;
                                if (i3 < 0 || r1 == null) {
                                    break;
                                } else if (i != 0) {
                                    i--;
                                    if (i == 0) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                obj = null;
                i3 = countedCompleter.n;
                if (i != 0) {
                    i--;
                    if (i == 0) {
                        break;
                    }
                }
            }
            return i3;
        }

        /* renamed from: e */
        final boolean m59237e() {
            return f48798k.compareAndSwapInt(this, f48799l, 0, 1);
        }

        /* renamed from: d */
        final boolean m59236d(ForkJoinTask<?> forkJoinTask) {
            boolean z = true;
            int i = this.f48808g - 1;
            Object obj = this.f48809h;
            if (obj != null) {
                int length = obj.length;
                if (length > 0) {
                    long j = (((long) ((length - 1) & i)) << f48801n) + ((long) f48800m);
                    if (((ForkJoinTask) f48798k.getObject(obj, j)) == forkJoinTask && f48798k.compareAndSwapInt(this, f48799l, 0, 1)) {
                        if (this.f48808g == i + 1 && this.f48809h == obj && f48798k.compareAndSwapObject(obj, j, forkJoinTask, null)) {
                            this.f48808g = i;
                        } else {
                            z = false;
                        }
                        f48798k.putOrderedInt(this, f48799l, 0);
                        return z;
                    }
                }
            }
            return false;
        }

        /* renamed from: b */
        final int m59229b(CountedCompleter<?> countedCompleter, int i) {
            WorkQueue workQueue = this;
            CountedCompleter<?> countedCompleter2 = countedCompleter;
            if (countedCompleter2 == null) {
                return 0;
            }
            int i2 = countedCompleter2.n;
            if (i2 < 0) {
                return i2;
            }
            int i3;
            int i4 = i;
            while (true) {
                Object obj;
                i2 = workQueue.f48807f;
                int i5 = workQueue.f48808g;
                Object obj2 = workQueue.f48809h;
                if (obj2 != null && i2 != i5) {
                    i2 = obj2.length;
                    if (i2 > 0) {
                        int i6 = i5 - 1;
                        long j = (((long) ((i2 - 1) & i6)) << f48801n) + ((long) f48800m);
                        ForkJoinTask forkJoinTask = (ForkJoinTask) f48798k.getObject(obj2, j);
                        if (forkJoinTask instanceof CountedCompleter) {
                            CountedCompleter<?> countedCompleter3 = (CountedCompleter) forkJoinTask;
                            CountedCompleter<?> countedCompleter4 = countedCompleter3;
                            while (countedCompleter4 != countedCompleter2) {
                                countedCompleter4 = countedCompleter4.f54338l;
                                if (countedCompleter4 == null) {
                                    break;
                                }
                            }
                            if (f48798k.compareAndSwapInt(workQueue, f48799l, 0, 1)) {
                                CountedCompleter countedCompleter5;
                                if (workQueue.f48808g == i5 && workQueue.f48809h == obj2) {
                                    countedCompleter5 = countedCompleter3;
                                    i5 = i6;
                                    if (f48798k.compareAndSwapObject(obj2, j, countedCompleter5, null)) {
                                        workQueue.f48808g = i5;
                                        obj = 1;
                                        f48798k.putOrderedInt(workQueue, f48799l, 0);
                                        if (obj != null) {
                                            countedCompleter5.m59283h();
                                        }
                                        i3 = countedCompleter2.n;
                                        if (i3 < 0 || r0 == null) {
                                            break;
                                        } else if (i4 == 0) {
                                            i4--;
                                            if (i4 != 0) {
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    countedCompleter5 = countedCompleter3;
                                }
                                obj = null;
                                f48798k.putOrderedInt(workQueue, f48799l, 0);
                                if (obj != null) {
                                    countedCompleter5.m59283h();
                                }
                                i3 = countedCompleter2.n;
                                if (i4 == 0) {
                                    i4--;
                                    if (i4 != 0) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                obj = null;
                i3 = countedCompleter2.n;
                if (i4 == 0) {
                    i4--;
                    if (i4 != 0) {
                        break;
                    }
                }
            }
            return i3;
        }

        /* renamed from: f */
        final boolean m59238f() {
            Thread thread = this.f48811j;
            if (thread != null) {
                State state = thread.getState();
                if (!(state == State.BLOCKED || state == State.WAITING || state == State.TIMED_WAITING)) {
                    return true;
                }
            }
            return false;
        }

        static {
            try {
                f48799l = f48798k.objectFieldOffset(WorkQueue.class.getDeclaredField("a"));
                f48800m = f48798k.arrayBaseOffset(ForkJoinTask[].class);
                int arrayIndexScale = f48798k.arrayIndexScale(ForkJoinTask[].class);
                if (((arrayIndexScale - 1) & arrayIndexScale) != 0) {
                    throw new Error("array index scale not a power of two");
                }
                f48801n = 31 - Integer.numberOfLeadingZeros(arrayIndexScale);
            } catch (Throwable e) {
                throw new Error(e);
            }
        }
    }

    private static final class DefaultForkJoinWorkerThreadFactory implements ForkJoinWorkerThreadFactory {
        /* renamed from: a */
        private static final AccessControlContext f54340a = ForkJoinPool.m59241a(new RuntimePermission("getClassLoader"));

        private DefaultForkJoinWorkerThreadFactory() {
        }

        public final ForkJoinWorkerThread newThread(final ForkJoinPool forkJoinPool) {
            return (ForkJoinWorkerThread) AccessController.doPrivileged(new PrivilegedAction<ForkJoinWorkerThread>(this) {
                /* renamed from: b */
                final /* synthetic */ DefaultForkJoinWorkerThreadFactory f48792b;

                public /* synthetic */ Object run() {
                    return m59220a();
                }

                /* renamed from: a */
                public ForkJoinWorkerThread m59220a() {
                    return new ForkJoinWorkerThread(forkJoinPool, ClassLoader.getSystemClassLoader());
                }
            }, f54340a);
        }
    }

    private static final class InnocuousForkJoinWorkerThreadFactory implements ForkJoinWorkerThreadFactory {
        /* renamed from: a */
        private static final AccessControlContext f54341a = ForkJoinPool.m59241a(ForkJoinPool.f48813b, new RuntimePermission("enableContextClassLoaderOverride"), new RuntimePermission("modifyThreadGroup"), new RuntimePermission("getClassLoader"), new RuntimePermission("setContextClassLoader"));

        private InnocuousForkJoinWorkerThreadFactory() {
        }

        public final ForkJoinWorkerThread newThread(final ForkJoinPool forkJoinPool) {
            return (ForkJoinWorkerThread) AccessController.doPrivileged(new PrivilegedAction<ForkJoinWorkerThread>(this) {
                /* renamed from: b */
                final /* synthetic */ InnocuousForkJoinWorkerThreadFactory f48794b;

                public /* synthetic */ Object run() {
                    return m59221a();
                }

                /* renamed from: a */
                public ForkJoinWorkerThread m59221a() {
                    return new InnocuousForkJoinWorkerThread(forkJoinPool);
                }
            }, f54341a);
        }
    }

    public /* synthetic */ Future submit(Runnable runnable) {
        return m59255a(runnable);
    }

    public /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return m59256a(runnable, obj);
    }

    public /* synthetic */ Future submit(Callable callable) {
        return m59257a(callable);
    }

    /* renamed from: d */
    private static void m59249d() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(f48813b);
        }
    }

    /* renamed from: a */
    static AccessControlContext m59241a(Permission... permissionArr) {
        PermissionCollection permissions = new Permissions();
        for (Permission add : permissionArr) {
            permissions.add(add);
        }
        return new AccessControlContext(new ProtectionDomain[]{new ProtectionDomain(null, permissions)});
    }

    /* renamed from: e */
    private static final synchronized int m59250e() {
        int i;
        synchronized (ForkJoinPool.class) {
            i = f48817q + 1;
            f48817q = i;
        }
        return i;
    }

    /* renamed from: a */
    static long m59239a(Object obj, long j, long j2) {
        long longVolatile;
        do {
            longVolatile = f48818r.getLongVolatile(obj, j);
        } while (!f48818r.compareAndSwapLong(obj, j, longVolatile, longVolatile + j2));
        return longVolatile;
    }

    /* renamed from: f */
    private boolean m59251f() {
        ForkJoinWorkerThread newThread;
        ForkJoinWorkerThreadFactory forkJoinWorkerThreadFactory = this.f48832m;
        Throwable th = null;
        if (forkJoinWorkerThreadFactory != null) {
            try {
                newThread = forkJoinWorkerThreadFactory.newThread(this);
                if (newThread != null) {
                    try {
                        newThread.start();
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                newThread = null;
            }
        } else {
            newThread = null;
        }
        m59261a(newThread, th);
        return false;
    }

    /* renamed from: a */
    private void m59243a(long j) {
        long j2 = j;
        do {
            long j3 = ((j2 + 281474976710656L) & -281474976710656L) | ((j2 + 4294967296L) & 281470681743360L);
            if (this.f48824e != j2 || f48818r.compareAndSwapLong(this, f48819s, j2, j3) == null) {
                j2 = this.f48824e;
                if ((j2 & 140737488355328L) == 0) {
                    return;
                }
            } else {
                m59251f();
                return;
            }
        } while (((int) j2) == null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    final java8.util.concurrent.ForkJoinPool.WorkQueue m59254a(java8.util.concurrent.ForkJoinWorkerThread r15) {
        /*
        r14 = this;
        r0 = 1;
        r15.setDaemon(r0);
        r1 = r14.f48833n;
        if (r1 == 0) goto L_0x000b;
    L_0x0008:
        r15.setUncaughtExceptionHandler(r1);
    L_0x000b:
        r1 = new java8.util.concurrent.ForkJoinPool$WorkQueue;
        r1.<init>(r14, r15);
        r2 = r14.f48829j;
        r3 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r2 = r2 & r3;
        r3 = r14.f48831l;
        if (r3 == 0) goto L_0x008b;
    L_0x0019:
        monitor-enter(r3);
        r4 = r14.f48830k;	 Catch:{ all -> 0x0088 }
        r5 = r14.f48827h;	 Catch:{ all -> 0x0088 }
        r6 = -1640531527; // 0xffffffff9e3779b9 float:-9.713111E-21 double:NaN;
        r5 = r5 + r6;
        r14.f48827h = r5;	 Catch:{ all -> 0x0088 }
        r6 = 0;
        if (r4 == 0) goto L_0x007b;
    L_0x0027:
        r7 = r4.length;	 Catch:{ all -> 0x0088 }
        if (r7 <= r0) goto L_0x007b;
    L_0x002a:
        r8 = r7 + -1;
        r9 = r5 & r8;
        r10 = r5 << 1;
        r10 = r10 | r0;
        r10 = r10 & r8;
        r11 = r7 >>> 1;
    L_0x0034:
        r12 = r4[r10];	 Catch:{ all -> 0x0088 }
        if (r12 == 0) goto L_0x004a;
    L_0x0038:
        r12 = r12.f48802a;	 Catch:{ all -> 0x0088 }
        r13 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r12 != r13) goto L_0x003f;
    L_0x003e:
        goto L_0x004a;
    L_0x003f:
        r11 = r11 + -1;
        if (r11 != 0) goto L_0x0046;
    L_0x0043:
        r10 = r7 | 1;
        goto L_0x004a;
    L_0x0046:
        r10 = r10 + 2;
        r10 = r10 & r8;
        goto L_0x0034;
    L_0x004a:
        r2 = r2 | r10;
        r8 = 1073610752; // 0x3ffe0000 float:1.984375 double:5.304341896E-315;
        r5 = r5 & r8;
        r2 = r2 | r5;
        r1.f48805d = r2;	 Catch:{ all -> 0x0088 }
        r1.f48802a = r2;	 Catch:{ all -> 0x0088 }
        if (r10 >= r7) goto L_0x0058;
    L_0x0055:
        r4[r10] = r1;	 Catch:{ all -> 0x0088 }
        goto L_0x007a;
    L_0x0058:
        r2 = r7 << 1;
        r5 = new java8.util.concurrent.ForkJoinPool.WorkQueue[r2];	 Catch:{ all -> 0x0088 }
        r5[r10] = r1;	 Catch:{ all -> 0x0088 }
        r2 = r2 - r0;
    L_0x005f:
        if (r6 >= r7) goto L_0x0078;
    L_0x0061:
        r0 = r4[r6];	 Catch:{ all -> 0x0088 }
        if (r0 == 0) goto L_0x006c;
    L_0x0065:
        r8 = r0.f48805d;	 Catch:{ all -> 0x0088 }
        r8 = r8 & r2;
        r8 = r8 & 126;
        r5[r8] = r0;	 Catch:{ all -> 0x0088 }
    L_0x006c:
        r6 = r6 + 1;
        if (r6 < r7) goto L_0x0071;
    L_0x0070:
        goto L_0x0078;
    L_0x0071:
        r0 = r4[r6];	 Catch:{ all -> 0x0088 }
        r5[r6] = r0;	 Catch:{ all -> 0x0088 }
        r6 = r6 + 1;
        goto L_0x005f;
    L_0x0078:
        r14.f48830k = r5;	 Catch:{ all -> 0x0088 }
    L_0x007a:
        r6 = r9;
    L_0x007b:
        monitor-exit(r3);	 Catch:{ all -> 0x0088 }
        r0 = java.lang.Integer.toString(r6);
        r0 = r3.concat(r0);
        r15.setName(r0);
        goto L_0x008b;
    L_0x0088:
        r15 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0088 }
        throw r15;
    L_0x008b:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.concurrent.ForkJoinPool.a(java8.util.concurrent.ForkJoinWorkerThread):java8.util.concurrent.ForkJoinPool$WorkQueue");
    }

    /* renamed from: a */
    final void m59261a(ForkJoinWorkerThread forkJoinWorkerThread, Throwable th) {
        int i;
        WorkQueue workQueue;
        Unsafe unsafe;
        long j;
        long j2;
        ForkJoinPool forkJoinPool = this;
        ForkJoinWorkerThread forkJoinWorkerThread2 = forkJoinWorkerThread;
        if (forkJoinWorkerThread2 != null) {
            WorkQueue workQueue2 = forkJoinWorkerThread2.f48846b;
            if (workQueue2 != null) {
                String str = forkJoinPool.f48831l;
                long j3 = ((long) workQueue2.f48804c) & 4294967295L;
                int i2 = workQueue2.f48805d & 65535;
                if (str != null) {
                    synchronized (str) {
                        try {
                            WorkQueue[] workQueueArr = forkJoinPool.f48830k;
                            if (workQueueArr != null && workQueueArr.length > i2 && workQueueArr[i2] == workQueue2) {
                                workQueueArr[i2] = null;
                            }
                            forkJoinPool.f48825f += j3;
                        } catch (Throwable th2) {
                            Throwable th3 = th2;
                        }
                    }
                }
                i = workQueue2.f48802a;
                workQueue = workQueue2;
                if (i != 1073741824) {
                    do {
                        unsafe = f48818r;
                        j = f48819s;
                        j2 = forkJoinPool.f48824e;
                    } while (!unsafe.compareAndSwapLong(forkJoinPool, j, j2, (((j2 - 281474976710656L) & -281474976710656L) | ((j2 - 4294967296L) & 281470681743360L)) | (j2 & 4294967295L)));
                }
                if (workQueue != null) {
                    workQueue.m59235d();
                }
                if (!(m59245a(false, false) || workQueue == null || workQueue.f48809h == null)) {
                    m59258a();
                }
                if (th != null) {
                    ForkJoinTask.m59275i();
                } else {
                    ForkJoinTask.m59270c(th);
                }
            }
            workQueue = workQueue2;
        } else {
            workQueue = null;
        }
        i = 0;
        if (i != 1073741824) {
            do {
                unsafe = f48818r;
                j = f48819s;
                j2 = forkJoinPool.f48824e;
            } while (!unsafe.compareAndSwapLong(forkJoinPool, j, j2, (((j2 - 281474976710656L) & -281474976710656L) | ((j2 - 4294967296L) & 281470681743360L)) | (j2 & 4294967295L)));
        } else if (workQueue != null) {
            workQueue.m59235d();
        }
        if (workQueue != null) {
            workQueue.m59235d();
        }
        m59258a();
        if (th != null) {
            ForkJoinTask.m59270c(th);
        } else {
            ForkJoinTask.m59275i();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    final void m59258a() {
        /*
        r17 = this;
        r8 = r17;
    L_0x0002:
        r4 = r8.f48824e;
        r0 = 0;
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 < 0) goto L_0x000b;
    L_0x000a:
        goto L_0x0065;
    L_0x000b:
        r2 = (int) r4;
        if (r2 != 0) goto L_0x001d;
    L_0x000e:
        r2 = 140737488355328; // 0x800000000000 float:0.0 double:6.953355807835E-310;
        r6 = r4 & r2;
        r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1));
        if (r2 == 0) goto L_0x0065;
    L_0x0019:
        r8.m59243a(r4);
        goto L_0x0065;
    L_0x001d:
        r0 = r8.f48830k;
        if (r0 != 0) goto L_0x0022;
    L_0x0021:
        goto L_0x0065;
    L_0x0022:
        r1 = r0.length;
        r3 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        r3 = r3 & r2;
        if (r1 > r3) goto L_0x002a;
    L_0x0029:
        goto L_0x0065;
    L_0x002a:
        r9 = r0[r3];
        if (r9 != 0) goto L_0x002f;
    L_0x002e:
        goto L_0x0065;
    L_0x002f:
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r10 = r2 & r0;
        r0 = r9.f48802a;
        r1 = r9.f48803b;
        r6 = (long) r1;
        r11 = 4294967295; // 0xffffffff float:NaN double:2.1219957905E-314;
        r13 = r6 & r11;
        r6 = -4294967296; // 0xffffffff00000000 float:0.0 double:NaN;
        r11 = 281474976710656; // 0x1000000000000 float:0.0 double:1.390671161567E-309;
        r15 = r4 + r11;
        r11 = r15 & r6;
        r6 = r13 | r11;
        r11 = r9.f48811j;
        if (r2 != r0) goto L_0x0002;
    L_0x0051:
        r0 = f48818r;
        r2 = f48819s;
        r1 = r8;
        r0 = r0.compareAndSwapLong(r1, r2, r4, r6);
        if (r0 == 0) goto L_0x0002;
    L_0x005c:
        r9.f48802a = r10;
        r0 = r9.f48806e;
        if (r0 >= 0) goto L_0x0065;
    L_0x0062:
        java.util.concurrent.locks.LockSupport.unpark(r11);
    L_0x0065:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.concurrent.ForkJoinPool.a():void");
    }

    /* renamed from: c */
    private int m59247c(WorkQueue workQueue) {
        WorkQueue workQueue2 = workQueue;
        long j = this.f48824e;
        WorkQueue[] workQueueArr = this.f48830k;
        short s = (short) ((int) (j >>> 32));
        if (s >= (short) 0) {
            if (workQueueArr != null) {
                int length = workQueueArr.length;
                if (length > 0) {
                    if (workQueue2 != null) {
                        int i = (int) j;
                        int i2 = -1;
                        int i3;
                        int i4;
                        if (i != 0) {
                            WorkQueue workQueue3 = workQueueArr[i & (length - 1)];
                            int i5 = workQueue2.f48802a;
                            long j2 = (i5 < 0 ? j + 281474976710656L : j) & -4294967296L;
                            i3 = i & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                            if (workQueue3 != null) {
                                i4 = workQueue3.f48802a;
                                Thread thread = workQueue3.f48811j;
                                long j3 = (((long) workQueue3.f48803b) & 4294967295L) | j2;
                                if (i4 == i) {
                                    Thread thread2 = thread;
                                    int i6 = i3;
                                    if (f48818r.compareAndSwapLong(r8, f48819s, j, j3)) {
                                        workQueue3.f48802a = i6;
                                        if (workQueue3.f48806e < 0) {
                                            LockSupport.unpark(thread2);
                                        }
                                        if (i5 >= 0) {
                                            i2 = 1;
                                        }
                                        return i2;
                                    }
                                }
                            }
                            return 0;
                        } else if (((int) (j >> 48)) - ((short) (r8.f48828i & 65535)) > 0) {
                            return f48818r.compareAndSwapLong(r8, f48819s, j, ((j - 281474976710656L) & -281474976710656L) | (j & 281474976710655L));
                        } else {
                            Object obj;
                            i4 = r8.f48829j & 65535;
                            i = i4 + s;
                            int i7 = i;
                            int i8 = 0;
                            for (i3 = 1; i3 < length; i3 += 2) {
                                WorkQueue workQueue4 = workQueueArr[i3];
                                if (workQueue4 != null) {
                                    if (workQueue4.f48806e == 0) {
                                        obj = 1;
                                        break;
                                    }
                                    i7--;
                                    Thread thread3 = workQueue4.f48811j;
                                    if (thread3 != null) {
                                        State state = thread3.getState();
                                        if (state == State.BLOCKED || state == State.WAITING) {
                                            i8++;
                                        }
                                    }
                                }
                            }
                            obj = null;
                            if (obj == null && i7 == 0) {
                                if (r8.f48824e == j) {
                                    if (i >= 32767 || s >= (r8.f48828i >>> 16)) {
                                        Predicate predicate = r8.f48834o;
                                        if (predicate != null && predicate.test(r8)) {
                                            return -1;
                                        }
                                        if (i8 < i4) {
                                            Thread.yield();
                                            return 0;
                                        }
                                        throw new RejectedExecutionException("Thread limit exceeded replacing blocked worker");
                                    }
                                }
                            }
                            return 0;
                        }
                    }
                }
            }
            return 0;
        }
        int i9 = (f48818r.compareAndSwapLong(r8, f48819s, j, ((j + 4294967296L) & 281470681743360L) | (j & -281470681743361L)) && m59251f()) ? 1 : 0;
        return i9;
    }

    /* renamed from: a */
    final void m59259a(WorkQueue workQueue) {
        ForkJoinPool forkJoinPool = this;
        WorkQueue workQueue2 = workQueue;
        workQueue.m59232b();
        int d = workQueue2.f48805d ^ TLRandom.m59319d();
        int i = 1;
        if (d == 0) {
            d = 1;
        }
        while (true) {
            int i2;
            int i3;
            int i4 = 0;
            while (true) {
                WorkQueue[] workQueueArr = forkJoinPool.f48830k;
                if (workQueueArr != null) {
                    int length = workQueueArr.length;
                    int i5 = length - 1;
                    int i6 = d;
                    int i7 = i4;
                    d = length;
                    Object obj = null;
                    while (d > 0) {
                        WorkQueue[] workQueueArr2;
                        int i8;
                        int i9 = i6 & i5;
                        if (i9 >= 0 && i9 < length) {
                            WorkQueue workQueue3 = workQueueArr[i9];
                            if (workQueue3 != null) {
                                i2 = workQueue3.f48807f;
                                if (i2 - workQueue3.f48808g < 0) {
                                    Object obj2 = workQueue3.f48809h;
                                    if (obj2 != null) {
                                        int length2 = obj2.length;
                                        if (length2 > 0) {
                                            i4 = workQueue3.f48805d;
                                            i3 = i6;
                                            WorkQueue workQueue4 = workQueue3;
                                            workQueueArr2 = workQueueArr;
                                            i8 = length;
                                            long j = (((long) ((length2 - 1) & i2)) << f48822v) + ((long) f48821u);
                                            ForkJoinTask forkJoinTask = (ForkJoinTask) f48818r.getObjectVolatile(obj2, j);
                                            if (forkJoinTask != null) {
                                                i9 = i2 + 1;
                                                WorkQueue workQueue5 = workQueue4;
                                                if (i2 == workQueue5.f48807f && f48818r.compareAndSwapObject(obj2, j, forkJoinTask, null)) {
                                                    workQueue5.f48807f = i9;
                                                    if (i9 - workQueue5.f48808g < 0 && i4 != i7) {
                                                        m59258a();
                                                    }
                                                    workQueue2.f48806e = i4;
                                                    forkJoinTask.m59283h();
                                                    if ((workQueue2.f48805d & 65536) != 0) {
                                                        workQueue2.m59230b(1024);
                                                    } else {
                                                        workQueue2.m59227a(1024);
                                                    }
                                                    ForkJoinWorkerThread forkJoinWorkerThread = workQueue2.f48811j;
                                                    workQueue2.f48804c += i;
                                                    workQueue2.f48806e = 0;
                                                    if (forkJoinWorkerThread != null) {
                                                        forkJoinWorkerThread.mo12946b();
                                                    }
                                                    i7 = i4;
                                                    i6 = i3;
                                                    obj = 1;
                                                    d--;
                                                    workQueueArr = workQueueArr2;
                                                    length = i8;
                                                }
                                            }
                                            i4 = i7;
                                            i7 = i4;
                                            i6 = i3;
                                            obj = 1;
                                            d--;
                                            workQueueArr = workQueueArr2;
                                            length = i8;
                                        }
                                    }
                                }
                            }
                        }
                        workQueueArr2 = workQueueArr;
                        i8 = length;
                        i3 = i6;
                        if (obj != null) {
                            break;
                        }
                        i6 = i3 + 1;
                        d--;
                        workQueueArr = workQueueArr2;
                        length = i8;
                    }
                    i3 = i6;
                    if (obj == null) {
                        break;
                    }
                    d = i3 ^ (i3 << 13);
                    d ^= d >>> 17;
                    d ^= d << 5;
                    i4 = i7;
                } else {
                    return;
                }
            }
            int i10 = workQueue2.f48802a;
            long j2;
            if (i10 >= 0) {
                i10 = (i10 + 65536) | Integer.MIN_VALUE;
                workQueue2.f48802a = i10;
                do {
                    j2 = forkJoinPool.f48824e;
                    workQueue2.f48803b = (int) j2;
                } while (!f48818r.compareAndSwapLong(forkJoinPool, f48819s, j2, ((j2 - 281474976710656L) & -4294967296L) | (((long) i10) & 4294967295L)));
            } else {
                int i11 = workQueue2.f48803b;
                workQueue2.f48806e = -1073741824;
                d = 0;
                while (workQueue2.f48802a < 0) {
                    i4 = forkJoinPool.f48829j;
                    if (i4 >= 0) {
                        int i12;
                        int i13;
                        long j3;
                        long j4;
                        int i14 = 65535 & i4;
                        j2 = forkJoinPool.f48824e;
                        i14 += (int) (j2 >> 48);
                        if (i14 <= 0 && (i4 & 262144) != 0) {
                            if (m59245a(false, false)) {
                                return;
                            }
                        }
                        i2 = d + 1;
                        if ((i2 & 1) == 0) {
                            Thread.interrupted();
                            i12 = i11;
                            i13 = i10;
                        } else if (i14 > 0 || i11 == 0 || i10 != ((int) j2)) {
                            i12 = i11;
                            i13 = i10;
                            j3 = 4294967295L;
                            LockSupport.park(this);
                            d = i2;
                            i11 = i12;
                            j4 = j3;
                            i10 = i13;
                            i = 1;
                        } else {
                            i13 = i10;
                            j3 = forkJoinPool.f48826g + System.currentTimeMillis();
                            LockSupport.parkUntil(forkJoinPool, j3);
                            if (forkJoinPool.f48824e != j2 || j3 - System.currentTimeMillis() > 20) {
                                i12 = i11;
                            } else {
                                j3 = 4294967295L;
                                i12 = i11;
                                if (f48818r.compareAndSwapLong(forkJoinPool, f48819s, j2, ((j2 - 4294967296L) & -4294967296L) | (((long) i11) & 4294967295L))) {
                                    workQueue2.f48802a = 1073741824;
                                    return;
                                }
                                d = i2;
                                i11 = i12;
                                j4 = j3;
                                i10 = i13;
                                i = 1;
                            }
                        }
                        j3 = 4294967295L;
                        d = i2;
                        i11 = i12;
                        j4 = j3;
                        i10 = i13;
                        i = 1;
                    } else {
                        return;
                    }
                }
                workQueue2.f48806e = 0;
            }
            d = i3;
        }
    }

    /* renamed from: a */
    final int m59253a(WorkQueue workQueue, ForkJoinTask<?> forkJoinTask, long j) {
        Object obj = this;
        WorkQueue workQueue2 = workQueue;
        ForkJoinTask<?> forkJoinTask2 = forkJoinTask;
        if (workQueue2 == null || forkJoinTask2 == null) {
            return 0;
        }
        int a;
        if (forkJoinTask2 instanceof CountedCompleter) {
            a = workQueue2.m59226a((CountedCompleter) forkJoinTask2, 0);
            if (a < 0) {
                return a;
            }
        }
        workQueue.m59234c(forkJoinTask);
        a = workQueue2.f48806e;
        int i = workQueue2.f48805d;
        int i2 = forkJoinTask2.f48844n;
        while (i2 >= 0) {
            long j2;
            Object obj2;
            int i3;
            long j3;
            long nanoTime;
            i2 = TLRandom.m59319d() | 1;
            WorkQueue[] workQueueArr = obj.f48830k;
            if (workQueueArr != null) {
                int length = workQueueArr.length;
                int i4 = length - 1;
                for (int i5 = -length; i5 < length; i5 += 2) {
                    int i6 = (i2 + i5) & i4;
                    if (i6 >= 0 && i6 < length) {
                        WorkQueue workQueue3 = workQueueArr[i6];
                        if (workQueue3 != null && workQueue3.f48806e == i) {
                            int i7 = workQueue3.f48807f;
                            if (i7 - workQueue3.f48808g < 0) {
                                Object obj3 = workQueue3.f48809h;
                                if (obj3 != null) {
                                    int length2 = obj3.length;
                                    if (length2 > 0) {
                                        i2 = workQueue3.f48805d;
                                        j2 = (((long) ((length2 - 1) & i7)) << f48822v) + ((long) f48821u);
                                        ForkJoinTask forkJoinTask3 = (ForkJoinTask) f48818r.getObjectVolatile(obj3, j2);
                                        if (forkJoinTask3 != null) {
                                            int i8 = i7 + 1;
                                            if (i7 == workQueue3.f48807f && i == workQueue3.f48806e && f48818r.compareAndSwapObject(obj3, j2, forkJoinTask3, null)) {
                                                workQueue3.f48807f = i8;
                                                workQueue2.f48806e = i2;
                                                forkJoinTask3.m59283h();
                                                workQueue2.f48806e = a;
                                            }
                                        }
                                        obj2 = 1;
                                        i3 = forkJoinTask2.f48844n;
                                        if (i3 < 0) {
                                            if (obj2 != null) {
                                                j2 = 0;
                                                if (j != 0) {
                                                    j3 = 0;
                                                } else {
                                                    nanoTime = j - System.nanoTime();
                                                    if (nanoTime <= 0) {
                                                        j3 = TimeUnit.NANOSECONDS.toMillis(nanoTime);
                                                        if (j3 <= 0) {
                                                            j3 = 1;
                                                        }
                                                    }
                                                }
                                                i3 = m59247c(workQueue);
                                                if (i3 != 0) {
                                                    forkJoinTask2.a_(j3);
                                                    j3 = f48819s;
                                                    if (i3 > 0) {
                                                        j2 = 281474976710656L;
                                                    }
                                                    m59239a(obj, j3, j2);
                                                }
                                                i2 = forkJoinTask2.f48844n;
                                            } else {
                                                i2 = i3;
                                            }
                                        }
                                        return i3;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            }
            obj2 = null;
            i3 = forkJoinTask2.f48844n;
            if (i3 < 0) {
                if (obj2 != null) {
                    i2 = i3;
                } else {
                    j2 = 0;
                    if (j != 0) {
                        nanoTime = j - System.nanoTime();
                        if (nanoTime <= 0) {
                            j3 = TimeUnit.NANOSECONDS.toMillis(nanoTime);
                            if (j3 <= 0) {
                                j3 = 1;
                            }
                        }
                    } else {
                        j3 = 0;
                    }
                    i3 = m59247c(workQueue);
                    if (i3 != 0) {
                        forkJoinTask2.a_(j3);
                        j3 = f48819s;
                        if (i3 > 0) {
                            j2 = 281474976710656L;
                        }
                        m59239a(obj, j3, j2);
                    }
                    i2 = forkJoinTask2.f48844n;
                }
            }
            return i3;
        }
        return i2;
    }

    /* renamed from: b */
    final void m59263b(WorkQueue workQueue) {
        Object obj = this;
        WorkQueue workQueue2 = workQueue;
        int i = workQueue2.f48806e;
        int i2 = workQueue2.f48805d & 65536;
        Object obj2 = -1;
        int i3 = i;
        Object obj3 = -1;
        while (true) {
            Object obj4;
            int length;
            if (i2 != 0) {
                workQueue2.m59230b(0);
            } else {
                workQueue2.m59227a(0);
            }
            if (obj3 == obj2 && workQueue2.f48802a >= 0) {
                obj3 = 1;
            }
            int d = TLRandom.m59319d();
            WorkQueue[] workQueueArr = obj.f48830k;
            long j = 281474976710656L;
            if (workQueueArr != null) {
                int length2 = workQueueArr.length;
                int i4 = length2 - 1;
                int i5 = length2;
                obj4 = 1;
                while (i5 > 0) {
                    int i6 = (d - i5) & i4;
                    if (i6 >= 0 && i6 < length2) {
                        WorkQueue workQueue3 = workQueueArr[i6];
                        if (workQueue3 != null) {
                            int i7 = workQueue3.f48807f;
                            if (i7 - workQueue3.f48808g < 0) {
                                Object obj5 = workQueue3.f48809h;
                                if (obj5 != null) {
                                    length = obj5.length;
                                    if (length > 0) {
                                        d = workQueue3.f48805d;
                                        if (obj3 == null) {
                                            m59239a(obj, f48819s, j);
                                            obj3 = 1;
                                        }
                                        j = (((long) ((length - 1) & i7)) << f48822v) + ((long) f48821u);
                                        ForkJoinTask forkJoinTask = (ForkJoinTask) f48818r.getObjectVolatile(obj5, j);
                                        if (forkJoinTask != null) {
                                            int i8 = i7 + 1;
                                            if (i7 == workQueue3.f48807f && f48818r.compareAndSwapObject(obj5, j, forkJoinTask, null)) {
                                                workQueue3.f48807f = i8;
                                                workQueue2.f48806e = workQueue3.f48805d;
                                                forkJoinTask.m59283h();
                                                workQueue2.f48806e = i;
                                                i3 = i;
                                            }
                                        }
                                        length = i3;
                                        obj2 = null;
                                        obj4 = null;
                                    }
                                }
                            }
                            if ((workQueue3.f48806e & 1073741824) == 0) {
                                obj4 = null;
                            }
                        } else {
                            continue;
                        }
                    }
                    i5--;
                    j = 281474976710656L;
                }
                length = i3;
                obj2 = 1;
            } else {
                length = i3;
                obj2 = 1;
                obj4 = 1;
            }
            if (obj4 != null) {
                break;
            }
            if (obj2 != null) {
                if (length != 1073741824) {
                    workQueue2.f48806e = 1073741824;
                    obj2 = 1;
                    length = 1073741824;
                } else {
                    obj2 = 1;
                }
                if (obj3 == obj2) {
                    m59239a(obj, f48819s, -281474976710656L);
                    i3 = length;
                    obj3 = null;
                    obj2 = -1;
                }
            }
            i3 = length;
            obj2 = -1;
        }
        if (obj3 == null) {
            m59239a(obj, f48819s, 281474976710656L);
        }
        workQueue2.f48806e = i;
    }

    /* renamed from: a */
    private ForkJoinTask<?> m59242a(boolean z) {
        ForkJoinPool forkJoinPool = this;
        loop0:
        while ((forkJoinPool.f48829j & Integer.MIN_VALUE) == 0) {
            WorkQueue[] workQueueArr = forkJoinPool.f48830k;
            if (workQueueArr == null) {
                break;
            }
            int length = workQueueArr.length;
            if (length <= 0) {
                break;
            }
            int i;
            Object obj;
            int length2;
            length--;
            int d = TLRandom.m59319d();
            int i2 = d >>> 16;
            if (z) {
                d = (d & -2) & length;
                i2 = (i2 & -2) | 2;
            } else {
                d &= length;
                i2 |= 1;
            }
            int i3 = d;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                WorkQueue workQueue = workQueueArr[i3];
                if (workQueue != null) {
                    i = workQueue.f48807f;
                    i4 += i;
                    if (i - workQueue.f48808g < 0) {
                        obj = workQueue.f48809h;
                        if (obj != null) {
                            length2 = obj.length;
                            if (length2 > 0) {
                                break;
                            }
                        }
                    }
                }
                i3 = (i3 + i2) & length;
                if (i3 == d) {
                    if (i5 == i4) {
                        break loop0;
                    }
                    i5 = i4;
                    i4 = 0;
                }
            }
            long j = (((long) ((length2 - 1) & i)) << f48822v) + ((long) f48821u);
            ForkJoinTask<?> forkJoinTask = (ForkJoinTask) f48818r.getObjectVolatile(obj, j);
            if (forkJoinTask != null) {
                length = i + 1;
                if (i == workQueue.f48807f && f48818r.compareAndSwapObject(obj, j, forkJoinTask, null)) {
                    workQueue.f48807f = length;
                    return forkJoinTask;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    final void m59260a(java8.util.concurrent.ForkJoinTask<?> r10) {
        /*
        r9 = this;
        r0 = java8.util.concurrent.TLRandom.m59316c();
        if (r0 != 0) goto L_0x000d;
    L_0x0006:
        java8.util.concurrent.TLRandom.m59308a();
        r0 = java8.util.concurrent.TLRandom.m59316c();
    L_0x000d:
        r1 = r9.f48829j;
        r2 = r9.f48830k;
        r3 = 262144; // 0x40000 float:3.67342E-40 double:1.295163E-318;
        r1 = r1 & r3;
        if (r1 != 0) goto L_0x00bb;
    L_0x0016:
        if (r2 == 0) goto L_0x00bb;
    L_0x0018:
        r1 = r2.length;
        if (r1 > 0) goto L_0x001d;
    L_0x001b:
        goto L_0x00bb;
    L_0x001d:
        r1 = r1 + -1;
        r1 = r1 & r0;
        r1 = r1 & 126;
        r1 = r2[r1];
        r2 = 0;
        r3 = 1;
        if (r1 != 0) goto L_0x0061;
    L_0x0028:
        r1 = r9.f48831l;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r5 = r0 | r4;
        r6 = -65538; // 0xfffffffffffefffe float:NaN double:NaN;
        r5 = r5 & r6;
        r6 = new java8.util.concurrent.ForkJoinPool$WorkQueue;
        r7 = 0;
        r6.<init>(r9, r7);
        r6.f48805d = r5;
        r6.f48806e = r4;
        r6.f48802a = r3;
        if (r1 == 0) goto L_0x005d;
    L_0x0040:
        monitor-enter(r1);
        r4 = r9.f48830k;	 Catch:{ all -> 0x005a }
        if (r4 == 0) goto L_0x0056;
    L_0x0045:
        r7 = r4.length;	 Catch:{ all -> 0x005a }
        if (r7 <= 0) goto L_0x0056;
    L_0x0048:
        r7 = r7 + -1;
        r5 = r5 & r7;
        r5 = r5 & 126;
        r7 = r4[r5];	 Catch:{ all -> 0x005a }
        if (r7 != 0) goto L_0x0056;
    L_0x0051:
        r4[r5] = r6;	 Catch:{ all -> 0x005a }
        r4 = 1;
        r5 = 1;
        goto L_0x0058;
    L_0x0056:
        r4 = 0;
        r5 = 0;
    L_0x0058:
        monitor-exit(r1);	 Catch:{ all -> 0x005a }
        goto L_0x005f;
    L_0x005a:
        r10 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x005a }
        throw r10;
    L_0x005d:
        r4 = 0;
        r5 = 0;
    L_0x005f:
        r1 = r6;
        goto L_0x0093;
    L_0x0061:
        r4 = r1.m59237e();
        if (r4 == 0) goto L_0x0091;
    L_0x0067:
        r4 = r1.f48807f;
        r5 = r1.f48808g;
        r6 = r1.f48809h;
        if (r6 == 0) goto L_0x008d;
    L_0x006f:
        r7 = r6.length;
        if (r7 <= 0) goto L_0x008d;
    L_0x0072:
        r7 = r7 + -1;
        r4 = r4 - r5;
        r8 = r7 + r4;
        if (r8 <= 0) goto L_0x008d;
    L_0x0079:
        r7 = r7 & r5;
        r6[r7] = r10;
        r6 = r5 + 1;
        r1.f48808g = r6;
        r1.f48802a = r2;
        if (r4 >= 0) goto L_0x008b;
    L_0x0084:
        r4 = r1.f48807f;
        r4 = r4 - r5;
        r5 = -1;
        if (r4 >= r5) goto L_0x008b;
    L_0x008a:
        goto L_0x00b4;
    L_0x008b:
        r4 = 0;
        goto L_0x008e;
    L_0x008d:
        r4 = 1;
    L_0x008e:
        r5 = r4;
        r4 = 1;
        goto L_0x0093;
    L_0x0091:
        r4 = 0;
        r5 = 0;
    L_0x0093:
        if (r4 == 0) goto L_0x00b5;
    L_0x0095:
        if (r5 == 0) goto L_0x00b1;
    L_0x0097:
        r1.m59232b();	 Catch:{ all -> 0x00ad }
        r0 = r1.f48808g;	 Catch:{ all -> 0x00ad }
        r4 = r1.f48809h;	 Catch:{ all -> 0x00ad }
        if (r4 == 0) goto L_0x00aa;
    L_0x00a0:
        r5 = r4.length;	 Catch:{ all -> 0x00ad }
        if (r5 <= 0) goto L_0x00aa;
    L_0x00a3:
        r5 = r5 - r3;
        r5 = r5 & r0;
        r4[r5] = r10;	 Catch:{ all -> 0x00ad }
        r0 = r0 + r3;
        r1.f48808g = r0;	 Catch:{ all -> 0x00ad }
    L_0x00aa:
        r1.f48802a = r2;
        goto L_0x00b1;
    L_0x00ad:
        r10 = move-exception;
        r1.f48802a = r2;
        throw r10;
    L_0x00b1:
        r9.m59258a();
    L_0x00b4:
        return;
    L_0x00b5:
        r0 = java8.util.concurrent.TLRandom.m59306a(r0);
        goto L_0x000d;
    L_0x00bb:
        r10 = new java.util.concurrent.RejectedExecutionException;
        r10.<init>();
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.concurrent.ForkJoinPool.a(java8.util.concurrent.ForkJoinTask):void");
    }

    /* renamed from: c */
    private <T> ForkJoinTask<T> m59248c(ForkJoinTask<T> forkJoinTask) {
        Objects.m59115b(forkJoinTask);
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof ForkJoinWorkerThread) {
            ForkJoinWorkerThread forkJoinWorkerThread = (ForkJoinWorkerThread) currentThread;
            if (forkJoinWorkerThread.f48845a == this) {
                WorkQueue workQueue = forkJoinWorkerThread.f48846b;
                if (workQueue != null) {
                    workQueue.m59228a((ForkJoinTask) forkJoinTask);
                    return forkJoinTask;
                }
            }
        }
        m59260a((ForkJoinTask) forkJoinTask);
        return forkJoinTask;
    }

    /* renamed from: b */
    final boolean m59264b(ForkJoinTask<?> forkJoinTask) {
        int c = TLRandom.m59316c();
        WorkQueue[] workQueueArr = this.f48830k;
        if (workQueueArr != null) {
            int length = workQueueArr.length;
            if (length > 0) {
                WorkQueue workQueue = workQueueArr[(c & (length - 1)) & 126];
                if (!(workQueue == null || workQueue.m59236d(forkJoinTask) == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    final int m59252a(CountedCompleter<?> countedCompleter, int i) {
        int c = TLRandom.m59316c();
        WorkQueue[] workQueueArr = this.f48830k;
        if (workQueueArr != null) {
            int length = workQueueArr.length;
            if (length > 0) {
                WorkQueue workQueue = workQueueArr[(c & (length - 1)) & 126];
                if (workQueue != null) {
                    return workQueue.m59229b(countedCompleter, i);
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private boolean m59245a(boolean r22, boolean r23) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r21 = this;
        r7 = r21;
    L_0x0002:
        r5 = r7.f48829j;
        r1 = 262144; // 0x40000 float:3.67342E-40 double:1.295163E-318;
        r2 = r5 & r1;
        r8 = 0;
        if (r2 != 0) goto L_0x001f;
    L_0x000b:
        if (r23 == 0) goto L_0x001e;
    L_0x000d:
        r2 = f48814c;
        if (r7 != r2) goto L_0x0012;
    L_0x0011:
        goto L_0x001e;
    L_0x0012:
        r2 = f48818r;
        r3 = f48820t;
        r6 = r5 | r1;
        r1 = r2;
        r2 = r7;
        r1.compareAndSwapInt(r2, r3, r5, r6);
        goto L_0x0002;
    L_0x001e:
        return r8;
    L_0x001f:
        r1 = r7.f48829j;
        r2 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r3 = r1 & r2;
        r9 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        r10 = 0;
        r12 = 1;
        if (r3 != 0) goto L_0x00a2;
    L_0x002d:
        if (r22 != 0) goto L_0x0091;
    L_0x002f:
        r3 = r7.f48824e;
        r5 = r7.f48830k;
        r1 = r1 & r9;
        r6 = 48;
        r14 = r3 >> r6;
        r6 = (int) r14;
        r1 = r1 + r6;
        if (r1 <= 0) goto L_0x0040;
    L_0x003c:
        r16 = r10;
    L_0x003e:
        r1 = 1;
        goto L_0x0074;
    L_0x0040:
        if (r5 == 0) goto L_0x0071;
    L_0x0042:
        r1 = 0;
    L_0x0043:
        r6 = r5.length;
        if (r1 >= r6) goto L_0x0071;
    L_0x0046:
        r6 = r5[r1];
        if (r6 == 0) goto L_0x0067;
    L_0x004a:
        r14 = r6.f48807f;
        r15 = r6.f48805d;
        r15 = r15 + r14;
        r16 = r10;
        r9 = (long) r15;
        r18 = r3 + r9;
        r3 = r6.f48808g;
        if (r14 != r3) goto L_0x0064;
    L_0x0058:
        r3 = r1 & 1;
        if (r3 != r12) goto L_0x0061;
    L_0x005c:
        r3 = r6.f48806e;
        if (r3 < 0) goto L_0x0061;
    L_0x0060:
        goto L_0x0064;
    L_0x0061:
        r3 = r18;
        goto L_0x0069;
    L_0x0064:
        r3 = r18;
        goto L_0x003e;
    L_0x0067:
        r16 = r10;
    L_0x0069:
        r1 = r1 + 1;
        r10 = r16;
        r9 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        goto L_0x0043;
    L_0x0071:
        r16 = r10;
        r1 = 0;
    L_0x0074:
        r6 = r7.f48829j;
        r9 = r6 & r2;
        if (r9 == 0) goto L_0x007b;
    L_0x007a:
        goto L_0x0086;
    L_0x007b:
        if (r1 == 0) goto L_0x007e;
    L_0x007d:
        return r8;
    L_0x007e:
        r1 = r7.f48830k;
        if (r1 != r5) goto L_0x008a;
    L_0x0082:
        r1 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1));
        if (r1 != 0) goto L_0x0088;
    L_0x0086:
        r5 = r6;
        goto L_0x0092;
    L_0x0088:
        r10 = r3;
        goto L_0x008c;
    L_0x008a:
        r10 = r16;
    L_0x008c:
        r1 = r6;
        r9 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        goto L_0x002f;
    L_0x0091:
        r5 = r1;
    L_0x0092:
        r1 = r5 & r2;
        if (r1 != 0) goto L_0x001f;
    L_0x0096:
        r1 = f48818r;
        r3 = f48820t;
        r6 = r5 | r2;
        r2 = r7;
        r1.compareAndSwapInt(r2, r3, r5, r6);
        goto L_0x001f;
    L_0x00a2:
        r1 = r7.f48829j;
        r2 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        r1 = r1 & r2;
        if (r1 != 0) goto L_0x0110;
    L_0x00a9:
        r3 = r10;
    L_0x00aa:
        r5 = r7.f48824e;
        r1 = r7.f48830k;
        if (r1 == 0) goto L_0x00d1;
    L_0x00b0:
        r13 = r5;
        r5 = 0;
    L_0x00b2:
        r6 = r1.length;
        if (r5 >= r6) goto L_0x00d2;
    L_0x00b5:
        r6 = r1[r5];
        if (r6 == 0) goto L_0x00cd;
    L_0x00b9:
        r9 = r6.f48811j;
        r6.m59235d();
        if (r9 == 0) goto L_0x00c3;
    L_0x00c0:
        r9.interrupt();	 Catch:{ Throwable -> 0x00c3 }
    L_0x00c3:
        r9 = r6.f48807f;
        r6 = r6.f48805d;
        r9 = r9 + r6;
        r8 = (long) r9;
        r16 = r13 + r8;
        r13 = r16;
    L_0x00cd:
        r5 = r5 + 1;
        r8 = 0;
        goto L_0x00b2;
    L_0x00d1:
        r13 = r5;
    L_0x00d2:
        r5 = r7.f48829j;
        r6 = r5 & r2;
        if (r6 != 0) goto L_0x00e4;
    L_0x00d8:
        r8 = r7.f48830k;
        if (r8 != r1) goto L_0x00e2;
    L_0x00dc:
        r1 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1));
        if (r1 != 0) goto L_0x00e1;
    L_0x00e0:
        goto L_0x00e4;
    L_0x00e1:
        r3 = r13;
    L_0x00e2:
        r8 = 0;
        goto L_0x00aa;
    L_0x00e4:
        if (r6 == 0) goto L_0x00e7;
    L_0x00e6:
        goto L_0x0110;
    L_0x00e7:
        r8 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        r1 = r5 & r8;
        r3 = r7.f48824e;
        r6 = 32;
        r3 = r3 >>> r6;
        r3 = (int) r3;
        r3 = (short) r3;
        r1 = r1 + r3;
        if (r1 <= 0) goto L_0x00f7;
    L_0x00f6:
        goto L_0x0110;
    L_0x00f7:
        r1 = f48818r;
        r3 = f48820t;
        r6 = r5 | r2;
        r2 = r7;
        r1 = r1.compareAndSwapInt(r2, r3, r5, r6);
        if (r1 == 0) goto L_0x010e;
    L_0x0104:
        monitor-enter(r21);
        r21.notifyAll();	 Catch:{ all -> 0x010a }
        monitor-exit(r21);	 Catch:{ all -> 0x010a }
        goto L_0x0110;	 Catch:{ all -> 0x010a }
    L_0x010a:
        r0 = move-exception;	 Catch:{ all -> 0x010a }
        r1 = r0;	 Catch:{ all -> 0x010a }
        monitor-exit(r21);	 Catch:{ all -> 0x010a }
        throw r1;
    L_0x010e:
        r8 = 0;
        goto L_0x00a2;
    L_0x0110:
        return r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.concurrent.ForkJoinPool.a(boolean, boolean):boolean");
    }

    public ForkJoinPool() {
        this(Math.min(32767, Runtime.getRuntime().availableProcessors()), f48812a, null, false, 0, 32767, 1, null, 60000, TimeUnit.MILLISECONDS);
    }

    public ForkJoinPool(int i, ForkJoinWorkerThreadFactory forkJoinWorkerThreadFactory, UncaughtExceptionHandler uncaughtExceptionHandler, boolean z, int i2, int i3, int i4, Predicate<? super ForkJoinPool> predicate, long j, TimeUnit timeUnit) {
        AbstractExecutorService abstractExecutorService = this;
        int i5 = i;
        int i6 = i3;
        long j2 = j;
        if (i5 > 0 && i5 <= 32767 && i6 >= i5) {
            if (j2 > 0) {
                Objects.m59115b(forkJoinWorkerThreadFactory);
                j2 = Math.max(timeUnit.toMillis(j2), 20);
                long j3 = ((((long) (-Math.min(Math.max(i2, i5), 32767))) << 32) & 281470681743360L) | ((((long) (-i5)) << 48) & -281474976710656L);
                int i7 = (z ? 65536 : 0) | i5;
                i6 = ((Math.min(i6, 32767) - i5) << 16) | ((Math.min(Math.max(i4, 0), 32767) - i5) & 65535);
                i5 = i5 > 1 ? i5 - 1 : 1;
                i5 |= i5 >>> 1;
                i5 |= i5 >>> 2;
                i5 |= i5 >>> 4;
                i5 |= i5 >>> 8;
                i5 = ((i5 | (i5 >>> 16)) + 1) << 1;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ForkJoinPool-");
                stringBuilder.append(m59250e());
                stringBuilder.append("-worker-");
                abstractExecutorService.f48831l = stringBuilder.toString();
                abstractExecutorService.f48830k = new WorkQueue[i5];
                abstractExecutorService.f48832m = forkJoinWorkerThreadFactory;
                abstractExecutorService.f48833n = uncaughtExceptionHandler;
                abstractExecutorService.f48834o = predicate;
                abstractExecutorService.f48826g = j2;
                abstractExecutorService.f48828i = i6;
                abstractExecutorService.f48829j = i7;
                abstractExecutorService.f48824e = j3;
                m59249d();
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    private static Object m59240a(String str) throws Exception {
        str = System.getProperty(str);
        if (str == null) {
            return null;
        }
        return ClassLoader.getSystemClassLoader().loadClass(str).getConstructor(new Class[0]).newInstance(new Object[0]);
    }

    private ForkJoinPool(byte r13) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r12 = this;
        r12.<init>();
        r13 = 0;
        r0 = -1;
        r1 = "java.util.concurrent.ForkJoinPool.common.parallelism";	 Catch:{ Exception -> 0x0023 }
        r1 = java.lang.System.getProperty(r1);	 Catch:{ Exception -> 0x0023 }
        if (r1 == 0) goto L_0x0012;	 Catch:{ Exception -> 0x0023 }
    L_0x000d:
        r1 = java.lang.Integer.parseInt(r1);	 Catch:{ Exception -> 0x0023 }
        r0 = r1;	 Catch:{ Exception -> 0x0023 }
    L_0x0012:
        r1 = "java.util.concurrent.ForkJoinPool.common.threadFactory";	 Catch:{ Exception -> 0x0023 }
        r1 = m59240a(r1);	 Catch:{ Exception -> 0x0023 }
        r1 = (java8.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory) r1;	 Catch:{ Exception -> 0x0023 }
        r2 = "java.util.concurrent.ForkJoinPool.common.exceptionHandler";	 Catch:{ Exception -> 0x0024 }
        r2 = m59240a(r2);	 Catch:{ Exception -> 0x0024 }
        r2 = (java.lang.Thread.UncaughtExceptionHandler) r2;	 Catch:{ Exception -> 0x0024 }
        goto L_0x0025;
    L_0x0023:
        r1 = r13;
    L_0x0024:
        r2 = r13;
    L_0x0025:
        if (r1 != 0) goto L_0x0035;
    L_0x0027:
        r1 = java.lang.System.getSecurityManager();
        if (r1 != 0) goto L_0x0030;
    L_0x002d:
        r1 = f48812a;
        goto L_0x0035;
    L_0x0030:
        r1 = new java8.util.concurrent.ForkJoinPool$InnocuousForkJoinWorkerThreadFactory;
        r1.<init>();
    L_0x0035:
        r3 = 1;
        if (r0 >= 0) goto L_0x0044;
    L_0x0038:
        r0 = java.lang.Runtime.getRuntime();
        r0 = r0.availableProcessors();
        r0 = r0 - r3;
        if (r0 > 0) goto L_0x0044;
    L_0x0043:
        r0 = 1;
    L_0x0044:
        r4 = 32767; // 0x7fff float:4.5916E-41 double:1.6189E-319;
        if (r0 <= r4) goto L_0x004a;
    L_0x0048:
        r0 = 32767; // 0x7fff float:4.5916E-41 double:1.6189E-319;
    L_0x004a:
        r4 = -r0;
        r4 = (long) r4;
        r6 = 32;
        r6 = r4 << r6;
        r8 = 281470681743360; // 0xffff00000000 float:0.0 double:1.39064994160909E-309;
        r10 = r6 & r8;
        r6 = 48;
        r4 = r4 << r6;
        r6 = -281474976710656; // 0xffff000000000000 float:0.0 double:NaN;
        r8 = r4 & r6;
        r4 = r10 | r8;
        r6 = 1 - r0;
        r7 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        r6 = r6 & r7;
        r7 = f48816p;
        r7 = r7 << 16;
        r6 = r6 | r7;
        if (r0 <= r3) goto L_0x0070;
    L_0x006d:
        r7 = r0 + -1;
        goto L_0x0071;
    L_0x0070:
        r7 = 1;
    L_0x0071:
        r8 = r7 >>> 1;
        r7 = r7 | r8;
        r8 = r7 >>> 2;
        r7 = r7 | r8;
        r8 = r7 >>> 4;
        r7 = r7 | r8;
        r8 = r7 >>> 8;
        r7 = r7 | r8;
        r8 = r7 >>> 16;
        r7 = r7 | r8;
        r7 = r7 + r3;
        r3 = r7 << 1;
        r7 = "ForkJoinPool.commonPool-worker-";
        r12.f48831l = r7;
        r3 = new java8.util.concurrent.ForkJoinPool.WorkQueue[r3];
        r12.f48830k = r3;
        r12.f48832m = r1;
        r12.f48833n = r2;
        r12.f48834o = r13;
        r1 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r12.f48826g = r1;
        r12.f48828i = r6;
        r12.f48829j = r0;
        r12.f48824e = r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.concurrent.ForkJoinPool.<init>(byte):void");
    }

    public void execute(Runnable runnable) {
        ForkJoinTask forkJoinTask;
        Objects.m59115b(runnable);
        if (runnable instanceof ForkJoinTask) {
            forkJoinTask = (ForkJoinTask) runnable;
        } else {
            forkJoinTask = new RunnableExecuteAction(runnable);
        }
        m59248c(forkJoinTask);
    }

    /* renamed from: a */
    public <T> ForkJoinTask<T> m59257a(Callable<T> callable) {
        return m59248c(new AdaptedCallable(callable));
    }

    /* renamed from: a */
    public <T> ForkJoinTask<T> m59256a(Runnable runnable, T t) {
        return m59248c(new AdaptedRunnable(runnable, t));
    }

    /* renamed from: a */
    public ForkJoinTask<?> m59255a(Runnable runnable) {
        Objects.m59115b(runnable);
        return m59248c(runnable instanceof ForkJoinTask ? (ForkJoinTask) runnable : new AdaptedRunnableAction(runnable));
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        int i;
        ArrayList arrayList = new ArrayList(collection.size());
        try {
            for (Callable adaptedCallable : collection) {
                ForkJoinTask adaptedCallable2 = new AdaptedCallable(adaptedCallable);
                arrayList.add(adaptedCallable2);
                m59248c(adaptedCallable2);
            }
            collection = arrayList.size();
            for (i = 0; i < collection; i++) {
                ((ForkJoinTask) arrayList.get(i)).m59288n();
            }
            return arrayList;
        } catch (Throwable th) {
            i = arrayList.size();
            for (int i2 = 0; i2 < i; i2++) {
                ((Future) arrayList.get(i2)).cancel(false);
            }
        }
    }

    /* renamed from: b */
    public static int m59246b() {
        return f48815d;
    }

    /* renamed from: c */
    public boolean m59265c() {
        while (true) {
            long j = this.f48824e;
            int i = this.f48829j;
            int i2 = 65535 & i;
            int i3 = ((short) ((int) (j >>> 32))) + i2;
            i2 += (int) (j >> 48);
            if ((i & -2146959360) != 0) {
                return true;
            }
            if (i2 > 0) {
                return false;
            }
            WorkQueue[] workQueueArr = this.f48830k;
            if (workQueueArr != null) {
                int i4 = i3;
                for (i3 = 1; i3 < workQueueArr.length; i3 += 2) {
                    WorkQueue workQueue = workQueueArr[i3];
                    if (workQueue != null) {
                        if ((workQueue.f48806e & 1073741824) == 0) {
                            return false;
                        }
                        i4--;
                    }
                }
                i3 = i4;
            }
            if (i3 == 0 && this.f48824e == j) {
                return true;
            }
        }
    }

    public String toString() {
        long j;
        int i;
        long j2 = this.f48825f;
        WorkQueue[] workQueueArr = this.f48830k;
        long j3 = 0;
        int i2 = 0;
        if (workQueueArr != null) {
            j = j2;
            long j4 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < workQueueArr.length; i4++) {
                WorkQueue workQueue = workQueueArr[i4];
                if (workQueue != null) {
                    int a = workQueue.m59225a();
                    if ((i4 & 1) == 0) {
                        j3 += (long) a;
                    } else {
                        long j5 = j4 + ((long) a);
                        j4 = j + (((long) workQueue.f48804c) & 4294967295L);
                        if (workQueue.m59238f()) {
                            i3++;
                        }
                        j = j4;
                        j4 = j5;
                    }
                }
            }
            i = i3;
            j2 = j3;
            j3 = j4;
        } else {
            j = j2;
            j2 = 0;
            i = 0;
        }
        int i5 = r0.f48829j;
        int i6 = 65535 & i5;
        long j6 = r0.f48824e;
        int i7 = ((short) ((int) (j6 >>> 32))) + i6;
        int i8 = ((int) (j6 >> 48)) + i6;
        if (i8 >= 0) {
            i2 = i8;
        }
        String str = (524288 & i5) != 0 ? "Terminated" : (Integer.MIN_VALUE & i5) != 0 ? "Terminating" : (i5 & 262144) != 0 ? "Shutting down" : "Running";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("[");
        stringBuilder.append(str);
        stringBuilder.append(", parallelism = ");
        stringBuilder.append(i6);
        stringBuilder.append(", size = ");
        stringBuilder.append(i7);
        stringBuilder.append(", active = ");
        stringBuilder.append(i2);
        stringBuilder.append(", running = ");
        stringBuilder.append(i);
        stringBuilder.append(", steals = ");
        stringBuilder.append(j);
        stringBuilder.append(", tasks = ");
        stringBuilder.append(j3);
        stringBuilder.append(", submissions = ");
        stringBuilder.append(j2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void shutdown() {
        m59249d();
        m59245a(false, true);
    }

    public List<Runnable> shutdownNow() {
        m59249d();
        m59245a(true, true);
        return Collections.emptyList();
    }

    public boolean isTerminated() {
        return (this.f48829j & 524288) != 0;
    }

    public boolean isShutdown() {
        return (this.f48829j & 262144) != 0;
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        } else if (this == f48814c) {
            m59262a(j, timeUnit);
            return false;
        } else {
            j = timeUnit.toNanos(j);
            if (isTerminated() != null) {
                return true;
            }
            if (j <= 0) {
                return false;
            }
            long nanoTime = System.nanoTime() + j;
            synchronized (this) {
                while (isTerminated() == null) {
                    if (j <= 0) {
                        return false;
                    }
                    j = TimeUnit.NANOSECONDS.toMillis(j);
                    if (j <= 0) {
                        j = 1;
                    }
                    wait(j);
                    j = nanoTime - System.nanoTime();
                }
                return true;
            }
        }
    }

    /* renamed from: a */
    public boolean m59262a(long j, TimeUnit timeUnit) {
        j = timeUnit.toNanos(j);
        timeUnit = Thread.currentThread();
        if (timeUnit instanceof ForkJoinWorkerThread) {
            ForkJoinWorkerThread forkJoinWorkerThread = (ForkJoinWorkerThread) timeUnit;
            if (forkJoinWorkerThread.f48845a == this) {
                m59263b(forkJoinWorkerThread.f48846b);
                return true;
            }
        }
        long nanoTime = System.nanoTime();
        while (true) {
            ForkJoinTask a = m59242a(false);
            if (a != null) {
                a.m59283h();
            } else if (m59265c()) {
                return true;
            } else {
                if (System.nanoTime() - nanoTime > j) {
                    return false;
                }
                Thread.yield();
            }
        }
    }

    /* renamed from: a */
    public static void m59244a(ManagedBlocker managedBlocker) throws InterruptedException {
        long j;
        long j2;
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof ForkJoinWorkerThread) {
            ForkJoinWorkerThread forkJoinWorkerThread = (ForkJoinWorkerThread) currentThread;
            Object obj = forkJoinWorkerThread.f48845a;
            if (obj != null) {
                WorkQueue workQueue = forkJoinWorkerThread.f48846b;
                if (workQueue != null) {
                    while (!managedBlocker.isReleasable()) {
                        int c = obj.m59247c(workQueue);
                        if (c != 0) {
                            do {
                                j = 0;
                                try {
                                    if (managedBlocker.isReleasable()) {
                                        break;
                                    }
                                } catch (Throwable th) {
                                    j2 = f48819s;
                                    if (c > 0) {
                                        j = 281474976710656L;
                                    }
                                    m59239a(obj, j2, j);
                                }
                            } while (!managedBlocker.block());
                            j2 = f48819s;
                            if (c > 0) {
                                j = 281474976710656L;
                            }
                            m59239a(obj, j2, j);
                            return;
                        }
                    }
                    return;
                }
            }
        }
        while (!managedBlocker.isReleasable()) {
            if (managedBlocker.block()) {
                return;
            }
        }
    }

    protected <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new AdaptedRunnable(runnable, t);
    }

    protected <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new AdaptedCallable(callable);
    }

    static {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = java8.util.concurrent.UnsafeAccess.f48872a;
        f48818r = r0;
        r0 = f48818r;	 Catch:{ Exception -> 0x009b }
        r1 = java8.util.concurrent.ForkJoinPool.class;	 Catch:{ Exception -> 0x009b }
        r2 = "e";	 Catch:{ Exception -> 0x009b }
        r1 = r1.getDeclaredField(r2);	 Catch:{ Exception -> 0x009b }
        r0 = r0.objectFieldOffset(r1);	 Catch:{ Exception -> 0x009b }
        f48819s = r0;	 Catch:{ Exception -> 0x009b }
        r0 = f48818r;	 Catch:{ Exception -> 0x009b }
        r1 = java8.util.concurrent.ForkJoinPool.class;	 Catch:{ Exception -> 0x009b }
        r2 = "j";	 Catch:{ Exception -> 0x009b }
        r1 = r1.getDeclaredField(r2);	 Catch:{ Exception -> 0x009b }
        r0 = r0.objectFieldOffset(r1);	 Catch:{ Exception -> 0x009b }
        f48820t = r0;	 Catch:{ Exception -> 0x009b }
        r0 = f48818r;	 Catch:{ Exception -> 0x009b }
        r1 = java8.util.concurrent.ForkJoinTask[].class;	 Catch:{ Exception -> 0x009b }
        r0 = r0.arrayBaseOffset(r1);	 Catch:{ Exception -> 0x009b }
        f48821u = r0;	 Catch:{ Exception -> 0x009b }
        r0 = f48818r;	 Catch:{ Exception -> 0x009b }
        r1 = java8.util.concurrent.ForkJoinTask[].class;	 Catch:{ Exception -> 0x009b }
        r0 = r0.arrayIndexScale(r1);	 Catch:{ Exception -> 0x009b }
        r1 = r0 + -1;	 Catch:{ Exception -> 0x009b }
        r1 = r1 & r0;	 Catch:{ Exception -> 0x009b }
        if (r1 == 0) goto L_0x0043;	 Catch:{ Exception -> 0x009b }
    L_0x003b:
        r0 = new java.lang.Error;	 Catch:{ Exception -> 0x009b }
        r1 = "array index scale not a power of two";	 Catch:{ Exception -> 0x009b }
        r0.<init>(r1);	 Catch:{ Exception -> 0x009b }
        throw r0;	 Catch:{ Exception -> 0x009b }
    L_0x0043:
        r0 = java.lang.Integer.numberOfLeadingZeros(r0);	 Catch:{ Exception -> 0x009b }
        r0 = 31 - r0;	 Catch:{ Exception -> 0x009b }
        f48822v = r0;	 Catch:{ Exception -> 0x009b }
        r0 = java.util.concurrent.locks.LockSupport.class;
        r0 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r1 = "java.util.concurrent.ForkJoinPool.common.maximumSpares";	 Catch:{ Exception -> 0x005c }
        r1 = java.lang.System.getProperty(r1);	 Catch:{ Exception -> 0x005c }
        if (r1 == 0) goto L_0x005c;	 Catch:{ Exception -> 0x005c }
    L_0x0057:
        r1 = java.lang.Integer.parseInt(r1);	 Catch:{ Exception -> 0x005c }
        r0 = r1;
    L_0x005c:
        f48816p = r0;
        r0 = new java8.util.concurrent.ForkJoinPool$DefaultForkJoinWorkerThreadFactory;
        r1 = 0;
        r0.<init>();
        f48812a = r0;
        r0 = new java.lang.RuntimePermission;
        r2 = "modifyThread";
        r0.<init>(r2);
        f48813b = r0;
        r0 = new java8.util.concurrent.ForkJoinPool$1;
        r0.<init>();
        r0 = java.security.AccessController.doPrivileged(r0);
        r0 = (java8.util.concurrent.ForkJoinPool) r0;
        f48814c = r0;
        r0 = f48814c;
        r0 = r0.f48829j;
        r2 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        r0 = r0 & r2;
        r2 = 1;
        r0 = java.lang.Math.max(r0, r2);
        f48815d = r0;
        r0 = "java8.util.concurrent.CompletableFuture.AsynchronousCompletionTask";	 Catch:{ Exception -> 0x0098, all -> 0x0094 }
        r0 = java.lang.Class.forName(r0);	 Catch:{ Exception -> 0x0098, all -> 0x0094 }
        f48823w = r0;
        goto L_0x009a;
    L_0x0094:
        r0 = move-exception;
        f48823w = r1;
        throw r0;
    L_0x0098:
        f48823w = r1;
    L_0x009a:
        return;
    L_0x009b:
        r0 = move-exception;
        r1 = new java.lang.Error;
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.concurrent.ForkJoinPool.<clinit>():void");
    }
}
