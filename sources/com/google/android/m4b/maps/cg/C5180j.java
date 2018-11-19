package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.cg.bj.C5149a;
import com.google.android.m4b.maps.model.CameraPosition;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.LatLngBounds;
import com.google.android.m4b.maps.p124x.C5536d;
import com.google.android.m4b.maps.p124x.C5545m;

/* renamed from: com.google.android.m4b.maps.cg.j */
public interface C5180j {
    /* renamed from: a */
    public static final CameraPosition f19271a = CameraPosition.fromLatLngZoom(new LatLng(0.0d, 0.0d), 1.0f);

    /* renamed from: com.google.android.m4b.maps.cg.j$a */
    public interface C5179a {
        /* renamed from: a */
        void mo5312a(C5180j c5180j, int i, cb cbVar);
    }

    /* renamed from: a */
    float mo4909a(LatLng latLng);

    /* renamed from: a */
    CameraPosition mo4910a(LatLngBounds latLngBounds);

    /* renamed from: a */
    void mo4911a();

    /* renamed from: a */
    void mo4912a(float f, float f2, int i);

    /* renamed from: a */
    void mo4913a(float f, int i);

    /* renamed from: a */
    void mo4914a(float f, int i, int i2, int i3);

    /* renamed from: a */
    void mo4915a(int i, int i2, int i3, int i4);

    /* renamed from: a */
    void mo4917a(C5179a c5179a, int i, C5536d c5536d, cb cbVar);

    /* renamed from: a */
    void mo4918a(CameraPosition cameraPosition, int i);

    /* renamed from: a */
    void mo4919a(LatLng latLng, float f, int i);

    /* renamed from: a */
    void mo4920a(LatLng latLng, int i);

    /* renamed from: a */
    void mo4921a(LatLngBounds latLngBounds, int i, int i2);

    /* renamed from: a */
    void mo4922a(LatLngBounds latLngBounds, int i, int i2, int i3, int i4);

    /* renamed from: a */
    void mo4923a(C5545m c5545m);

    /* renamed from: b */
    void mo4925b(float f, int i);

    /* renamed from: b */
    void mo4927b(C5545m c5545m);

    /* renamed from: c */
    CameraPosition mo4928c();

    /* renamed from: c */
    void mo4929c(float f, int i);

    /* renamed from: c */
    void mo4930c(C5545m c5545m);

    /* renamed from: d */
    float mo4931d();

    /* renamed from: e */
    C5149a mo4932e();
}
