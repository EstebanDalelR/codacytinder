package com.spotify.sdk.android.player;

public interface AudioController {
    int onAudioDataDelivered(short[] sArr, int i, int i2, int i3);

    void onAudioFlush();

    void onAudioPaused();

    void onAudioResumed();

    void start();

    void stop();
}
