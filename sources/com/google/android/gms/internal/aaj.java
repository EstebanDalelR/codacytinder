package com.google.android.gms.internal;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public final class aaj extends aat {
    /* renamed from: d */
    private List<Long> f22865d = null;

    public aaj(ub ubVar, String str, String str2, nx nxVar, int i, int i2) {
        super(ubVar, str, str2, nxVar, i, 31);
    }

    /* renamed from: a */
    protected final void mo4165a() throws IllegalAccessException, InvocationTargetException {
        this.b.f26990p = Long.valueOf(-1);
        this.b.f26991q = Long.valueOf(-1);
        if (this.f22865d == null) {
            this.f22865d = (List) this.c.invoke(null, new Object[]{this.a.m20204a()});
        }
        if (this.f22865d != null && this.f22865d.size() == 2) {
            synchronized (this.b) {
                this.b.f26990p = Long.valueOf(((Long) this.f22865d.get(0)).longValue());
                this.b.f26991q = Long.valueOf(((Long) this.f22865d.get(1)).longValue());
            }
        }
    }
}
