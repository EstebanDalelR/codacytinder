package android.support.transition;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.support.annotation.RequiresApi;
import android.util.Property;

@RequiresApi(21)
/* renamed from: android.support.transition.p */
class C2809p implements C0349q {
    C2809p() {
    }

    /* renamed from: a */
    public PropertyValuesHolder mo357a(Property<?, PointF> property, Path path) {
        return PropertyValuesHolder.ofObject(property, null, path);
    }
}
