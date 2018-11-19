package com.google.android.exoplayer2;

public final class IllegalSeekPositionException extends IllegalStateException {
    /* renamed from: a */
    public final C2165q f5454a;
    /* renamed from: b */
    public final int f5455b;
    /* renamed from: c */
    public final long f5456c;

    public IllegalSeekPositionException(C2165q c2165q, int i, long j) {
        this.f5454a = c2165q;
        this.f5455b = i;
        this.f5456c = j;
    }
}
