package com.mapbox.android.telemetry;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class NavigationLocationData implements Parcelable {
    public static final Creator<NavigationLocationData> CREATOR = new C57981();
    private Location[] locationsAfter;
    private Location[] locationsBefore;

    /* renamed from: com.mapbox.android.telemetry.NavigationLocationData$1 */
    static class C57981 implements Creator<NavigationLocationData> {
        C57981() {
        }

        public NavigationLocationData createFromParcel(Parcel parcel) {
            return new NavigationLocationData(parcel);
        }

        public NavigationLocationData[] newArray(int i) {
            return new NavigationLocationData[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public NavigationLocationData(Location[] locationArr, Location[] locationArr2) {
        this.locationsBefore = locationArr;
        this.locationsAfter = locationArr2;
    }

    Location[] getLocationsBefore() {
        return this.locationsBefore;
    }

    Location[] getLocationsAfter() {
        return this.locationsAfter;
    }

    private NavigationLocationData(Parcel parcel) {
        this.locationsBefore = (Location[]) parcel.createTypedArray(Location.CREATOR);
        this.locationsAfter = (Location[]) parcel.createTypedArray(Location.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.locationsBefore, i);
        parcel.writeTypedArray(this.locationsAfter, i);
    }
}
