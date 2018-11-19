package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.C2153n;

public interface MediaClock {
    C2153n getPlaybackParameters();

    long getPositionUs();

    C2153n setPlaybackParameters(C2153n c2153n);
}
