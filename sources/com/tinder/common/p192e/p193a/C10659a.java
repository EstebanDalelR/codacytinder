package com.tinder.common.p192e.p193a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.C3081b;

/* renamed from: com.tinder.common.e.a.a */
public class C10659a implements Transformation<Bitmap> {
    /* renamed from: a */
    private final BitmapPool f34960a;
    /* renamed from: b */
    private final float f34961b;
    /* renamed from: c */
    private final Paint f34962c;

    /* renamed from: com.tinder.common.e.a.a$a */
    public static final class C8531a {
        /* renamed from: a */
        private final Context f30277a;
        /* renamed from: b */
        private float f30278b;
        /* renamed from: c */
        private int f30279c;

        public C8531a(Context context) {
            this.f30277a = context;
        }

        /* renamed from: a */
        public C8531a m36497a(float f) {
            this.f30278b = f;
            return this;
        }

        /* renamed from: a */
        public C8531a m36498a(int i) {
            this.f30279c = i;
            return this;
        }

        /* renamed from: a */
        public C8531a m36496a() {
            this.f30279c = 0;
            this.f30278b = 0.0f;
            return this;
        }

        /* renamed from: b */
        public C10659a m36499b() {
            return new C10659a(C0994i.a(this.f30277a).a(), this.f30278b, this.f30279c);
        }
    }

    public String getId() {
        return "CropCircleWithBorderTransformation";
    }

    private C10659a(BitmapPool bitmapPool, float f, int i) {
        this.f34960a = bitmapPool;
        this.f34961b = f;
        this.f34962c = new Paint();
        this.f34962c.setColor(i);
        this.f34962c.setStrokeWidth(this.f34961b);
        this.f34962c.setAntiAlias(Float.MIN_VALUE);
    }

    public Resource<Bitmap> transform(Resource<Bitmap> resource, int i, int i2) {
        Bitmap bitmap = (Bitmap) resource.get();
        i = Math.min(bitmap.getWidth(), bitmap.getHeight());
        i2 = (bitmap.getWidth() - i) / 2;
        int height = (bitmap.getHeight() - i) / 2;
        Bitmap bitmap2 = this.f34960a.get(i, i, Config.ARGB_8888);
        if (bitmap2 == null) {
            bitmap2 = Bitmap.createBitmap(i, i, Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(bitmap2);
        Paint paint = new Paint();
        Shader bitmapShader = new BitmapShader(bitmap, TileMode.CLAMP, TileMode.CLAMP);
        if (!(i2 == 0 && height == 0)) {
            resource = new Matrix();
            resource.setTranslate((float) (-i2), (float) (-height));
            bitmapShader.setLocalMatrix(resource);
        }
        paint.setShader(bitmapShader);
        paint.setAntiAlias(true);
        resource = ((float) i) / 1073741824;
        canvas.drawCircle(resource, resource, resource, this.f34962c);
        canvas.drawCircle(resource, resource, resource - this.f34961b, paint);
        return C3081b.a(bitmap2, this.f34960a);
    }
}
