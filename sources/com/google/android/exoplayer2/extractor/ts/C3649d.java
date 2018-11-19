package com.google.android.exoplayer2.extractor.ts;

import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.C3623d;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader.C2106c;
import com.google.android.exoplayer2.util.C2292c;
import com.google.android.exoplayer2.util.C2301j;
import com.google.android.exoplayer2.util.C2302k;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.google.android.exoplayer2.extractor.ts.d */
public final class C3649d implements ElementaryStreamReader {
    /* renamed from: a */
    private static final byte[] f11186a = new byte[]{(byte) 73, (byte) 68, (byte) 51};
    /* renamed from: b */
    private final boolean f11187b;
    /* renamed from: c */
    private final C2301j f11188c;
    /* renamed from: d */
    private final C2302k f11189d;
    /* renamed from: e */
    private final String f11190e;
    /* renamed from: f */
    private String f11191f;
    /* renamed from: g */
    private TrackOutput f11192g;
    /* renamed from: h */
    private TrackOutput f11193h;
    /* renamed from: i */
    private int f11194i;
    /* renamed from: j */
    private int f11195j;
    /* renamed from: k */
    private int f11196k;
    /* renamed from: l */
    private boolean f11197l;
    /* renamed from: m */
    private boolean f11198m;
    /* renamed from: n */
    private long f11199n;
    /* renamed from: o */
    private int f11200o;
    /* renamed from: p */
    private long f11201p;
    /* renamed from: q */
    private TrackOutput f11202q;
    /* renamed from: r */
    private long f11203r;

    public void packetFinished() {
    }

    public C3649d(boolean z) {
        this(z, null);
    }

    public C3649d(boolean z, String str) {
        this.f11188c = new C2301j(new byte[7]);
        this.f11189d = new C2302k(Arrays.copyOf(f11186a, 10));
        m13783a();
        this.f11187b = z;
        this.f11190e = str;
    }

    public void seek() {
        m13783a();
    }

    public void createTracks(ExtractorOutput extractorOutput, C2106c c2106c) {
        c2106c.m7534a();
        this.f11191f = c2106c.m7536c();
        this.f11192g = extractorOutput.track(c2106c.m7535b(), 1);
        if (this.f11187b) {
            c2106c.m7534a();
            this.f11193h = extractorOutput.track(c2106c.m7535b(), 4);
            this.f11193h.format(Format.createSampleFormat(c2106c.m7536c(), "application/id3", null, -1, null));
            return;
        }
        this.f11193h = new C3623d();
    }

    public void packetStarted(long j, boolean z) {
        this.f11201p = j;
    }

    public void consume(C2302k c2302k) throws ParserException {
        while (c2302k.m8385b() > 0) {
            switch (this.f11194i) {
                case 0:
                    m13785a(c2302k);
                    break;
                case 1:
                    if (!m13786a(c2302k, this.f11189d.f6929a, 10)) {
                        break;
                    }
                    m13790d();
                    break;
                case 2:
                    if (!m13786a(c2302k, this.f11188c.f6925a, this.f11197l ? 7 : 5)) {
                        break;
                    }
                    m13791e();
                    break;
                case 3:
                    m13788b(c2302k);
                    break;
                default:
                    break;
            }
        }
    }

    /* renamed from: a */
    private boolean m13786a(C2302k c2302k, byte[] bArr, int i) {
        int min = Math.min(c2302k.m8385b(), i - this.f11195j);
        c2302k.m8384a(bArr, this.f11195j, min);
        this.f11195j += min;
        return this.f11195j == i ? true : null;
    }

    /* renamed from: a */
    private void m13783a() {
        this.f11194i = 0;
        this.f11195j = 0;
        this.f11196k = 256;
    }

    /* renamed from: b */
    private void m13787b() {
        this.f11194i = 1;
        this.f11195j = f11186a.length;
        this.f11200o = 0;
        this.f11189d.m8388c(0);
    }

    /* renamed from: a */
    private void m13784a(TrackOutput trackOutput, long j, int i, int i2) {
        this.f11194i = 3;
        this.f11195j = i;
        this.f11202q = trackOutput;
        this.f11203r = j;
        this.f11200o = i2;
    }

    /* renamed from: c */
    private void m13789c() {
        this.f11194i = 2;
        this.f11195j = 0;
    }

    /* renamed from: a */
    private void m13785a(C2302k c2302k) {
        byte[] bArr = c2302k.f6929a;
        int d = c2302k.m8389d();
        int c = c2302k.m8387c();
        while (d < c) {
            int i = d + 1;
            d = bArr[d] & 255;
            if (this.f11196k != 512 || d < 240 || d == 255) {
                d |= this.f11196k;
                if (d == 329) {
                    this.f11196k = 768;
                } else if (d == 511) {
                    this.f11196k = 512;
                } else if (d == 836) {
                    this.f11196k = 1024;
                } else if (d == 1075) {
                    m13787b();
                    c2302k.m8388c(i);
                    return;
                } else if (this.f11196k != 256) {
                    this.f11196k = 256;
                    i--;
                }
                d = i;
            } else {
                boolean z = true;
                if ((d & 1) != 0) {
                    z = false;
                }
                this.f11197l = z;
                m13789c();
                c2302k.m8388c(i);
                return;
            }
        }
        c2302k.m8388c(d);
    }

    /* renamed from: d */
    private void m13790d() {
        this.f11193h.sampleData(this.f11189d, 10);
        this.f11189d.m8388c(6);
        m13784a(this.f11193h, 0, 10, this.f11189d.m8408t() + 10);
    }

    /* renamed from: e */
    private void m13791e() throws ParserException {
        int c;
        this.f11188c.m8364a(0);
        if (this.f11198m) {
            r6.f11188c.m8370b(10);
        } else {
            c = r6.f11188c.m8373c(2) + 1;
            if (c != 2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Detected audio object type: ");
                stringBuilder.append(c);
                stringBuilder.append(", but assuming AAC LC.");
                Log.w("AdtsReader", stringBuilder.toString());
                c = 2;
            }
            int c2 = r6.f11188c.m8373c(4);
            r6.f11188c.m8370b(1);
            byte[] a = C2292c.m8324a(c, c2, r6.f11188c.m8373c(3));
            Pair a2 = C2292c.m8322a(a);
            Format createAudioSampleFormat = Format.createAudioSampleFormat(r6.f11191f, "audio/mp4a-latm", null, -1, -1, ((Integer) a2.second).intValue(), ((Integer) a2.first).intValue(), Collections.singletonList(a), null, 0, r6.f11190e);
            r6.f11199n = 1024000000 / ((long) createAudioSampleFormat.sampleRate);
            r6.f11192g.format(createAudioSampleFormat);
            r6.f11198m = true;
        }
        r6.f11188c.m8370b(4);
        c = (r6.f11188c.m8373c(13) - 2) - 5;
        if (r6.f11197l) {
            c -= 2;
        }
        m13784a(r6.f11192g, r6.f11199n, 0, c);
    }

    /* renamed from: b */
    private void m13788b(C2302k c2302k) {
        int min = Math.min(c2302k.m8385b(), this.f11200o - this.f11195j);
        this.f11202q.sampleData(c2302k, min);
        this.f11195j += min;
        if (this.f11195j == this.f11200o) {
            this.f11202q.sampleMetadata(this.f11201p, 1, this.f11200o, 0, null);
            this.f11201p += this.f11203r;
            m13783a();
        }
    }
}
