package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.p026d.C0987h;

/* renamed from: com.bumptech.glide.load.resource.bitmap.b */
public class C3081b implements Resource<Bitmap> {
    /* renamed from: a */
    private final Bitmap f9538a;
    /* renamed from: b */
    private final BitmapPool f9539b;

    public /* synthetic */ Object get() {
        return m12025a();
    }

    /* renamed from: a */
    public static C3081b m12024a(Bitmap bitmap, BitmapPool bitmapPool) {
        return bitmap == null ? null : new C3081b(bitmap, bitmapPool);
    }

    public C3081b(Bitmap bitmap, BitmapPool bitmapPool) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        } else if (bitmapPool == null) {
            throw new NullPointerException("BitmapPool must not be null");
        } else {
            this.f9538a = bitmap;
            this.f9539b = bitmapPool;
        }
    }

    /* renamed from: a */
    public Bitmap m12025a() {
        return this.f9538a;
    }

    public int getSize() {
        return C0987h.m3406a(this.f9538a);
    }

    public void recycle() {
        if (!this.f9539b.put(this.f9538a)) {
            this.f9538a.recycle();
        }
    }
}
