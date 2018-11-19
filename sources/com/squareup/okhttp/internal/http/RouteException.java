package com.squareup.okhttp.internal.http;

import java.io.IOException;
import java.lang.reflect.Method;

public final class RouteException extends Exception {
    /* renamed from: a */
    private static final Method f22138a;
    /* renamed from: b */
    private IOException f22139b;

    static {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = java.lang.Throwable.class;	 Catch:{ Exception -> 0x0011 }
        r1 = "addSuppressed";	 Catch:{ Exception -> 0x0011 }
        r2 = 1;	 Catch:{ Exception -> 0x0011 }
        r2 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x0011 }
        r3 = 0;	 Catch:{ Exception -> 0x0011 }
        r4 = java.lang.Throwable.class;	 Catch:{ Exception -> 0x0011 }
        r2[r3] = r4;	 Catch:{ Exception -> 0x0011 }
        r0 = r0.getDeclaredMethod(r1, r2);	 Catch:{ Exception -> 0x0011 }
        goto L_0x0012;
    L_0x0011:
        r0 = 0;
    L_0x0012:
        f22138a = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.http.RouteException.<clinit>():void");
    }

    public RouteException(IOException iOException) {
        super(iOException);
        this.f22139b = iOException;
    }

    /* renamed from: a */
    public IOException m26124a() {
        return this.f22139b;
    }

    /* renamed from: a */
    public void m26125a(IOException iOException) {
        m26123a(iOException, this.f22139b);
        this.f22139b = iOException;
    }

    /* renamed from: a */
    private void m26123a(java.io.IOException r4, java.io.IOException r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = f22138a;
        if (r0 == 0) goto L_0x000f;
    L_0x0004:
        r0 = f22138a;	 Catch:{ InvocationTargetException -> 0x000f, InvocationTargetException -> 0x000f }
        r1 = 1;	 Catch:{ InvocationTargetException -> 0x000f, InvocationTargetException -> 0x000f }
        r1 = new java.lang.Object[r1];	 Catch:{ InvocationTargetException -> 0x000f, InvocationTargetException -> 0x000f }
        r2 = 0;	 Catch:{ InvocationTargetException -> 0x000f, InvocationTargetException -> 0x000f }
        r1[r2] = r5;	 Catch:{ InvocationTargetException -> 0x000f, InvocationTargetException -> 0x000f }
        r0.invoke(r4, r1);	 Catch:{ InvocationTargetException -> 0x000f, InvocationTargetException -> 0x000f }
    L_0x000f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.http.RouteException.a(java.io.IOException, java.io.IOException):void");
    }
}
