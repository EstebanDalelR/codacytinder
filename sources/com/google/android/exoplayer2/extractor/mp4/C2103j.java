package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2314v;

/* renamed from: com.google.android.exoplayer2.extractor.mp4.j */
final class C2103j {
    /* renamed from: a */
    public final int f5957a;
    /* renamed from: b */
    public final long[] f5958b;
    /* renamed from: c */
    public final int[] f5959c;
    /* renamed from: d */
    public final int f5960d;
    /* renamed from: e */
    public final long[] f5961e;
    /* renamed from: f */
    public final int[] f5962f;
    /* renamed from: g */
    public final long f5963g;

    public C2103j(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        boolean z = false;
        C2289a.m8311a(iArr.length == jArr2.length);
        C2289a.m8311a(jArr.length == jArr2.length);
        if (iArr2.length == jArr2.length) {
            z = true;
        }
        C2289a.m8311a(z);
        this.f5958b = jArr;
        this.f5959c = iArr;
        this.f5960d = i;
        this.f5961e = jArr2;
        this.f5962f = iArr2;
        this.f5963g = j;
        this.f5957a = jArr.length;
    }

    /* renamed from: a */
    public int m7531a(long j) {
        for (j = C2314v.m8460a(this.f5961e, j, true, false); j >= null; j--) {
            if ((this.f5962f[j] & 1) != 0) {
                return j;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public int m7532b(long j) {
        for (j = C2314v.m8484b(this.f5961e, j, true, false); j < this.f5961e.length; j++) {
            if ((this.f5962f[j] & 1) != 0) {
                return j;
            }
        }
        return -1;
    }
}
