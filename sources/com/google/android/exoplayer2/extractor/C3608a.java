package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.SeekMap.C2054a;
import com.google.android.exoplayer2.util.C2314v;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.extractor.a */
public final class C3608a implements SeekMap {
    /* renamed from: a */
    public final int f10900a;
    /* renamed from: b */
    public final int[] f10901b;
    /* renamed from: c */
    public final long[] f10902c;
    /* renamed from: d */
    public final long[] f10903d;
    /* renamed from: e */
    public final long[] f10904e;
    /* renamed from: f */
    private final long f10905f;

    public boolean isSeekable() {
        return true;
    }

    public C3608a(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f10901b = iArr;
        this.f10902c = jArr;
        this.f10903d = jArr2;
        this.f10904e = jArr3;
        this.f10900a = iArr.length;
        if (this.f10900a > null) {
            this.f10905f = jArr2[this.f10900a - 1] + jArr3[this.f10900a - 1];
        } else {
            this.f10905f = null;
        }
    }

    /* renamed from: a */
    public int m13576a(long j) {
        return C2314v.m8460a(this.f10904e, j, true, true);
    }

    public long getDurationUs() {
        return this.f10905f;
    }

    public C2054a getSeekPoints(long j) {
        int a = m13576a(j);
        C2076i c2076i = new C2076i(this.f10904e[a], this.f10902c[a]);
        if (c2076i.f5728b < j) {
            if (a != this.f10900a - 1) {
                a++;
                return new C2054a(c2076i, new C2076i(this.f10904e[a], this.f10902c[a]));
            }
        }
        return new C2054a(c2076i);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ChunkIndex(length=");
        stringBuilder.append(this.f10900a);
        stringBuilder.append(", sizes=");
        stringBuilder.append(Arrays.toString(this.f10901b));
        stringBuilder.append(", offsets=");
        stringBuilder.append(Arrays.toString(this.f10902c));
        stringBuilder.append(", timeUs=");
        stringBuilder.append(Arrays.toString(this.f10904e));
        stringBuilder.append(", durationsUs=");
        stringBuilder.append(Arrays.toString(this.f10903d));
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
