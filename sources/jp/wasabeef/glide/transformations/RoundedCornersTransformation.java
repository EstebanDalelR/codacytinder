package jp.wasabeef.glide.transformations;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.C3081b;

public class RoundedCornersTransformation implements Transformation<Bitmap> {
    /* renamed from: a */
    private BitmapPool f54708a;
    /* renamed from: b */
    private int f54709b;
    /* renamed from: c */
    private int f54710c;
    /* renamed from: d */
    private int f54711d;
    /* renamed from: e */
    private CornerType f54712e;

    public enum CornerType {
        ALL,
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT,
        OTHER_TOP_LEFT,
        OTHER_TOP_RIGHT,
        OTHER_BOTTOM_LEFT,
        OTHER_BOTTOM_RIGHT,
        DIAGONAL_FROM_TOP_LEFT,
        DIAGONAL_FROM_TOP_RIGHT
    }

    public RoundedCornersTransformation(Context context, int i, int i2) {
        this(context, i, i2, CornerType.ALL);
    }

    public RoundedCornersTransformation(Context context, int i, int i2, CornerType cornerType) {
        this(C0994i.a(context).a(), i, i2, cornerType);
    }

    public RoundedCornersTransformation(BitmapPool bitmapPool, int i, int i2, CornerType cornerType) {
        this.f54708a = bitmapPool;
        this.f54709b = i;
        this.f54710c = this.f54709b * 2;
        this.f54711d = i2;
        this.f54712e = cornerType;
    }

    public Resource<Bitmap> transform(Resource<Bitmap> resource, int i, int i2) {
        Bitmap bitmap = (Bitmap) resource.get();
        i = bitmap.getWidth();
        i2 = bitmap.getHeight();
        Bitmap bitmap2 = this.f54708a.get(i, i2, Config.ARGB_8888);
        if (bitmap2 == null) {
            bitmap2 = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(bitmap2);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(new BitmapShader(bitmap, TileMode.CLAMP, TileMode.CLAMP));
        m64135a(canvas, paint, (float) i, (float) i2);
        return C3081b.a(bitmap2, this.f54708a);
    }

    /* renamed from: a */
    private void m64135a(Canvas canvas, Paint paint, float f, float f2) {
        f -= (float) this.f54711d;
        f2 -= (float) this.f54711d;
        switch (this.f54712e) {
            case ALL:
                canvas.drawRoundRect(new RectF((float) this.f54711d, (float) this.f54711d, f, f2), (float) this.f54709b, (float) this.f54709b, paint);
                return;
            case TOP_LEFT:
                m64136b(canvas, paint, f, f2);
                return;
            case TOP_RIGHT:
                m64137c(canvas, paint, f, f2);
                return;
            case BOTTOM_LEFT:
                m64138d(canvas, paint, f, f2);
                return;
            case BOTTOM_RIGHT:
                m64139e(canvas, paint, f, f2);
                return;
            case TOP:
                m64140f(canvas, paint, f, f2);
                return;
            case BOTTOM:
                m64141g(canvas, paint, f, f2);
                return;
            case LEFT:
                m64142h(canvas, paint, f, f2);
                return;
            case RIGHT:
                m64143i(canvas, paint, f, f2);
                return;
            case OTHER_TOP_LEFT:
                m64144j(canvas, paint, f, f2);
                return;
            case OTHER_TOP_RIGHT:
                m64145k(canvas, paint, f, f2);
                return;
            case OTHER_BOTTOM_LEFT:
                m64146l(canvas, paint, f, f2);
                return;
            case OTHER_BOTTOM_RIGHT:
                m64147m(canvas, paint, f, f2);
                return;
            case DIAGONAL_FROM_TOP_LEFT:
                m64148n(canvas, paint, f, f2);
                return;
            case DIAGONAL_FROM_TOP_RIGHT:
                m64149o(canvas, paint, f, f2);
                return;
            default:
                canvas.drawRoundRect(new RectF((float) this.f54711d, (float) this.f54711d, f, f2), (float) this.f54709b, (float) this.f54709b, paint);
                return;
        }
    }

    /* renamed from: b */
    private void m64136b(Canvas canvas, Paint paint, float f, float f2) {
        canvas.drawRoundRect(new RectF((float) this.f54711d, (float) this.f54711d, (float) (this.f54711d + this.f54710c), (float) (this.f54711d + this.f54710c)), (float) this.f54709b, (float) this.f54709b, paint);
        canvas.drawRect(new RectF((float) this.f54711d, (float) (this.f54711d + this.f54709b), (float) (this.f54711d + this.f54709b), f2), paint);
        canvas.drawRect(new RectF((float) (this.f54711d + this.f54709b), (float) this.f54711d, f, f2), paint);
    }

    /* renamed from: c */
    private void m64137c(Canvas canvas, Paint paint, float f, float f2) {
        canvas.drawRoundRect(new RectF(f - ((float) this.f54710c), (float) this.f54711d, f, (float) (this.f54711d + this.f54710c)), (float) this.f54709b, (float) this.f54709b, paint);
        canvas.drawRect(new RectF((float) this.f54711d, (float) this.f54711d, f - ((float) this.f54709b), f2), paint);
        canvas.drawRect(new RectF(f - ((float) this.f54709b), (float) (this.f54711d + this.f54709b), f, f2), paint);
    }

    /* renamed from: d */
    private void m64138d(Canvas canvas, Paint paint, float f, float f2) {
        canvas.drawRoundRect(new RectF((float) this.f54711d, f2 - ((float) this.f54710c), (float) (this.f54711d + this.f54710c), f2), (float) this.f54709b, (float) this.f54709b, paint);
        canvas.drawRect(new RectF((float) this.f54711d, (float) this.f54711d, (float) (this.f54711d + this.f54710c), f2 - ((float) this.f54709b)), paint);
        canvas.drawRect(new RectF((float) (this.f54711d + this.f54709b), (float) this.f54711d, f, f2), paint);
    }

    /* renamed from: e */
    private void m64139e(Canvas canvas, Paint paint, float f, float f2) {
        canvas.drawRoundRect(new RectF(f - ((float) this.f54710c), f2 - ((float) this.f54710c), f, f2), (float) this.f54709b, (float) this.f54709b, paint);
        canvas.drawRect(new RectF((float) this.f54711d, (float) this.f54711d, f - ((float) this.f54709b), f2), paint);
        canvas.drawRect(new RectF(f - ((float) this.f54709b), (float) this.f54711d, f, f2 - ((float) this.f54709b)), paint);
    }

    /* renamed from: f */
    private void m64140f(Canvas canvas, Paint paint, float f, float f2) {
        canvas.drawRoundRect(new RectF((float) this.f54711d, (float) this.f54711d, f, (float) (this.f54711d + this.f54710c)), (float) this.f54709b, (float) this.f54709b, paint);
        canvas.drawRect(new RectF((float) this.f54711d, (float) (this.f54711d + this.f54709b), f, f2), paint);
    }

    /* renamed from: g */
    private void m64141g(Canvas canvas, Paint paint, float f, float f2) {
        canvas.drawRoundRect(new RectF((float) this.f54711d, f2 - ((float) this.f54710c), f, f2), (float) this.f54709b, (float) this.f54709b, paint);
        canvas.drawRect(new RectF((float) this.f54711d, (float) this.f54711d, f, f2 - ((float) this.f54709b)), paint);
    }

    /* renamed from: h */
    private void m64142h(Canvas canvas, Paint paint, float f, float f2) {
        canvas.drawRoundRect(new RectF((float) this.f54711d, (float) this.f54711d, (float) (this.f54711d + this.f54710c), f2), (float) this.f54709b, (float) this.f54709b, paint);
        canvas.drawRect(new RectF((float) (this.f54711d + this.f54709b), (float) this.f54711d, f, f2), paint);
    }

    /* renamed from: i */
    private void m64143i(Canvas canvas, Paint paint, float f, float f2) {
        canvas.drawRoundRect(new RectF(f - ((float) this.f54710c), (float) this.f54711d, f, f2), (float) this.f54709b, (float) this.f54709b, paint);
        canvas.drawRect(new RectF((float) this.f54711d, (float) this.f54711d, f - ((float) this.f54709b), f2), paint);
    }

    /* renamed from: j */
    private void m64144j(Canvas canvas, Paint paint, float f, float f2) {
        canvas.drawRoundRect(new RectF((float) this.f54711d, f2 - ((float) this.f54710c), f, f2), (float) this.f54709b, (float) this.f54709b, paint);
        canvas.drawRoundRect(new RectF(f - ((float) this.f54710c), (float) this.f54711d, f, f2), (float) this.f54709b, (float) this.f54709b, paint);
        canvas.drawRect(new RectF((float) this.f54711d, (float) this.f54711d, f - ((float) this.f54709b), f2 - ((float) this.f54709b)), paint);
    }

    /* renamed from: k */
    private void m64145k(Canvas canvas, Paint paint, float f, float f2) {
        canvas.drawRoundRect(new RectF((float) this.f54711d, (float) this.f54711d, (float) (this.f54711d + this.f54710c), f2), (float) this.f54709b, (float) this.f54709b, paint);
        canvas.drawRoundRect(new RectF((float) this.f54711d, f2 - ((float) this.f54710c), f, f2), (float) this.f54709b, (float) this.f54709b, paint);
        canvas.drawRect(new RectF((float) (this.f54711d + this.f54709b), (float) this.f54711d, f, f2 - ((float) this.f54709b)), paint);
    }

    /* renamed from: l */
    private void m64146l(Canvas canvas, Paint paint, float f, float f2) {
        canvas.drawRoundRect(new RectF((float) this.f54711d, (float) this.f54711d, f, (float) (this.f54711d + this.f54710c)), (float) this.f54709b, (float) this.f54709b, paint);
        canvas.drawRoundRect(new RectF(f - ((float) this.f54710c), (float) this.f54711d, f, f2), (float) this.f54709b, (float) this.f54709b, paint);
        canvas.drawRect(new RectF((float) this.f54711d, (float) (this.f54711d + this.f54709b), f - ((float) this.f54709b), f2), paint);
    }

    /* renamed from: m */
    private void m64147m(Canvas canvas, Paint paint, float f, float f2) {
        canvas.drawRoundRect(new RectF((float) this.f54711d, (float) this.f54711d, f, (float) (this.f54711d + this.f54710c)), (float) this.f54709b, (float) this.f54709b, paint);
        canvas.drawRoundRect(new RectF((float) this.f54711d, (float) this.f54711d, (float) (this.f54711d + this.f54710c), f2), (float) this.f54709b, (float) this.f54709b, paint);
        canvas.drawRect(new RectF((float) (this.f54711d + this.f54709b), (float) (this.f54711d + this.f54709b), f, f2), paint);
    }

    /* renamed from: n */
    private void m64148n(Canvas canvas, Paint paint, float f, float f2) {
        canvas.drawRoundRect(new RectF((float) this.f54711d, (float) this.f54711d, (float) (this.f54711d + this.f54710c), (float) (this.f54711d + this.f54710c)), (float) this.f54709b, (float) this.f54709b, paint);
        canvas.drawRoundRect(new RectF(f - ((float) this.f54710c), f2 - ((float) this.f54710c), f, f2), (float) this.f54709b, (float) this.f54709b, paint);
        canvas.drawRect(new RectF((float) this.f54711d, (float) (this.f54711d + this.f54709b), f - ((float) this.f54710c), f2), paint);
        canvas.drawRect(new RectF((float) (this.f54711d + this.f54710c), (float) this.f54711d, f, f2 - ((float) this.f54709b)), paint);
    }

    /* renamed from: o */
    private void m64149o(Canvas canvas, Paint paint, float f, float f2) {
        canvas.drawRoundRect(new RectF(f - ((float) this.f54710c), (float) this.f54711d, f, (float) (this.f54711d + this.f54710c)), (float) this.f54709b, (float) this.f54709b, paint);
        canvas.drawRoundRect(new RectF((float) this.f54711d, f2 - ((float) this.f54710c), (float) (this.f54711d + this.f54710c), f2), (float) this.f54709b, (float) this.f54709b, paint);
        canvas.drawRect(new RectF((float) this.f54711d, (float) this.f54711d, f - ((float) this.f54709b), f2 - ((float) this.f54709b)), paint);
        canvas.drawRect(new RectF((float) (this.f54711d + this.f54709b), (float) (this.f54711d + this.f54709b), f, f2), paint);
    }

    public String getId() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RoundedTransformation(radius=");
        stringBuilder.append(this.f54709b);
        stringBuilder.append(", margin=");
        stringBuilder.append(this.f54711d);
        stringBuilder.append(", diameter=");
        stringBuilder.append(this.f54710c);
        stringBuilder.append(", cornerType=");
        stringBuilder.append(this.f54712e.name());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
