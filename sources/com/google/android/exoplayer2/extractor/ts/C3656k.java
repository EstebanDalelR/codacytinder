package com.google.android.exoplayer2.extractor.ts;

import android.support.annotation.Nullable;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader.C2106c;
import com.google.android.exoplayer2.util.C2292c;
import com.google.android.exoplayer2.util.C2301j;
import com.google.android.exoplayer2.util.C2302k;
import java.util.Collections;

/* renamed from: com.google.android.exoplayer2.extractor.ts.k */
public final class C3656k implements ElementaryStreamReader {
    /* renamed from: a */
    private final String f11269a;
    /* renamed from: b */
    private final C2302k f11270b = new C2302k(1024);
    /* renamed from: c */
    private final C2301j f11271c = new C2301j(this.f11270b.f6929a);
    /* renamed from: d */
    private TrackOutput f11272d;
    /* renamed from: e */
    private Format f11273e;
    /* renamed from: f */
    private String f11274f;
    /* renamed from: g */
    private int f11275g;
    /* renamed from: h */
    private int f11276h;
    /* renamed from: i */
    private int f11277i;
    /* renamed from: j */
    private int f11278j;
    /* renamed from: k */
    private long f11279k;
    /* renamed from: l */
    private boolean f11280l;
    /* renamed from: m */
    private int f11281m;
    /* renamed from: n */
    private int f11282n;
    /* renamed from: o */
    private int f11283o;
    /* renamed from: p */
    private boolean f11284p;
    /* renamed from: q */
    private long f11285q;
    /* renamed from: r */
    private int f11286r;
    /* renamed from: s */
    private long f11287s;
    /* renamed from: t */
    private int f11288t;

    public void packetFinished() {
    }

    public C3656k(@Nullable String str) {
        this.f11269a = str;
    }

    public void seek() {
        this.f11275g = 0;
        this.f11280l = false;
    }

    public void createTracks(ExtractorOutput extractorOutput, C2106c c2106c) {
        c2106c.m7534a();
        this.f11272d = extractorOutput.track(c2106c.m7535b(), 1);
        this.f11274f = c2106c.m7536c();
    }

    public void packetStarted(long j, boolean z) {
        this.f11279k = j;
    }

    public void consume(C2302k c2302k) throws ParserException {
        while (c2302k.m8385b() > 0) {
            int g;
            switch (this.f11275g) {
                case 0:
                    if (c2302k.m8395g() != 86) {
                        break;
                    }
                    this.f11275g = 1;
                    break;
                case 1:
                    g = c2302k.m8395g();
                    if ((g & 224) != 224) {
                        if (g == 86) {
                            break;
                        }
                        this.f11275g = 0;
                        break;
                    }
                    this.f11278j = g;
                    this.f11275g = 2;
                    break;
                case 2:
                    this.f11277i = ((this.f11278j & -225) << 8) | c2302k.m8395g();
                    if (this.f11277i > this.f11270b.f6929a.length) {
                        m13806a(this.f11277i);
                    }
                    this.f11276h = 0;
                    this.f11275g = 3;
                    break;
                case 3:
                    g = Math.min(c2302k.m8385b(), this.f11277i - this.f11276h);
                    c2302k.m8384a(this.f11271c.f6925a, this.f11276h, g);
                    this.f11276h += g;
                    if (this.f11276h != this.f11277i) {
                        break;
                    }
                    this.f11271c.m8364a(0);
                    m13807a(this.f11271c);
                    this.f11275g = 0;
                    break;
                default:
                    break;
            }
        }
    }

    /* renamed from: a */
    private void m13807a(C2301j c2301j) throws ParserException {
        if (!c2301j.m8376e()) {
            this.f11280l = true;
            m13809b(c2301j);
        } else if (!this.f11280l) {
            return;
        }
        if (this.f11281m != 0) {
            throw new ParserException();
        } else if (this.f11282n != 0) {
            throw new ParserException();
        } else {
            m13808a(c2301j, m13812e(c2301j));
            if (this.f11284p) {
                c2301j.m8370b((int) this.f11285q);
            }
        }
    }

    /* renamed from: b */
    private void m13809b(C2301j c2301j) throws ParserException {
        C3656k c3656k = this;
        C2301j c2301j2 = c2301j;
        int c = c2301j2.m8373c(1);
        c3656k.f11281m = c == 1 ? c2301j2.m8373c(1) : 0;
        if (c3656k.f11281m == 0) {
            if (c == 1) {
                C3656k.m13813f(c2301j);
            }
            if (c2301j.m8376e()) {
                c3656k.f11282n = c2301j2.m8373c(6);
                int c2 = c2301j2.m8373c(4);
                int c3 = c2301j2.m8373c(3);
                if (c2 == 0) {
                    if (c3 == 0) {
                        if (c == 0) {
                            c3 = c2301j.m8369b();
                            int d = m13811d(c2301j);
                            c2301j2.m8364a(c3);
                            Object obj = new byte[((d + 7) / 8)];
                            c2301j2.m8368a(obj, 0, d);
                            Format createAudioSampleFormat = Format.createAudioSampleFormat(c3656k.f11274f, "audio/mp4a-latm", null, -1, -1, c3656k.f11288t, c3656k.f11286r, Collections.singletonList(obj), null, 0, c3656k.f11269a);
                            if (!createAudioSampleFormat.equals(c3656k.f11273e)) {
                                c3656k.f11273e = createAudioSampleFormat;
                                c3656k.f11287s = 1024000000 / ((long) createAudioSampleFormat.sampleRate);
                                c3656k.f11272d.format(createAudioSampleFormat);
                            }
                        } else {
                            c2301j2.m8370b(((int) C3656k.m13813f(c2301j)) - m13811d(c2301j));
                        }
                        m13810c(c2301j);
                        c3656k.f11284p = c2301j.m8376e();
                        c3656k.f11285q = 0;
                        if (c3656k.f11284p) {
                            if (c == 1) {
                                c3656k.f11285q = C3656k.m13813f(c2301j);
                            } else {
                                boolean e;
                                do {
                                    e = c2301j.m8376e();
                                    c3656k.f11285q = (c3656k.f11285q << 8) + ((long) c2301j2.m8373c(8));
                                } while (e);
                            }
                        }
                        if (c2301j.m8376e()) {
                            c2301j2.m8370b(8);
                            return;
                        }
                        return;
                    }
                }
                throw new ParserException();
            }
            throw new ParserException();
        }
        throw new ParserException();
    }

    /* renamed from: c */
    private void m13810c(C2301j c2301j) {
        this.f11283o = c2301j.m8373c(3);
        switch (this.f11283o) {
            case 0:
                c2301j.m8370b(8);
                return;
            case 1:
                c2301j.m8370b(9);
                return;
            case 3:
            case 4:
            case 5:
                c2301j.m8370b(6);
                return;
            case 6:
            case 7:
                c2301j.m8370b(1);
                return;
            default:
                return;
        }
    }

    /* renamed from: d */
    private int m13811d(C2301j c2301j) throws ParserException {
        int a = c2301j.m8363a();
        Pair a2 = C2292c.m8321a(c2301j, true);
        this.f11286r = ((Integer) a2.first).intValue();
        this.f11288t = ((Integer) a2.second).intValue();
        return a - c2301j.m8363a();
    }

    /* renamed from: e */
    private int m13812e(C2301j c2301j) throws ParserException {
        if (this.f11283o == 0) {
            int i = 0;
            int c;
            do {
                c = c2301j.m8373c(8);
                i += c;
            } while (c == 255);
            return i;
        }
        throw new ParserException();
    }

    /* renamed from: a */
    private void m13808a(C2301j c2301j, int i) {
        int b = c2301j.m8369b();
        if ((b & 7) == 0) {
            this.f11270b.m8388c(b >> 3);
        } else {
            c2301j.m8368a(this.f11270b.f6929a, 0, i * 8);
            this.f11270b.m8388c(0);
        }
        this.f11272d.sampleData(this.f11270b, i);
        this.f11272d.sampleMetadata(this.f11279k, 1, i, 0, null);
        this.f11279k += this.f11287s;
    }

    /* renamed from: a */
    private void m13806a(int i) {
        this.f11270b.m8381a(i);
        this.f11271c.m8366a(this.f11270b.f6929a);
    }

    /* renamed from: f */
    private static long m13813f(C2301j c2301j) {
        return (long) c2301j.m8373c((c2301j.m8373c(2) + 1) * 8);
    }
}
