package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener;

@zzzv
public final class aow extends aoi {
    /* renamed from: a */
    private final OnContentAdLoadedListener f26764a;

    public aow(OnContentAdLoadedListener onContentAdLoadedListener) {
        this.f26764a = onContentAdLoadedListener;
    }

    public final void zza(zzqi zzqi) {
        this.f26764a.onContentAdLoaded(new aoc(zzqi));
    }
}
