package com.facebook.ads.internal.view.hscroll;

import android.util.SparseArray;

/* renamed from: com.facebook.ads.internal.view.hscroll.a */
public class C1607a {
    /* renamed from: a */
    private final SparseArray<int[]> f4455a = new SparseArray();

    /* renamed from: a */
    public void m5481a(int i, int[] iArr) {
        this.f4455a.put(i, iArr);
    }

    /* renamed from: a */
    public int[] m5482a(int i) {
        return (int[]) this.f4455a.get(i);
    }

    /* renamed from: b */
    public boolean m5483b(int i) {
        return this.f4455a.indexOfKey(i) >= 0;
    }
}
