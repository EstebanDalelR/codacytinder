package com.google.android.m4b.maps;

import android.os.Parcel;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.StreetViewPanoramaCamera;
import com.google.android.m4b.maps.p111k.C5468c;
import com.google.android.m4b.maps.p124x.C5534a;

public final class StreetViewPanoramaOptions implements C5468c {
    public static final StreetViewPanoramaOptionsCreator CREATOR = new StreetViewPanoramaOptionsCreator();
    /* renamed from: a */
    private final int f23599a;
    /* renamed from: b */
    private StreetViewPanoramaCamera f23600b;
    /* renamed from: c */
    private String f23601c;
    /* renamed from: d */
    private LatLng f23602d;
    /* renamed from: e */
    private Integer f23603e;
    /* renamed from: f */
    private Boolean f23604f;
    /* renamed from: g */
    private Boolean f23605g;
    /* renamed from: h */
    private Boolean f23606h;
    /* renamed from: i */
    private Boolean f23607i;
    /* renamed from: j */
    private Boolean f23608j;

    public final int describeContents() {
        return 0;
    }

    StreetViewPanoramaOptions(int i, StreetViewPanoramaCamera streetViewPanoramaCamera, String str, LatLng latLng, Integer num, byte b, byte b2, byte b3, byte b4, byte b5) {
        this.f23604f = Boolean.valueOf(true);
        this.f23605g = Boolean.valueOf(true);
        this.f23606h = Boolean.valueOf(true);
        this.f23607i = Boolean.valueOf(true);
        this.f23599a = i;
        this.f23600b = streetViewPanoramaCamera;
        this.f23602d = latLng;
        this.f23603e = num;
        this.f23601c = str;
        this.f23604f = C5534a.m24048a(b);
        this.f23605g = C5534a.m24048a(b2);
        this.f23606h = C5534a.m24048a(b3);
        this.f23607i = C5534a.m24048a(b4);
        this.f23608j = C5534a.m24048a(b5);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        StreetViewPanoramaOptionsCreator.m20406a(this, parcel, i);
    }

    /* renamed from: a */
    final int m27653a() {
        return this.f23599a;
    }

    /* renamed from: b */
    final byte m27654b() {
        return C5534a.m24047a(this.f23604f);
    }

    /* renamed from: c */
    final byte m27655c() {
        return C5534a.m24047a(this.f23605g);
    }

    /* renamed from: d */
    final byte m27656d() {
        return C5534a.m24047a(this.f23606h);
    }

    /* renamed from: e */
    final byte m27657e() {
        return C5534a.m24047a(this.f23607i);
    }

    /* renamed from: f */
    final byte m27658f() {
        return C5534a.m24047a(this.f23608j);
    }

    public StreetViewPanoramaOptions() {
        this.f23604f = Boolean.valueOf(true);
        this.f23605g = Boolean.valueOf(true);
        this.f23606h = Boolean.valueOf(true);
        this.f23607i = Boolean.valueOf(true);
        this.f23599a = 1;
    }

    public final StreetViewPanoramaOptions panoramaCamera(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        this.f23600b = streetViewPanoramaCamera;
        return this;
    }

    public final StreetViewPanoramaOptions panoramaId(String str) {
        this.f23601c = str;
        return this;
    }

    public final StreetViewPanoramaOptions position(LatLng latLng) {
        this.f23602d = latLng;
        return this;
    }

    public final StreetViewPanoramaOptions position(LatLng latLng, Integer num) {
        this.f23602d = latLng;
        this.f23603e = num;
        return this;
    }

    public final StreetViewPanoramaOptions userNavigationEnabled(boolean z) {
        this.f23604f = Boolean.valueOf(z);
        return this;
    }

    public final StreetViewPanoramaOptions zoomGesturesEnabled(boolean z) {
        this.f23605g = Boolean.valueOf(z);
        return this;
    }

    public final StreetViewPanoramaOptions panningGesturesEnabled(boolean z) {
        this.f23606h = Boolean.valueOf(z);
        return this;
    }

    public final StreetViewPanoramaOptions streetNamesEnabled(boolean z) {
        this.f23607i = Boolean.valueOf(z);
        return this;
    }

    public final StreetViewPanoramaOptions useViewLifecycleInFragment(boolean z) {
        this.f23608j = Boolean.valueOf(z);
        return this;
    }

    public final StreetViewPanoramaCamera getStreetViewPanoramaCamera() {
        return this.f23600b;
    }

    public final LatLng getPosition() {
        return this.f23602d;
    }

    public final Integer getRadius() {
        return this.f23603e;
    }

    public final String getPanoramaId() {
        return this.f23601c;
    }

    public final Boolean getUserNavigationEnabled() {
        return this.f23604f;
    }

    public final Boolean getZoomGesturesEnabled() {
        return this.f23605g;
    }

    public final Boolean getPanningGesturesEnabled() {
        return this.f23606h;
    }

    public final Boolean getStreetNamesEnabled() {
        return this.f23607i;
    }

    public final Boolean getUseViewLifecycleInFragment() {
        return this.f23608j;
    }
}
