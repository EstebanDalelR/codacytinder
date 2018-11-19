package com.mapbox.android.telemetry;

import android.content.Context;

class UnknownAudioType implements AudioTypeResolver {
    private static final String UNKNOWN = "unknown";

    public void nextChain(AudioTypeResolver audioTypeResolver) {
    }

    public String obtainAudioType(Context context) {
        return UNKNOWN;
    }

    UnknownAudioType() {
    }
}
