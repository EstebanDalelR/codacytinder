package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader.C2104a;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader.C2106c;
import com.google.android.exoplayer2.util.C2302k;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.extractor.ts.f */
public final class C3651f implements ElementaryStreamReader {
    /* renamed from: a */
    private final List<C2104a> f11215a;
    /* renamed from: b */
    private final TrackOutput[] f11216b;
    /* renamed from: c */
    private boolean f11217c;
    /* renamed from: d */
    private int f11218d;
    /* renamed from: e */
    private int f11219e;
    /* renamed from: f */
    private long f11220f;

    public C3651f(List<C2104a> list) {
        this.f11215a = list;
        this.f11216b = new TrackOutput[list.size()];
    }

    public void seek() {
        this.f11217c = false;
    }

    public void createTracks(ExtractorOutput extractorOutput, C2106c c2106c) {
        for (int i = 0; i < this.f11216b.length; i++) {
            C2104a c2104a = (C2104a) this.f11215a.get(i);
            c2106c.m7534a();
            TrackOutput track = extractorOutput.track(c2106c.m7535b(), 3);
            track.format(Format.createImageSampleFormat(c2106c.m7536c(), "application/dvbsubs", null, -1, 0, Collections.singletonList(c2104a.f5966c), c2104a.f5964a, null));
            this.f11216b[i] = track;
        }
    }

    public void packetStarted(long j, boolean z) {
        if (z) {
            this.f11217c = true;
            this.f11220f = j;
            this.f11219e = 0;
            this.f11218d = 2;
        }
    }

    public void packetFinished() {
        if (this.f11217c) {
            for (TrackOutput sampleMetadata : this.f11216b) {
                sampleMetadata.sampleMetadata(this.f11220f, 1, this.f11219e, 0, null);
            }
            this.f11217c = false;
        }
    }

    public void consume(C2302k c2302k) {
        if (this.f11217c && (this.f11218d != 2 || m13795a(c2302k, 32))) {
            int i = 0;
            if (this.f11218d != 1 || m13795a(c2302k, 0)) {
                int d = c2302k.m8389d();
                int b = c2302k.m8385b();
                TrackOutput[] trackOutputArr = this.f11216b;
                int length = trackOutputArr.length;
                while (i < length) {
                    TrackOutput trackOutput = trackOutputArr[i];
                    c2302k.m8388c(d);
                    trackOutput.sampleData(c2302k, b);
                    i++;
                }
                this.f11219e += b;
            }
        }
    }

    /* renamed from: a */
    private boolean m13795a(C2302k c2302k, int i) {
        if (c2302k.m8385b() == 0) {
            return false;
        }
        if (c2302k.m8395g() != i) {
            this.f11217c = false;
        }
        this.f11218d--;
        return this.f11217c;
    }
}
