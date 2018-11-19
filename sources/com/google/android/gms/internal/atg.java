package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.overlay.zzn;

final class atg implements zzn {
    /* renamed from: a */
    private /* synthetic */ zzwl f23121a;

    atg(zzwl zzwl) {
        this.f23121a = zzwl;
    }

    public final void onPause() {
        hx.m19911b("AdMobCustomTabsAdapter overlay is paused.");
    }

    public final void onResume() {
        hx.m19911b("AdMobCustomTabsAdapter overlay is resumed.");
    }

    public final void zzcg() {
        hx.m19911b("AdMobCustomTabsAdapter overlay is closed.");
        this.f23121a.f27079b.onAdClosed(this.f23121a);
    }

    public final void zzch() {
        hx.m19911b("Opening AdMobCustomTabsAdapter overlay.");
        this.f23121a.f27079b.onAdOpened(this.f23121a);
    }
}
