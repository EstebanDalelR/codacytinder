package com.foursquare.pilgrim;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public enum Confidence {
    NONE("none"),
    LOW("low"),
    MEDIUM("med"),
    HIGH("high");
    
    @NonNull
    private final String value;

    private Confidence(String str) {
        this.value = str;
    }

    public String toString() {
        return this.value;
    }

    @NonNull
    public static Confidence fromString(@Nullable String str) {
        if (str != null) {
            for (Confidence confidence : values()) {
                if (str.equalsIgnoreCase(confidence.value)) {
                    return confidence;
                }
            }
        }
        return NONE;
    }
}
