package rx.internal.util.unsafe;

import rx.internal.util.SuppressAnimalSniffer;
import sun.misc.Unsafe;

@SuppressAnimalSniffer
public final class af {
    /* renamed from: a */
    public static final Unsafe f60679a;
    /* renamed from: b */
    private static final boolean f60680b;

    static {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = "rx.unsafe-disable";
        r0 = java.lang.System.getProperty(r0);
        r1 = 1;
        if (r0 == 0) goto L_0x000b;
    L_0x0009:
        r0 = 1;
        goto L_0x000c;
    L_0x000b:
        r0 = 0;
    L_0x000c:
        f60680b = r0;
        r0 = 0;
        r2 = sun.misc.Unsafe.class;	 Catch:{ Throwable -> 0x0021 }
        r3 = "theUnsafe";	 Catch:{ Throwable -> 0x0021 }
        r2 = r2.getDeclaredField(r3);	 Catch:{ Throwable -> 0x0021 }
        r2.setAccessible(r1);	 Catch:{ Throwable -> 0x0021 }
        r1 = r2.get(r0);	 Catch:{ Throwable -> 0x0021 }
        r1 = (sun.misc.Unsafe) r1;	 Catch:{ Throwable -> 0x0021 }
        r0 = r1;
    L_0x0021:
        f60679a = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.internal.util.unsafe.af.<clinit>():void");
    }

    /* renamed from: a */
    public static boolean m69984a() {
        return (f60679a == null || f60680b) ? false : true;
    }

    /* renamed from: a */
    public static long m69983a(Class<?> cls, String str) {
        try {
            return f60679a.objectFieldOffset(cls.getDeclaredField(str));
        } catch (Class<?> cls2) {
            str = new InternalError();
            str.initCause(cls2);
            throw str;
        }
    }
}
