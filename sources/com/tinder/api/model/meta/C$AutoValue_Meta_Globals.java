package com.tinder.api.model.meta;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.model.meta.Meta.Globals;
import com.tinder.api.model.meta.Meta.ProfileEditingConfig;
import com.tinder.api.model.meta.Meta.TypingIndicatorConfig;
import java.util.List;
import java.util.Map;

/* renamed from: com.tinder.api.model.meta.$AutoValue_Meta_Globals */
abstract class C$AutoValue_Meta_Globals extends Globals {
    private final int adSwipeInterval;
    private final boolean boost;
    private final int boostDecay;
    private final int boostDown;
    private final int boostDuration;
    private final int boostIntroMultiplier;
    private final int boostUp;
    private final boolean canAddPhotosFromFacebook;
    private final Boolean canEditEmail;
    private final boolean canEditJobs;
    private final boolean canEditSchools;
    private final boolean canShowCommonConnections;
    private final boolean discount;
    private final Long fastMatchNewCountFetchInterval;
    private final Long fastMatchNewCountFetchIntervalWhileBoosting;
    private final Integer fastMatchNotificationDefault;
    private final List<Integer> fastMatchNotificationOptions;
    private final Integer fastMatchPillRangeThreshold;
    private final Integer fastMatchPollingMode;
    private final Long fastMatchPreviewMinTimeInMillis;
    private final boolean fetchConnections;
    private final boolean fireboarding;
    private final String inviteType;
    private final Boolean isFastMatchEnabled;
    private final boolean isIntroPricingEnabled;
    private final Boolean isTopPicksEnabled;
    private final boolean kontagent;
    private final boolean kontagentEnabled;
    private final String matchmakerDefaultMessage;
    private final boolean mqtt;
    private final boolean photoOptimizerEnabled;
    private final boolean photoOptimizerHasResult;
    private final boolean photoPreviewEnabled;
    private final boolean plus;
    private final ProfileEditingConfig profileEditingConfig;
    private final boolean rateApp;
    private final boolean recsBlend;
    private final int recsInterval;
    private final int recsSize;
    private final boolean selectEnable;
    private final String shareDefaultText;
    private final boolean sparks;
    private final boolean squadsEnabled;
    private final int squadsExpirationNotice;
    private final int squadsExtensionLength;
    private final boolean subscriptionExpired;
    private final boolean superLike;
    private final int superLikeAlcMode;
    private final boolean tinderSparks;
    private final Boolean topPicksLocalDailyNotificationsEnabled;
    private final Map<String, Integer> topPicksLocalDailyOffsets;
    private final String topPicksLocalNotificationMessage;
    private final TypingIndicatorConfig typingIndicatorConfig;
    private final int updatesInterval;
    private final boolean videoSwipeEnable;

    C$AutoValue_Meta_Globals(int i, String str, int i2, int i3, int i4, String str2, String str3, int i5, int i6, int i7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i8, boolean z6, boolean z7, boolean z8, int i9, boolean z9, boolean z10, boolean z11, boolean z12, int i10, int i11, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i12, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, @Nullable Boolean bool, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable Integer num, @Nullable List<Integer> list, @Nullable Integer num2, @Nullable Integer num3, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str4, @Nullable TypingIndicatorConfig typingIndicatorConfig, @Nullable ProfileEditingConfig profileEditingConfig, @Nullable Boolean bool4, @Nullable Map<String, Integer> map) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        this.boostIntroMultiplier = i;
        if (str5 == null) {
            throw new NullPointerException("Null inviteType");
        }
        r0.inviteType = str5;
        r0.recsInterval = i2;
        r0.updatesInterval = i3;
        r0.recsSize = i4;
        if (str6 == null) {
            throw new NullPointerException("Null matchmakerDefaultMessage");
        }
        r0.matchmakerDefaultMessage = str6;
        if (str7 == null) {
            throw new NullPointerException("Null shareDefaultText");
        }
        r0.shareDefaultText = str7;
        r0.boostDecay = i5;
        r0.boostUp = i6;
        r0.boostDown = i7;
        r0.sparks = z;
        r0.kontagent = z2;
        r0.kontagentEnabled = z3;
        r0.mqtt = z4;
        r0.tinderSparks = z5;
        r0.adSwipeInterval = i8;
        r0.fetchConnections = z6;
        r0.fireboarding = z7;
        r0.rateApp = z8;
        r0.superLikeAlcMode = i9;
        r0.plus = z9;
        r0.superLike = z10;
        r0.recsBlend = z11;
        r0.squadsEnabled = z12;
        r0.squadsExtensionLength = i10;
        r0.squadsExpirationNotice = i11;
        r0.photoPreviewEnabled = z13;
        r0.photoOptimizerEnabled = z14;
        r0.photoOptimizerHasResult = z15;
        r0.discount = z16;
        r0.boost = z17;
        r0.boostDuration = i12;
        r0.videoSwipeEnable = z18;
        r0.selectEnable = z19;
        r0.subscriptionExpired = z20;
        r0.canEditJobs = z21;
        r0.canEditSchools = z22;
        r0.canShowCommonConnections = z23;
        r0.canAddPhotosFromFacebook = z24;
        r0.isIntroPricingEnabled = z25;
        r0.isFastMatchEnabled = bool;
        r0.fastMatchPreviewMinTimeInMillis = l;
        r0.fastMatchNewCountFetchInterval = l2;
        r0.fastMatchNewCountFetchIntervalWhileBoosting = l3;
        r0.fastMatchPillRangeThreshold = num;
        r0.fastMatchNotificationOptions = list;
        r0.fastMatchNotificationDefault = num2;
        r0.fastMatchPollingMode = num3;
        r0.isTopPicksEnabled = bool2;
        r0.topPicksLocalDailyNotificationsEnabled = bool3;
        r0.topPicksLocalNotificationMessage = str4;
        r0.typingIndicatorConfig = typingIndicatorConfig;
        r0.profileEditingConfig = profileEditingConfig;
        r0.canEditEmail = bool4;
        r0.topPicksLocalDailyOffsets = map;
    }

    @Json(name = "boost_intro_multiplier")
    public int boostIntroMultiplier() {
        return this.boostIntroMultiplier;
    }

    @Json(name = "invite_type")
    public String inviteType() {
        return this.inviteType;
    }

    @Json(name = "recs_interval")
    public int recsInterval() {
        return this.recsInterval;
    }

    @Json(name = "updates_interval")
    public int updatesInterval() {
        return this.updatesInterval;
    }

    @Json(name = "recs_size")
    public int recsSize() {
        return this.recsSize;
    }

    @Json(name = "matchmaker_default_message")
    public String matchmakerDefaultMessage() {
        return this.matchmakerDefaultMessage;
    }

    @Json(name = "share_default_text")
    public String shareDefaultText() {
        return this.shareDefaultText;
    }

    @Json(name = "boost_decay")
    public int boostDecay() {
        return this.boostDecay;
    }

    @Json(name = "boost_up")
    public int boostUp() {
        return this.boostUp;
    }

    @Json(name = "boost_down")
    public int boostDown() {
        return this.boostDown;
    }

    public boolean sparks() {
        return this.sparks;
    }

    public boolean kontagent() {
        return this.kontagent;
    }

    @Json(name = "kontagent_enabled")
    public boolean kontagentEnabled() {
        return this.kontagentEnabled;
    }

    public boolean mqtt() {
        return this.mqtt;
    }

    @Json(name = "tinder_sparks")
    public boolean tinderSparks() {
        return this.tinderSparks;
    }

    @Json(name = "ad_swipe_interval")
    public int adSwipeInterval() {
        return this.adSwipeInterval;
    }

    @Json(name = "fetch_connections")
    public boolean fetchConnections() {
        return this.fetchConnections;
    }

    public boolean fireboarding() {
        return this.fireboarding;
    }

    @Json(name = "rate_app")
    public boolean rateApp() {
        return this.rateApp;
    }

    @Json(name = "super_like_alc_mode")
    public int superLikeAlcMode() {
        return this.superLikeAlcMode;
    }

    public boolean plus() {
        return this.plus;
    }

    @Json(name = "super_like")
    public boolean superLike() {
        return this.superLike;
    }

    @Json(name = "recs_blend")
    public boolean recsBlend() {
        return this.recsBlend;
    }

    @Json(name = "squads_enabled")
    public boolean squadsEnabled() {
        return this.squadsEnabled;
    }

    @Json(name = "squads_extension_length")
    public int squadsExtensionLength() {
        return this.squadsExtensionLength;
    }

    @Json(name = "squads_expiration_notice")
    public int squadsExpirationNotice() {
        return this.squadsExpirationNotice;
    }

    @Json(name = "photo_preview_enabled")
    public boolean photoPreviewEnabled() {
        return this.photoPreviewEnabled;
    }

    @Json(name = "enable_feature_photo_optimizer")
    public boolean photoOptimizerEnabled() {
        return this.photoOptimizerEnabled;
    }

    @Json(name = "photo_optimizer_has_result")
    public boolean photoOptimizerHasResult() {
        return this.photoOptimizerHasResult;
    }

    public boolean discount() {
        return this.discount;
    }

    public boolean boost() {
        return this.boost;
    }

    @Json(name = "boost_duration")
    public int boostDuration() {
        return this.boostDuration;
    }

    @Json(name = "ad_rate_enabled")
    public boolean videoSwipeEnable() {
        return this.videoSwipeEnable;
    }

    @Json(name = "select_enabled")
    public boolean selectEnable() {
        return this.selectEnable;
    }

    @Json(name = "subscription_expired")
    public boolean subscriptionExpired() {
        return this.subscriptionExpired;
    }

    @Json(name = "can_edit_jobs")
    public boolean canEditJobs() {
        return this.canEditJobs;
    }

    @Json(name = "can_edit_schools")
    public boolean canEditSchools() {
        return this.canEditSchools;
    }

    @Json(name = "can_show_common_connections")
    public boolean canShowCommonConnections() {
        return this.canShowCommonConnections;
    }

    @Json(name = "can_add_photos_from_facebook")
    public boolean canAddPhotosFromFacebook() {
        return this.canAddPhotosFromFacebook;
    }

    @Json(name = "intro_pricing")
    public boolean isIntroPricingEnabled() {
        return this.isIntroPricingEnabled;
    }

    @Nullable
    @Json(name = "fast_match")
    public Boolean isFastMatchEnabled() {
        return this.isFastMatchEnabled;
    }

    @Nullable
    @Json(name = "fast_match_preview_minimum_time")
    public Long fastMatchPreviewMinTimeInMillis() {
        return this.fastMatchPreviewMinTimeInMillis;
    }

    @Nullable
    @Json(name = "fast_match_new_count_fetch_interval")
    public Long fastMatchNewCountFetchInterval() {
        return this.fastMatchNewCountFetchInterval;
    }

    @Nullable
    @Json(name = "fast_match_boost_new_count_fetch_interval")
    public Long fastMatchNewCountFetchIntervalWhileBoosting() {
        return this.fastMatchNewCountFetchIntervalWhileBoosting;
    }

    @Nullable
    @Json(name = "fast_match_new_count_threshold")
    public Integer fastMatchPillRangeThreshold() {
        return this.fastMatchPillRangeThreshold;
    }

    @Nullable
    @Json(name = "fast_match_notif_options")
    public List<Integer> fastMatchNotificationOptions() {
        return this.fastMatchNotificationOptions;
    }

    @Nullable
    @Json(name = "fast_match_notif_default")
    public Integer fastMatchNotificationDefault() {
        return this.fastMatchNotificationDefault;
    }

    @Nullable
    @Json(name = "fast_match_polling_mode")
    public Integer fastMatchPollingMode() {
        return this.fastMatchPollingMode;
    }

    @Nullable
    @Json(name = "top_picks")
    public Boolean isTopPicksEnabled() {
        return this.isTopPicksEnabled;
    }

    @Nullable
    @Json(name = "top_picks_local_daily_enabled")
    public Boolean topPicksLocalDailyNotificationsEnabled() {
        return this.topPicksLocalDailyNotificationsEnabled;
    }

    @Nullable
    @Json(name = "top_picks_local_daily_msg")
    public String topPicksLocalNotificationMessage() {
        return this.topPicksLocalNotificationMessage;
    }

    @Nullable
    @Json(name = "typing_indicator")
    public TypingIndicatorConfig typingIndicatorConfig() {
        return this.typingIndicatorConfig;
    }

    @Nullable
    @Json(name = "profile")
    public ProfileEditingConfig profileEditingConfig() {
        return this.profileEditingConfig;
    }

    @Nullable
    @Json(name = "can_edit_email")
    public Boolean canEditEmail() {
        return this.canEditEmail;
    }

    @Nullable
    @Json(name = "top_picks_local_daily_offsets")
    public Map<String, Integer> topPicksLocalDailyOffsets() {
        return this.topPicksLocalDailyOffsets;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Globals{boostIntroMultiplier=");
        stringBuilder.append(this.boostIntroMultiplier);
        stringBuilder.append(", inviteType=");
        stringBuilder.append(this.inviteType);
        stringBuilder.append(", recsInterval=");
        stringBuilder.append(this.recsInterval);
        stringBuilder.append(", updatesInterval=");
        stringBuilder.append(this.updatesInterval);
        stringBuilder.append(", recsSize=");
        stringBuilder.append(this.recsSize);
        stringBuilder.append(", matchmakerDefaultMessage=");
        stringBuilder.append(this.matchmakerDefaultMessage);
        stringBuilder.append(", shareDefaultText=");
        stringBuilder.append(this.shareDefaultText);
        stringBuilder.append(", boostDecay=");
        stringBuilder.append(this.boostDecay);
        stringBuilder.append(", boostUp=");
        stringBuilder.append(this.boostUp);
        stringBuilder.append(", boostDown=");
        stringBuilder.append(this.boostDown);
        stringBuilder.append(", sparks=");
        stringBuilder.append(this.sparks);
        stringBuilder.append(", kontagent=");
        stringBuilder.append(this.kontagent);
        stringBuilder.append(", kontagentEnabled=");
        stringBuilder.append(this.kontagentEnabled);
        stringBuilder.append(", mqtt=");
        stringBuilder.append(this.mqtt);
        stringBuilder.append(", tinderSparks=");
        stringBuilder.append(this.tinderSparks);
        stringBuilder.append(", adSwipeInterval=");
        stringBuilder.append(this.adSwipeInterval);
        stringBuilder.append(", fetchConnections=");
        stringBuilder.append(this.fetchConnections);
        stringBuilder.append(", fireboarding=");
        stringBuilder.append(this.fireboarding);
        stringBuilder.append(", rateApp=");
        stringBuilder.append(this.rateApp);
        stringBuilder.append(", superLikeAlcMode=");
        stringBuilder.append(this.superLikeAlcMode);
        stringBuilder.append(", plus=");
        stringBuilder.append(this.plus);
        stringBuilder.append(", superLike=");
        stringBuilder.append(this.superLike);
        stringBuilder.append(", recsBlend=");
        stringBuilder.append(this.recsBlend);
        stringBuilder.append(", squadsEnabled=");
        stringBuilder.append(this.squadsEnabled);
        stringBuilder.append(", squadsExtensionLength=");
        stringBuilder.append(this.squadsExtensionLength);
        stringBuilder.append(", squadsExpirationNotice=");
        stringBuilder.append(this.squadsExpirationNotice);
        stringBuilder.append(", photoPreviewEnabled=");
        stringBuilder.append(this.photoPreviewEnabled);
        stringBuilder.append(", photoOptimizerEnabled=");
        stringBuilder.append(this.photoOptimizerEnabled);
        stringBuilder.append(", photoOptimizerHasResult=");
        stringBuilder.append(this.photoOptimizerHasResult);
        stringBuilder.append(", discount=");
        stringBuilder.append(this.discount);
        stringBuilder.append(", boost=");
        stringBuilder.append(this.boost);
        stringBuilder.append(", boostDuration=");
        stringBuilder.append(this.boostDuration);
        stringBuilder.append(", videoSwipeEnable=");
        stringBuilder.append(this.videoSwipeEnable);
        stringBuilder.append(", selectEnable=");
        stringBuilder.append(this.selectEnable);
        stringBuilder.append(", subscriptionExpired=");
        stringBuilder.append(this.subscriptionExpired);
        stringBuilder.append(", canEditJobs=");
        stringBuilder.append(this.canEditJobs);
        stringBuilder.append(", canEditSchools=");
        stringBuilder.append(this.canEditSchools);
        stringBuilder.append(", canShowCommonConnections=");
        stringBuilder.append(this.canShowCommonConnections);
        stringBuilder.append(", canAddPhotosFromFacebook=");
        stringBuilder.append(this.canAddPhotosFromFacebook);
        stringBuilder.append(", isIntroPricingEnabled=");
        stringBuilder.append(this.isIntroPricingEnabled);
        stringBuilder.append(", isFastMatchEnabled=");
        stringBuilder.append(this.isFastMatchEnabled);
        stringBuilder.append(", fastMatchPreviewMinTimeInMillis=");
        stringBuilder.append(this.fastMatchPreviewMinTimeInMillis);
        stringBuilder.append(", fastMatchNewCountFetchInterval=");
        stringBuilder.append(this.fastMatchNewCountFetchInterval);
        stringBuilder.append(", fastMatchNewCountFetchIntervalWhileBoosting=");
        stringBuilder.append(this.fastMatchNewCountFetchIntervalWhileBoosting);
        stringBuilder.append(", fastMatchPillRangeThreshold=");
        stringBuilder.append(this.fastMatchPillRangeThreshold);
        stringBuilder.append(", fastMatchNotificationOptions=");
        stringBuilder.append(this.fastMatchNotificationOptions);
        stringBuilder.append(", fastMatchNotificationDefault=");
        stringBuilder.append(this.fastMatchNotificationDefault);
        stringBuilder.append(", fastMatchPollingMode=");
        stringBuilder.append(this.fastMatchPollingMode);
        stringBuilder.append(", isTopPicksEnabled=");
        stringBuilder.append(this.isTopPicksEnabled);
        stringBuilder.append(", topPicksLocalDailyNotificationsEnabled=");
        stringBuilder.append(this.topPicksLocalDailyNotificationsEnabled);
        stringBuilder.append(", topPicksLocalNotificationMessage=");
        stringBuilder.append(this.topPicksLocalNotificationMessage);
        stringBuilder.append(", typingIndicatorConfig=");
        stringBuilder.append(this.typingIndicatorConfig);
        stringBuilder.append(", profileEditingConfig=");
        stringBuilder.append(this.profileEditingConfig);
        stringBuilder.append(", canEditEmail=");
        stringBuilder.append(this.canEditEmail);
        stringBuilder.append(", topPicksLocalDailyOffsets=");
        stringBuilder.append(this.topPicksLocalDailyOffsets);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r5 != r4) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof com.tinder.api.model.meta.Meta.Globals;
        r2 = 0;
        if (r1 == 0) goto L_0x02b3;
    L_0x0009:
        r5 = (com.tinder.api.model.meta.Meta.Globals) r5;
        r1 = r4.boostIntroMultiplier;
        r3 = r5.boostIntroMultiplier();
        if (r1 != r3) goto L_0x02b1;
    L_0x0013:
        r1 = r4.inviteType;
        r3 = r5.inviteType();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x02b1;
    L_0x001f:
        r1 = r4.recsInterval;
        r3 = r5.recsInterval();
        if (r1 != r3) goto L_0x02b1;
    L_0x0027:
        r1 = r4.updatesInterval;
        r3 = r5.updatesInterval();
        if (r1 != r3) goto L_0x02b1;
    L_0x002f:
        r1 = r4.recsSize;
        r3 = r5.recsSize();
        if (r1 != r3) goto L_0x02b1;
    L_0x0037:
        r1 = r4.matchmakerDefaultMessage;
        r3 = r5.matchmakerDefaultMessage();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x02b1;
    L_0x0043:
        r1 = r4.shareDefaultText;
        r3 = r5.shareDefaultText();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x02b1;
    L_0x004f:
        r1 = r4.boostDecay;
        r3 = r5.boostDecay();
        if (r1 != r3) goto L_0x02b1;
    L_0x0057:
        r1 = r4.boostUp;
        r3 = r5.boostUp();
        if (r1 != r3) goto L_0x02b1;
    L_0x005f:
        r1 = r4.boostDown;
        r3 = r5.boostDown();
        if (r1 != r3) goto L_0x02b1;
    L_0x0067:
        r1 = r4.sparks;
        r3 = r5.sparks();
        if (r1 != r3) goto L_0x02b1;
    L_0x006f:
        r1 = r4.kontagent;
        r3 = r5.kontagent();
        if (r1 != r3) goto L_0x02b1;
    L_0x0077:
        r1 = r4.kontagentEnabled;
        r3 = r5.kontagentEnabled();
        if (r1 != r3) goto L_0x02b1;
    L_0x007f:
        r1 = r4.mqtt;
        r3 = r5.mqtt();
        if (r1 != r3) goto L_0x02b1;
    L_0x0087:
        r1 = r4.tinderSparks;
        r3 = r5.tinderSparks();
        if (r1 != r3) goto L_0x02b1;
    L_0x008f:
        r1 = r4.adSwipeInterval;
        r3 = r5.adSwipeInterval();
        if (r1 != r3) goto L_0x02b1;
    L_0x0097:
        r1 = r4.fetchConnections;
        r3 = r5.fetchConnections();
        if (r1 != r3) goto L_0x02b1;
    L_0x009f:
        r1 = r4.fireboarding;
        r3 = r5.fireboarding();
        if (r1 != r3) goto L_0x02b1;
    L_0x00a7:
        r1 = r4.rateApp;
        r3 = r5.rateApp();
        if (r1 != r3) goto L_0x02b1;
    L_0x00af:
        r1 = r4.superLikeAlcMode;
        r3 = r5.superLikeAlcMode();
        if (r1 != r3) goto L_0x02b1;
    L_0x00b7:
        r1 = r4.plus;
        r3 = r5.plus();
        if (r1 != r3) goto L_0x02b1;
    L_0x00bf:
        r1 = r4.superLike;
        r3 = r5.superLike();
        if (r1 != r3) goto L_0x02b1;
    L_0x00c7:
        r1 = r4.recsBlend;
        r3 = r5.recsBlend();
        if (r1 != r3) goto L_0x02b1;
    L_0x00cf:
        r1 = r4.squadsEnabled;
        r3 = r5.squadsEnabled();
        if (r1 != r3) goto L_0x02b1;
    L_0x00d7:
        r1 = r4.squadsExtensionLength;
        r3 = r5.squadsExtensionLength();
        if (r1 != r3) goto L_0x02b1;
    L_0x00df:
        r1 = r4.squadsExpirationNotice;
        r3 = r5.squadsExpirationNotice();
        if (r1 != r3) goto L_0x02b1;
    L_0x00e7:
        r1 = r4.photoPreviewEnabled;
        r3 = r5.photoPreviewEnabled();
        if (r1 != r3) goto L_0x02b1;
    L_0x00ef:
        r1 = r4.photoOptimizerEnabled;
        r3 = r5.photoOptimizerEnabled();
        if (r1 != r3) goto L_0x02b1;
    L_0x00f7:
        r1 = r4.photoOptimizerHasResult;
        r3 = r5.photoOptimizerHasResult();
        if (r1 != r3) goto L_0x02b1;
    L_0x00ff:
        r1 = r4.discount;
        r3 = r5.discount();
        if (r1 != r3) goto L_0x02b1;
    L_0x0107:
        r1 = r4.boost;
        r3 = r5.boost();
        if (r1 != r3) goto L_0x02b1;
    L_0x010f:
        r1 = r4.boostDuration;
        r3 = r5.boostDuration();
        if (r1 != r3) goto L_0x02b1;
    L_0x0117:
        r1 = r4.videoSwipeEnable;
        r3 = r5.videoSwipeEnable();
        if (r1 != r3) goto L_0x02b1;
    L_0x011f:
        r1 = r4.selectEnable;
        r3 = r5.selectEnable();
        if (r1 != r3) goto L_0x02b1;
    L_0x0127:
        r1 = r4.subscriptionExpired;
        r3 = r5.subscriptionExpired();
        if (r1 != r3) goto L_0x02b1;
    L_0x012f:
        r1 = r4.canEditJobs;
        r3 = r5.canEditJobs();
        if (r1 != r3) goto L_0x02b1;
    L_0x0137:
        r1 = r4.canEditSchools;
        r3 = r5.canEditSchools();
        if (r1 != r3) goto L_0x02b1;
    L_0x013f:
        r1 = r4.canShowCommonConnections;
        r3 = r5.canShowCommonConnections();
        if (r1 != r3) goto L_0x02b1;
    L_0x0147:
        r1 = r4.canAddPhotosFromFacebook;
        r3 = r5.canAddPhotosFromFacebook();
        if (r1 != r3) goto L_0x02b1;
    L_0x014f:
        r1 = r4.isIntroPricingEnabled;
        r3 = r5.isIntroPricingEnabled();
        if (r1 != r3) goto L_0x02b1;
    L_0x0157:
        r1 = r4.isFastMatchEnabled;
        if (r1 != 0) goto L_0x0162;
    L_0x015b:
        r1 = r5.isFastMatchEnabled();
        if (r1 != 0) goto L_0x02b1;
    L_0x0161:
        goto L_0x016e;
    L_0x0162:
        r1 = r4.isFastMatchEnabled;
        r3 = r5.isFastMatchEnabled();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x02b1;
    L_0x016e:
        r1 = r4.fastMatchPreviewMinTimeInMillis;
        if (r1 != 0) goto L_0x0179;
    L_0x0172:
        r1 = r5.fastMatchPreviewMinTimeInMillis();
        if (r1 != 0) goto L_0x02b1;
    L_0x0178:
        goto L_0x0185;
    L_0x0179:
        r1 = r4.fastMatchPreviewMinTimeInMillis;
        r3 = r5.fastMatchPreviewMinTimeInMillis();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x02b1;
    L_0x0185:
        r1 = r4.fastMatchNewCountFetchInterval;
        if (r1 != 0) goto L_0x0190;
    L_0x0189:
        r1 = r5.fastMatchNewCountFetchInterval();
        if (r1 != 0) goto L_0x02b1;
    L_0x018f:
        goto L_0x019c;
    L_0x0190:
        r1 = r4.fastMatchNewCountFetchInterval;
        r3 = r5.fastMatchNewCountFetchInterval();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x02b1;
    L_0x019c:
        r1 = r4.fastMatchNewCountFetchIntervalWhileBoosting;
        if (r1 != 0) goto L_0x01a7;
    L_0x01a0:
        r1 = r5.fastMatchNewCountFetchIntervalWhileBoosting();
        if (r1 != 0) goto L_0x02b1;
    L_0x01a6:
        goto L_0x01b3;
    L_0x01a7:
        r1 = r4.fastMatchNewCountFetchIntervalWhileBoosting;
        r3 = r5.fastMatchNewCountFetchIntervalWhileBoosting();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x02b1;
    L_0x01b3:
        r1 = r4.fastMatchPillRangeThreshold;
        if (r1 != 0) goto L_0x01be;
    L_0x01b7:
        r1 = r5.fastMatchPillRangeThreshold();
        if (r1 != 0) goto L_0x02b1;
    L_0x01bd:
        goto L_0x01ca;
    L_0x01be:
        r1 = r4.fastMatchPillRangeThreshold;
        r3 = r5.fastMatchPillRangeThreshold();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x02b1;
    L_0x01ca:
        r1 = r4.fastMatchNotificationOptions;
        if (r1 != 0) goto L_0x01d5;
    L_0x01ce:
        r1 = r5.fastMatchNotificationOptions();
        if (r1 != 0) goto L_0x02b1;
    L_0x01d4:
        goto L_0x01e1;
    L_0x01d5:
        r1 = r4.fastMatchNotificationOptions;
        r3 = r5.fastMatchNotificationOptions();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x02b1;
    L_0x01e1:
        r1 = r4.fastMatchNotificationDefault;
        if (r1 != 0) goto L_0x01ec;
    L_0x01e5:
        r1 = r5.fastMatchNotificationDefault();
        if (r1 != 0) goto L_0x02b1;
    L_0x01eb:
        goto L_0x01f8;
    L_0x01ec:
        r1 = r4.fastMatchNotificationDefault;
        r3 = r5.fastMatchNotificationDefault();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x02b1;
    L_0x01f8:
        r1 = r4.fastMatchPollingMode;
        if (r1 != 0) goto L_0x0203;
    L_0x01fc:
        r1 = r5.fastMatchPollingMode();
        if (r1 != 0) goto L_0x02b1;
    L_0x0202:
        goto L_0x020f;
    L_0x0203:
        r1 = r4.fastMatchPollingMode;
        r3 = r5.fastMatchPollingMode();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x02b1;
    L_0x020f:
        r1 = r4.isTopPicksEnabled;
        if (r1 != 0) goto L_0x021a;
    L_0x0213:
        r1 = r5.isTopPicksEnabled();
        if (r1 != 0) goto L_0x02b1;
    L_0x0219:
        goto L_0x0226;
    L_0x021a:
        r1 = r4.isTopPicksEnabled;
        r3 = r5.isTopPicksEnabled();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x02b1;
    L_0x0226:
        r1 = r4.topPicksLocalDailyNotificationsEnabled;
        if (r1 != 0) goto L_0x0231;
    L_0x022a:
        r1 = r5.topPicksLocalDailyNotificationsEnabled();
        if (r1 != 0) goto L_0x02b1;
    L_0x0230:
        goto L_0x023d;
    L_0x0231:
        r1 = r4.topPicksLocalDailyNotificationsEnabled;
        r3 = r5.topPicksLocalDailyNotificationsEnabled();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x02b1;
    L_0x023d:
        r1 = r4.topPicksLocalNotificationMessage;
        if (r1 != 0) goto L_0x0248;
    L_0x0241:
        r1 = r5.topPicksLocalNotificationMessage();
        if (r1 != 0) goto L_0x02b1;
    L_0x0247:
        goto L_0x0254;
    L_0x0248:
        r1 = r4.topPicksLocalNotificationMessage;
        r3 = r5.topPicksLocalNotificationMessage();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x02b1;
    L_0x0254:
        r1 = r4.typingIndicatorConfig;
        if (r1 != 0) goto L_0x025f;
    L_0x0258:
        r1 = r5.typingIndicatorConfig();
        if (r1 != 0) goto L_0x02b1;
    L_0x025e:
        goto L_0x026b;
    L_0x025f:
        r1 = r4.typingIndicatorConfig;
        r3 = r5.typingIndicatorConfig();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x02b1;
    L_0x026b:
        r1 = r4.profileEditingConfig;
        if (r1 != 0) goto L_0x0276;
    L_0x026f:
        r1 = r5.profileEditingConfig();
        if (r1 != 0) goto L_0x02b1;
    L_0x0275:
        goto L_0x0282;
    L_0x0276:
        r1 = r4.profileEditingConfig;
        r3 = r5.profileEditingConfig();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x02b1;
    L_0x0282:
        r1 = r4.canEditEmail;
        if (r1 != 0) goto L_0x028d;
    L_0x0286:
        r1 = r5.canEditEmail();
        if (r1 != 0) goto L_0x02b1;
    L_0x028c:
        goto L_0x0299;
    L_0x028d:
        r1 = r4.canEditEmail;
        r3 = r5.canEditEmail();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x02b1;
    L_0x0299:
        r1 = r4.topPicksLocalDailyOffsets;
        if (r1 != 0) goto L_0x02a4;
    L_0x029d:
        r5 = r5.topPicksLocalDailyOffsets();
        if (r5 != 0) goto L_0x02b1;
    L_0x02a3:
        goto L_0x02b2;
    L_0x02a4:
        r1 = r4.topPicksLocalDailyOffsets;
        r5 = r5.topPicksLocalDailyOffsets();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x02b1;
    L_0x02b0:
        goto L_0x02b2;
    L_0x02b1:
        r0 = 0;
    L_0x02b2:
        return r0;
    L_0x02b3:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.meta.$AutoValue_Meta_Globals.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.boostIntroMultiplier ^ 1000003) * 1000003) ^ this.inviteType.hashCode()) * 1000003) ^ this.recsInterval) * 1000003) ^ this.updatesInterval) * 1000003) ^ this.recsSize) * 1000003) ^ this.matchmakerDefaultMessage.hashCode()) * 1000003) ^ this.shareDefaultText.hashCode()) * 1000003) ^ this.boostDecay) * 1000003) ^ this.boostUp) * 1000003) ^ this.boostDown) * 1000003) ^ (this.sparks ? 1231 : 1237)) * 1000003) ^ (this.kontagent ? 1231 : 1237)) * 1000003) ^ (this.kontagentEnabled ? 1231 : 1237)) * 1000003) ^ (this.mqtt ? 1231 : 1237)) * 1000003) ^ (this.tinderSparks ? 1231 : 1237)) * 1000003) ^ this.adSwipeInterval) * 1000003) ^ (this.fetchConnections ? 1231 : 1237)) * 1000003) ^ (this.fireboarding ? 1231 : 1237)) * 1000003) ^ (this.rateApp ? 1231 : 1237)) * 1000003) ^ this.superLikeAlcMode) * 1000003) ^ (this.plus ? 1231 : 1237)) * 1000003) ^ (this.superLike ? 1231 : 1237)) * 1000003) ^ (this.recsBlend ? 1231 : 1237)) * 1000003) ^ (this.squadsEnabled ? 1231 : 1237)) * 1000003) ^ this.squadsExtensionLength) * 1000003) ^ this.squadsExpirationNotice) * 1000003) ^ (this.photoPreviewEnabled ? 1231 : 1237)) * 1000003) ^ (this.photoOptimizerEnabled ? 1231 : 1237)) * 1000003) ^ (this.photoOptimizerHasResult ? 1231 : 1237)) * 1000003) ^ (this.discount ? 1231 : 1237)) * 1000003) ^ (this.boost ? 1231 : 1237)) * 1000003) ^ this.boostDuration) * 1000003) ^ (this.videoSwipeEnable ? 1231 : 1237)) * 1000003) ^ (this.selectEnable ? 1231 : 1237)) * 1000003) ^ (this.subscriptionExpired ? 1231 : 1237)) * 1000003) ^ (this.canEditJobs ? 1231 : 1237)) * 1000003) ^ (this.canEditSchools ? 1231 : 1237)) * 1000003) ^ (this.canShowCommonConnections ? 1231 : 1237)) * 1000003) ^ (this.canAddPhotosFromFacebook ? 1231 : 1237)) * 1000003;
        if (this.isIntroPricingEnabled) {
            i = 1231;
        }
        hashCode = (hashCode ^ i) * 1000003;
        i = 0;
        hashCode = (((((((((((((((((((((((((((hashCode ^ (this.isFastMatchEnabled == null ? 0 : this.isFastMatchEnabled.hashCode())) * 1000003) ^ (this.fastMatchPreviewMinTimeInMillis == null ? 0 : this.fastMatchPreviewMinTimeInMillis.hashCode())) * 1000003) ^ (this.fastMatchNewCountFetchInterval == null ? 0 : this.fastMatchNewCountFetchInterval.hashCode())) * 1000003) ^ (this.fastMatchNewCountFetchIntervalWhileBoosting == null ? 0 : this.fastMatchNewCountFetchIntervalWhileBoosting.hashCode())) * 1000003) ^ (this.fastMatchPillRangeThreshold == null ? 0 : this.fastMatchPillRangeThreshold.hashCode())) * 1000003) ^ (this.fastMatchNotificationOptions == null ? 0 : this.fastMatchNotificationOptions.hashCode())) * 1000003) ^ (this.fastMatchNotificationDefault == null ? 0 : this.fastMatchNotificationDefault.hashCode())) * 1000003) ^ (this.fastMatchPollingMode == null ? 0 : this.fastMatchPollingMode.hashCode())) * 1000003) ^ (this.isTopPicksEnabled == null ? 0 : this.isTopPicksEnabled.hashCode())) * 1000003) ^ (this.topPicksLocalDailyNotificationsEnabled == null ? 0 : this.topPicksLocalDailyNotificationsEnabled.hashCode())) * 1000003) ^ (this.topPicksLocalNotificationMessage == null ? 0 : this.topPicksLocalNotificationMessage.hashCode())) * 1000003) ^ (this.typingIndicatorConfig == null ? 0 : this.typingIndicatorConfig.hashCode())) * 1000003) ^ (this.profileEditingConfig == null ? 0 : this.profileEditingConfig.hashCode())) * 1000003) ^ (this.canEditEmail == null ? 0 : this.canEditEmail.hashCode())) * 1000003;
        if (this.topPicksLocalDailyOffsets != null) {
            i = this.topPicksLocalDailyOffsets.hashCode();
        }
        return hashCode ^ i;
    }
}
