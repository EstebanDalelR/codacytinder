package com.google.android.exoplayer2.extractor.ts;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.C2075h;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.SeekMap.C3605b;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader.C2106c;
import com.google.android.exoplayer2.util.C2301j;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2310s;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.extractor.ts.o */
public final class C3660o implements Extractor {
    /* renamed from: a */
    public static final ExtractorsFactory f11313a = new C36591();
    /* renamed from: b */
    private final C2310s f11314b;
    /* renamed from: c */
    private final SparseArray<C2113a> f11315c;
    /* renamed from: d */
    private final C2302k f11316d;
    /* renamed from: e */
    private boolean f11317e;
    /* renamed from: f */
    private boolean f11318f;
    /* renamed from: g */
    private boolean f11319g;
    /* renamed from: h */
    private ExtractorOutput f11320h;

    /* renamed from: com.google.android.exoplayer2.extractor.ts.o$a */
    private static final class C2113a {
        /* renamed from: a */
        private final ElementaryStreamReader f6033a;
        /* renamed from: b */
        private final C2310s f6034b;
        /* renamed from: c */
        private final C2301j f6035c = new C2301j(new byte[64]);
        /* renamed from: d */
        private boolean f6036d;
        /* renamed from: e */
        private boolean f6037e;
        /* renamed from: f */
        private boolean f6038f;
        /* renamed from: g */
        private int f6039g;
        /* renamed from: h */
        private long f6040h;

        public C2113a(ElementaryStreamReader elementaryStreamReader, C2310s c2310s) {
            this.f6033a = elementaryStreamReader;
            this.f6034b = c2310s;
        }

        /* renamed from: a */
        public void m7566a() {
            this.f6038f = false;
            this.f6033a.seek();
        }

        /* renamed from: a */
        public void m7567a(C2302k c2302k) throws ParserException {
            c2302k.m8384a(this.f6035c.f6925a, 0, 3);
            this.f6035c.m8364a(0);
            m7564b();
            c2302k.m8384a(this.f6035c.f6925a, 0, this.f6039g);
            this.f6035c.m8364a(0);
            m7565c();
            this.f6033a.packetStarted(this.f6040h, true);
            this.f6033a.consume(c2302k);
            this.f6033a.packetFinished();
        }

        /* renamed from: b */
        private void m7564b() {
            this.f6035c.m8370b(8);
            this.f6036d = this.f6035c.m8376e();
            this.f6037e = this.f6035c.m8376e();
            this.f6035c.m8370b(6);
            this.f6039g = this.f6035c.m8373c(8);
        }

        /* renamed from: c */
        private void m7565c() {
            this.f6040h = 0;
            if (this.f6036d) {
                this.f6035c.m8370b(4);
                long c = ((long) this.f6035c.m8373c(3)) << 30;
                this.f6035c.m8370b(1);
                long c2 = c | ((long) (this.f6035c.m8373c(15) << 15));
                this.f6035c.m8370b(1);
                long c3 = c2 | ((long) this.f6035c.m8373c(15));
                this.f6035c.m8370b(1);
                if (!this.f6038f && this.f6037e) {
                    this.f6035c.m8370b(4);
                    long c4 = ((long) this.f6035c.m8373c(3)) << 30;
                    this.f6035c.m8370b(1);
                    long c5 = c4 | ((long) (this.f6035c.m8373c(15) << 15));
                    this.f6035c.m8370b(1);
                    long c6 = c5 | ((long) this.f6035c.m8373c(15));
                    this.f6035c.m8370b(1);
                    this.f6034b.m8441b(c6);
                    this.f6038f = true;
                }
                this.f6040h = this.f6034b.m8441b(c3);
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.ts.o$1 */
    static class C36591 implements ExtractorsFactory {
        C36591() {
        }

        public Extractor[] createExtractors() {
            return new Extractor[]{new C3660o()};
        }
    }

    public void release() {
    }

    public C3660o() {
        this(new C2310s(0));
    }

    public C3660o(C2310s c2310s) {
        this.f11314b = c2310s;
        this.f11316d = new C2302k(4096);
        this.f11315c = new SparseArray();
    }

    public boolean sniff(ExtractorInput extractorInput) throws IOException, InterruptedException {
        byte[] bArr = new byte[14];
        boolean z = false;
        extractorInput.peekFully(bArr, 0, 14);
        if (442 != (((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16)) | ((bArr[2] & 255) << 8)) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        extractorInput.advancePeekPosition(bArr[13] & 7);
        extractorInput.peekFully(bArr, 0, 3);
        if (1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255))) {
            z = true;
        }
        return z;
    }

    public void init(ExtractorOutput extractorOutput) {
        this.f11320h = extractorOutput;
        extractorOutput.seekMap(new C3605b(-9223372036854775807L));
    }

    public void seek(long j, long j2) {
        this.f11314b.m8444d();
        for (j = null; j < this.f11315c.size(); j++) {
            ((C2113a) this.f11315c.valueAt(j)).m7566a();
        }
    }

    public int read(ExtractorInput extractorInput, C2075h c2075h) throws IOException, InterruptedException {
        if (extractorInput.peekFully(this.f11316d.f6929a, 0, 4, true) == null) {
            return -1;
        }
        this.f11316d.m8388c(0);
        c2075h = this.f11316d.m8403o();
        if (c2075h == 441) {
            return -1;
        }
        if (c2075h == 442) {
            extractorInput.peekFully(this.f11316d.f6929a, 0, 10);
            this.f11316d.m8388c(9);
            extractorInput.skipFully((this.f11316d.m8395g() & 7) + 14);
            return 0;
        } else if (c2075h == 443) {
            extractorInput.peekFully(this.f11316d.f6929a, 0, 2);
            this.f11316d.m8388c(0);
            extractorInput.skipFully(this.f11316d.m8396h() + 6);
            return 0;
        } else if (((c2075h & -256) >> 8) != 1) {
            extractorInput.skipFully(1);
            return 0;
        } else {
            c2075h &= 255;
            C2113a c2113a = (C2113a) this.f11315c.get(c2075h);
            if (!this.f11317e) {
                if (c2113a == null) {
                    ElementaryStreamReader elementaryStreamReader = null;
                    if (!this.f11318f && c2075h == 189) {
                        elementaryStreamReader = new C3646b();
                        this.f11318f = true;
                    } else if (!this.f11318f && (c2075h & 224) == 192) {
                        elementaryStreamReader = new C3657l();
                        this.f11318f = true;
                    } else if (!this.f11319g && (c2075h & 240) == 224) {
                        elementaryStreamReader = new C3652g();
                        this.f11319g = true;
                    }
                    if (elementaryStreamReader != null) {
                        elementaryStreamReader.createTracks(this.f11320h, new C2106c(c2075h, 256));
                        c2113a = new C2113a(elementaryStreamReader, this.f11314b);
                        this.f11315c.put(c2075h, c2113a);
                    }
                }
                if (!(this.f11318f == null || this.f11319g == null) || extractorInput.getPosition() > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                    this.f11317e = true;
                    this.f11320h.endTracks();
                }
            }
            extractorInput.peekFully(this.f11316d.f6929a, 0, 2);
            this.f11316d.m8388c(0);
            c2075h = this.f11316d.m8396h() + 6;
            if (c2113a == null) {
                extractorInput.skipFully(c2075h);
            } else {
                this.f11316d.m8381a(c2075h);
                extractorInput.readFully(this.f11316d.f6929a, 0, c2075h);
                this.f11316d.m8388c(6);
                c2113a.m7567a(this.f11316d);
                this.f11316d.m8386b(this.f11316d.m8391e());
            }
            return 0;
        }
    }
}
