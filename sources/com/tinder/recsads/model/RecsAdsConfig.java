package com.tinder.recsads.model;

public interface RecsAdsConfig {
    String brandedProfileCardTemplateId();

    int cadence();

    String fanPlacementId();

    String fanVideoPlacementId();

    String googleDfpAdsUnitId();

    String houseNativeDisplayDfpTemplateId();

    String houseNativeVideoDfpTemplateId();

    int injectionPlacementMargin();

    boolean isAddyV2Enabled();

    boolean isBrandedProfileCardEnabled();

    boolean isFanEnabled();

    boolean isFanVideoEnabled();

    boolean isNativeDisplayDfpEnabled();

    boolean isNativeVideoDfpEnabled();

    boolean isSwipeToOpenEnabled();

    String nativeDisplayDfpTeplateId();

    String nativeVideoDfpTemplateId();

    double requestOffsetFactor();

    int secondaryCadence();

    boolean shouldShowAdsInTinderPlus();

    boolean shouldShowHouseAds();
}
