package com.google.android.gms.internal;

import java.lang.reflect.InvocationTargetException;

public final class aaf extends aat {
    /* renamed from: d */
    private static volatile Long f22860d;
    /* renamed from: e */
    private static final Object f22861e = new Object();

    public aaf(ub ubVar, String str, String str2, nx nxVar, int i, int i2) {
        super(ubVar, str, str2, nxVar, i, 22);
    }

    /* renamed from: a */
    protected final void mo4165a() throws IllegalAccessException, InvocationTargetException {
        if (f22860d == null) {
            synchronized (f22861e) {
                if (f22860d == null) {
                    f22860d = (Long) this.c.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.b) {
            this.b.f26986l = f22860d;
        }
    }
}
