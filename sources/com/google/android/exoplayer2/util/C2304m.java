package com.google.android.exoplayer2.util;

import java.util.PriorityQueue;

/* renamed from: com.google.android.exoplayer2.util.m */
public final class C2304m {
    /* renamed from: a */
    private final Object f6936a;
    /* renamed from: b */
    private final PriorityQueue<Integer> f6937b;
    /* renamed from: c */
    private int f6938c;

    /* renamed from: a */
    public void m8427a(int i) {
        synchronized (this.f6936a) {
            this.f6937b.add(Integer.valueOf(i));
            this.f6938c = Math.max(this.f6938c, i);
        }
    }

    /* renamed from: b */
    public void m8428b(int i) {
        synchronized (this.f6936a) {
            this.f6937b.remove(Integer.valueOf(i));
            this.f6938c = this.f6937b.isEmpty() != 0 ? Integer.MIN_VALUE : ((Integer) this.f6937b.peek()).intValue();
            this.f6936a.notifyAll();
        }
    }
}
