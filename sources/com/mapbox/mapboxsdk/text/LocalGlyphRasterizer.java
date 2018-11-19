package com.mapbox.mapboxsdk.text;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.annotation.WorkerThread;

public class LocalGlyphRasterizer {
    @WorkerThread
    protected static Bitmap drawGlyphBitmap(String str, boolean z, char c) {
        Bitmap createBitmap = Bitmap.createBitmap(35, 35, Config.ARGB_8888);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextSize(24.0f);
        paint.setTypeface(Typeface.create(str, z));
        str = new Canvas();
        str.setBitmap(createBitmap);
        str.drawText(String.valueOf(c), '\u0000', 20.0f, paint);
        return createBitmap;
    }
}
