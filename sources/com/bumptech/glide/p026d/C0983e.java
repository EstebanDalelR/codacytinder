package com.bumptech.glide.p026d;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/* renamed from: com.bumptech.glide.d.e */
public class C0983e<T, Y> {
    /* renamed from: a */
    private final LinkedHashMap<T, Y> f2673a = new LinkedHashMap(100, 0.75f, true);
    /* renamed from: b */
    private int f2674b;
    /* renamed from: c */
    private final int f2675c;
    /* renamed from: d */
    private int f2676d = 0;

    /* renamed from: a */
    protected int mo1303a(Y y) {
        return 1;
    }

    /* renamed from: a */
    protected void mo1304a(T t, Y y) {
    }

    public C0983e(int i) {
        this.f2675c = i;
        this.f2674b = i;
    }

    public void setSizeMultiplier(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Multiplier must be >= 0");
        }
        this.f2674b = Math.round(((float) this.f2675c) * f);
        m3394a();
    }

    public int getMaxSize() {
        return this.f2674b;
    }

    public int getCurrentSize() {
        return this.f2676d;
    }

    /* renamed from: b */
    public Y m3398b(T t) {
        return this.f2673a.get(t);
    }

    /* renamed from: b */
    public Y m3399b(T t, Y y) {
        if (mo1303a((Object) y) >= this.f2674b) {
            mo1304a(t, y);
            return null;
        }
        Object put = this.f2673a.put(t, y);
        if (y != null) {
            this.f2676d += mo1303a((Object) y);
        }
        if (put != null) {
            this.f2676d -= mo1303a(put);
        }
        m3394a();
        return put;
    }

    /* renamed from: c */
    public Y m3400c(T t) {
        Object remove = this.f2673a.remove(t);
        if (remove != null) {
            this.f2676d -= mo1303a(remove);
        }
        return remove;
    }

    public void clearMemory() {
        m3396a(0);
    }

    /* renamed from: a */
    protected void m3396a(int i) {
        while (this.f2676d > i) {
            Entry entry = (Entry) this.f2673a.entrySet().iterator().next();
            Object value = entry.getValue();
            this.f2676d -= mo1303a(value);
            Object key = entry.getKey();
            this.f2673a.remove(key);
            mo1304a(key, value);
        }
    }

    /* renamed from: a */
    private void m3394a() {
        m3396a(this.f2674b);
    }
}
