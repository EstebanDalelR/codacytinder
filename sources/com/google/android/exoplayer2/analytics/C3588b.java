package com.google.android.exoplayer2.analytics;

import android.net.NetworkInfo;
import android.view.Surface;
import com.google.android.exoplayer2.C2153n;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.AnalyticsListener.C2009a;
import com.google.android.exoplayer2.decoder.C2037c;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.MediaSourceEventListener.C2178b;
import com.google.android.exoplayer2.source.MediaSourceEventListener.C2179c;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.C2255e;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.analytics.b */
public abstract class C3588b implements AnalyticsListener {
    public void onAudioSessionId(C2009a c2009a, int i) {
    }

    public void onAudioUnderrun(C2009a c2009a, int i, long j, long j2) {
    }

    public void onBandwidthEstimate(C2009a c2009a, int i, long j, long j2) {
    }

    public void onDecoderDisabled(C2009a c2009a, int i, C2037c c2037c) {
    }

    public void onDecoderEnabled(C2009a c2009a, int i, C2037c c2037c) {
    }

    public void onDecoderInitialized(C2009a c2009a, int i, String str, long j) {
    }

    public void onDecoderInputFormatChanged(C2009a c2009a, int i, Format format) {
    }

    public void onDownstreamFormatChanged(C2009a c2009a, C2179c c2179c) {
    }

    public void onDrmKeysLoaded(C2009a c2009a) {
    }

    public void onDrmKeysRemoved(C2009a c2009a) {
    }

    public void onDrmKeysRestored(C2009a c2009a) {
    }

    public void onDrmSessionManagerError(C2009a c2009a, Exception exception) {
    }

    public void onDroppedVideoFrames(C2009a c2009a, int i, long j) {
    }

    public void onLoadCanceled(C2009a c2009a, C2178b c2178b, C2179c c2179c) {
    }

    public void onLoadCompleted(C2009a c2009a, C2178b c2178b, C2179c c2179c) {
    }

    public void onLoadError(C2009a c2009a, C2178b c2178b, C2179c c2179c, IOException iOException, boolean z) {
    }

    public void onLoadStarted(C2009a c2009a, C2178b c2178b, C2179c c2179c) {
    }

    public void onLoadingChanged(C2009a c2009a, boolean z) {
    }

    public void onMediaPeriodCreated(C2009a c2009a) {
    }

    public void onMediaPeriodReleased(C2009a c2009a) {
    }

    public void onMetadata(C2009a c2009a, Metadata metadata) {
    }

    public void onNetworkTypeChanged(C2009a c2009a, NetworkInfo networkInfo) {
    }

    public void onPlaybackParametersChanged(C2009a c2009a, C2153n c2153n) {
    }

    public void onPlayerError(C2009a c2009a, ExoPlaybackException exoPlaybackException) {
    }

    public void onPlayerStateChanged(C2009a c2009a, boolean z, int i) {
    }

    public void onPositionDiscontinuity(C2009a c2009a, int i) {
    }

    public void onReadingStarted(C2009a c2009a) {
    }

    public void onRenderedFirstFrame(C2009a c2009a, Surface surface) {
    }

    public void onRepeatModeChanged(C2009a c2009a, int i) {
    }

    public void onSeekProcessed(C2009a c2009a) {
    }

    public void onSeekStarted(C2009a c2009a) {
    }

    public void onShuffleModeChanged(C2009a c2009a, boolean z) {
    }

    public void onTimelineChanged(C2009a c2009a, int i) {
    }

    public void onTracksChanged(C2009a c2009a, TrackGroupArray trackGroupArray, C2255e c2255e) {
    }

    public void onUpstreamDiscarded(C2009a c2009a, C2179c c2179c) {
    }

    public void onVideoSizeChanged(C2009a c2009a, int i, int i2, int i3, float f) {
    }

    public void onViewportSizeChange(C2009a c2009a, int i, int i2) {
    }
}
