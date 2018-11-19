package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.extractor.mkv.d */
final class C2083d {
    /* renamed from: a */
    private static final long[] f5783a = new long[]{128, 64, 32, 16, 8, 4, 2, 1};
    /* renamed from: b */
    private final byte[] f5784b = new byte[8];
    /* renamed from: c */
    private int f5785c;
    /* renamed from: d */
    private int f5786d;

    /* renamed from: a */
    public void m7458a() {
        this.f5785c = 0;
        this.f5786d = 0;
    }

    /* renamed from: a */
    public long m7457a(ExtractorInput extractorInput, boolean z, boolean z2, int i) throws IOException, InterruptedException {
        if (this.f5785c == 0) {
            if (!extractorInput.readFully(this.f5784b, 0, 1, z)) {
                return -1;
            }
            this.f5786d = C2083d.m7455a(this.f5784b[0] & 255);
            if (this.f5786d) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f5785c = 1;
        }
        if (this.f5786d > i) {
            this.f5785c = 0;
            return -2;
        }
        if (!this.f5786d) {
            extractorInput.readFully(this.f5784b, 1, this.f5786d - 1);
        }
        this.f5785c = 0;
        return C2083d.m7456a(this.f5784b, this.f5786d, z2);
    }

    /* renamed from: b */
    public int m7459b() {
        return this.f5786d;
    }

    /* renamed from: a */
    public static int m7455a(int i) {
        for (int i2 = 0; i2 < f5783a.length; i2++) {
            if ((f5783a[i2] & ((long) i)) != 0) {
                return i2 + 1;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static long m7456a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        long j2 = z ? j & (f5783a[i - 1] ^ -1) : j;
        z = true;
        while (z < i) {
            z++;
            j2 = (j2 << 8) | (((long) bArr[z]) & 255);
        }
        return j2;
    }
}
