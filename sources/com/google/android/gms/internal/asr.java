package com.google.android.gms.internal;

import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;

@zzzv
public final class asr<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> implements MediationBannerListener, MediationInterstitialListener {
    /* renamed from: a */
    private final zzvd f23120a;

    public asr(zzvd zzvd) {
        this.f23120a = zzvd;
    }

    public final void onClick(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        hx.m19911b("Adapter called onClick.");
        aja.m19216a();
        if (hn.m19874b()) {
            try {
                this.f23120a.onAdClicked();
                return;
            } catch (Throwable e) {
                hx.m19914c("Could not call onAdClicked.", e);
                return;
            }
        }
        hx.m19916e("onClick must be called on the main UI thread.");
        hn.f16157a.post(new ass(this));
    }

    public final void onDismissScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        hx.m19911b("Adapter called onDismissScreen.");
        aja.m19216a();
        if (hn.m19874b()) {
            try {
                this.f23120a.onAdClosed();
                return;
            } catch (Throwable e) {
                hx.m19914c("Could not call onAdClosed.", e);
                return;
            }
        }
        hx.m19916e("onDismissScreen must be called on the main UI thread.");
        hn.f16157a.post(new asw(this));
    }

    public final void onDismissScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        hx.m19911b("Adapter called onDismissScreen.");
        aja.m19216a();
        if (hn.m19874b()) {
            try {
                this.f23120a.onAdClosed();
                return;
            } catch (Throwable e) {
                hx.m19914c("Could not call onAdClosed.", e);
                return;
            }
        }
        hx.m19916e("onDismissScreen must be called on the main UI thread.");
        hn.f16157a.post(new atb(this));
    }

    public final void onFailedToReceiveAd(MediationBannerAdapter<?, ?> mediationBannerAdapter, ErrorCode errorCode) {
        String valueOf = String.valueOf(errorCode);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 47);
        stringBuilder.append("Adapter called onFailedToReceiveAd with error. ");
        stringBuilder.append(valueOf);
        hx.m19911b(stringBuilder.toString());
        aja.m19216a();
        if (hn.m19874b()) {
            try {
                this.f23120a.onAdFailedToLoad(ate.m19471a(errorCode));
                return;
            } catch (Throwable e) {
                hx.m19914c("Could not call onAdFailedToLoad.", e);
                return;
            }
        }
        hx.m19916e("onFailedToReceiveAd must be called on the main UI thread.");
        hn.f16157a.post(new asx(this, errorCode));
    }

    public final void onFailedToReceiveAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, ErrorCode errorCode) {
        String valueOf = String.valueOf(errorCode);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 47);
        stringBuilder.append("Adapter called onFailedToReceiveAd with error ");
        stringBuilder.append(valueOf);
        stringBuilder.append(".");
        hx.m19911b(stringBuilder.toString());
        aja.m19216a();
        if (hn.m19874b()) {
            try {
                this.f23120a.onAdFailedToLoad(ate.m19471a(errorCode));
                return;
            } catch (Throwable e) {
                hx.m19914c("Could not call onAdFailedToLoad.", e);
                return;
            }
        }
        hx.m19916e("onFailedToReceiveAd must be called on the main UI thread.");
        hn.f16157a.post(new atc(this, errorCode));
    }

    public final void onLeaveApplication(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        hx.m19911b("Adapter called onLeaveApplication.");
        aja.m19216a();
        if (hn.m19874b()) {
            try {
                this.f23120a.onAdLeftApplication();
                return;
            } catch (Throwable e) {
                hx.m19914c("Could not call onAdLeftApplication.", e);
                return;
            }
        }
        hx.m19916e("onLeaveApplication must be called on the main UI thread.");
        hn.f16157a.post(new asy(this));
    }

    public final void onLeaveApplication(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        hx.m19911b("Adapter called onLeaveApplication.");
        aja.m19216a();
        if (hn.m19874b()) {
            try {
                this.f23120a.onAdLeftApplication();
                return;
            } catch (Throwable e) {
                hx.m19914c("Could not call onAdLeftApplication.", e);
                return;
            }
        }
        hx.m19916e("onLeaveApplication must be called on the main UI thread.");
        hn.f16157a.post(new atd(this));
    }

    public final void onPresentScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        hx.m19911b("Adapter called onPresentScreen.");
        aja.m19216a();
        if (hn.m19874b()) {
            try {
                this.f23120a.onAdOpened();
                return;
            } catch (Throwable e) {
                hx.m19914c("Could not call onAdOpened.", e);
                return;
            }
        }
        hx.m19916e("onPresentScreen must be called on the main UI thread.");
        hn.f16157a.post(new asz(this));
    }

    public final void onPresentScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        hx.m19911b("Adapter called onPresentScreen.");
        aja.m19216a();
        if (hn.m19874b()) {
            try {
                this.f23120a.onAdOpened();
                return;
            } catch (Throwable e) {
                hx.m19914c("Could not call onAdOpened.", e);
                return;
            }
        }
        hx.m19916e("onPresentScreen must be called on the main UI thread.");
        hn.f16157a.post(new ast(this));
    }

    public final void onReceivedAd(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        hx.m19911b("Adapter called onReceivedAd.");
        aja.m19216a();
        if (hn.m19874b()) {
            try {
                this.f23120a.onAdLoaded();
                return;
            } catch (Throwable e) {
                hx.m19914c("Could not call onAdLoaded.", e);
                return;
            }
        }
        hx.m19916e("onReceivedAd must be called on the main UI thread.");
        hn.f16157a.post(new ata(this));
    }

    public final void onReceivedAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        hx.m19911b("Adapter called onReceivedAd.");
        aja.m19216a();
        if (hn.m19874b()) {
            try {
                this.f23120a.onAdLoaded();
                return;
            } catch (Throwable e) {
                hx.m19914c("Could not call onAdLoaded.", e);
                return;
            }
        }
        hx.m19916e("onReceivedAd must be called on the main UI thread.");
        hn.f16157a.post(new asv(this));
    }
}
