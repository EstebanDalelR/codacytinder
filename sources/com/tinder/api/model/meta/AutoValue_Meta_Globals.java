package com.tinder.api.model.meta;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.C5992r;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.meta.Meta.Globals;
import com.tinder.api.model.meta.Meta.ProfileEditingConfig;
import com.tinder.api.model.meta.Meta.TypingIndicatorConfig;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

final class AutoValue_Meta_Globals extends C$AutoValue_Meta_Globals {

    public static final class MoshiJsonAdapter extends JsonAdapter<Globals> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_BOOST_INTRO_MULTIPLIER, "invite_type", ManagerWebServices.PARAM_RECS_INTERVAL, ManagerWebServices.PARAM_UPDATES_INTERVAL, "recs_size", "matchmaker_default_message", "share_default_text", "boost_decay", "boost_up", "boost_down", "sparks", "kontagent", "kontagent_enabled", "mqtt", "tinder_sparks", ManagerWebServices.PARAM_AD_SWIPE_INTERVAL, ManagerWebServices.PARAM_FETCH_CONNECTIONS, "fireboarding", ManagerWebServices.PARAM_RATE_APP, ManagerWebServices.PARAM_SUPERLIKE_ALC_MODE, "plus", "super_like", ManagerWebServices.PARAM_RECS_BLEND, "squads_enabled", ManagerWebServices.PARAM_SQUADS_EXTENSION_LENGTH, ManagerWebServices.PARAM_SQUADS_EXPIRATION_NOTICE, ManagerWebServices.PARAM_PHOTO_PREVIEW_ENABLED, ManagerWebServices.PARAM_PHOTO_OPTIMIZED_FEATURE_ENABLED, ManagerWebServices.PARAM_PHOTO_OPTIMIZED_RESULTS, ManagerWebServices.PARAM_DISCOUNT, ManagerWebServices.PARAM_BOOST, ManagerWebServices.PARAM_BOOST_DURATION, ManagerWebServices.PARAM_VIDEO_BPC, ManagerWebServices.PARAM_SELECT_ENABLED, ManagerWebServices.PARAM_SUBSCRIPTION_EXPIRED, ManagerWebServices.PARAM_CAN_EDIT_JOBS, ManagerWebServices.PARAM_CAN_EDIT_SCHOOLS, ManagerWebServices.PARAM_CAN_SHOW_COMMON_CONNECTIONS, ManagerWebServices.PARAM_CAN_ADD_PHOTOS_FROM_FACEBOOK, "intro_pricing", "fast_match", "fast_match_preview_minimum_time", "fast_match_new_count_fetch_interval", "fast_match_boost_new_count_fetch_interval", "fast_match_new_count_threshold", "fast_match_notif_options", "fast_match_notif_default", "fast_match_polling_mode", "top_picks", "top_picks_local_daily_enabled", "top_picks_local_daily_msg", "typing_indicator", "profile", "can_edit_email", "top_picks_local_daily_offsets"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Integer> adSwipeIntervalAdapter;
        private final JsonAdapter<Boolean> boostAdapter;
        private final JsonAdapter<Integer> boostDecayAdapter;
        private final JsonAdapter<Integer> boostDownAdapter;
        private final JsonAdapter<Integer> boostDurationAdapter;
        private final JsonAdapter<Integer> boostIntroMultiplierAdapter;
        private final JsonAdapter<Integer> boostUpAdapter;
        private final JsonAdapter<Boolean> canAddPhotosFromFacebookAdapter;
        private final JsonAdapter<Boolean> canEditEmailAdapter;
        private final JsonAdapter<Boolean> canEditJobsAdapter;
        private final JsonAdapter<Boolean> canEditSchoolsAdapter;
        private final JsonAdapter<Boolean> canShowCommonConnectionsAdapter;
        private final JsonAdapter<Boolean> discountAdapter;
        private final JsonAdapter<Long> fastMatchNewCountFetchIntervalAdapter;
        private final JsonAdapter<Long> fastMatchNewCountFetchIntervalWhileBoostingAdapter;
        private final JsonAdapter<Integer> fastMatchNotificationDefaultAdapter;
        private final JsonAdapter<List<Integer>> fastMatchNotificationOptionsAdapter;
        private final JsonAdapter<Integer> fastMatchPillRangeThresholdAdapter;
        private final JsonAdapter<Integer> fastMatchPollingModeAdapter;
        private final JsonAdapter<Long> fastMatchPreviewMinTimeInMillisAdapter;
        private final JsonAdapter<Boolean> fetchConnectionsAdapter;
        private final JsonAdapter<Boolean> fireboardingAdapter;
        private final JsonAdapter<String> inviteTypeAdapter;
        private final JsonAdapter<Boolean> isFastMatchEnabledAdapter;
        private final JsonAdapter<Boolean> isIntroPricingEnabledAdapter;
        private final JsonAdapter<Boolean> isTopPicksEnabledAdapter;
        private final JsonAdapter<Boolean> kontagentAdapter;
        private final JsonAdapter<Boolean> kontagentEnabledAdapter;
        private final JsonAdapter<String> matchmakerDefaultMessageAdapter;
        private final JsonAdapter<Boolean> mqttAdapter;
        private final JsonAdapter<Boolean> photoOptimizerEnabledAdapter;
        private final JsonAdapter<Boolean> photoOptimizerHasResultAdapter;
        private final JsonAdapter<Boolean> photoPreviewEnabledAdapter;
        private final JsonAdapter<Boolean> plusAdapter;
        private final JsonAdapter<ProfileEditingConfig> profileEditingConfigAdapter;
        private final JsonAdapter<Boolean> rateAppAdapter;
        private final JsonAdapter<Boolean> recsBlendAdapter;
        private final JsonAdapter<Integer> recsIntervalAdapter;
        private final JsonAdapter<Integer> recsSizeAdapter;
        private final JsonAdapter<Boolean> selectEnableAdapter;
        private final JsonAdapter<String> shareDefaultTextAdapter;
        private final JsonAdapter<Boolean> sparksAdapter;
        private final JsonAdapter<Boolean> squadsEnabledAdapter;
        private final JsonAdapter<Integer> squadsExpirationNoticeAdapter;
        private final JsonAdapter<Integer> squadsExtensionLengthAdapter;
        private final JsonAdapter<Boolean> subscriptionExpiredAdapter;
        private final JsonAdapter<Boolean> superLikeAdapter;
        private final JsonAdapter<Integer> superLikeAlcModeAdapter;
        private final JsonAdapter<Boolean> tinderSparksAdapter;
        private final JsonAdapter<Boolean> topPicksLocalDailyNotificationsEnabledAdapter;
        private final JsonAdapter<Map<String, Integer>> topPicksLocalDailyOffsetsAdapter;
        private final JsonAdapter<String> topPicksLocalNotificationMessageAdapter;
        private final JsonAdapter<TypingIndicatorConfig> typingIndicatorConfigAdapter;
        private final JsonAdapter<Integer> updatesIntervalAdapter;
        private final JsonAdapter<Boolean> videoSwipeEnableAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.boostIntroMultiplierAdapter = c5987p.a(Integer.TYPE);
            this.inviteTypeAdapter = c5987p.a(String.class);
            this.recsIntervalAdapter = c5987p.a(Integer.TYPE);
            this.updatesIntervalAdapter = c5987p.a(Integer.TYPE);
            this.recsSizeAdapter = c5987p.a(Integer.TYPE);
            this.matchmakerDefaultMessageAdapter = c5987p.a(String.class);
            this.shareDefaultTextAdapter = c5987p.a(String.class);
            this.boostDecayAdapter = c5987p.a(Integer.TYPE);
            this.boostUpAdapter = c5987p.a(Integer.TYPE);
            this.boostDownAdapter = c5987p.a(Integer.TYPE);
            this.sparksAdapter = c5987p.a(Boolean.TYPE);
            this.kontagentAdapter = c5987p.a(Boolean.TYPE);
            this.kontagentEnabledAdapter = c5987p.a(Boolean.TYPE);
            this.mqttAdapter = c5987p.a(Boolean.TYPE);
            this.tinderSparksAdapter = c5987p.a(Boolean.TYPE);
            this.adSwipeIntervalAdapter = c5987p.a(Integer.TYPE);
            this.fetchConnectionsAdapter = c5987p.a(Boolean.TYPE);
            this.fireboardingAdapter = c5987p.a(Boolean.TYPE);
            this.rateAppAdapter = c5987p.a(Boolean.TYPE);
            this.superLikeAlcModeAdapter = c5987p.a(Integer.TYPE);
            this.plusAdapter = c5987p.a(Boolean.TYPE);
            this.superLikeAdapter = c5987p.a(Boolean.TYPE);
            this.recsBlendAdapter = c5987p.a(Boolean.TYPE);
            this.squadsEnabledAdapter = c5987p.a(Boolean.TYPE);
            this.squadsExtensionLengthAdapter = c5987p.a(Integer.TYPE);
            this.squadsExpirationNoticeAdapter = c5987p.a(Integer.TYPE);
            this.photoPreviewEnabledAdapter = c5987p.a(Boolean.TYPE);
            this.photoOptimizerEnabledAdapter = c5987p.a(Boolean.TYPE);
            this.photoOptimizerHasResultAdapter = c5987p.a(Boolean.TYPE);
            this.discountAdapter = c5987p.a(Boolean.TYPE);
            this.boostAdapter = c5987p.a(Boolean.TYPE);
            this.boostDurationAdapter = c5987p.a(Integer.TYPE);
            this.videoSwipeEnableAdapter = c5987p.a(Boolean.TYPE);
            this.selectEnableAdapter = c5987p.a(Boolean.TYPE);
            this.subscriptionExpiredAdapter = c5987p.a(Boolean.TYPE);
            this.canEditJobsAdapter = c5987p.a(Boolean.TYPE);
            this.canEditSchoolsAdapter = c5987p.a(Boolean.TYPE);
            this.canShowCommonConnectionsAdapter = c5987p.a(Boolean.TYPE);
            this.canAddPhotosFromFacebookAdapter = c5987p.a(Boolean.TYPE);
            this.isIntroPricingEnabledAdapter = c5987p.a(Boolean.TYPE);
            this.isFastMatchEnabledAdapter = c5987p.a(Boolean.class);
            this.fastMatchPreviewMinTimeInMillisAdapter = c5987p.a(Long.class);
            this.fastMatchNewCountFetchIntervalAdapter = c5987p.a(Long.class);
            this.fastMatchNewCountFetchIntervalWhileBoostingAdapter = c5987p.a(Long.class);
            this.fastMatchPillRangeThresholdAdapter = c5987p.a(Integer.class);
            this.fastMatchNotificationOptionsAdapter = c5987p.a(C5992r.a(List.class, new Type[]{Integer.class}));
            this.fastMatchNotificationDefaultAdapter = c5987p.a(Integer.class);
            this.fastMatchPollingModeAdapter = c5987p.a(Integer.class);
            this.isTopPicksEnabledAdapter = c5987p.a(Boolean.class);
            this.topPicksLocalDailyNotificationsEnabledAdapter = c5987p.a(Boolean.class);
            this.topPicksLocalNotificationMessageAdapter = c5987p.a(String.class);
            this.typingIndicatorConfigAdapter = c5987p.a(TypingIndicatorConfig.class);
            this.profileEditingConfigAdapter = c5987p.a(ProfileEditingConfig.class);
            this.canEditEmailAdapter = c5987p.a(Boolean.class);
            this.topPicksLocalDailyOffsetsAdapter = c5987p.a(C5992r.a(Map.class, new Type[]{String.class, Integer.class}));
        }

        public Globals fromJson(JsonReader jsonReader) throws IOException {
            MoshiJsonAdapter moshiJsonAdapter = this;
            JsonReader jsonReader2 = jsonReader;
            jsonReader.e();
            String str = null;
            String str2 = str;
            String str3 = str2;
            Boolean bool = str3;
            Long l = bool;
            Long l2 = l;
            Long l3 = l2;
            Integer num = l3;
            List list = num;
            Integer num2 = list;
            Integer num3 = num2;
            Boolean bool2 = num3;
            Boolean bool3 = bool2;
            String str4 = bool3;
            TypingIndicatorConfig typingIndicatorConfig = str4;
            ProfileEditingConfig profileEditingConfig = typingIndicatorConfig;
            Boolean bool4 = profileEditingConfig;
            Map map = bool4;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            int i8 = 0;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            int i9 = 0;
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            int i10 = 0;
            int i11 = 0;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            boolean z17 = false;
            int i12 = 0;
            boolean z18 = false;
            boolean z19 = false;
            boolean z20 = false;
            boolean z21 = false;
            boolean z22 = false;
            boolean z23 = false;
            boolean z24 = false;
            boolean z25 = false;
            while (jsonReader.g()) {
                switch (jsonReader2.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        i = ((Integer) moshiJsonAdapter.boostIntroMultiplierAdapter.fromJson(jsonReader2)).intValue();
                        break;
                    case 1:
                        str = (String) moshiJsonAdapter.inviteTypeAdapter.fromJson(jsonReader2);
                        break;
                    case 2:
                        i2 = ((Integer) moshiJsonAdapter.recsIntervalAdapter.fromJson(jsonReader2)).intValue();
                        break;
                    case 3:
                        i3 = ((Integer) moshiJsonAdapter.updatesIntervalAdapter.fromJson(jsonReader2)).intValue();
                        break;
                    case 4:
                        i4 = ((Integer) moshiJsonAdapter.recsSizeAdapter.fromJson(jsonReader2)).intValue();
                        break;
                    case 5:
                        str2 = (String) moshiJsonAdapter.matchmakerDefaultMessageAdapter.fromJson(jsonReader2);
                        break;
                    case 6:
                        str3 = (String) moshiJsonAdapter.shareDefaultTextAdapter.fromJson(jsonReader2);
                        break;
                    case 7:
                        i5 = ((Integer) moshiJsonAdapter.boostDecayAdapter.fromJson(jsonReader2)).intValue();
                        break;
                    case 8:
                        i6 = ((Integer) moshiJsonAdapter.boostUpAdapter.fromJson(jsonReader2)).intValue();
                        break;
                    case 9:
                        i7 = ((Integer) moshiJsonAdapter.boostDownAdapter.fromJson(jsonReader2)).intValue();
                        break;
                    case 10:
                        z = ((Boolean) moshiJsonAdapter.sparksAdapter.fromJson(jsonReader2)).booleanValue();
                        break;
                    case 11:
                        z2 = ((Boolean) moshiJsonAdapter.kontagentAdapter.fromJson(jsonReader2)).booleanValue();
                        break;
                    case 12:
                        z3 = ((Boolean) moshiJsonAdapter.kontagentEnabledAdapter.fromJson(jsonReader2)).booleanValue();
                        break;
                    case 13:
                        z4 = ((Boolean) moshiJsonAdapter.mqttAdapter.fromJson(jsonReader2)).booleanValue();
                        break;
                    case 14:
                        z5 = ((Boolean) moshiJsonAdapter.tinderSparksAdapter.fromJson(jsonReader2)).booleanValue();
                        break;
                    case 15:
                        i8 = ((Integer) moshiJsonAdapter.adSwipeIntervalAdapter.fromJson(jsonReader2)).intValue();
                        break;
                    case 16:
                        z6 = ((Boolean) moshiJsonAdapter.fetchConnectionsAdapter.fromJson(jsonReader2)).booleanValue();
                        break;
                    case 17:
                        z7 = ((Boolean) moshiJsonAdapter.fireboardingAdapter.fromJson(jsonReader2)).booleanValue();
                        break;
                    case 18:
                        z8 = ((Boolean) moshiJsonAdapter.rateAppAdapter.fromJson(jsonReader2)).booleanValue();
                        break;
                    case 19:
                        i9 = ((Integer) moshiJsonAdapter.superLikeAlcModeAdapter.fromJson(jsonReader2)).intValue();
                        break;
                    case 20:
                        z9 = ((Boolean) moshiJsonAdapter.plusAdapter.fromJson(jsonReader2)).booleanValue();
                        break;
                    case 21:
                        z10 = ((Boolean) moshiJsonAdapter.superLikeAdapter.fromJson(jsonReader2)).booleanValue();
                        break;
                    case 22:
                        z11 = ((Boolean) moshiJsonAdapter.recsBlendAdapter.fromJson(jsonReader2)).booleanValue();
                        break;
                    case 23:
                        z12 = ((Boolean) moshiJsonAdapter.squadsEnabledAdapter.fromJson(jsonReader2)).booleanValue();
                        break;
                    case 24:
                        i10 = ((Integer) moshiJsonAdapter.squadsExtensionLengthAdapter.fromJson(jsonReader2)).intValue();
                        break;
                    case 25:
                        i11 = ((Integer) moshiJsonAdapter.squadsExpirationNoticeAdapter.fromJson(jsonReader2)).intValue();
                        break;
                    case 26:
                        z13 = ((Boolean) moshiJsonAdapter.photoPreviewEnabledAdapter.fromJson(jsonReader2)).booleanValue();
                        break;
                    case 27:
                        z14 = ((Boolean) moshiJsonAdapter.photoOptimizerEnabledAdapter.fromJson(jsonReader2)).booleanValue();
                        break;
                    case 28:
                        z15 = ((Boolean) moshiJsonAdapter.photoOptimizerHasResultAdapter.fromJson(jsonReader2)).booleanValue();
                        break;
                    case 29:
                        z16 = ((Boolean) moshiJsonAdapter.discountAdapter.fromJson(jsonReader2)).booleanValue();
                        break;
                    case 30:
                        z17 = ((Boolean) moshiJsonAdapter.boostAdapter.fromJson(jsonReader2)).booleanValue();
                        break;
                    case 31:
                        i12 = ((Integer) moshiJsonAdapter.boostDurationAdapter.fromJson(jsonReader2)).intValue();
                        break;
                    case 32:
                        z18 = ((Boolean) moshiJsonAdapter.videoSwipeEnableAdapter.fromJson(jsonReader2)).booleanValue();
                        break;
                    case 33:
                        z19 = ((Boolean) moshiJsonAdapter.selectEnableAdapter.fromJson(jsonReader2)).booleanValue();
                        break;
                    case 34:
                        z20 = ((Boolean) moshiJsonAdapter.subscriptionExpiredAdapter.fromJson(jsonReader2)).booleanValue();
                        break;
                    case 35:
                        z21 = ((Boolean) moshiJsonAdapter.canEditJobsAdapter.fromJson(jsonReader2)).booleanValue();
                        break;
                    case 36:
                        z22 = ((Boolean) moshiJsonAdapter.canEditSchoolsAdapter.fromJson(jsonReader2)).booleanValue();
                        break;
                    case 37:
                        z23 = ((Boolean) moshiJsonAdapter.canShowCommonConnectionsAdapter.fromJson(jsonReader2)).booleanValue();
                        break;
                    case 38:
                        z24 = ((Boolean) moshiJsonAdapter.canAddPhotosFromFacebookAdapter.fromJson(jsonReader2)).booleanValue();
                        break;
                    case 39:
                        z25 = ((Boolean) moshiJsonAdapter.isIntroPricingEnabledAdapter.fromJson(jsonReader2)).booleanValue();
                        break;
                    case 40:
                        bool = (Boolean) moshiJsonAdapter.isFastMatchEnabledAdapter.fromJson(jsonReader2);
                        break;
                    case 41:
                        l = (Long) moshiJsonAdapter.fastMatchPreviewMinTimeInMillisAdapter.fromJson(jsonReader2);
                        break;
                    case 42:
                        l2 = (Long) moshiJsonAdapter.fastMatchNewCountFetchIntervalAdapter.fromJson(jsonReader2);
                        break;
                    case 43:
                        l3 = (Long) moshiJsonAdapter.fastMatchNewCountFetchIntervalWhileBoostingAdapter.fromJson(jsonReader2);
                        break;
                    case 44:
                        num = (Integer) moshiJsonAdapter.fastMatchPillRangeThresholdAdapter.fromJson(jsonReader2);
                        break;
                    case 45:
                        list = (List) moshiJsonAdapter.fastMatchNotificationOptionsAdapter.fromJson(jsonReader2);
                        break;
                    case 46:
                        num2 = (Integer) moshiJsonAdapter.fastMatchNotificationDefaultAdapter.fromJson(jsonReader2);
                        break;
                    case 47:
                        num3 = (Integer) moshiJsonAdapter.fastMatchPollingModeAdapter.fromJson(jsonReader2);
                        break;
                    case 48:
                        bool2 = (Boolean) moshiJsonAdapter.isTopPicksEnabledAdapter.fromJson(jsonReader2);
                        break;
                    case 49:
                        bool3 = (Boolean) moshiJsonAdapter.topPicksLocalDailyNotificationsEnabledAdapter.fromJson(jsonReader2);
                        break;
                    case 50:
                        str4 = (String) moshiJsonAdapter.topPicksLocalNotificationMessageAdapter.fromJson(jsonReader2);
                        break;
                    case 51:
                        typingIndicatorConfig = (TypingIndicatorConfig) moshiJsonAdapter.typingIndicatorConfigAdapter.fromJson(jsonReader2);
                        break;
                    case 52:
                        profileEditingConfig = (ProfileEditingConfig) moshiJsonAdapter.profileEditingConfigAdapter.fromJson(jsonReader2);
                        break;
                    case 53:
                        bool4 = (Boolean) moshiJsonAdapter.canEditEmailAdapter.fromJson(jsonReader2);
                        break;
                    case 54:
                        map = (Map) moshiJsonAdapter.topPicksLocalDailyOffsetsAdapter.fromJson(jsonReader2);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Meta_Globals(i, str, i2, i3, i4, str2, str3, i5, i6, i7, z, z2, z3, z4, z5, i8, z6, z7, z8, i9, z9, z10, z11, z12, i10, i11, z13, z14, z15, z16, z17, i12, z18, z19, z20, z21, z22, z23, z24, z25, bool, l, l2, l3, num, list, num2, num3, bool2, bool3, str4, typingIndicatorConfig, profileEditingConfig, bool4, map);
        }

        public void toJson(C5983k c5983k, Globals globals) throws IOException {
            c5983k.c();
            c5983k.b(ManagerWebServices.PARAM_BOOST_INTRO_MULTIPLIER);
            this.boostIntroMultiplierAdapter.toJson(c5983k, Integer.valueOf(globals.boostIntroMultiplier()));
            c5983k.b("invite_type");
            this.inviteTypeAdapter.toJson(c5983k, globals.inviteType());
            c5983k.b(ManagerWebServices.PARAM_RECS_INTERVAL);
            this.recsIntervalAdapter.toJson(c5983k, Integer.valueOf(globals.recsInterval()));
            c5983k.b(ManagerWebServices.PARAM_UPDATES_INTERVAL);
            this.updatesIntervalAdapter.toJson(c5983k, Integer.valueOf(globals.updatesInterval()));
            c5983k.b("recs_size");
            this.recsSizeAdapter.toJson(c5983k, Integer.valueOf(globals.recsSize()));
            c5983k.b("matchmaker_default_message");
            this.matchmakerDefaultMessageAdapter.toJson(c5983k, globals.matchmakerDefaultMessage());
            c5983k.b("share_default_text");
            this.shareDefaultTextAdapter.toJson(c5983k, globals.shareDefaultText());
            c5983k.b("boost_decay");
            this.boostDecayAdapter.toJson(c5983k, Integer.valueOf(globals.boostDecay()));
            c5983k.b("boost_up");
            this.boostUpAdapter.toJson(c5983k, Integer.valueOf(globals.boostUp()));
            c5983k.b("boost_down");
            this.boostDownAdapter.toJson(c5983k, Integer.valueOf(globals.boostDown()));
            c5983k.b("sparks");
            this.sparksAdapter.toJson(c5983k, Boolean.valueOf(globals.sparks()));
            c5983k.b("kontagent");
            this.kontagentAdapter.toJson(c5983k, Boolean.valueOf(globals.kontagent()));
            c5983k.b("kontagent_enabled");
            this.kontagentEnabledAdapter.toJson(c5983k, Boolean.valueOf(globals.kontagentEnabled()));
            c5983k.b("mqtt");
            this.mqttAdapter.toJson(c5983k, Boolean.valueOf(globals.mqtt()));
            c5983k.b("tinder_sparks");
            this.tinderSparksAdapter.toJson(c5983k, Boolean.valueOf(globals.tinderSparks()));
            c5983k.b(ManagerWebServices.PARAM_AD_SWIPE_INTERVAL);
            this.adSwipeIntervalAdapter.toJson(c5983k, Integer.valueOf(globals.adSwipeInterval()));
            c5983k.b(ManagerWebServices.PARAM_FETCH_CONNECTIONS);
            this.fetchConnectionsAdapter.toJson(c5983k, Boolean.valueOf(globals.fetchConnections()));
            c5983k.b("fireboarding");
            this.fireboardingAdapter.toJson(c5983k, Boolean.valueOf(globals.fireboarding()));
            c5983k.b(ManagerWebServices.PARAM_RATE_APP);
            this.rateAppAdapter.toJson(c5983k, Boolean.valueOf(globals.rateApp()));
            c5983k.b(ManagerWebServices.PARAM_SUPERLIKE_ALC_MODE);
            this.superLikeAlcModeAdapter.toJson(c5983k, Integer.valueOf(globals.superLikeAlcMode()));
            c5983k.b("plus");
            this.plusAdapter.toJson(c5983k, Boolean.valueOf(globals.plus()));
            c5983k.b("super_like");
            this.superLikeAdapter.toJson(c5983k, Boolean.valueOf(globals.superLike()));
            c5983k.b(ManagerWebServices.PARAM_RECS_BLEND);
            this.recsBlendAdapter.toJson(c5983k, Boolean.valueOf(globals.recsBlend()));
            c5983k.b("squads_enabled");
            this.squadsEnabledAdapter.toJson(c5983k, Boolean.valueOf(globals.squadsEnabled()));
            c5983k.b(ManagerWebServices.PARAM_SQUADS_EXTENSION_LENGTH);
            this.squadsExtensionLengthAdapter.toJson(c5983k, Integer.valueOf(globals.squadsExtensionLength()));
            c5983k.b(ManagerWebServices.PARAM_SQUADS_EXPIRATION_NOTICE);
            this.squadsExpirationNoticeAdapter.toJson(c5983k, Integer.valueOf(globals.squadsExpirationNotice()));
            c5983k.b(ManagerWebServices.PARAM_PHOTO_PREVIEW_ENABLED);
            this.photoPreviewEnabledAdapter.toJson(c5983k, Boolean.valueOf(globals.photoPreviewEnabled()));
            c5983k.b(ManagerWebServices.PARAM_PHOTO_OPTIMIZED_FEATURE_ENABLED);
            this.photoOptimizerEnabledAdapter.toJson(c5983k, Boolean.valueOf(globals.photoOptimizerEnabled()));
            c5983k.b(ManagerWebServices.PARAM_PHOTO_OPTIMIZED_RESULTS);
            this.photoOptimizerHasResultAdapter.toJson(c5983k, Boolean.valueOf(globals.photoOptimizerHasResult()));
            c5983k.b(ManagerWebServices.PARAM_DISCOUNT);
            this.discountAdapter.toJson(c5983k, Boolean.valueOf(globals.discount()));
            c5983k.b(ManagerWebServices.PARAM_BOOST);
            this.boostAdapter.toJson(c5983k, Boolean.valueOf(globals.boost()));
            c5983k.b(ManagerWebServices.PARAM_BOOST_DURATION);
            this.boostDurationAdapter.toJson(c5983k, Integer.valueOf(globals.boostDuration()));
            c5983k.b(ManagerWebServices.PARAM_VIDEO_BPC);
            this.videoSwipeEnableAdapter.toJson(c5983k, Boolean.valueOf(globals.videoSwipeEnable()));
            c5983k.b(ManagerWebServices.PARAM_SELECT_ENABLED);
            this.selectEnableAdapter.toJson(c5983k, Boolean.valueOf(globals.selectEnable()));
            c5983k.b(ManagerWebServices.PARAM_SUBSCRIPTION_EXPIRED);
            this.subscriptionExpiredAdapter.toJson(c5983k, Boolean.valueOf(globals.subscriptionExpired()));
            c5983k.b(ManagerWebServices.PARAM_CAN_EDIT_JOBS);
            this.canEditJobsAdapter.toJson(c5983k, Boolean.valueOf(globals.canEditJobs()));
            c5983k.b(ManagerWebServices.PARAM_CAN_EDIT_SCHOOLS);
            this.canEditSchoolsAdapter.toJson(c5983k, Boolean.valueOf(globals.canEditSchools()));
            c5983k.b(ManagerWebServices.PARAM_CAN_SHOW_COMMON_CONNECTIONS);
            this.canShowCommonConnectionsAdapter.toJson(c5983k, Boolean.valueOf(globals.canShowCommonConnections()));
            c5983k.b(ManagerWebServices.PARAM_CAN_ADD_PHOTOS_FROM_FACEBOOK);
            this.canAddPhotosFromFacebookAdapter.toJson(c5983k, Boolean.valueOf(globals.canAddPhotosFromFacebook()));
            c5983k.b("intro_pricing");
            this.isIntroPricingEnabledAdapter.toJson(c5983k, Boolean.valueOf(globals.isIntroPricingEnabled()));
            Boolean isFastMatchEnabled = globals.isFastMatchEnabled();
            if (isFastMatchEnabled != null) {
                c5983k.b("fast_match");
                this.isFastMatchEnabledAdapter.toJson(c5983k, isFastMatchEnabled);
            }
            Long fastMatchPreviewMinTimeInMillis = globals.fastMatchPreviewMinTimeInMillis();
            if (fastMatchPreviewMinTimeInMillis != null) {
                c5983k.b("fast_match_preview_minimum_time");
                this.fastMatchPreviewMinTimeInMillisAdapter.toJson(c5983k, fastMatchPreviewMinTimeInMillis);
            }
            fastMatchPreviewMinTimeInMillis = globals.fastMatchNewCountFetchInterval();
            if (fastMatchPreviewMinTimeInMillis != null) {
                c5983k.b("fast_match_new_count_fetch_interval");
                this.fastMatchNewCountFetchIntervalAdapter.toJson(c5983k, fastMatchPreviewMinTimeInMillis);
            }
            fastMatchPreviewMinTimeInMillis = globals.fastMatchNewCountFetchIntervalWhileBoosting();
            if (fastMatchPreviewMinTimeInMillis != null) {
                c5983k.b("fast_match_boost_new_count_fetch_interval");
                this.fastMatchNewCountFetchIntervalWhileBoostingAdapter.toJson(c5983k, fastMatchPreviewMinTimeInMillis);
            }
            Integer fastMatchPillRangeThreshold = globals.fastMatchPillRangeThreshold();
            if (fastMatchPillRangeThreshold != null) {
                c5983k.b("fast_match_new_count_threshold");
                this.fastMatchPillRangeThresholdAdapter.toJson(c5983k, fastMatchPillRangeThreshold);
            }
            List fastMatchNotificationOptions = globals.fastMatchNotificationOptions();
            if (fastMatchNotificationOptions != null) {
                c5983k.b("fast_match_notif_options");
                this.fastMatchNotificationOptionsAdapter.toJson(c5983k, fastMatchNotificationOptions);
            }
            fastMatchPillRangeThreshold = globals.fastMatchNotificationDefault();
            if (fastMatchPillRangeThreshold != null) {
                c5983k.b("fast_match_notif_default");
                this.fastMatchNotificationDefaultAdapter.toJson(c5983k, fastMatchPillRangeThreshold);
            }
            fastMatchPillRangeThreshold = globals.fastMatchPollingMode();
            if (fastMatchPillRangeThreshold != null) {
                c5983k.b("fast_match_polling_mode");
                this.fastMatchPollingModeAdapter.toJson(c5983k, fastMatchPillRangeThreshold);
            }
            isFastMatchEnabled = globals.isTopPicksEnabled();
            if (isFastMatchEnabled != null) {
                c5983k.b("top_picks");
                this.isTopPicksEnabledAdapter.toJson(c5983k, isFastMatchEnabled);
            }
            isFastMatchEnabled = globals.topPicksLocalDailyNotificationsEnabled();
            if (isFastMatchEnabled != null) {
                c5983k.b("top_picks_local_daily_enabled");
                this.topPicksLocalDailyNotificationsEnabledAdapter.toJson(c5983k, isFastMatchEnabled);
            }
            String topPicksLocalNotificationMessage = globals.topPicksLocalNotificationMessage();
            if (topPicksLocalNotificationMessage != null) {
                c5983k.b("top_picks_local_daily_msg");
                this.topPicksLocalNotificationMessageAdapter.toJson(c5983k, topPicksLocalNotificationMessage);
            }
            TypingIndicatorConfig typingIndicatorConfig = globals.typingIndicatorConfig();
            if (typingIndicatorConfig != null) {
                c5983k.b("typing_indicator");
                this.typingIndicatorConfigAdapter.toJson(c5983k, typingIndicatorConfig);
            }
            ProfileEditingConfig profileEditingConfig = globals.profileEditingConfig();
            if (profileEditingConfig != null) {
                c5983k.b("profile");
                this.profileEditingConfigAdapter.toJson(c5983k, profileEditingConfig);
            }
            isFastMatchEnabled = globals.canEditEmail();
            if (isFastMatchEnabled != null) {
                c5983k.b("can_edit_email");
                this.canEditEmailAdapter.toJson(c5983k, isFastMatchEnabled);
            }
            globals = globals.topPicksLocalDailyOffsets();
            if (globals != null) {
                c5983k.b("top_picks_local_daily_offsets");
                this.topPicksLocalDailyOffsetsAdapter.toJson(c5983k, globals);
            }
            c5983k.d();
        }
    }

    AutoValue_Meta_Globals(int i, String str, int i2, int i3, int i4, String str2, String str3, int i5, int i6, int i7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i8, boolean z6, boolean z7, boolean z8, int i9, boolean z9, boolean z10, boolean z11, boolean z12, int i10, int i11, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i12, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, Boolean bool, Long l, Long l2, Long l3, Integer num, List<Integer> list, Integer num2, Integer num3, Boolean bool2, Boolean bool3, String str4, TypingIndicatorConfig typingIndicatorConfig, ProfileEditingConfig profileEditingConfig, Boolean bool4, Map<String, Integer> map) {
        super(i, str, i2, i3, i4, str2, str3, i5, i6, i7, z, z2, z3, z4, z5, i8, z6, z7, z8, i9, z9, z10, z11, z12, i10, i11, z13, z14, z15, z16, z17, i12, z18, z19, z20, z21, z22, z23, z24, z25, bool, l, l2, l3, num, list, num2, num3, bool2, bool3, str4, typingIndicatorConfig, profileEditingConfig, bool4, map);
    }
}
