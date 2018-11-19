package com.mapbox.android.telemetry;

import android.content.Context;
import android.media.AudioManager;

class SpeakerAudioType implements AudioTypeResolver {
    private static final String SPEAKER = "speaker";
    private AudioTypeResolver chain;

    SpeakerAudioType() {
    }

    public void nextChain(AudioTypeResolver audioTypeResolver) {
        this.chain = audioTypeResolver;
    }

    public String obtainAudioType(Context context) {
        if (((AudioManager) MapboxTelemetry.applicationContext.getSystemService("audio")).isSpeakerphoneOn()) {
            return SPEAKER;
        }
        return this.chain.obtainAudioType(context);
    }
}
