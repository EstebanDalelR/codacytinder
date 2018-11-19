package androidx.p012a.p014b.p015a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0003\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a2\u0010\b\u001a\u00020\t*\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\u00042\b\b\u0003\u0010\u000b\u001a\u00020\u00042\b\b\u0003\u0010\f\u001a\u00020\u00042\b\b\u0003\u0010\r\u001a\u00020\u0004¨\u0006\u000e"}, d2 = {"toBitmap", "Landroid/graphics/Bitmap;", "Landroid/graphics/drawable/Drawable;", "width", "", "height", "config", "Landroid/graphics/Bitmap$Config;", "updateBounds", "", "left", "top", "right", "bottom", "core-ktx_release"}, k = 2, mv = {1, 1, 9})
/* renamed from: androidx.a.b.a.a */
public final class C0746a {
    @NotNull
    /* renamed from: a */
    public static /* synthetic */ Bitmap m2654a(Drawable drawable, int i, int i2, Config config, int i3, Object obj) {
        if ((i3 & 1) != null) {
            i = drawable.getIntrinsicWidth();
        }
        if ((i3 & 2) != null) {
            i2 = drawable.getIntrinsicHeight();
        }
        if ((i3 & 4) != 0) {
            config = null;
        }
        return C0746a.m2653a(drawable, i, i2, config);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @org.jetbrains.annotations.NotNull
    /* renamed from: a */
    public static final android.graphics.Bitmap m2653a(@org.jetbrains.annotations.NotNull android.graphics.drawable.Drawable r5, @android.support.annotation.Px int r6, @android.support.annotation.Px int r7, @org.jetbrains.annotations.Nullable android.graphics.Bitmap.Config r8) {
        /*
        r0 = r5 instanceof android.graphics.drawable.BitmapDrawable;
        if (r0 == 0) goto L_0x0043;
    L_0x0004:
        if (r8 == 0) goto L_0x001c;
    L_0x0006:
        r0 = r5;
        r0 = (android.graphics.drawable.BitmapDrawable) r0;
        r0 = r0.getBitmap();
        r1 = "bitmap";
        kotlin.jvm.internal.C2668g.m10305a(r0, r1);
        r0 = r0.getConfig();
        r0 = kotlin.jvm.internal.C2668g.m10308a(r0, r8);
        if (r0 == 0) goto L_0x0043;
    L_0x001c:
        r5 = (android.graphics.drawable.BitmapDrawable) r5;
        r8 = r5.getIntrinsicWidth();
        if (r6 != r8) goto L_0x0034;
    L_0x0024:
        r8 = r5.getIntrinsicHeight();
        if (r7 != r8) goto L_0x0034;
    L_0x002a:
        r5 = r5.getBitmap();
        r6 = "bitmap";
        kotlin.jvm.internal.C2668g.m10305a(r5, r6);
        return r5;
    L_0x0034:
        r5 = r5.getBitmap();
        r8 = 1;
        r5 = android.graphics.Bitmap.createScaledBitmap(r5, r6, r7, r8);
        r6 = "Bitmap.createScaledBitma…map, width, height, true)";
        kotlin.jvm.internal.C2668g.m10305a(r5, r6);
        return r5;
    L_0x0043:
        r0 = r5.getBounds();
        r1 = r0.left;
        r2 = r0.top;
        r3 = r0.right;
        r0 = r0.bottom;
        if (r8 == 0) goto L_0x0052;
    L_0x0051:
        goto L_0x0054;
    L_0x0052:
        r8 = android.graphics.Bitmap.Config.ARGB_8888;
    L_0x0054:
        r8 = android.graphics.Bitmap.createBitmap(r6, r7, r8);
        r4 = 0;
        r5.setBounds(r4, r4, r6, r7);
        r6 = new android.graphics.Canvas;
        r6.<init>(r8);
        r5.draw(r6);
        r5.setBounds(r1, r2, r3, r0);
        r5 = "bitmap";
        kotlin.jvm.internal.C2668g.m10305a(r8, r5);
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.a.b.a.a.a(android.graphics.drawable.Drawable, int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }
}
