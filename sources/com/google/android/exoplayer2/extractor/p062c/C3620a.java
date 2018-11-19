package com.google.android.exoplayer2.extractor.p062c;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.C2075h;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.TrackOutput;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.extractor.c.a */
public final class C3620a implements Extractor {
    /* renamed from: a */
    public static final ExtractorsFactory f10945a = new C36191();
    /* renamed from: b */
    private ExtractorOutput f10946b;
    /* renamed from: c */
    private TrackOutput f10947c;
    /* renamed from: d */
    private C3621b f10948d;
    /* renamed from: e */
    private int f10949e;
    /* renamed from: f */
    private int f10950f;

    /* renamed from: com.google.android.exoplayer2.extractor.c.a$1 */
    static class C36191 implements ExtractorsFactory {
        C36191() {
        }

        public Extractor[] createExtractors() {
            return new Extractor[]{new C3620a()};
        }
    }

    public void release() {
    }

    public boolean sniff(ExtractorInput extractorInput) throws IOException, InterruptedException {
        return C2071c.m7415a(extractorInput) != null ? true : null;
    }

    public void init(ExtractorOutput extractorOutput) {
        this.f10946b = extractorOutput;
        this.f10947c = extractorOutput.track(0, 1);
        this.f10948d = null;
        extractorOutput.endTracks();
    }

    public void seek(long j, long j2) {
        this.f10950f = 0;
    }

    public int read(ExtractorInput extractorInput, C2075h c2075h) throws IOException, InterruptedException {
        ExtractorInput extractorInput2 = extractorInput;
        if (this.f10948d == null) {
            r0.f10948d = C2071c.m7415a(extractorInput);
            if (r0.f10948d == null) {
                throw new ParserException("Unsupported or unrecognized wav header.");
            }
            r0.f10947c.format(Format.createAudioSampleFormat(null, "audio/raw", null, r0.f10948d.m13634c(), 32768, r0.f10948d.m13636e(), r0.f10948d.m13635d(), r0.f10948d.m13637f(), null, null, 0, null));
            r0.f10949e = r0.f10948d.m13633b();
        }
        if (!r0.f10948d.m13632a()) {
            C2071c.m7416a(extractorInput2, r0.f10948d);
            r0.f10946b.seekMap(r0.f10948d);
        }
        int sampleData = r0.f10947c.sampleData(extractorInput2, 32768 - r0.f10950f, true);
        if (sampleData != -1) {
            r0.f10950f += sampleData;
        }
        int i = r0.f10950f / r0.f10949e;
        if (i > 0) {
            long a = r0.f10948d.m13630a(extractorInput.getPosition() - ((long) r0.f10950f));
            int i2 = i * r0.f10949e;
            r0.f10950f -= i2;
            r0.f10947c.sampleMetadata(a, 1, i2, r0.f10950f, null);
        }
        if (sampleData == -1) {
            return -1;
        }
        return 0;
    }
}
