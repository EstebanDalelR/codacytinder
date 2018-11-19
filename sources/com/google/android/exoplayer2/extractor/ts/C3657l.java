package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.C2074g;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader.C2106c;
import com.google.android.exoplayer2.util.C2302k;

/* renamed from: com.google.android.exoplayer2.extractor.ts.l */
public final class C3657l implements ElementaryStreamReader {
    /* renamed from: a */
    private final C2302k f11289a;
    /* renamed from: b */
    private final C2074g f11290b;
    /* renamed from: c */
    private final String f11291c;
    /* renamed from: d */
    private String f11292d;
    /* renamed from: e */
    private TrackOutput f11293e;
    /* renamed from: f */
    private int f11294f;
    /* renamed from: g */
    private int f11295g;
    /* renamed from: h */
    private boolean f11296h;
    /* renamed from: i */
    private boolean f11297i;
    /* renamed from: j */
    private long f11298j;
    /* renamed from: k */
    private int f11299k;
    /* renamed from: l */
    private long f11300l;

    public void packetFinished() {
    }

    public C3657l() {
        this(null);
    }

    public C3657l(String str) {
        this.f11294f = 0;
        this.f11289a = new C2302k(4);
        this.f11289a.f6929a[0] = (byte) -1;
        this.f11290b = new C2074g();
        this.f11291c = str;
    }

    public void seek() {
        this.f11294f = 0;
        this.f11295g = 0;
        this.f11297i = false;
    }

    public void createTracks(ExtractorOutput extractorOutput, C2106c c2106c) {
        c2106c.m7534a();
        this.f11292d = c2106c.m7536c();
        this.f11293e = extractorOutput.track(c2106c.m7535b(), 1);
    }

    public void packetStarted(long j, boolean z) {
        this.f11300l = j;
    }

    public void consume(C2302k c2302k) {
        while (c2302k.m8385b() > 0) {
            switch (this.f11294f) {
                case 0:
                    m13814a(c2302k);
                    break;
                case 1:
                    m13815b(c2302k);
                    break;
                case 2:
                    m13816c(c2302k);
                    break;
                default:
                    break;
            }
        }
    }

    /* renamed from: a */
    private void m13814a(C2302k c2302k) {
        byte[] bArr = c2302k.f6929a;
        int c = c2302k.m8387c();
        for (int d = c2302k.m8389d(); d < c; d++) {
            boolean z = (bArr[d] & 255) == 255;
            Object obj = (this.f11297i && (bArr[d] & 224) == 224) ? 1 : null;
            this.f11297i = z;
            if (obj != null) {
                c2302k.m8388c(d + 1);
                this.f11297i = false;
                this.f11289a.f6929a[1] = bArr[d];
                this.f11295g = 2;
                this.f11294f = 1;
                return;
            }
        }
        c2302k.m8388c(c);
    }

    /* renamed from: b */
    private void m13815b(C2302k c2302k) {
        int min = Math.min(c2302k.m8385b(), 4 - this.f11295g);
        c2302k.m8384a(this.f11289a.f6929a, this.f11295g, min);
        this.f11295g += min;
        if (this.f11295g >= 4) {
            r0.f11289a.m8388c(0);
            if (C2074g.m7427a(r0.f11289a.m8403o(), r0.f11290b)) {
                r0.f11299k = r0.f11290b.f5721c;
                if (!r0.f11296h) {
                    r0.f11298j = (((long) r0.f11290b.f5725g) * 1000000) / ((long) r0.f11290b.f5722d);
                    r0.f11293e.format(Format.createAudioSampleFormat(r0.f11292d, r0.f11290b.f5720b, null, -1, 4096, r0.f11290b.f5723e, r0.f11290b.f5722d, null, null, 0, r0.f11291c));
                    r0.f11296h = true;
                }
                r0.f11289a.m8388c(0);
                r0.f11293e.sampleData(r0.f11289a, 4);
                r0.f11294f = 2;
                return;
            }
            r0.f11295g = 0;
            r0.f11294f = 1;
        }
    }

    /* renamed from: c */
    private void m13816c(C2302k c2302k) {
        int min = Math.min(c2302k.m8385b(), this.f11299k - this.f11295g);
        this.f11293e.sampleData(c2302k, min);
        this.f11295g += min;
        if (this.f11295g >= this.f11299k) {
            this.f11293e.sampleMetadata(this.f11300l, 1, this.f11299k, 0, null);
            this.f11300l += this.f11298j;
            this.f11295g = 0;
            this.f11294f = 0;
        }
    }
}
