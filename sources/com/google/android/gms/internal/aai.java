package com.google.android.gms.internal;

import java.lang.reflect.InvocationTargetException;

public final class aai extends aat {
    public aai(ub ubVar, String str, String str2, nx nxVar, int i, int i2) {
        super(ubVar, str, str2, nxVar, i, 3);
    }

    /* renamed from: a */
    protected final void mo4165a() throws IllegalAccessException, InvocationTargetException {
        synchronized (this.b) {
            tp tpVar = new tp((String) this.c.invoke(null, new Object[]{this.a.m20204a()}));
            synchronized (this.b) {
                this.b.f26977c = Long.valueOf(tpVar.f23460a);
                this.b.f26965O = Long.valueOf(tpVar.f23461b);
            }
        }
    }
}
