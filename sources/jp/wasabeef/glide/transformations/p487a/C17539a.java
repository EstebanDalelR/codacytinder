package jp.wasabeef.glide.transformations.p487a;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.C3081b;
import jp.co.cyberagent.android.gpuimage.C15785a;
import jp.co.cyberagent.android.gpuimage.GPUImage;

/* renamed from: jp.wasabeef.glide.transformations.a.a */
public class C17539a implements Transformation<Bitmap> {
    /* renamed from: a */
    private Context f54713a;
    /* renamed from: b */
    private BitmapPool f54714b;
    /* renamed from: c */
    private C15785a f54715c;

    public C17539a(Context context, BitmapPool bitmapPool, C15785a c15785a) {
        this.f54713a = context.getApplicationContext();
        this.f54714b = bitmapPool;
        this.f54715c = c15785a;
    }

    public Resource<Bitmap> transform(Resource<Bitmap> resource, int i, int i2) {
        Bitmap bitmap = (Bitmap) resource.get();
        i = new GPUImage(this.f54713a);
        i.m59742a(bitmap);
        i.m59747a(this.f54715c);
        return C3081b.a(i.m59750c(), this.f54714b);
    }

    public String getId() {
        return getClass().getSimpleName();
    }

    /* renamed from: a */
    public <T> T m64150a() {
        return this.f54715c;
    }
}
