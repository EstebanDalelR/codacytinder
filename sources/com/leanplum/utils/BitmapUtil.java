package com.leanplum.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.leanplum.p069a.ao;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class BitmapUtil {
    private static final int BIG_PICTURE_MAX_HEIGHT_DP = 192;

    public static int getDarker(int i, int i2) {
        if (i2 < 0 || i2 > 100) {
            i2 = 0;
        }
        double d = ((double) (100 - i2)) / 100.0d;
        return (((int) (((double) (i & 255)) * d)) & 255) | ((((i >>> 24) << 24) | ((((int) (((double) ((i >> 16) & 255)) * d)) & 255) << 16)) | ((((int) (((double) ((i >> 8) & 255)) * d)) & 255) << 8));
    }

    public static Bitmap getRoundedCornerBitmap(Bitmap bitmap, int i) {
        if (bitmap == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-16777216);
        i = (float) i;
        canvas.drawRoundRect(rectF, i, i, paint);
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    public static void stateBackgroundDarkerByPercentage(View view, int i, int i2) {
        stateBackground(view, i, getDarker(i, i2));
    }

    public static void stateBackground(View view, int i, int i2) {
        if (VERSION.SDK_INT >= 16) {
            view.setBackground(getBackground(i, i2));
        } else {
            view.setBackgroundColor(i);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.drawable.Drawable getBackground(int r5, int r6) {
        /*
        r0 = new android.graphics.drawable.StateListDrawable;
        r0.<init>();
        r1 = com.leanplum.utils.SizeUtil.dp10;
        r2 = 8;
        r2 = new float[r2];
        r1 = (float) r1;
        r3 = 0;
        r2[r3] = r1;
        r3 = 1;
        r2[r3] = r1;
        r3 = 2;
        r2[r3] = r1;
        r4 = 3;
        r2[r4] = r1;
        r4 = 4;
        r2[r4] = r1;
        r4 = 5;
        r2[r4] = r1;
        r4 = 6;
        r2[r4] = r1;
        r4 = 7;
        r2[r4] = r1;
        r1 = new android.graphics.drawable.shapes.RoundRectShape;
        r4 = 0;
        r1.<init>(r2, r4, r4);
        r2 = new android.graphics.drawable.ShapeDrawable;
        r2.<init>();
        r2.setShape(r1);
        r4 = r2.getPaint();
        r4.setColor(r6);
        r6 = new int[r3];
        r6 = {16842919, 16842908};
        r0.addState(r6, r2);
        r6 = new int[r3];
        r6 = {-16842919, 16842908};
        r0.addState(r6, r2);
        r6 = new int[r3];
        r6 = {16842919, -16842908};
        r0.addState(r6, r2);
        r6 = new android.graphics.drawable.ShapeDrawable;
        r6.<init>();
        r6.setShape(r1);
        r1 = r6.getPaint();
        r1.setColor(r5);
        r5 = new int[r3];
        r5 = {-16842919, -16842908};
        r0.addState(r5, r6);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.utils.BitmapUtil.getBackground(int, int):android.graphics.drawable.Drawable");
    }

    private static int calculateInSampleSize(Options options, int i, int i2) {
        int i3 = options.outHeight;
        options = options.outWidth;
        int i4 = 1;
        if (i3 > i2 || options > i) {
            i3 /= 2;
            options /= 2;
            while (i3 / i4 >= i2 && options / i4 >= i) {
                i4 <<= 1;
            }
        }
        return i4;
    }

    private static Bitmap getBitmapFromUrl(String str, int i, int i2) {
        InputStream openStream;
        try {
            Options options;
            InputStream openStream2;
            openStream = new URL(str).openStream();
            try {
                options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(openStream, null, options);
                closeStream(openStream);
                openStream2 = new URL(str).openStream();
            } catch (IOException e) {
                i = e;
                try {
                    i2 = new Object[2];
                    i2[0] = String.format("IOException in image download for URL: %s.", new Object[]{str});
                    i2[1] = i;
                    ao.a(i2);
                    closeStream(openStream);
                    return null;
                } catch (Throwable th) {
                    str = th;
                    closeStream(openStream);
                    throw str;
                }
            }
            try {
                options.inSampleSize = calculateInSampleSize(options, i, i2);
                options.inJustDecodeBounds = false;
                i = BitmapFactory.decodeStream(openStream2, null, options);
                closeStream(openStream2);
                return i;
            } catch (IOException e2) {
                i = e2;
                openStream = openStream2;
                i2 = new Object[2];
                i2[0] = String.format("IOException in image download for URL: %s.", new Object[]{str});
                i2[1] = i;
                ao.a(i2);
                closeStream(openStream);
                return null;
            } catch (Throwable th2) {
                str = th2;
                openStream = openStream2;
                closeStream(openStream);
                throw str;
            }
        } catch (IOException e3) {
            i = e3;
            openStream = null;
            i2 = new Object[2];
            i2[0] = String.format("IOException in image download for URL: %s.", new Object[]{str});
            i2[1] = i;
            ao.a(i2);
            closeStream(openStream);
            return null;
        } catch (Throwable th3) {
            str = th3;
            openStream = null;
            closeStream(openStream);
            throw str;
        }
    }

    public static Bitmap getScaledBitmap(Context context, String str) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        context = Math.round((displayMetrics.density * 192.0f) + 0.5f);
        int min = Math.min(context * 2, displayMetrics.widthPixels);
        Bitmap bitmapFromUrl = getBitmapFromUrl(str, min, context);
        try {
            return Bitmap.createScaledBitmap(bitmapFromUrl, min, context, true);
        } catch (Exception e) {
            Object[] objArr = new Object[2];
            StringBuilder stringBuilder = new StringBuilder("Failed on scale image ");
            stringBuilder.append(str);
            stringBuilder.append(" to (");
            stringBuilder.append(min);
            stringBuilder.append(", ");
            stringBuilder.append(context);
            stringBuilder.append(")");
            objArr[0] = stringBuilder.toString();
            objArr[1] = e;
            ao.a(objArr);
            return bitmapFromUrl;
        }
    }

    private static void closeStream(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (InputStream inputStream2) {
                ao.a(new Object[]{"IOException during closing of image download stream.", inputStream2});
            }
        }
    }
}
