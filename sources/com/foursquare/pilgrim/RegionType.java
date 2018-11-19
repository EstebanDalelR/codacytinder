package com.foursquare.pilgrim;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public enum RegionType {
    HOME("home"),
    WORK("work"),
    UNKNOWN("unknown"),
    NONE("none"),
    VENUE("venue"),
    OTHER("other");
    
    @NonNull
    private final String value;

    private RegionType(String str) {
        this.value = str;
    }

    public String toString() {
        return this.value;
    }

    public boolean isHomeOrWork() {
        if (this != WORK) {
            if (this != HOME) {
                return false;
            }
        }
        return true;
    }

    @NonNull
    public static RegionType fromString(@Nullable String str) {
        if (str != null) {
            for (RegionType regionType : values()) {
                if (str.equalsIgnoreCase(regionType.value)) {
                    return regionType;
                }
            }
        }
        return NONE;
    }
}
