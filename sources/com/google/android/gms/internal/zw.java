package com.google.android.gms.internal;

import android.provider.Settings.SettingNotFoundException;
import java.lang.reflect.InvocationTargetException;

public final class zw extends aat {
    public zw(ub ubVar, String str, String str2, nx nxVar, int i, int i2) {
        super(ubVar, str, str2, nxVar, i, 49);
    }

    /* renamed from: a */
    protected final void mo4165a() throws IllegalAccessException, InvocationTargetException {
        this.b.f26956F = Integer.valueOf(2);
        try {
            boolean booleanValue = ((Boolean) this.c.invoke(null, new Object[]{this.a.m20204a()})).booleanValue();
            this.b.f26956F = Integer.valueOf(booleanValue);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
