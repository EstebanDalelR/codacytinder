package com.tinder.video.p447d;

import android.graphics.Bitmap;
import android.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a(\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0002¨\u0006\u000b"}, d2 = {"isCompletelyBlack", "", "bitmap", "Landroid/graphics/Bitmap;", "isPixelBlack", "pixel", "", "isPixelMatchingColor", "redValue", "greenValue", "blueValue", "video_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.video.d.a */
public final class C15413a {
    /* renamed from: a */
    public static final boolean m57793a(@NotNull Bitmap bitmap) {
        C2668g.b(bitmap, "bitmap");
        bitmap = Bitmap.createScaledBitmap(bitmap, 100, 100, false);
        C2668g.a(bitmap, "scaledBitMap");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[(width * height)];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        bitmap.recycle();
        for (int a : iArr) {
            if (!C15413a.m57791a(a)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static final boolean m57791a(int i) {
        return C15413a.m57792a(i, 0, 0, 0);
    }

    /* renamed from: a */
    private static final boolean m57792a(int i, int i2, int i3, int i4) {
        return i4 == Color.blue(i) && i2 == Color.red(i) && i3 == Color.green(i);
    }
}
