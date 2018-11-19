package com.google.android.gms.internal;

import java.util.HashMap;

public final class wl extends pm<Integer, Long> {
    /* renamed from: a */
    public Long f23499a;
    /* renamed from: b */
    public Long f23500b;
    /* renamed from: c */
    public Long f23501c;

    public wl(String str) {
        mo4658a(str);
    }

    /* renamed from: a */
    protected final HashMap<Integer, Long> mo4657a() {
        HashMap<Integer, Long> hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.f23499a);
        hashMap.put(Integer.valueOf(1), this.f23500b);
        hashMap.put(Integer.valueOf(2), this.f23501c);
        return hashMap;
    }

    /* renamed from: a */
    protected final void mo4658a(String str) {
        HashMap b = pm.m20133b(str);
        if (b != null) {
            this.f23499a = (Long) b.get(Integer.valueOf(0));
            this.f23500b = (Long) b.get(Integer.valueOf(1));
            this.f23501c = (Long) b.get(Integer.valueOf(2));
        }
    }
}
