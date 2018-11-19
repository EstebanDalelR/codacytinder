package android.support.v4.view.p011a;

import android.os.Build.VERSION;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: android.support.v4.view.a.f */
public final class C0581f {
    /* renamed from: a */
    public static Interpolator m2244a(float f, float f2, float f3, float f4) {
        if (VERSION.SDK_INT >= 21) {
            return new PathInterpolator(f, f2, f3, f4);
        }
        return new C0580e(f, f2, f3, f4);
    }
}
