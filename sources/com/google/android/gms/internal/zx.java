package com.google.android.gms.internal;

import java.lang.reflect.InvocationTargetException;

public final class zx extends aat {
    /* renamed from: d */
    private static volatile String f23537d;
    /* renamed from: e */
    private static final Object f23538e = new Object();

    public zx(ub ubVar, String str, String str2, nx nxVar, int i, int i2) {
        super(ubVar, str, str2, nxVar, i, 29);
    }

    /* renamed from: a */
    protected final void mo4165a() throws IllegalAccessException, InvocationTargetException {
        this.b.f26989o = "E";
        if (f23537d == null) {
            synchronized (f23538e) {
                if (f23537d == null) {
                    f23537d = (String) this.c.invoke(null, new Object[]{this.a.m20204a()});
                }
            }
        }
        synchronized (this.b) {
            this.b.f26989o = pn.m20136a(f23537d.getBytes(), true);
        }
    }
}
