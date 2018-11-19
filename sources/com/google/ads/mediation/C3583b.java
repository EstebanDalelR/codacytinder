package com.google.ads.mediation;

import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

/* renamed from: com.google.ads.mediation.b */
final class C3583b implements RewardedVideoAdListener {
    /* renamed from: a */
    private /* synthetic */ AbstractAdViewAdapter f10685a;

    C3583b(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.f10685a = abstractAdViewAdapter;
    }

    public final void onRewarded(RewardItem rewardItem) {
        this.f10685a.zzgy.onRewarded(this.f10685a, rewardItem);
    }

    public final void onRewardedVideoAdClosed() {
        this.f10685a.zzgy.onAdClosed(this.f10685a);
        this.f10685a.zzgx = null;
    }

    public final void onRewardedVideoAdFailedToLoad(int i) {
        this.f10685a.zzgy.onAdFailedToLoad(this.f10685a, i);
    }

    public final void onRewardedVideoAdLeftApplication() {
        this.f10685a.zzgy.onAdLeftApplication(this.f10685a);
    }

    public final void onRewardedVideoAdLoaded() {
        this.f10685a.zzgy.onAdLoaded(this.f10685a);
    }

    public final void onRewardedVideoAdOpened() {
        this.f10685a.zzgy.onAdOpened(this.f10685a);
    }

    public final void onRewardedVideoStarted() {
        this.f10685a.zzgy.onVideoStarted(this.f10685a);
    }
}
