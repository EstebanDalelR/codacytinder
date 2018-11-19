package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.C2343d;
import com.google.android.gms.ads.mediation.C2418a;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.hx;

@KeepName
@KeepForSdkWithMembers
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    /* renamed from: a */
    private View f13935a;
    /* renamed from: b */
    private CustomEventBanner f13936b;
    /* renamed from: c */
    private CustomEventInterstitial f13937c;
    /* renamed from: d */
    private CustomEventNative f13938d;

    /* renamed from: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter$a */
    static final class C4278a implements CustomEventBannerListener {
        /* renamed from: a */
        private final CustomEventAdapter f13928a;
        /* renamed from: b */
        private final MediationBannerListener f13929b;

        public C4278a(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
            this.f13928a = customEventAdapter;
            this.f13929b = mediationBannerListener;
        }

        public final void onAdClicked() {
            hx.b("Custom event adapter called onAdClicked.");
            this.f13929b.onAdClicked(this.f13928a);
        }

        public final void onAdClosed() {
            hx.b("Custom event adapter called onAdClosed.");
            this.f13929b.onAdClosed(this.f13928a);
        }

        public final void onAdFailedToLoad(int i) {
            hx.b("Custom event adapter called onAdFailedToLoad.");
            this.f13929b.onAdFailedToLoad(this.f13928a, i);
        }

        public final void onAdLeftApplication() {
            hx.b("Custom event adapter called onAdLeftApplication.");
            this.f13929b.onAdLeftApplication(this.f13928a);
        }

        public final void onAdLoaded(View view) {
            hx.b("Custom event adapter called onAdLoaded.");
            this.f13928a.m17158a(view);
            this.f13929b.onAdLoaded(this.f13928a);
        }

        public final void onAdOpened() {
            hx.b("Custom event adapter called onAdOpened.");
            this.f13929b.onAdOpened(this.f13928a);
        }
    }

    /* renamed from: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter$b */
    class C4279b implements CustomEventInterstitialListener {
        /* renamed from: a */
        private final CustomEventAdapter f13930a;
        /* renamed from: b */
        private final MediationInterstitialListener f13931b;
        /* renamed from: c */
        private /* synthetic */ CustomEventAdapter f13932c;

        public C4279b(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, MediationInterstitialListener mediationInterstitialListener) {
            this.f13932c = customEventAdapter;
            this.f13930a = customEventAdapter2;
            this.f13931b = mediationInterstitialListener;
        }

        public final void onAdClicked() {
            hx.b("Custom event adapter called onAdClicked.");
            this.f13931b.onAdClicked(this.f13930a);
        }

        public final void onAdClosed() {
            hx.b("Custom event adapter called onAdClosed.");
            this.f13931b.onAdClosed(this.f13930a);
        }

        public final void onAdFailedToLoad(int i) {
            hx.b("Custom event adapter called onFailedToReceiveAd.");
            this.f13931b.onAdFailedToLoad(this.f13930a, i);
        }

        public final void onAdLeftApplication() {
            hx.b("Custom event adapter called onAdLeftApplication.");
            this.f13931b.onAdLeftApplication(this.f13930a);
        }

        public final void onAdLoaded() {
            hx.b("Custom event adapter called onReceivedAd.");
            this.f13931b.onAdLoaded(this.f13932c);
        }

        public final void onAdOpened() {
            hx.b("Custom event adapter called onAdOpened.");
            this.f13931b.onAdOpened(this.f13930a);
        }
    }

    /* renamed from: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter$c */
    static class C4280c implements CustomEventNativeListener {
        /* renamed from: a */
        private final CustomEventAdapter f13933a;
        /* renamed from: b */
        private final MediationNativeListener f13934b;

        public C4280c(CustomEventAdapter customEventAdapter, MediationNativeListener mediationNativeListener) {
            this.f13933a = customEventAdapter;
            this.f13934b = mediationNativeListener;
        }

        public final void onAdClicked() {
            hx.b("Custom event adapter called onAdClicked.");
            this.f13934b.onAdClicked(this.f13933a);
        }

        public final void onAdClosed() {
            hx.b("Custom event adapter called onAdClosed.");
            this.f13934b.onAdClosed(this.f13933a);
        }

        public final void onAdFailedToLoad(int i) {
            hx.b("Custom event adapter called onAdFailedToLoad.");
            this.f13934b.onAdFailedToLoad(this.f13933a, i);
        }

        public final void onAdImpression() {
            hx.b("Custom event adapter called onAdImpression.");
            this.f13934b.onAdImpression(this.f13933a);
        }

        public final void onAdLeftApplication() {
            hx.b("Custom event adapter called onAdLeftApplication.");
            this.f13934b.onAdLeftApplication(this.f13933a);
        }

        public final void onAdLoaded(C2418a c2418a) {
            hx.b("Custom event adapter called onAdLoaded.");
            this.f13934b.onAdLoaded(this.f13933a, c2418a);
        }

        public final void onAdOpened() {
            hx.b("Custom event adapter called onAdOpened.");
            this.f13934b.onAdOpened(this.f13933a);
        }
    }

    /* renamed from: a */
    private static <T> T m17157a(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 46) + String.valueOf(message).length());
            stringBuilder.append("Could not instantiate custom event adapter: ");
            stringBuilder.append(str);
            stringBuilder.append(". ");
            stringBuilder.append(message);
            hx.e(stringBuilder.toString());
            return null;
        }
    }

    /* renamed from: a */
    private final void m17158a(View view) {
        this.f13935a = view;
    }

    public final View getBannerView() {
        return this.f13935a;
    }

    public final void onDestroy() {
        if (this.f13936b != null) {
            this.f13936b.onDestroy();
        }
        if (this.f13937c != null) {
            this.f13937c.onDestroy();
        }
        if (this.f13938d != null) {
            this.f13938d.onDestroy();
        }
    }

    public final void onPause() {
        if (this.f13936b != null) {
            this.f13936b.onPause();
        }
        if (this.f13937c != null) {
            this.f13937c.onPause();
        }
        if (this.f13938d != null) {
            this.f13938d.onPause();
        }
    }

    public final void onResume() {
        if (this.f13936b != null) {
            this.f13936b.onResume();
        }
        if (this.f13937c != null) {
            this.f13937c.onResume();
        }
        if (this.f13938d != null) {
            this.f13938d.onResume();
        }
    }

    public final void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, C2343d c2343d, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.f13936b = (CustomEventBanner) m17157a(bundle.getString("class_name"));
        if (this.f13936b == null) {
            mediationBannerListener.onAdFailedToLoad(this, 0);
        } else {
            this.f13936b.requestBannerAd(context, new C4278a(this, mediationBannerListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), c2343d, mediationAdRequest, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
        }
    }

    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.f13937c = (CustomEventInterstitial) m17157a(bundle.getString("class_name"));
        if (this.f13937c == null) {
            mediationInterstitialListener.onAdFailedToLoad(this, 0);
        } else {
            this.f13937c.requestInterstitialAd(context, new C4279b(this, this, mediationInterstitialListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), mediationAdRequest, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
        }
    }

    public final void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        this.f13938d = (CustomEventNative) m17157a(bundle.getString("class_name"));
        if (this.f13938d == null) {
            mediationNativeListener.onAdFailedToLoad(this, 0);
        } else {
            this.f13938d.requestNativeAd(context, new C4280c(this, mediationNativeListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), nativeMediationAdRequest, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
        }
    }

    public final void showInterstitial() {
        this.f13937c.showInterstitial();
    }
}
