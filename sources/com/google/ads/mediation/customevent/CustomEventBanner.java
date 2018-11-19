package com.google.ads.mediation.customevent;

import android.app.Activity;
import com.google.ads.C2003a;
import com.google.ads.mediation.C2004a;

@Deprecated
public interface CustomEventBanner extends CustomEvent {
    void requestBannerAd(CustomEventBannerListener customEventBannerListener, Activity activity, String str, String str2, C2003a c2003a, C2004a c2004a, Object obj);
}
