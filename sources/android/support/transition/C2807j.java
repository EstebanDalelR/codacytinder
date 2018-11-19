package android.support.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.support.annotation.RequiresApi;
import android.util.Property;

@RequiresApi(21)
/* renamed from: android.support.transition.j */
class C2807j implements C0345k {
    C2807j() {
    }

    /* renamed from: a */
    public <T> ObjectAnimator mo356a(T t, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofObject(t, property, null, path);
    }
}
