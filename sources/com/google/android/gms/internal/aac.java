package com.google.android.gms.internal;

import java.lang.reflect.InvocationTargetException;

public final class aac extends aat {
    /* renamed from: d */
    private long f22859d;

    public aac(ub ubVar, String str, String str2, nx nxVar, long j, int i, int i2) {
        super(ubVar, str, str2, nxVar, i, 25);
        this.f22859d = j;
    }

    /* renamed from: a */
    protected final void mo4165a() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.c.invoke(null, new Object[0])).longValue();
        synchronized (this.b) {
            this.b.f26972V = Long.valueOf(longValue);
            if (this.f22859d != 0) {
                this.b.f26984j = Long.valueOf(longValue - this.f22859d);
                this.b.f26987m = Long.valueOf(this.f22859d);
            }
        }
    }
}
