package com.foursquare.api.types;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class FoursquareGeocodeResponse implements Parcelable, FoursquareType {
    public static final Creator<FoursquareGeocodeResponse> CREATOR = new C18931();
    private FoursquareGeocode geocode;

    /* renamed from: com.foursquare.api.types.FoursquareGeocodeResponse$1 */
    class C18931 implements Creator<FoursquareGeocodeResponse> {
        C18931() {
        }

        public FoursquareGeocodeResponse createFromParcel(Parcel parcel) {
            return new FoursquareGeocodeResponse(parcel);
        }

        public FoursquareGeocodeResponse[] newArray(int i) {
            return new FoursquareGeocodeResponse[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public FoursquareGeocodeResponse(Parcel parcel) {
        this.geocode = (FoursquareGeocode) parcel.readParcelable(FoursquareGeocode.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.geocode, i);
    }

    public FoursquareGeocode getGeocode() {
        return this.geocode;
    }
}
