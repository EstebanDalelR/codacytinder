package com.google.android.exoplayer2.decoder;

import android.annotation.TargetApi;
import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCodec.CryptoInfo.Pattern;
import com.google.android.exoplayer2.util.C2314v;

/* renamed from: com.google.android.exoplayer2.decoder.b */
public final class C2036b {
    /* renamed from: a */
    public byte[] f5600a;
    /* renamed from: b */
    public byte[] f5601b;
    /* renamed from: c */
    public int f5602c;
    /* renamed from: d */
    public int[] f5603d;
    /* renamed from: e */
    public int[] f5604e;
    /* renamed from: f */
    public int f5605f;
    /* renamed from: g */
    public int f5606g;
    /* renamed from: h */
    public int f5607h;
    /* renamed from: i */
    private final CryptoInfo f5608i;
    /* renamed from: j */
    private final C2035a f5609j;

    @TargetApi(24)
    /* renamed from: com.google.android.exoplayer2.decoder.b$a */
    private static final class C2035a {
        /* renamed from: a */
        private final CryptoInfo f5598a;
        /* renamed from: b */
        private final Pattern f5599b;

        private C2035a(CryptoInfo cryptoInfo) {
            this.f5598a = cryptoInfo;
            this.f5599b = new Pattern(0, 0);
        }

        /* renamed from: a */
        private void m7347a(int i, int i2) {
            this.f5599b.set(i, i2);
            this.f5598a.setPattern(this.f5599b);
        }
    }

    public C2036b() {
        this.f5608i = C2314v.f6956a >= 16 ? m7349b() : null;
        this.f5609j = C2314v.f6956a >= 24 ? new C2035a(this.f5608i) : null;
    }

    /* renamed from: a */
    public void m7352a(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f5605f = i;
        this.f5603d = iArr;
        this.f5604e = iArr2;
        this.f5601b = bArr;
        this.f5600a = bArr2;
        this.f5602c = i2;
        this.f5606g = i3;
        this.f5607h = i4;
        if (C2314v.f6956a >= 16) {
            m7350c();
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    public CryptoInfo m7351a() {
        return this.f5608i;
    }

    @TargetApi(16)
    /* renamed from: b */
    private CryptoInfo m7349b() {
        return new CryptoInfo();
    }

    @TargetApi(16)
    /* renamed from: c */
    private void m7350c() {
        this.f5608i.numSubSamples = this.f5605f;
        this.f5608i.numBytesOfClearData = this.f5603d;
        this.f5608i.numBytesOfEncryptedData = this.f5604e;
        this.f5608i.key = this.f5601b;
        this.f5608i.iv = this.f5600a;
        this.f5608i.mode = this.f5602c;
        if (C2314v.f6956a >= 24) {
            this.f5609j.m7347a(this.f5606g, this.f5607h);
        }
    }
}
