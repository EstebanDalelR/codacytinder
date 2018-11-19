package com.google.android.m4b.maps.ca;

import android.content.res.Resources;
import com.google.android.m4b.maps.C4513R;
import com.google.android.m4b.maps.bh.C4784a;

/* renamed from: com.google.android.m4b.maps.ca.l */
public final class C5058l {
    /* renamed from: a */
    private C7490k[] f18759a = new C7490k[31];

    public C5058l(Resources resources, C5052d c5052d) {
        C4784a.m21186a();
        C5052d c5052d2 = c5052d;
        Resources resources2 = resources;
        m22652a(c5052d2, resources2, 0, C4513R.drawable.maps_dav_one_way_16_256, true, false, true, false);
        m22652a(c5052d2, resources2, 25, C4513R.drawable.maps_dav_road_8_128, true, false, false, true);
        m22652a(c5052d2, resources2, 26, C4513R.drawable.maps_dav_road_10_128, true, false, false, true);
        m22652a(c5052d2, resources2, 27, C4513R.drawable.maps_dav_road_12_128, true, false, false, true);
        m22652a(c5052d2, resources2, 28, C4513R.drawable.maps_dav_road_14_128, true, false, false, true);
        m22652a(c5052d2, resources2, 29, C4513R.drawable.maps_dav_road_22_128, true, false, false, true);
        m22652a(c5052d2, resources2, 30, C4513R.drawable.maps_dav_dashed_highlight_16_256, true, false, true, false);
        m22652a(c5052d2, resources2, 1, C4513R.drawable.maps_dav_road_32_128, true, false, false, true);
        m22652a(c5052d2, resources2, 2, C4513R.drawable.maps_dav_road_40_128, true, false, false, true);
        m22652a(c5052d2, resources2, 3, C4513R.drawable.maps_dav_road_48_128, true, false, false, true);
        m22652a(c5052d2, resources2, 4, C4513R.drawable.maps_dav_road_56_128, true, false, false, true);
        m22652a(c5052d2, resources2, 5, C4513R.drawable.maps_dav_road_32_64, true, false, false, true);
        m22652a(c5052d2, resources2, 6, C4513R.drawable.maps_dav_road_44_64, true, false, false, true);
        m22652a(c5052d2, resources2, 22, C4513R.drawable.maps_dav_road_48_64, true, false, false, true);
        m22652a(c5052d2, resources2, 7, C4513R.drawable.maps_dav_road_hybrid_6_32_low_zoom, true, false, false, true);
        m22652a(c5052d2, resources2, 21, C4513R.drawable.maps_dav_road_hybrid_6_32_high_zoom, true, false, false, true);
        m22652a(c5052d2, resources2, 8, C4513R.drawable.maps_dav_route_line, false, false, false, false);
        m22652a(c5052d2, resources2, 9, C4513R.drawable.maps_dav_route_line_bright, false, false, false, false);
        m22652a(c5052d2, resources2, 10, C4513R.drawable.maps_dav_traffic_bg, false, false, true, true);
        m22652a(c5052d2, resources2, 20, C4513R.drawable.maps_dav_background_grid, false, true, true, true);
        m22652a(c5052d2, resources2, 23, C4513R.drawable.maps_dav_drop_shadow_gradient, false, false, false, false);
        m22652a(c5052d2, resources2, 24, C4513R.drawable.maps_dav_colored_polyline, false, false, false, false);
        m22652a(c5052d2, resources2, 11, C4513R.drawable.maps_dav_traffic_fill, false, false, true, true);
        C4784a.m21187b();
    }

    /* renamed from: a */
    public final void m22654a() {
        for (C7490k c7490k : this.f18759a) {
            if (c7490k != null) {
                c7490k.m32557f();
            }
        }
        this.f18759a = null;
    }

    /* renamed from: a */
    public final C7490k m22653a(int i) {
        return this.f18759a[i];
    }

    /* renamed from: a */
    private void m22652a(C5052d c5052d, Resources resources, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        C7490k c7490k = new C7490k(c5052d);
        c7490k.m32545a(z2);
        c7490k.m32549b(z3);
        c7490k.m32552c(true);
        if (z) {
            if (z4) {
                c7490k.m32554d(resources, i2);
            } else {
                c7490k.m32551c(resources, i2);
            }
        } else if (z4) {
            c7490k.m32547b(resources, i2);
        } else {
            c7490k.m32541a(resources, i2);
        }
        this.f18759a[i] = c7490k;
    }
}
