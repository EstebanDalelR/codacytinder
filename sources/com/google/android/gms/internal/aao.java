package com.google.android.gms.internal;

import java.lang.reflect.InvocationTargetException;

public final class aao extends aat {
    /* renamed from: d */
    private static volatile Long f22868d;
    /* renamed from: e */
    private static final Object f22869e = new Object();

    public aao(ub ubVar, String str, String str2, nx nxVar, int i, int i2) {
        super(ubVar, str, str2, nxVar, i, 33);
    }

    /* renamed from: a */
    protected final void mo4165a() throws IllegalAccessException, InvocationTargetException {
        if (f22868d == null) {
            synchronized (f22869e) {
                if (f22868d == null) {
                    f22868d = (Long) this.c.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.b) {
            this.b.f26992r = f22868d;
        }
    }
}
