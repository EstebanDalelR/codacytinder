package com.google.android.gms.internal;

import java.lang.reflect.InvocationTargetException;

public final class aam extends aat {
    public aam(ub ubVar, String str, String str2, nx nxVar, int i, int i2) {
        super(ubVar, str, str2, nxVar, i, 51);
    }

    /* renamed from: a */
    protected final void mo4165a() throws IllegalAccessException, InvocationTargetException {
        synchronized (this.b) {
            ua uaVar = new ua((String) this.c.invoke(null, new Object[0]));
            this.b.f26957G = uaVar.f23474a;
            this.b.f26958H = uaVar.f23475b;
        }
    }
}
