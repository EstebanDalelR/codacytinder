package android.support.v4.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.C0593c;

/* renamed from: android.support.v4.graphics.drawable.d */
public final class C0452d {

    /* renamed from: android.support.v4.graphics.drawable.d$a */
    private static class C2843a extends C0451b {
        C2843a(Resources resources, Bitmap bitmap) {
            super(resources, bitmap);
        }

        /* renamed from: a */
        void mo459a(int i, int i2, int i3, Rect rect, Rect rect2) {
            C0593c.m2314a(i, i2, i3, rect, rect2, 0);
        }
    }

    @NonNull
    /* renamed from: a */
    public static C0451b m1740a(@NonNull Resources resources, @Nullable Bitmap bitmap) {
        if (VERSION.SDK_INT >= 21) {
            return new C2842c(resources, bitmap);
        }
        return new C2843a(resources, bitmap);
    }
}
