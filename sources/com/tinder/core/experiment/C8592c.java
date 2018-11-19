package com.tinder.core.experiment;

import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\bl\n\u0002\u0010!\n\u0002\u0010%\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u0011\u0010\u0017\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\bR\u0011\u0010\u0019\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\bR\u0011\u0010\u001b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\fR\u0011\u0010\u001d\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\fR\u0011\u0010\u001f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\fR\u0011\u0010!\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\fR\u0011\u0010#\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\fR\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\fR\u0011\u0010+\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\fR\u0011\u0010-\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\fR\u0011\u0010/\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\fR\u0011\u00101\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\b2\u0010(R\u0011\u00103\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\fR\u0011\u00105\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\bR\u0011\u00107\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\fR\u0011\u00109\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\fR\u0011\u0010;\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\fR\u0011\u0010=\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\fR\u0011\u0010?\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\fR\u0011\u0010A\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bB\u0010\fR\u0011\u0010C\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bD\u0010\fR\u0011\u0010E\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bF\u0010\fR\u0011\u0010G\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bH\u0010\bR\u0011\u0010I\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010\fR\u0011\u0010K\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bL\u0010\fR\u0011\u0010M\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bN\u0010\fR\u0011\u0010O\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bO\u0010\fR\u0011\u0010P\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bP\u0010\fR\u0011\u0010Q\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010\fR\u0011\u0010R\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bR\u0010\fR\u0011\u0010S\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bS\u0010\fR\u0011\u0010T\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bT\u0010\fR\u0011\u0010U\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bU\u0010\fR\u0011\u0010V\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bV\u0010\fR\u0011\u0010W\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bW\u0010\fR\u0011\u0010X\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bX\u0010\fR\u0011\u0010Y\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bY\u0010\fR\u0011\u0010Z\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010\fR\u0011\u0010[\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\fR\u0011\u0010\\\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010\fR\u0011\u0010]\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b]\u0010\fR\u0011\u0010^\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b^\u0010\fR\u0011\u0010_\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b_\u0010\fR\u0011\u0010`\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b`\u0010\fR\u0011\u0010a\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\ba\u0010\fR\u0011\u0010b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bc\u0010\fR\u0011\u0010d\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\be\u0010\fR\u0011\u0010f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bg\u0010\fR\u0011\u0010h\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bi\u0010\fR\u0011\u0010j\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bk\u0010\bR\u0011\u0010l\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bm\u0010\fR\u0011\u0010n\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bo\u0010\fR\u0011\u0010p\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bq\u0010\fR\u0011\u0010r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bs\u0010\fR\u0011\u0010t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bu\u0010\fR\u0011\u0010v\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bw\u0010\bR\u0011\u0010x\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\by\u0010\fR\u0011\u0010z\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b{\u0010\fR\u0011\u0010|\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b}\u0010\fR\u0011\u0010~\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\fR\u0013\u0010\u0001\u001a\u00020\n¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\fR\u0013\u0010\u0001\u001a\u00020\u0006¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\bR\u0013\u0010\u0001\u001a\u00020\n¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\fR\u0013\u0010\u0001\u001a\u00020\n¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\fR\u0013\u0010\u0001\u001a\u00020\n¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\fR\u0013\u0010\u0001\u001a\u00020&¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010(R\u0013\u0010\u0001\u001a\u00020\u0006¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\bR\u0013\u0010\u0001\u001a\u00020\n¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\fR\u0013\u0010\u0001\u001a\u00020\n¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\fRº\u0001\u0010\u0001\u001a§\u0001\u0012K\u0012I\u0012\r\u0012\u000b \u0001*\u0004\u0018\u00010&0&\u0012\r\u0012\u000b \u0001*\u0004\u0018\u00010\u00010\u0001 \u0001*#\u0012\r\u0012\u000b \u0001*\u0004\u0018\u00010&0&\u0012\r\u0012\u000b \u0001*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00010\u0001 \u0001*R\u0012K\u0012I\u0012\r\u0012\u000b \u0001*\u0004\u0018\u00010&0&\u0012\r\u0012\u000b \u0001*\u0004\u0018\u00010\u00010\u0001 \u0001*#\u0012\r\u0012\u000b \u0001*\u0004\u0018\u00010&0&\u0012\r\u0012\u000b \u0001*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00010\u0001\u0018\u00010\u00010\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, d2 = {"Lcom/tinder/core/experiment/AbTestVariables;", "", "leanplumVariables", "Lcom/tinder/core/experiment/LeanplumVariables;", "(Lcom/tinder/core/experiment/LeanplumVariables;)V", "accountDeleteVariant", "", "getAccountDeleteVariant", "()I", "activityFeedEnabled", "", "getActivityFeedEnabled", "()Z", "activityFeedSettingsEnabled", "getActivityFeedSettingsEnabled", "activityMessagesEnabled", "getActivityMessagesEnabled", "adMessageRequestCadenceMs", "", "getAdMessageRequestCadenceMs", "()J", "adsCadence", "getAdsCadence", "appRatingSendWaitPeriodInDays", "getAppRatingSendWaitPeriodInDays", "appRatingShowWaitPeriodInDays", "getAppRatingShowWaitPeriodInDays", "appRatingV2", "getAppRatingV2", "autoPlayControlsEnabled", "getAutoPlayControlsEnabled", "cardSwipeTutorialEnabled", "getCardSwipeTutorialEnabled", "controllaEnabled", "getControllaEnabled", "customGenderEnabled", "getCustomGenderEnabled", "customGenderOptions", "", "getCustomGenderOptions", "()Ljava/lang/String;", "dfpNativeDisplayAdsEnabled", "getDfpNativeDisplayAdsEnabled", "dfpNativeVideoAdsEnabled", "getDfpNativeVideoAdsEnabled", "editProfileNudgeEnabled", "getEditProfileNudgeEnabled", "fanAdsEnabled", "getFanAdsEnabled", "fanPlacementId", "getFanPlacementId", "fastMatchPollingEnabled", "getFastMatchPollingEnabled", "feedTooltipDaysInactive", "getFeedTooltipDaysInactive", "feedTopLevelNavEnabled", "getFeedTopLevelNavEnabled", "gamepadCounterEnabled", "getGamepadCounterEnabled", "gamepadSwipeHighlightEnabled", "getGamepadSwipeHighlightEnabled", "gestureBallsInYourCourtEnable", "getGestureBallsInYourCourtEnable", "gestureChatBubbleEnable", "getGestureChatBubbleEnable", "gestureEyerollEnable", "getGestureEyerollEnable", "gestureMartiniEnable", "getGestureMartiniEnable", "gestureStrikeEnable", "getGestureStrikeEnable", "gifProvider", "getGifProvider", "googlePlayBillingLibraryEnabled", "getGooglePlayBillingLibraryEnabled", "grandGesturesEnabled", "getGrandGesturesEnabled", "inAppNotificationRedesignEnabled", "getInAppNotificationRedesignEnabled", "isAddyV2Enabled", "isBitmojiEnabled", "isDfpBrandedProfileCardEnabled", "isDiscountingEnabled", "isEmailSettingsEnabled", "isFeedProfileChangeBioEnabled", "isFeedProfileChangeSchoolEnabled", "isFeedProfileChangeWorkEnabled", "isFeedTooltipEnabled", "isGoldMerchandisingEnabled", "isLoopsCreationEnabled", "isLoopsDisplayEnabled", "isLoopsPhase1Enabled", "isNewPhotoGridEnabled", "isPlacesShortOnboardingEnabled", "isPlacesWhackAMoleEnabled", "isRecsFanVideoEnabled", "isScreenshotNotificationEnabled", "isTinderUEnabled", "loopsEnabled", "getLoopsEnabled", "loopsFeedEnabled", "getLoopsFeedEnabled", "loopsMessagesEnabled", "getLoopsMessagesEnabled", "loopsRecsEnabled", "getLoopsRecsEnabled", "minimumMessageAdInterstice", "getMinimumMessageAdInterstice", "perfInstrumentationEnabled", "getPerfInstrumentationEnabled", "persistentConnectionEnabled", "getPersistentConnectionEnabled", "photoPreviewEnabled", "getPhotoPreviewEnabled", "profileV2Revenue", "getProfileV2Revenue", "recsRateDialogsDisabled", "getRecsRateDialogsDisabled", "secondaryAdsCadence", "getSecondaryAdsCadence", "settingsOnRecsEnabled", "getSettingsOnRecsEnabled", "shimmerEnabled", "getShimmerEnabled", "sponsoredMessageEnabled", "getSponsoredMessageEnabled", "spotifyEnabled", "getSpotifyEnabled", "superLikeableEnabled", "getSuperLikeableEnabled", "superlikePaywallColorVariant", "getSuperlikePaywallColorVariant", "swipeOpenEnabled", "getSwipeOpenEnabled", "tinderHouseAdsEnabled", "getTinderHouseAdsEnabled", "topPicksEnabled", "getTopPicksEnabled", "topPicksNotificationOffset", "getTopPicksNotificationOffset", "topPicksTooltipSwipeThreshold", "getTopPicksTooltipSwipeThreshold", "typingIndicatorEnabled", "getTypingIndicatorEnabled", "typingIndicatorMorphAnimationEnabled", "getTypingIndicatorMorphAnimationEnabled", "variantdIds", "", "", "kotlin.jvm.PlatformType", "", "", "getVariantdIds", "()Ljava/util/List;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.core.experiment.c */
public final class C8592c {
    /* renamed from: A */
    private final int f30362A;
    /* renamed from: B */
    private final boolean f30363B;
    /* renamed from: C */
    private final boolean f30364C;
    /* renamed from: D */
    private final boolean f30365D;
    /* renamed from: E */
    private final boolean f30366E;
    /* renamed from: F */
    private final boolean f30367F;
    /* renamed from: G */
    private final boolean f30368G;
    /* renamed from: H */
    private final boolean f30369H;
    /* renamed from: I */
    private final int f30370I;
    /* renamed from: J */
    private final boolean f30371J;
    /* renamed from: K */
    private final boolean f30372K;
    /* renamed from: L */
    private final boolean f30373L;
    /* renamed from: M */
    private final boolean f30374M;
    /* renamed from: N */
    private final boolean f30375N;
    /* renamed from: O */
    private final boolean f30376O;
    /* renamed from: P */
    private final boolean f30377P;
    /* renamed from: Q */
    private final boolean f30378Q;
    /* renamed from: R */
    private final boolean f30379R;
    /* renamed from: S */
    private final long f30380S;
    /* renamed from: T */
    private final boolean f30381T;
    /* renamed from: U */
    private final int f30382U;
    /* renamed from: V */
    private final boolean f30383V;
    /* renamed from: W */
    private final boolean f30384W;
    /* renamed from: X */
    private final boolean f30385X;
    /* renamed from: Y */
    private final boolean f30386Y;
    /* renamed from: Z */
    private final boolean f30387Z;
    /* renamed from: a */
    private final List<Map<String, Object>> f30388a;
    private final boolean aa;
    private final boolean ab;
    private final boolean ac;
    private final boolean ad;
    private final boolean ae;
    private final boolean af;
    private final boolean ag;
    private final boolean ah;
    private final boolean ai;
    private final boolean aj;
    private final int ak;
    private final boolean al;
    private final boolean am;
    private final boolean an;
    private final boolean ao;
    private final boolean ap;
    private final boolean aq;
    private final boolean ar;
    private final boolean as;
    private final int at;
    private final int au;
    private final boolean av;
    private final boolean aw;
    private final boolean ax;
    private final boolean ay;
    /* renamed from: b */
    private final boolean f30389b;
    /* renamed from: c */
    private final boolean f30390c;
    /* renamed from: d */
    private final boolean f30391d;
    @NotNull
    /* renamed from: e */
    private final String f30392e;
    /* renamed from: f */
    private final int f30393f;
    /* renamed from: g */
    private final boolean f30394g;
    /* renamed from: h */
    private final boolean f30395h;
    /* renamed from: i */
    private final boolean f30396i;
    /* renamed from: j */
    private final boolean f30397j;
    /* renamed from: k */
    private final boolean f30398k;
    /* renamed from: l */
    private final int f30399l;
    /* renamed from: m */
    private final boolean f30400m;
    /* renamed from: n */
    private final boolean f30401n;
    /* renamed from: o */
    private final boolean f30402o;
    @NotNull
    /* renamed from: p */
    private final String f30403p;
    /* renamed from: q */
    private final boolean f30404q;
    /* renamed from: r */
    private final boolean f30405r;
    @NotNull
    /* renamed from: s */
    private final String f30406s;
    /* renamed from: t */
    private final boolean f30407t;
    /* renamed from: u */
    private final boolean f30408u;
    /* renamed from: v */
    private final boolean f30409v;
    /* renamed from: w */
    private final boolean f30410w;
    /* renamed from: x */
    private final boolean f30411x;
    /* renamed from: y */
    private final int f30412y;
    /* renamed from: z */
    private final int f30413z;

    @Inject
    public C8592c(@NotNull C2644k c2644k) {
        C2668g.b(c2644k, "leanplumVariables");
        this.f30388a = c2644k.a();
        Object value = c2644k.b().value();
        C2668g.a(value, "leanplumVariables.spotifyEnabled.value()");
        this.f30389b = ((Boolean) value).booleanValue();
        value = c2644k.c().value();
        C2668g.a(value, "leanplumVariables.photoPreviewEnabled.value()");
        this.f30390c = ((Boolean) value).booleanValue();
        value = c2644k.d().value();
        C2668g.a(value, "leanplumVariables.customGenderEnabled.value()");
        this.f30391d = ((Boolean) value).booleanValue();
        value = c2644k.e().value();
        C2668g.a(value, "leanplumVariables.customGenderOptions.value()");
        this.f30392e = (String) value;
        value = c2644k.f().value();
        C2668g.a(value, "leanplumVariables.superl…ywallColorVariant.value()");
        this.f30393f = ((Number) value).intValue();
        value = c2644k.g().value();
        C2668g.a(value, "leanplumVariables.isDiscountingEnabled.value()");
        this.f30394g = ((Boolean) value).booleanValue();
        value = c2644k.h().value();
        C2668g.a(value, "leanplumVariables.grandGesturesEnabled.value()");
        this.f30395h = ((Boolean) value).booleanValue();
        value = c2644k.i().value();
        C2668g.a(value, "leanplumVariables.fanAdsEnabled.value()");
        this.f30396i = ((Boolean) value).booleanValue();
        value = c2644k.j().value();
        C2668g.a(value, "leanplumVariables.dfpNativeVideoAdsEnabled.value()");
        this.f30397j = ((Boolean) value).booleanValue();
        value = c2644k.k().value();
        C2668g.a(value, "leanplumVariables.dfpNat…DisplayAdsEnabled.value()");
        this.f30398k = ((Boolean) value).booleanValue();
        value = c2644k.l().value();
        C2668g.a(value, "leanplumVariables.adsCadence.value()");
        this.f30399l = ((Number) value).intValue();
        value = c2644k.m().value();
        C2668g.a(value, "leanplumVariables.fastMatchPollingEnabled.value()");
        this.f30400m = ((Boolean) value).booleanValue();
        value = c2644k.n().value();
        C2668g.a(value, "leanplumVariables.perfIn…umentationEnabled.value()");
        this.f30401n = ((Boolean) value).booleanValue();
        value = c2644k.o().value();
        C2668g.a(value, "leanplumVariables.settingsOnRecsEnabled.value()");
        this.f30402o = ((Boolean) value).booleanValue();
        value = c2644k.p().value();
        C2668g.a(value, "leanplumVariables.fanPlacementId.value()");
        this.f30403p = (String) value;
        value = c2644k.q().value();
        C2668g.a(value, "leanplumVariables.controllaEnabled.value()");
        this.f30404q = ((Boolean) value).booleanValue();
        value = c2644k.r().value();
        C2668g.a(value, "leanplumVariables.topPicksEnabled.value()");
        this.f30405r = ((Boolean) value).booleanValue();
        value = c2644k.s().value();
        C2668g.a(value, "leanplumVariables.topPic…otificationOffset.value()");
        this.f30406s = (String) value;
        value = c2644k.t().value();
        C2668g.a(value, "leanplumVariables.cardSwipeTutorialEnabled.value()");
        this.f30407t = ((Boolean) value).booleanValue();
        value = c2644k.u().value();
        C2668g.a(value, "leanplumVariables.editProfileNudgeEnabled.value()");
        this.f30408u = ((Boolean) value).booleanValue();
        value = c2644k.v().value();
        C2668g.a(value, "leanplumVariables.gamepa…eHighlightEnabled.value()");
        this.f30409v = ((Boolean) value).booleanValue();
        value = c2644k.w().value();
        C2668g.a(value, "leanplumVariables.recsRateDialogsDisabled.value()");
        this.f30410w = ((Boolean) value).booleanValue();
        value = c2644k.x().value();
        C2668g.a(value, "leanplumVariables.sponsoredMessageEnabled.value()");
        this.f30411x = ((Boolean) value).booleanValue();
        value = c2644k.y().value();
        C2668g.a(value, "leanplumVariables.accountDeleteVariant.value()");
        this.f30412y = ((Number) value).intValue();
        value = c2644k.z().value();
        C2668g.a(value, "leanplumVariables.appRat…wWaitPeriodInDays.value()");
        this.f30413z = ((Number) value).intValue();
        value = c2644k.A().value();
        C2668g.a(value, "leanplumVariables.appRat…dWaitPeriodInDays.value()");
        this.f30362A = ((Number) value).intValue();
        value = c2644k.B().value();
        C2668g.a(value, "leanplumVariables.inAppN…onRedesignEnabled.value()");
        this.f30363B = ((Boolean) value).booleanValue();
        value = c2644k.C().value();
        C2668g.a(value, "leanplumVariables.gestureChatBubbleEnable.value()");
        this.f30364C = ((Boolean) value).booleanValue();
        value = c2644k.D().value();
        C2668g.a(value, "leanplumVariables.gestureMartiniEnable.value()");
        this.f30365D = ((Boolean) value).booleanValue();
        value = c2644k.E().value();
        C2668g.a(value, "leanplumVariables.gestureEyerollEnable.value()");
        this.f30366E = ((Boolean) value).booleanValue();
        value = c2644k.F().value();
        C2668g.a(value, "leanplumVariables.gestureStrikeEnable.value()");
        this.f30367F = ((Boolean) value).booleanValue();
        value = c2644k.G().value();
        C2668g.a(value, "leanplumVariables.gestur…InYourCourtEnable.value()");
        this.f30368G = ((Boolean) value).booleanValue();
        value = c2644k.H().value();
        C2668g.a(value, "leanplumVariables.shimmerEnabled.value()");
        this.f30369H = ((Boolean) value).booleanValue();
        value = c2644k.I().value();
        C2668g.a(value, "leanplumVariables.secondaryAdsCadence.value()");
        this.f30370I = ((Number) value).intValue();
        value = c2644k.J().value();
        C2668g.a(value, "leanplumVariables.swipeOpenEnabled.value()");
        this.f30371J = ((Boolean) value).booleanValue();
        value = c2644k.K().value();
        C2668g.a(value, "leanplumVariables.appRatingV2.value()");
        this.f30372K = ((Boolean) value).booleanValue();
        value = c2644k.L().value();
        C2668g.a(value, "leanplumVariables.persis…ConnectionEnabled.value()");
        this.f30373L = ((Boolean) value).booleanValue();
        value = c2644k.M().value();
        C2668g.a(value, "leanplumVariables.activityMessagesEnabled.value()");
        this.f30374M = ((Boolean) value).booleanValue();
        value = c2644k.N().value();
        C2668g.a(value, "leanplumVariables.activityFeedEnabled.value()");
        this.f30375N = ((Boolean) value).booleanValue();
        value = c2644k.O().value();
        C2668g.a(value, "leanplumVariables.activi…edSettingsEnabled.value()");
        this.f30376O = ((Boolean) value).booleanValue();
        value = c2644k.P().value();
        C2668g.a(value, "leanplumVariables.feedTopLevelNavEnabled.value()");
        this.f30377P = ((Boolean) value).booleanValue();
        value = c2644k.Q().value();
        C2668g.a(value, "leanplumVariables.superLikeableEnabled.value()");
        this.f30378Q = ((Boolean) value).booleanValue();
        value = c2644k.R().value();
        C2668g.a(value, "leanplumVariables.google…ingLibraryEnabled.value()");
        this.f30379R = ((Boolean) value).booleanValue();
        value = c2644k.S().value();
        C2668g.a(value, "leanplumVariables.adMess…eRequestCadenceMs.value()");
        this.f30380S = ((Number) value).longValue();
        value = c2644k.T().value();
        C2668g.a(value, "leanplumVariables.gamepadCounterEnabled.value()");
        this.f30381T = ((Boolean) value).booleanValue();
        value = c2644k.U().value();
        C2668g.a(value, "leanplumVariables.minimu…ssageAdInterstice.value()");
        this.f30382U = ((Number) value).intValue();
        value = c2644k.V().value();
        C2668g.a(value, "leanplumVariables.isDfpB…rofileCardEnabled.value()");
        this.f30383V = ((Boolean) value).booleanValue();
        value = c2644k.W().value();
        C2668g.a(value, "leanplumVariables.isGold…chandisingEnabled.value()");
        this.f30384W = ((Boolean) value).booleanValue();
        value = c2644k.X().value();
        C2668g.a(value, "leanplumVariables.isNewPhotoGridEnabled.value()");
        this.f30385X = ((Boolean) value).booleanValue();
        value = c2644k.Y().value();
        C2668g.a(value, "leanplumVariables.isLoopsPhase1Enabled.value()");
        this.f30386Y = ((Boolean) value).booleanValue();
        value = c2644k.Z().value();
        C2668g.a(value, "leanplumVariables.isRecsFanVideoEnabled.value()");
        this.f30387Z = ((Boolean) value).booleanValue();
        value = c2644k.aa().value();
        C2668g.a(value, "leanplumVariables.loopsEnabled.value()");
        this.aa = ((Boolean) value).booleanValue();
        value = c2644k.ab().value();
        C2668g.a(value, "leanplumVariables.loopsRecsEnabled.value()");
        this.ab = ((Boolean) value).booleanValue();
        value = c2644k.ac().value();
        C2668g.a(value, "leanplumVariables.loopsFeedEnabled.value()");
        this.ac = ((Boolean) value).booleanValue();
        value = c2644k.ad().value();
        C2668g.a(value, "leanplumVariables.loopsMessagesEnabled.value()");
        this.ad = ((Boolean) value).booleanValue();
        value = c2644k.ae().value();
        C2668g.a(value, "leanplumVariables.autoPlayControlsEnabled.value()");
        this.ae = ((Boolean) value).booleanValue();
        value = c2644k.af().value();
        C2668g.a(value, "leanplumVariables.isAddyV2Enabled.value()");
        this.af = ((Boolean) value).booleanValue();
        value = c2644k.ag().value();
        C2668g.a(value, "leanplumVariables.typingIndicatorEnabled.value()");
        this.ag = ((Boolean) value).booleanValue();
        value = c2644k.ah().value();
        C2668g.a(value, "leanplumVariables.typing…hAnimationEnabled.value()");
        this.ah = ((Boolean) value).booleanValue();
        value = c2644k.ai().value();
        C2668g.a(value, "leanplumVariables.profileV2Revenue.value()");
        this.ai = ((Boolean) value).booleanValue();
        value = c2644k.aj().value();
        C2668g.a(value, "leanplumVariables.isEmailSettingsEnabled.value()");
        this.aj = ((Boolean) value).booleanValue();
        value = c2644k.ak().value();
        C2668g.a(value, "leanplumVariables.topPic…tipSwipeThreshold.value()");
        this.ak = ((Number) value).intValue();
        value = c2644k.al().value();
        C2668g.a(value, "leanplumVariables.tinderHouseAdsEnabled.value()");
        this.al = ((Boolean) value).booleanValue();
        value = c2644k.am().value();
        C2668g.a(value, "leanplumVariables.isFeed…eChangeBioEnabled.value()");
        this.am = ((Boolean) value).booleanValue();
        value = c2644k.an().value();
        C2668g.a(value, "leanplumVariables.isFeed…ChangeWorkEnabled.value()");
        this.an = ((Boolean) value).booleanValue();
        value = c2644k.ao().value();
        C2668g.a(value, "leanplumVariables.isFeed…angeSchoolEnabled.value()");
        this.ao = ((Boolean) value).booleanValue();
        value = c2644k.ap().value();
        C2668g.a(value, "leanplumVariables.isLoopsCreationEnabled.value()");
        this.ap = ((Boolean) value).booleanValue();
        value = c2644k.aq().value();
        C2668g.a(value, "leanplumVariables.isLoopsDisplayEnabled.value()");
        this.aq = ((Boolean) value).booleanValue();
        value = c2644k.ar().value();
        C2668g.a(value, "leanplumVariables.isScre…tificationEnabled.value()");
        this.ar = ((Boolean) value).booleanValue();
        value = c2644k.as().value();
        C2668g.a(value, "leanplumVariables.isFeedTooltipEnabled.value()");
        this.as = ((Boolean) value).booleanValue();
        value = c2644k.at().value();
        C2668g.a(value, "leanplumVariables.feedTooltipDaysInactive.value()");
        this.at = ((Number) value).intValue();
        value = c2644k.au().value();
        C2668g.a(value, "leanplumVariables.gifProvider.value()");
        this.au = ((Number) value).intValue();
        value = c2644k.av().value();
        C2668g.a(value, "leanplumVariables.isBitmojiEnabled.value()");
        this.av = ((Boolean) value).booleanValue();
        value = c2644k.aw().value();
        C2668g.a(value, "leanplumVariables.isPlac…OnboardingEnabled.value()");
        this.aw = ((Boolean) value).booleanValue();
        value = c2644k.ax().value();
        C2668g.a(value, "leanplumVariables.isPlac…WhackAMoleEnabled.value()");
        this.ax = ((Boolean) value).booleanValue();
        c2644k = c2644k.ay().value();
        C2668g.a(c2644k, "leanplumVariables.isTinderUEnabled.value()");
        this.ay = ((Boolean) c2644k).booleanValue();
    }

    /* renamed from: a */
    public final List<Map<String, Object>> m36658a() {
        return this.f30388a;
    }

    /* renamed from: b */
    public final boolean m36659b() {
        return this.f30389b;
    }

    /* renamed from: c */
    public final boolean m36660c() {
        return this.f30390c;
    }

    /* renamed from: d */
    public final boolean m36661d() {
        return this.f30391d;
    }

    @NotNull
    /* renamed from: e */
    public final String m36662e() {
        return this.f30392e;
    }

    /* renamed from: f */
    public final boolean m36663f() {
        return this.f30394g;
    }

    /* renamed from: g */
    public final boolean m36664g() {
        return this.f30395h;
    }

    /* renamed from: h */
    public final boolean m36665h() {
        return this.f30396i;
    }

    /* renamed from: i */
    public final boolean m36666i() {
        return this.f30397j;
    }

    /* renamed from: j */
    public final boolean m36667j() {
        return this.f30398k;
    }

    /* renamed from: k */
    public final int m36668k() {
        return this.f30399l;
    }

    /* renamed from: l */
    public final boolean m36669l() {
        return this.f30400m;
    }

    /* renamed from: m */
    public final boolean m36670m() {
        return this.f30401n;
    }

    /* renamed from: n */
    public final boolean m36671n() {
        return this.f30402o;
    }

    @NotNull
    /* renamed from: o */
    public final String m36672o() {
        return this.f30403p;
    }

    /* renamed from: p */
    public final boolean m36673p() {
        return this.f30404q;
    }

    /* renamed from: q */
    public final boolean m36674q() {
        return this.f30405r;
    }

    @NotNull
    /* renamed from: r */
    public final String m36675r() {
        return this.f30406s;
    }

    /* renamed from: s */
    public final boolean m36676s() {
        return this.f30407t;
    }

    /* renamed from: t */
    public final boolean m36677t() {
        return this.f30408u;
    }

    /* renamed from: u */
    public final boolean m36678u() {
        return this.f30409v;
    }

    /* renamed from: v */
    public final boolean m36679v() {
        return this.f30410w;
    }

    /* renamed from: w */
    public final boolean m36680w() {
        return this.f30411x;
    }

    /* renamed from: x */
    public final int m36681x() {
        return this.f30412y;
    }

    /* renamed from: y */
    public final int m36682y() {
        return this.f30413z;
    }

    /* renamed from: z */
    public final int m36683z() {
        return this.f30362A;
    }

    /* renamed from: A */
    public final boolean m36632A() {
        return this.f30363B;
    }

    /* renamed from: B */
    public final boolean m36633B() {
        return this.f30364C;
    }

    /* renamed from: C */
    public final boolean m36634C() {
        return this.f30365D;
    }

    /* renamed from: D */
    public final boolean m36635D() {
        return this.f30366E;
    }

    /* renamed from: E */
    public final boolean m36636E() {
        return this.f30367F;
    }

    /* renamed from: F */
    public final boolean m36637F() {
        return this.f30368G;
    }

    /* renamed from: G */
    public final boolean m36638G() {
        return this.f30369H;
    }

    /* renamed from: H */
    public final int m36639H() {
        return this.f30370I;
    }

    /* renamed from: I */
    public final boolean m36640I() {
        return this.f30371J;
    }

    /* renamed from: J */
    public final boolean m36641J() {
        return this.f30372K;
    }

    /* renamed from: K */
    public final boolean m36642K() {
        return this.f30373L;
    }

    /* renamed from: L */
    public final boolean m36643L() {
        return this.f30374M;
    }

    /* renamed from: M */
    public final boolean m36644M() {
        return this.f30375N;
    }

    /* renamed from: N */
    public final boolean m36645N() {
        return this.f30376O;
    }

    /* renamed from: O */
    public final boolean m36646O() {
        return this.f30377P;
    }

    /* renamed from: P */
    public final boolean m36647P() {
        return this.f30378Q;
    }

    /* renamed from: Q */
    public final long m36648Q() {
        return this.f30380S;
    }

    /* renamed from: R */
    public final boolean m36649R() {
        return this.f30381T;
    }

    /* renamed from: S */
    public final int m36650S() {
        return this.f30382U;
    }

    /* renamed from: T */
    public final boolean m36651T() {
        return this.f30383V;
    }

    /* renamed from: U */
    public final boolean m36652U() {
        return this.f30384W;
    }

    /* renamed from: V */
    public final boolean m36653V() {
        return this.f30385X;
    }

    /* renamed from: W */
    public final boolean m36654W() {
        return this.f30386Y;
    }

    /* renamed from: X */
    public final boolean m36655X() {
        return this.f30387Z;
    }

    /* renamed from: Y */
    public final boolean m36656Y() {
        return this.aa;
    }

    /* renamed from: Z */
    public final boolean m36657Z() {
        return this.ab;
    }

    public final boolean aa() {
        return this.ac;
    }

    public final boolean ab() {
        return this.ad;
    }

    public final boolean ac() {
        return this.ae;
    }

    public final boolean ad() {
        return this.af;
    }

    public final boolean ae() {
        return this.ag;
    }

    public final boolean af() {
        return this.ah;
    }

    public final boolean ag() {
        return this.aj;
    }

    public final int ah() {
        return this.ak;
    }

    public final boolean ai() {
        return this.al;
    }

    public final boolean aj() {
        return this.am;
    }

    public final boolean ak() {
        return this.an;
    }

    public final boolean al() {
        return this.ao;
    }

    public final boolean am() {
        return this.ap;
    }

    public final boolean an() {
        return this.aq;
    }

    public final boolean ao() {
        return this.ar;
    }

    public final boolean ap() {
        return this.as;
    }

    public final int aq() {
        return this.at;
    }

    public final int ar() {
        return this.au;
    }

    public final boolean as() {
        return this.av;
    }

    public final boolean at() {
        return this.aw;
    }

    public final boolean au() {
        return this.ax;
    }

    public final boolean av() {
        return this.ay;
    }
}
