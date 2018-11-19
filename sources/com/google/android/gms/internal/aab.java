package com.google.android.gms.internal;

import java.lang.reflect.InvocationTargetException;

public final class aab extends aat {
    /* renamed from: d */
    private static volatile Long f22857d;
    /* renamed from: e */
    private static final Object f22858e = new Object();

    public aab(ub ubVar, String str, String str2, nx nxVar, int i, int i2) {
        super(ubVar, str, str2, nxVar, i, 44);
    }

    /* renamed from: a */
    protected final void mo4165a() throws IllegalAccessException, InvocationTargetException {
        if (f22857d == null) {
            synchronized (f22858e) {
                if (f22857d == null) {
                    f22857d = (Long) this.c.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.b) {
            this.b.f26951A = f22857d;
        }
    }
}
