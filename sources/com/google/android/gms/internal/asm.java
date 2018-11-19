package com.google.android.gms.internal;

import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.C2412j;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.C2418a;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.common.internal.ad;

@zzzv
public final class asm implements MediationBannerListener, MediationInterstitialListener, MediationNativeListener {
    /* renamed from: a */
    private final zzvd f23117a;
    /* renamed from: b */
    private C2418a f23118b;
    /* renamed from: c */
    private NativeCustomTemplateAd f23119c;

    public asm(zzvd zzvd) {
        this.f23117a = zzvd;
    }

    /* renamed from: a */
    public final C2418a m27234a() {
        return this.f23118b;
    }

    /* renamed from: b */
    public final NativeCustomTemplateAd m27235b() {
        return this.f23119c;
    }

    public final void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        ad.b("onAdClicked must be called on the main UI thread.");
        hx.m19911b("Adapter called onAdClicked.");
        try {
            this.f23117a.onAdClicked();
        } catch (Throwable e) {
            hx.m19914c("Could not call onAdClicked.", e);
        }
    }

    public final void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        ad.b("onAdClicked must be called on the main UI thread.");
        hx.m19911b("Adapter called onAdClicked.");
        try {
            this.f23117a.onAdClicked();
        } catch (Throwable e) {
            hx.m19914c("Could not call onAdClicked.", e);
        }
    }

    public final void onAdClicked(MediationNativeAdapter mediationNativeAdapter) {
        ad.b("onAdClicked must be called on the main UI thread.");
        C2418a c2418a = this.f23118b;
        if (this.f23119c == null) {
            if (c2418a == null) {
                hx.m19916e("Could not call onAdClicked since NativeAdMapper is null.");
                return;
            } else if (!c2418a.b()) {
                hx.m19911b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        hx.m19911b("Adapter called onAdClicked.");
        try {
            this.f23117a.onAdClicked();
        } catch (Throwable e) {
            hx.m19914c("Could not call onAdClicked.", e);
        }
    }

    public final void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        ad.b("onAdClosed must be called on the main UI thread.");
        hx.m19911b("Adapter called onAdClosed.");
        try {
            this.f23117a.onAdClosed();
        } catch (Throwable e) {
            hx.m19914c("Could not call onAdClosed.", e);
        }
    }

    public final void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        ad.b("onAdClosed must be called on the main UI thread.");
        hx.m19911b("Adapter called onAdClosed.");
        try {
            this.f23117a.onAdClosed();
        } catch (Throwable e) {
            hx.m19914c("Could not call onAdClosed.", e);
        }
    }

    public final void onAdClosed(MediationNativeAdapter mediationNativeAdapter) {
        ad.b("onAdClosed must be called on the main UI thread.");
        hx.m19911b("Adapter called onAdClosed.");
        try {
            this.f23117a.onAdClosed();
        } catch (Throwable e) {
            hx.m19914c("Could not call onAdClosed.", e);
        }
    }

    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i) {
        ad.b("onAdFailedToLoad must be called on the main UI thread.");
        StringBuilder stringBuilder = new StringBuilder(55);
        stringBuilder.append("Adapter called onAdFailedToLoad with error. ");
        stringBuilder.append(i);
        hx.m19911b(stringBuilder.toString());
        try {
            this.f23117a.onAdFailedToLoad(i);
        } catch (Throwable e) {
            hx.m19914c("Could not call onAdFailedToLoad.", e);
        }
    }

    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        ad.b("onAdFailedToLoad must be called on the main UI thread.");
        StringBuilder stringBuilder = new StringBuilder(55);
        stringBuilder.append("Adapter called onAdFailedToLoad with error ");
        stringBuilder.append(i);
        stringBuilder.append(".");
        hx.m19911b(stringBuilder.toString());
        try {
            this.f23117a.onAdFailedToLoad(i);
        } catch (Throwable e) {
            hx.m19914c("Could not call onAdFailedToLoad.", e);
        }
    }

    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, int i) {
        ad.b("onAdFailedToLoad must be called on the main UI thread.");
        StringBuilder stringBuilder = new StringBuilder(55);
        stringBuilder.append("Adapter called onAdFailedToLoad with error ");
        stringBuilder.append(i);
        stringBuilder.append(".");
        hx.m19911b(stringBuilder.toString());
        try {
            this.f23117a.onAdFailedToLoad(i);
        } catch (Throwable e) {
            hx.m19914c("Could not call onAdFailedToLoad.", e);
        }
    }

    public final void onAdImpression(MediationNativeAdapter mediationNativeAdapter) {
        ad.b("onAdImpression must be called on the main UI thread.");
        C2418a c2418a = this.f23118b;
        if (this.f23119c == null) {
            if (c2418a == null) {
                hx.m19916e("Could not call onAdImpression since NativeAdMapper is null. ");
                return;
            } else if (!c2418a.a()) {
                hx.m19911b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        hx.m19911b("Adapter called onAdImpression.");
        try {
            this.f23117a.onAdImpression();
        } catch (Throwable e) {
            hx.m19914c("Could not call onAdImpression.", e);
        }
    }

    public final void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        ad.b("onAdLeftApplication must be called on the main UI thread.");
        hx.m19911b("Adapter called onAdLeftApplication.");
        try {
            this.f23117a.onAdLeftApplication();
        } catch (Throwable e) {
            hx.m19914c("Could not call onAdLeftApplication.", e);
        }
    }

    public final void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        ad.b("onAdLeftApplication must be called on the main UI thread.");
        hx.m19911b("Adapter called onAdLeftApplication.");
        try {
            this.f23117a.onAdLeftApplication();
        } catch (Throwable e) {
            hx.m19914c("Could not call onAdLeftApplication.", e);
        }
    }

    public final void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter) {
        ad.b("onAdLeftApplication must be called on the main UI thread.");
        hx.m19911b("Adapter called onAdLeftApplication.");
        try {
            this.f23117a.onAdLeftApplication();
        } catch (Throwable e) {
            hx.m19914c("Could not call onAdLeftApplication.", e);
        }
    }

    public final void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        ad.b("onAdLoaded must be called on the main UI thread.");
        hx.m19911b("Adapter called onAdLoaded.");
        try {
            this.f23117a.onAdLoaded();
        } catch (Throwable e) {
            hx.m19914c("Could not call onAdLoaded.", e);
        }
    }

    public final void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        ad.b("onAdLoaded must be called on the main UI thread.");
        hx.m19911b("Adapter called onAdLoaded.");
        try {
            this.f23117a.onAdLoaded();
        } catch (Throwable e) {
            hx.m19914c("Could not call onAdLoaded.", e);
        }
    }

    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, C2418a c2418a) {
        ad.b("onAdLoaded must be called on the main UI thread.");
        hx.m19911b("Adapter called onAdLoaded.");
        this.f23118b = c2418a;
        if (!(mediationNativeAdapter instanceof AdMobAdapter) && c2418a.h()) {
            C2412j c2412j = new C2412j();
            c2412j.a(new asj());
            this.f23118b.a(c2412j);
        }
        try {
            this.f23117a.onAdLoaded();
        } catch (Throwable e) {
            hx.m19914c("Could not call onAdLoaded.", e);
        }
    }

    public final void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        ad.b("onAdOpened must be called on the main UI thread.");
        hx.m19911b("Adapter called onAdOpened.");
        try {
            this.f23117a.onAdOpened();
        } catch (Throwable e) {
            hx.m19914c("Could not call onAdOpened.", e);
        }
    }

    public final void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        ad.b("onAdOpened must be called on the main UI thread.");
        hx.m19911b("Adapter called onAdOpened.");
        try {
            this.f23117a.onAdOpened();
        } catch (Throwable e) {
            hx.m19914c("Could not call onAdOpened.", e);
        }
    }

    public final void onAdOpened(MediationNativeAdapter mediationNativeAdapter) {
        ad.b("onAdOpened must be called on the main UI thread.");
        hx.m19911b("Adapter called onAdOpened.");
        try {
            this.f23117a.onAdOpened();
        } catch (Throwable e) {
            hx.m19914c("Could not call onAdOpened.", e);
        }
    }

    public final void onVideoEnd(MediationNativeAdapter mediationNativeAdapter) {
        ad.b("onVideoEnd must be called on the main UI thread.");
        hx.m19911b("Adapter called onVideoEnd.");
        try {
            this.f23117a.onVideoEnd();
        } catch (Throwable e) {
            hx.m19914c("Could not call onVideoEnd.", e);
        }
    }

    public final void zza(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        ad.b("onAppEvent must be called on the main UI thread.");
        hx.m19911b("Adapter called onAppEvent.");
        try {
            this.f23117a.onAppEvent(str, str2);
        } catch (Throwable e) {
            hx.m19914c("Could not call onAppEvent.", e);
        }
    }

    public final void zza(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd) {
        ad.b("onAdLoaded must be called on the main UI thread.");
        String str = "Adapter called onAdLoaded with template id ";
        String valueOf = String.valueOf(nativeCustomTemplateAd.getCustomTemplateId());
        hx.m19911b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        this.f23119c = nativeCustomTemplateAd;
        try {
            this.f23117a.onAdLoaded();
        } catch (Throwable e) {
            hx.m19914c("Could not call onAdLoaded.", e);
        }
    }

    public final void zza(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
        if (nativeCustomTemplateAd instanceof aof) {
            try {
                this.f23117a.zzb(((aof) nativeCustomTemplateAd).m27166a(), str);
                return;
            } catch (Throwable e) {
                hx.m19914c("Could not call onCustomClick.", e);
                return;
            }
        }
        hx.m19916e("Unexpected native custom template ad type.");
    }
}
