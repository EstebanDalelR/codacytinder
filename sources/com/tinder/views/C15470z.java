package com.tinder.views;

import android.graphics.Path;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\u001aV\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n¨\u0006\u000e"}, d2 = {"RoundedRect", "Landroid/graphics/Path;", "left", "", "top", "right", "bottom", "rx", "ry", "tl", "", "tr", "br", "bl", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.views.z */
public final class C15470z {
    @NotNull
    /* renamed from: a */
    public static final Path m57957a(float f, float f2, float f3, float f4, float f5, float f6, boolean z, boolean z2, boolean z3, boolean z4) {
        Path path = new Path();
        float f7 = (float) 0;
        if (f5 < f7) {
            f5 = 0.0f;
        }
        if (f6 < f7) {
            f6 = 0.0f;
        }
        f = f3 - f;
        f4 -= f2;
        f7 = (float) 2;
        float f8 = f / f7;
        if (f5 > f8) {
            f5 = f8;
        }
        f8 = f4 / f7;
        if (f6 > f8) {
            f6 = f8;
        }
        f -= f7 * f5;
        f4 -= f7 * f6;
        path.moveTo(f3, f2 + f6);
        if (z2) {
            f2 = -f6;
            path.rQuadTo(0.0f, f2, -f5, f2);
        } else {
            path.rLineTo(0.0f, -f6);
            path.rLineTo(-f5, 0.0f);
        }
        path.rLineTo(-f, 0.0f);
        if (z) {
            f2 = -f5;
            path.rQuadTo(f2, 0.0f, f2, f6);
        } else {
            path.rLineTo(-f5, 0.0f);
            path.rLineTo(0.0f, f6);
        }
        path.rLineTo(0.0f, f4);
        if (z4) {
            path.rQuadTo(0.0f, f6, f5, f6);
        } else {
            path.rLineTo(0.0f, f6);
            path.rLineTo(f5, 0.0f);
        }
        path.rLineTo(f, 0.0f);
        if (z3) {
            path.rQuadTo(f5, 0.0f, f5, -f6);
        } else {
            path.rLineTo(f5, 0.0f);
            path.rLineTo(0.0f, -f6);
        }
        path.rLineTo(0.0f, -f4);
        path.close();
        return path;
    }
}
