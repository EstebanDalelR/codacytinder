package android.support.transition;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.util.Property;

/* renamed from: android.support.transition.n */
class C0348n {
    /* renamed from: a */
    private static final C0349q f1187a;

    static {
        if (VERSION.SDK_INT >= 21) {
            f1187a = new C2809p();
        } else {
            f1187a = new C2808o();
        }
    }

    /* renamed from: a */
    static PropertyValuesHolder m1290a(Property<?, PointF> property, Path path) {
        return f1187a.mo357a(property, path);
    }
}
