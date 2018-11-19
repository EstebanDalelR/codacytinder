package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;

@zzzv
public final class aox extends aok {
    /* renamed from: a */
    private final OnCustomClickListener f26765a;

    public aox(OnCustomClickListener onCustomClickListener) {
        this.f26765a = onCustomClickListener;
    }

    public final void zzb(zzqm zzqm, String str) {
        this.f26765a.onCustomClick(aof.m27165a(zzqm), str);
    }
}
