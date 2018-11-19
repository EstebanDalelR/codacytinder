package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.p111k.C5468c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class PolylineOptions implements C5468c {
    public static final PolylineOptionsCreator CREATOR = new PolylineOptionsCreator();
    /* renamed from: a */
    private final int f25186a;
    /* renamed from: b */
    private final List<LatLng> f25187b;
    /* renamed from: c */
    private float f25188c;
    /* renamed from: d */
    private int f25189d;
    /* renamed from: e */
    private float f25190e;
    /* renamed from: f */
    private boolean f25191f;
    /* renamed from: g */
    private boolean f25192g;

    public final int describeContents() {
        return 0;
    }

    public PolylineOptions() {
        this.f25188c = 10.0f;
        this.f25189d = -16777216;
        this.f25190e = 0.0f;
        this.f25191f = true;
        this.f25192g = false;
        this.f25186a = 1;
        this.f25187b = new ArrayList();
    }

    PolylineOptions(int i, List list, float f, int i2, float f2, boolean z, boolean z2) {
        this.f25188c = 10.0f;
        this.f25189d = -16777216;
        this.f25190e = 0.0f;
        this.f25191f = true;
        this.f25192g = false;
        this.f25186a = i;
        this.f25187b = list;
        this.f25188c = f;
        this.f25189d = i2;
        this.f25190e = f2;
        this.f25191f = z;
        this.f25192g = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        PolylineOptionsCreator.m23891a(this, parcel);
    }

    /* renamed from: a */
    final int m30007a() {
        return this.f25186a;
    }

    public final PolylineOptions add(LatLng latLng) {
        this.f25187b.add(latLng);
        return this;
    }

    public final PolylineOptions add(LatLng... latLngArr) {
        this.f25187b.addAll(Arrays.asList(latLngArr));
        return this;
    }

    public final PolylineOptions addAll(Iterable<LatLng> iterable) {
        for (LatLng add : iterable) {
            this.f25187b.add(add);
        }
        return this;
    }

    public final PolylineOptions width(float f) {
        this.f25188c = f;
        return this;
    }

    public final PolylineOptions color(int i) {
        this.f25189d = i;
        return this;
    }

    public final PolylineOptions zIndex(float f) {
        this.f25190e = f;
        return this;
    }

    public final PolylineOptions visible(boolean z) {
        this.f25191f = z;
        return this;
    }

    public final PolylineOptions geodesic(boolean z) {
        this.f25192g = z;
        return this;
    }

    public final List<LatLng> getPoints() {
        return this.f25187b;
    }

    public final float getWidth() {
        return this.f25188c;
    }

    public final int getColor() {
        return this.f25189d;
    }

    public final float getZIndex() {
        return this.f25190e;
    }

    public final boolean isVisible() {
        return this.f25191f;
    }

    public final boolean isGeodesic() {
        return this.f25192g;
    }
}
