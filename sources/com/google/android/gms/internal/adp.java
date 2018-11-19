package com.google.android.gms.internal;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class adp {
    /* renamed from: a */
    private static final Logger f15051a = Logger.getLogger(adp.class.getName());
    /* renamed from: b */
    private static final Unsafe f15052b = m18953d();
    /* renamed from: c */
    private static final Class<?> f15053c = m18938a("libcore.io.Memory");
    /* renamed from: d */
    private static final boolean f15054d = (m18938a("org.robolectric.Robolectric") != null);
    /* renamed from: e */
    private static final boolean f15055e = m18951c(Long.TYPE);
    /* renamed from: f */
    private static final boolean f15056f = m18951c(Integer.TYPE);
    /* renamed from: g */
    private static final C4465d f15057g;
    /* renamed from: h */
    private static final boolean f15058h = m18957f();
    /* renamed from: i */
    private static final boolean f15059i = m18956e();
    /* renamed from: j */
    private static final long f15060j = ((long) m18936a(byte[].class));
    /* renamed from: k */
    private static final long f15061k = ((long) m18936a(boolean[].class));
    /* renamed from: l */
    private static final long f15062l = ((long) m18945b(boolean[].class));
    /* renamed from: m */
    private static final long f15063m = ((long) m18936a(int[].class));
    /* renamed from: n */
    private static final long f15064n = ((long) m18945b(int[].class));
    /* renamed from: o */
    private static final long f15065o = ((long) m18936a(long[].class));
    /* renamed from: p */
    private static final long f15066p = ((long) m18945b(long[].class));
    /* renamed from: q */
    private static final long f15067q = ((long) m18936a(float[].class));
    /* renamed from: r */
    private static final long f15068r = ((long) m18945b(float[].class));
    /* renamed from: s */
    private static final long f15069s = ((long) m18936a(double[].class));
    /* renamed from: t */
    private static final long f15070t = ((long) m18945b(double[].class));
    /* renamed from: u */
    private static final long f15071u = ((long) m18936a(Object[].class));
    /* renamed from: v */
    private static final long f15072v = ((long) m18945b(Object[].class));
    /* renamed from: w */
    private static final long f15073w;
    /* renamed from: x */
    private static final boolean f15074x;

    /* renamed from: com.google.android.gms.internal.adp$d */
    static abstract class C4465d {
        /* renamed from: a */
        Unsafe f15050a;

        C4465d(Unsafe unsafe) {
            this.f15050a = unsafe;
        }

        /* renamed from: a */
        public abstract byte mo4213a(Object obj, long j);

        /* renamed from: a */
        public abstract void mo4214a(Object obj, long j, byte b);

        /* renamed from: b */
        public final int m18934b(Object obj, long j) {
            return this.f15050a.getInt(obj, j);
        }
    }

    /* renamed from: com.google.android.gms.internal.adp$a */
    static final class C6259a extends C4465d {
        C6259a(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final byte mo4213a(Object obj, long j) {
            return adp.f15074x ? adp.m18952d(obj, j) : adp.m18955e(obj, j);
        }

        /* renamed from: a */
        public final void mo4214a(Object obj, long j, byte b) {
            if (adp.f15074x) {
                adp.m18949c(obj, j, b);
            } else {
                adp.m18954d(obj, j, b);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.adp$b */
    static final class C6260b extends C4465d {
        C6260b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final byte mo4213a(Object obj, long j) {
            return adp.f15074x ? adp.m18952d(obj, j) : adp.m18955e(obj, j);
        }

        /* renamed from: a */
        public final void mo4214a(Object obj, long j, byte b) {
            if (adp.f15074x) {
                adp.m18949c(obj, j, b);
            } else {
                adp.m18954d(obj, j, b);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.adp$c */
    static final class C6261c extends C4465d {
        C6261c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final byte mo4213a(Object obj, long j) {
            return this.a.getByte(obj, j);
        }

        /* renamed from: a */
        public final void mo4214a(Object obj, long j, byte b) {
            this.a.putByte(obj, j, b);
        }
    }

    static {
        Field a;
        long objectFieldOffset;
        boolean z = false;
        C4465d c4465d = null;
        if (f15052b != null) {
            if (!m18958g()) {
                c4465d = new C6261c(f15052b);
            } else if (f15055e) {
                c4465d = new C6260b(f15052b);
            } else if (f15056f) {
                c4465d = new C6259a(f15052b);
            }
        }
        f15057g = c4465d;
        if (m18958g()) {
            a = m18939a(Buffer.class, "effectiveDirectAddress");
            if (a != null) {
                if (a != null) {
                    if (f15057g == null) {
                        objectFieldOffset = f15057g.f15050a.objectFieldOffset(a);
                        f15073w = objectFieldOffset;
                        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                            z = true;
                        }
                        f15074x = z;
                    }
                }
                objectFieldOffset = -1;
                f15073w = objectFieldOffset;
                if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                    z = true;
                }
                f15074x = z;
            }
        }
        a = m18939a(Buffer.class, "address");
        if (a != null) {
            if (f15057g == null) {
                objectFieldOffset = f15057g.f15050a.objectFieldOffset(a);
                f15073w = objectFieldOffset;
                if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                    z = true;
                }
                f15074x = z;
            }
        }
        objectFieldOffset = -1;
        f15073w = objectFieldOffset;
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z = true;
        }
        f15074x = z;
    }

    private adp() {
    }

    /* renamed from: a */
    static byte m18935a(byte[] bArr, long j) {
        return f15057g.mo4213a(bArr, f15060j + j);
    }

    /* renamed from: a */
    private static int m18936a(Class<?> cls) {
        return f15059i ? f15057g.f15050a.arrayBaseOffset(cls) : -1;
    }

    /* renamed from: a */
    static int m18937a(Object obj, long j) {
        return f15057g.m18934b(obj, j);
    }

    /* renamed from: a */
    private static <T> java.lang.Class<T> m18938a(java.lang.String r0) {
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
        r0 = java.lang.Class.forName(r0);	 Catch:{ Throwable -> 0x0005 }
        return r0;
    L_0x0005:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.adp.a(java.lang.String):java.lang.Class<T>");
    }

    /* renamed from: a */
    private static java.lang.reflect.Field m18939a(java.lang.Class<?> r0, java.lang.String r1) {
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
        r0 = r0.getDeclaredField(r1);	 Catch:{ Throwable -> 0x0009 }
        r1 = 1;	 Catch:{ Throwable -> 0x0009 }
        r0.setAccessible(r1);	 Catch:{ Throwable -> 0x0009 }
        return r0;
    L_0x0009:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.adp.a(java.lang.Class, java.lang.String):java.lang.reflect.Field");
    }

    /* renamed from: a */
    private static void m18941a(Object obj, long j, int i) {
        f15057g.f15050a.putInt(obj, j, i);
    }

    /* renamed from: a */
    static void m18942a(byte[] bArr, long j, byte b) {
        f15057g.mo4214a(bArr, f15060j + j, b);
    }

    /* renamed from: a */
    static boolean m18943a() {
        return f15059i;
    }

    /* renamed from: b */
    private static int m18945b(Class<?> cls) {
        return f15059i ? f15057g.f15050a.arrayIndexScale(cls) : -1;
    }

    /* renamed from: b */
    static boolean m18947b() {
        return f15058h;
    }

    /* renamed from: c */
    private static void m18949c(Object obj, long j, byte b) {
        long j2 = j & -4;
        int i = ((((int) j) ^ -1) & 3) << 3;
        m18941a(obj, j2, ((255 & b) << i) | (m18937a(obj, j2) & ((255 << i) ^ -1)));
    }

    /* renamed from: c */
    private static boolean m18951c(java.lang.Class<?> r9) {
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
        r0 = m18958g();
        r1 = 0;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = f15053c;	 Catch:{ Throwable -> 0x008b }
        r2 = "peekLong";	 Catch:{ Throwable -> 0x008b }
        r3 = 2;	 Catch:{ Throwable -> 0x008b }
        r4 = new java.lang.Class[r3];	 Catch:{ Throwable -> 0x008b }
        r4[r1] = r9;	 Catch:{ Throwable -> 0x008b }
        r5 = java.lang.Boolean.TYPE;	 Catch:{ Throwable -> 0x008b }
        r6 = 1;	 Catch:{ Throwable -> 0x008b }
        r4[r6] = r5;	 Catch:{ Throwable -> 0x008b }
        r0.getMethod(r2, r4);	 Catch:{ Throwable -> 0x008b }
        r2 = "pokeLong";	 Catch:{ Throwable -> 0x008b }
        r4 = 3;	 Catch:{ Throwable -> 0x008b }
        r5 = new java.lang.Class[r4];	 Catch:{ Throwable -> 0x008b }
        r5[r1] = r9;	 Catch:{ Throwable -> 0x008b }
        r7 = java.lang.Long.TYPE;	 Catch:{ Throwable -> 0x008b }
        r5[r6] = r7;	 Catch:{ Throwable -> 0x008b }
        r7 = java.lang.Boolean.TYPE;	 Catch:{ Throwable -> 0x008b }
        r5[r3] = r7;	 Catch:{ Throwable -> 0x008b }
        r0.getMethod(r2, r5);	 Catch:{ Throwable -> 0x008b }
        r2 = "pokeInt";	 Catch:{ Throwable -> 0x008b }
        r5 = new java.lang.Class[r4];	 Catch:{ Throwable -> 0x008b }
        r5[r1] = r9;	 Catch:{ Throwable -> 0x008b }
        r7 = java.lang.Integer.TYPE;	 Catch:{ Throwable -> 0x008b }
        r5[r6] = r7;	 Catch:{ Throwable -> 0x008b }
        r7 = java.lang.Boolean.TYPE;	 Catch:{ Throwable -> 0x008b }
        r5[r3] = r7;	 Catch:{ Throwable -> 0x008b }
        r0.getMethod(r2, r5);	 Catch:{ Throwable -> 0x008b }
        r2 = "peekInt";	 Catch:{ Throwable -> 0x008b }
        r5 = new java.lang.Class[r3];	 Catch:{ Throwable -> 0x008b }
        r5[r1] = r9;	 Catch:{ Throwable -> 0x008b }
        r7 = java.lang.Boolean.TYPE;	 Catch:{ Throwable -> 0x008b }
        r5[r6] = r7;	 Catch:{ Throwable -> 0x008b }
        r0.getMethod(r2, r5);	 Catch:{ Throwable -> 0x008b }
        r2 = "pokeByte";	 Catch:{ Throwable -> 0x008b }
        r5 = new java.lang.Class[r3];	 Catch:{ Throwable -> 0x008b }
        r5[r1] = r9;	 Catch:{ Throwable -> 0x008b }
        r7 = java.lang.Byte.TYPE;	 Catch:{ Throwable -> 0x008b }
        r5[r6] = r7;	 Catch:{ Throwable -> 0x008b }
        r0.getMethod(r2, r5);	 Catch:{ Throwable -> 0x008b }
        r2 = "peekByte";	 Catch:{ Throwable -> 0x008b }
        r5 = new java.lang.Class[r6];	 Catch:{ Throwable -> 0x008b }
        r5[r1] = r9;	 Catch:{ Throwable -> 0x008b }
        r0.getMethod(r2, r5);	 Catch:{ Throwable -> 0x008b }
        r2 = "pokeByteArray";	 Catch:{ Throwable -> 0x008b }
        r5 = 4;	 Catch:{ Throwable -> 0x008b }
        r7 = new java.lang.Class[r5];	 Catch:{ Throwable -> 0x008b }
        r7[r1] = r9;	 Catch:{ Throwable -> 0x008b }
        r8 = byte[].class;	 Catch:{ Throwable -> 0x008b }
        r7[r6] = r8;	 Catch:{ Throwable -> 0x008b }
        r8 = java.lang.Integer.TYPE;	 Catch:{ Throwable -> 0x008b }
        r7[r3] = r8;	 Catch:{ Throwable -> 0x008b }
        r8 = java.lang.Integer.TYPE;	 Catch:{ Throwable -> 0x008b }
        r7[r4] = r8;	 Catch:{ Throwable -> 0x008b }
        r0.getMethod(r2, r7);	 Catch:{ Throwable -> 0x008b }
        r2 = "peekByteArray";	 Catch:{ Throwable -> 0x008b }
        r5 = new java.lang.Class[r5];	 Catch:{ Throwable -> 0x008b }
        r5[r1] = r9;	 Catch:{ Throwable -> 0x008b }
        r9 = byte[].class;	 Catch:{ Throwable -> 0x008b }
        r5[r6] = r9;	 Catch:{ Throwable -> 0x008b }
        r9 = java.lang.Integer.TYPE;	 Catch:{ Throwable -> 0x008b }
        r5[r3] = r9;	 Catch:{ Throwable -> 0x008b }
        r9 = java.lang.Integer.TYPE;	 Catch:{ Throwable -> 0x008b }
        r5[r4] = r9;	 Catch:{ Throwable -> 0x008b }
        r0.getMethod(r2, r5);	 Catch:{ Throwable -> 0x008b }
        return r6;
    L_0x008b:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.adp.c(java.lang.Class):boolean");
    }

    /* renamed from: d */
    private static byte m18952d(Object obj, long j) {
        return (byte) (m18937a(obj, j & -4) >>> ((int) (((j ^ -1) & 3) << 3)));
    }

    /* renamed from: d */
    private static sun.misc.Unsafe m18953d() {
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
        r0 = new com.google.android.gms.internal.adq;	 Catch:{ Throwable -> 0x000c }
        r0.<init>();	 Catch:{ Throwable -> 0x000c }
        r0 = java.security.AccessController.doPrivileged(r0);	 Catch:{ Throwable -> 0x000c }
        r0 = (sun.misc.Unsafe) r0;	 Catch:{ Throwable -> 0x000c }
        return r0;
    L_0x000c:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.adp.d():sun.misc.Unsafe");
    }

    /* renamed from: d */
    private static void m18954d(Object obj, long j, byte b) {
        long j2 = j & -4;
        int i = (((int) j) & 3) << 3;
        m18941a(obj, j2, ((255 & b) << i) | (m18937a(obj, j2) & ((255 << i) ^ -1)));
    }

    /* renamed from: e */
    private static byte m18955e(Object obj, long j) {
        return (byte) (m18937a(obj, j & -4) >>> ((int) ((j & 3) << 3)));
    }

    /* renamed from: e */
    private static boolean m18956e() {
        if (f15052b == null) {
            return false;
        }
        try {
            Class cls = f15052b.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls.getMethod("getInt", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putInt", new Class[]{Object.class, Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putLong", new Class[]{Object.class, Long.TYPE, Long.TYPE});
            cls.getMethod("getObject", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putObject", new Class[]{Object.class, Long.TYPE, Object.class});
            if (m18958g()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putByte", new Class[]{Object.class, Long.TYPE, Byte.TYPE});
            cls.getMethod("getBoolean", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE});
            cls.getMethod("getFloat", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putFloat", new Class[]{Object.class, Long.TYPE, Float.TYPE});
            cls.getMethod("getDouble", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putDouble", new Class[]{Object.class, Long.TYPE, Double.TYPE});
            return true;
        } catch (Throwable th) {
            String valueOf = String.valueOf(th);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 71);
            stringBuilder.append("platform method missing - proto runtime falling back to safer methods: ");
            stringBuilder.append(valueOf);
            f15051a.logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", stringBuilder.toString());
            return false;
        }
    }

    /* renamed from: f */
    private static boolean m18957f() {
        if (f15052b == null) {
            return false;
        }
        try {
            Class cls = f15052b.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            if (m18958g()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Long.TYPE});
            cls.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls.getMethod("getInt", new Class[]{Long.TYPE});
            cls.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Long.TYPE});
            cls.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            String valueOf = String.valueOf(th);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 71);
            stringBuilder.append("platform method missing - proto runtime falling back to safer methods: ");
            stringBuilder.append(valueOf);
            f15051a.logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", stringBuilder.toString());
            return false;
        }
    }

    /* renamed from: g */
    private static boolean m18958g() {
        return (f15053c == null || f15054d) ? false : true;
    }
}
