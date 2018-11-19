package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader.C2106c;
import com.google.android.exoplayer2.text.p065a.C2223f;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2302k;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.extractor.ts.q */
final class C2114q {
    /* renamed from: a */
    private final List<Format> f6041a;
    /* renamed from: b */
    private final TrackOutput[] f6042b;

    public C2114q(List<Format> list) {
        this.f6041a = list;
        this.f6042b = new TrackOutput[list.size()];
    }

    /* renamed from: a */
    public void m7569a(ExtractorOutput extractorOutput, C2106c c2106c) {
        for (int i = 0; i < this.f6042b.length; i++) {
            boolean z;
            StringBuilder stringBuilder;
            c2106c.m7534a();
            TrackOutput track = extractorOutput.track(c2106c.m7535b(), 3);
            Format format = (Format) this.f6041a.get(i);
            String str = format.sampleMimeType;
            if (!"application/cea-608".equals(str)) {
                if (!"application/cea-708".equals(str)) {
                    z = false;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid closed caption mime type provided: ");
                    stringBuilder.append(str);
                    C2289a.m8312a(z, stringBuilder.toString());
                    track.format(Format.createTextSampleFormat(format.id == null ? format.id : c2106c.m7536c(), str, null, -1, format.selectionFlags, format.language, format.accessibilityChannel, null));
                    this.f6042b[i] = track;
                }
            }
            z = true;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid closed caption mime type provided: ");
            stringBuilder.append(str);
            C2289a.m8312a(z, stringBuilder.toString());
            if (format.id == null) {
            }
            track.format(Format.createTextSampleFormat(format.id == null ? format.id : c2106c.m7536c(), str, null, -1, format.selectionFlags, format.language, format.accessibilityChannel, null));
            this.f6042b[i] = track;
        }
    }

    /* renamed from: a */
    public void m7568a(long j, C2302k c2302k) {
        C2223f.m7958a(j, c2302k, this.f6042b);
    }
}
