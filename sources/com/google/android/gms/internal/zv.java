package com.google.android.gms.internal;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

public final class zv extends aat {
    /* renamed from: d */
    private final Activity f23535d;
    /* renamed from: e */
    private final View f23536e;

    public zv(ub ubVar, String str, String str2, nx nxVar, int i, int i2, View view, Activity activity) {
        super(ubVar, str, str2, nxVar, i, 62);
        this.f23536e = view;
        this.f23535d = activity;
    }

    /* renamed from: a */
    protected final void mo4165a() throws IllegalAccessException, InvocationTargetException {
        if (this.f23536e != null) {
            long[] jArr = (long[]) this.c.invoke(null, new Object[]{this.f23536e, this.f23535d});
            synchronized (this.b) {
                this.b.f26967Q = Long.valueOf(jArr[0]);
                this.b.f26968R = Long.valueOf(jArr[1]);
            }
        }
    }
}
