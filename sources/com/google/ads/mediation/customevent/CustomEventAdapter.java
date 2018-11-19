package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.C2003a;
import com.google.ads.mediation.C2004a;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.customevent.C4281a;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.hx;

@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter<C4281a, C3584a>, MediationInterstitialAdapter<C4281a, C3584a> {
    /* renamed from: a */
    private View f13537a;
    /* renamed from: b */
    private CustomEventBanner f13538b;
    /* renamed from: c */
    private CustomEventInterstitial f13539c;

    /* renamed from: com.google.ads.mediation.customevent.CustomEventAdapter$a */
    static final class C4235a implements CustomEventBannerListener {
        /* renamed from: a */
        private final CustomEventAdapter f13532a;
        /* renamed from: b */
        private final MediationBannerListener f13533b;

        public C4235a(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
            this.f13532a = customEventAdapter;
            this.f13533b = mediationBannerListener;
        }

        public final void onClick() {
            hx.b("Custom event adapter called onFailedToReceiveAd.");
            this.f13533b.onClick(this.f13532a);
        }

        public final void onDismissScreen() {
            hx.b("Custom event adapter called onFailedToReceiveAd.");
            this.f13533b.onDismissScreen(this.f13532a);
        }

        public final void onFailedToReceiveAd() {
            hx.b("Custom event adapter called onFailedToReceiveAd.");
            this.f13533b.onFailedToReceiveAd(this.f13532a, ErrorCode.NO_FILL);
        }

        public final void onLeaveApplication() {
            hx.b("Custom event adapter called onFailedToReceiveAd.");
            this.f13533b.onLeaveApplication(this.f13532a);
        }

        public final void onPresentScreen() {
            hx.b("Custom event adapter called onFailedToReceiveAd.");
            this.f13533b.onPresentScreen(this.f13532a);
        }

        public final void onReceivedAd(View view) {
            hx.b("Custom event adapter called onReceivedAd.");
            this.f13532a.m16811a(view);
            this.f13533b.onReceivedAd(this.f13532a);
        }
    }

    /* renamed from: com.google.ads.mediation.customevent.CustomEventAdapter$b */
    class C4236b implements CustomEventInterstitialListener {
        /* renamed from: a */
        private final CustomEventAdapter f13534a;
        /* renamed from: b */
        private final MediationInterstitialListener f13535b;
        /* renamed from: c */
        private /* synthetic */ CustomEventAdapter f13536c;

        public C4236b(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, MediationInterstitialListener mediationInterstitialListener) {
            this.f13536c = customEventAdapter;
            this.f13534a = customEventAdapter2;
            this.f13535b = mediationInterstitialListener;
        }

        public final void onDismissScreen() {
            hx.b("Custom event adapter called onDismissScreen.");
            this.f13535b.onDismissScreen(this.f13534a);
        }

        public final void onFailedToReceiveAd() {
            hx.b("Custom event adapter called onFailedToReceiveAd.");
            this.f13535b.onFailedToReceiveAd(this.f13534a, ErrorCode.NO_FILL);
        }

        public final void onLeaveApplication() {
            hx.b("Custom event adapter called onLeaveApplication.");
            this.f13535b.onLeaveApplication(this.f13534a);
        }

        public final void onPresentScreen() {
            hx.b("Custom event adapter called onPresentScreen.");
            this.f13535b.onPresentScreen(this.f13534a);
        }

        public final void onReceivedAd() {
            hx.b("Custom event adapter called onReceivedAd.");
            this.f13535b.onReceivedAd(this.f13536c);
        }
    }

    /* renamed from: a */
    private static <T> T m16810a(String str) {
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
    private final void m16811a(View view) {
        this.f13537a = view;
    }

    public final void destroy() {
        if (this.f13538b != null) {
            this.f13538b.destroy();
        }
        if (this.f13539c != null) {
            this.f13539c.destroy();
        }
    }

    public final Class<C4281a> getAdditionalParametersType() {
        return C4281a.class;
    }

    public final View getBannerView() {
        return this.f13537a;
    }

    public final Class<C3584a> getServerParametersType() {
        return C3584a.class;
    }

    public final void requestBannerAd(MediationBannerListener mediationBannerListener, Activity activity, C3584a c3584a, C2003a c2003a, C2004a c2004a, C4281a c4281a) {
        this.f13538b = (CustomEventBanner) m16810a(c3584a.f10687b);
        if (this.f13538b == null) {
            mediationBannerListener.onFailedToReceiveAd(this, ErrorCode.INTERNAL_ERROR);
        } else {
            this.f13538b.requestBannerAd(new C4235a(this, mediationBannerListener), activity, c3584a.f10686a, c3584a.f10688c, c2003a, c2004a, c4281a == null ? null : c4281a.m17160a(c3584a.f10686a));
        }
    }

    public final void requestInterstitialAd(MediationInterstitialListener mediationInterstitialListener, Activity activity, C3584a c3584a, C2004a c2004a, C4281a c4281a) {
        this.f13539c = (CustomEventInterstitial) m16810a(c3584a.f10687b);
        if (this.f13539c == null) {
            mediationInterstitialListener.onFailedToReceiveAd(this, ErrorCode.INTERNAL_ERROR);
        } else {
            this.f13539c.requestInterstitialAd(new C4236b(this, this, mediationInterstitialListener), activity, c3584a.f10686a, c3584a.f10688c, c2004a, c4281a == null ? null : c4281a.m17160a(c3584a.f10686a));
        }
    }

    public final void showInterstitial() {
        this.f13539c.showInterstitial();
    }
}
