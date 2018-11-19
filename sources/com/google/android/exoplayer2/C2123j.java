package com.google.android.exoplayer2;

import android.util.Log;
import com.google.android.exoplayer2.source.C3687f;
import com.google.android.exoplayer2.source.C4247c;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.C2256f;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.C2289a;

/* renamed from: com.google.android.exoplayer2.j */
final class C2123j {
    /* renamed from: a */
    public final MediaPeriod f6063a;
    /* renamed from: b */
    public final Object f6064b;
    /* renamed from: c */
    public final SampleStream[] f6065c;
    /* renamed from: d */
    public final boolean[] f6066d;
    /* renamed from: e */
    public long f6067e;
    /* renamed from: f */
    public boolean f6068f;
    /* renamed from: g */
    public boolean f6069g;
    /* renamed from: h */
    public C2124k f6070h;
    /* renamed from: i */
    public C2123j f6071i;
    /* renamed from: j */
    public TrackGroupArray f6072j;
    /* renamed from: k */
    public C2256f f6073k;
    /* renamed from: l */
    private final RendererCapabilities[] f6074l;
    /* renamed from: m */
    private final TrackSelector f6075m;
    /* renamed from: n */
    private final MediaSource f6076n;
    /* renamed from: o */
    private C2256f f6077o;

    public C2123j(RendererCapabilities[] rendererCapabilitiesArr, long j, TrackSelector trackSelector, Allocator allocator, MediaSource mediaSource, Object obj, C2124k c2124k) {
        this.f6074l = rendererCapabilitiesArr;
        this.f6067e = j - c2124k.f6079b;
        this.f6075m = trackSelector;
        this.f6076n = mediaSource;
        this.f6064b = C2289a.m8309a(obj);
        this.f6070h = c2124k;
        this.f6065c = new SampleStream[rendererCapabilitiesArr.length];
        this.f6066d = new boolean[rendererCapabilitiesArr.length];
        MediaPeriod createPeriod = mediaSource.createPeriod(c2124k.f6078a, allocator);
        if (c2124k.f6080c != 0) {
            j = new C4247c(createPeriod, true, null, c2124k.f6080c);
        } else {
            rendererCapabilitiesArr = createPeriod;
        }
        this.f6063a = rendererCapabilitiesArr;
    }

    /* renamed from: a */
    public long m7587a(long j) {
        return j + m7586a();
    }

    /* renamed from: b */
    public long m7592b(long j) {
        return j - m7586a();
    }

    /* renamed from: a */
    public long m7586a() {
        return this.f6067e;
    }

    /* renamed from: b */
    public boolean m7593b() {
        return this.f6068f && (!this.f6069g || this.f6063a.getBufferedPositionUs() == Long.MIN_VALUE);
    }

    /* renamed from: a */
    public long m7590a(boolean z) {
        if (!this.f6068f) {
            return this.f6070h.f6079b;
        }
        long bufferedPositionUs = this.f6063a.getBufferedPositionUs();
        if (bufferedPositionUs == Long.MIN_VALUE && z) {
            bufferedPositionUs = this.f6070h.f6082e;
        }
        return bufferedPositionUs;
    }

    /* renamed from: c */
    public long m7595c() {
        return !this.f6068f ? 0 : this.f6063a.getNextLoadPositionUs();
    }

    /* renamed from: a */
    public void m7591a(float f) throws ExoPlaybackException {
        this.f6068f = true;
        this.f6072j = this.f6063a.getTrackGroups();
        m7594b(f);
        long a = m7588a(this.f6070h.f6079b, 0.0f);
        this.f6067e += this.f6070h.f6079b - a;
        this.f6070h = this.f6070h.m7600a(a);
    }

    /* renamed from: c */
    public void m7596c(long j) {
        if (this.f6068f) {
            this.f6063a.reevaluateBuffer(m7592b(j));
        }
    }

    /* renamed from: d */
    public void m7598d(long j) {
        this.f6063a.continueLoading(m7592b(j));
    }

    /* renamed from: b */
    public boolean m7594b(float f) throws ExoPlaybackException {
        C2256f a = this.f6075m.mo2390a(this.f6074l, this.f6072j);
        int i = 0;
        if (a.m8126a(this.f6077o)) {
            return false;
        }
        this.f6073k = a;
        TrackSelection[] a2 = this.f6073k.f6690c.m8124a();
        int length = a2.length;
        while (i < length) {
            TrackSelection trackSelection = a2[i];
            if (trackSelection != null) {
                trackSelection.onPlaybackSpeed(f);
            }
            i++;
        }
        return true;
    }

    /* renamed from: a */
    public long m7588a(long j, boolean z) {
        return m7589a(j, z, new boolean[this.f6074l.length]);
    }

    /* renamed from: a */
    public long m7589a(long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= this.f6073k.f6688a) {
                break;
            }
            boolean[] zArr2 = this.f6066d;
            if (z || !this.f6073k.m8127a(this.f6077o, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        m7582a(this.f6065c);
        m7581a(this.f6073k);
        z = this.f6073k.f6690c;
        j = this.f6063a.selectTracks(z.m8124a(), this.f6066d, this.f6065c, zArr, j);
        m7584b(this.f6065c);
        this.f6069g = false;
        for (int i2 = null; i2 < this.f6065c.length; i2++) {
            if (this.f6065c[i2] != null) {
                C2289a.m8313b(this.f6073k.m8125a(i2));
                if (this.f6074l[i2].getTrackType() != 5) {
                    this.f6069g = true;
                }
            } else {
                C2289a.m8313b(z.m8123a(i2) == null);
            }
        }
        return j;
    }

    /* renamed from: d */
    public void m7597d() {
        m7581a(null);
        try {
            if (this.f6070h.f6080c != Long.MIN_VALUE) {
                this.f6076n.releasePeriod(((C4247c) this.f6063a).f13670a);
            } else {
                this.f6076n.releasePeriod(this.f6063a);
            }
        } catch (Throwable e) {
            Log.e("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* renamed from: a */
    private void m7581a(C2256f c2256f) {
        if (this.f6077o != null) {
            m7585c(this.f6077o);
        }
        this.f6077o = c2256f;
        if (this.f6077o != null) {
            m7583b(this.f6077o);
        }
    }

    /* renamed from: b */
    private void m7583b(C2256f c2256f) {
        for (int i = 0; i < c2256f.f6688a; i++) {
            boolean a = c2256f.m8125a(i);
            TrackSelection a2 = c2256f.f6690c.m8123a(i);
            if (a && a2 != null) {
                a2.enable();
            }
        }
    }

    /* renamed from: c */
    private void m7585c(C2256f c2256f) {
        for (int i = 0; i < c2256f.f6688a; i++) {
            boolean a = c2256f.m8125a(i);
            TrackSelection a2 = c2256f.f6690c.m8123a(i);
            if (a && a2 != null) {
                a2.disable();
            }
        }
    }

    /* renamed from: a */
    private void m7582a(SampleStream[] sampleStreamArr) {
        for (int i = 0; i < this.f6074l.length; i++) {
            if (this.f6074l[i].getTrackType() == 5) {
                sampleStreamArr[i] = null;
            }
        }
    }

    /* renamed from: b */
    private void m7584b(SampleStream[] sampleStreamArr) {
        int i = 0;
        while (i < this.f6074l.length) {
            if (this.f6074l[i].getTrackType() == 5 && this.f6073k.m8125a(i)) {
                sampleStreamArr[i] = new C3687f();
            }
            i++;
        }
    }
}
