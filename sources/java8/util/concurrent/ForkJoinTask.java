package java8.util.concurrent;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import java8.util.Objects;
import sun.misc.Unsafe;

public abstract class ForkJoinTask<V> implements Serializable, Future<V> {
    /* renamed from: a */
    private static final ExceptionNode[] f48839a = new ExceptionNode[32];
    /* renamed from: b */
    private static final ReentrantLock f48840b = new ReentrantLock();
    /* renamed from: c */
    private static final ReferenceQueue<ForkJoinTask<?>> f48841c = new ReferenceQueue();
    /* renamed from: d */
    private static final Unsafe f48842d = UnsafeAccess.f48872a;
    /* renamed from: e */
    private static final long f48843e;
    private static final long serialVersionUID = -7721805057305804111L;
    /* renamed from: n */
    volatile int f48844n;

    static final class ExceptionNode extends WeakReference<ForkJoinTask<?>> {
        /* renamed from: a */
        final Throwable f48835a;
        /* renamed from: b */
        ExceptionNode f48836b;
        /* renamed from: c */
        final long f48837c = Thread.currentThread().getId();
        /* renamed from: d */
        final int f48838d;

        ExceptionNode(ForkJoinTask<?> forkJoinTask, Throwable th, ExceptionNode exceptionNode, ReferenceQueue<ForkJoinTask<?>> referenceQueue) {
            super(forkJoinTask, referenceQueue);
            this.f48835a = th;
            this.f48836b = exceptionNode;
            this.f48838d = System.identityHashCode(forkJoinTask);
        }
    }

    static final class AdaptedCallable<T> extends ForkJoinTask<T> implements RunnableFuture<T> {
        private static final long serialVersionUID = 2838392045355241008L;
        /* renamed from: a */
        final Callable<? extends T> f54342a;
        /* renamed from: b */
        T f54343b;

        AdaptedCallable(Callable<? extends T> callable) {
            this.f54342a = (Callable) Objects.m59115b(callable);
        }

        /* renamed from: g */
        public final T mo12944g() {
            return this.f54343b;
        }

        /* renamed from: f */
        public final boolean mo12943f() {
            try {
                this.f54343b = this.f54342a.call();
                return true;
            } catch (RuntimeException e) {
                throw e;
            } catch (Throwable e2) {
                throw new RuntimeException(e2);
            }
        }

        public final void run() {
            m59285k();
        }
    }

    static final class AdaptedRunnable<T> extends ForkJoinTask<T> implements RunnableFuture<T> {
        private static final long serialVersionUID = 5232453952276885070L;
        /* renamed from: a */
        final Runnable f54344a;
        /* renamed from: b */
        T f54345b;

        AdaptedRunnable(Runnable runnable, T t) {
            this.f54344a = (Runnable) Objects.m59115b(runnable);
            this.f54345b = t;
        }

        /* renamed from: g */
        public final T mo12944g() {
            return this.f54345b;
        }

        /* renamed from: f */
        public final boolean mo12943f() {
            this.f54344a.run();
            return true;
        }

        public final void run() {
            m59285k();
        }
    }

    static final class AdaptedRunnableAction extends ForkJoinTask<Void> implements RunnableFuture<Void> {
        private static final long serialVersionUID = 5232453952276885070L;
        /* renamed from: a */
        final Runnable f54346a;

        /* renamed from: a */
        public final Void m63903a() {
            return null;
        }

        /* renamed from: g */
        public /* synthetic */ Object mo12944g() {
            return m63903a();
        }

        AdaptedRunnableAction(Runnable runnable) {
            this.f54346a = (Runnable) Objects.m59115b(runnable);
        }

        /* renamed from: f */
        public final boolean mo12943f() {
            this.f54346a.run();
            return true;
        }

        public final void run() {
            m59285k();
        }
    }

    static final class RunnableExecuteAction extends ForkJoinTask<Void> {
        private static final long serialVersionUID = 5232453952276885070L;
        /* renamed from: a */
        final Runnable f54347a;

        /* renamed from: a */
        public final Void m63906a() {
            return null;
        }

        /* renamed from: g */
        public /* synthetic */ Object mo12944g() {
            return m63906a();
        }

        RunnableExecuteAction(Runnable runnable) {
            this.f54347a = (Runnable) Objects.m59115b(runnable);
        }

        /* renamed from: f */
        public final boolean mo12943f() {
            this.f54347a.run();
            return true;
        }

        /* renamed from: a */
        void mo12938a(Throwable th) {
            ForkJoinTask.m59270c(th);
        }
    }

    /* renamed from: a */
    void mo12938a(Throwable th) {
    }

    /* renamed from: f */
    protected abstract boolean mo12943f();

    /* renamed from: g */
    public abstract V mo12944g();

    /* renamed from: a */
    private int mo12937a(int i) {
        int i2;
        do {
            i2 = this.f48844n;
            if (i2 < 0) {
                return i2;
            }
        } while (!f48842d.compareAndSwapInt(this, f48843e, i2, i2 | i));
        if ((i2 >>> 16) != 0) {
            synchronized (this) {
                notifyAll();
            }
        }
        return i;
    }

    /* renamed from: h */
    final int m59283h() {
        int i = this.f48844n;
        if (i >= 0) {
            try {
                if (mo12943f()) {
                    i = mo12937a(-268435456);
                }
            } catch (Throwable th) {
                return m59274e(th);
            }
        }
        return i;
    }

    final void a_(long r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        r4 = r6.f48844n;
        if (r4 < 0) goto L_0x0024;
    L_0x0004:
        r0 = f48842d;
        r2 = f48843e;
        r1 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r5 = r4 | r1;
        r1 = r6;
        r0 = r0.compareAndSwapInt(r1, r2, r4, r5);
        if (r0 == 0) goto L_0x0024;
    L_0x0013:
        monitor-enter(r6);
        r0 = r6.f48844n;	 Catch:{ all -> 0x0021 }
        if (r0 < 0) goto L_0x001c;
    L_0x0018:
        r6.wait(r7);	 Catch:{ InterruptedException -> 0x001f }
        goto L_0x001f;
    L_0x001c:
        r6.notifyAll();	 Catch:{ all -> 0x0021 }
    L_0x001f:
        monitor-exit(r6);	 Catch:{ all -> 0x0021 }
        goto L_0x0024;	 Catch:{ all -> 0x0021 }
    L_0x0021:
        r7 = move-exception;	 Catch:{ all -> 0x0021 }
        monitor-exit(r6);	 Catch:{ all -> 0x0021 }
        throw r7;
    L_0x0024:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.concurrent.ForkJoinTask.a_(long):void");
    }

    /* renamed from: c */
    private int mo12940c() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r8 = this;
        r0 = r8 instanceof java8.util.concurrent.CountedCompleter;
        r1 = 0;
        if (r0 == 0) goto L_0x000f;
    L_0x0005:
        r0 = java8.util.concurrent.ForkJoinPool.f48814c;
        r2 = r8;
        r2 = (java8.util.concurrent.CountedCompleter) r2;
        r0 = r0.m59252a(r2, r1);
        goto L_0x001d;
    L_0x000f:
        r0 = java8.util.concurrent.ForkJoinPool.f48814c;
        r0 = r0.m59264b(r8);
        if (r0 == 0) goto L_0x001c;
    L_0x0017:
        r0 = r8.m59283h();
        goto L_0x001d;
    L_0x001c:
        r0 = 0;
    L_0x001d:
        if (r0 < 0) goto L_0x0056;
    L_0x001f:
        r0 = r8.f48844n;
        if (r0 < 0) goto L_0x0056;
    L_0x0023:
        r6 = r0;
    L_0x0024:
        r2 = f48842d;
        r4 = f48843e;
        r0 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r7 = r6 | r0;
        r3 = r8;
        r0 = r2.compareAndSwapInt(r3, r4, r6, r7);
        if (r0 == 0) goto L_0x0048;
    L_0x0033:
        monitor-enter(r8);
        r0 = r8.f48844n;	 Catch:{ all -> 0x0045 }
        if (r0 < 0) goto L_0x0040;
    L_0x0038:
        r2 = 0;
        r8.wait(r2);	 Catch:{ InterruptedException -> 0x003e }
        goto L_0x0043;
    L_0x003e:
        r1 = 1;
        goto L_0x0043;
    L_0x0040:
        r8.notifyAll();	 Catch:{ all -> 0x0045 }
    L_0x0043:
        monitor-exit(r8);	 Catch:{ all -> 0x0045 }
        goto L_0x0048;	 Catch:{ all -> 0x0045 }
    L_0x0045:
        r0 = move-exception;	 Catch:{ all -> 0x0045 }
        monitor-exit(r8);	 Catch:{ all -> 0x0045 }
        throw r0;
    L_0x0048:
        r6 = r8.f48844n;
        if (r6 >= 0) goto L_0x0024;
    L_0x004c:
        if (r1 == 0) goto L_0x0055;
    L_0x004e:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
    L_0x0055:
        r0 = r6;
    L_0x0056:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.concurrent.ForkJoinTask.c():int");
    }

    /* renamed from: d */
    private int mo12941d() throws InterruptedException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int i = this.f48844n;
        if (i < 0) {
            return i;
        }
        i = this instanceof CountedCompleter ? ForkJoinPool.f48814c.m59252a((CountedCompleter) this, 0) : ForkJoinPool.f48814c.m59264b(this) ? m59283h() : 0;
        if (i < 0) {
            return i;
        }
        while (true) {
            int i2 = this.f48844n;
            if (i2 < 0) {
                return i2;
            }
            if (f48842d.compareAndSwapInt(this, f48843e, i2, i2 | 65536)) {
                synchronized (this) {
                    if (this.f48844n >= 0) {
                        wait(0);
                    } else {
                        notifyAll();
                    }
                }
            }
        }
    }

    /* renamed from: e */
    private int mo12942e() {
        int i = this.f48844n;
        if (i < 0) {
            return i;
        }
        Thread currentThread = Thread.currentThread();
        if (!(currentThread instanceof ForkJoinWorkerThread)) {
            return mo12940c();
        }
        ForkJoinWorkerThread forkJoinWorkerThread = (ForkJoinWorkerThread) currentThread;
        WorkQueue workQueue = forkJoinWorkerThread.f48846b;
        if (workQueue.m59231b(this)) {
            int h = m59283h();
            if (h < 0) {
                return h;
            }
        }
        return forkJoinWorkerThread.f48845a.m59253a(workQueue, this, 0);
    }

    /* renamed from: o */
    private int mo13726o() {
        int h = m59283h();
        if (h < 0) {
            return h;
        }
        Thread currentThread = Thread.currentThread();
        if (!(currentThread instanceof ForkJoinWorkerThread)) {
            return mo12940c();
        }
        ForkJoinWorkerThread forkJoinWorkerThread = (ForkJoinWorkerThread) currentThread;
        return forkJoinWorkerThread.f48845a.m59253a(forkJoinWorkerThread.f48846b, this, 0);
    }

    static {
        try {
            f48843e = f48842d.objectFieldOffset(ForkJoinTask.class.getDeclaredField("n"));
        } catch (Throwable e) {
            throw new Error(e);
        }
    }

    /* renamed from: b */
    final int m59280b(Throwable th) {
        int i = this.f48844n;
        if (i < 0) {
            return i;
        }
        i = System.identityHashCode(this);
        ReentrantLock reentrantLock = f48840b;
        reentrantLock.lock();
        try {
            mo14010q();
            ExceptionNode[] exceptionNodeArr = f48839a;
            i &= exceptionNodeArr.length - 1;
            for (ExceptionNode exceptionNode = exceptionNodeArr[i]; exceptionNode != null; exceptionNode = exceptionNode.f48836b) {
                if (exceptionNode.get() == this) {
                    break;
                }
            }
            exceptionNodeArr[i] = new ExceptionNode(this, th, exceptionNodeArr[i], f48841c);
            reentrantLock.unlock();
            return mo12937a(Integer.MIN_VALUE);
        } catch (Throwable th2) {
            reentrantLock.unlock();
        }
    }

    /* renamed from: e */
    private int m59274e(Throwable th) {
        int b = m59280b(th);
        if ((-268435456 & b) == Integer.MIN_VALUE) {
            mo12938a(th);
        }
        return b;
    }

    /* renamed from: a */
    static final void m59267a(java8.util.concurrent.ForkJoinTask<?> r1) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        if (r1 == 0) goto L_0x000a;
    L_0x0002:
        r0 = r1.f48844n;
        if (r0 < 0) goto L_0x000a;
    L_0x0006:
        r0 = 0;
        r1.cancel(r0);	 Catch:{ Throwable -> 0x000a }
    L_0x000a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.concurrent.ForkJoinTask.a(java8.util.concurrent.ForkJoinTask):void");
    }

    /* renamed from: p */
    private java.lang.Throwable mo13614p() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r10 = this;
        r0 = java.lang.System.identityHashCode(r10);
        r1 = f48840b;
        r1.lock();
        mo14010q();	 Catch:{ all -> 0x0078 }
        r2 = f48839a;	 Catch:{ all -> 0x0078 }
        r3 = r2.length;	 Catch:{ all -> 0x0078 }
        r4 = 1;	 Catch:{ all -> 0x0078 }
        r3 = r3 - r4;	 Catch:{ all -> 0x0078 }
        r0 = r0 & r3;	 Catch:{ all -> 0x0078 }
        r0 = r2[r0];	 Catch:{ all -> 0x0078 }
    L_0x0014:
        if (r0 == 0) goto L_0x001f;	 Catch:{ all -> 0x0078 }
    L_0x0016:
        r2 = r0.get();	 Catch:{ all -> 0x0078 }
        if (r2 == r10) goto L_0x001f;	 Catch:{ all -> 0x0078 }
    L_0x001c:
        r0 = r0.f48836b;	 Catch:{ all -> 0x0078 }
        goto L_0x0014;
    L_0x001f:
        r1.unlock();
        r1 = 0;
        if (r0 == 0) goto L_0x0077;
    L_0x0025:
        r2 = r0.f48835a;
        if (r2 != 0) goto L_0x002a;
    L_0x0029:
        goto L_0x0077;
    L_0x002a:
        r5 = r0.f48837c;
        r0 = java.lang.Thread.currentThread();
        r7 = r0.getId();
        r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r0 == 0) goto L_0x0076;
    L_0x0038:
        r0 = r2.getClass();	 Catch:{ Exception -> 0x0076 }
        r0 = r0.getConstructors();	 Catch:{ Exception -> 0x0076 }
        r3 = r0.length;	 Catch:{ Exception -> 0x0076 }
        r5 = 0;	 Catch:{ Exception -> 0x0076 }
        r6 = r1;	 Catch:{ Exception -> 0x0076 }
        r1 = 0;	 Catch:{ Exception -> 0x0076 }
    L_0x0044:
        if (r1 >= r3) goto L_0x0068;	 Catch:{ Exception -> 0x0076 }
    L_0x0046:
        r7 = r0[r1];	 Catch:{ Exception -> 0x0076 }
        r8 = r7.getParameterTypes();	 Catch:{ Exception -> 0x0076 }
        r9 = r8.length;	 Catch:{ Exception -> 0x0076 }
        if (r9 != 0) goto L_0x0051;	 Catch:{ Exception -> 0x0076 }
    L_0x004f:
        r6 = r7;	 Catch:{ Exception -> 0x0076 }
        goto L_0x0065;	 Catch:{ Exception -> 0x0076 }
    L_0x0051:
        r9 = r8.length;	 Catch:{ Exception -> 0x0076 }
        if (r9 != r4) goto L_0x0065;	 Catch:{ Exception -> 0x0076 }
    L_0x0054:
        r8 = r8[r5];	 Catch:{ Exception -> 0x0076 }
        r9 = java.lang.Throwable.class;	 Catch:{ Exception -> 0x0076 }
        if (r8 != r9) goto L_0x0065;	 Catch:{ Exception -> 0x0076 }
    L_0x005a:
        r0 = new java.lang.Object[r4];	 Catch:{ Exception -> 0x0076 }
        r0[r5] = r2;	 Catch:{ Exception -> 0x0076 }
        r0 = r7.newInstance(r0);	 Catch:{ Exception -> 0x0076 }
        r0 = (java.lang.Throwable) r0;	 Catch:{ Exception -> 0x0076 }
        return r0;	 Catch:{ Exception -> 0x0076 }
    L_0x0065:
        r1 = r1 + 1;	 Catch:{ Exception -> 0x0076 }
        goto L_0x0044;	 Catch:{ Exception -> 0x0076 }
    L_0x0068:
        if (r6 == 0) goto L_0x0076;	 Catch:{ Exception -> 0x0076 }
    L_0x006a:
        r0 = new java.lang.Object[r5];	 Catch:{ Exception -> 0x0076 }
        r0 = r6.newInstance(r0);	 Catch:{ Exception -> 0x0076 }
        r0 = (java.lang.Throwable) r0;	 Catch:{ Exception -> 0x0076 }
        r0.initCause(r2);	 Catch:{ Exception -> 0x0076 }
        return r0;
    L_0x0076:
        return r2;
    L_0x0077:
        return r1;
    L_0x0078:
        r0 = move-exception;
        r1.unlock();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.concurrent.ForkJoinTask.p():java.lang.Throwable");
    }

    /* renamed from: q */
    private static void mo14010q() {
        while (true) {
            Reference poll = f48841c.poll();
            if (poll == null) {
                return;
            }
            if (poll instanceof ExceptionNode) {
                ExceptionNode[] exceptionNodeArr = f48839a;
                int length = ((ExceptionNode) poll).f48838d & (exceptionNodeArr.length - 1);
                Reference reference = exceptionNodeArr[length];
                ExceptionNode exceptionNode = null;
                while (reference != null) {
                    Reference reference2 = reference.f48836b;
                    if (reference != poll) {
                        Reference reference3 = reference;
                        reference = reference2;
                    } else if (exceptionNode == null) {
                        exceptionNodeArr[length] = reference2;
                    } else {
                        exceptionNode.f48836b = reference2;
                    }
                }
            }
        }
    }

    /* renamed from: i */
    static final void m59275i() {
        ReentrantLock reentrantLock = f48840b;
        if (reentrantLock.tryLock()) {
            try {
                mo14010q();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* renamed from: c */
    static void m59270c(Throwable th) {
        m59272d(th);
    }

    /* renamed from: d */
    static <T extends Throwable> void m59272d(Throwable th) throws Throwable {
        if (th != null) {
            throw th;
        }
        throw new Error("Unknown Exception");
    }

    /* renamed from: b */
    private void mo12939b(int i) {
        if (i == -1073741824) {
            throw new CancellationException();
        } else if (i == Integer.MIN_VALUE) {
            m59270c(mo13614p());
        }
    }

    /* renamed from: j */
    public final ForkJoinTask<V> m59284j() {
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof ForkJoinWorkerThread) {
            ((ForkJoinWorkerThread) currentThread).f48846b.m59228a(this);
        } else {
            ForkJoinPool.f48814c.m59260a(this);
        }
        return this;
    }

    /* renamed from: k */
    public final V m59285k() {
        int o = mo13726o() & -268435456;
        if (o != -268435456) {
            mo12939b(o);
        }
        return mo12944g();
    }

    public boolean cancel(boolean z) {
        return (mo12937a(-1073741824) & -268435456) == -1073741824;
    }

    public final boolean isDone() {
        return this.f48844n < 0;
    }

    public final boolean isCancelled() {
        return (this.f48844n & -268435456) == -1073741824;
    }

    /* renamed from: l */
    public final Throwable m59286l() {
        int i = this.f48844n & -268435456;
        if (i >= -268435456) {
            return null;
        }
        if (i == -1073741824) {
            return new CancellationException();
        }
        return mo13614p();
    }

    /* renamed from: m */
    public final void m59287m() {
        mo12937a(-268435456);
    }

    public final V get() throws InterruptedException, ExecutionException {
        int e = (Thread.currentThread() instanceof ForkJoinWorkerThread ? mo12942e() : mo12941d()) & -268435456;
        if (e == -1073741824) {
            throw new CancellationException();
        } else if (e != Integer.MIN_VALUE) {
            return mo12944g();
        } else {
            throw new ExecutionException(mo13614p());
        }
    }

    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        j = timeUnit.toNanos(j);
        if (Thread.interrupted() != null) {
            throw new InterruptedException();
        }
        timeUnit = this.f48844n;
        if (timeUnit >= null && j > 0) {
            long nanoTime = System.nanoTime() + j;
            if (nanoTime == 0) {
                nanoTime = 1;
            }
            j = Thread.currentThread();
            if (j instanceof ForkJoinWorkerThread) {
                ForkJoinWorkerThread forkJoinWorkerThread = (ForkJoinWorkerThread) j;
                timeUnit = forkJoinWorkerThread.f48845a.m59253a(forkJoinWorkerThread.f48846b, this, nanoTime);
            } else {
                int i;
                long nanoTime2;
                if ((this instanceof CountedCompleter) != null) {
                    j = ForkJoinPool.f48814c.m59252a((CountedCompleter) this, 0);
                } else if (ForkJoinPool.f48814c.m59264b(this) != null) {
                    j = m59283h();
                } else {
                    timeUnit = null;
                    if (timeUnit >= null) {
                        while (true) {
                            i = this.f48844n;
                            if (i >= 0) {
                                break;
                            }
                            nanoTime2 = nanoTime - System.nanoTime();
                            if (nanoTime2 > 0) {
                                break;
                            }
                            j = TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                            if (j > 0 && f48842d.compareAndSwapInt(this, f48843e, i, i | 65536) != null) {
                                synchronized (this) {
                                    if (this.f48844n < null) {
                                        wait(j);
                                    } else {
                                        notifyAll();
                                    }
                                }
                            }
                        }
                        timeUnit = i;
                    }
                }
                timeUnit = j;
                if (timeUnit >= null) {
                    while (true) {
                        i = this.f48844n;
                        if (i >= 0) {
                            break;
                        }
                        nanoTime2 = nanoTime - System.nanoTime();
                        if (nanoTime2 > 0) {
                            break;
                        }
                        j = TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                        synchronized (this) {
                            if (this.f48844n < null) {
                                notifyAll();
                            } else {
                                wait(j);
                            }
                        }
                    }
                    timeUnit = i;
                }
            }
        }
        if (timeUnit >= null) {
            timeUnit = this.f48844n;
        }
        int i2 = timeUnit & -268435456;
        if (i2 == -268435456) {
            return mo12944g();
        }
        if (i2 == -1073741824) {
            throw new CancellationException();
        } else if (i2 != -2147483648L) {
            throw new TimeoutException();
        } else {
            throw new ExecutionException(mo13614p());
        }
    }

    /* renamed from: n */
    public final void m59288n() {
        mo12942e();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(m59286l());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        objectInputStream = objectInputStream.readObject();
        if (objectInputStream != null) {
            m59274e((Throwable) objectInputStream);
        }
    }
}
