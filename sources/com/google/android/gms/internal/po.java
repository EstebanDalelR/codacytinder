package com.google.android.gms.internal;

import java.util.HashMap;

public final class po extends pm<Integer, Object> {
    /* renamed from: a */
    public String f23414a;
    /* renamed from: b */
    public long f23415b;
    /* renamed from: c */
    public String f23416c;
    /* renamed from: d */
    public String f23417d;
    /* renamed from: e */
    public String f23418e;

    public po() {
        this.f23414a = "E";
        this.f23415b = -1;
        this.f23416c = "E";
        this.f23417d = "E";
        this.f23418e = "E";
    }

    public po(String str) {
        this();
        mo4658a(str);
    }

    /* renamed from: a */
    protected final HashMap<Integer, Object> mo4657a() {
        HashMap<Integer, Object> hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.f23414a);
        hashMap.put(Integer.valueOf(4), this.f23418e);
        hashMap.put(Integer.valueOf(3), this.f23417d);
        hashMap.put(Integer.valueOf(2), this.f23416c);
        hashMap.put(Integer.valueOf(1), Long.valueOf(this.f23415b));
        return hashMap;
    }

    /* renamed from: a */
    protected final void mo4658a(String str) {
        HashMap b = pm.m20133b(str);
        if (b != null) {
            this.f23414a = b.get(Integer.valueOf(0)) == null ? "E" : (String) b.get(Integer.valueOf(0));
            this.f23415b = b.get(Integer.valueOf(1)) == null ? -1 : ((Long) b.get(Integer.valueOf(1))).longValue();
            this.f23416c = b.get(Integer.valueOf(2)) == null ? "E" : (String) b.get(Integer.valueOf(2));
            this.f23417d = b.get(Integer.valueOf(3)) == null ? "E" : (String) b.get(Integer.valueOf(3));
            this.f23418e = b.get(Integer.valueOf(4)) == null ? "E" : (String) b.get(Integer.valueOf(4));
        }
    }
}
