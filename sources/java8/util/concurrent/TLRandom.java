package java8.util.concurrent;

import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.SecureRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import sun.misc.Unsafe;

final class TLRandom {
    /* renamed from: a */
    private static final Unsafe f48859a = UnsafeAccess.f48872a;
    /* renamed from: b */
    private static final long f48860b;
    /* renamed from: c */
    private static final boolean f48861c;
    /* renamed from: d */
    private static final long f48862d;
    /* renamed from: e */
    private static final long f48863e;
    /* renamed from: f */
    private static final long f48864f;
    /* renamed from: g */
    private static final long f48865g;
    /* renamed from: h */
    private static final ThreadLocal<SeedsHolder> f48866h = new C157711();
    /* renamed from: i */
    private static final AtomicInteger f48867i = new AtomicInteger();
    /* renamed from: j */
    private static final AtomicLong f48868j = new AtomicLong(m59307a(System.currentTimeMillis()) ^ m59307a(System.nanoTime()));

    /* renamed from: java8.util.concurrent.TLRandom$1 */
    static class C157711 extends ThreadLocal<SeedsHolder> {
        C157711() {
        }

        protected /* synthetic */ Object initialValue() {
            return m59304a();
        }

        /* renamed from: a */
        protected SeedsHolder m59304a() {
            return new SeedsHolder();
        }
    }

    /* renamed from: java8.util.concurrent.TLRandom$2 */
    static class C157722 implements PrivilegedAction<Boolean> {
        C157722() {
        }

        public /* synthetic */ Object run() {
            return m59305a();
        }

        /* renamed from: a */
        public Boolean m59305a() {
            return Boolean.valueOf(Boolean.getBoolean("java.util.secureRandomSeed"));
        }
    }

    private static final class SeedsHolder {
        /* renamed from: a */
        long f48856a;
        /* renamed from: b */
        int f48857b;
        /* renamed from: c */
        int f48858c;

        private SeedsHolder() {
        }
    }

    /* renamed from: a */
    static long m59307a(long j) {
        long j2 = (j ^ (j >>> 33)) * -49064778989728563L;
        long j3 = (j2 ^ (j2 >>> 33)) * -4265267296055464877L;
        return j3 ^ (j3 >>> 33);
    }

    /* renamed from: b */
    static int m59313b(long j) {
        long j2 = (j ^ (j >>> 33)) * -49064778989728563L;
        return (int) (((j2 ^ (j2 >>> 33)) * -4265267296055464877L) >>> 32);
    }

    private TLRandom() {
    }

    /* renamed from: a */
    static final void m59308a() {
        int addAndGet = f48867i.addAndGet(-1640531527);
        if (addAndGet == 0) {
            addAndGet = 1;
        }
        m59318c(m59307a(f48868j.getAndAdd(-4942790177534073029L)));
        m59315b(addAndGet);
    }

    /* renamed from: b */
    static final long m59314b() {
        long e = m59320e() - 7046029254386353131L;
        m59318c(e);
        return e;
    }

    /* renamed from: c */
    static final int m59316c() {
        return m59321f();
    }

    /* renamed from: a */
    static final int m59306a(int i) {
        i ^= i << 13;
        i ^= i >>> 17;
        i ^= i << 5;
        m59315b(i);
        return i;
    }

    /* renamed from: d */
    static final int m59319d() {
        int g = m59322g();
        if (g != 0) {
            g ^= g << 13;
            g ^= g >>> 17;
            g ^= g << 5;
        } else {
            g = m59313b(f48868j.getAndAdd(-4942790177534073029L));
            if (g == 0) {
                g = 1;
            }
        }
        m59317c(g);
        return g;
    }

    /* renamed from: e */
    static long m59320e() {
        return ((SeedsHolder) f48866h.get()).f48856a;
    }

    /* renamed from: c */
    private static void m59318c(long j) {
        ((SeedsHolder) f48866h.get()).f48856a = j;
    }

    /* renamed from: f */
    static int m59321f() {
        return ((SeedsHolder) f48866h.get()).f48857b;
    }

    /* renamed from: b */
    private static void m59315b(int i) {
        ((SeedsHolder) f48866h.get()).f48857b = i;
    }

    /* renamed from: g */
    private static int m59322g() {
        return ((SeedsHolder) f48866h.get()).f48858c;
    }

    /* renamed from: c */
    private static void m59317c(int i) {
        ((SeedsHolder) f48866h.get()).f48858c = i;
    }

    /* renamed from: a */
    static final void m59309a(Thread thread) {
        if (!f48861c) {
            f48859a.putObject(thread, f48862d, null);
            f48859a.putObject(thread, f48863e, null);
        }
    }

    /* renamed from: a */
    static final void m59311a(Thread thread, AccessControlContext accessControlContext) {
        if (!f48861c) {
            f48859a.putOrderedObject(thread, f48864f, accessControlContext);
        }
    }

    /* renamed from: a */
    static final void m59310a(Thread thread, ClassLoader classLoader) {
        f48859a.putObject(thread, f48865g, classLoader);
    }

    /* renamed from: h */
    private static boolean m59323h() {
        if (m59312a("android.util.DisplayMetrics")) {
            return true;
        }
        return m59312a("org.robovm.rt.bro.Bro");
    }

    /* renamed from: a */
    private static boolean m59312a(java.lang.String r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 0;
        r1 = java8.util.concurrent.TLRandom.class;	 Catch:{ Throwable -> 0x000c }
        r1 = r1.getClassLoader();	 Catch:{ Throwable -> 0x000c }
        r2 = java.lang.Class.forName(r2, r0, r1);	 Catch:{ Throwable -> 0x000c }
        goto L_0x000d;
    L_0x000c:
        r2 = 0;
    L_0x000d:
        if (r2 == 0) goto L_0x0010;
    L_0x000f:
        r0 = 1;
    L_0x0010:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.concurrent.TLRandom.a(java.lang.String):boolean");
    }

    static {
        try {
            f48861c = m59323h();
            if (f48861c) {
                f48862d = 0;
                f48863e = 0;
                f48864f = 0;
            } else {
                f48862d = f48859a.objectFieldOffset(Thread.class.getDeclaredField("threadLocals"));
                f48863e = f48859a.objectFieldOffset(Thread.class.getDeclaredField("inheritableThreadLocals"));
                f48864f = f48859a.objectFieldOffset(Thread.class.getDeclaredField("inheritedAccessControlContext"));
            }
            f48860b = f48859a.objectFieldOffset(Integer.class.getDeclaredField("value"));
            f48865g = f48859a.objectFieldOffset(Thread.class.getDeclaredField("contextClassLoader"));
            if (((Boolean) AccessController.doPrivileged(new C157722())).booleanValue()) {
                byte[] seed = SecureRandom.getSeed(8);
                long j = ((long) seed[0]) & 255;
                int i = 1;
                while (i < 8) {
                    i++;
                    j = (j << 8) | (((long) seed[i]) & 255);
                }
                f48868j.set(j);
            }
        } catch (Throwable e) {
            throw new Error(e);
        }
    }
}
