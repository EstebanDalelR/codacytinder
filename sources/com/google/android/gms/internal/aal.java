package com.google.android.gms.internal;

import java.lang.reflect.InvocationTargetException;

public final class aal extends aat {
    /* renamed from: d */
    private final StackTraceElement[] f22866d;

    public aal(ub ubVar, String str, String str2, nx nxVar, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(ubVar, str, str2, nxVar, i, 45);
        this.f22866d = stackTraceElementArr;
    }

    /* renamed from: a */
    protected final void mo4165a() throws IllegalAccessException, InvocationTargetException {
        if (this.f22866d != null) {
            tz tzVar = new tz((String) this.c.invoke(null, new Object[]{this.f22866d}));
            synchronized (this.b) {
                this.b.f26952B = tzVar.f23471a;
                if (tzVar.f23472b.booleanValue()) {
                    this.b.f26960J = Integer.valueOf(tzVar.f23473c.booleanValue() ^ 1);
                }
            }
        }
    }
}
