package com.google.android.exoplayer2.util;

import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.util.g */
public final class C2296g {
    /* renamed from: a */
    private int f6906a;
    /* renamed from: b */
    private long[] f6907b;

    public C2296g() {
        this(32);
    }

    public C2296g(int i) {
        this.f6907b = new long[i];
    }

    /* renamed from: a */
    public void m8339a(long j) {
        if (this.f6906a == this.f6907b.length) {
            this.f6907b = Arrays.copyOf(this.f6907b, this.f6906a * 2);
        }
        long[] jArr = this.f6907b;
        int i = this.f6906a;
        this.f6906a = i + 1;
        jArr[i] = j;
    }

    /* renamed from: a */
    public long m8338a(int i) {
        if (i >= 0) {
            if (i < this.f6906a) {
                return this.f6907b[i];
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid index ");
        stringBuilder.append(i);
        stringBuilder.append(", size is ");
        stringBuilder.append(this.f6906a);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    /* renamed from: a */
    public int m8337a() {
        return this.f6906a;
    }

    /* renamed from: b */
    public long[] m8340b() {
        return Arrays.copyOf(this.f6907b, this.f6906a);
    }
}
