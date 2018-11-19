package com.tinder.core.experiment;

import com.leanplum.Leanplum;
import com.leanplum.Var;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\bk\n\u0002\u0010!\n\u0002\u0010%\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0007R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0007R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0007R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0007R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0007R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0007R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0007R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020#0\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0007R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0007R\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0007R\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0007R\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0007R\u0017\u00107\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u0007R\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u0007R\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0007R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\u0007R\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\u0007R\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010\u0007R\u0017\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010\u0007R\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010\u0007R\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010\u0007R\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010\u0007R\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010\u0007R\u0017\u0010L\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010\u0007R\u0017\u0010M\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010\u0007R\u0017\u0010N\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010\u0007R\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010\u0007R\u0017\u0010P\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010\u0007R\u0017\u0010Q\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010\u0007R\u0017\u0010R\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010\u0007R\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010\u0007R\u0017\u0010T\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010\u0007R\u0017\u0010U\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010\u0007R\u0017\u0010V\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010\u0007R\u0017\u0010W\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010\u0007R\u0017\u0010X\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010\u0007R\u0017\u0010Y\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u0010\u0007R\u0017\u0010Z\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010\u0007R\u0017\u0010[\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\u0007R\u0017\u0010\\\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010\u0007R\u0017\u0010]\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010\u0007R\u0017\u0010^\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u0010\u0007R\u0017\u0010`\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\ba\u0010\u0007R\u0017\u0010b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010\u0007R\u0017\u0010d\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u0010\u0007R\u0017\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\bg\u0010\u0007R\u0017\u0010h\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\bi\u0010\u0007R\u0017\u0010j\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\bk\u0010\u0007R\u0017\u0010l\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\bm\u0010\u0007R\u0017\u0010n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\bo\u0010\u0007R\u0017\u0010p\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\bq\u0010\u0007R\u0017\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\bs\u0010\u0007R\u0017\u0010t\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\bu\u0010\u0007R\u0017\u0010v\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\bw\u0010\u0007R\u0017\u0010x\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\by\u0010\u0007R\u0017\u0010z\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b{\u0010\u0007R\u0017\u0010|\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b}\u0010\u0007R\u0017\u0010~\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0007R\u0019\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\u0007R\u0019\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\u0007R\u0019\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\u0007R\u0019\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020#0\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\u0007R\u0019\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\u0007R\u0019\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\u0007R\u0019\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\u0007Rº\u0001\u0010\u0001\u001a§\u0001\u0012K\u0012I\u0012\r\u0012\u000b \u0001*\u0004\u0018\u00010#0#\u0012\r\u0012\u000b \u0001*\u0004\u0018\u00010\u00010\u0001 \u0001*#\u0012\r\u0012\u000b \u0001*\u0004\u0018\u00010#0#\u0012\r\u0012\u000b \u0001*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00010\u0001 \u0001*R\u0012K\u0012I\u0012\r\u0012\u000b \u0001*\u0004\u0018\u00010#0#\u0012\r\u0012\u000b \u0001*\u0004\u0018\u00010\u00010\u0001 \u0001*#\u0012\r\u0012\u000b \u0001*\u0004\u0018\u00010#0#\u0012\r\u0012\u000b \u0001*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00010\u0001\u0018\u00010\u00010\u00018F¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, d2 = {"Lcom/tinder/core/experiment/LeanplumVariables;", "", "()V", "accountDeleteVariant", "Lcom/leanplum/Var;", "", "getAccountDeleteVariant", "()Lcom/leanplum/Var;", "activityFeedEnabled", "", "getActivityFeedEnabled", "activityFeedSettingsEnabled", "getActivityFeedSettingsEnabled", "activityMessagesEnabled", "getActivityMessagesEnabled", "adMessageRequestCadenceMs", "", "getAdMessageRequestCadenceMs", "adsCadence", "getAdsCadence", "appRatingSendWaitPeriodInDays", "getAppRatingSendWaitPeriodInDays", "appRatingShowWaitPeriodInDays", "getAppRatingShowWaitPeriodInDays", "appRatingV2", "getAppRatingV2", "autoPlayControlsEnabled", "getAutoPlayControlsEnabled", "cardSwipeTutorialEnabled", "getCardSwipeTutorialEnabled", "controllaEnabled", "getControllaEnabled", "customGenderEnabled", "getCustomGenderEnabled", "customGenderOptions", "", "getCustomGenderOptions", "dfpNativeDisplayAdsEnabled", "getDfpNativeDisplayAdsEnabled", "dfpNativeVideoAdsEnabled", "getDfpNativeVideoAdsEnabled", "editProfileNudgeEnabled", "getEditProfileNudgeEnabled", "fanAdsEnabled", "getFanAdsEnabled", "fanPlacementId", "getFanPlacementId", "fastMatchPollingEnabled", "getFastMatchPollingEnabled", "feedTooltipDaysInactive", "getFeedTooltipDaysInactive", "feedTopLevelNavEnabled", "getFeedTopLevelNavEnabled", "gamepadCounterEnabled", "getGamepadCounterEnabled", "gamepadSwipeHighlightEnabled", "getGamepadSwipeHighlightEnabled", "gestureBallsInYourCourtEnable", "getGestureBallsInYourCourtEnable", "gestureChatBubbleEnable", "getGestureChatBubbleEnable", "gestureEyerollEnable", "getGestureEyerollEnable", "gestureMartiniEnable", "getGestureMartiniEnable", "gestureStrikeEnable", "getGestureStrikeEnable", "gifProvider", "getGifProvider", "googlePlayBillingLibraryEnabled", "getGooglePlayBillingLibraryEnabled", "grandGesturesEnabled", "getGrandGesturesEnabled", "inAppNotificationRedesignEnabled", "getInAppNotificationRedesignEnabled", "isAddyV2Enabled", "isBitmojiEnabled", "isDfpBrandedProfileCardEnabled", "isDiscountingEnabled", "isEmailSettingsEnabled", "isFeedProfileChangeBioEnabled", "isFeedProfileChangeSchoolEnabled", "isFeedProfileChangeWorkEnabled", "isFeedTooltipEnabled", "isGoldMerchandisingEnabled", "isLoopsCreationEnabled", "isLoopsDisplayEnabled", "isLoopsPhase1Enabled", "isNewPhotoGridEnabled", "isPlacesShortOnboardingEnabled", "isPlacesWhackAMoleEnabled", "isRecsFanVideoEnabled", "isScreenshotNotificationEnabled", "isTinderUEnabled", "loopsEnabled", "getLoopsEnabled", "loopsFeedEnabled", "getLoopsFeedEnabled", "loopsMessagesEnabled", "getLoopsMessagesEnabled", "loopsRecsEnabled", "getLoopsRecsEnabled", "minimumMessageAdInterstice", "getMinimumMessageAdInterstice", "perfInstrumentationEnabled", "getPerfInstrumentationEnabled", "persistentConnectionEnabled", "getPersistentConnectionEnabled", "photoPreviewEnabled", "getPhotoPreviewEnabled", "profileV2Revenue", "getProfileV2Revenue", "recsRateDialogsDisabled", "getRecsRateDialogsDisabled", "secondaryAdsCadence", "getSecondaryAdsCadence", "settingsOnRecsEnabled", "getSettingsOnRecsEnabled", "shimmerEnabled", "getShimmerEnabled", "sponsoredMessageEnabled", "getSponsoredMessageEnabled", "spotifyEnabled", "getSpotifyEnabled", "superLikeableEnabled", "getSuperLikeableEnabled", "superlikePaywallColorVariant", "getSuperlikePaywallColorVariant", "swipeOpenEnabled", "getSwipeOpenEnabled", "tinderHouseAdsEnabled", "getTinderHouseAdsEnabled", "topPicksEnabled", "getTopPicksEnabled", "topPicksNotificationOffset", "getTopPicksNotificationOffset", "topPicksTooltipSwipeThreshold", "getTopPicksTooltipSwipeThreshold", "typingIndicatorEnabled", "getTypingIndicatorEnabled", "typingIndicatorMorphAnimationEnabled", "getTypingIndicatorMorphAnimationEnabled", "variantIds", "", "", "kotlin.jvm.PlatformType", "", "", "getVariantIds", "()Ljava/util/List;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.core.experiment.k */
public final class C2644k {
    @NotNull
    /* renamed from: A */
    private final Var<Boolean> f8242A;
    @NotNull
    /* renamed from: B */
    private final Var<Boolean> f8243B;
    @NotNull
    /* renamed from: C */
    private final Var<Boolean> f8244C;
    @NotNull
    /* renamed from: D */
    private final Var<Boolean> f8245D;
    @NotNull
    /* renamed from: E */
    private final Var<Boolean> f8246E;
    @NotNull
    /* renamed from: F */
    private final Var<Boolean> f8247F;
    @NotNull
    /* renamed from: G */
    private final Var<Boolean> f8248G;
    @NotNull
    /* renamed from: H */
    private final Var<Integer> f8249H;
    @NotNull
    /* renamed from: I */
    private final Var<Boolean> f8250I;
    @NotNull
    /* renamed from: J */
    private final Var<Boolean> f8251J;
    @NotNull
    /* renamed from: K */
    private final Var<Boolean> f8252K;
    @NotNull
    /* renamed from: L */
    private final Var<Boolean> f8253L;
    @NotNull
    /* renamed from: M */
    private final Var<Boolean> f8254M;
    @NotNull
    /* renamed from: N */
    private final Var<Boolean> f8255N;
    @NotNull
    /* renamed from: O */
    private final Var<Boolean> f8256O;
    @NotNull
    /* renamed from: P */
    private final Var<Boolean> f8257P;
    @NotNull
    /* renamed from: Q */
    private final Var<Boolean> f8258Q;
    @NotNull
    /* renamed from: R */
    private final Var<Long> f8259R;
    @NotNull
    /* renamed from: S */
    private final Var<Boolean> f8260S;
    @NotNull
    /* renamed from: T */
    private final Var<Integer> f8261T;
    @NotNull
    /* renamed from: U */
    private final Var<Boolean> f8262U;
    @NotNull
    /* renamed from: V */
    private final Var<Boolean> f8263V;
    @NotNull
    /* renamed from: W */
    private final Var<Boolean> f8264W;
    @NotNull
    /* renamed from: X */
    private final Var<Boolean> f8265X;
    @NotNull
    /* renamed from: Y */
    private final Var<Boolean> f8266Y;
    @NotNull
    /* renamed from: Z */
    private final Var<Boolean> f8267Z;
    @NotNull
    /* renamed from: a */
    private final Var<Boolean> f8268a;
    @NotNull
    private final Var<Boolean> aa;
    @NotNull
    private final Var<Boolean> ab;
    @NotNull
    private final Var<Boolean> ac;
    @NotNull
    private final Var<Boolean> ad;
    @NotNull
    private final Var<Boolean> ae;
    @NotNull
    private final Var<Boolean> af;
    @NotNull
    private final Var<Boolean> ag;
    @NotNull
    private final Var<Boolean> ah;
    @NotNull
    private final Var<Boolean> ai;
    @NotNull
    private final Var<Integer> aj;
    @NotNull
    private final Var<Boolean> ak;
    @NotNull
    private final Var<Boolean> al;
    @NotNull
    private final Var<Boolean> am;
    @NotNull
    private final Var<Boolean> an;
    @NotNull
    private final Var<Boolean> ao;
    @NotNull
    private final Var<Boolean> ap;
    @NotNull
    private final Var<Boolean> aq;
    @NotNull
    private final Var<Boolean> ar;
    @NotNull
    private final Var<Integer> as;
    @NotNull
    private final Var<Integer> at;
    @NotNull
    private final Var<Boolean> au;
    @NotNull
    private final Var<Boolean> av;
    @NotNull
    private final Var<Boolean> aw;
    @NotNull
    private final Var<Boolean> ax;
    @NotNull
    /* renamed from: b */
    private final Var<Boolean> f8269b;
    @NotNull
    /* renamed from: c */
    private final Var<Boolean> f8270c;
    @NotNull
    /* renamed from: d */
    private final Var<String> f8271d;
    @NotNull
    /* renamed from: e */
    private final Var<Integer> f8272e;
    @NotNull
    /* renamed from: f */
    private final Var<Boolean> f8273f;
    @NotNull
    /* renamed from: g */
    private final Var<Boolean> f8274g;
    @NotNull
    /* renamed from: h */
    private final Var<Boolean> f8275h;
    @NotNull
    /* renamed from: i */
    private final Var<Boolean> f8276i;
    @NotNull
    /* renamed from: j */
    private final Var<Boolean> f8277j;
    @NotNull
    /* renamed from: k */
    private final Var<Integer> f8278k;
    @NotNull
    /* renamed from: l */
    private final Var<Boolean> f8279l;
    @NotNull
    /* renamed from: m */
    private final Var<Boolean> f8280m;
    @NotNull
    /* renamed from: n */
    private final Var<Boolean> f8281n;
    @NotNull
    /* renamed from: o */
    private final Var<String> f8282o;
    @NotNull
    /* renamed from: p */
    private final Var<Boolean> f8283p;
    @NotNull
    /* renamed from: q */
    private final Var<Boolean> f8284q;
    @NotNull
    /* renamed from: r */
    private final Var<String> f8285r;
    @NotNull
    /* renamed from: s */
    private final Var<Boolean> f8286s;
    @NotNull
    /* renamed from: t */
    private final Var<Boolean> f8287t;
    @NotNull
    /* renamed from: u */
    private final Var<Boolean> f8288u;
    @NotNull
    /* renamed from: v */
    private final Var<Boolean> f8289v;
    @NotNull
    /* renamed from: w */
    private final Var<Boolean> f8290w;
    @NotNull
    /* renamed from: x */
    private final Var<Integer> f8291x;
    @NotNull
    /* renamed from: y */
    private final Var<Integer> f8292y;
    @NotNull
    /* renamed from: z */
    private final Var<Integer> f8293z;

    @Inject
    public C2644k() {
        Object define = Var.define("spotifyEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"spotifyEnabled\", false)");
        this.f8268a = define;
        define = Var.define("isPhotoPreviewEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"isPhotoPreviewEnabled\", false)");
        this.f8269b = define;
        define = Var.define("customGenderEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"customGenderEnabled\", false)");
        this.f8270c = define;
        define = Var.define("customGendersJSON", "{\"gender_options\":[\n    \"Agender\",\n    \"Androgyne\",\n    \"Androgynous\",\n    \"Bigender\",\n    \"Female to Male\",\n    \"FTM\",\n    \"Gender Fluid\",\n    \"Gender Nonconforming\",\n    \"Gender Questioning\",\n    \"Gender Variant\",\n    \"Genderqueer\",\n    \"Male to Female\",\n    \"MTF\",\n    \"Neither\",\n    \"Neutrois\",\n    \"Non-binary\",\n    \"Other\",\n    \"Pangender\",\n    \"Trans\",\n    \"Trans Man\",\n    \"Trans Person\",\n    \"Trans Woman\",\n    \"Transfeminine\",\n    \"Transgender\",\n    \"Transgender Female\",\n    \"Transgender Male\",\n    \"Transgender Man\",\n    \"Transgender Person\",\n    \"Transgender Woman\",\n    \"Transmasculine\",\n    \"Transsexual\",\n    \"Transsexual Female\",\n    \"Transsexual Male\",\n    \"Transsexual Man\",\n    \"Transsexual Person\",\n    \"Transsexual Woman\",\n    \"Two-Spirit\"\n  ]\n}");
        C2668g.m10305a(define, "Var.define(\"customGender…E_GENDER_OPTIONS_DEFAULT)");
        this.f8271d = define;
        define = Var.define("SuperlikePaywallColorVariant", Integer.valueOf(0));
        C2668g.m10305a(define, "Var.define(\"SuperlikePaywallColorVariant\", 0)");
        this.f8272e = define;
        define = Var.define("isDiscountingEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"isDiscountingEnabled\", false)");
        this.f8273f = define;
        define = Var.define("grandGesturesEnabled", Boolean.valueOf(true));
        C2668g.m10305a(define, "Var.define(\"grandGesturesEnabled\", true)");
        this.f8274g = define;
        define = Var.define("fanAdsEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"fanAdsEnabled\", false)");
        this.f8275h = define;
        define = Var.define("dfpNativeVideoAdsEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"dfpNativeVideoAdsEnabled\", false)");
        this.f8276i = define;
        define = Var.define("dfpNativeDisplayAdsEnabled", Boolean.valueOf(true));
        C2668g.m10305a(define, "Var.define(\"dfpNativeDisplayAdsEnabled\", true)");
        this.f8277j = define;
        define = Var.define("AdsCadence", Integer.valueOf(20));
        C2668g.m10305a(define, "Var.define(\"AdsCadence\", 20)");
        this.f8278k = define;
        define = Var.define("fastMatchPollingEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"fastMatchPollingEnabled\", false)");
        this.f8279l = define;
        define = Var.define("perfInstrumentationEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"perfInstrumentationEnabled\", false)");
        this.f8280m = define;
        define = Var.define("settingsOnRecsEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"settingsOnRecsEnabled\", false)");
        this.f8281n = define;
        define = Var.define("fanPlacementID", "464891386855067_1485975844746611");
        C2668g.m10305a(define, "Var.define(\"fanPlacement…855067_1485975844746611\")");
        this.f8282o = define;
        define = Var.define("controllaEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"controllaEnabled\", false)");
        this.f8283p = define;
        define = Var.define("topPicksEnabledAndroid", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"topPicksEnabledAndroid\", false)");
        this.f8284q = define;
        define = Var.define("topPicksLocalDailyOffset", "offset0");
        C2668g.m10305a(define, "Var.define(\"topPicksLocalDailyOffset\", \"offset0\")");
        this.f8285r = define;
        define = Var.define("cardSwipeTutorialEnabled", Boolean.valueOf(true));
        C2668g.m10305a(define, "Var.define(\"cardSwipeTutorialEnabled\", true)");
        this.f8286s = define;
        define = Var.define("editProfileNudgeEnabled", Boolean.valueOf(true));
        C2668g.m10305a(define, "Var.define(\"editProfileNudgeEnabled\", true)");
        this.f8287t = define;
        define = Var.define("gamepadSwipeHighlightEnabled", Boolean.valueOf(true));
        C2668g.m10305a(define, "Var.define(\"gamepadSwipeHighlightEnabled\", true)");
        this.f8288u = define;
        define = Var.define("recsRateDialogsDisabled", Boolean.valueOf(true));
        C2668g.m10305a(define, "Var.define(\"recsRateDialogsDisabled\", true)");
        this.f8289v = define;
        define = Var.define("sponsoredMessageEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"sponsoredMessageEnabled\", false)");
        this.f8290w = define;
        define = Var.define("accountDeleteVariant", Integer.valueOf(0));
        C2668g.m10305a(define, "Var.define(\"accountDeleteVariant\", 0)");
        this.f8291x = define;
        define = Var.define("appRatingShowWaitPeriodInDays", Integer.valueOf(30));
        C2668g.m10305a(define, "Var.define(\"appRatingShowWaitPeriodInDays\", 30)");
        this.f8292y = define;
        define = Var.define("appRatingSendWaitPeriodInDays", Integer.valueOf(90));
        C2668g.m10305a(define, "Var.define(\"appRatingSendWaitPeriodInDays\", 90)");
        this.f8293z = define;
        define = Var.define("inAppNotificationRedesignEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"inAppNotific…nRedesignEnabled\", false)");
        this.f8242A = define;
        define = Var.define("gestureChatBubbleEnable", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"gestureChatBubbleEnable\", false)");
        this.f8243B = define;
        define = Var.define("gestureMartiniEnable", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"gestureMartiniEnable\", false)");
        this.f8244C = define;
        define = Var.define("gestureEyerollEnable", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"gestureEyerollEnable\", false)");
        this.f8245D = define;
        define = Var.define("gestureStrikeEnable", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"gestureStrikeEnable\", false)");
        this.f8246E = define;
        define = Var.define("gestureBallsInYourCourtEnable", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"gestureBallsInYourCourtEnable\", false)");
        this.f8247F = define;
        define = Var.define("shimmerEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"shimmerEnabled\", false)");
        this.f8248G = define;
        define = Var.define("secondaryAdsCadence", Integer.valueOf(30));
        C2668g.m10305a(define, "Var.define(\"secondaryAdsCadence\", 30)");
        this.f8249H = define;
        define = Var.define("swipeOpenEnabled", Boolean.valueOf(true));
        C2668g.m10305a(define, "Var.define(\"swipeOpenEnabled\", true)");
        this.f8250I = define;
        define = Var.define("appRatingV2", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"appRatingV2\", false)");
        this.f8251J = define;
        define = Var.define("socketEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"socketEnabled\", false)");
        this.f8252K = define;
        define = Var.define("activityMessagesEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"activityMessagesEnabled\", false)");
        this.f8253L = define;
        define = Var.define("activityFeedEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"activityFeedEnabled\", false)");
        this.f8254M = define;
        define = Var.define("activityFeedSettingsEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"activityFeedSettingsEnabled\", false)");
        this.f8255N = define;
        define = Var.define("feedTopLevelNavEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"feedTopLevelNavEnabled\", false)");
        this.f8256O = define;
        define = Var.define("superLikeableEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"superLikeableEnabled\", false)");
        this.f8257P = define;
        define = Var.define("googlePlayBillingLibraryEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"googlePlayBi…ngLibraryEnabled\", false)");
        this.f8258Q = define;
        define = Var.define("adMessageRequestCadenceMs", Long.valueOf(0));
        C2668g.m10305a(define, "Var.define(\"adMessageRequestCadenceMs\", 0L)");
        this.f8259R = define;
        define = Var.define("gamepadCounterEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"gamepadCounterEnabled\", false)");
        this.f8260S = define;
        define = Var.define("minimumMessageAdInterstice", Integer.valueOf(0));
        C2668g.m10305a(define, "Var.define(\"minimumMessageAdInterstice\", 0)");
        this.f8261T = define;
        define = Var.define("isDfpBrandedProfileCardEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"isDfpBranded…ofileCardEnabled\", false)");
        this.f8262U = define;
        define = Var.define("goldMerchandisingEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"goldMerchandisingEnabled\", false)");
        this.f8263V = define;
        define = Var.define("isNewAndroidPhotoGridEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"isNewAndroidPhotoGridEnabled\", false)");
        this.f8264W = define;
        define = Var.define("isAndroidLoopsPhase1Enabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"isAndroidLoopsPhase1Enabled\", false)");
        this.f8265X = define;
        define = Var.define("isRecsFanVideoEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"isRecsFanVideoEnabled\", false)");
        this.f8266Y = define;
        define = Var.define("loopsEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"loopsEnabled\", false)");
        this.f8267Z = define;
        define = Var.define("loopsRecsEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"loopsRecsEnabled\", false)");
        this.aa = define;
        define = Var.define("loopsFeedEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"loopsFeedEnabled\", false)");
        this.ab = define;
        define = Var.define("loopsMessagesEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"loopsMessagesEnabled\", false)");
        this.ac = define;
        define = Var.define("autoPlayControlsEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"autoPlayControlsEnabled\", false)");
        this.ad = define;
        define = Var.define("AddyV2Enabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"AddyV2Enabled\", false)");
        this.ae = define;
        define = Var.define("typingIndicatorEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"typingIndicatorEnabled\", false)");
        this.af = define;
        define = Var.define("typingIndicatorMorphAnimationEnabled", Boolean.valueOf(true));
        C2668g.m10305a(define, "Var.define(\"typingIndica…hAnimationEnabled\", true)");
        this.ag = define;
        define = Var.define("profileV2Revenue", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"profileV2Revenue\", false)");
        this.ah = define;
        define = Var.define("isEmailSettingsEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"isEmailSettingsEnabled\", false)");
        this.ai = define;
        define = Var.define("topPicksTooltipSwipeThreshold", Integer.valueOf(100));
        C2668g.m10305a(define, "Var.define(\"topPicksTooltipSwipeThreshold\", 100)");
        this.aj = define;
        define = Var.define("houseAdsEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"houseAdsEnabled\", false)");
        this.ak = define;
        define = Var.define("profileChangeBioEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"profileChangeBioEnabled\", false)");
        this.al = define;
        define = Var.define("profileChangeWorkEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"profileChangeWorkEnabled\", false)");
        this.am = define;
        define = Var.define("profileChangeSchoolEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"profileChangeSchoolEnabled\", false)");
        this.an = define;
        define = Var.define("loopsCreationEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"loopsCreationEnabled\", false)");
        this.ao = define;
        define = Var.define("loopsDisplayEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"loopsDisplayEnabled\", false)");
        this.ap = define;
        define = Var.define("screenshotNotificationEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"screenshotNotificationEnabled\", false)");
        this.aq = define;
        define = Var.define("feedTooltipEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"feedTooltipEnabled\", false)");
        this.ar = define;
        define = Var.define("feedTooltipDaysInactive", Integer.valueOf(14));
        C2668g.m10305a(define, "Var.define(\"feedTooltipDaysInactive\", 14)");
        this.as = define;
        define = Var.define("gifProvider", Integer.valueOf(0));
        C2668g.m10305a(define, "Var.define(\"gifProvider\", 0)");
        this.at = define;
        define = Var.define("bitmojiEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"bitmojiEnabled\", false)");
        this.au = define;
        define = Var.define("placesShortOnboardingEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\n        \"pla…nboardingEnabled\", false)");
        this.av = define;
        define = Var.define("placesWhacAMoleEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"placesWhacAMoleEnabled\", false)");
        this.aw = define;
        define = Var.define("tinderUEnabled", Boolean.valueOf(false));
        C2668g.m10305a(define, "Var.define(\"tinderUEnabled\", false)");
        this.ax = define;
    }

    /* renamed from: a */
    public final List<Map<String, Object>> m10021a() {
        return Leanplum.variants();
    }

    @NotNull
    /* renamed from: b */
    public final Var<Boolean> m10022b() {
        return this.f8268a;
    }

    @NotNull
    /* renamed from: c */
    public final Var<Boolean> m10023c() {
        return this.f8269b;
    }

    @NotNull
    /* renamed from: d */
    public final Var<Boolean> m10024d() {
        return this.f8270c;
    }

    @NotNull
    /* renamed from: e */
    public final Var<String> m10025e() {
        return this.f8271d;
    }

    @NotNull
    /* renamed from: f */
    public final Var<Integer> m10026f() {
        return this.f8272e;
    }

    @NotNull
    /* renamed from: g */
    public final Var<Boolean> m10027g() {
        return this.f8273f;
    }

    @NotNull
    /* renamed from: h */
    public final Var<Boolean> m10028h() {
        return this.f8274g;
    }

    @NotNull
    /* renamed from: i */
    public final Var<Boolean> m10029i() {
        return this.f8275h;
    }

    @NotNull
    /* renamed from: j */
    public final Var<Boolean> m10030j() {
        return this.f8276i;
    }

    @NotNull
    /* renamed from: k */
    public final Var<Boolean> m10031k() {
        return this.f8277j;
    }

    @NotNull
    /* renamed from: l */
    public final Var<Integer> m10032l() {
        return this.f8278k;
    }

    @NotNull
    /* renamed from: m */
    public final Var<Boolean> m10033m() {
        return this.f8279l;
    }

    @NotNull
    /* renamed from: n */
    public final Var<Boolean> m10034n() {
        return this.f8280m;
    }

    @NotNull
    /* renamed from: o */
    public final Var<Boolean> m10035o() {
        return this.f8281n;
    }

    @NotNull
    /* renamed from: p */
    public final Var<String> m10036p() {
        return this.f8282o;
    }

    @NotNull
    /* renamed from: q */
    public final Var<Boolean> m10037q() {
        return this.f8283p;
    }

    @NotNull
    /* renamed from: r */
    public final Var<Boolean> m10038r() {
        return this.f8284q;
    }

    @NotNull
    /* renamed from: s */
    public final Var<String> m10039s() {
        return this.f8285r;
    }

    @NotNull
    /* renamed from: t */
    public final Var<Boolean> m10040t() {
        return this.f8286s;
    }

    @NotNull
    /* renamed from: u */
    public final Var<Boolean> m10041u() {
        return this.f8287t;
    }

    @NotNull
    /* renamed from: v */
    public final Var<Boolean> m10042v() {
        return this.f8288u;
    }

    @NotNull
    /* renamed from: w */
    public final Var<Boolean> m10043w() {
        return this.f8289v;
    }

    @NotNull
    /* renamed from: x */
    public final Var<Boolean> m10044x() {
        return this.f8290w;
    }

    @NotNull
    /* renamed from: y */
    public final Var<Integer> m10045y() {
        return this.f8291x;
    }

    @NotNull
    /* renamed from: z */
    public final Var<Integer> m10046z() {
        return this.f8292y;
    }

    @NotNull
    /* renamed from: A */
    public final Var<Integer> m9995A() {
        return this.f8293z;
    }

    @NotNull
    /* renamed from: B */
    public final Var<Boolean> m9996B() {
        return this.f8242A;
    }

    @NotNull
    /* renamed from: C */
    public final Var<Boolean> m9997C() {
        return this.f8243B;
    }

    @NotNull
    /* renamed from: D */
    public final Var<Boolean> m9998D() {
        return this.f8244C;
    }

    @NotNull
    /* renamed from: E */
    public final Var<Boolean> m9999E() {
        return this.f8245D;
    }

    @NotNull
    /* renamed from: F */
    public final Var<Boolean> m10000F() {
        return this.f8246E;
    }

    @NotNull
    /* renamed from: G */
    public final Var<Boolean> m10001G() {
        return this.f8247F;
    }

    @NotNull
    /* renamed from: H */
    public final Var<Boolean> m10002H() {
        return this.f8248G;
    }

    @NotNull
    /* renamed from: I */
    public final Var<Integer> m10003I() {
        return this.f8249H;
    }

    @NotNull
    /* renamed from: J */
    public final Var<Boolean> m10004J() {
        return this.f8250I;
    }

    @NotNull
    /* renamed from: K */
    public final Var<Boolean> m10005K() {
        return this.f8251J;
    }

    @NotNull
    /* renamed from: L */
    public final Var<Boolean> m10006L() {
        return this.f8252K;
    }

    @NotNull
    /* renamed from: M */
    public final Var<Boolean> m10007M() {
        return this.f8253L;
    }

    @NotNull
    /* renamed from: N */
    public final Var<Boolean> m10008N() {
        return this.f8254M;
    }

    @NotNull
    /* renamed from: O */
    public final Var<Boolean> m10009O() {
        return this.f8255N;
    }

    @NotNull
    /* renamed from: P */
    public final Var<Boolean> m10010P() {
        return this.f8256O;
    }

    @NotNull
    /* renamed from: Q */
    public final Var<Boolean> m10011Q() {
        return this.f8257P;
    }

    @NotNull
    /* renamed from: R */
    public final Var<Boolean> m10012R() {
        return this.f8258Q;
    }

    @NotNull
    /* renamed from: S */
    public final Var<Long> m10013S() {
        return this.f8259R;
    }

    @NotNull
    /* renamed from: T */
    public final Var<Boolean> m10014T() {
        return this.f8260S;
    }

    @NotNull
    /* renamed from: U */
    public final Var<Integer> m10015U() {
        return this.f8261T;
    }

    @NotNull
    /* renamed from: V */
    public final Var<Boolean> m10016V() {
        return this.f8262U;
    }

    @NotNull
    /* renamed from: W */
    public final Var<Boolean> m10017W() {
        return this.f8263V;
    }

    @NotNull
    /* renamed from: X */
    public final Var<Boolean> m10018X() {
        return this.f8264W;
    }

    @NotNull
    /* renamed from: Y */
    public final Var<Boolean> m10019Y() {
        return this.f8265X;
    }

    @NotNull
    /* renamed from: Z */
    public final Var<Boolean> m10020Z() {
        return this.f8266Y;
    }

    @NotNull
    public final Var<Boolean> aa() {
        return this.f8267Z;
    }

    @NotNull
    public final Var<Boolean> ab() {
        return this.aa;
    }

    @NotNull
    public final Var<Boolean> ac() {
        return this.ab;
    }

    @NotNull
    public final Var<Boolean> ad() {
        return this.ac;
    }

    @NotNull
    public final Var<Boolean> ae() {
        return this.ad;
    }

    @NotNull
    public final Var<Boolean> af() {
        return this.ae;
    }

    @NotNull
    public final Var<Boolean> ag() {
        return this.af;
    }

    @NotNull
    public final Var<Boolean> ah() {
        return this.ag;
    }

    @NotNull
    public final Var<Boolean> ai() {
        return this.ah;
    }

    @NotNull
    public final Var<Boolean> aj() {
        return this.ai;
    }

    @NotNull
    public final Var<Integer> ak() {
        return this.aj;
    }

    @NotNull
    public final Var<Boolean> al() {
        return this.ak;
    }

    @NotNull
    public final Var<Boolean> am() {
        return this.al;
    }

    @NotNull
    public final Var<Boolean> an() {
        return this.am;
    }

    @NotNull
    public final Var<Boolean> ao() {
        return this.an;
    }

    @NotNull
    public final Var<Boolean> ap() {
        return this.ao;
    }

    @NotNull
    public final Var<Boolean> aq() {
        return this.ap;
    }

    @NotNull
    public final Var<Boolean> ar() {
        return this.aq;
    }

    @NotNull
    public final Var<Boolean> as() {
        return this.ar;
    }

    @NotNull
    public final Var<Integer> at() {
        return this.as;
    }

    @NotNull
    public final Var<Integer> au() {
        return this.at;
    }

    @NotNull
    public final Var<Boolean> av() {
        return this.au;
    }

    @NotNull
    public final Var<Boolean> aw() {
        return this.av;
    }

    @NotNull
    public final Var<Boolean> ax() {
        return this.aw;
    }

    @NotNull
    public final Var<Boolean> ay() {
        return this.ax;
    }
}
