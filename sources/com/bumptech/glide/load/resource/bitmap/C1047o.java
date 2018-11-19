package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.util.Log;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;

/* renamed from: com.bumptech.glide.load.resource.bitmap.o */
public final class C1047o {
    /* renamed from: a */
    public static int m3615a(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public static Bitmap m3617a(Bitmap bitmap, Bitmap bitmap2, int i, int i2) {
        if (bitmap2 == null) {
            return null;
        }
        if (bitmap2.getWidth() == i && bitmap2.getHeight() == i2) {
            return bitmap2;
        }
        float height;
        float width;
        Matrix matrix = new Matrix();
        float f = 0.0f;
        if (bitmap2.getWidth() * i2 > bitmap2.getHeight() * i) {
            height = ((float) i2) / ((float) bitmap2.getHeight());
            width = (((float) i) - (((float) bitmap2.getWidth()) * height)) * 0.5f;
        } else {
            height = ((float) i) / ((float) bitmap2.getWidth());
            f = (((float) i2) - (((float) bitmap2.getHeight()) * height)) * 0.5f;
            width = 0.0f;
        }
        matrix.setScale(height, height);
        matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (f + 0.5f)));
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(i, i2, C1047o.m3616a(bitmap2));
        }
        C1047o.m3621a(bitmap2, bitmap);
        new Canvas(bitmap).drawBitmap(bitmap2, matrix, new Paint(6));
        return bitmap;
    }

    /* renamed from: a */
    public static Bitmap m3619a(Bitmap bitmap, BitmapPool bitmapPool, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            if (Log.isLoggable("TransformationUtils", 2) != null) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float min = Math.min(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
        int width = (int) (((float) bitmap.getWidth()) * min);
        int height = (int) (((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == width && bitmap.getHeight() == height) {
            if (Log.isLoggable("TransformationUtils", 2) != null) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Config a = C1047o.m3616a(bitmap);
        Bitmap bitmap2 = bitmapPool.get(width, height, a);
        if (bitmap2 == null) {
            bitmap2 = Bitmap.createBitmap(width, height, a);
        }
        C1047o.m3621a(bitmap, bitmap2);
        if (Log.isLoggable("TransformationUtils", 2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("request: ");
            stringBuilder.append(i);
            stringBuilder.append("x");
            stringBuilder.append(i2);
            Log.v("TransformationUtils", stringBuilder.toString());
            i2 = new StringBuilder();
            i2.append("toFit:   ");
            i2.append(bitmap.getWidth());
            i2.append("x");
            i2.append(bitmap.getHeight());
            Log.v("TransformationUtils", i2.toString());
            i2 = new StringBuilder();
            i2.append("toReuse: ");
            i2.append(bitmap2.getWidth());
            i2.append("x");
            i2.append(bitmap2.getHeight());
            Log.v("TransformationUtils", i2.toString());
            i2 = new StringBuilder();
            i2.append("minPct:   ");
            i2.append(min);
            Log.v("TransformationUtils", i2.toString());
        }
        i = new Canvas(bitmap2);
        i2 = new Matrix();
        i2.setScale(min, min);
        i.drawBitmap(bitmap, i2, new Paint(6));
        return bitmap2;
    }

    @TargetApi(12)
    /* renamed from: a */
    public static void m3621a(Bitmap bitmap, Bitmap bitmap2) {
        if (VERSION.SDK_INT >= 12 && bitmap2 != null) {
            bitmap2.setHasAlpha(bitmap.hasAlpha());
        }
    }

    /* renamed from: a */
    public static Bitmap m3618a(Bitmap bitmap, BitmapPool bitmapPool, int i) {
        Matrix matrix = new Matrix();
        C1047o.m3620a(i, matrix);
        if (matrix.isIdentity() != 0) {
            return bitmap;
        }
        i = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(i);
        int round = Math.round(i.width());
        int round2 = Math.round(i.height());
        Config a = C1047o.m3616a(bitmap);
        bitmapPool = bitmapPool.get(round, round2, a);
        if (bitmapPool == null) {
            bitmapPool = Bitmap.createBitmap(round, round2, a);
        }
        matrix.postTranslate(-i.left, -i.top);
        new Canvas(bitmapPool).drawBitmap(bitmap, matrix, new Paint(6));
        return bitmapPool;
    }

    /* renamed from: a */
    private static Config m3616a(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Config.ARGB_8888;
    }

    /* renamed from: a */
    static void m3620a(int i, Matrix matrix) {
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
    }
}
