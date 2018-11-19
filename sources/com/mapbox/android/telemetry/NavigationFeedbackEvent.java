package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.JsonAdapter;
import com.mapbox.android.telemetry.Event.Type;

class NavigationFeedbackEvent extends Event implements Parcelable {
    public static final Creator<NavigationFeedbackEvent> CREATOR = new C57971();
    private static final String NAVIGATION_FEEDBACK = "navigation.feedback";
    private final String event;
    @JsonAdapter(FeedbackDataSerializer.class)
    private FeedbackData feedbackData;
    @JsonAdapter(FeedbackEventDataSerializer.class)
    private FeedbackEventData feedbackEventData;
    @JsonAdapter(NavigationMetadataSerializer.class)
    private NavigationMetadata metadata;
    @JsonAdapter(LocationDataSerializer.class)
    private NavigationLocationData navigationLocationData;
    private NavigationStepMetadata step;

    /* renamed from: com.mapbox.android.telemetry.NavigationFeedbackEvent$1 */
    static class C57971 implements Creator<NavigationFeedbackEvent> {
        C57971() {
        }

        public NavigationFeedbackEvent createFromParcel(Parcel parcel) {
            return new NavigationFeedbackEvent(parcel);
        }

        public NavigationFeedbackEvent[] newArray(int i) {
            return new NavigationFeedbackEvent[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    NavigationFeedbackEvent(NavigationState navigationState) {
        this.step = null;
        this.event = NAVIGATION_FEEDBACK;
        this.metadata = navigationState.getNavigationMetadata();
        this.feedbackEventData = navigationState.getFeedbackEventData();
        this.navigationLocationData = navigationState.getNavigationLocationData();
        this.feedbackData = navigationState.getFeedbackData();
        this.step = navigationState.getNavigationStepMetadata();
    }

    Type obtainType() {
        return Type.NAV_FEEDBACK;
    }

    String getEvent() {
        return this.event;
    }

    NavigationMetadata getMetadata() {
        return this.metadata;
    }

    FeedbackEventData getFeedbackEventData() {
        return this.feedbackEventData;
    }

    NavigationLocationData getNavigationLocationData() {
        return this.navigationLocationData;
    }

    FeedbackData getFeedbackData() {
        return this.feedbackData;
    }

    NavigationStepMetadata getStep() {
        return this.step;
    }

    private NavigationFeedbackEvent(Parcel parcel) {
        this.step = null;
        this.event = parcel.readString();
        this.metadata = (NavigationMetadata) parcel.readValue(NavigationMetadata.class.getClassLoader());
        this.feedbackEventData = (FeedbackEventData) parcel.readValue(FeedbackEventData.class.getClassLoader());
        this.navigationLocationData = (NavigationLocationData) parcel.readValue(NavigationLocationData.class.getClassLoader());
        this.feedbackData = (FeedbackData) parcel.readValue(FeedbackData.class.getClassLoader());
        this.step = (NavigationStepMetadata) parcel.readValue(NavigationStepMetadata.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.event);
        parcel.writeValue(this.metadata);
        parcel.writeValue(this.feedbackEventData);
        parcel.writeValue(this.navigationLocationData);
        parcel.writeValue(this.feedbackData);
        parcel.writeValue(this.step);
    }
}
