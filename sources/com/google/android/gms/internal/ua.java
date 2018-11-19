package com.google.android.gms.internal;

import java.util.HashMap;

public final class ua extends pm<Integer, Long> {
    /* renamed from: a */
    public Long f23474a;
    /* renamed from: b */
    public Long f23475b;

    public ua(String str) {
        mo4658a(str);
    }

    /* renamed from: a */
    protected final HashMap<Integer, Long> mo4657a() {
        HashMap<Integer, Long> hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.f23474a);
        hashMap.put(Integer.valueOf(1), this.f23475b);
        return hashMap;
    }

    /* renamed from: a */
    protected final void mo4658a(String str) {
        HashMap b = pm.m20133b(str);
        if (b != null) {
            this.f23474a = (Long) b.get(Integer.valueOf(0));
            this.f23475b = (Long) b.get(Integer.valueOf(1));
        }
    }
}
