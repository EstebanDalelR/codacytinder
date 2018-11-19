package com.google.android.gms.ads.reward;

import android.content.Context;
import com.google.android.gms.ads.C2342c;
import com.google.android.gms.ads.doubleclick.C2345a;

public interface RewardedVideoAd {
    @Deprecated
    void destroy();

    void destroy(Context context);

    String getMediationAdapterClassName();

    RewardedVideoAdListener getRewardedVideoAdListener();

    String getUserId();

    boolean isLoaded();

    void loadAd(String str, C2342c c2342c);

    void loadAd(String str, C2345a c2345a);

    @Deprecated
    void pause();

    void pause(Context context);

    @Deprecated
    void resume();

    void resume(Context context);

    void setImmersiveMode(boolean z);

    void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener);

    void setUserId(String str);

    void show();
}
