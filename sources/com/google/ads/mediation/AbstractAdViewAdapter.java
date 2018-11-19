package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.C2338a;
import com.google.android.gms.ads.C2340b;
import com.google.android.gms.ads.C2340b.C2339a;
import com.google.android.gms.ads.C2342c;
import com.google.android.gms.ads.C2342c.C2341a;
import com.google.android.gms.ads.C2343d;
import com.google.android.gms.ads.C2363h;
import com.google.android.gms.ads.C2412j;
import com.google.android.gms.ads.C3731e;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.formats.C2357d;
import com.google.android.gms.ads.formats.C2358e;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener;
import com.google.android.gms.ads.mediation.C3778b;
import com.google.android.gms.ads.mediation.C3779c;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationAdapter.C2417a;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.internal.aja;
import com.google.android.gms.internal.hn;
import com.google.android.gms.internal.hx;
import com.google.android.gms.internal.zzapc;
import com.google.android.gms.internal.zzje;
import com.google.android.gms.internal.zzll;
import com.google.android.gms.internal.zzzv;
import java.util.Date;
import java.util.Set;

@zzzv
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationNativeAdapter, OnImmersiveModeUpdatedListener, zza, MediationRewardedVideoAdAdapter, zzapc {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private C3731e zzgt;
    private C2363h zzgu;
    private C2340b zzgv;
    private Context zzgw;
    private C2363h zzgx;
    private MediationRewardedVideoAdListener zzgy;
    private RewardedVideoAdListener zzgz = new C3583b(this);

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$c */
    static final class C3580c extends C2338a implements AppEventListener, zzje {
        /* renamed from: a */
        private AbstractAdViewAdapter f10679a;
        /* renamed from: b */
        private MediationBannerListener f10680b;

        public C3580c(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
            this.f10679a = abstractAdViewAdapter;
            this.f10680b = mediationBannerListener;
        }

        public final void onAdClicked() {
            this.f10680b.onAdClicked(this.f10679a);
        }

        public final void onAdClosed() {
            this.f10680b.onAdClosed(this.f10679a);
        }

        public final void onAdFailedToLoad(int i) {
            this.f10680b.onAdFailedToLoad(this.f10679a, i);
        }

        public final void onAdLeftApplication() {
            this.f10680b.onAdLeftApplication(this.f10679a);
        }

        public final void onAdLoaded() {
            this.f10680b.onAdLoaded(this.f10679a);
        }

        public final void onAdOpened() {
            this.f10680b.onAdOpened(this.f10679a);
        }

        public final void onAppEvent(String str, String str2) {
            this.f10680b.zza(this.f10679a, str, str2);
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$d */
    static final class C3581d extends C2338a implements zzje {
        /* renamed from: a */
        private AbstractAdViewAdapter f10681a;
        /* renamed from: b */
        private MediationInterstitialListener f10682b;

        public C3581d(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
            this.f10681a = abstractAdViewAdapter;
            this.f10682b = mediationInterstitialListener;
        }

        public final void onAdClicked() {
            this.f10682b.onAdClicked(this.f10681a);
        }

        public final void onAdClosed() {
            this.f10682b.onAdClosed(this.f10681a);
        }

        public final void onAdFailedToLoad(int i) {
            this.f10682b.onAdFailedToLoad(this.f10681a, i);
        }

        public final void onAdLeftApplication() {
            this.f10682b.onAdLeftApplication(this.f10681a);
        }

        public final void onAdLoaded() {
            this.f10682b.onAdLoaded(this.f10681a);
        }

        public final void onAdOpened() {
            this.f10682b.onAdOpened(this.f10681a);
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$e */
    static final class C3582e extends C2338a implements OnAppInstallAdLoadedListener, OnContentAdLoadedListener, OnCustomClickListener, OnCustomTemplateAdLoadedListener {
        /* renamed from: a */
        private AbstractAdViewAdapter f10683a;
        /* renamed from: b */
        private MediationNativeListener f10684b;

        public C3582e(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
            this.f10683a = abstractAdViewAdapter;
            this.f10684b = mediationNativeListener;
        }

        public final void onAdClicked() {
            this.f10684b.onAdClicked(this.f10683a);
        }

        public final void onAdClosed() {
            this.f10684b.onAdClosed(this.f10683a);
        }

        public final void onAdFailedToLoad(int i) {
            this.f10684b.onAdFailedToLoad(this.f10683a, i);
        }

        public final void onAdImpression() {
            this.f10684b.onAdImpression(this.f10683a);
        }

        public final void onAdLeftApplication() {
            this.f10684b.onAdLeftApplication(this.f10683a);
        }

        public final void onAdLoaded() {
        }

        public final void onAdOpened() {
            this.f10684b.onAdOpened(this.f10683a);
        }

        public final void onAppInstallAdLoaded(NativeAppInstallAd nativeAppInstallAd) {
            this.f10684b.onAdLoaded(this.f10683a, new C4233a(nativeAppInstallAd));
        }

        public final void onContentAdLoaded(NativeContentAd nativeContentAd) {
            this.f10684b.onAdLoaded(this.f10683a, new C4234b(nativeContentAd));
        }

        public final void onCustomClick(NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
            this.f10684b.zza(this.f10683a, nativeCustomTemplateAd, str);
        }

        public final void onCustomTemplateAdLoaded(NativeCustomTemplateAd nativeCustomTemplateAd) {
            this.f10684b.zza(this.f10683a, nativeCustomTemplateAd);
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$a */
    static class C4233a extends C3778b {
        /* renamed from: e */
        private final NativeAppInstallAd f13530e;

        public C4233a(NativeAppInstallAd nativeAppInstallAd) {
            this.f13530e = nativeAppInstallAd;
            m14185a(nativeAppInstallAd.m14157b().toString());
            m14186a(nativeAppInstallAd.m14158c());
            m14187b(nativeAppInstallAd.m14159d().toString());
            m14184a(nativeAppInstallAd.m14160e());
            m14188c(nativeAppInstallAd.m14161f().toString());
            if (nativeAppInstallAd.m14162g() != null) {
                m14183a(nativeAppInstallAd.m14162g().doubleValue());
            }
            if (nativeAppInstallAd.m14163h() != null) {
                m14189d(nativeAppInstallAd.m14163h().toString());
            }
            if (nativeAppInstallAd.m14164i() != null) {
                m14190e(nativeAppInstallAd.m14164i().toString());
            }
            m8769a(true);
            m8772b(true);
            m8768a(nativeAppInstallAd.m14165j());
        }

        /* renamed from: a */
        public final void mo3379a(View view) {
            if (view instanceof C2357d) {
                ((C2357d) view).setNativeAd(this.f13530e);
            }
            C2358e c2358e = (C2358e) C2358e.f7064a.get(view);
            if (c2358e != null) {
                c2358e.m8607a(this.f13530e);
            }
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$b */
    static class C4234b extends C3779c {
        /* renamed from: e */
        private final NativeContentAd f13531e;

        public C4234b(NativeContentAd nativeContentAd) {
            this.f13531e = nativeContentAd;
            m14200a(nativeContentAd.m14166b().toString());
            m14201a(nativeContentAd.m14167c());
            m14202b(nativeContentAd.m14168d().toString());
            if (nativeContentAd.m14169e() != null) {
                m14199a(nativeContentAd.m14169e());
            }
            m14203c(nativeContentAd.m14170f().toString());
            m14204d(nativeContentAd.m14171g().toString());
            m8769a(true);
            m8772b(true);
            m8768a(nativeContentAd.m14172h());
        }

        /* renamed from: a */
        public final void mo3379a(View view) {
            if (view instanceof C2357d) {
                ((C2357d) view).setNativeAd(this.f13531e);
            }
            C2358e c2358e = (C2358e) C2358e.f7064a.get(view);
            if (c2358e != null) {
                c2358e.m8607a(this.f13531e);
            }
        }
    }

    private final C2342c zza(Context context, MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        C2341a c2341a = new C2341a();
        Date birthday = mediationAdRequest.getBirthday();
        if (birthday != null) {
            c2341a.m8556a(birthday);
        }
        int gender = mediationAdRequest.getGender();
        if (gender != 0) {
            c2341a.m8552a(gender);
        }
        Set<String> keywords = mediationAdRequest.getKeywords();
        if (keywords != null) {
            for (String a : keywords) {
                c2341a.m8555a(a);
            }
        }
        Location location = mediationAdRequest.getLocation();
        if (location != null) {
            c2341a.m8553a(location);
        }
        if (mediationAdRequest.isTesting()) {
            aja.a();
            c2341a.m8559b(hn.a(context));
        }
        if (mediationAdRequest.taggedForChildDirectedTreatment() != -1) {
            boolean z = true;
            if (mediationAdRequest.taggedForChildDirectedTreatment() != 1) {
                z = false;
            }
            c2341a.m8557a(z);
        }
        c2341a.m8560b(mediationAdRequest.isDesignedForFamilies());
        c2341a.m8554a(AdMobAdapter.class, zza(bundle, bundle2));
        return c2341a.m8558a();
    }

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    public View getBannerView() {
        return this.zzgt;
    }

    public Bundle getInterstitialAdapterInfo() {
        return new C2417a().m8766a(1).m8765a();
    }

    public zzll getVideoController() {
        if (this.zzgt != null) {
            C2412j videoController = this.zzgt.getVideoController();
            if (videoController != null) {
                return videoController.m8746a();
            }
        }
        return null;
    }

    public void initialize(Context context, MediationAdRequest mediationAdRequest, String str, MediationRewardedVideoAdListener mediationRewardedVideoAdListener, Bundle bundle, Bundle bundle2) {
        this.zzgw = context.getApplicationContext();
        this.zzgy = mediationRewardedVideoAdListener;
        this.zzgy.onInitializationSucceeded(this);
    }

    public boolean isInitialized() {
        return this.zzgy != null;
    }

    public void loadAd(MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        if (this.zzgw != null) {
            if (this.zzgy != null) {
                this.zzgx = new C2363h(this.zzgw);
                this.zzgx.m8614a(true);
                this.zzgx.m8613a(getAdUnitId(bundle));
                this.zzgx.m8612a(this.zzgz);
                this.zzgx.m8611a(zza(this.zzgw, mediationAdRequest, bundle2, bundle));
                return;
            }
        }
        hx.c("AdMobAdapter.loadAd called before initialize.");
    }

    public void onDestroy() {
        if (this.zzgt != null) {
            this.zzgt.mo2460c();
            this.zzgt = null;
        }
        if (this.zzgu != null) {
            this.zzgu = null;
        }
        if (this.zzgv != null) {
            this.zzgv = null;
        }
        if (this.zzgx != null) {
            this.zzgx = null;
        }
    }

    public void onImmersiveModeUpdated(boolean z) {
        if (this.zzgu != null) {
            this.zzgu.m8615b(z);
        }
        if (this.zzgx != null) {
            this.zzgx.m8615b(z);
        }
    }

    public void onPause() {
        if (this.zzgt != null) {
            this.zzgt.mo2459b();
        }
    }

    public void onResume() {
        if (this.zzgt != null) {
            this.zzgt.mo2457a();
        }
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, C2343d c2343d, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.zzgt = new C3731e(context);
        this.zzgt.setAdSize(new C2343d(c2343d.m8564b(), c2343d.m8562a()));
        this.zzgt.setAdUnitId(getAdUnitId(bundle));
        this.zzgt.setAdListener(new C3580c(this, mediationBannerListener));
        this.zzgt.mo2458a(zza(context, mediationAdRequest, bundle2, bundle));
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.zzgu = new C2363h(context);
        this.zzgu.m8613a(getAdUnitId(bundle));
        this.zzgu.m8610a(new C3581d(this, mediationInterstitialListener));
        this.zzgu.m8611a(zza(context, mediationAdRequest, bundle2, bundle));
    }

    public void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        OnContentAdLoadedListener c3582e = new C3582e(this, mediationNativeListener);
        C2339a a = new C2339a(context, bundle.getString(AD_UNIT_ID_PARAMETER)).m8542a((C2338a) c3582e);
        NativeAdOptions nativeAdOptions = nativeMediationAdRequest.getNativeAdOptions();
        if (nativeAdOptions != null) {
            a.m8543a(nativeAdOptions);
        }
        if (nativeMediationAdRequest.isAppInstallAdRequested()) {
            a.m8544a((OnAppInstallAdLoadedListener) c3582e);
        }
        if (nativeMediationAdRequest.isContentAdRequested()) {
            a.m8545a(c3582e);
        }
        if (nativeMediationAdRequest.zzmo()) {
            for (String str : nativeMediationAdRequest.zzmp().keySet()) {
                a.m8546a(str, c3582e, ((Boolean) nativeMediationAdRequest.zzmp().get(str)).booleanValue() ? c3582e : null);
            }
        }
        this.zzgv = a.m8547a();
        this.zzgv.m8549a(zza(context, nativeMediationAdRequest, bundle2, bundle));
    }

    public void showInterstitial() {
        this.zzgu.m8609a();
    }

    public void showVideo() {
        this.zzgx.m8609a();
    }

    protected abstract Bundle zza(Bundle bundle, Bundle bundle2);
}
