package com.tinder.api.model.meta;

import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.common.User;
import com.tinder.api.model.meta.AutoValue_Meta_AccountConfig.MoshiJsonAdapter;
import com.tinder.api.model.profile.Notification;
import com.tinder.api.model.profile.Products;
import com.tinder.api.model.profile.Purchase;
import com.tinder.api.model.profile.Rating;
import com.tinder.api.model.profile.Travel;
import java.util.List;
import java.util.Map;

public abstract class Meta {

    public static abstract class AccountConfig {
        @Nullable
        @Json(name = "needs_password")
        public abstract Boolean needPassword();

        public static JsonAdapter<AccountConfig> jsonAdapter(C5987p c5987p) {
            return new MoshiJsonAdapter(c5987p);
        }
    }

    public static abstract class ClientResources {

        public static abstract class RateCard {

            public static abstract class Carousel {
                public abstract String slug();

                public static JsonAdapter<Carousel> jsonAdapter(C5987p c5987p) {
                    return new AutoValue_Meta_ClientResources_RateCard_Carousel.MoshiJsonAdapter(c5987p);
                }
            }

            public abstract List<Carousel> carousel();

            public static JsonAdapter<RateCard> jsonAdapter(C5987p c5987p) {
                return new AutoValue_Meta_ClientResources_RateCard.MoshiJsonAdapter(c5987p);
            }
        }

        @Json(name = "plus_screen")
        public abstract List<String> plusScreen();

        @Json(name = "rate_card")
        public abstract RateCard rateCard();

        public static JsonAdapter<ClientResources> jsonAdapter(C5987p c5987p) {
            return new AutoValue_Meta_ClientResources.MoshiJsonAdapter(c5987p);
        }
    }

    public static abstract class Globals {
        @Json(name = "ad_swipe_interval")
        public abstract int adSwipeInterval();

        public abstract boolean boost();

        @Json(name = "boost_decay")
        public abstract int boostDecay();

        @Json(name = "boost_down")
        public abstract int boostDown();

        @Json(name = "boost_duration")
        public abstract int boostDuration();

        @Json(name = "boost_intro_multiplier")
        public abstract int boostIntroMultiplier();

        @Json(name = "boost_up")
        public abstract int boostUp();

        @Json(name = "can_add_photos_from_facebook")
        public abstract boolean canAddPhotosFromFacebook();

        @Nullable
        @Json(name = "can_edit_email")
        public abstract Boolean canEditEmail();

        @Json(name = "can_edit_jobs")
        public abstract boolean canEditJobs();

        @Json(name = "can_edit_schools")
        public abstract boolean canEditSchools();

        @Json(name = "can_show_common_connections")
        public abstract boolean canShowCommonConnections();

        public abstract boolean discount();

        @Nullable
        @Json(name = "fast_match_new_count_fetch_interval")
        public abstract Long fastMatchNewCountFetchInterval();

        @Nullable
        @Json(name = "fast_match_boost_new_count_fetch_interval")
        public abstract Long fastMatchNewCountFetchIntervalWhileBoosting();

        @Nullable
        @Json(name = "fast_match_notif_default")
        public abstract Integer fastMatchNotificationDefault();

        @Nullable
        @Json(name = "fast_match_notif_options")
        public abstract List<Integer> fastMatchNotificationOptions();

        @Nullable
        @Json(name = "fast_match_new_count_threshold")
        public abstract Integer fastMatchPillRangeThreshold();

        @Nullable
        @Json(name = "fast_match_polling_mode")
        public abstract Integer fastMatchPollingMode();

        @Nullable
        @Json(name = "fast_match_preview_minimum_time")
        public abstract Long fastMatchPreviewMinTimeInMillis();

        @Json(name = "fetch_connections")
        public abstract boolean fetchConnections();

        public abstract boolean fireboarding();

        @Json(name = "invite_type")
        public abstract String inviteType();

        @Nullable
        @Json(name = "fast_match")
        public abstract Boolean isFastMatchEnabled();

        @Json(name = "intro_pricing")
        public abstract boolean isIntroPricingEnabled();

        @Nullable
        @Json(name = "top_picks")
        public abstract Boolean isTopPicksEnabled();

        public abstract boolean kontagent();

        @Json(name = "kontagent_enabled")
        public abstract boolean kontagentEnabled();

        @Json(name = "matchmaker_default_message")
        public abstract String matchmakerDefaultMessage();

        public abstract boolean mqtt();

        @Json(name = "enable_feature_photo_optimizer")
        public abstract boolean photoOptimizerEnabled();

        @Json(name = "photo_optimizer_has_result")
        public abstract boolean photoOptimizerHasResult();

        @Json(name = "photo_preview_enabled")
        public abstract boolean photoPreviewEnabled();

        public abstract boolean plus();

        @Nullable
        @Json(name = "profile")
        public abstract ProfileEditingConfig profileEditingConfig();

        @Json(name = "rate_app")
        public abstract boolean rateApp();

        @Json(name = "recs_blend")
        public abstract boolean recsBlend();

        @Json(name = "recs_interval")
        public abstract int recsInterval();

        @Json(name = "recs_size")
        public abstract int recsSize();

        @Json(name = "select_enabled")
        public abstract boolean selectEnable();

        @Json(name = "share_default_text")
        public abstract String shareDefaultText();

        public abstract boolean sparks();

        @Json(name = "squads_enabled")
        public abstract boolean squadsEnabled();

        @Json(name = "squads_expiration_notice")
        public abstract int squadsExpirationNotice();

        @Json(name = "squads_extension_length")
        public abstract int squadsExtensionLength();

        @Json(name = "subscription_expired")
        public abstract boolean subscriptionExpired();

        @Json(name = "super_like")
        public abstract boolean superLike();

        @Json(name = "super_like_alc_mode")
        public abstract int superLikeAlcMode();

        @Json(name = "tinder_sparks")
        public abstract boolean tinderSparks();

        @Nullable
        @Json(name = "top_picks_local_daily_enabled")
        public abstract Boolean topPicksLocalDailyNotificationsEnabled();

        @Nullable
        @Json(name = "top_picks_local_daily_offsets")
        public abstract Map<String, Integer> topPicksLocalDailyOffsets();

        @Nullable
        @Json(name = "top_picks_local_daily_msg")
        public abstract String topPicksLocalNotificationMessage();

        @Nullable
        @Json(name = "typing_indicator")
        public abstract TypingIndicatorConfig typingIndicatorConfig();

        @Json(name = "updates_interval")
        public abstract int updatesInterval();

        @Json(name = "ad_rate_enabled")
        public abstract boolean videoSwipeEnable();

        public static JsonAdapter<Globals> jsonAdapter(C5987p c5987p) {
            return new AutoValue_Meta_Globals.MoshiJsonAdapter(c5987p);
        }
    }

    public static abstract class PlacesConfig {
        @Nullable
        @Json(name = "available")
        public abstract Boolean isAvailable();

        public static JsonAdapter<PlacesConfig> jsonAdapter(C5987p c5987p) {
            return new AutoValue_Meta_PlacesConfig.MoshiJsonAdapter(c5987p);
        }
    }

    public static abstract class ProfileEditingConfig {
        @Nullable
        @Json(name = "company_name_max_length")
        public abstract Integer companyNameMaxLength();

        @Nullable
        @Json(name = "job_title_max_length")
        public abstract Integer jobTitleMaxLength();

        @Nullable
        @Json(name = "school_name_max_length")
        public abstract Integer schoolNameMaxLength();

        public static JsonAdapter<ProfileEditingConfig> jsonAdapter(C5987p c5987p) {
            return new AutoValue_Meta_ProfileEditingConfig.MoshiJsonAdapter(c5987p);
        }
    }

    public static abstract class TypingIndicatorConfig {
        @Nullable
        @Json(name = "typing_heartbeat")
        public abstract Long typingHeartbeat();

        @Nullable
        @Json(name = "typing_ttl")
        public abstract Long typingTimeToLive();

        public static JsonAdapter<TypingIndicatorConfig> jsonAdapter(C5987p c5987p) {
            return new AutoValue_Meta_TypingIndicatorConfig.MoshiJsonAdapter(c5987p);
        }
    }

    public static abstract class Versions {
        @Json(name = "active_text")
        public abstract String activeText();

        @Json(name = "age_filter")
        public abstract String ageFilter();

        public abstract String matchmaker();

        public abstract String trending();

        @Json(name = "trending_active_text")
        public abstract String trendingActiveText();

        public static JsonAdapter<Versions> jsonAdapter(C5987p c5987p) {
            return new AutoValue_Meta_Versions.MoshiJsonAdapter(c5987p);
        }
    }

    @Nullable
    @Json(name = "account")
    public abstract AccountConfig accountConfig();

    @Json(name = "can_create_squad")
    public abstract boolean canCreateSquad();

    @Nullable
    @Json(name = "client_resources")
    public abstract ClientResources clientResources();

    @Nullable
    public abstract Globals globals();

    @Nullable
    public abstract List<Notification> notifications();

    @Nullable
    public abstract PlacesConfig places();

    @Nullable
    public abstract Products products();

    @Nullable
    public abstract List<Purchase> purchases();

    @Nullable
    public abstract Rating rating();

    @Nullable
    public abstract Integer status();

    @Nullable
    public abstract Travel travel();

    @Nullable
    public abstract List<String> tutorials();

    public abstract User user();

    @Nullable
    public abstract Versions versions();

    public static JsonAdapter<Meta> jsonAdapter(C5987p c5987p) {
        return new AutoValue_Meta.MoshiJsonAdapter(c5987p);
    }
}
