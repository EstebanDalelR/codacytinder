package com.google.android.m4b.maps.bz;

import android.content.res.Resources;
import com.google.android.m4b.maps.bo.af;

/* renamed from: com.google.android.m4b.maps.bz.e */
public final class C5046e {
    /* renamed from: a */
    private volatile float f18655a = 75.0f;
    /* renamed from: b */
    private final float f18656b;
    /* renamed from: c */
    private final Resources f18657c;
    /* renamed from: d */
    private C5045a f18658d;

    /* renamed from: com.google.android.m4b.maps.bz.e$a */
    public interface C5045a {
        /* renamed from: a */
        float mo5209a(af afVar);

        /* renamed from: d */
        float mo5214d();
    }

    public C5046e(Resources resources) {
        this.f18656b = resources != null ? (float) resources.getDisplayMetrics().densityDpi : 1.0f;
        this.f18657c = resources;
    }

    /* renamed from: a */
    public final void m22574a(C5045a c5045a) {
        this.f18658d = c5045a;
    }

    /* renamed from: a */
    public final C5045a m22572a() {
        return this.f18658d;
    }

    /* renamed from: a */
    public final void m22573a(float f) {
        this.f18655a = f;
    }

    /* renamed from: a */
    public final C6571c m22571a(C6571c c6571c) {
        float max;
        float f = 21.0f;
        if (this.f18658d != null) {
            f = Math.min(21.0f, this.f18658d.mo5209a(c6571c.m29272c()));
            max = Math.max(2.0f, this.f18658d.mo5214d());
        } else {
            max = 2.0f;
        }
        float max2 = Math.max(Math.min(c6571c.m29269a(), f), max);
        max = this.f18655a;
        f = c6571c.m29269a();
        float f2 = 30.0f;
        if (f >= 16.0f) {
            f2 = 75.0f;
        } else if (f > 14.0f) {
            f2 = (((f - 14.0f) * 30.0f) / 2.0f) + 45.0f;
        } else if (f > 10.0f) {
            f2 = 30.0f + (((f - 10.0f) * 15.0f) / 4.0f);
        }
        float max3 = Math.max(Math.min(c6571c.m29273d(), Math.min(max, f2)), 0.0f);
        af c = c6571c.m29272c();
        if (this.f18657c != null) {
            c.m21479a(c, max2, ((float) this.f18657c.getDisplayMetrics().heightPixels) / this.f18657c.getDisplayMetrics().density);
        } else {
            c.m21495h(c);
        }
        return new C6571c(c, max2, max3, c6571c.m29274e(), c6571c.m29275f());
    }
}
