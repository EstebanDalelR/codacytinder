package com.google.android.gms.internal;

import java.util.HashMap;

public final class tz extends pm<Integer, Object> {
    /* renamed from: a */
    public Long f23471a;
    /* renamed from: b */
    public Boolean f23472b;
    /* renamed from: c */
    public Boolean f23473c;

    public tz(String str) {
        mo4658a(str);
    }

    /* renamed from: a */
    protected final HashMap<Integer, Object> mo4657a() {
        HashMap<Integer, Object> hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.f23471a);
        hashMap.put(Integer.valueOf(1), this.f23472b);
        hashMap.put(Integer.valueOf(2), this.f23473c);
        return hashMap;
    }

    /* renamed from: a */
    protected final void mo4658a(String str) {
        HashMap b = pm.m20133b(str);
        if (b != null) {
            this.f23471a = (Long) b.get(Integer.valueOf(0));
            this.f23472b = (Boolean) b.get(Integer.valueOf(1));
            this.f23473c = (Boolean) b.get(Integer.valueOf(2));
        }
    }
}
