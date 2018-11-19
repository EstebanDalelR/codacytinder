package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.JsonAdapter;
import com.mapbox.android.telemetry.Event.Type;

class NavigationFasterRouteEvent extends Event implements Parcelable {
    public static final Creator<NavigationFasterRouteEvent> CREATOR = new C57961();
    private static final String NAVIGATION_FASTER_ROUTE = "navigation.fasterRoute";
    private static final String NAVIGATION_REROUTE_DATA_STATE_ILLEGAL_NULL = "NavigationRerouteData cannot be null.";
    private final String event;
    @JsonAdapter(NavigationMetadataSerializer.class)
    private NavigationMetadata metadata;
    @JsonAdapter(NewDataSerializer.class)
    private NavigationNewData navigationNewData;
    private NavigationStepMetadata step;

    /* renamed from: com.mapbox.android.telemetry.NavigationFasterRouteEvent$1 */
    static class C57961 implements Creator<NavigationFasterRouteEvent> {
        C57961() {
        }

        public NavigationFasterRouteEvent createFromParcel(Parcel parcel) {
            return new NavigationFasterRouteEvent(parcel);
        }

        public NavigationFasterRouteEvent[] newArray(int i) {
            return new NavigationFasterRouteEvent[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    NavigationFasterRouteEvent(NavigationState navigationState) {
        this.metadata = null;
        this.navigationNewData = null;
        this.step = null;
        this.event = NAVIGATION_FASTER_ROUTE;
        NavigationRerouteData navigationRerouteData = navigationState.getNavigationRerouteData();
        check(navigationRerouteData);
        this.navigationNewData = navigationRerouteData.getNavigationNewData();
        this.step = navigationState.getNavigationStepMetadata();
        this.metadata = navigationState.getNavigationMetadata();
    }

    Type obtainType() {
        return Type.NAV_FASTER_ROUTE;
    }

    String getEvent() {
        return this.event;
    }

    NavigationNewData getNavigationNewData() {
        return this.navigationNewData;
    }

    NavigationStepMetadata getStep() {
        return this.step;
    }

    NavigationMetadata getMetadata() {
        return this.metadata;
    }

    private NavigationFasterRouteEvent(Parcel parcel) {
        this.metadata = null;
        this.navigationNewData = null;
        this.step = null;
        this.event = parcel.readString();
        this.navigationNewData = (NavigationNewData) parcel.readParcelable(NavigationNewData.class.getClassLoader());
        this.step = (NavigationStepMetadata) parcel.readParcelable(NavigationStepMetadata.class.getClassLoader());
        this.metadata = (NavigationMetadata) parcel.readParcelable(NavigationMetadata.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.event);
        parcel.writeParcelable(this.navigationNewData, i);
        parcel.writeParcelable(this.step, i);
        parcel.writeParcelable(this.metadata, i);
    }

    private void check(NavigationRerouteData navigationRerouteData) {
        if (navigationRerouteData == null) {
            throw new IllegalArgumentException(NAVIGATION_REROUTE_DATA_STATE_ILLEGAL_NULL);
        }
    }
}
