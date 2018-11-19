package android.support.design.widget;

import android.support.v4.view.p011a.C2889a;
import android.support.v4.view.p011a.C2890b;
import android.support.v4.view.p011a.C2891c;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: android.support.design.widget.a */
class C0226a {
    /* renamed from: a */
    static final Interpolator f780a = new LinearInterpolator();
    /* renamed from: b */
    static final Interpolator f781b = new C2890b();
    /* renamed from: c */
    static final Interpolator f782c = new C2889a();
    /* renamed from: d */
    static final Interpolator f783d = new C2891c();
    /* renamed from: e */
    static final Interpolator f784e = new DecelerateInterpolator();

    /* renamed from: a */
    static float m801a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: a */
    static int m802a(int i, int i2, float f) {
        return i + Math.round(f * ((float) (i2 - i)));
    }
}
