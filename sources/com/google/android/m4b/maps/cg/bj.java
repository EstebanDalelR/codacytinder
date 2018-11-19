package com.google.android.m4b.maps.cg;

import android.graphics.Point;
import com.google.android.m4b.maps.cg.cb.C5164a;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.VisibleRegion;
import com.google.android.m4b.maps.p114n.C5484b;
import com.google.android.m4b.maps.p114n.C7701d;
import com.google.android.m4b.maps.p124x.af.C6793a;

public final class bj extends C6793a {
    /* renamed from: a */
    private final cb f27971a;
    /* renamed from: b */
    private final C5149a f27972b;

    /* renamed from: com.google.android.m4b.maps.cg.bj$a */
    public interface C5149a {
        /* renamed from: a */
        Point mo4986a(LatLng latLng);

        /* renamed from: a */
        LatLng mo4987a(Point point);

        /* renamed from: a */
        VisibleRegion mo4988a();
    }

    public bj(cb cbVar, C5149a c5149a) {
        this.f27972b = c5149a;
        this.f27971a = cbVar;
    }

    /* renamed from: a */
    public final LatLng mo5692a(C5484b c5484b) {
        this.f27971a.mo5310b(C5164a.PROJECTION_FROM_SCREEN_LOCATION);
        return this.f27972b.mo4987a((Point) C7701d.m33408a(c5484b));
    }

    /* renamed from: a */
    public final C5484b mo5694a(LatLng latLng) {
        this.f27971a.mo5310b(C5164a.PROJECTION_TO_SCREEN_LOCATION);
        return C7701d.m33407a(this.f27972b.mo4986a(latLng));
    }

    /* renamed from: a */
    public final VisibleRegion mo5693a() {
        this.f27971a.mo5310b(C5164a.PROJECTION_GET_FRUSTUM);
        return this.f27972b.mo4988a();
    }

    public final String toString() {
        return this.f27972b.toString();
    }
}
