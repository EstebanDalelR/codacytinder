package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.C3081b;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.resource.gif.g */
class C3106g implements ResourceDecoder<GifDecoder, Bitmap> {
    /* renamed from: a */
    private final BitmapPool f9615a;

    public String getId() {
        return "GifFrameResourceDecoder.com.bumptech.glide.load.resource.gif";
    }

    public /* synthetic */ Resource decode(Object obj, int i, int i2) throws IOException {
        return m12067a((GifDecoder) obj, i, i2);
    }

    public C3106g(BitmapPool bitmapPool) {
        this.f9615a = bitmapPool;
    }

    /* renamed from: a */
    public Resource<Bitmap> m12067a(GifDecoder gifDecoder, int i, int i2) {
        return C3081b.m12024a(gifDecoder.m3457f(), this.f9615a);
    }
}
