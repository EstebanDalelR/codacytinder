package com.foursquare.pilgrim;

import android.support.annotation.Nullable;
import com.foursquare.pilgrim.PilgrimSdk.LogLevel;

public class DebugLogItem {
    @Nullable
    public final LogLevel level;
    @Nullable
    public final String location;
    @Nullable
    public final String motion;
    @Nullable
    public final String notes;
    public final long timestamp;
    @Nullable
    public final String trigger;

    DebugLogItem(long j, @Nullable String str, @Nullable LogLevel logLevel, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.timestamp = j;
        this.notes = str;
        this.level = logLevel;
        this.location = str2;
        this.trigger = str3;
        this.motion = str4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.notes);
        stringBuilder.append("\n\n");
        return stringBuilder.toString();
    }
}
