package com.google.android.gms.internal;

import java.lang.reflect.InvocationTargetException;

public final class aaa extends aat {
    public aaa(ub ubVar, String str, String str2, nx nxVar, int i, int i2) {
        super(ubVar, str, str2, nxVar, i, 5);
    }

    /* renamed from: a */
    protected final void mo4165a() throws IllegalAccessException, InvocationTargetException {
        this.b.f26978d = Long.valueOf(-1);
        this.b.f26979e = Long.valueOf(-1);
        int[] iArr = (int[]) this.c.invoke(null, new Object[]{this.a.m20204a()});
        synchronized (this.b) {
            this.b.f26978d = Long.valueOf((long) iArr[0]);
            this.b.f26979e = Long.valueOf((long) iArr[1]);
            if (((Boolean) aja.m19221f().m19334a(alo.bq)).booleanValue() && iArr[2] != Integer.MIN_VALUE) {
                this.b.f26964N = Long.valueOf((long) iArr[2]);
            }
        }
    }
}
