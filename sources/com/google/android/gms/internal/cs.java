package com.google.android.gms.internal;

import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.dynamic.C4296b;

@zzzv
public final class cs implements MediationRewardedVideoAdListener {
    /* renamed from: a */
    private final zzaem f23242a;

    public cs(zzaem zzaem) {
        this.f23242a = zzaem;
    }

    public final void onAdClicked(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        ad.b("onAdClicked must be called on the main UI thread.");
        hx.m19911b("Adapter called onAdClicked.");
        try {
            this.f23242a.zzr(C4296b.a(mediationRewardedVideoAdAdapter));
        } catch (Throwable e) {
            hx.m19914c("Could not call onAdClicked.", e);
        }
    }

    public final void onAdClosed(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        ad.b("onAdClosed must be called on the main UI thread.");
        hx.m19911b("Adapter called onAdClosed.");
        try {
            this.f23242a.zzq(C4296b.a(mediationRewardedVideoAdAdapter));
        } catch (Throwable e) {
            hx.m19914c("Could not call onAdClosed.", e);
        }
    }

    public final void onAdFailedToLoad(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i) {
        ad.b("onAdFailedToLoad must be called on the main UI thread.");
        hx.m19911b("Adapter called onAdFailedToLoad.");
        try {
            this.f23242a.zzd(C4296b.a(mediationRewardedVideoAdAdapter), i);
        } catch (Throwable e) {
            hx.m19914c("Could not call onAdFailedToLoad.", e);
        }
    }

    public final void onAdLeftApplication(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        ad.b("onAdLeftApplication must be called on the main UI thread.");
        hx.m19911b("Adapter called onAdLeftApplication.");
        try {
            this.f23242a.zzs(C4296b.a(mediationRewardedVideoAdAdapter));
        } catch (Throwable e) {
            hx.m19914c("Could not call onAdLeftApplication.", e);
        }
    }

    public final void onAdLoaded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        ad.b("onAdLoaded must be called on the main UI thread.");
        hx.m19911b("Adapter called onAdLoaded.");
        try {
            this.f23242a.zzn(C4296b.a(mediationRewardedVideoAdAdapter));
        } catch (Throwable e) {
            hx.m19914c("Could not call onAdLoaded.", e);
        }
    }

    public final void onAdOpened(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        ad.b("onAdOpened must be called on the main UI thread.");
        hx.m19911b("Adapter called onAdOpened.");
        try {
            this.f23242a.zzo(C4296b.a(mediationRewardedVideoAdAdapter));
        } catch (Throwable e) {
            hx.m19914c("Could not call onAdOpened.", e);
        }
    }

    public final void onInitializationFailed(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i) {
        ad.b("onInitializationFailed must be called on the main UI thread.");
        hx.m19911b("Adapter called onInitializationFailed.");
        try {
            this.f23242a.zzc(C4296b.a(mediationRewardedVideoAdAdapter), i);
        } catch (Throwable e) {
            hx.m19914c("Could not call onInitializationFailed.", e);
        }
    }

    public final void onInitializationSucceeded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        ad.b("onInitializationSucceeded must be called on the main UI thread.");
        hx.m19911b("Adapter called onInitializationSucceeded.");
        try {
            this.f23242a.zzm(C4296b.a(mediationRewardedVideoAdAdapter));
        } catch (Throwable e) {
            hx.m19914c("Could not call onInitializationSucceeded.", e);
        }
    }

    public final void onRewarded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, RewardItem rewardItem) {
        ad.b("onRewarded must be called on the main UI thread.");
        hx.m19911b("Adapter called onRewarded.");
        if (rewardItem != null) {
            try {
                this.f23242a.zza(C4296b.a(mediationRewardedVideoAdAdapter), new zzaeq(rewardItem));
                return;
            } catch (Throwable e) {
                hx.m19914c("Could not call onRewarded.", e);
                return;
            }
        }
        this.f23242a.zza(C4296b.a(mediationRewardedVideoAdAdapter), new zzaeq("", 1));
    }

    public final void onVideoStarted(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        ad.b("onVideoStarted must be called on the main UI thread.");
        hx.m19911b("Adapter called onVideoStarted.");
        try {
            this.f23242a.zzp(C4296b.a(mediationRewardedVideoAdAdapter));
        } catch (Throwable e) {
            hx.m19914c("Could not call onVideoStarted.", e);
        }
    }
}
