package com.google.android.exoplayer2.source;

import android.support.annotation.Nullable;
import com.google.android.exoplayer2.source.MediaSource.C2166a;
import com.google.android.exoplayer2.source.MediaSourceEventListener.C2178b;
import com.google.android.exoplayer2.source.MediaSourceEventListener.C2179c;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.source.e */
public abstract class C3686e implements MediaSourceEventListener {
    public void onDownstreamFormatChanged(int i, @Nullable C2166a c2166a, C2179c c2179c) {
    }

    public void onLoadCanceled(int i, @Nullable C2166a c2166a, C2178b c2178b, C2179c c2179c) {
    }

    public void onLoadCompleted(int i, @Nullable C2166a c2166a, C2178b c2178b, C2179c c2179c) {
    }

    public void onLoadError(int i, @Nullable C2166a c2166a, C2178b c2178b, C2179c c2179c, IOException iOException, boolean z) {
    }

    public void onLoadStarted(int i, @Nullable C2166a c2166a, C2178b c2178b, C2179c c2179c) {
    }

    public void onMediaPeriodCreated(int i, C2166a c2166a) {
    }

    public void onMediaPeriodReleased(int i, C2166a c2166a) {
    }

    public void onReadingStarted(int i, C2166a c2166a) {
    }

    public void onUpstreamDiscarded(int i, @Nullable C2166a c2166a, C2179c c2179c) {
    }
}
