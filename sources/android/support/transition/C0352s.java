package android.support.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;
import android.support.annotation.RequiresApi;

@RequiresApi(14)
/* renamed from: android.support.transition.s */
class C0352s implements TypeEvaluator<Rect> {
    /* renamed from: a */
    private Rect f1188a;

    public /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        return m1292a(f, (Rect) obj, (Rect) obj2);
    }

    C0352s() {
    }

    /* renamed from: a */
    public Rect m1292a(float f, Rect rect, Rect rect2) {
        int i = rect.left + ((int) (((float) (rect2.left - rect.left)) * f));
        int i2 = rect.top + ((int) (((float) (rect2.top - rect.top)) * f));
        int i3 = rect.right + ((int) (((float) (rect2.right - rect.right)) * f));
        int i4 = rect.bottom + ((int) (((float) (rect2.bottom - rect.bottom)) * f));
        if (this.f1188a == null) {
            return new Rect(i, i2, i3, i4);
        }
        this.f1188a.set(i, i2, i3, i4);
        return this.f1188a;
    }
}
