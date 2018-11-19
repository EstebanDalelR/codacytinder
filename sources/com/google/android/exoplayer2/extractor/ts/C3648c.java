package com.google.android.exoplayer2.extractor.ts;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.google.android.exoplayer2.extractor.C2075h;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.SeekMap.C3605b;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader.C2106c;
import com.google.android.exoplayer2.util.C2301j;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2314v;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.extractor.ts.c */
public final class C3648c implements Extractor {
    /* renamed from: a */
    public static final ExtractorsFactory f11180a = new C36471();
    /* renamed from: b */
    private static final int f11181b = C2314v.m8499g("ID3");
    /* renamed from: c */
    private final long f11182c;
    /* renamed from: d */
    private final C3649d f11183d;
    /* renamed from: e */
    private final C2302k f11184e;
    /* renamed from: f */
    private boolean f11185f;

    /* renamed from: com.google.android.exoplayer2.extractor.ts.c$1 */
    static class C36471 implements ExtractorsFactory {
        C36471() {
        }

        public Extractor[] createExtractors() {
            return new Extractor[]{new C3648c()};
        }
    }

    public void release() {
    }

    public C3648c() {
        this(0);
    }

    public C3648c(long j) {
        this.f11182c = j;
        this.f11183d = new C3649d(true);
        this.f11184e = new C2302k((int) Callback.DEFAULT_DRAG_ANIMATION_DURATION);
    }

    public boolean sniff(ExtractorInput extractorInput) throws IOException, InterruptedException {
        C2302k c2302k = new C2302k(10);
        C2301j c2301j = new C2301j(c2302k.f6929a);
        int i = 0;
        while (true) {
            extractorInput.peekFully(c2302k.f6929a, 0, 10);
            c2302k.m8388c(0);
            if (c2302k.m8399k() != f11181b) {
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
            int i3 = 0;
            while (true) {
                extractorInput.peekFully(c2302k.f6929a, 0, 2);
                c2302k.m8388c(0);
                if ((c2302k.m8396h() & 65526) != 65520) {
                    break;
                }
                t++;
                if (t >= 4 && i3 > 188) {
                    return true;
                }
                extractorInput.peekFully(c2302k.f6929a, 0, 4);
                c2301j.m8364a(14);
                int c = c2301j.m8373c(13);
                if (c <= 6) {
                    return false;
                }
                extractorInput.advancePeekPosition(c - 6);
                i3 += c;
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
        this.f11183d.createTracks(extractorOutput, new C2106c(0, 1));
        extractorOutput.endTracks();
        extractorOutput.seekMap(new C3605b(-9223372036854775807L));
    }

    public void seek(long j, long j2) {
        this.f11185f = 0;
        this.f11183d.seek();
    }

    public int read(ExtractorInput extractorInput, C2075h c2075h) throws IOException, InterruptedException {
        extractorInput = extractorInput.read(this.f11184e.f6929a, 0, Callback.DEFAULT_DRAG_ANIMATION_DURATION);
        if (extractorInput == -1) {
            return -1;
        }
        this.f11184e.m8388c(0);
        this.f11184e.m8386b(extractorInput);
        if (this.f11185f == null) {
            this.f11183d.packetStarted(this.f11182c, true);
            this.f11185f = true;
        }
        this.f11183d.consume(this.f11184e);
        return 0;
    }
}
