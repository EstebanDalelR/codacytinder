package com.foursquare.api.types;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class FoursquareGeocode implements Parcelable, FoursquareType {
    public static final Creator<FoursquareGeocode> CREATOR = new C18921();
    private Group<GeocoderLocation> interpretations;

    /* renamed from: com.foursquare.api.types.FoursquareGeocode$1 */
    class C18921 implements Creator<FoursquareGeocode> {
        C18921() {
        }

        public FoursquareGeocode createFromParcel(Parcel parcel) {
            return new FoursquareGeocode(parcel);
        }

        public FoursquareGeocode[] newArray(int i) {
            return new FoursquareGeocode[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    private FoursquareGeocode(Parcel parcel) {
        this.interpretations = (Group) parcel.readParcelable(Group.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.interpretations, i);
    }

    public Group<GeocoderLocation> getInterpretations() {
        return this.interpretations;
    }
}
