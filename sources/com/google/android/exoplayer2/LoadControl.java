package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.C2255e;
import com.google.android.exoplayer2.upstream.Allocator;

public interface LoadControl {
    Allocator getAllocator();

    long getBackBufferDurationUs();

    void onPrepared();

    void onReleased();

    void onStopped();

    void onTracksSelected(Renderer[] rendererArr, TrackGroupArray trackGroupArray, C2255e c2255e);

    boolean retainBackBufferFromKeyframe();

    boolean shouldContinueLoading(long j, float f);

    boolean shouldStartPlayback(long j, float f, boolean z);
}