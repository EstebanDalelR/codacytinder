package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;

/* renamed from: com.bumptech.glide.load.resource.gif.a */
class C3100a implements BitmapProvider {
    /* renamed from: a */
    private final BitmapPool f9595a;

    public C3100a(BitmapPool bitmapPool) {
        this.f9595a = bitmapPool;
    }

    public Bitmap obtain(int i, int i2, Config config) {
        return this.f9595a.getDirty(i, i2, config);
    }

    public void release(Bitmap bitmap) {
        if (!this.f9595a.put(bitmap)) {
            bitmap.recycle();
        }
    }
}
