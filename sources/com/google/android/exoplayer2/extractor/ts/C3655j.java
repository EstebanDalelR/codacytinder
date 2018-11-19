package com.google.android.exoplayer2.extractor.ts;

import android.util.Log;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader.C2106c;
import com.google.android.exoplayer2.util.C2302k;

/* renamed from: com.google.android.exoplayer2.extractor.ts.j */
public final class C3655j implements ElementaryStreamReader {
    /* renamed from: a */
    private final C2302k f11263a = new C2302k(10);
    /* renamed from: b */
    private TrackOutput f11264b;
    /* renamed from: c */
    private boolean f11265c;
    /* renamed from: d */
    private long f11266d;
    /* renamed from: e */
    private int f11267e;
    /* renamed from: f */
    private int f11268f;

    public void seek() {
        this.f11265c = false;
    }

    public void createTracks(ExtractorOutput extractorOutput, C2106c c2106c) {
        c2106c.m7534a();
        this.f11264b = extractorOutput.track(c2106c.m7535b(), 4);
        this.f11264b.format(Format.createSampleFormat(c2106c.m7536c(), "application/id3", null, -1, null));
    }

    public void packetStarted(long j, boolean z) {
        if (z) {
            this.f11265c = true;
            this.f11266d = j;
            this.f11267e = 0;
            this.f11268f = 0;
        }
    }

    public void consume(C2302k c2302k) {
        if (this.f11265c) {
            int b = c2302k.m8385b();
            if (this.f11268f < 10) {
                int min = Math.min(b, 10 - this.f11268f);
                System.arraycopy(c2302k.f6929a, c2302k.m8389d(), this.f11263a.f6929a, this.f11268f, min);
                if (this.f11268f + min == 10) {
                    this.f11263a.m8388c(0);
                    if (73 == this.f11263a.m8395g() && 68 == this.f11263a.m8395g()) {
                        if (51 == this.f11263a.m8395g()) {
                            this.f11263a.m8390d(3);
                            this.f11267e = this.f11263a.m8408t() + 10;
                        }
                    }
                    Log.w("Id3Reader", "Discarding invalid ID3 tag");
                    this.f11265c = false;
                    return;
                }
            }
            b = Math.min(b, this.f11267e - this.f11268f);
            this.f11264b.sampleData(c2302k, b);
            this.f11268f += b;
        }
    }

    public void packetFinished() {
        if (this.f11265c && this.f11267e != 0) {
            if (this.f11268f == this.f11267e) {
                this.f11264b.sampleMetadata(this.f11266d, 1, this.f11267e, 0, null);
                this.f11265c = false;
            }
        }
    }
}
