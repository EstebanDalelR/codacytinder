package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.TrackGroupArray;

public abstract class TrackSelector {
    /* renamed from: a */
    private InvalidationListener f6677a;

    public interface InvalidationListener {
        void onTrackSelectionsInvalidated();
    }

    /* renamed from: a */
    public abstract C2256f mo2390a(RendererCapabilities[] rendererCapabilitiesArr, TrackGroupArray trackGroupArray) throws ExoPlaybackException;

    /* renamed from: a */
    public abstract void mo2391a(Object obj);

    /* renamed from: a */
    public final void m8113a(InvalidationListener invalidationListener) {
        this.f6677a = invalidationListener;
    }

    /* renamed from: d */
    protected final void m8115d() {
        if (this.f6677a != null) {
            this.f6677a.onTrackSelectionsInvalidated();
        }
    }
}
