package com.google.android.m4b.maps.p126z;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import sun.misc.Unsafe;

/* renamed from: com.google.android.m4b.maps.z.n */
abstract class C5609n extends Number {
    /* renamed from: a */
    static final C5608c f20700a = new C5608c();
    /* renamed from: b */
    static final int f20701b = Runtime.getRuntime().availableProcessors();
    /* renamed from: f */
    private static final Unsafe f20702f;
    /* renamed from: g */
    private static final long f20703g;
    /* renamed from: h */
    private static final long f20704h;
    /* renamed from: c */
    volatile transient C5606a[] f20705c;
    /* renamed from: d */
    volatile transient long f20706d;
    /* renamed from: e */
    volatile transient int f20707e;

    /* renamed from: com.google.android.m4b.maps.z.n$1 */
    static class C56051 implements PrivilegedExceptionAction<Unsafe> {
        C56051() {
        }

        public final /* synthetic */ Object run() {
            Class cls = Unsafe.class;
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (cls.isInstance(obj)) {
                    return (Unsafe) cls.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.n$a */
    static final class C5606a {
        /* renamed from: b */
        private static final Unsafe f20695b;
        /* renamed from: c */
        private static final long f20696c;
        /* renamed from: a */
        volatile long f20697a;

        C5606a(long j) {
            this.f20697a = j;
        }

        /* renamed from: a */
        final boolean m24443a(long j, long j2) {
            return f20695b.compareAndSwapLong(this, f20696c, j, j2);
        }

        static {
            try {
                f20695b = C5609n.mo5859a();
                f20696c = f20695b.objectFieldOffset(C5606a.class.getDeclaredField("value"));
            } catch (Throwable e) {
                throw new Error(e);
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.n$b */
    static final class C5607b {
        /* renamed from: b */
        private static Random f20698b = new Random();
        /* renamed from: a */
        int f20699a;

        C5607b() {
            int nextInt = f20698b.nextInt();
            if (nextInt == 0) {
                nextInt = 1;
            }
            this.f20699a = nextInt;
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.n$c */
    static final class C5608c extends ThreadLocal<C5607b> {
        C5608c() {
        }

        public final /* synthetic */ Object initialValue() {
            return new C5607b();
        }
    }

    /* renamed from: a */
    abstract long mo5861a(long j, long j2);

    static {
        try {
            f20702f = C5609n.mo5859a();
            Class cls = C5609n.class;
            f20703g = f20702f.objectFieldOffset(cls.getDeclaredField("base"));
            f20704h = f20702f.objectFieldOffset(cls.getDeclaredField("busy"));
        } catch (Throwable e) {
            throw new Error(e);
        }
    }

    C5609n() {
    }

    /* renamed from: b */
    final boolean m24448b(long j, long j2) {
        return f20702f.compareAndSwapLong(this, f20703g, j, j2);
    }

    /* renamed from: b */
    final boolean m24447b() {
        return f20702f.compareAndSwapInt(this, f20704h, 0, 1);
    }

    /* renamed from: a */
    private static sun.misc.Unsafe mo5859a() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = sun.misc.Unsafe.getUnsafe();	 Catch:{ SecurityException -> 0x0005 }
        return r0;
    L_0x0005:
        r0 = new com.google.android.m4b.maps.z.n$1;	 Catch:{ PrivilegedActionException -> 0x0011 }
        r0.<init>();	 Catch:{ PrivilegedActionException -> 0x0011 }
        r0 = java.security.AccessController.doPrivileged(r0);	 Catch:{ PrivilegedActionException -> 0x0011 }
        r0 = (sun.misc.Unsafe) r0;	 Catch:{ PrivilegedActionException -> 0x0011 }
        return r0;
    L_0x0011:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r2 = "Could not initialize intrinsics";
        r0 = r0.getCause();
        r1.<init>(r2, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.z.n.a():sun.misc.Unsafe");
    }
}
