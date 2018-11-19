package com.google.android.gms.internal;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;

@zzzv
final class aqv {
    /* renamed from: a */
    private static final aqs f15609a = aqs.m19439a();
    /* renamed from: b */
    private static final float f15610b = ((Float) aja.m19221f().m19334a(alo.aR)).floatValue();
    /* renamed from: c */
    private static final long f15611c = ((Long) aja.m19221f().m19334a(alo.aP)).longValue();
    /* renamed from: d */
    private static final float f15612d = ((Float) aja.m19221f().m19334a(alo.aS)).floatValue();
    /* renamed from: e */
    private static final long f15613e = ((Long) aja.m19221f().m19334a(alo.aQ)).longValue();

    /* renamed from: a */
    private static int m19452a(long j, int i) {
        return (int) ((j >>> ((i % 16) * 4)) & 15);
    }

    /* renamed from: a */
    static boolean m19453a() {
        int h = f15609a.m19447h();
        int i = f15609a.m19448i();
        int g = f15609a.m19446g() + f15609a.m19445f();
        int i2 = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        int a = (h >= 16 || f15613e == 0) ? f15612d != 0.0f ? ((int) (f15612d * ((float) h))) + 1 : ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : m19452a(f15613e, h);
        if (i <= a) {
            if (h < 16 && f15611c != 0) {
                i2 = m19452a(f15611c, h);
            } else if (f15610b != 0.0f) {
                i2 = (int) (f15610b * ((float) h));
            }
            if (g <= i2) {
                return true;
            }
        }
        return false;
    }
}
