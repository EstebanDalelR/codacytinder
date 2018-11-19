package com.foursquare.api.types;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class LatLng implements Parcelable, FoursquareType {
    public static final Creator<LatLng> CREATOR = new C19001();
    private String contextLine;
    private double lat;
    private double lng;
    private String name;

    /* renamed from: com.foursquare.api.types.LatLng$1 */
    class C19001 implements Creator<LatLng> {
        C19001() {
        }

        public LatLng createFromParcel(Parcel parcel) {
            return new LatLng(parcel);
        }

        public LatLng[] newArray(int i) {
            return new LatLng[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    private LatLng(Parcel parcel) {
        this.lat = parcel.readDouble();
        this.lng = parcel.readDouble();
        this.contextLine = parcel.readString();
        this.name = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.lat);
        parcel.writeDouble(this.lng);
        parcel.writeString(this.contextLine);
        parcel.writeString(this.name);
    }

    public double getLat() {
        return this.lat;
    }

    public double getLng() {
        return this.lng;
    }
}
