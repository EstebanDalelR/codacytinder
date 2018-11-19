package java8.util;

import sun.misc.Unsafe;

class UnsafeAccess {
    /* renamed from: a */
    static final Unsafe f48790a;

    static {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = sun.misc.Unsafe.class;	 Catch:{ NoSuchFieldException -> 0x000b }
        r1 = "theUnsafe";	 Catch:{ NoSuchFieldException -> 0x000b }
        r0 = r0.getDeclaredField(r1);	 Catch:{ NoSuchFieldException -> 0x000b }
        goto L_0x0013;
    L_0x0009:
        r0 = move-exception;
        goto L_0x0021;
    L_0x000b:
        r0 = sun.misc.Unsafe.class;	 Catch:{ Exception -> 0x0009 }
        r1 = "THE_ONE";	 Catch:{ Exception -> 0x0009 }
        r0 = r0.getDeclaredField(r1);	 Catch:{ Exception -> 0x0009 }
    L_0x0013:
        r1 = 1;	 Catch:{ Exception -> 0x0009 }
        r0.setAccessible(r1);	 Catch:{ Exception -> 0x0009 }
        r1 = 0;	 Catch:{ Exception -> 0x0009 }
        r0 = r0.get(r1);	 Catch:{ Exception -> 0x0009 }
        r0 = (sun.misc.Unsafe) r0;	 Catch:{ Exception -> 0x0009 }
        f48790a = r0;	 Catch:{ Exception -> 0x0009 }
        return;
    L_0x0021:
        r1 = new java.lang.Error;
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.UnsafeAccess.<clinit>():void");
    }

    private UnsafeAccess() {
    }
}
