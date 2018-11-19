package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class FeedbackEventData implements Parcelable {
    public static final Creator<FeedbackEventData> CREATOR = new C57811();
    private String audio;
    private String description;
    private String feedbackType;
    private String source;
    private String userId;

    /* renamed from: com.mapbox.android.telemetry.FeedbackEventData$1 */
    static class C57811 implements Creator<FeedbackEventData> {
        C57811() {
        }

        public FeedbackEventData createFromParcel(Parcel parcel) {
            return new FeedbackEventData(parcel);
        }

        public FeedbackEventData[] newArray(int i) {
            return new FeedbackEventData[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public FeedbackEventData(String str, String str2) {
        this.audio = null;
        this.description = null;
        this.userId = TelemetryUtils.retrieveVendorId();
        this.feedbackType = str;
        this.source = str2;
    }

    FeedbackEventData(String str, String str2, String str3) {
        this.audio = null;
        this.description = null;
        this.userId = str;
        this.feedbackType = str2;
        this.source = str3;
    }

    String getUserId() {
        return this.userId;
    }

    String getFeedbackType() {
        return this.feedbackType;
    }

    String getSource() {
        return this.source;
    }

    String getAudio() {
        return this.audio;
    }

    public void setAudio(String str) {
        this.audio = str;
    }

    String getDescription() {
        return this.description;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    private FeedbackEventData(Parcel parcel) {
        this.audio = null;
        this.description = null;
        this.userId = parcel.readString();
        this.feedbackType = parcel.readString();
        this.source = parcel.readString();
        this.audio = parcel.readString();
        this.description = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.userId);
        parcel.writeString(this.feedbackType);
        parcel.writeString(this.source);
        parcel.writeString(this.audio);
        parcel.writeString(this.description);
    }
}
