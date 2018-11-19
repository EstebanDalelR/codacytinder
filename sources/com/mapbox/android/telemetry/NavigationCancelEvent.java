package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.JsonAdapter;
import com.mapbox.android.telemetry.Event.Type;

class NavigationCancelEvent extends Event implements Parcelable {
    public static final Creator<NavigationCancelEvent> CREATOR = new C57931();
    private static final String NAVIGATION_CANCEL = "navigation.cancel";
    @JsonAdapter(CancelDataSerializer.class)
    private NavigationCancelData cancelData;
    private final String event;
    @JsonAdapter(NavigationMetadataSerializer.class)
    private NavigationMetadata metadata;

    /* renamed from: com.mapbox.android.telemetry.NavigationCancelEvent$1 */
    static class C57931 implements Creator<NavigationCancelEvent> {
        C57931() {
        }

        public NavigationCancelEvent createFromParcel(Parcel parcel) {
            return new NavigationCancelEvent(parcel);
        }

        public NavigationCancelEvent[] newArray(int i) {
            return new NavigationCancelEvent[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    NavigationCancelEvent(NavigationState navigationState) {
        this.event = NAVIGATION_CANCEL;
        this.cancelData = navigationState.getNavigationCancelData();
        this.metadata = navigationState.getNavigationMetadata();
    }

    Type obtainType() {
        return Type.NAV_CANCEL;
    }

    String getEvent() {
        return this.event;
    }

    NavigationCancelData getCancelData() {
        return this.cancelData;
    }

    NavigationMetadata getMetadata() {
        return this.metadata;
    }

    private NavigationCancelEvent(Parcel parcel) {
        this.event = parcel.readString();
        this.cancelData = (NavigationCancelData) parcel.readParcelable(NavigationCancelData.class.getClassLoader());
        this.metadata = (NavigationMetadata) parcel.readParcelable(NavigationMetadata.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.event);
        parcel.writeParcelable(this.cancelData, i);
        parcel.writeParcelable(this.metadata, i);
    }
}
