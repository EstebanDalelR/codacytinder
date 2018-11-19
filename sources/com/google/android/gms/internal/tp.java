package com.google.android.gms.internal;

import java.util.HashMap;

public final class tp extends pm<Integer, Long> {
    /* renamed from: a */
    public long f23460a;
    /* renamed from: b */
    public long f23461b;

    public tp() {
        this.f23460a = -1;
        this.f23461b = -1;
    }

    public tp(String str) {
        this();
        mo4658a(str);
    }

    /* renamed from: a */
    protected final HashMap<Integer, Long> mo4657a() {
        HashMap<Integer, Long> hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), Long.valueOf(this.f23460a));
        hashMap.put(Integer.valueOf(1), Long.valueOf(this.f23461b));
        return hashMap;
    }

    /* renamed from: a */
    protected final void mo4658a(String str) {
        HashMap b = pm.m20133b(str);
        if (b != null) {
            this.f23460a = ((Long) b.get(Integer.valueOf(0))).longValue();
            this.f23461b = ((Long) b.get(Integer.valueOf(1))).longValue();
        }
    }
}
