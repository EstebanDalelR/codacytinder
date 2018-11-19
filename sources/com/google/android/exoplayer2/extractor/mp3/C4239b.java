package com.google.android.exoplayer2.extractor.mp3;

import android.util.Log;
import com.google.android.exoplayer2.extractor.C2074g;
import com.google.android.exoplayer2.extractor.C2076i;
import com.google.android.exoplayer2.extractor.SeekMap.C2054a;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor.C3634a;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2314v;

/* renamed from: com.google.android.exoplayer2.extractor.mp3.b */
final class C4239b implements C3634a {
    /* renamed from: a */
    private final long[] f13578a;
    /* renamed from: b */
    private final long[] f13579b;
    /* renamed from: c */
    private final long f13580c;

    public boolean isSeekable() {
        return true;
    }

    /* renamed from: a */
    public static C4239b m16851a(long j, long j2, C2074g c2074g, C2302k c2302k) {
        long j3 = j;
        C2074g c2074g2 = c2074g;
        C2302k c2302k2 = c2302k;
        c2302k2.m8390d(10);
        int o = c2302k.m8403o();
        if (o <= 0) {
            return null;
        }
        long j4;
        int i = c2074g2.f5722d;
        long d = C2314v.m8492d((long) o, 1000000 * ((long) (i >= 32000 ? 1152 : 576)), (long) i);
        o = c2302k.m8396h();
        int h = c2302k.m8396h();
        int h2 = c2302k.m8396h();
        c2302k2.m8390d(2);
        long j5 = j2 + ((long) c2074g2.f5721c);
        long[] jArr = new long[o];
        long[] jArr2 = new long[o];
        int i2 = 0;
        long j6 = j2;
        while (i2 < o) {
            int g;
            j4 = d;
            jArr[i2] = (((long) i2) * d) / ((long) o);
            jArr2[i2] = Math.max(j6, j5);
            switch (h2) {
                case 1:
                    g = c2302k.m8395g();
                    break;
                case 2:
                    g = c2302k.m8396h();
                    break;
                case 3:
                    g = c2302k.m8399k();
                    break;
                case 4:
                    g = c2302k.m8409u();
                    break;
                default:
                    return null;
            }
            i2++;
            j6 += (long) (g * h);
            d = j4;
            j3 = j;
        }
        j4 = d;
        long j7 = j;
        if (!(j7 == -1 || j7 == j6)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("VBRI data size mismatch: ");
            stringBuilder.append(j7);
            stringBuilder.append(", ");
            stringBuilder.append(j6);
            Log.w("VbriSeeker", stringBuilder.toString());
        }
        return new C4239b(jArr, jArr2, j4);
    }

    private C4239b(long[] jArr, long[] jArr2, long j) {
        this.f13578a = jArr;
        this.f13579b = jArr2;
        this.f13580c = j;
    }

    public C2054a getSeekPoints(long j) {
        int a = C2314v.m8460a(this.f13578a, j, true, true);
        C2076i c2076i = new C2076i(this.f13578a[a], this.f13579b[a]);
        if (c2076i.f5728b < j) {
            if (a != this.f13578a.length - 1) {
                a++;
                return new C2054a(c2076i, new C2076i(this.f13578a[a], this.f13579b[a]));
            }
        }
        return new C2054a(c2076i);
    }

    /* renamed from: a */
    public long mo3477a(long j) {
        return this.f13578a[C2314v.m8460a(this.f13579b, j, true, true)];
    }

    public long getDurationUs() {
        return this.f13580c;
    }
}
