package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.C0164c;
import android.support.customtabs.C0164c.C0163a;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.common.util.C2526k;

@zzzv
public final class zzwl implements MediationInterstitialAdapter {
    /* renamed from: a */
    private Activity f27078a;
    /* renamed from: b */
    private MediationInterstitialListener f27079b;
    /* renamed from: c */
    private Uri f27080c;

    public final void onDestroy() {
        hx.m19911b("Destroying AdMobCustomTabsAdapter adapter.");
    }

    public final void onPause() {
        hx.m19911b("Pausing AdMobCustomTabsAdapter adapter.");
    }

    public final void onResume() {
        hx.m19911b("Resuming AdMobCustomTabsAdapter adapter.");
    }

    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.f27079b = mediationInterstitialListener;
        if (this.f27079b == null) {
            hx.m19916e("Listener not set for mediation. Returning.");
        } else if (context instanceof Activity) {
            Object obj = (C2526k.a() && amj.m27136a(context)) ? 1 : null;
            if (obj == null) {
                hx.m19916e("Default browser does not support custom tabs. Bailing out.");
                this.f27079b.onAdFailedToLoad(this, 0);
                return;
            }
            obj = bundle.getString("tab_url");
            if (TextUtils.isEmpty(obj)) {
                hx.m19916e("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.f27079b.onAdFailedToLoad(this, 0);
                return;
            }
            this.f27078a = (Activity) context;
            this.f27080c = Uri.parse(obj);
            this.f27079b.onAdLoaded(this);
        } else {
            hx.m19916e("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f27079b.onAdFailedToLoad(this, 0);
        }
    }

    public final void showInterstitial() {
        C0164c a = new C0163a().a();
        a.f590a.setData(this.f27080c);
        fk.f16060a.post(new ath(this, new AdOverlayInfoParcel(new zzc(a.f590a), null, new atg(this), null, new zzakd(0, 0, false))));
        ar.i().m27319q();
    }
}
