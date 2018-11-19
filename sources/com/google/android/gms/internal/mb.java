package com.google.android.gms.internal;

@zzzv
public final class mb {
    /* renamed from: a */
    public final int f16367a;
    /* renamed from: b */
    public final int f16368b;
    /* renamed from: c */
    private final int f16369c;

    private mb(int i, int i2, int i3) {
        this.f16369c = i;
        this.f16368b = i2;
        this.f16367a = i3;
    }

    /* renamed from: a */
    public static mb m20043a() {
        return new mb(0, 0, 0);
    }

    /* renamed from: a */
    public static mb m20044a(int i, int i2) {
        return new mb(1, i, i2);
    }

    /* renamed from: a */
    public static mb m20045a(zzjn zzjn) {
        return zzjn.zzbel ? new mb(3, 0, 0) : zzjn.zzbeo ? new mb(2, 0, 0) : zzjn.zzben ? m20043a() : m20044a(zzjn.widthPixels, zzjn.heightPixels);
    }

    /* renamed from: b */
    public static mb m20046b() {
        return new mb(4, 0, 0);
    }

    /* renamed from: c */
    public final boolean m20047c() {
        return this.f16369c == 2;
    }

    /* renamed from: d */
    public final boolean m20048d() {
        return this.f16369c == 3;
    }

    /* renamed from: e */
    public final boolean m20049e() {
        return this.f16369c == 0;
    }

    /* renamed from: f */
    public final boolean m20050f() {
        return this.f16369c == 4;
    }
}
