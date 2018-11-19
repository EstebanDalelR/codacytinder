package com.google.android.exoplayer2.extractor.p061b;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.C2075h;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekMap.C3605b;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.C2302k;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.extractor.b.h */
abstract class C2062h {
    /* renamed from: a */
    private final C2057d f5660a = new C2057d();
    /* renamed from: b */
    private TrackOutput f5661b;
    /* renamed from: c */
    private ExtractorOutput f5662c;
    /* renamed from: d */
    private C2059f f5663d;
    /* renamed from: e */
    private long f5664e;
    /* renamed from: f */
    private long f5665f;
    /* renamed from: g */
    private long f5666g;
    /* renamed from: h */
    private int f5667h;
    /* renamed from: i */
    private int f5668i;
    /* renamed from: j */
    private C2061a f5669j;
    /* renamed from: k */
    private long f5670k;
    /* renamed from: l */
    private boolean f5671l;
    /* renamed from: m */
    private boolean f5672m;

    /* renamed from: com.google.android.exoplayer2.extractor.b.h$a */
    static class C2061a {
        /* renamed from: a */
        Format f5658a;
        /* renamed from: b */
        C2059f f5659b;

        C2061a() {
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.b.h$b */
    private static final class C3616b implements C2059f {
        /* renamed from: a */
        public long mo2250a(long j) {
            return 0;
        }

        /* renamed from: a */
        public long mo2251a(ExtractorInput extractorInput) throws IOException, InterruptedException {
            return -1;
        }

        private C3616b() {
        }

        /* renamed from: c */
        public SeekMap mo2252c() {
            return new C3605b(-9223372036854775807L);
        }
    }

    /* renamed from: a */
    protected abstract boolean mo2254a(C2302k c2302k, long j, C2061a c2061a) throws IOException, InterruptedException;

    /* renamed from: b */
    protected abstract long mo2255b(C2302k c2302k);

    /* renamed from: a */
    void m7392a(ExtractorOutput extractorOutput, TrackOutput trackOutput) {
        this.f5662c = extractorOutput;
        this.f5661b = trackOutput;
        mo2253a(true);
    }

    /* renamed from: a */
    protected void mo2253a(boolean z) {
        if (z) {
            this.f5669j = new C2061a();
            this.f5665f = 0;
            this.f5667h = false;
        } else {
            this.f5667h = true;
        }
        this.f5664e = -1;
        this.f5666g = 0;
    }

    /* renamed from: a */
    final void m7391a(long j, long j2) {
        this.f5660a.m7377a();
        if (j == 0) {
            mo2253a(this.f5671l ^ 1);
        } else if (this.f5667h != null) {
            this.f5664e = this.f5663d.mo2250a(j2);
            this.f5667h = 2;
        }
    }

    /* renamed from: a */
    final int m7389a(ExtractorInput extractorInput, C2075h c2075h) throws IOException, InterruptedException {
        switch (this.f5667h) {
            case 0:
                return m7387a(extractorInput);
            case 1:
                extractorInput.skipFully((int) this.f5665f);
                this.f5667h = 2;
                return null;
            case 2:
                return m7388b(extractorInput, c2075h);
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    private int m7387a(ExtractorInput extractorInput) throws IOException, InterruptedException {
        boolean z = true;
        while (z) {
            if (this.f5660a.m7378a(extractorInput)) {
                this.f5670k = extractorInput.getPosition() - this.f5665f;
                z = mo2254a(this.f5660a.m7380c(), this.f5665f, this.f5669j);
                if (z) {
                    this.f5665f = extractorInput.getPosition();
                }
            } else {
                this.f5667h = 3;
                return -1;
            }
        }
        this.f5668i = this.f5669j.f5658a.sampleRate;
        if (!this.f5672m) {
            this.f5661b.format(this.f5669j.f5658a);
            this.f5672m = true;
        }
        if (this.f5669j.f5659b != null) {
            this.f5663d = this.f5669j.f5659b;
        } else if (extractorInput.getLength() == -1) {
            this.f5663d = new C3616b();
        } else {
            C2058e b = this.f5660a.m7379b();
            this.f5663d = new C3610a(this.f5665f, extractorInput.getLength(), this, b.f5654h + b.f5655i, b.f5649c);
        }
        this.f5669j = null;
        this.f5667h = 2;
        this.f5660a.m7381d();
        return null;
    }

    /* renamed from: b */
    private int m7388b(ExtractorInput extractorInput, C2075h c2075h) throws IOException, InterruptedException {
        ExtractorInput extractorInput2 = extractorInput;
        long a = this.f5663d.mo2251a(extractorInput2);
        if (a >= 0) {
            c2075h.f5726a = a;
            return 1;
        }
        if (a < -1) {
            mo2256c(-(a + 2));
        }
        if (!r0.f5671l) {
            r0.f5662c.seekMap(r0.f5663d.mo2252c());
            r0.f5671l = true;
        }
        if (r0.f5670k <= 0) {
            if (!r0.f5660a.m7378a(extractorInput2)) {
                r0.f5667h = 3;
                return -1;
            }
        }
        r0.f5670k = 0;
        C2302k c = r0.f5660a.m7380c();
        a = mo2255b(c);
        if (a >= 0 && r0.f5666g + a >= r0.f5664e) {
            long a2 = m7390a(r0.f5666g);
            r0.f5661b.sampleData(c, c.m8387c());
            r0.f5661b.sampleMetadata(a2, 1, c.m8387c(), 0, null);
            r0.f5664e = -1;
        }
        r0.f5666g += a;
        return 0;
    }

    /* renamed from: a */
    protected long m7390a(long j) {
        return (j * 1000000) / ((long) this.f5668i);
    }

    /* renamed from: b */
    protected long m7395b(long j) {
        return (((long) this.f5668i) * j) / 1000000;
    }

    /* renamed from: c */
    protected void mo2256c(long j) {
        this.f5666g = j;
    }
}
