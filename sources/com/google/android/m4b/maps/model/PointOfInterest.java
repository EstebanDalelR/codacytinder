package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.p111k.C5468c;

public final class PointOfInterest implements C5468c {
    public static final PointOfInterestCreator CREATOR = new PointOfInterestCreator();
    /* renamed from: a */
    private final int f25176a;
    public final LatLng latLng;
    public final String name;
    public final String placeId;

    public final int describeContents() {
        return 0;
    }

    PointOfInterest(int i, LatLng latLng, String str, String str2) {
        this.f25176a = i;
        this.latLng = latLng;
        this.placeId = str;
        this.name = str2;
    }

    /* renamed from: a */
    final int m30004a() {
        return this.f25176a;
    }

    public PointOfInterest(LatLng latLng, String str, String str2) {
        this(1, latLng, str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        PointOfInterestCreator.m23885a(this, parcel, i);
    }
}
