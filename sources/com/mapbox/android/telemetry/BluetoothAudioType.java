package com.mapbox.android.telemetry;

import android.content.Context;
import android.media.AudioManager;

class BluetoothAudioType implements AudioTypeResolver {
    private static final String BLUETOOTH = "bluetooth";
    private AudioTypeResolver chain;

    BluetoothAudioType() {
    }

    public void nextChain(AudioTypeResolver audioTypeResolver) {
        this.chain = audioTypeResolver;
    }

    public String obtainAudioType(Context context) {
        if (((AudioManager) MapboxTelemetry.applicationContext.getSystemService("audio")).isBluetoothScoOn()) {
            return BLUETOOTH;
        }
        return this.chain.obtainAudioType(context);
    }
}
