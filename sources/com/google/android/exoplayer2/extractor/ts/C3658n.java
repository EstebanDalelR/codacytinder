package com.google.android.exoplayer2.extractor.ts;

import android.util.Log;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader.C2106c;
import com.google.android.exoplayer2.util.C2301j;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2310s;

/* renamed from: com.google.android.exoplayer2.extractor.ts.n */
public final class C3658n implements TsPayloadReader {
    /* renamed from: a */
    private final ElementaryStreamReader f11301a;
    /* renamed from: b */
    private final C2301j f11302b = new C2301j(new byte[10]);
    /* renamed from: c */
    private int f11303c = null;
    /* renamed from: d */
    private int f11304d;
    /* renamed from: e */
    private C2310s f11305e;
    /* renamed from: f */
    private boolean f11306f;
    /* renamed from: g */
    private boolean f11307g;
    /* renamed from: h */
    private boolean f11308h;
    /* renamed from: i */
    private int f11309i;
    /* renamed from: j */
    private int f11310j;
    /* renamed from: k */
    private boolean f11311k;
    /* renamed from: l */
    private long f11312l;

    public C3658n(ElementaryStreamReader elementaryStreamReader) {
        this.f11301a = elementaryStreamReader;
    }

    public void init(C2310s c2310s, ExtractorOutput extractorOutput, C2106c c2106c) {
        this.f11305e = c2310s;
        this.f11301a.createTracks(extractorOutput, c2106c);
    }

    public final void seek() {
        this.f11303c = 0;
        this.f11304d = 0;
        this.f11308h = false;
        this.f11301a.seek();
    }

    public final void consume(C2302k c2302k, boolean z) throws ParserException {
        if (z) {
            switch (this.f11303c) {
                case false:
                case true:
                    break;
                case true:
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                    break;
                case true:
                    if (!this.f11310j) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unexpected start indicator: expected ");
                        stringBuilder.append(this.f11310j);
                        stringBuilder.append(" more bytes");
                        Log.w("PesReader", stringBuilder.toString());
                    }
                    this.f11301a.packetFinished();
                    break;
                default:
                    break;
            }
            m13817a(1);
        }
        while (c2302k.m8385b() <= false) {
            int i = 0;
            switch (this.f11303c) {
                case false:
                    c2302k.m8390d(c2302k.m8385b());
                    break;
                case true:
                    if (!m13819a(c2302k, this.f11302b.f6925a, 9)) {
                        break;
                    }
                    if (m13818a()) {
                        i = 2;
                    }
                    m13817a(i);
                    break;
                case true:
                    if (m13819a(c2302k, this.f11302b.f6925a, Math.min(true, this.f11309i)) && m13819a(c2302k, false, this.f11309i)) {
                        m13820b();
                        this.f11301a.packetStarted(this.f11312l, this.f11311k);
                        m13817a(true);
                        break;
                    }
                case true:
                    z = c2302k.m8385b();
                    if (this.f11310j != -1) {
                        i = z - this.f11310j;
                    }
                    if (i > 0) {
                        z -= i;
                        c2302k.m8386b(c2302k.m8389d() + z);
                    }
                    this.f11301a.consume(c2302k);
                    if (this.f11310j == -1) {
                        break;
                    }
                    this.f11310j -= z;
                    if (!this.f11310j) {
                        this.f11301a.packetFinished();
                        m13817a(1);
                        break;
                    }
                    break;
                default:
                    break;
            }
        }
    }

    /* renamed from: a */
    private void m13817a(int i) {
        this.f11303c = i;
        this.f11304d = 0;
    }

    /* renamed from: a */
    private boolean m13819a(C2302k c2302k, byte[] bArr, int i) {
        int min = Math.min(c2302k.m8385b(), i - this.f11304d);
        boolean z = true;
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            c2302k.m8390d(min);
        } else {
            c2302k.m8384a(bArr, this.f11304d, min);
        }
        this.f11304d += min;
        if (this.f11304d != i) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    private boolean m13818a() {
        this.f11302b.m8364a(0);
        int c = this.f11302b.m8373c(24);
        if (c != 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected start code prefix: ");
            stringBuilder.append(c);
            Log.w("PesReader", stringBuilder.toString());
            this.f11310j = -1;
            return false;
        }
        this.f11302b.m8370b(8);
        c = this.f11302b.m8373c(16);
        this.f11302b.m8370b(5);
        this.f11311k = this.f11302b.m8376e();
        this.f11302b.m8370b(2);
        this.f11306f = this.f11302b.m8376e();
        this.f11307g = this.f11302b.m8376e();
        this.f11302b.m8370b(6);
        this.f11309i = this.f11302b.m8373c(8);
        if (c == 0) {
            this.f11310j = -1;
        } else {
            this.f11310j = ((c + 6) - 9) - this.f11309i;
        }
        return true;
    }

    /* renamed from: b */
    private void m13820b() {
        this.f11302b.m8364a(0);
        this.f11312l = -9223372036854775807L;
        if (this.f11306f) {
            this.f11302b.m8370b(4);
            long c = ((long) this.f11302b.m8373c(3)) << 30;
            this.f11302b.m8370b(1);
            long c2 = c | ((long) (this.f11302b.m8373c(15) << 15));
            this.f11302b.m8370b(1);
            long c3 = c2 | ((long) this.f11302b.m8373c(15));
            this.f11302b.m8370b(1);
            if (!this.f11308h && this.f11307g) {
                this.f11302b.m8370b(4);
                long c4 = ((long) this.f11302b.m8373c(3)) << 30;
                this.f11302b.m8370b(1);
                long c5 = c4 | ((long) (this.f11302b.m8373c(15) << 15));
                this.f11302b.m8370b(1);
                long c6 = c5 | ((long) this.f11302b.m8373c(15));
                this.f11302b.m8370b(1);
                this.f11305e.m8441b(c6);
                this.f11308h = true;
            }
            this.f11312l = this.f11305e.m8441b(c3);
        }
    }
}
