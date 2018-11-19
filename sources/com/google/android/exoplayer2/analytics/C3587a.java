package com.google.android.exoplayer2.analytics;

import android.support.annotation.Nullable;
import android.view.Surface;
import com.google.android.exoplayer2.C2153n;
import com.google.android.exoplayer2.C2165q;
import com.google.android.exoplayer2.C2165q.C2163a;
import com.google.android.exoplayer2.C2165q.C2164b;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Player.EventListener;
import com.google.android.exoplayer2.analytics.AnalyticsListener.C2009a;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.C2037c;
import com.google.android.exoplayer2.drm.DefaultDrmSessionEventListener;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.source.MediaSource.C2166a;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.MediaSourceEventListener.C2178b;
import com.google.android.exoplayer2.source.MediaSourceEventListener.C2179c;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.C2255e;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.exoplayer2.analytics.a */
public class C3587a implements EventListener, AudioRendererEventListener, DefaultDrmSessionEventListener, MetadataOutput, MediaSourceEventListener, BandwidthMeter.EventListener, VideoRendererEventListener {
    /* renamed from: a */
    private final CopyOnWriteArraySet<AnalyticsListener> f10698a = new CopyOnWriteArraySet();
    /* renamed from: b */
    private final Player f10699b;
    /* renamed from: c */
    private final Clock f10700c;
    /* renamed from: d */
    private final C2164b f10701d = new C2164b();
    /* renamed from: e */
    private final C2011b f10702e = new C2011b();

    /* renamed from: com.google.android.exoplayer2.analytics.a$a */
    public static class C2010a {
        /* renamed from: a */
        public C3587a m7236a(Player player, Clock clock) {
            return new C3587a(player, clock);
        }
    }

    /* renamed from: com.google.android.exoplayer2.analytics.a$b */
    private static final class C2011b {
        /* renamed from: a */
        private final ArrayList<C2012c> f5477a = new ArrayList();
        /* renamed from: b */
        private final C2163a f5478b = new C2163a();
        /* renamed from: c */
        private C2012c f5479c;
        /* renamed from: d */
        private C2012c f5480d;
        /* renamed from: e */
        private C2165q f5481e = C2165q.f6219a;
        /* renamed from: f */
        private boolean f5482f;

        @Nullable
        /* renamed from: a */
        public C2012c m7240a() {
            if (!(this.f5477a.isEmpty() || this.f5481e.m7802a())) {
                if (!this.f5482f) {
                    return (C2012c) this.f5477a.get(0);
                }
            }
            return null;
        }

        @Nullable
        /* renamed from: b */
        public C2012c m7244b() {
            return this.f5479c;
        }

        @Nullable
        /* renamed from: c */
        public C2012c m7247c() {
            return this.f5480d;
        }

        @Nullable
        /* renamed from: d */
        public C2012c m7249d() {
            if (this.f5477a.isEmpty()) {
                return null;
            }
            return (C2012c) this.f5477a.get(this.f5477a.size() - 1);
        }

        /* renamed from: e */
        public boolean m7250e() {
            return this.f5482f;
        }

        @Nullable
        /* renamed from: a */
        public C2166a m7241a(int i) {
            C2166a c2166a = null;
            if (this.f5481e != null) {
                int c = this.f5481e.mo2319c();
                C2166a c2166a2 = null;
                for (int i2 = 0; i2 < this.f5477a.size(); i2++) {
                    C2012c c2012c = (C2012c) this.f5477a.get(i2);
                    int i3 = c2012c.f5484b.f6223a;
                    if (i3 < c && this.f5481e.m7797a(i3, this.f5478b).f6205c == i) {
                        if (c2166a2 != null) {
                            return null;
                        }
                        c2166a2 = c2012c.f5484b;
                    }
                }
                c2166a = c2166a2;
            }
            return c2166a;
        }

        /* renamed from: b */
        public void m7245b(int i) {
            m7239h();
        }

        /* renamed from: a */
        public void m7243a(C2165q c2165q) {
            for (int i = 0; i < this.f5477a.size(); i++) {
                this.f5477a.set(i, m7237a((C2012c) this.f5477a.get(i), c2165q));
            }
            if (this.f5480d != null) {
                this.f5480d = m7237a(this.f5480d, c2165q);
            }
            this.f5481e = c2165q;
            m7239h();
        }

        /* renamed from: f */
        public void m7251f() {
            this.f5482f = true;
        }

        /* renamed from: g */
        public void m7252g() {
            this.f5482f = false;
            m7239h();
        }

        /* renamed from: a */
        public void m7242a(int i, C2166a c2166a) {
            this.f5477a.add(new C2012c(i, c2166a));
            if (this.f5477a.size() == 1 && this.f5481e.m7802a() == 0) {
                m7239h();
            }
        }

        /* renamed from: b */
        public void m7246b(int i, C2166a c2166a) {
            C2012c c2012c = new C2012c(i, c2166a);
            this.f5477a.remove(c2012c);
            if (c2012c.equals(this.f5480d) != 0) {
                this.f5480d = this.f5477a.isEmpty() != 0 ? 0 : (C2012c) this.f5477a.get(null);
            }
        }

        /* renamed from: c */
        public void m7248c(int i, C2166a c2166a) {
            this.f5480d = new C2012c(i, c2166a);
        }

        /* renamed from: h */
        private void m7239h() {
            if (!this.f5477a.isEmpty()) {
                this.f5479c = (C2012c) this.f5477a.get(0);
            }
        }

        /* renamed from: a */
        private C2012c m7237a(C2012c c2012c, C2165q c2165q) {
            if (!c2165q.m7802a()) {
                if (!this.f5481e.m7802a()) {
                    int a = c2165q.mo2315a(this.f5481e.mo2316a(c2012c.f5484b.f6223a, this.f5478b, true).f6204b);
                    if (a == -1) {
                        return c2012c;
                    }
                    return new C2012c(c2165q.m7797a(a, this.f5478b).f6205c, c2012c.f5484b.m7820a(a));
                }
            }
            return c2012c;
        }
    }

    /* renamed from: com.google.android.exoplayer2.analytics.a$c */
    private static final class C2012c {
        /* renamed from: a */
        public final int f5483a;
        /* renamed from: b */
        public final C2166a f5484b;

        public C2012c(int i, C2166a c2166a) {
            this.f5483a = i;
            this.f5484b = c2166a;
        }

        public boolean equals(@Nullable Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    C2012c c2012c = (C2012c) obj;
                    if (this.f5483a != c2012c.f5483a || this.f5484b.equals(c2012c.f5484b) == null) {
                        z = false;
                    }
                    return z;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f5483a * 31) + this.f5484b.hashCode();
        }
    }

    protected C3587a(Player player, Clock clock) {
        this.f10699b = (Player) C2289a.m8309a((Object) player);
        this.f10700c = (Clock) C2289a.m8309a((Object) clock);
    }

    /* renamed from: a */
    public void m13461a(AnalyticsListener analyticsListener) {
        this.f10698a.add(analyticsListener);
    }

    /* renamed from: b */
    public void m13463b(AnalyticsListener analyticsListener) {
        this.f10698a.remove(analyticsListener);
    }

    /* renamed from: a */
    public final void m13460a() {
        if (!this.f10702e.m7250e()) {
            C2009a d = m13456d();
            this.f10702e.m7251f();
            Iterator it = this.f10698a.iterator();
            while (it.hasNext()) {
                ((AnalyticsListener) it.next()).onSeekStarted(d);
            }
        }
    }

    /* renamed from: b */
    public final void m13462b() {
        for (C2012c c2012c : new ArrayList(this.f10702e.f5477a)) {
            onMediaPeriodReleased(c2012c.f5483a, c2012c.f5484b);
        }
    }

    public final void onMetadata(Metadata metadata) {
        C2009a d = m13456d();
        Iterator it = this.f10698a.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).onMetadata(d, metadata);
        }
    }

    public final void onAudioEnabled(C2037c c2037c) {
        C2009a d = m13456d();
        Iterator it = this.f10698a.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).onDecoderEnabled(d, 1, c2037c);
        }
    }

    public final void onAudioSessionId(int i) {
        C2009a e = m13457e();
        Iterator it = this.f10698a.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).onAudioSessionId(e, i);
        }
    }

    public final void onAudioDecoderInitialized(String str, long j, long j2) {
        j = m13457e();
        Iterator it = this.f10698a.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).onDecoderInitialized(j, 1, str, j2);
        }
    }

    public final void onAudioInputFormatChanged(Format format) {
        C2009a e = m13457e();
        Iterator it = this.f10698a.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).onDecoderInputFormatChanged(e, 1, format);
        }
    }

    public final void onAudioSinkUnderrun(int i, long j, long j2) {
        C2009a e = m13457e();
        Iterator it = this.f10698a.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).onAudioUnderrun(e, i, j, j2);
        }
    }

    public final void onAudioDisabled(C2037c c2037c) {
        C2009a c = m13455c();
        Iterator it = this.f10698a.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).onDecoderDisabled(c, 1, c2037c);
        }
    }

    public final void onVideoEnabled(C2037c c2037c) {
        C2009a d = m13456d();
        Iterator it = this.f10698a.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).onDecoderEnabled(d, 2, c2037c);
        }
    }

    public final void onVideoDecoderInitialized(String str, long j, long j2) {
        j = m13457e();
        Iterator it = this.f10698a.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).onDecoderInitialized(j, 2, str, j2);
        }
    }

    public final void onVideoInputFormatChanged(Format format) {
        C2009a e = m13457e();
        Iterator it = this.f10698a.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).onDecoderInputFormatChanged(e, 2, format);
        }
    }

    public final void onDroppedFrames(int i, long j) {
        C2009a c = m13455c();
        Iterator it = this.f10698a.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).onDroppedVideoFrames(c, i, j);
        }
    }

    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
        C2009a e = m13457e();
        Iterator it = this.f10698a.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).onVideoSizeChanged(e, i, i2, i3, f);
        }
    }

    public final void onRenderedFirstFrame(Surface surface) {
        C2009a e = m13457e();
        Iterator it = this.f10698a.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).onRenderedFirstFrame(e, surface);
        }
    }

    public final void onVideoDisabled(C2037c c2037c) {
        C2009a c = m13455c();
        Iterator it = this.f10698a.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).onDecoderDisabled(c, 2, c2037c);
        }
    }

    public final void onMediaPeriodCreated(int i, C2166a c2166a) {
        this.f10702e.m7242a(i, c2166a);
        i = m13459a(i, c2166a);
        c2166a = this.f10698a.iterator();
        while (c2166a.hasNext()) {
            ((AnalyticsListener) c2166a.next()).onMediaPeriodCreated(i);
        }
    }

    public final void onMediaPeriodReleased(int i, C2166a c2166a) {
        this.f10702e.m7246b(i, c2166a);
        i = m13459a(i, c2166a);
        c2166a = this.f10698a.iterator();
        while (c2166a.hasNext()) {
            ((AnalyticsListener) c2166a.next()).onMediaPeriodReleased(i);
        }
    }

    public final void onLoadStarted(int i, @Nullable C2166a c2166a, C2178b c2178b, C2179c c2179c) {
        i = m13459a(i, c2166a);
        c2166a = this.f10698a.iterator();
        while (c2166a.hasNext()) {
            ((AnalyticsListener) c2166a.next()).onLoadStarted(i, c2178b, c2179c);
        }
    }

    public final void onLoadCompleted(int i, @Nullable C2166a c2166a, C2178b c2178b, C2179c c2179c) {
        i = m13459a(i, c2166a);
        c2166a = this.f10698a.iterator();
        while (c2166a.hasNext()) {
            ((AnalyticsListener) c2166a.next()).onLoadCompleted(i, c2178b, c2179c);
        }
    }

    public final void onLoadCanceled(int i, @Nullable C2166a c2166a, C2178b c2178b, C2179c c2179c) {
        i = m13459a(i, c2166a);
        c2166a = this.f10698a.iterator();
        while (c2166a.hasNext()) {
            ((AnalyticsListener) c2166a.next()).onLoadCanceled(i, c2178b, c2179c);
        }
    }

    public final void onLoadError(int i, @Nullable C2166a c2166a, C2178b c2178b, C2179c c2179c, IOException iOException, boolean z) {
        i = m13459a(i, c2166a);
        c2166a = this.f10698a.iterator();
        while (c2166a.hasNext()) {
            ((AnalyticsListener) c2166a.next()).onLoadError(i, c2178b, c2179c, iOException, z);
        }
    }

    public final void onReadingStarted(int i, C2166a c2166a) {
        this.f10702e.m7248c(i, c2166a);
        i = m13459a(i, c2166a);
        c2166a = this.f10698a.iterator();
        while (c2166a.hasNext()) {
            ((AnalyticsListener) c2166a.next()).onReadingStarted(i);
        }
    }

    public final void onUpstreamDiscarded(int i, @Nullable C2166a c2166a, C2179c c2179c) {
        i = m13459a(i, c2166a);
        c2166a = this.f10698a.iterator();
        while (c2166a.hasNext()) {
            ((AnalyticsListener) c2166a.next()).onUpstreamDiscarded(i, c2179c);
        }
    }

    public final void onDownstreamFormatChanged(int i, @Nullable C2166a c2166a, C2179c c2179c) {
        i = m13459a(i, c2166a);
        c2166a = this.f10698a.iterator();
        while (c2166a.hasNext()) {
            ((AnalyticsListener) c2166a.next()).onDownstreamFormatChanged(i, c2179c);
        }
    }

    public final void onTimelineChanged(C2165q c2165q, Object obj, int i) {
        this.f10702e.m7243a(c2165q);
        c2165q = m13456d();
        obj = this.f10698a.iterator();
        while (obj.hasNext()) {
            ((AnalyticsListener) obj.next()).onTimelineChanged(c2165q, i);
        }
    }

    public final void onTracksChanged(TrackGroupArray trackGroupArray, C2255e c2255e) {
        C2009a d = m13456d();
        Iterator it = this.f10698a.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).onTracksChanged(d, trackGroupArray, c2255e);
        }
    }

    public final void onLoadingChanged(boolean z) {
        C2009a d = m13456d();
        Iterator it = this.f10698a.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).onLoadingChanged(d, z);
        }
    }

    public final void onPlayerStateChanged(boolean z, int i) {
        C2009a d = m13456d();
        Iterator it = this.f10698a.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).onPlayerStateChanged(d, z, i);
        }
    }

    public final void onRepeatModeChanged(int i) {
        C2009a d = m13456d();
        Iterator it = this.f10698a.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).onRepeatModeChanged(d, i);
        }
    }

    public final void onShuffleModeEnabledChanged(boolean z) {
        C2009a d = m13456d();
        Iterator it = this.f10698a.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).onShuffleModeChanged(d, z);
        }
    }

    public final void onPlayerError(ExoPlaybackException exoPlaybackException) {
        C2009a d = m13456d();
        Iterator it = this.f10698a.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).onPlayerError(d, exoPlaybackException);
        }
    }

    public final void onPositionDiscontinuity(int i) {
        this.f10702e.m7245b(i);
        C2009a d = m13456d();
        Iterator it = this.f10698a.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).onPositionDiscontinuity(d, i);
        }
    }

    public final void onPlaybackParametersChanged(C2153n c2153n) {
        C2009a d = m13456d();
        Iterator it = this.f10698a.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).onPlaybackParametersChanged(d, c2153n);
        }
    }

    public final void onSeekProcessed() {
        if (this.f10702e.m7250e()) {
            this.f10702e.m7252g();
            C2009a d = m13456d();
            Iterator it = this.f10698a.iterator();
            while (it.hasNext()) {
                ((AnalyticsListener) it.next()).onSeekProcessed(d);
            }
        }
    }

    public final void onBandwidthSample(int i, long j, long j2) {
        C2009a f = m13458f();
        Iterator it = this.f10698a.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).onBandwidthEstimate(f, i, j, j2);
        }
    }

    public final void onDrmKeysLoaded() {
        C2009a e = m13457e();
        Iterator it = this.f10698a.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).onDrmKeysLoaded(e);
        }
    }

    public final void onDrmSessionManagerError(Exception exception) {
        C2009a e = m13457e();
        Iterator it = this.f10698a.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).onDrmSessionManagerError(e, exception);
        }
    }

    public final void onDrmKeysRestored() {
        C2009a e = m13457e();
        Iterator it = this.f10698a.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).onDrmKeysRestored(e);
        }
    }

    public final void onDrmKeysRemoved() {
        C2009a e = m13457e();
        Iterator it = this.f10698a.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).onDrmKeysRemoved(e);
        }
    }

    /* renamed from: a */
    protected C2009a m13459a(int i, @Nullable C2166a c2166a) {
        long a;
        long j;
        long elapsedRealtime = this.f10700c.elapsedRealtime();
        C2165q currentTimeline = this.f10699b.getCurrentTimeline();
        long j2 = 0;
        if (i != this.f10699b.getCurrentWindowIndex()) {
            if (i < currentTimeline.mo2318b()) {
                if (c2166a == null || !c2166a.m7821a()) {
                    a = currentTimeline.m7799a(i, this.f10701d).m7786a();
                }
            }
            j = j2;
            return new C2009a(elapsedRealtime, currentTimeline, i, c2166a, j, this.f10699b.getCurrentPosition(), this.f10699b.getBufferedPosition() - this.f10699b.getContentPosition());
        } else if (c2166a == null || !c2166a.m7821a()) {
            a = this.f10699b.getContentPosition();
        } else {
            if (this.f10699b.getCurrentAdGroupIndex() == c2166a.f6224b && this.f10699b.getCurrentAdIndexInAdGroup() == c2166a.f6225c) {
                j2 = this.f10699b.getCurrentPosition();
            }
            j = j2;
            return new C2009a(elapsedRealtime, currentTimeline, i, c2166a, j, this.f10699b.getCurrentPosition(), this.f10699b.getBufferedPosition() - this.f10699b.getContentPosition());
        }
        j = a;
        return new C2009a(elapsedRealtime, currentTimeline, i, c2166a, j, this.f10699b.getCurrentPosition(), this.f10699b.getBufferedPosition() - this.f10699b.getContentPosition());
    }

    /* renamed from: a */
    private C2009a m13454a(@Nullable C2012c c2012c) {
        if (c2012c != null) {
            return m13459a(c2012c.f5483a, c2012c.f5484b);
        }
        int currentWindowIndex = this.f10699b.getCurrentWindowIndex();
        return m13459a(currentWindowIndex, this.f10702e.m7241a(currentWindowIndex));
    }

    /* renamed from: c */
    private C2009a m13455c() {
        return m13454a(this.f10702e.m7244b());
    }

    /* renamed from: d */
    private C2009a m13456d() {
        return m13454a(this.f10702e.m7240a());
    }

    /* renamed from: e */
    private C2009a m13457e() {
        return m13454a(this.f10702e.m7247c());
    }

    /* renamed from: f */
    private C2009a m13458f() {
        return m13454a(this.f10702e.m7249d());
    }
}
