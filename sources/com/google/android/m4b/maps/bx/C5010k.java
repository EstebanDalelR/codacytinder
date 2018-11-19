package com.google.android.m4b.maps.bx;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bz.C6570b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.bx.k */
public final class C5010k {
    /* renamed from: a */
    private final List<C5011l> f18498a = new ArrayList();
    /* renamed from: b */
    private int f18499b = -1;
    /* renamed from: c */
    private float[] f18500c;
    /* renamed from: d */
    private boolean f18501d = true;

    /* renamed from: a */
    public final void m22391a(boolean z) {
        this.f18501d = z;
    }

    /* renamed from: a */
    public final boolean m22392a(float f, float f2, af afVar, C6570b c6570b, List<C7478d> list) {
        float f3 = f;
        float f4 = f2;
        int g = (int) (c6570b.m29251g() * 30.0f);
        g *= g;
        if (!(this.f18501d || r0.f18500c == null)) {
            float f5 = r0.f18500c[0] - f3;
            float f6 = r0.f18500c[1] - f4;
            if (((int) ((f5 * f5) + (f6 * f6))) <= g) {
                for (C5011l a : r0.f18498a) {
                    a.m22394a(f3, f4, afVar, c6570b);
                }
                r0.f18499b = m22390a();
                if (r0.f18499b != -1) {
                    return false;
                }
                C5011l c5011l = (C5011l) r0.f18498a.get(r0.f18499b);
                c5011l.m22395a(true);
                return c5011l.m22397c();
            }
        }
        af afVar2 = afVar;
        C6570b c6570b2 = c6570b;
        r0.f18501d = false;
        r0.f18498a.clear();
        if (r0.f18500c == null) {
            r0.f18500c = new float[2];
        }
        r0.f18500c[0] = f3;
        r0.f18500c[1] = f4;
        g = (int) (c6570b.m29251g() * 30.0f);
        int i = g * g;
        for (C7478d a2 : list) {
            a2.mo7563a(r0.f18498a, f3, f4, afVar2, c6570b2, i);
        }
        r0.f18499b = m22390a();
        if (r0.f18499b != -1) {
            return false;
        }
        C5011l c5011l2 = (C5011l) r0.f18498a.get(r0.f18499b);
        c5011l2.m22395a(true);
        return c5011l2.m22397c();
    }

    /* renamed from: a */
    private int m22390a() {
        while (this.f18498a.size() != 0) {
            if (this.f18498a.size() == 1) {
                return 0;
            }
            int i = -1;
            int i2 = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            for (int i3 = 0; i3 < this.f18498a.size(); i3++) {
                C5011l c5011l = (C5011l) this.f18498a.get(i3);
                if (!c5011l.m22396b() && c5011l.m22393a() < r5) {
                    i2 = c5011l.m22393a();
                    i = i3;
                }
            }
            if (i != -1) {
                return i;
            }
            for (C5011l a : this.f18498a) {
                a.m22395a(false);
            }
            if (this.f18499b != -1) {
                ((C5011l) this.f18498a.get(this.f18499b)).m22395a(true);
            }
        }
        return -1;
    }
}
