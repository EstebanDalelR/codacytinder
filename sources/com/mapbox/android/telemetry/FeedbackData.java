package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class FeedbackData implements Parcelable {
    public static final Creator<FeedbackData> CREATOR = new C57801();
    private String feedbackId;
    private String screenshot;

    /* renamed from: com.mapbox.android.telemetry.FeedbackData$1 */
    static class C57801 implements Creator<FeedbackData> {
        C57801() {
        }

        public FeedbackData createFromParcel(Parcel parcel) {
            return new FeedbackData(parcel);
        }

        public FeedbackData[] newArray(int i) {
            return new FeedbackData[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public FeedbackData() {
        this.screenshot = null;
        this.feedbackId = TelemetryUtils.obtainUniversalUniqueIdentifier();
    }

    String getFeedbackId() {
        return this.feedbackId;
    }

    String getScreenshot() {
        return this.screenshot;
    }

    public void setScreenshot(String str) {
        this.screenshot = str;
    }

    private FeedbackData(Parcel parcel) {
        this.screenshot = null;
        this.feedbackId = parcel.readString();
        this.screenshot = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.feedbackId);
        parcel.writeString(this.screenshot);
    }
}
