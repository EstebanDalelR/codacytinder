package com.google.android.m4b.maps.bc;

import android.graphics.Point;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.bp;
import com.google.android.m4b.maps.bo.bq;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.cg.bj.C5149a;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.LatLngBounds;
import com.google.android.m4b.maps.model.VisibleRegion;
import com.google.android.m4b.maps.p125y.C5569h;

/* renamed from: com.google.android.m4b.maps.bc.p */
public final class C6442p implements C5149a {
    /* renamed from: a */
    private final C6570b f23917a;
    /* renamed from: b */
    private final int f23918b;
    /* renamed from: c */
    private final int f23919c;
    /* renamed from: d */
    private final int f23920d;
    /* renamed from: e */
    private final int f23921e;

    public C6442p(C6570b c6570b, int i, int i2, int i3, int i4) {
        this.f23917a = c6570b;
        this.f23918b = i;
        this.f23919c = i2;
        this.f23920d = i3;
        this.f23921e = i4;
    }

    /* renamed from: a */
    public final LatLng mo4987a(Point point) {
        af d = this.f23917a.m29247d((float) point.x, (float) point.y);
        if (d == null) {
            return null;
        }
        return C4754b.m21097a(d);
    }

    /* renamed from: a */
    public final Point mo4986a(LatLng latLng) {
        latLng = this.f23917a.m29243b(C4754b.m21100b(latLng));
        return new Point(latLng[0], latLng[1]);
    }

    /* renamed from: a */
    public final VisibleRegion mo4988a() {
        bp a = this.f23917a.m29234a(this.f23918b, this.f23919c, this.f23920d, this.f23921e);
        LatLng a2 = C4754b.m21097a(a.m28664d());
        LatLng a3 = C4754b.m21097a(a.m28665e());
        LatLng a4 = C4754b.m21097a(a.m28667g());
        LatLng a5 = C4754b.m21097a(a.m28666f());
        bq a6 = a.mo5129a();
        return new VisibleRegion(a2, a3, a4, a5, new LatLngBounds(C4754b.m21097a(a6.m28680f()), C4754b.m21097a(a6.m28681g())));
    }

    public final String toString() {
        return C5569h.m24283a(this).m24281a("camera", this.f23917a).toString();
    }
}
