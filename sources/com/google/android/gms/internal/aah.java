package com.google.android.gms.internal;

import java.lang.reflect.InvocationTargetException;

public final class aah extends aat {
    /* renamed from: d */
    private static volatile String f22863d;
    /* renamed from: e */
    private static final Object f22864e = new Object();

    public aah(ub ubVar, String str, String str2, nx nxVar, int i, int i2) {
        super(ubVar, str, str2, nxVar, i, 1);
    }

    /* renamed from: a */
    protected final void mo4165a() throws IllegalAccessException, InvocationTargetException {
        this.b.f26975a = "E";
        if (f22863d == null) {
            synchronized (f22864e) {
                if (f22863d == null) {
                    f22863d = (String) this.c.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.b) {
            this.b.f26975a = f22863d;
        }
    }
}
