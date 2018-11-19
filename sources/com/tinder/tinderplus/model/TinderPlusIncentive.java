package com.tinder.tinderplus.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.api.ManagerWebServices;

public enum TinderPlusIncentive {
    PASSPORT("passport", 0),
    WHO_SEES_YOU("who_sees_you", 1),
    WHO_YOU_SEE("who_you_see", 2),
    YOUR_PROFILE("your_profile", 3),
    UNLIMITED_SWIPES("unlimited_swipes", 4),
    SUPERLIKE("super_like", 5),
    UNDO("undo", 6),
    HIDE_ADS(ManagerWebServices.PARAM_HIDE_ADS, 7),
    BOOST(ManagerWebServices.PARAM_BOOST, 8);
    
    private final int analyticsValue;
    private final String name;

    @Nullable
    public static TinderPlusIncentive from(@NonNull String str) {
        for (TinderPlusIncentive tinderPlusIncentive : values()) {
            if (tinderPlusIncentive.getName().equals(str)) {
                return tinderPlusIncentive;
            }
        }
        return null;
    }

    private TinderPlusIncentive(String str, int i) {
        this.name = str;
        this.analyticsValue = i;
    }

    public String getName() {
        return this.name;
    }

    public int getAnalyticsValue() {
        return this.analyticsValue;
    }
}
