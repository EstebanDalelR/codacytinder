package com.mapbox.android.telemetry;

import android.content.Context;
import android.media.AudioManager;

class HeadphonesAudioType implements AudioTypeResolver {
    private static final String HEADPHONES = "headphones";
    private AudioTypeResolver chain;

    HeadphonesAudioType() {
    }

    public void nextChain(AudioTypeResolver audioTypeResolver) {
        this.chain = audioTypeResolver;
    }

    public String obtainAudioType(Context context) {
        if (((AudioManager) MapboxTelemetry.applicationContext.getSystemService("audio")).isWiredHeadsetOn()) {
            return HEADPHONES;
        }
        return this.chain.obtainAudioType(context);
    }
}
