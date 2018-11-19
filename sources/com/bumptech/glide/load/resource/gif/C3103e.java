package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.C3081b;

/* renamed from: com.bumptech.glide.load.resource.gif.e */
public class C3103e implements Transformation<C3101b> {
    /* renamed from: a */
    private final Transformation<Bitmap> f9612a;
    /* renamed from: b */
    private final BitmapPool f9613b;

    public C3103e(Transformation<Bitmap> transformation, BitmapPool bitmapPool) {
        this.f9612a = transformation;
        this.f9613b = bitmapPool;
    }

    public Resource<C3101b> transform(Resource<C3101b> resource, int i, int i2) {
        C3101b c3101b = (C3101b) resource.get();
        Bitmap b = ((C3101b) resource.get()).m12060b();
        Bitmap bitmap = (Bitmap) this.f9612a.transform(new C3081b(b, this.f9613b), i, i2).get();
        return bitmap.equals(b) == 0 ? new C4110d(new C3101b(c3101b, bitmap, this.f9612a)) : resource;
    }

    public String getId() {
        return this.f9612a.getId();
    }
}
