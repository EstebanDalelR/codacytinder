package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.C2122i;
import com.google.android.exoplayer2.C2162p;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.MediaPeriod.Callback;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2297h;
import com.google.android.exoplayer2.util.C2314v;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.source.c */
public final class C4247c implements MediaPeriod, Callback {
    /* renamed from: a */
    public final MediaPeriod f13670a;
    /* renamed from: b */
    long f13671b;
    /* renamed from: c */
    long f13672c;
    /* renamed from: d */
    private Callback f13673d;
    /* renamed from: e */
    private C3676a[] f13674e = new C3676a[null];
    /* renamed from: f */
    private long f13675f;

    /* renamed from: com.google.android.exoplayer2.source.c$a */
    private final class C3676a implements SampleStream {
        /* renamed from: a */
        public final SampleStream f11373a;
        /* renamed from: b */
        final /* synthetic */ C4247c f11374b;
        /* renamed from: c */
        private boolean f11375c;

        public C3676a(C4247c c4247c, SampleStream sampleStream) {
            this.f11374b = c4247c;
            this.f11373a = sampleStream;
        }

        /* renamed from: a */
        public void m13917a() {
            this.f11375c = false;
        }

        public boolean isReady() {
            return !this.f11374b.m16946a() && this.f11373a.isReady();
        }

        public void maybeThrowError() throws IOException {
            this.f11373a.maybeThrowError();
        }

        public int readData(C2122i c2122i, DecoderInputBuffer decoderInputBuffer, boolean z) {
            if (this.f11374b.m16946a()) {
                return -3;
            }
            if (this.f11375c) {
                decoderInputBuffer.m7340a(4);
                return -4;
            }
            z = this.f11373a.readData(c2122i, decoderInputBuffer, z);
            if (z) {
                decoderInputBuffer = c2122i.f6062a;
                if (decoderInputBuffer.encoderDelay || decoderInputBuffer.encoderPadding) {
                    int i = 0;
                    z = this.f11374b.f13671b != 0 ? false : decoderInputBuffer.encoderDelay;
                    if (this.f11374b.f13672c == Long.MIN_VALUE) {
                        i = decoderInputBuffer.encoderPadding;
                    }
                    c2122i.f6062a = decoderInputBuffer.copyWithGaplessInfo(z, i);
                }
                return -5;
            } else if (this.f11374b.f13672c == Long.MIN_VALUE || ((!z || decoderInputBuffer.f10831c < this.f11374b.f13672c) && (!z || this.f11374b.getBufferedPositionUs() != Long.MIN_VALUE))) {
                return z;
            } else {
                decoderInputBuffer.mo2221a();
                decoderInputBuffer.m7340a(4);
                this.f11375c = true;
                return -4;
            }
        }

        public int skipData(long j) {
            if (this.f11374b.m16946a()) {
                return -3;
            }
            return this.f11373a.skipData(j);
        }
    }

    public /* synthetic */ void onContinueLoadingRequested(SequenceableLoader sequenceableLoader) {
        m16945a((MediaPeriod) sequenceableLoader);
    }

    public C4247c(MediaPeriod mediaPeriod, boolean z, long j, long j2) {
        this.f13670a = mediaPeriod;
        this.f13675f = z ? j : 1;
        this.f13671b = j;
        this.f13672c = j2;
    }

    /* renamed from: a */
    public void m16944a(long j, long j2) {
        this.f13671b = j;
        this.f13672c = j2;
    }

    public void prepare(Callback callback, long j) {
        this.f13673d = callback;
        this.f13670a.prepare(this, j);
    }

    public void maybeThrowPrepareError() throws IOException {
        this.f13670a.maybeThrowPrepareError();
    }

    public TrackGroupArray getTrackGroups() {
        return this.f13670a.getTrackGroups();
    }

    public long selectTracks(TrackSelection[] trackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        boolean z;
        SampleStream[] sampleStreamArr2 = sampleStreamArr;
        this.f13674e = new C3676a[sampleStreamArr2.length];
        SampleStream[] sampleStreamArr3 = new SampleStream[sampleStreamArr2.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            SampleStream sampleStream = null;
            if (i2 >= sampleStreamArr2.length) {
                break;
            }
            r0.f13674e[i2] = (C3676a) sampleStreamArr2[i2];
            if (r0.f13674e[i2] != null) {
                sampleStream = r0.f13674e[i2].f11373a;
            }
            sampleStreamArr3[i2] = sampleStream;
            i2++;
        }
        long selectTracks = r0.f13670a.selectTracks(trackSelectionArr, zArr, sampleStreamArr3, zArr2, j);
        long j2 = (m16946a() && j == r0.f13671b && C4247c.m16943a(r0.f13671b, trackSelectionArr)) ? selectTracks : -9223372036854775807L;
        r0.f13675f = j2;
        if (selectTracks != j) {
            if (selectTracks >= r0.f13671b) {
                if (r0.f13672c != Long.MIN_VALUE) {
                    if (selectTracks <= r0.f13672c) {
                    }
                }
            }
            z = false;
            C2289a.m8313b(z);
            while (i < sampleStreamArr2.length) {
                if (sampleStreamArr3[i] != null) {
                    r0.f13674e[i] = null;
                } else if (sampleStreamArr2[i] != null || r0.f13674e[i].f11373a != sampleStreamArr3[i]) {
                    r0.f13674e[i] = new C3676a(r0, sampleStreamArr3[i]);
                }
                sampleStreamArr2[i] = r0.f13674e[i];
                i++;
            }
            return selectTracks;
        }
        z = true;
        C2289a.m8313b(z);
        while (i < sampleStreamArr2.length) {
            if (sampleStreamArr3[i] != null) {
                if (sampleStreamArr2[i] != null) {
                }
                r0.f13674e[i] = new C3676a(r0, sampleStreamArr3[i]);
            } else {
                r0.f13674e[i] = null;
            }
            sampleStreamArr2[i] = r0.f13674e[i];
            i++;
        }
        return selectTracks;
    }

    public void discardBuffer(long j, boolean z) {
        this.f13670a.discardBuffer(j, z);
    }

    public void reevaluateBuffer(long j) {
        this.f13670a.reevaluateBuffer(j);
    }

    public long readDiscontinuity() {
        long j;
        if (m16946a()) {
            j = this.f13675f;
            this.f13675f = -9223372036854775807L;
            long readDiscontinuity = readDiscontinuity();
            if (readDiscontinuity != -9223372036854775807L) {
                j = readDiscontinuity;
            }
            return j;
        }
        j = this.f13670a.readDiscontinuity();
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = false;
        C2289a.m8313b(j >= this.f13671b);
        if (this.f13672c == Long.MIN_VALUE || j <= this.f13672c) {
            z = true;
        }
        C2289a.m8313b(z);
        return j;
    }

    public long getBufferedPositionUs() {
        long bufferedPositionUs = this.f13670a.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            if (this.f13672c == Long.MIN_VALUE || bufferedPositionUs < this.f13672c) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    public long seekToUs(long j) {
        this.f13675f = -9223372036854775807L;
        boolean z = false;
        for (C3676a c3676a : this.f13674e) {
            if (c3676a != null) {
                c3676a.m13917a();
            }
        }
        long seekToUs = this.f13670a.seekToUs(j);
        if (seekToUs == j || (seekToUs >= this.f13671b && (this.f13672c == Long.MIN_VALUE || seekToUs <= this.f13672c))) {
            z = true;
        }
        C2289a.m8313b(z);
        return seekToUs;
    }

    public long getAdjustedSeekPositionUs(long j, C2162p c2162p) {
        if (j == this.f13671b) {
            return this.f13671b;
        }
        return this.f13670a.getAdjustedSeekPositionUs(j, m16942a(j, c2162p));
    }

    public long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f13670a.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            if (this.f13672c == Long.MIN_VALUE || nextLoadPositionUs < this.f13672c) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    public boolean continueLoading(long j) {
        return this.f13670a.continueLoading(j);
    }

    public void onPrepared(MediaPeriod mediaPeriod) {
        this.f13673d.onPrepared(this);
    }

    /* renamed from: a */
    public void m16945a(MediaPeriod mediaPeriod) {
        this.f13673d.onContinueLoadingRequested(this);
    }

    /* renamed from: a */
    boolean m16946a() {
        return this.f13675f != -9223372036854775807L;
    }

    /* renamed from: a */
    private C2162p m16942a(long j, C2162p c2162p) {
        long a = C2314v.m8462a(c2162p.f6201f, 0, j - this.f13671b);
        j = C2314v.m8462a(c2162p.f6202g, 0, this.f13672c == Long.MIN_VALUE ? Format.OFFSET_SAMPLE_RELATIVE : this.f13672c - j);
        if (a == c2162p.f6201f && j == c2162p.f6202g) {
            return c2162p;
        }
        return new C2162p(a, j);
    }

    /* renamed from: a */
    private static boolean m16943a(long j, TrackSelection[] trackSelectionArr) {
        if (j != 0) {
            for (TrackSelection trackSelection : trackSelectionArr) {
                if (trackSelection != null && !C2297h.m8342a(trackSelection.getSelectedFormat().sampleMimeType)) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
