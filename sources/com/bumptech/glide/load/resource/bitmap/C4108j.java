package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.p028a.C3075a;
import com.bumptech.glide.p026d.C0987h;

/* renamed from: com.bumptech.glide.load.resource.bitmap.j */
public class C4108j extends C3075a<C3086i> {
    /* renamed from: b */
    private final BitmapPool f12983b;

    public C4108j(C3086i c3086i, BitmapPool bitmapPool) {
        super(c3086i);
        this.f12983b = bitmapPool;
    }

    public int getSize() {
        return C0987h.m3406a(((C3086i) this.a).m12042b());
    }

    public void recycle() {
        this.f12983b.put(((C3086i) this.a).m12042b());
    }
}
