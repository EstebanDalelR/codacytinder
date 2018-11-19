package com.tinder.core.experiment;

import com.tinder.core.experiment.CanIGetYoEmailExperimentProvider.Variant;
import com.tinder.core.experiment.LeanplumAbTestUtility.UserEndPoint;
import com.tinder.core.experiment.ProfileV2MigrationExperiment.Experiment;
import java.util.List;
import javax.annotation.Nullable;
import rx.Observable;

public interface AbTestUtility {
    boolean activityFeedEnabled();

    boolean activityFeedSettingEnabled();

    boolean activityMessagesEnabled();

    int appRatingSendWaitPeriodInDays();

    int appRatingShowWaitPeriodInDays();

    boolean appRatingV2();

    @Nullable
    AuthExperiment<Variant> authExperiment();

    boolean autoPlayControlsEnabled();

    String fanPlacementId();

    String fanVideoPlacementId();

    boolean feedTopLevelNavEnabled();

    Observable<Void> forceContentUpdate();

    AccountDeleteVariant getAccountDeleteVariant();

    long getAdMessageRequestCadenceMs();

    int getAdsCadence();

    String getCustomGenderOptions();

    int getFeedTooltipDaysInactive();

    int getGifProvider();

    int getMinimumMessageAdInterstice();

    int getSecondaryAdCadence();

    String getTopPicksNotificationOffset();

    int getTopPicksTooltipSwipeThreshold();

    UserEndPoint getUserEndpoint();

    List<Long> getVariantIds();

    C8595j grandGestureExperiment();

    boolean isAddyV2Enabled();

    boolean isBitmojiEnabled();

    boolean isControllaEnabled();

    boolean isDfpBrandedProfileRecEnabled();

    boolean isDiscountingEnabled();

    boolean isEdgelessCardsEnabled();

    boolean isEmailSettingsEnabled();

    boolean isFanVideoAdEnabled();

    boolean isFastMatchPollingEnabled();

    boolean isFeedProfileChangeBioEnabled();

    boolean isFeedProfileChangeSchoolEnabled();

    boolean isFeedProfileChangeWorkEnabled();

    boolean isFeedTooltipEnabled();

    boolean isGamepadCounterEnabled();

    boolean isGoldMerchandisingEnabled();

    boolean isGrandGesturesEnabled();

    boolean isIntroPricingEnabled();

    boolean isLoopsCreationEnabled();

    boolean isLoopsDisplayEnabled();

    boolean isLoopsPhase1Enabled();

    boolean isMoreGenderEnabled();

    boolean isNewInAppNotificationEnabled();

    boolean isNewPhotoGridEnabled();

    boolean isOnboardingEmailRequired();

    boolean isPerformanceInstrumentationEnabled();

    boolean isPersistentConnectionEnabled();

    boolean isPhotoPreviewEnabled();

    boolean isPlacesShortOnboardingEnabled();

    boolean isPlacesWhackAMoleEnabled();

    boolean isRecsFanAdsEnabled();

    boolean isRecsNativeDisplayDfpAdsEnabled();

    boolean isRecsNativeVideoDfpAdsEnabled();

    boolean isScreenshotNotificationEnabled();

    boolean isSettingsOnRecsEnabled();

    boolean isShimmerEnabled();

    boolean isSmsAuthV2Enabled();

    boolean isSponsoredMessageEnabled();

    boolean isSpotifyEnabled();

    boolean isSuperLikeableEnabled();

    boolean isSwipeOpenForAdsEnabled();

    boolean isTinderUEnabled();

    boolean isTopPicksEnabled();

    boolean loopsEnabled();

    boolean loopsFeedEnabled();

    boolean loopsMessagesEnabled();

    boolean loopsRecsEnabled();

    C8596l newNewExperiment();

    boolean pilgrimPlacesDebuggingEnabled();

    boolean profileV2EnabledForRevenue();

    boolean profileV2MigrationEnabled(Experiment experiment);

    boolean shouldShowAdsForTinderPlusUsers();

    boolean tinderHouseAdsEnabled();

    boolean typingIndicatorEnabled();

    boolean typingIndicatorMorphAnimationEnabled();
}
