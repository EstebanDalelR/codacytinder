package com.google.android.exoplayer2;

import android.support.annotation.Nullable;
import com.google.android.exoplayer2.util.C3726p;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.MediaClock;

final class DefaultMediaClock implements MediaClock {
    /* renamed from: a */
    private final C3726p f10689a;
    /* renamed from: b */
    private final PlaybackParameterListener f10690b;
    @Nullable
    /* renamed from: c */
    private Renderer f10691c;
    @Nullable
    /* renamed from: d */
    private MediaClock f10692d;

    public interface PlaybackParameterListener {
        void onPlaybackParametersChanged(C2153n c2153n);
    }

    public DefaultMediaClock(PlaybackParameterListener playbackParameterListener, Clock clock) {
        this.f10690b = playbackParameterListener;
        this.f10689a = new C3726p(clock);
    }

    /* renamed from: a */
    public void m13441a() {
        this.f10689a.m14149a();
    }

    /* renamed from: b */
    public void m13444b() {
        this.f10689a.m14151b();
    }

    /* renamed from: a */
    public void m13442a(long j) {
        this.f10689a.m14150a(j);
    }

    /* renamed from: a */
    public void m13443a(Renderer renderer) throws ExoPlaybackException {
        MediaClock mediaClock = renderer.getMediaClock();
        if (mediaClock != null && mediaClock != this.f10692d) {
            if (this.f10692d != null) {
                throw ExoPlaybackException.m7219a(new IllegalStateException("Multiple renderer media clocks enabled."));
            }
            this.f10692d = mediaClock;
            this.f10691c = renderer;
            this.f10692d.setPlaybackParameters(this.f10689a.getPlaybackParameters());
            m13439d();
        }
    }

    /* renamed from: b */
    public void m13445b(Renderer renderer) {
        if (renderer == this.f10691c) {
            this.f10692d = null;
            this.f10691c = null;
        }
    }

    /* renamed from: c */
    public long m13446c() {
        if (!m13440e()) {
            return this.f10689a.getPositionUs();
        }
        m13439d();
        return this.f10692d.getPositionUs();
    }

    public long getPositionUs() {
        if (m13440e()) {
            return this.f10692d.getPositionUs();
        }
        return this.f10689a.getPositionUs();
    }

    public C2153n setPlaybackParameters(C2153n c2153n) {
        if (this.f10692d != null) {
            c2153n = this.f10692d.setPlaybackParameters(c2153n);
        }
        this.f10689a.setPlaybackParameters(c2153n);
        this.f10690b.onPlaybackParametersChanged(c2153n);
        return c2153n;
    }

    public C2153n getPlaybackParameters() {
        if (this.f10692d != null) {
            return this.f10692d.getPlaybackParameters();
        }
        return this.f10689a.getPlaybackParameters();
    }

    /* renamed from: d */
    private void m13439d() {
        this.f10689a.m14150a(this.f10692d.getPositionUs());
        C2153n playbackParameters = this.f10692d.getPlaybackParameters();
        if (!playbackParameters.equals(this.f10689a.getPlaybackParameters())) {
            this.f10689a.setPlaybackParameters(playbackParameters);
            this.f10690b.onPlaybackParametersChanged(playbackParameters);
        }
    }

    /* renamed from: e */
    private boolean m13440e() {
        return (this.f10691c == null || this.f10691c.isEnded() || (!this.f10691c.isReady() && this.f10691c.hasReadStreamToEnd())) ? false : true;
    }
}
