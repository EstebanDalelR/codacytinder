package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;

/* renamed from: com.bumptech.glide.load.resource.bitmap.d */
public class C4103d extends C3082c {
    public String getId() {
        return "CenterCrop.com.bumptech.glide.load.resource.bitmap";
    }

    public C4103d(Context context) {
        super(context);
    }

    public C4103d(BitmapPool bitmapPool) {
        super(bitmapPool);
    }

    /* renamed from: a */
    protected Bitmap mo3187a(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        Bitmap bitmap2 = bitmapPool.get(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Config.ARGB_8888);
        bitmap = C1047o.m3617a(bitmap2, bitmap, i, i2);
        if (!(bitmap2 == null || bitmap2 == bitmap || bitmapPool.put(bitmap2) != null)) {
            bitmap2.recycle();
        }
        return bitmap;
    }
}
