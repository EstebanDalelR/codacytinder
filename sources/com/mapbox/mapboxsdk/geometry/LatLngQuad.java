package com.mapbox.mapboxsdk.geometry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class LatLngQuad implements Parcelable {
    public static final Creator<LatLngQuad> CREATOR = new C58241();
    private final LatLng bottomLeft;
    private final LatLng bottomRight;
    private final LatLng topLeft;
    private final LatLng topRight;

    /* renamed from: com.mapbox.mapboxsdk.geometry.LatLngQuad$1 */
    static class C58241 implements Creator<LatLngQuad> {
        C58241() {
        }

        public LatLngQuad createFromParcel(Parcel parcel) {
            return LatLngQuad.readFromParcel(parcel);
        }

        public LatLngQuad[] newArray(int i) {
            return new LatLngQuad[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public LatLngQuad(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4) {
        this.topLeft = latLng;
        this.topRight = latLng2;
        this.bottomRight = latLng3;
        this.bottomLeft = latLng4;
    }

    public LatLng getTopLeft() {
        return this.topLeft;
    }

    public LatLng getTopRight() {
        return this.topRight;
    }

    public LatLng getBottomRight() {
        return this.bottomRight;
    }

    public LatLng getBottomLeft() {
        return this.bottomLeft;
    }

    public int hashCode() {
        int hashCode = this.topLeft.hashCode();
        hashCode = (hashCode ^ (hashCode >>> 31)) + this.topRight.hashCode();
        hashCode = (hashCode ^ (hashCode >>> 31)) + this.bottomRight.hashCode();
        return (hashCode ^ (hashCode >>> 31)) + this.bottomLeft.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        this.topLeft.writeToParcel(parcel, i);
        this.topRight.writeToParcel(parcel, i);
        this.bottomRight.writeToParcel(parcel, i);
        this.bottomLeft.writeToParcel(parcel, i);
    }

    private static LatLngQuad readFromParcel(Parcel parcel) {
        return new LatLngQuad(new LatLng(parcel), new LatLng(parcel), new LatLng(parcel), new LatLng(parcel));
    }
}
