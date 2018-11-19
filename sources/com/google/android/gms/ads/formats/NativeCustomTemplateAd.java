package com.google.android.gms.ads.formats;

import com.google.android.gms.ads.C2412j;
import com.google.android.gms.ads.formats.C2356c.C2355b;
import java.util.List;

public interface NativeCustomTemplateAd {

    public interface OnCustomClickListener {
        void onCustomClick(NativeCustomTemplateAd nativeCustomTemplateAd, String str);
    }

    public interface OnCustomTemplateAdLoadedListener {
        void onCustomTemplateAdLoaded(NativeCustomTemplateAd nativeCustomTemplateAd);
    }

    void destroy();

    List<String> getAvailableAssetNames();

    String getCustomTemplateId();

    C2355b getImage(String str);

    CharSequence getText(String str);

    C2412j getVideoController();

    C2353b getVideoMediaView();

    void performClick(String str);

    void recordImpression();
}
