package com.mapbox.mapboxsdk.geometry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.facebook.ads.AdError;

public class VisibleRegion implements Parcelable {
    public static final Creator<VisibleRegion> CREATOR = new C58271();
    public final LatLng farLeft;
    public final LatLng farRight;
    public final LatLngBounds latLngBounds;
    public final LatLng nearLeft;
    public final LatLng nearRight;

    /* renamed from: com.mapbox.mapboxsdk.geometry.VisibleRegion$1 */
    static class C58271 implements Creator<VisibleRegion> {
        C58271() {
        }

        public VisibleRegion createFromParcel(Parcel parcel) {
            return new VisibleRegion(parcel);
        }

        public VisibleRegion[] newArray(int i) {
            return new VisibleRegion[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    private VisibleRegion(Parcel parcel) {
        this.farLeft = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.farRight = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.nearLeft = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.nearRight = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.latLngBounds = (LatLngBounds) parcel.readParcelable(LatLngBounds.class.getClassLoader());
    }

    public VisibleRegion(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.farLeft = latLng;
        this.farRight = latLng2;
        this.nearLeft = latLng3;
        this.nearRight = latLng4;
        this.latLngBounds = latLngBounds;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        boolean z = true;
        if (obj == this) {
            return true;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        if (!this.farLeft.equals(visibleRegion.farLeft) || !this.farRight.equals(visibleRegion.farRight) || !this.nearLeft.equals(visibleRegion.nearLeft) || !this.nearRight.equals(visibleRegion.nearRight) || this.latLngBounds.equals(visibleRegion.latLngBounds) == null) {
            z = false;
        }
        return z;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[farLeft [");
        stringBuilder.append(this.farLeft);
        stringBuilder.append("], farRight [");
        stringBuilder.append(this.farRight);
        stringBuilder.append("], nearLeft [");
        stringBuilder.append(this.nearLeft);
        stringBuilder.append("], nearRight [");
        stringBuilder.append(this.nearRight);
        stringBuilder.append("], latLngBounds [");
        stringBuilder.append(this.latLngBounds);
        stringBuilder.append("]]");
        return stringBuilder.toString();
    }

    public int hashCode() {
        return (((this.farLeft.hashCode() + 90) + ((this.farRight.hashCode() + 90) * AdError.NETWORK_ERROR_CODE)) + ((this.nearLeft.hashCode() + 180) * 1000000)) + ((this.nearRight.hashCode() + 180) * 1000000000);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.farLeft, i);
        parcel.writeParcelable(this.farRight, i);
        parcel.writeParcelable(this.nearLeft, i);
        parcel.writeParcelable(this.nearRight, i);
        parcel.writeParcelable(this.latLngBounds, i);
    }
}
