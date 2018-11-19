package java8.util.concurrent;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import java8.util.concurrent.ForkJoinPool.ManagedBlocker;
import sun.misc.Unsafe;

public class Phaser {
    /* renamed from: a */
    static final int f48847a = (f48848g < 2 ? 1 : 256);
    /* renamed from: g */
    private static final int f48848g = Runtime.getRuntime().availableProcessors();
    /* renamed from: h */
    private static final Unsafe f48849h = UnsafeAccess.f48872a;
    /* renamed from: i */
    private static final long f48850i;
    /* renamed from: b */
    private volatile long f48851b;
    /* renamed from: c */
    private final Phaser f48852c;
    /* renamed from: d */
    private final Phaser f48853d;
    /* renamed from: e */
    private final AtomicReference<QNode> f48854e;
    /* renamed from: f */
    private final AtomicReference<QNode> f48855f;

    static final class QNode implements ManagedBlocker {
        /* renamed from: a */
        final Phaser f54350a;
        /* renamed from: b */
        final int f54351b;
        /* renamed from: c */
        final boolean f54352c;
        /* renamed from: d */
        final boolean f54353d;
        /* renamed from: e */
        boolean f54354e;
        /* renamed from: f */
        long f54355f;
        /* renamed from: g */
        final long f54356g;
        /* renamed from: h */
        volatile Thread f54357h;
        /* renamed from: i */
        QNode f54358i;

        QNode(Phaser phaser, int i, boolean z, boolean z2, long j) {
            this.f54350a = phaser;
            this.f54351b = i;
            this.f54352c = z;
            this.f54355f = j;
            this.f54353d = z2;
            this.f54356g = z2 ? System.nanoTime() + j : 0;
            this.f54357h = Thread.currentThread();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean isReleasable() {
            /*
            r12 = this;
            r0 = r12.f54357h;
            r1 = 1;
            if (r0 != 0) goto L_0x0006;
        L_0x0005:
            return r1;
        L_0x0006:
            r0 = r12.f54350a;
            r0 = r0.m59303a();
            r2 = r12.f54351b;
            r3 = 0;
            if (r0 == r2) goto L_0x0014;
        L_0x0011:
            r12.f54357h = r3;
            return r1;
        L_0x0014:
            r0 = java.lang.Thread.interrupted();
            if (r0 == 0) goto L_0x001c;
        L_0x001a:
            r12.f54354e = r1;
        L_0x001c:
            r0 = r12.f54354e;
            if (r0 == 0) goto L_0x0027;
        L_0x0020:
            r0 = r12.f54352c;
            if (r0 == 0) goto L_0x0027;
        L_0x0024:
            r12.f54357h = r3;
            return r1;
        L_0x0027:
            r0 = r12.f54353d;
            if (r0 == 0) goto L_0x0044;
        L_0x002b:
            r4 = r12.f54355f;
            r6 = 0;
            r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
            if (r0 <= 0) goto L_0x0041;
        L_0x0033:
            r4 = r12.f54356g;
            r8 = java.lang.System.nanoTime();
            r10 = r4 - r8;
            r12.f54355f = r10;
            r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1));
            if (r0 > 0) goto L_0x0044;
        L_0x0041:
            r12.f54357h = r3;
            return r1;
        L_0x0044:
            r0 = 0;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: java8.util.concurrent.Phaser.QNode.isReleasable():boolean");
        }

        public boolean block() {
            while (!isReleasable()) {
                if (this.f54353d) {
                    LockSupport.parkNanos(this, this.f54355f);
                } else {
                    LockSupport.park(this);
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    private static int m59295a(long j) {
        return ((int) j) >>> 16;
    }

    /* renamed from: b */
    private static int m59296b(long j) {
        return (int) (j >>> 32);
    }

    /* renamed from: c */
    private static int m59300c(long j) {
        int i = (int) j;
        return i == 1 ? 0 : (i >>> 16) - (i & 65535);
    }

    /* renamed from: d */
    private String m59301d(long j) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Attempt to register more than 65535 parties for ");
        stringBuilder.append(m59302e(j));
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private int m59293a(int r15) {
        /*
        r14 = this;
        r0 = (long) r15;
        r2 = 16;
        r2 = r0 << r2;
        r4 = r2 | r0;
        r0 = r14.f48852c;
    L_0x0009:
        if (r0 != 0) goto L_0x000f;
    L_0x000b:
        r1 = r14.f48851b;
    L_0x000d:
        r10 = r1;
        goto L_0x0014;
    L_0x000f:
        r1 = r14.m59297b();
        goto L_0x000d;
    L_0x0014:
        r1 = (int) r10;
        r2 = r1 >>> 16;
        r3 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        r6 = r1 & r3;
        r3 = r3 - r2;
        if (r15 <= r3) goto L_0x0029;
    L_0x001f:
        r15 = new java.lang.IllegalStateException;
        r0 = r14.m59301d(r10);
        r15.<init>(r0);
        throw r15;
    L_0x0029:
        r2 = 32;
        r7 = r10 >>> r2;
        r3 = (int) r7;
        if (r3 >= 0) goto L_0x0031;
    L_0x0030:
        goto L_0x0090;
    L_0x0031:
        r7 = 1;
        if (r1 == r7) goto L_0x0055;
    L_0x0034:
        if (r0 == 0) goto L_0x003e;
    L_0x0036:
        r1 = r14.m59297b();
        r7 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1));
        if (r7 != 0) goto L_0x0009;
    L_0x003e:
        if (r6 != 0) goto L_0x0047;
    L_0x0040:
        r1 = r14.f48853d;
        r2 = 0;
        r1.m59294a(r3, r2);
        goto L_0x0009;
    L_0x0047:
        r6 = f48849h;
        r8 = f48850i;
        r12 = r10 + r4;
        r7 = r14;
        r1 = r6.compareAndSwapLong(r7, r8, r10, r12);
        if (r1 == 0) goto L_0x0009;
    L_0x0054:
        goto L_0x0090;
    L_0x0055:
        if (r0 != 0) goto L_0x0068;
    L_0x0057:
        r6 = (long) r3;
        r1 = r6 << r2;
        r12 = r1 | r4;
        r6 = f48849h;
        r8 = f48850i;
        r7 = r14;
        r1 = r6.compareAndSwapLong(r7, r8, r10, r12);
        if (r1 == 0) goto L_0x0009;
    L_0x0067:
        goto L_0x0090;
    L_0x0068:
        monitor-enter(r14);
        r8 = r14.f48851b;	 Catch:{ all -> 0x0094 }
        r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r1 != 0) goto L_0x0091;
    L_0x006f:
        r3 = r0.m59293a(r7);	 Catch:{ all -> 0x0094 }
        if (r3 >= 0) goto L_0x0077;
    L_0x0075:
        monitor-exit(r14);	 Catch:{ all -> 0x0094 }
        goto L_0x0090;
    L_0x0077:
        r6 = f48849h;	 Catch:{ all -> 0x0094 }
        r8 = f48850i;	 Catch:{ all -> 0x0094 }
        r0 = (long) r3;	 Catch:{ all -> 0x0094 }
        r0 = r0 << r2;
        r12 = r0 | r4;
        r7 = r14;
        r15 = r6.compareAndSwapLong(r7, r8, r10, r12);	 Catch:{ all -> 0x0094 }
        if (r15 != 0) goto L_0x008f;
    L_0x0086:
        r10 = r14.f48851b;	 Catch:{ all -> 0x0094 }
        r15 = r14.f48853d;	 Catch:{ all -> 0x0094 }
        r0 = r15.f48851b;	 Catch:{ all -> 0x0094 }
        r0 = r0 >>> r2;
        r3 = (int) r0;	 Catch:{ all -> 0x0094 }
        goto L_0x0077;
    L_0x008f:
        monitor-exit(r14);	 Catch:{ all -> 0x0094 }
    L_0x0090:
        return r3;
    L_0x0091:
        monitor-exit(r14);	 Catch:{ all -> 0x0094 }
        goto L_0x0009;
    L_0x0094:
        r15 = move-exception;
        monitor-exit(r14);	 Catch:{ all -> 0x0094 }
        throw r15;
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.concurrent.Phaser.a(int):int");
    }

    /* renamed from: b */
    private long m59297b() {
        Phaser phaser = this.f48853d;
        long j = this.f48851b;
        if (phaser == this) {
            return j;
        }
        long j2 = j;
        while (true) {
            int i = (int) (phaser.f48851b >>> 32);
            if (i == ((int) (j2 >>> 32))) {
                return j2;
            }
            long j3;
            Unsafe unsafe = f48849h;
            long j4 = f48850i;
            long j5 = ((long) i) << 32;
            if (i < 0) {
                j3 = j2 & 4294967295L;
            } else {
                i = ((int) j2) >>> 16;
                j3 = i == 0 ? 1 : (j2 & 4294901760L) | ((long) i);
            }
            long j6 = j5 | j3;
            if (unsafe.compareAndSwapLong(this, j4, j2, j6)) {
                return j6;
            }
            j2 = this.f48851b;
        }
    }

    public Phaser() {
        this(null, 0);
    }

    public Phaser(Phaser phaser, int i) {
        if ((i >>> 16) != 0) {
            throw new IllegalArgumentException("Illegal number of parties");
        }
        int i2 = 0;
        this.f48852c = phaser;
        if (phaser != null) {
            Phaser phaser2 = phaser.f48853d;
            this.f48853d = phaser2;
            this.f48854e = phaser2.f48854e;
            this.f48855f = phaser2.f48855f;
            if (i != 0) {
                i2 = phaser.m59293a(1);
            }
        } else {
            this.f48853d = this;
            this.f48854e = new AtomicReference();
            this.f48855f = new AtomicReference();
        }
        if (i == 0) {
            phaser = true;
        } else {
            phaser = (long) i;
            phaser = ((((long) i2) << 32) | (phaser << 16)) | phaser;
        }
        this.f48851b = phaser;
    }

    /* renamed from: a */
    public final int m59303a() {
        return (int) (this.f48853d.f48851b >>> 32);
    }

    public String toString() {
        return m59302e(m59297b());
    }

    /* renamed from: e */
    private String m59302e(long j) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("[phase = ");
        stringBuilder.append(m59296b(j));
        stringBuilder.append(" parties = ");
        stringBuilder.append(m59295a(j));
        stringBuilder.append(" arrived = ");
        stringBuilder.append(m59300c(j));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /* renamed from: b */
    private void m59298b(int i) {
        i = (i & 1) == 0 ? this.f48854e : this.f48855f;
        while (true) {
            QNode qNode = (QNode) i.get();
            if (qNode != null && qNode.f54351b != ((int) (this.f48853d.f48851b >>> 32))) {
                if (i.compareAndSet(qNode, qNode.f54358i)) {
                    Thread thread = qNode.f54357h;
                    if (thread != null) {
                        qNode.f54357h = null;
                        LockSupport.unpark(thread);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    private int m59299c(int i) {
        int i2;
        i = (i & 1) == 0 ? this.f48854e : this.f48855f;
        while (true) {
            QNode qNode = (QNode) i.get();
            i2 = (int) (this.f48853d.f48851b >>> 32);
            if (qNode == null) {
                break;
            }
            Thread thread = qNode.f54357h;
            if (thread != null && qNode.f54351b == i2) {
                break;
            } else if (i.compareAndSet(qNode, qNode.f54358i) && thread != null) {
                qNode.f54357h = null;
                LockSupport.unpark(thread);
            }
        }
        return i2;
    }

    static {
        try {
            f48850i = f48849h.objectFieldOffset(Phaser.class.getDeclaredField("b"));
            Class cls = LockSupport.class;
        } catch (Throwable e) {
            throw new Error(e);
        }
    }

    /* renamed from: a */
    private int m59294a(int r12, java8.util.concurrent.Phaser.QNode r13) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r11 = this;
        r0 = r12 + -1;
        r11.m59298b(r0);
        r0 = f48847a;
        r1 = 0;
        r2 = r0;
        r0 = 0;
    L_0x000a:
        r3 = r11.f48851b;
        r5 = 32;
        r6 = r3 >>> r5;
        r6 = (int) r6;
        if (r6 != r12) goto L_0x0071;
    L_0x0013:
        if (r13 != 0) goto L_0x003d;
    L_0x0015:
        r3 = (int) r3;
        r4 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        r3 = r3 & r4;
        if (r3 == r1) goto L_0x0024;
    L_0x001c:
        r1 = f48848g;
        if (r3 >= r1) goto L_0x0023;
    L_0x0020:
        r1 = f48847a;
        r2 = r2 + r1;
    L_0x0023:
        r1 = r3;
    L_0x0024:
        r3 = java.lang.Thread.interrupted();
        if (r3 != 0) goto L_0x002e;
    L_0x002a:
        r2 = r2 + -1;
        if (r2 >= 0) goto L_0x000a;
    L_0x002e:
        r13 = new java8.util.concurrent.Phaser$QNode;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r4 = r13;
        r5 = r11;
        r6 = r12;
        r4.<init>(r5, r6, r7, r8, r9);
        r13.f54354e = r3;
        goto L_0x000a;
    L_0x003d:
        r3 = r13.isReleasable();
        if (r3 == 0) goto L_0x0044;
    L_0x0043:
        goto L_0x0071;
    L_0x0044:
        if (r0 != 0) goto L_0x0069;
    L_0x0046:
        r3 = r12 & 1;
        if (r3 != 0) goto L_0x004d;
    L_0x004a:
        r3 = r11.f48854e;
        goto L_0x004f;
    L_0x004d:
        r3 = r11.f48855f;
    L_0x004f:
        r4 = r3.get();
        r4 = (java8.util.concurrent.Phaser.QNode) r4;
        r13.f54358i = r4;
        if (r4 == 0) goto L_0x005d;
    L_0x0059:
        r6 = r4.f54351b;
        if (r6 != r12) goto L_0x000a;
    L_0x005d:
        r6 = r11.f48851b;
        r5 = r6 >>> r5;
        r5 = (int) r5;
        if (r5 != r12) goto L_0x000a;
    L_0x0064:
        r0 = r3.compareAndSet(r4, r13);
        goto L_0x000a;
    L_0x0069:
        java8.util.concurrent.ForkJoinPool.m59244a(r13);	 Catch:{ InterruptedException -> 0x006d }
        goto L_0x000a;
    L_0x006d:
        r3 = 1;
        r13.f54354e = r3;
        goto L_0x000a;
    L_0x0071:
        if (r13 == 0) goto L_0x0096;
    L_0x0073:
        r0 = r13.f54357h;
        if (r0 == 0) goto L_0x007a;
    L_0x0077:
        r0 = 0;
        r13.f54357h = r0;
    L_0x007a:
        r0 = r13.f54354e;
        if (r0 == 0) goto L_0x0089;
    L_0x007e:
        r13 = r13.f54352c;
        if (r13 != 0) goto L_0x0089;
    L_0x0082:
        r13 = java.lang.Thread.currentThread();
        r13.interrupt();
    L_0x0089:
        if (r6 != r12) goto L_0x0096;
    L_0x008b:
        r0 = r11.f48851b;
        r0 = r0 >>> r5;
        r6 = (int) r0;
        if (r6 != r12) goto L_0x0096;
    L_0x0091:
        r12 = r11.m59299c(r12);
        return r12;
    L_0x0096:
        r11.m59298b(r12);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.concurrent.Phaser.a(int, java8.util.concurrent.Phaser$QNode):int");
    }
}
