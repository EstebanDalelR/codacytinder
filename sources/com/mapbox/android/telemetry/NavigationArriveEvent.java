package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.JsonAdapter;
import com.mapbox.android.telemetry.Event.Type;

class NavigationArriveEvent extends Event implements Parcelable {
    public static final Creator<NavigationArriveEvent> CREATOR = new C57911();
    private static final String NAVIGATION_ARRIVE = "navigation.arrive";
    private final String event;
    @JsonAdapter(NavigationMetadataSerializer.class)
    private NavigationMetadata metadata;

    /* renamed from: com.mapbox.android.telemetry.NavigationArriveEvent$1 */
    static class C57911 implements Creator<NavigationArriveEvent> {
        C57911() {
        }

        public NavigationArriveEvent createFromParcel(Parcel parcel) {
            return new NavigationArriveEvent(parcel);
        }

        public NavigationArriveEvent[] newArray(int i) {
            return new NavigationArriveEvent[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    NavigationArriveEvent(NavigationState navigationState) {
        this.event = NAVIGATION_ARRIVE;
        this.metadata = navigationState.getNavigationMetadata();
    }

    Type obtainType() {
        return Type.NAV_ARRIVE;
    }

    String getEvent() {
        return this.event;
    }

    NavigationMetadata getMetadata() {
        return this.metadata;
    }

    private NavigationArriveEvent(Parcel parcel) {
        this.event = parcel.readString();
        this.metadata = (NavigationMetadata) parcel.readParcelable(NavigationMetadata.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.event);
        parcel.writeParcelable(this.metadata, i);
    }
}
