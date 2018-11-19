package com.bumptech.glide.load.resource.p030c;

import android.graphics.Bitmap;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.gif.C3101b;
import com.bumptech.glide.load.resource.gif.C3103e;

/* renamed from: com.bumptech.glide.load.resource.c.f */
public class C3095f implements Transformation<C1049a> {
    /* renamed from: a */
    private final Transformation<Bitmap> f9586a;
    /* renamed from: b */
    private final Transformation<C3101b> f9587b;

    public C3095f(BitmapPool bitmapPool, Transformation<Bitmap> transformation) {
        this((Transformation) transformation, new C3103e(transformation, bitmapPool));
    }

    C3095f(Transformation<Bitmap> transformation, Transformation<C3101b> transformation2) {
        this.f9586a = transformation;
        this.f9587b = transformation2;
    }

    public Resource<C1049a> transform(Resource<C1049a> resource, int i, int i2) {
        Resource b = ((C1049a) resource.get()).m3624b();
        Resource c = ((C1049a) resource.get()).m3625c();
        if (b != null && this.f9586a != null) {
            i = this.f9586a.transform(b, i, i2);
            if (b.equals(i) == 0) {
                return new C3092b(new C1049a(i, ((C1049a) resource.get()).m3625c()));
            }
        } else if (!(c == null || this.f9587b == null)) {
            i = this.f9587b.transform(c, i, i2);
            if (c.equals(i) == 0) {
                return new C3092b(new C1049a(((C1049a) resource.get()).m3624b(), i));
            }
        }
        return resource;
    }

    public String getId() {
        return this.f9586a.getId();
    }
}
