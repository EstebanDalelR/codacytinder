package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener;

@zzzv
public final class aov extends aog {
    /* renamed from: a */
    private final OnAppInstallAdLoadedListener f26763a;

    public aov(OnAppInstallAdLoadedListener onAppInstallAdLoadedListener) {
        this.f26763a = onAppInstallAdLoadedListener;
    }

    public final void zza(zzqe zzqe) {
        this.f26763a.onAppInstallAdLoaded(new anz(zzqe));
    }
}
