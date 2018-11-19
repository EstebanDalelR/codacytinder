package com.spotify.sdk.android.player;

interface NativePlayer {

    public interface AudioDeliveredCallback {
        int onAudioDelivered(short[] sArr, int i, int i2, int i3);
    }

    public interface AudioFlushCallback {
        void onAudioFlush();
    }
}
