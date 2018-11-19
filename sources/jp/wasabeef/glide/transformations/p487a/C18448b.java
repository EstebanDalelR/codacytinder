package jp.wasabeef.glide.transformations.p487a;

import android.content.Context;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import jp.co.cyberagent.android.gpuimage.C17538b;

/* renamed from: jp.wasabeef.glide.transformations.a.b */
public class C18448b extends C17539a {
    /* renamed from: a */
    private float f57745a;

    public C18448b(Context context, float f) {
        this(context, C0994i.a(context).a(), f);
    }

    public C18448b(Context context, BitmapPool bitmapPool, float f) {
        super(context, bitmapPool, new C17538b());
        this.f57745a = f;
        ((C17538b) m64150a()).m64131a(this.f57745a);
    }

    public String getId() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PixelationFilterTransformation(pixel=");
        stringBuilder.append(this.f57745a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
