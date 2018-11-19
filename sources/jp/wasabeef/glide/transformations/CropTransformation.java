package jp.wasabeef.glide.transformations;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.RectF;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.C3081b;

public class CropTransformation implements Transformation<Bitmap> {
    /* renamed from: a */
    private BitmapPool f54704a;
    /* renamed from: b */
    private int f54705b;
    /* renamed from: c */
    private int f54706c;
    /* renamed from: d */
    private CropType f54707d;

    public enum CropType {
        TOP,
        CENTER,
        BOTTOM
    }

    public Resource<Bitmap> transform(Resource<Bitmap> resource, int i, int i2) {
        Bitmap bitmap = (Bitmap) resource.get();
        this.f54705b = this.f54705b == 0 ? bitmap.getWidth() : this.f54705b;
        this.f54706c = this.f54706c == 0 ? bitmap.getHeight() : this.f54706c;
        i = bitmap.getConfig() != 0 ? bitmap.getConfig() : Config.ARGB_8888;
        i2 = this.f54704a.get(this.f54705b, this.f54706c, i);
        if (i2 == 0) {
            i2 = Bitmap.createBitmap(this.f54705b, this.f54706c, i);
        }
        i = Math.max(((float) this.f54705b) / ((float) bitmap.getWidth()), ((float) this.f54706c) / ((float) bitmap.getHeight()));
        float width = ((float) bitmap.getWidth()) * i;
        i *= (float) bitmap.getHeight();
        float f = (((float) this.f54705b) - width) / 2.0f;
        float a = m64134a(i);
        new Canvas(i2).drawBitmap(bitmap, null, new RectF(f, a, width + f, i + a), null);
        return C3081b.a(i2, this.f54704a);
    }

    public String getId() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CropTransformation(width=");
        stringBuilder.append(this.f54705b);
        stringBuilder.append(", height=");
        stringBuilder.append(this.f54706c);
        stringBuilder.append(", cropType=");
        stringBuilder.append(this.f54707d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private float m64134a(float f) {
        switch (this.f54707d) {
            case TOP:
                return 0.0f;
            case CENTER:
                return (((float) this.f54706c) - f) / 2.0f;
            case BOTTOM:
                return ((float) this.f54706c) - f;
            default:
                return 0.0f;
        }
    }
}
