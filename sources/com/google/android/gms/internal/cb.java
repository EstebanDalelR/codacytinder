package com.google.android.gms.internal;

import com.google.android.gms.ads.reward.RewardedVideoAdListener;

@zzzv
public final class cb extends bx {
    /* renamed from: a */
    private final RewardedVideoAdListener f26857a;

    public cb(RewardedVideoAdListener rewardedVideoAdListener) {
        this.f26857a = rewardedVideoAdListener;
    }

    public final void onRewardedVideoAdClosed() {
        if (this.f26857a != null) {
            this.f26857a.onRewardedVideoAdClosed();
        }
    }

    public final void onRewardedVideoAdFailedToLoad(int i) {
        if (this.f26857a != null) {
            this.f26857a.onRewardedVideoAdFailedToLoad(i);
        }
    }

    public final void onRewardedVideoAdLeftApplication() {
        if (this.f26857a != null) {
            this.f26857a.onRewardedVideoAdLeftApplication();
        }
    }

    public final void onRewardedVideoAdLoaded() {
        if (this.f26857a != null) {
            this.f26857a.onRewardedVideoAdLoaded();
        }
    }

    public final void onRewardedVideoAdOpened() {
        if (this.f26857a != null) {
            this.f26857a.onRewardedVideoAdOpened();
        }
    }

    public final void onRewardedVideoStarted() {
        if (this.f26857a != null) {
            this.f26857a.onRewardedVideoStarted();
        }
    }

    public final void zza(zzadh zzadh) {
        if (this.f26857a != null) {
            this.f26857a.onRewarded(new bz(zzadh));
        }
    }
}
