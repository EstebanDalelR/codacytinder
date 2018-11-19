package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.p026d.C0987h;

/* renamed from: com.bumptech.glide.load.resource.bitmap.c */
public abstract class C3082c implements Transformation<Bitmap> {
    /* renamed from: a */
    private BitmapPool f9540a;

    /* renamed from: a */
    protected abstract Bitmap mo3187a(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2);

    public C3082c(Context context) {
        this(C0994i.m3480a(context).m3490a());
    }

    public C3082c(BitmapPool bitmapPool) {
        this.f9540a = bitmapPool;
    }

    public final Resource<Bitmap> transform(Resource<Bitmap> resource, int i, int i2) {
        if (C0987h.m3412a(i, i2)) {
            Bitmap bitmap = (Bitmap) resource.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            i = mo3187a(this.f9540a, bitmap, i, i2);
            return bitmap.equals(i) != 0 ? resource : C3081b.m12024a(i, this.f9540a);
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot apply transformation on width: ");
            stringBuilder.append(i);
            stringBuilder.append(" or height: ");
            stringBuilder.append(i2);
            stringBuilder.append(" less than or equal to zero and not Target.SIZE_ORIGINAL");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
