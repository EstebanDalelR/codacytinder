package com.google.android.gms.internal;

import java.lang.reflect.InvocationTargetException;

public final class aak extends aat {
    public aak(ub ubVar, String str, String str2, nx nxVar, int i, int i2) {
        super(ubVar, str, str2, nxVar, i, 61);
    }

    /* renamed from: a */
    protected final void mo4165a() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.c.invoke(null, new Object[]{this.a.m20204a(), Boolean.valueOf(this.a.m20217j())})).longValue();
        synchronized (this.b) {
            this.b.f26966P = Long.valueOf(longValue);
        }
    }
}
