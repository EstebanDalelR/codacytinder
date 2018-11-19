package com.tinder.common.p192e.p193a;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.C3082c;
import com.tinder.utils.C15363n;

/* renamed from: com.tinder.common.e.a.b */
public class C12777b extends C3082c {
    /* renamed from: a */
    private final int f41161a;

    public String getId() {
        return "com.tinder.common.glide.transformations.RoundedCornerTransformation";
    }

    public C12777b(Context context, int i) {
        super(context);
        this.f41161a = i;
    }

    /* renamed from: a */
    protected Bitmap m50238a(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        return C15363n.a(bitmap, this.f41161a);
    }
}
