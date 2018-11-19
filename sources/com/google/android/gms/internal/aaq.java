package com.google.android.gms.internal;

import android.util.DisplayMetrics;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

public final class aaq extends aat {
    /* renamed from: d */
    private final View f22870d;

    public aaq(ub ubVar, String str, String str2, nx nxVar, int i, int i2, View view) {
        super(ubVar, str, str2, nxVar, i, 57);
        this.f22870d = view;
    }

    /* renamed from: a */
    protected final void mo4165a() throws IllegalAccessException, InvocationTargetException {
        if (this.f22870d != null) {
            DisplayMetrics displayMetrics = this.a.m20204a().getResources().getDisplayMetrics();
            wl wlVar = new wl((String) this.c.invoke(null, new Object[]{this.f22870d, displayMetrics}));
            nz nzVar = new nz();
            nzVar.f27023a = wlVar.f23499a;
            nzVar.f27024b = wlVar.f23500b;
            nzVar.f27025c = wlVar.f23501c;
            this.b.f26963M = nzVar;
        }
    }
}
