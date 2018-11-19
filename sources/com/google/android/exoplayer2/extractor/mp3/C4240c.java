package com.google.android.exoplayer2.extractor.mp3;

import android.util.Log;
import com.google.android.exoplayer2.extractor.C2074g;
import com.google.android.exoplayer2.extractor.C2076i;
import com.google.android.exoplayer2.extractor.SeekMap.C2054a;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor.C3634a;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2314v;

/* renamed from: com.google.android.exoplayer2.extractor.mp3.c */
final class C4240c implements C3634a {
    /* renamed from: a */
    private final long f13581a;
    /* renamed from: b */
    private final int f13582b;
    /* renamed from: c */
    private final long f13583c;
    /* renamed from: d */
    private final long f13584d;
    /* renamed from: e */
    private final long[] f13585e;

    /* renamed from: a */
    public static C4240c m16854a(long j, long j2, C2074g c2074g, C2302k c2302k) {
        long j3 = j;
        C2074g c2074g2 = c2074g;
        int i = c2074g2.f5725g;
        int i2 = c2074g2.f5722d;
        int o = c2302k.m8403o();
        if ((o & 1) == 1) {
            int u = c2302k.m8409u();
            if (u != 0) {
                long d = C2314v.m8492d((long) u, ((long) i) * 1000000, (long) i2);
                if ((o & 6) != 6) {
                    return new C4240c(j2, c2074g2.f5721c, d);
                }
                long u2 = (long) c2302k.m8409u();
                long[] jArr = new long[100];
                for (int i3 = 0; i3 < 100; i3++) {
                    jArr[i3] = (long) c2302k.m8395g();
                }
                if (j3 != -1) {
                    long j4 = j2 + u2;
                    if (j3 != j4) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("XING data size mismatch: ");
                        stringBuilder.append(j3);
                        stringBuilder.append(", ");
                        stringBuilder.append(j4);
                        Log.w("XingSeeker", stringBuilder.toString());
                    }
                }
                return new C4240c(j2, c2074g2.f5721c, d, u2, jArr);
            }
        }
        return null;
    }

    private C4240c(long j, int i, long j2) {
        this(j, i, j2, -1, null);
    }

    private C4240c(long j, int i, long j2, long j3, long[] jArr) {
        this.f13581a = j;
        this.f13582b = i;
        this.f13583c = j2;
        this.f13584d = j3;
        this.f13585e = jArr;
    }

    public boolean isSeekable() {
        return this.f13585e != null;
    }

    public C2054a getSeekPoints(long j) {
        C4240c c4240c = this;
        if (!isSeekable()) {
            return new C2054a(new C2076i(0, c4240c.f13581a + ((long) c4240c.f13582b)));
        }
        long a = C2314v.m8462a(j, 0, c4240c.f13583c);
        double d = (((double) a) * 100.0d) / ((double) c4240c.f13583c);
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                double d3;
                int i = (int) d;
                double d4 = (double) c4240c.f13585e[i];
                if (i == 99) {
                    d3 = 256.0d;
                } else {
                    d3 = (double) c4240c.f13585e[i + 1];
                }
                d2 = d4 + ((d - ((double) i)) * (d3 - d4));
            }
        }
        return new C2054a(new C2076i(a, c4240c.f13581a + C2314v.m8462a(Math.round((d2 / 256.0d) * ((double) c4240c.f13584d)), (long) c4240c.f13582b, c4240c.f13584d - 1)));
    }

    /* renamed from: a */
    public long mo3477a(long j) {
        long j2 = j - this.f13581a;
        if (isSeekable() != null) {
            if (j2 > ((long) this.f13582b)) {
                long j3;
                j = (((double) j2) * 4643211215818981376L) / ((double) this.f13584d);
                int a = C2314v.m8460a(this.f13585e, (long) j, true, true);
                long a2 = m16853a(a);
                long j4 = this.f13585e[a];
                int i = a + 1;
                long a3 = m16853a(i);
                if (a == 99) {
                    j3 = 256;
                } else {
                    j3 = this.f13585e[i];
                }
                return a2 + Math.round((j4 == j3 ? 0 : (j - ((double) j4)) / ((double) (j3 - j4))) * ((double) (a3 - a2)));
            }
        }
        return 0;
    }

    public long getDurationUs() {
        return this.f13583c;
    }

    /* renamed from: a */
    private long m16853a(int i) {
        return (this.f13583c * ((long) i)) / 100;
    }
}
