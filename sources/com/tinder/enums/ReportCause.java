package com.tinder.enums;

import android.support.annotation.NonNull;

@Deprecated
public enum ReportCause {
    OTHER("OTHER", 0),
    SPAM("SPAM", 1),
    INAPPROPRIATE_PHOTOS("INAPPROPRIATE_PHOTOS", 4),
    OFFLINE_BEHAVIOR("OFFLINE_BEHAVIOR", 5),
    INAPPROPRIATE_MESSAGES("INAPPROPRIATE_MESSAGES", 6);
    
    private final int intValue;
    @NonNull
    private final String mAnalyticsValue;

    private ReportCause(String str, int i) {
        this.mAnalyticsValue = str;
        this.intValue = i;
    }

    public String getAnalyticsValue() {
        return this.mAnalyticsValue;
    }

    public int getIntValue() {
        return this.intValue;
    }
}
