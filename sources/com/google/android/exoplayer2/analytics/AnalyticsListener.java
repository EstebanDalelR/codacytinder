package com.google.android.exoplayer2.analytics;

import android.net.NetworkInfo;
import android.support.annotation.Nullable;
import android.view.Surface;
import com.google.android.exoplayer2.C2153n;
import com.google.android.exoplayer2.C2165q;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.C2037c;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.MediaSource.C2166a;
import com.google.android.exoplayer2.source.MediaSourceEventListener.C2178b;
import com.google.android.exoplayer2.source.MediaSourceEventListener.C2179c;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.C2255e;
import java.io.IOException;

public interface AnalyticsListener {

    /* renamed from: com.google.android.exoplayer2.analytics.AnalyticsListener$a */
    public static final class C2009a {
        /* renamed from: a */
        public final long f5470a;
        /* renamed from: b */
        public final C2165q f5471b;
        /* renamed from: c */
        public final int f5472c;
        @Nullable
        /* renamed from: d */
        public final C2166a f5473d;
        /* renamed from: e */
        public final long f5474e;
        /* renamed from: f */
        public final long f5475f;
        /* renamed from: g */
        public final long f5476g;

        public C2009a(long j, C2165q c2165q, int i, @Nullable C2166a c2166a, long j2, long j3, long j4) {
            this.f5470a = j;
            this.f5471b = c2165q;
            this.f5472c = i;
            this.f5473d = c2166a;
            this.f5474e = j2;
            this.f5475f = j3;
            this.f5476g = j4;
        }
    }

    void onAudioSessionId(C2009a c2009a, int i);

    void onAudioUnderrun(C2009a c2009a, int i, long j, long j2);

    void onBandwidthEstimate(C2009a c2009a, int i, long j, long j2);

    void onDecoderDisabled(C2009a c2009a, int i, C2037c c2037c);

    void onDecoderEnabled(C2009a c2009a, int i, C2037c c2037c);

    void onDecoderInitialized(C2009a c2009a, int i, String str, long j);

    void onDecoderInputFormatChanged(C2009a c2009a, int i, Format format);

    void onDownstreamFormatChanged(C2009a c2009a, C2179c c2179c);

    void onDrmKeysLoaded(C2009a c2009a);

    void onDrmKeysRemoved(C2009a c2009a);

    void onDrmKeysRestored(C2009a c2009a);

    void onDrmSessionManagerError(C2009a c2009a, Exception exception);

    void onDroppedVideoFrames(C2009a c2009a, int i, long j);

    void onLoadCanceled(C2009a c2009a, C2178b c2178b, C2179c c2179c);

    void onLoadCompleted(C2009a c2009a, C2178b c2178b, C2179c c2179c);

    void onLoadError(C2009a c2009a, C2178b c2178b, C2179c c2179c, IOException iOException, boolean z);

    void onLoadStarted(C2009a c2009a, C2178b c2178b, C2179c c2179c);

    void onLoadingChanged(C2009a c2009a, boolean z);

    void onMediaPeriodCreated(C2009a c2009a);

    void onMediaPeriodReleased(C2009a c2009a);

    void onMetadata(C2009a c2009a, Metadata metadata);

    void onNetworkTypeChanged(C2009a c2009a, @Nullable NetworkInfo networkInfo);

    void onPlaybackParametersChanged(C2009a c2009a, C2153n c2153n);

    void onPlayerError(C2009a c2009a, ExoPlaybackException exoPlaybackException);

    void onPlayerStateChanged(C2009a c2009a, boolean z, int i);

    void onPositionDiscontinuity(C2009a c2009a, int i);

    void onReadingStarted(C2009a c2009a);

    void onRenderedFirstFrame(C2009a c2009a, Surface surface);

    void onRepeatModeChanged(C2009a c2009a, int i);

    void onSeekProcessed(C2009a c2009a);

    void onSeekStarted(C2009a c2009a);

    void onShuffleModeChanged(C2009a c2009a, boolean z);

    void onTimelineChanged(C2009a c2009a, int i);

    void onTracksChanged(C2009a c2009a, TrackGroupArray trackGroupArray, C2255e c2255e);

    void onUpstreamDiscarded(C2009a c2009a, C2179c c2179c);

    void onVideoSizeChanged(C2009a c2009a, int i, int i2, int i3, float f);

    void onViewportSizeChange(C2009a c2009a, int i, int i2);
}
