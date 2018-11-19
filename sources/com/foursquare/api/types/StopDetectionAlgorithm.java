package com.foursquare.api.types;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;

public enum StopDetectionAlgorithm implements Parcelable {
    EMA("exponential"),
    HMM("hmm");
    
    public static final Creator<StopDetectionAlgorithm> CREATOR = null;
    @NonNull
    private final String toStringName;

    /* renamed from: com.foursquare.api.types.StopDetectionAlgorithm$1 */
    class C19071 implements Creator<StopDetectionAlgorithm> {
        C19071() {
        }

        public StopDetectionAlgorithm createFromParcel(Parcel parcel) {
            return StopDetectionAlgorithm.values()[parcel.readInt()];
        }

        public StopDetectionAlgorithm[] newArray(int i) {
            return new StopDetectionAlgorithm[i];
        }
    }

    private static class Strings {
        private static final String EXPONENTIAL = "exponential";
        private static final String HMM = "hmm";

        private Strings() {
        }
    }

    public int describeContents() {
        return 0;
    }

    static {
        CREATOR = new C19071();
    }

    private StopDetectionAlgorithm(String str) {
        this.toStringName = str;
    }

    public String toString() {
        return this.toStringName;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
