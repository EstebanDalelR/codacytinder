package jp.wasabeef.glide.transformations;

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

/* renamed from: jp.wasabeef.glide.transformations.b */
public class C17541b implements Transformation<Bitmap> {
    /* renamed from: a */
    private BitmapPool f54722a;

    public String getId() {
        return "CropCircleTransformation()";
    }

    public C17541b(Context context) {
        this(C0994i.a(context).a());
    }

    public C17541b(BitmapPool bitmapPool) {
        this.f54722a = bitmapPool;
    }

    public Resource<Bitmap> transform(Resource<Bitmap> resource, int i, int i2) {
        Bitmap bitmap = (Bitmap) resource.get();
        i = Math.min(bitmap.getWidth(), bitmap.getHeight());
        i2 = (bitmap.getWidth() - i) / 2;
        int height = (bitmap.getHeight() - i) / 2;
        Bitmap bitmap2 = this.f54722a.get(i, i, Config.ARGB_8888);
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
        canvas.drawCircle(resource, resource, resource, paint);
        return C3081b.a(bitmap2, this.f54722a);
    }
}
