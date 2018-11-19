package com.spotify.sdk.android.player;

public enum PlaybackBitrate {
    BITRATE_LOW(0),
    BITRATE_NORMAL(1),
    BITRATE_HIGH(2);
    
    private final int mType;

    private PlaybackBitrate(int i) {
        this.mType = i;
    }

    public int getValue() {
        return this.mType;
    }
}
