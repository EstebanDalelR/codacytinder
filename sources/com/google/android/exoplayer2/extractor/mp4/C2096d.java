package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.C2314v;

/* renamed from: com.google.android.exoplayer2.extractor.mp4.d */
final class C2096d {

    /* renamed from: com.google.android.exoplayer2.extractor.mp4.d$a */
    public static final class C2095a {
        /* renamed from: a */
        public final long[] f5893a;
        /* renamed from: b */
        public final int[] f5894b;
        /* renamed from: c */
        public final int f5895c;
        /* renamed from: d */
        public final long[] f5896d;
        /* renamed from: e */
        public final int[] f5897e;
        /* renamed from: f */
        public final long f5898f;

        private C2095a(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
            this.f5893a = jArr;
            this.f5894b = iArr;
            this.f5895c = i;
            this.f5896d = jArr2;
            this.f5897e = iArr2;
            this.f5898f = j;
        }
    }

    /* renamed from: a */
    public static C2095a m7503a(int i, long[] jArr, int[] iArr, long j) {
        int[] iArr2 = iArr;
        int i2 = 8192 / i;
        int i3 = 0;
        int i4 = 0;
        for (int a : iArr2) {
            i4 += C2314v.m8455a(a, i2);
        }
        long[] jArr2 = new long[i4];
        int[] iArr3 = new int[i4];
        long[] jArr3 = new long[i4];
        int[] iArr4 = new int[i4];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i3 < iArr2.length) {
            i4 = iArr2[i3];
            long j2 = jArr[i3];
            while (i4 > 0) {
                int min = Math.min(i2, i4);
                jArr2[i6] = j2;
                iArr3[i6] = i * min;
                i7 = Math.max(i7, iArr3[i6]);
                jArr3[i6] = ((long) i5) * j;
                iArr4[i6] = 1;
                i5 += min;
                i4 -= min;
                i6++;
                j2 += (long) iArr3[i6];
                iArr2 = iArr;
            }
            i3++;
            iArr2 = iArr;
        }
        return new C2095a(jArr2, iArr3, i7, jArr3, iArr4, j * ((long) i5));
    }
}
