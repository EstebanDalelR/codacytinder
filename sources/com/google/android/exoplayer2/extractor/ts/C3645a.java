package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.extractor.C2075h;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.SeekMap.C3605b;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader.C2106c;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2314v;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.extractor.ts.a */
public final class C3645a implements Extractor {
    /* renamed from: a */
    public static final ExtractorsFactory f11162a = new C36441();
    /* renamed from: b */
    private static final int f11163b = C2314v.m8499g("ID3");
    /* renamed from: c */
    private final long f11164c;
    /* renamed from: d */
    private final C3646b f11165d;
    /* renamed from: e */
    private final C2302k f11166e;
    /* renamed from: f */
    private boolean f11167f;

    /* renamed from: com.google.android.exoplayer2.extractor.ts.a$1 */
    static class C36441 implements ExtractorsFactory {
        C36441() {
        }

        public Extractor[] createExtractors() {
            return new Extractor[]{new C3645a()};
        }
    }

    public void release() {
    }

    public C3645a() {
        this(0);
    }

    public C3645a(long j) {
        this.f11164c = j;
        this.f11165d = new C3646b();
        this.f11166e = new C2302k(2786);
    }

    public boolean sniff(ExtractorInput extractorInput) throws IOException, InterruptedException {
        C2302k c2302k = new C2302k(10);
        int i = 0;
        while (true) {
            extractorInput.peekFully(c2302k.f6929a, 0, 10);
            c2302k.m8388c(0);
            if (c2302k.m8399k() != f11163b) {
                break;
            }
            c2302k.m8390d(3);
            int t = c2302k.m8408t();
            i += t + 10;
            extractorInput.advancePeekPosition(t);
        }
        extractorInput.resetPeekPosition();
        extractorInput.advancePeekPosition(i);
        int i2 = i;
        while (true) {
            t = 0;
            while (true) {
                extractorInput.peekFully(c2302k.f6929a, 0, 5);
                c2302k.m8388c(0);
                if (c2302k.m8396h() != 2935) {
                    break;
                }
                t++;
                if (t >= 4) {
                    return true;
                }
                int a = Ac3Util.m7257a(c2302k.f6929a);
                if (a == -1) {
                    return false;
                }
                extractorInput.advancePeekPosition(a - 5);
            }
            extractorInput.resetPeekPosition();
            i2++;
            if (i2 - i >= 8192) {
                return false;
            }
            extractorInput.advancePeekPosition(i2);
        }
    }

    public void init(ExtractorOutput extractorOutput) {
        this.f11165d.createTracks(extractorOutput, new C2106c(0, 1));
        extractorOutput.endTracks();
        extractorOutput.seekMap(new C3605b(-9223372036854775807L));
    }

    public void seek(long j, long j2) {
        this.f11167f = 0;
        this.f11165d.seek();
    }

    public int read(ExtractorInput extractorInput, C2075h c2075h) throws IOException, InterruptedException {
        extractorInput = extractorInput.read(this.f11166e.f6929a, 0, 2786);
        if (extractorInput == -1) {
            return -1;
        }
        this.f11166e.m8388c(0);
        this.f11166e.m8386b(extractorInput);
        if (this.f11167f == null) {
            this.f11165d.packetStarted(this.f11164c, true);
            this.f11167f = true;
        }
        this.f11165d.consume(this.f11166e);
        return 0;
    }
}
