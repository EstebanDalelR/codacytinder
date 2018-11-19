package com.google.android.exoplayer2.source.chunk;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.C3623d;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.TrackOutput.C2055a;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2302k;
import java.io.IOException;

public final class ChunkExtractorWrapper implements ExtractorOutput {
    /* renamed from: a */
    private final int f11381a;
    /* renamed from: b */
    private final Format f11382b;
    /* renamed from: c */
    private final SparseArray<C3677a> f11383c;
    /* renamed from: d */
    private TrackOutputProvider f11384d;
    /* renamed from: e */
    private SeekMap f11385e;
    /* renamed from: f */
    private Format[] f11386f;

    public interface TrackOutputProvider {
        TrackOutput track(int i, int i2);
    }

    /* renamed from: com.google.android.exoplayer2.source.chunk.ChunkExtractorWrapper$a */
    private static final class C3677a implements TrackOutput {
        /* renamed from: a */
        public Format f11376a;
        /* renamed from: b */
        private final int f11377b;
        /* renamed from: c */
        private final int f11378c;
        /* renamed from: d */
        private final Format f11379d;
        /* renamed from: e */
        private TrackOutput f11380e;

        public C3677a(int i, int i2, Format format) {
            this.f11377b = i;
            this.f11378c = i2;
            this.f11379d = format;
        }

        /* renamed from: a */
        public void m13918a(TrackOutputProvider trackOutputProvider) {
            if (trackOutputProvider == null) {
                this.f11380e = new C3623d();
                return;
            }
            this.f11380e = trackOutputProvider.track(this.f11377b, this.f11378c);
            if (this.f11376a != null) {
                this.f11380e.format(this.f11376a);
            }
        }

        public void format(Format format) {
            if (this.f11379d != null) {
                format = format.copyWithManifestFormatInfo(this.f11379d);
            }
            this.f11376a = format;
            this.f11380e.format(this.f11376a);
        }

        public int sampleData(ExtractorInput extractorInput, int i, boolean z) throws IOException, InterruptedException {
            return this.f11380e.sampleData(extractorInput, i, z);
        }

        public void sampleData(C2302k c2302k, int i) {
            this.f11380e.sampleData(c2302k, i);
        }

        public void sampleMetadata(long j, int i, int i2, int i3, C2055a c2055a) {
            this.f11380e.sampleMetadata(j, i, i2, i3, c2055a);
        }
    }

    public TrackOutput track(int i, int i2) {
        TrackOutput trackOutput = (C3677a) this.f11383c.get(i);
        if (trackOutput == null) {
            C2289a.m8313b(this.f11386f == null);
            trackOutput = new C3677a(i, i2, i2 == this.f11381a ? this.f11382b : null);
            trackOutput.m13918a(this.f11384d);
            this.f11383c.put(i, trackOutput);
        }
        return trackOutput;
    }

    public void endTracks() {
        Format[] formatArr = new Format[this.f11383c.size()];
        for (int i = 0; i < this.f11383c.size(); i++) {
            formatArr[i] = ((C3677a) this.f11383c.valueAt(i)).f11376a;
        }
        this.f11386f = formatArr;
    }

    public void seekMap(SeekMap seekMap) {
        this.f11385e = seekMap;
    }
}
