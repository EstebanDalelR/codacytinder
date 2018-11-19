package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader.C2106c;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2310s;

/* renamed from: com.google.android.exoplayer2.extractor.ts.r */
public final class C3662r implements SectionPayloadReader {
    /* renamed from: a */
    private C2310s f11327a;
    /* renamed from: b */
    private TrackOutput f11328b;
    /* renamed from: c */
    private boolean f11329c;

    public void init(C2310s c2310s, ExtractorOutput extractorOutput, C2106c c2106c) {
        this.f11327a = c2310s;
        c2106c.m7534a();
        this.f11328b = extractorOutput.track(c2106c.m7535b(), 4);
        this.f11328b.format(Format.createSampleFormat(c2106c.m7536c(), "application/x-scte35", null, -1, null));
    }

    public void consume(C2302k c2302k) {
        if (!this.f11329c) {
            if (this.f11327a.m8442c() != -9223372036854775807L) {
                this.f11328b.format(Format.createSampleFormat(null, "application/x-scte35", this.f11327a.m8442c()));
                this.f11329c = true;
            } else {
                return;
            }
        }
        int b = c2302k.m8385b();
        this.f11328b.sampleData(c2302k, b);
        this.f11328b.sampleMetadata(this.f11327a.m8440b(), 1, b, 0, null);
    }
}
