package com.google.android.gms.internal;

public final class aib {
    /* renamed from: a */
    private final byte[] f15286a;
    /* renamed from: b */
    private int f15287b;
    /* renamed from: c */
    private int f15288c;
    /* renamed from: d */
    private /* synthetic */ ahz f15289d;

    private aib(ahz ahz, byte[] bArr) {
        this.f15289d = ahz;
        this.f15286a = bArr;
    }

    /* renamed from: a */
    public final aib m19191a(int i) {
        this.f15287b = i;
        return this;
    }

    /* renamed from: a */
    public final synchronized void m19192a() {
        try {
            if (this.f15289d.f15285b) {
                this.f15289d.f15284a.zzc(this.f15286a);
                this.f15289d.f15284a.zzg(this.f15287b);
                this.f15289d.f15284a.zzh(this.f15288c);
                this.f15289d.f15284a.zza(null);
                this.f15289d.f15284a.zzbk();
            }
        } catch (Throwable e) {
            hx.m19909a("Clearcut log failed", e);
        }
    }

    /* renamed from: b */
    public final aib m19193b(int i) {
        this.f15288c = i;
        return this;
    }
}
