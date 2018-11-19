package com.google.ads.mediation;

import android.app.Activity;
import android.view.View;
import com.google.ads.C2003a;

@Deprecated
public interface MediationBannerAdapter<ADDITIONAL_PARAMETERS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> extends MediationAdapter<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    View getBannerView();

    void requestBannerAd(MediationBannerListener mediationBannerListener, Activity activity, SERVER_PARAMETERS server_parameters, C2003a c2003a, C2004a c2004a, ADDITIONAL_PARAMETERS additional_parameters);
}
