package com.mapbox.android.telemetry;

import android.content.Context;

interface AudioTypeResolver {
    void nextChain(AudioTypeResolver audioTypeResolver);

    String obtainAudioType(Context context);
}
