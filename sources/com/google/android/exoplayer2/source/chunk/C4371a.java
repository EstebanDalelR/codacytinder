package com.google.android.exoplayer2.source.chunk;

/* renamed from: com.google.android.exoplayer2.source.chunk.a */
public abstract class C4371a extends C4249g {
    /* renamed from: a */
    public final long f14437a;
    /* renamed from: k */
    private C3679b f14438k;
    /* renamed from: l */
    private int[] f14439l;

    /* renamed from: a */
    public void m18015a(C3679b c3679b) {
        this.f14438k = c3679b;
        this.f14439l = c3679b.m13943a();
    }

    /* renamed from: a */
    public final int m18014a(int i) {
        return this.f14439l[i];
    }
}
