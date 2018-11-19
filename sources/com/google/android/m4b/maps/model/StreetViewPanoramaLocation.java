package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.p110j.C5461u;
import com.google.android.m4b.maps.p111k.C5468c;
import java.util.Arrays;

public class StreetViewPanoramaLocation implements C5468c {
    public static final StreetViewPanoramaLocationCreator CREATOR = new StreetViewPanoramaLocationCreator();
    /* renamed from: a */
    private final int f25196a;
    public final StreetViewPanoramaLink[] links;
    public final String panoId;
    public final LatLng position;

    public int describeContents() {
        return 0;
    }

    StreetViewPanoramaLocation(int i, StreetViewPanoramaLink[] streetViewPanoramaLinkArr, LatLng latLng, String str) {
        this.f25196a = i;
        this.links = streetViewPanoramaLinkArr;
        this.position = latLng;
        this.panoId = str;
    }

    public StreetViewPanoramaLocation(StreetViewPanoramaLink[] streetViewPanoramaLinkArr, LatLng latLng, String str) {
        this(1, streetViewPanoramaLinkArr, latLng, str);
    }

    public void writeToParcel(Parcel parcel, int i) {
        StreetViewPanoramaLocationCreator.m23900a(this, parcel, i);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.position, this.panoId});
    }

    /* renamed from: a */
    final int m30010a() {
        return this.f25196a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLocation)) {
            return false;
        }
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) obj;
        return this.panoId.equals(streetViewPanoramaLocation.panoId) && this.position.equals(streetViewPanoramaLocation.position) != null;
    }

    public String toString() {
        return C5461u.m23765a(this).m23764a("panoId", this.panoId).m23764a("position", this.position.toString()).toString();
    }
}
