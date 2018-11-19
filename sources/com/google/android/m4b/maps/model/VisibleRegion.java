package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.p110j.C5461u;
import com.google.android.m4b.maps.p111k.C5468c;
import java.util.Arrays;

public final class VisibleRegion implements C5468c {
    public static final VisibleRegionCreator CREATOR = new VisibleRegionCreator();
    /* renamed from: a */
    private final int f25207a;
    public final LatLng farLeft;
    public final LatLng farRight;
    public final LatLngBounds latLngBounds;
    public final LatLng nearLeft;
    public final LatLng nearRight;

    public final int describeContents() {
        return 0;
    }

    VisibleRegion(int i, LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.f25207a = i;
        this.nearLeft = latLng;
        this.nearRight = latLng2;
        this.farLeft = latLng3;
        this.farRight = latLng4;
        this.latLngBounds = latLngBounds;
    }

    public VisibleRegion(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this(1, latLng, latLng2, latLng3, latLng4, latLngBounds);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        VisibleRegionCreator.m23915a(this, parcel, i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.nearLeft, this.nearRight, this.farLeft, this.farRight, this.latLngBounds});
    }

    /* renamed from: a */
    final int m30016a() {
        return this.f25207a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        return this.nearLeft.equals(visibleRegion.nearLeft) && this.nearRight.equals(visibleRegion.nearRight) && this.farLeft.equals(visibleRegion.farLeft) && this.farRight.equals(visibleRegion.farRight) && this.latLngBounds.equals(visibleRegion.latLngBounds) != null;
    }

    public final String toString() {
        return C5461u.m23765a(this).m23764a("nearLeft", this.nearLeft).m23764a("nearRight", this.nearRight).m23764a("farLeft", this.farLeft).m23764a("farRight", this.farRight).m23764a("latLngBounds", this.latLngBounds).toString();
    }
}
