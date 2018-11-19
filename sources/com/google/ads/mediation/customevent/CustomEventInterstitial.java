package com.google.ads.mediation.customevent;

import android.app.Activity;
import com.google.ads.mediation.C2004a;

@Deprecated
public interface CustomEventInterstitial extends CustomEvent {
    void requestInterstitialAd(CustomEventInterstitialListener customEventInterstitialListener, Activity activity, String str, String str2, C2004a c2004a, Object obj);

    void showInterstitial();
}
