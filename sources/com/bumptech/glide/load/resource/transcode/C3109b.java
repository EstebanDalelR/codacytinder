package com.bumptech.glide.load.resource.transcode;

import android.content.res.Resources;
import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.C3086i;
import com.bumptech.glide.load.resource.bitmap.C4108j;

/* renamed from: com.bumptech.glide.load.resource.transcode.b */
public class C3109b implements ResourceTranscoder<Bitmap, C3086i> {
    /* renamed from: a */
    private final Resources f9624a;
    /* renamed from: b */
    private final BitmapPool f9625b;

    public String getId() {
        return "GlideBitmapDrawableTranscoder.com.bumptech.glide.load.resource.transcode";
    }

    public C3109b(Resources resources, BitmapPool bitmapPool) {
        this.f9624a = resources;
        this.f9625b = bitmapPool;
    }

    public Resource<C3086i> transcode(Resource<Bitmap> resource) {
        return new C4108j(new C3086i(this.f9624a, (Bitmap) resource.get()), this.f9625b);
    }
}
