package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.JsonAdapter;
import com.mapbox.android.telemetry.Event.Type;

class NavigationDepartEvent extends Event implements Parcelable {
    public static final Creator<NavigationDepartEvent> CREATOR = new C57941();
    private static final String NAVIGATION_DEPART = "navigation.depart";
    private final String event;
    @JsonAdapter(NavigationMetadataSerializer.class)
    private NavigationMetadata metadata;

    /* renamed from: com.mapbox.android.telemetry.NavigationDepartEvent$1 */
    static class C57941 implements Creator<NavigationDepartEvent> {
        C57941() {
        }

        public NavigationDepartEvent createFromParcel(Parcel parcel) {
            return new NavigationDepartEvent(parcel);
        }

        public NavigationDepartEvent[] newArray(int i) {
            return new NavigationDepartEvent[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    NavigationDepartEvent(NavigationState navigationState) {
        this.event = NAVIGATION_DEPART;
        this.metadata = navigationState.getNavigationMetadata();
    }

    Type obtainType() {
        return Type.NAV_DEPART;
    }

    String getEvent() {
        return this.event;
    }

    NavigationMetadata getMetadata() {
        return this.metadata;
    }

    private NavigationDepartEvent(Parcel parcel) {
        this.event = parcel.readString();
        this.metadata = (NavigationMetadata) parcel.readParcelable(NavigationMetadata.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.event);
        parcel.writeParcelable(this.metadata, i);
    }
}
