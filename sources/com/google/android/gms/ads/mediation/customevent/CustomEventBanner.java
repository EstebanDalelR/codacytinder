package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.C2343d;
import com.google.android.gms.ads.mediation.MediationAdRequest;

public interface CustomEventBanner extends CustomEvent {
    void requestBannerAd(Context context, CustomEventBannerListener customEventBannerListener, String str, C2343d c2343d, MediationAdRequest mediationAdRequest, Bundle bundle);
}
