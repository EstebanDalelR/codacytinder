package android.support.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.util.Property;

/* renamed from: android.support.transition.h */
class C0344h {
    /* renamed from: a */
    private static final C0345k f1180a;

    static {
        if (VERSION.SDK_INT >= 21) {
            f1180a = new C2807j();
        } else {
            f1180a = new C2806i();
        }
    }

    /* renamed from: a */
    static <T> ObjectAnimator m1285a(T t, Property<T, PointF> property, Path path) {
        return f1180a.mo356a(t, property, path);
    }
}
