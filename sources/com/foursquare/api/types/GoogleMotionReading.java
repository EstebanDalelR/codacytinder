package com.foursquare.api.types;

import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.foursquare.internal.api.C1913a;
import com.foursquare.internal.util.FsLog;
import com.google.gson.annotations.SerializedName;

public final class GoogleMotionReading {
    @SerializedName("motionType")
    @NonNull
    public final MotionType motionType;
    @SerializedName("timestamp")
    @IntRange(from = 1)
    public final long timestamp;

    public enum MotionType {
        IN_VEHICLE(0),
        ON_BICYCLE(1),
        ON_FOOT(2),
        RUNNING(8),
        STILL(3),
        TILTING(5),
        WALKING(7),
        UNKNOWN(4);
        
        private static final String TAG = "GoogleMotionReading$MotionType";
        public final int detectedActivityType;

        private MotionType(int i) {
            this.detectedActivityType = i;
        }

        @NonNull
        public static MotionType fromDetectedActivityMagicInt(int i) {
            for (MotionType motionType : values()) {
                if (motionType.detectedActivityType == i) {
                    return motionType;
                }
            }
            String str = TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Encountered unknown motion type with int: ");
            stringBuilder.append(i);
            FsLog.m6807d(str, stringBuilder.toString());
            return UNKNOWN;
        }
    }

    @Nullable
    public static GoogleMotionReading from(long j, int i) {
        return j <= 0 ? 0 : new GoogleMotionReading(j, MotionType.fromDetectedActivityMagicInt(i));
    }

    private GoogleMotionReading(long j, @NonNull MotionType motionType) {
        this.timestamp = j;
        this.motionType = motionType;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.timestamp);
        stringBuilder.append(",");
        stringBuilder.append(getStringForType());
        return stringBuilder.toString();
    }

    private String getStringForType() {
        return C1913a.m6647a().toJson(this.motionType);
    }
}
