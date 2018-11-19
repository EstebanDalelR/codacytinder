package com.google.android.gms.internal;

import java.lang.reflect.InvocationTargetException;

public final class aap extends aat {
    public aap(ub ubVar, String str, String str2, nx nxVar, int i, int i2) {
        super(ubVar, str, str2, nxVar, i, 48);
    }

    /* renamed from: a */
    protected final void mo4165a() throws IllegalAccessException, InvocationTargetException {
        this.b.f26955E = Integer.valueOf(2);
        boolean booleanValue = ((Boolean) this.c.invoke(null, new Object[]{this.a.m20204a()})).booleanValue();
        synchronized (this.b) {
            nx nxVar;
            Integer valueOf;
            if (booleanValue) {
                nxVar = this.b;
                valueOf = Integer.valueOf(1);
            } else {
                nxVar = this.b;
                valueOf = Integer.valueOf(0);
            }
            nxVar.f26955E = valueOf;
        }
    }
}
