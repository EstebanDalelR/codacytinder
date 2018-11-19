package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.JsonAdapter;
import com.mapbox.android.telemetry.Event.Type;

class NavigationRerouteEvent extends Event implements Parcelable {
    public static final Creator<NavigationRerouteEvent> CREATOR = new C58011();
    private static final String NAVIGATION_REROUTE = "navigation.reroute";
    private final String event;
    @JsonAdapter(FeedbackDataSerializer.class)
    private FeedbackData feedbackData;
    @JsonAdapter(LocationDataSerializer.class)
    private NavigationLocationData navigationLocationData;
    @JsonAdapter(NavigationMetadataSerializer.class)
    private NavigationMetadata navigationMetadata;
    @JsonAdapter(RerouteDataSerializer.class)
    private NavigationRerouteData navigationRerouteData;
    private NavigationStepMetadata step;

    /* renamed from: com.mapbox.android.telemetry.NavigationRerouteEvent$1 */
    static class C58011 implements Creator<NavigationRerouteEvent> {
        C58011() {
        }

        public NavigationRerouteEvent createFromParcel(Parcel parcel) {
            return new NavigationRerouteEvent(parcel);
        }

        public NavigationRerouteEvent[] newArray(int i) {
            return new NavigationRerouteEvent[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    NavigationRerouteEvent(NavigationState navigationState) {
        this.step = null;
        this.event = NAVIGATION_REROUTE;
        this.feedbackData = navigationState.getFeedbackData();
        this.navigationMetadata = navigationState.getNavigationMetadata();
        this.navigationRerouteData = navigationState.getNavigationRerouteData();
        this.navigationLocationData = navigationState.getNavigationLocationData();
        this.step = navigationState.getNavigationStepMetadata();
    }

    Type obtainType() {
        return Type.NAV_REROUTE;
    }

    String getEvent() {
        return this.event;
    }

    NavigationLocationData getNavigationLocationData() {
        return this.navigationLocationData;
    }

    NavigationRerouteData getNavigationRerouteData() {
        return this.navigationRerouteData;
    }

    NavigationStepMetadata getStep() {
        return this.step;
    }

    FeedbackData getFeedbackData() {
        return this.feedbackData;
    }

    NavigationMetadata getNavigationMetadata() {
        return this.navigationMetadata;
    }

    private NavigationRerouteEvent(Parcel parcel) {
        this.step = null;
        this.event = parcel.readString();
        this.navigationMetadata = (NavigationMetadata) parcel.readParcelable(NavigationMetadata.class.getClassLoader());
        this.navigationLocationData = (NavigationLocationData) parcel.readParcelable(NavigationLocationData.class.getClassLoader());
        this.feedbackData = (FeedbackData) parcel.readParcelable(FeedbackData.class.getClassLoader());
        this.step = (NavigationStepMetadata) parcel.readParcelable(NavigationStepMetadata.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.event);
        parcel.writeParcelable(this.navigationMetadata, i);
        parcel.writeParcelable(this.navigationLocationData, i);
        parcel.writeParcelable(this.feedbackData, i);
        parcel.writeParcelable(this.step, i);
    }
}
