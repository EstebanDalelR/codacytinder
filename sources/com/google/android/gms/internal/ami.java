package com.google.android.gms.internal;

import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;

@zzzv
public final class ami extends amg {
    /* renamed from: a */
    private final OnCustomRenderedAdLoadedListener f26668a;

    public ami(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.f26668a = onCustomRenderedAdLoadedListener;
    }

    public final void zza(zznx zznx) {
        this.f26668a.onCustomRenderedAdLoaded(new amd(zznx));
    }
}
