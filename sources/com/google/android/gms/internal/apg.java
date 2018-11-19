package com.google.android.gms.internal;

final class apg implements Runnable {
    /* renamed from: a */
    private /* synthetic */ String f15562a;
    /* renamed from: b */
    private /* synthetic */ long f15563b;
    /* renamed from: c */
    private /* synthetic */ aom f15564c;

    apg(aom aom, String str, long j) {
        this.f15564c = aom;
        this.f15562a = str;
        this.f15563b = j;
    }

    public final void run() {
        this.f15564c.f15535a.m19566a(this.f15562a, this.f15563b);
        this.f15564c.f15535a.m19565a(toString());
    }
}
