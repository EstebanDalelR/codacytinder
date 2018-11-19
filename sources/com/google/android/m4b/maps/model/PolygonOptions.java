package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.p111k.C5468c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class PolygonOptions implements C5468c {
    public static final PolygonOptionsCreator CREATOR = new PolygonOptionsCreator();
    /* renamed from: a */
    private final int f25177a;
    /* renamed from: b */
    private final List<LatLng> f25178b;
    /* renamed from: c */
    private final List<List<LatLng>> f25179c;
    /* renamed from: d */
    private float f25180d;
    /* renamed from: e */
    private int f25181e;
    /* renamed from: f */
    private int f25182f;
    /* renamed from: g */
    private float f25183g;
    /* renamed from: h */
    private boolean f25184h;
    /* renamed from: i */
    private boolean f25185i;

    public final int describeContents() {
        return 0;
    }

    public PolygonOptions() {
        this.f25180d = 10.0f;
        this.f25181e = -16777216;
        this.f25182f = 0;
        this.f25183g = 0.0f;
        this.f25184h = true;
        this.f25185i = false;
        this.f25177a = 1;
        this.f25178b = new ArrayList();
        this.f25179c = new ArrayList();
    }

    PolygonOptions(int i, List<LatLng> list, List list2, float f, int i2, int i3, float f2, boolean z, boolean z2) {
        this.f25180d = 10.0f;
        this.f25181e = -16777216;
        this.f25182f = 0;
        this.f25183g = 0.0f;
        this.f25184h = true;
        this.f25185i = false;
        this.f25177a = i;
        this.f25178b = list;
        this.f25179c = list2;
        this.f25180d = f;
        this.f25181e = i2;
        this.f25182f = i3;
        this.f25183g = f2;
        this.f25184h = z;
        this.f25185i = z2;
    }

    /* renamed from: a */
    final int m30005a() {
        return this.f25177a;
    }

    /* renamed from: b */
    final List m30006b() {
        return this.f25179c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        PolygonOptionsCreator.m23888a(this, parcel);
    }

    public final PolygonOptions add(LatLng latLng) {
        this.f25178b.add(latLng);
        return this;
    }

    public final PolygonOptions add(LatLng... latLngArr) {
        this.f25178b.addAll(Arrays.asList(latLngArr));
        return this;
    }

    public final PolygonOptions addAll(Iterable<LatLng> iterable) {
        for (LatLng add : iterable) {
            this.f25178b.add(add);
        }
        return this;
    }

    public final PolygonOptions addHole(Iterable<LatLng> iterable) {
        ArrayList arrayList = new ArrayList();
        for (LatLng add : iterable) {
            arrayList.add(add);
        }
        this.f25179c.add(arrayList);
        return this;
    }

    public final PolygonOptions strokeWidth(float f) {
        this.f25180d = f;
        return this;
    }

    public final PolygonOptions strokeColor(int i) {
        this.f25181e = i;
        return this;
    }

    public final PolygonOptions fillColor(int i) {
        this.f25182f = i;
        return this;
    }

    public final PolygonOptions zIndex(float f) {
        this.f25183g = f;
        return this;
    }

    public final PolygonOptions visible(boolean z) {
        this.f25184h = z;
        return this;
    }

    public final PolygonOptions geodesic(boolean z) {
        this.f25185i = z;
        return this;
    }

    public final List<LatLng> getPoints() {
        return this.f25178b;
    }

    public final List<List<LatLng>> getHoles() {
        return this.f25179c;
    }

    public final float getStrokeWidth() {
        return this.f25180d;
    }

    public final int getStrokeColor() {
        return this.f25181e;
    }

    public final int getFillColor() {
        return this.f25182f;
    }

    public final float getZIndex() {
        return this.f25183g;
    }

    public final boolean isVisible() {
        return this.f25184h;
    }

    public final boolean isGeodesic() {
        return this.f25185i;
    }
}
