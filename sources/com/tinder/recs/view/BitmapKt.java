package com.tinder.recs.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.Xfermode;
import android.renderscript.Allocation;
import android.renderscript.Allocation.MipmapControl;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.RenderScript.RSMessageHandler;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.annotation.ColorInt;
import android.support.annotation.IntRange;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0002\u001a(\u0010\u000b\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\u00012\b\b\u0001\u0010\n\u001a\u00020\u0001\u001a\u001e\u0010\u000e\u001a\u0004\u0018\u00010\f*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0003\u0010\u0011\u001a\u00020\u0001\u001a$\u0010\u000e\u001a\u0004\u0018\u00010\f*\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u0016\u001a\f\u0010\u0017\u001a\u0004\u0018\u00010\f*\u00020\f\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"BLUR_RADIUS", "", "BLUR_SAMPLING", "DEFAULT_GOLD_FILTER_INTENSITY", "", "createGradient", "Landroid/graphics/Shader;", "width", "height", "startColor", "endColor", "applyGradientFilter", "Landroid/graphics/Bitmap;", "intensity", "blur", "context", "Landroid/content/Context;", "radius", "paint", "Landroid/graphics/Paint;", "renderscript", "Landroid/renderscript/RenderScript;", "Landroid/renderscript/ScriptIntrinsicBlur;", "flipHorizontally", "recs-cards_release"}, k = 2, mv = {1, 1, 10})
public final class BitmapKt {
    private static final int BLUR_RADIUS = 25;
    private static final int BLUR_SAMPLING = 2;
    private static final float DEFAULT_GOLD_FILTER_INTENSITY = 127.5f;

    @Nullable
    public static /* synthetic */ Bitmap blur$default(Bitmap bitmap, Context context, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 25;
        }
        return blur(bitmap, context, i);
    }

    @Nullable
    public static final Bitmap blur(@NotNull Bitmap bitmap, @NotNull Context context, @IntRange(from = 0, to = 25) int i) {
        C2668g.b(bitmap, "$receiver");
        C2668g.b(context, "context");
        context = RenderScript.create(context);
        C2668g.a(context, "renderscript");
        context.setMessageHandler(new RSMessageHandler());
        ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(context, Element.U8_4(context));
        Paint paint = new Paint(2);
        create.setRadius((float) i);
        C2668g.a(create, "blur");
        bitmap = blur(bitmap, paint, context, create);
        context.destroy();
        create.destroy();
        return bitmap;
    }

    @Nullable
    public static final Bitmap blur(@NotNull Bitmap bitmap, @NotNull Paint paint, @NotNull RenderScript renderScript, @NotNull ScriptIntrinsicBlur scriptIntrinsicBlur) {
        C2668g.b(bitmap, "$receiver");
        C2668g.b(paint, "paint");
        C2668g.b(renderScript, "renderscript");
        C2668g.b(scriptIntrinsicBlur, "blur");
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth() / 2, bitmap.getHeight() / 2, Config.ARGB_8888);
            C2668g.a(createBitmap, "Bitmap.createBitmap(scal… Bitmap.Config.ARGB_8888)");
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(0.5f, 0.5f);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            bitmap = Allocation.createFromBitmap(renderScript, createBitmap, MipmapControl.MIPMAP_NONE, 1);
            C2668g.a(bitmap, "input");
            paint = Allocation.createTyped(renderScript, bitmap.getType());
            scriptIntrinsicBlur.setInput(bitmap);
            scriptIntrinsicBlur.forEach(paint);
            paint.copyTo(createBitmap);
            bitmap.destroy();
            paint.destroy();
            return createBitmap;
        } catch (Bitmap bitmap2) {
            C0001a.c((Throwable) bitmap2, "Cannot blur image: %s", new Object[]{bitmap2.getMessage()});
            return null;
        } catch (Bitmap bitmap22) {
            C0001a.c((Throwable) bitmap22, "Out of memory!! Cannot blur image: %s", new Object[]{bitmap22.getMessage()});
            return null;
        }
    }

    @Nullable
    public static final Bitmap flipHorizontally(@NotNull Bitmap bitmap) {
        C2668g.b(bitmap, "$receiver");
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        try {
            bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
            C2668g.a(bitmap, "dst");
            bitmap.setDensity(160);
            return bitmap;
        } catch (Bitmap bitmap2) {
            C0001a.c((Throwable) bitmap2, "Cannot flip image: %s", new Object[]{bitmap2.getMessage()});
            return null;
        } catch (Bitmap bitmap22) {
            C0001a.c((Throwable) bitmap22, "Out of memory!! Cannot flip image: %s", new Object[]{bitmap22.getMessage()});
            return null;
        }
    }

    @NotNull
    public static /* synthetic */ Bitmap applyGradientFilter$default(Bitmap bitmap, float f, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            f = DEFAULT_GOLD_FILTER_INTENSITY;
        }
        return applyGradientFilter(bitmap, f, i, i2);
    }

    @NotNull
    public static final Bitmap applyGradientFilter(@NotNull Bitmap bitmap, float f, @ColorInt int i, @ColorInt int i2) {
        C2668g.b(bitmap, "$receiver");
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, null);
        Paint paint = new Paint();
        paint.setShader(createGradient(bitmap.getWidth(), bitmap.getHeight(), i, i2));
        paint.setAlpha((int) f);
        paint.setXfermode((Xfermode) new PorterDuffXfermode(Mode.OVERLAY));
        canvas.drawRect(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight(), paint);
        C2668g.a(createBitmap, "updatedBitmap");
        return createBitmap;
    }

    private static final Shader createGradient(int i, int i2, int i3, int i4) {
        return new LinearGradient(0.0f, 0.0f, (float) i, (float) i2, i3, i4, TileMode.CLAMP);
    }
}
