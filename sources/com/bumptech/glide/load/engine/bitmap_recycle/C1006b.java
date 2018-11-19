package com.bumptech.glide.load.engine.bitmap_recycle;

import com.bumptech.glide.p026d.C0987h;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.b */
abstract class C1006b<T extends C1012g> {
    /* renamed from: a */
    private final Queue<T> f2811a = C0987h.m3410a(20);

    /* renamed from: b */
    protected abstract T mo1281b();

    C1006b() {
    }

    /* renamed from: c */
    protected T m3528c() {
        C1012g c1012g = (C1012g) this.f2811a.poll();
        return c1012g == null ? mo1281b() : c1012g;
    }

    /* renamed from: a */
    public void m3526a(T t) {
        if (this.f2811a.size() < 20) {
            this.f2811a.offer(t);
        }
    }
}
