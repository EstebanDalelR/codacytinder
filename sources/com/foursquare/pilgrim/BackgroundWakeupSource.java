package com.foursquare.pilgrim;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;

public enum BackgroundWakeupSource {
    FUSED_CONTINUOUS("continuous"),
    PERIODIC_JOB_ONE_OFF("periodic_job_one_off"),
    UNKNOWN("unknown");
    
    @NonNull
    public final String serializedName;

    private BackgroundWakeupSource(String str) {
        this.serializedName = str;
    }

    @Nullable
    public static BackgroundWakeupSource fromSerializedName(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (BackgroundWakeupSource backgroundWakeupSource : values()) {
            if (TextUtils.equals(backgroundWakeupSource.serializedName, str)) {
                return backgroundWakeupSource;
            }
        }
        return null;
    }

    public String toString() {
        return this.serializedName;
    }
}
