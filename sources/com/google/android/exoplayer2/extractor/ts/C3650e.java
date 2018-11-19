package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.C2030e;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader.C2106c;
import com.google.android.exoplayer2.util.C2302k;

/* renamed from: com.google.android.exoplayer2.extractor.ts.e */
public final class C3650e implements ElementaryStreamReader {
    /* renamed from: a */
    private final C2302k f11204a = new C2302k(new byte[18]);
    /* renamed from: b */
    private final String f11205b;
    /* renamed from: c */
    private String f11206c;
    /* renamed from: d */
    private TrackOutput f11207d;
    /* renamed from: e */
    private int f11208e = 0;
    /* renamed from: f */
    private int f11209f;
    /* renamed from: g */
    private int f11210g;
    /* renamed from: h */
    private long f11211h;
    /* renamed from: i */
    private Format f11212i;
    /* renamed from: j */
    private int f11213j;
    /* renamed from: k */
    private long f11214k;

    public void packetFinished() {
    }

    public C3650e(String str) {
        this.f11205b = str;
    }

    public void seek() {
        this.f11208e = 0;
        this.f11209f = 0;
        this.f11210g = 0;
    }

    public void createTracks(ExtractorOutput extractorOutput, C2106c c2106c) {
        c2106c.m7534a();
        this.f11206c = c2106c.m7536c();
        this.f11207d = extractorOutput.track(c2106c.m7535b(), 1);
    }

    public void packetStarted(long j, boolean z) {
        this.f11214k = j;
    }

    public void consume(C2302k c2302k) {
        while (c2302k.m8385b() > 0) {
            switch (this.f11208e) {
                case 0:
                    if (!m13793a(c2302k)) {
                        break;
                    }
                    this.f11208e = 1;
                    break;
                case 1:
                    if (!m13794a(c2302k, this.f11204a.f6929a, 18)) {
                        break;
                    }
                    m13792a();
                    this.f11204a.m8388c(0);
                    this.f11207d.sampleData(this.f11204a, 18);
                    this.f11208e = 2;
                    break;
                case 2:
                    int min = Math.min(c2302k.m8385b(), this.f11213j - this.f11209f);
                    this.f11207d.sampleData(c2302k, min);
                    this.f11209f += min;
                    if (this.f11209f != this.f11213j) {
                        break;
                    }
                    this.f11207d.sampleMetadata(this.f11214k, 1, this.f11213j, 0, null);
                    this.f11214k += this.f11211h;
                    this.f11208e = 0;
                    break;
                default:
                    break;
            }
        }
    }

    /* renamed from: a */
    private boolean m13794a(C2302k c2302k, byte[] bArr, int i) {
        int min = Math.min(c2302k.m8385b(), i - this.f11209f);
        c2302k.m8384a(bArr, this.f11209f, min);
        this.f11209f += min;
        return this.f11209f == i ? true : null;
    }

    /* renamed from: a */
    private boolean m13793a(C2302k c2302k) {
        while (c2302k.m8385b() > 0) {
            this.f11210g <<= 8;
            this.f11210g |= c2302k.m8395g();
            if (C2030e.m7313a(this.f11210g)) {
                this.f11204a.f6929a[0] = (byte) ((this.f11210g >> 24) & 255);
                this.f11204a.f6929a[1] = (byte) ((this.f11210g >> 16) & 255);
                this.f11204a.f6929a[2] = (byte) ((this.f11210g >> 8) & 255);
                this.f11204a.f6929a[3] = (byte) (this.f11210g & 255);
                this.f11209f = 4;
                this.f11210g = 0;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m13792a() {
        byte[] bArr = this.f11204a.f6929a;
        if (this.f11212i == null) {
            this.f11212i = C2030e.m7312a(bArr, this.f11206c, this.f11205b, null);
            this.f11207d.format(this.f11212i);
        }
        this.f11213j = C2030e.m7314b(bArr);
        this.f11211h = (long) ((int) ((((long) C2030e.m7311a(bArr)) * 1000000) / ((long) this.f11212i.sampleRate)));
    }
}
