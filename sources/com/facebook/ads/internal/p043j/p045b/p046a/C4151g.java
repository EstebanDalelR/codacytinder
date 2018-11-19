package com.facebook.ads.internal.p043j.p045b.p046a;

import java.io.File;

/* renamed from: com.facebook.ads.internal.j.b.a.g */
public class C4151g extends C3305e {
    /* renamed from: a */
    private final long f13270a;

    public C4151g(long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("Max size must be positive number!");
        }
        this.f13270a = j;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo1773a(File file) {
        super.mo1773a(file);
    }

    /* renamed from: a */
    protected boolean mo3338a(File file, long j, int i) {
        return j <= this.f13270a;
    }
}
