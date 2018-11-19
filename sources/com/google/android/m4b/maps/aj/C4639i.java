package com.google.android.m4b.maps.aj;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.google.android.m4b.maps.aj.i */
public final class C4639i {

    /* renamed from: com.google.android.m4b.maps.aj.i$a */
    static class C6398a extends C4637h {
        /* renamed from: a */
        private final Lock f23727a;
        /* renamed from: b */
        private final Condition f23728b;
        /* renamed from: c */
        private int f23729c;
        /* renamed from: d */
        private boolean f23730d;

        private C6398a() {
            this.f23727a = new ReentrantLock();
            this.f23728b = this.f23727a.newCondition();
            this.f23729c = 0;
            this.f23730d = false;
        }

        public final boolean isShutdown() {
            this.f23727a.lock();
            try {
                boolean z = this.f23730d;
                return z;
            } finally {
                this.f23727a.unlock();
            }
        }

        public final void shutdown() {
            this.f23727a.lock();
            try {
                this.f23730d = true;
            } finally {
                this.f23727a.unlock();
            }
        }

        public final List<Runnable> shutdownNow() {
            shutdown();
            return Collections.emptyList();
        }

        public final boolean isTerminated() {
            this.f23727a.lock();
            try {
                boolean z = this.f23730d && this.f23729c == 0;
                this.f23727a.unlock();
                return z;
            } catch (Throwable th) {
                this.f23727a.unlock();
            }
        }

        public final boolean awaitTermination(long j, TimeUnit timeUnit) {
            j = timeUnit.toNanos(j);
            this.f23727a.lock();
            while (isTerminated() == null) {
                if (j <= 0) {
                    return 0;
                }
                try {
                    j = this.f23728b.awaitNanos(j);
                } finally {
                    this.f23727a.unlock();
                }
            }
            this.f23727a.unlock();
            return 1;
        }

        /* renamed from: a */
        private void m27917a() {
            this.f23727a.lock();
            try {
                this.f23729c--;
                if (isTerminated()) {
                    this.f23728b.signalAll();
                }
                this.f23727a.unlock();
            } catch (Throwable th) {
                this.f23727a.unlock();
            }
        }

        public final void execute(Runnable runnable) {
            this.f23727a.lock();
            try {
                if (isShutdown()) {
                    throw new RejectedExecutionException("Executor already shutdown");
                }
                this.f23729c++;
                try {
                    runnable.run();
                } finally {
                    m27917a();
                }
            } finally {
                this.f23727a.unlock();
            }
        }
    }

    /* renamed from: a */
    public static C4637h m20764a() {
        return new C6398a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    static <T> T m20765a(com.google.android.m4b.maps.aj.C4637h r21, java.util.Collection<? extends java.util.concurrent.Callable<T>> r22, boolean r23, long r24) {
        /*
        r1 = r21;
        com.google.android.m4b.maps.p125y.C5571j.m24292a(r21);
        r3 = r22.size();
        if (r3 <= 0) goto L_0x000d;
    L_0x000b:
        r5 = 1;
        goto L_0x000e;
    L_0x000d:
        r5 = 0;
    L_0x000e:
        com.google.android.m4b.maps.p125y.C5571j.m24297a(r5);
        r5 = com.google.android.m4b.maps.aa.au.m20524a(r3);
        r6 = new java.util.concurrent.LinkedBlockingQueue;
        r6.<init>();
        if (r23 == 0) goto L_0x0025;
    L_0x001c:
        r7 = java.lang.System.nanoTime();	 Catch:{ all -> 0x0021 }
        goto L_0x0027;
    L_0x0021:
        r0 = move-exception;
        r1 = r0;
        goto L_0x00b9;
    L_0x0025:
        r7 = 0;
    L_0x0027:
        r9 = r22.iterator();	 Catch:{ all -> 0x0021 }
        r10 = r9.next();	 Catch:{ all -> 0x0021 }
        r10 = (java.util.concurrent.Callable) r10;	 Catch:{ all -> 0x0021 }
        r10 = com.google.android.m4b.maps.aj.C4639i.m20763a(r1, r10, r6);	 Catch:{ all -> 0x0021 }
        r5.add(r10);	 Catch:{ all -> 0x0021 }
        r3 = r3 + -1;
        r10 = 0;
        r11 = r24;
        r13 = r7;
        r8 = r10;
        r7 = 1;
    L_0x0040:
        r15 = r6.poll();	 Catch:{ all -> 0x0021 }
        r15 = (java.util.concurrent.Future) r15;	 Catch:{ all -> 0x0021 }
        if (r15 != 0) goto L_0x0090;
    L_0x0048:
        if (r3 <= 0) goto L_0x005e;
    L_0x004a:
        r3 = r3 + -1;
        r16 = r9.next();	 Catch:{ all -> 0x0021 }
        r4 = r16;
        r4 = (java.util.concurrent.Callable) r4;	 Catch:{ all -> 0x0021 }
        r4 = com.google.android.m4b.maps.aj.C4639i.m20763a(r1, r4, r6);	 Catch:{ all -> 0x0021 }
        r5.add(r4);	 Catch:{ all -> 0x0021 }
        r7 = r7 + 1;
        goto L_0x0090;
    L_0x005e:
        if (r7 == 0) goto L_0x0088;
    L_0x0060:
        if (r23 == 0) goto L_0x0080;
    L_0x0062:
        r4 = java.util.concurrent.TimeUnit.NANOSECONDS;	 Catch:{ all -> 0x0021 }
        r4 = r6.poll(r11, r4);	 Catch:{ all -> 0x0021 }
        r15 = r4;
        r15 = (java.util.concurrent.Future) r15;	 Catch:{ all -> 0x0021 }
        if (r15 != 0) goto L_0x0073;
    L_0x006d:
        r1 = new java.util.concurrent.TimeoutException;	 Catch:{ all -> 0x0021 }
        r1.<init>();	 Catch:{ all -> 0x0021 }
        throw r1;	 Catch:{ all -> 0x0021 }
    L_0x0073:
        r17 = java.lang.System.nanoTime();	 Catch:{ all -> 0x0021 }
        r4 = 0;
        r19 = r17 - r13;
        r13 = r11 - r19;
        r11 = r13;
        r13 = r17;
        goto L_0x0090;
    L_0x0080:
        r4 = r6.take();	 Catch:{ all -> 0x0021 }
        r15 = r4;
        r15 = (java.util.concurrent.Future) r15;	 Catch:{ all -> 0x0021 }
        goto L_0x0090;
    L_0x0088:
        if (r8 != 0) goto L_0x008f;
    L_0x008a:
        r8 = new java.util.concurrent.ExecutionException;	 Catch:{ all -> 0x0021 }
        r8.<init>(r10);	 Catch:{ all -> 0x0021 }
    L_0x008f:
        throw r8;	 Catch:{ all -> 0x0021 }
    L_0x0090:
        if (r15 == 0) goto L_0x0040;
    L_0x0092:
        r7 = r7 + -1;
        r4 = r15.get();	 Catch:{ ExecutionException -> 0x00b6, RuntimeException -> 0x00ae }
        r1 = r5.iterator();
    L_0x009c:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x00ad;
    L_0x00a2:
        r2 = r1.next();
        r2 = (java.util.concurrent.Future) r2;
        r3 = 1;
        r2.cancel(r3);
        goto L_0x009c;
    L_0x00ad:
        return r4;
    L_0x00ae:
        r0 = move-exception;
        r4 = new java.util.concurrent.ExecutionException;	 Catch:{ all -> 0x0021 }
        r4.<init>(r0);	 Catch:{ all -> 0x0021 }
        r8 = r4;
        goto L_0x0040;
    L_0x00b6:
        r0 = move-exception;
        r8 = r0;
        goto L_0x0040;
    L_0x00b9:
        r2 = r5.iterator();
    L_0x00bd:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x00ce;
    L_0x00c3:
        r3 = r2.next();
        r3 = (java.util.concurrent.Future) r3;
        r4 = 1;
        r3.cancel(r4);
        goto L_0x00bd;
    L_0x00ce:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.aj.i.a(com.google.android.m4b.maps.aj.h, java.util.Collection, boolean, long):T");
    }

    /* renamed from: a */
    private static <T> C4636f<T> m20763a(C4637h c4637h, Callable<T> callable, final BlockingQueue<Future<T>> blockingQueue) {
        c4637h = c4637h.m20762a((Callable) callable);
        c4637h.mo4860a(new Runnable() {
            public final void run() {
                blockingQueue.add(c4637h);
            }
        }, C4639i.m20764a());
        return c4637h;
    }
}
