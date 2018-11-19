package com.tinder.domain.profile.model;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.model.Subscription;
import com.tinder.domain.meta.model.BoostSettings;
import com.tinder.domain.meta.model.DiscoverySettings;
import com.tinder.domain.meta.model.PlusControlSettings;
import com.tinder.domain.meta.model.PlusControlSettings.Blend;
import com.tinder.domain.meta.model.PlusControlSettings.DiscoverableParty;
import com.tinder.domain.meta.model.SelectSettings;
import com.tinder.domain.meta.model.SpotifySettings;
import com.tinder.domain.profile.model.settings.PlacesSettings;
import com.tinder.domain.profile.model.settings.SmartPhotoSettings;
import com.tinder.domain.profile.model.settings.TopPhotoSettings;
import com.tinder.domain.profile.model.settings.WebProfileSettings;
import com.tinder.domain.settings.feed.model.FeedSettings;
import com.tinder.domain.settings.feed.model.FeedSharingOption;
import com.tinder.domain.settings.feed.model.FeedSharingType;
import com.tinder.domain.superlike.SuperlikeStatus;
import com.tinder.domain.tinderplus.LikeStatus;
import com.tinder.model.analytics.AnalyticsConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ak;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u0010*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u001b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0018\u0010\u0004\u001a\u0004\u0018\u00018\u0000X\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0001\u001a'()*+,-./0123456789:;<=>?@¨\u0006A"}, d2 = {"Lcom/tinder/domain/profile/model/ProfileOption;", "T", "", "()V", "defaultValue", "getDefaultValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "name", "", "getName", "()Ljava/lang/String;", "AccountInfo", "AccountSettings", "ActivityFeed", "Boost", "Companion", "Discovery", "EmailSettings", "Facebook", "Instagram", "Interests", "Likes", "Notifications", "Onboarding", "Passport", "Places", "PlusControl", "Products", "Purchase", "Select", "ShowGender", "SmartPhoto", "Spotify", "SuperLikes", "TopPhoto", "Tutorials", "User", "WebProfile", "Lcom/tinder/domain/profile/model/ProfileOption$User;", "Lcom/tinder/domain/profile/model/ProfileOption$PlusControl;", "Lcom/tinder/domain/profile/model/ProfileOption$Spotify;", "Lcom/tinder/domain/profile/model/ProfileOption$Boost;", "Lcom/tinder/domain/profile/model/ProfileOption$Select;", "Lcom/tinder/domain/profile/model/ProfileOption$Tutorials;", "Lcom/tinder/domain/profile/model/ProfileOption$Passport;", "Lcom/tinder/domain/profile/model/ProfileOption$Notifications;", "Lcom/tinder/domain/profile/model/ProfileOption$Purchase;", "Lcom/tinder/domain/profile/model/ProfileOption$Products;", "Lcom/tinder/domain/profile/model/ProfileOption$Likes;", "Lcom/tinder/domain/profile/model/ProfileOption$SuperLikes;", "Lcom/tinder/domain/profile/model/ProfileOption$Facebook;", "Lcom/tinder/domain/profile/model/ProfileOption$Instagram;", "Lcom/tinder/domain/profile/model/ProfileOption$ActivityFeed;", "Lcom/tinder/domain/profile/model/ProfileOption$Discovery;", "Lcom/tinder/domain/profile/model/ProfileOption$SmartPhoto;", "Lcom/tinder/domain/profile/model/ProfileOption$TopPhoto;", "Lcom/tinder/domain/profile/model/ProfileOption$AccountSettings;", "Lcom/tinder/domain/profile/model/ProfileOption$AccountInfo;", "Lcom/tinder/domain/profile/model/ProfileOption$WebProfile;", "Lcom/tinder/domain/profile/model/ProfileOption$Places;", "Lcom/tinder/domain/profile/model/ProfileOption$Interests;", "Lcom/tinder/domain/profile/model/ProfileOption$ShowGender;", "Lcom/tinder/domain/profile/model/ProfileOption$EmailSettings;", "Lcom/tinder/domain/profile/model/ProfileOption$Onboarding;", "domain_release"}, k = 1, mv = {1, 1, 10})
public abstract class ProfileOption<T> {
    @Deprecated
    public static final Companion Companion = new Companion();
    private static final com.tinder.domain.profile.model.settings.AccountSettings DEFAULT_ACCOUNT_SETTINGS = com.tinder.domain.profile.model.settings.AccountSettings.DEFAULT;
    private static final DiscoverySettings DEFAULT_DISCOVERY_SETTINGS = DiscoverySettings.builder().maxAgeFilter(55).minAgeFilter(18).isDiscoverable(true).distanceFilter(1).genderFilter(DiscoverySettings.DEFAULT_GENDER_FILTER).build();
    private static final com.tinder.domain.settings.email.model.EmailSettings DEFAULT_EMAIL_SETTINGS = com.tinder.domain.settings.email.model.EmailSettings.Companion.getDEFAULT();
    private static final FacebookInformation DEFAULT_FACEBOOK_INFORMATION = FacebookInformation.DEFAULT;
    private static final FeedSettings DEFAULT_FEED_SETTINGS = new FeedSettings(ak.a(new FeedSharingOption[]{new FeedSharingOption(FeedSharingType.SPOTIFY_TOP_ARTISTS, false), new FeedSharingOption(FeedSharingType.SPOTIFY_ANTHEM, false), new FeedSharingOption(FeedSharingType.PROFILE_PHOTOS, false)}));
    private static final Interests DEFAULT_INTERESTS = Interests.DEFAULT;
    private static final LikeStatus DEFAULT_LIKE_STATUS = LikeStatus.create(100, 0);
    private static final PlacesSettings DEFAULT_PLACES_SETTINGS = PlacesSettings.DEFAULT;
    private static final SmartPhotoSettings DEFAULT_SMART_PHOTO_SETTINGS = SmartPhotoSettings.DEFAULT;
    private static final Subscription DEFAULT_SUBSCRIPTION = new Subscription(null, false, false, null, 15, null);
    private static final SuperlikeStatus DEFAULT_SUPERLIKE_STATUS = SuperlikeStatus.builder().hasSuperlikes(false).millisUntilResetDate(0).remainingCount(0).resetDate(null).resetDateInMillis(0).refreshAmount(1).refreshInterval(SuperlikeStatus.DEFAULT_TIME_INTERVAL).build();
    private static final PlusControlSettings DEFAULT_TINDER_PLUS_SETTINGS = PlusControlSettings.builder().isHideDistance(false).isHideAds(false).isHideAge(false).discoverableParty(DiscoverableParty.EVERYONE).blend(Blend.OPTIMAL).build();
    private static final TopPhotoSettings DEFAULT_TOP_PHOTO_SETTINGS = TopPhotoSettings.DEFAULT;
    private static final Tutorials DEFAULT_TUTORIALS = new Tutorials(null, 1, null);
    private static final WebProfileSettings DEFAULT_WEB_PROFILE_SETTINGS = WebProfileSettings.DEFAULT;
    @Nullable
    private final T defaultValue;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0007*\u0004\u0018\u00010\u00110\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n \u0007*\u0004\u0018\u00010\u00190\u0019X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n \u0007*\u0004\u0018\u00010\u001b0\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/tinder/domain/profile/model/ProfileOption$Companion;", "", "()V", "DEFAULT_ACCOUNT_SETTINGS", "Lcom/tinder/domain/profile/model/settings/AccountSettings;", "DEFAULT_DISCOVERY_SETTINGS", "Lcom/tinder/domain/meta/model/DiscoverySettings;", "kotlin.jvm.PlatformType", "DEFAULT_EMAIL_SETTINGS", "Lcom/tinder/domain/settings/email/model/EmailSettings;", "DEFAULT_FACEBOOK_INFORMATION", "Lcom/tinder/domain/profile/model/FacebookInformation;", "DEFAULT_FEED_SETTINGS", "Lcom/tinder/domain/settings/feed/model/FeedSettings;", "DEFAULT_INTERESTS", "Lcom/tinder/domain/profile/model/Interests;", "DEFAULT_LIKE_STATUS", "Lcom/tinder/domain/tinderplus/LikeStatus;", "DEFAULT_PLACES_SETTINGS", "Lcom/tinder/domain/profile/model/settings/PlacesSettings;", "DEFAULT_SMART_PHOTO_SETTINGS", "Lcom/tinder/domain/profile/model/settings/SmartPhotoSettings;", "DEFAULT_SUBSCRIPTION", "Lcom/tinder/domain/common/model/Subscription;", "DEFAULT_SUPERLIKE_STATUS", "Lcom/tinder/domain/superlike/SuperlikeStatus;", "DEFAULT_TINDER_PLUS_SETTINGS", "Lcom/tinder/domain/meta/model/PlusControlSettings;", "DEFAULT_TOP_PHOTO_SETTINGS", "Lcom/tinder/domain/profile/model/settings/TopPhotoSettings;", "DEFAULT_TUTORIALS", "Lcom/tinder/domain/profile/model/Tutorials;", "DEFAULT_WEB_PROFILE_SETTINGS", "Lcom/tinder/domain/profile/model/settings/WebProfileSettings;", "domain_release"}, k = 1, mv = {1, 1, 10})
    private static final class Companion {
        private Companion() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005XD¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tinder/domain/profile/model/ProfileOption$AccountInfo;", "Lcom/tinder/domain/profile/model/ProfileOption;", "Lcom/tinder/domain/profile/model/AccountInformation;", "()V", "name", "", "getName", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class AccountInfo extends ProfileOption<AccountInformation> {
        public static final AccountInfo INSTANCE = new AccountInfo();
        @NotNull
        private static final String name = "accountinfo";

        private AccountInfo() {
            super();
        }

        @NotNull
        public String getName() {
            return name;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/profile/model/ProfileOption$AccountSettings;", "Lcom/tinder/domain/profile/model/ProfileOption;", "Lcom/tinder/domain/profile/model/settings/AccountSettings;", "()V", "defaultValue", "getDefaultValue", "()Lcom/tinder/domain/profile/model/settings/AccountSettings;", "name", "", "getName", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class AccountSettings extends ProfileOption<com.tinder.domain.profile.model.settings.AccountSettings> {
        public static final AccountSettings INSTANCE = new AccountSettings();
        @NotNull
        private static final com.tinder.domain.profile.model.settings.AccountSettings defaultValue = ProfileOption.DEFAULT_ACCOUNT_SETTINGS;
        @NotNull
        private static final String name = "accountsettings";

        private AccountSettings() {
            super();
        }

        @NotNull
        public String getName() {
            return name;
        }

        @NotNull
        public com.tinder.domain.profile.model.settings.AccountSettings getDefaultValue() {
            return defaultValue;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/profile/model/ProfileOption$ActivityFeed;", "Lcom/tinder/domain/profile/model/ProfileOption;", "Lcom/tinder/domain/settings/feed/model/FeedSettings;", "()V", "defaultValue", "getDefaultValue", "()Lcom/tinder/domain/settings/feed/model/FeedSettings;", "name", "", "getName", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class ActivityFeed extends ProfileOption<FeedSettings> {
        public static final ActivityFeed INSTANCE = new ActivityFeed();
        @NotNull
        private static final FeedSettings defaultValue = ProfileOption.DEFAULT_FEED_SETTINGS;

        @NotNull
        public String getName() {
            return "activityFeed";
        }

        private ActivityFeed() {
            super();
        }

        @NotNull
        public FeedSettings getDefaultValue() {
            return defaultValue;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tinder/domain/profile/model/ProfileOption$Boost;", "Lcom/tinder/domain/profile/model/ProfileOption;", "Lcom/tinder/domain/meta/model/BoostSettings;", "()V", "name", "", "getName", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Boost extends ProfileOption<BoostSettings> {
        public static final Boost INSTANCE = new Boost();

        @NotNull
        public String getName() {
            return ManagerWebServices.PARAM_BOOST;
        }

        private Boost() {
            super();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/profile/model/ProfileOption$Discovery;", "Lcom/tinder/domain/profile/model/ProfileOption;", "Lcom/tinder/domain/meta/model/DiscoverySettings;", "()V", "defaultValue", "getDefaultValue", "()Lcom/tinder/domain/meta/model/DiscoverySettings;", "name", "", "getName", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Discovery extends ProfileOption<DiscoverySettings> {
        public static final Discovery INSTANCE = new Discovery();
        @NotNull
        private static final DiscoverySettings defaultValue;
        @NotNull
        private static final String name = "discovery";

        static {
            DiscoverySettings access$getDEFAULT_DISCOVERY_SETTINGS$cp = ProfileOption.DEFAULT_DISCOVERY_SETTINGS;
            C2668g.a(access$getDEFAULT_DISCOVERY_SETTINGS$cp, "DEFAULT_DISCOVERY_SETTINGS");
            defaultValue = access$getDEFAULT_DISCOVERY_SETTINGS$cp;
        }

        private Discovery() {
            super();
        }

        @NotNull
        public String getName() {
            return name;
        }

        @NotNull
        public DiscoverySettings getDefaultValue() {
            return defaultValue;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/profile/model/ProfileOption$EmailSettings;", "Lcom/tinder/domain/profile/model/ProfileOption;", "Lcom/tinder/domain/settings/email/model/EmailSettings;", "()V", "defaultValue", "getDefaultValue", "()Lcom/tinder/domain/settings/email/model/EmailSettings;", "name", "", "getName", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class EmailSettings extends ProfileOption<com.tinder.domain.settings.email.model.EmailSettings> {
        public static final EmailSettings INSTANCE = new EmailSettings();
        @NotNull
        private static final com.tinder.domain.settings.email.model.EmailSettings defaultValue = ProfileOption.DEFAULT_EMAIL_SETTINGS;
        @NotNull
        private static final String name = "email_settings";

        private EmailSettings() {
            super();
        }

        @NotNull
        public String getName() {
            return name;
        }

        @NotNull
        public com.tinder.domain.settings.email.model.EmailSettings getDefaultValue() {
            return defaultValue;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/profile/model/ProfileOption$Facebook;", "Lcom/tinder/domain/profile/model/ProfileOption;", "Lcom/tinder/domain/profile/model/FacebookInformation;", "()V", "defaultValue", "getDefaultValue", "()Lcom/tinder/domain/profile/model/FacebookInformation;", "name", "", "getName", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Facebook extends ProfileOption<FacebookInformation> {
        public static final Facebook INSTANCE = new Facebook();
        @NotNull
        private static final FacebookInformation defaultValue = ProfileOption.DEFAULT_FACEBOOK_INFORMATION;

        @NotNull
        public String getName() {
            return AnalyticsConstants.VALUE_FACEBOOK;
        }

        private Facebook() {
            super();
        }

        @NotNull
        public FacebookInformation getDefaultValue() {
            return defaultValue;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\n \u0005*\u0004\u0018\u00010\u00020\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tinder/domain/profile/model/ProfileOption$Instagram;", "Lcom/tinder/domain/profile/model/ProfileOption;", "Lcom/tinder/domain/common/model/Instagram;", "()V", "defaultValue", "kotlin.jvm.PlatformType", "getDefaultValue", "()Lcom/tinder/domain/common/model/Instagram;", "name", "", "getName", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Instagram extends ProfileOption<com.tinder.domain.common.model.Instagram> {
        public static final Instagram INSTANCE = new Instagram();
        private static final com.tinder.domain.common.model.Instagram defaultValue = com.tinder.domain.common.model.Instagram.DISCONNECTED;

        @NotNull
        public String getName() {
            return ManagerWebServices.IG_PARAM_INSTAGRAM;
        }

        private Instagram() {
            super();
        }

        public com.tinder.domain.common.model.Instagram getDefaultValue() {
            return defaultValue;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/profile/model/ProfileOption$Interests;", "Lcom/tinder/domain/profile/model/ProfileOption;", "Lcom/tinder/domain/profile/model/Interests;", "()V", "defaultValue", "getDefaultValue", "()Lcom/tinder/domain/profile/model/Interests;", "name", "", "getName", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Interests extends ProfileOption<Interests> {
        public static final Interests INSTANCE = new Interests();
        @NotNull
        private static final Interests defaultValue = ProfileOption.DEFAULT_INTERESTS;
        @NotNull
        private static final String name = "interests";

        private Interests() {
            super();
        }

        @NotNull
        public String getName() {
            return name;
        }

        @NotNull
        public Interests getDefaultValue() {
            return defaultValue;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\n \u0005*\u0004\u0018\u00010\u00020\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tinder/domain/profile/model/ProfileOption$Likes;", "Lcom/tinder/domain/profile/model/ProfileOption;", "Lcom/tinder/domain/tinderplus/LikeStatus;", "()V", "defaultValue", "kotlin.jvm.PlatformType", "getDefaultValue", "()Lcom/tinder/domain/tinderplus/LikeStatus;", "name", "", "getName", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Likes extends ProfileOption<LikeStatus> {
        public static final Likes INSTANCE = new Likes();
        private static final LikeStatus defaultValue = ProfileOption.DEFAULT_LIKE_STATUS;

        @NotNull
        public String getName() {
            return ManagerWebServices.FB_PARAM_LIKES;
        }

        private Likes() {
            super();
        }

        public LikeStatus getDefaultValue() {
            return defaultValue;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tinder/domain/profile/model/ProfileOption$Notifications;", "Lcom/tinder/domain/profile/model/ProfileOption;", "", "", "()V", "name", "", "getName", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Notifications extends ProfileOption<List<? extends Object>> {
        public static final Notifications INSTANCE = new Notifications();

        @NotNull
        public String getName() {
            return ManagerWebServices.PARAM_NOTIFICATIONS;
        }

        private Notifications() {
            super();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/profile/model/ProfileOption$Onboarding;", "Lcom/tinder/domain/profile/model/ProfileOption;", "Lcom/tinder/domain/onboarding/Onboarding;", "()V", "defaultValue", "getDefaultValue", "()Lcom/tinder/domain/onboarding/Onboarding;", "name", "", "getName", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Onboarding extends ProfileOption<com.tinder.domain.onboarding.Onboarding> {
        public static final Onboarding INSTANCE = new Onboarding();
        @NotNull
        private static final com.tinder.domain.onboarding.Onboarding defaultValue = com.tinder.domain.onboarding.Onboarding.Companion.getDEFAULT();
        @NotNull
        private static final String name = "onboarding";

        private Onboarding() {
            super();
        }

        @NotNull
        public String getName() {
            return name;
        }

        @NotNull
        public com.tinder.domain.onboarding.Onboarding getDefaultValue() {
            return defaultValue;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tinder/domain/profile/model/ProfileOption$Passport;", "Lcom/tinder/domain/profile/model/ProfileOption;", "", "()V", "name", "", "getName", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Passport extends ProfileOption<Object> {
        public static final Passport INSTANCE = new Passport();

        @NotNull
        public String getName() {
            return "passport";
        }

        private Passport() {
            super();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/profile/model/ProfileOption$Places;", "Lcom/tinder/domain/profile/model/ProfileOption;", "Lcom/tinder/domain/profile/model/settings/PlacesSettings;", "()V", "defaultValue", "getDefaultValue", "()Lcom/tinder/domain/profile/model/settings/PlacesSettings;", "name", "", "getName", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Places extends ProfileOption<PlacesSettings> {
        public static final Places INSTANCE = new Places();
        @NotNull
        private static final PlacesSettings defaultValue = ProfileOption.DEFAULT_PLACES_SETTINGS;
        @NotNull
        private static final String name = "places";

        private Places() {
            super();
        }

        @NotNull
        public String getName() {
            return name;
        }

        @NotNull
        public PlacesSettings getDefaultValue() {
            return defaultValue;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/profile/model/ProfileOption$PlusControl;", "Lcom/tinder/domain/profile/model/ProfileOption;", "Lcom/tinder/domain/meta/model/PlusControlSettings;", "()V", "defaultValue", "getDefaultValue", "()Lcom/tinder/domain/meta/model/PlusControlSettings;", "name", "", "getName", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class PlusControl extends ProfileOption<PlusControlSettings> {
        public static final PlusControl INSTANCE = new PlusControl();
        @NotNull
        private static final PlusControlSettings defaultValue;

        @NotNull
        public String getName() {
            return "tinderPlusSettings";
        }

        static {
            PlusControlSettings access$getDEFAULT_TINDER_PLUS_SETTINGS$cp = ProfileOption.DEFAULT_TINDER_PLUS_SETTINGS;
            C2668g.a(access$getDEFAULT_TINDER_PLUS_SETTINGS$cp, "DEFAULT_TINDER_PLUS_SETTINGS");
            defaultValue = access$getDEFAULT_TINDER_PLUS_SETTINGS$cp;
        }

        private PlusControl() {
            super();
        }

        @NotNull
        public PlusControlSettings getDefaultValue() {
            return defaultValue;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tinder/domain/profile/model/ProfileOption$Products;", "Lcom/tinder/domain/profile/model/ProfileOption;", "Lcom/tinder/domain/profile/model/Products;", "()V", "name", "", "getName", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Products extends ProfileOption<Products> {
        public static final Products INSTANCE = new Products();

        @NotNull
        public String getName() {
            return ManagerWebServices.PARAM_PRODUCTS;
        }

        private Products() {
            super();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/profile/model/ProfileOption$Purchase;", "Lcom/tinder/domain/profile/model/ProfileOption;", "Lcom/tinder/domain/common/model/Subscription;", "()V", "defaultValue", "getDefaultValue", "()Lcom/tinder/domain/common/model/Subscription;", "name", "", "getName", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Purchase extends ProfileOption<Subscription> {
        public static final Purchase INSTANCE = new Purchase();
        @NotNull
        private static final Subscription defaultValue = ProfileOption.DEFAULT_SUBSCRIPTION;

        @NotNull
        public String getName() {
            return "purchase";
        }

        private Purchase() {
            super();
        }

        @NotNull
        public Subscription getDefaultValue() {
            return defaultValue;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tinder/domain/profile/model/ProfileOption$Select;", "Lcom/tinder/domain/profile/model/ProfileOption;", "Lcom/tinder/domain/meta/model/SelectSettings;", "()V", "name", "", "getName", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Select extends ProfileOption<SelectSettings> {
        public static final Select INSTANCE = new Select();

        @NotNull
        public String getName() {
            return "select";
        }

        private Select() {
            super();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/profile/model/ProfileOption$ShowGender;", "Lcom/tinder/domain/profile/model/ProfileOption;", "Lcom/tinder/domain/profile/model/GenderSettings;", "()V", "defaultValue", "getDefaultValue", "()Lcom/tinder/domain/profile/model/GenderSettings;", "name", "", "getName", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class ShowGender extends ProfileOption<GenderSettings> {
        public static final ShowGender INSTANCE = new ShowGender();
        @NotNull
        private static final GenderSettings defaultValue = GenderSettings.Companion.getDEFAULT();
        @NotNull
        private static final String name = "show_gender";

        private ShowGender() {
            super();
        }

        @NotNull
        public String getName() {
            return name;
        }

        @NotNull
        public GenderSettings getDefaultValue() {
            return defaultValue;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/profile/model/ProfileOption$SmartPhoto;", "Lcom/tinder/domain/profile/model/ProfileOption;", "Lcom/tinder/domain/profile/model/settings/SmartPhotoSettings;", "()V", "defaultValue", "getDefaultValue", "()Lcom/tinder/domain/profile/model/settings/SmartPhotoSettings;", "name", "", "getName", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class SmartPhoto extends ProfileOption<SmartPhotoSettings> {
        public static final SmartPhoto INSTANCE = new SmartPhoto();
        @NotNull
        private static final SmartPhotoSettings defaultValue = ProfileOption.DEFAULT_SMART_PHOTO_SETTINGS;
        @NotNull
        private static final String name = "smartphoto";

        private SmartPhoto() {
            super();
        }

        @NotNull
        public String getName() {
            return name;
        }

        @NotNull
        public SmartPhotoSettings getDefaultValue() {
            return defaultValue;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tinder/domain/profile/model/ProfileOption$Spotify;", "Lcom/tinder/domain/profile/model/ProfileOption;", "Lcom/tinder/domain/meta/model/SpotifySettings;", "()V", "name", "", "getName", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Spotify extends ProfileOption<SpotifySettings> {
        public static final Spotify INSTANCE = new Spotify();

        @NotNull
        public String getName() {
            return ManagerWebServices.PARAM_SPOTIFY;
        }

        private Spotify() {
            super();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\n \u0005*\u0004\u0018\u00010\u00020\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tinder/domain/profile/model/ProfileOption$SuperLikes;", "Lcom/tinder/domain/profile/model/ProfileOption;", "Lcom/tinder/domain/superlike/SuperlikeStatus;", "()V", "defaultValue", "kotlin.jvm.PlatformType", "getDefaultValue", "()Lcom/tinder/domain/superlike/SuperlikeStatus;", "name", "", "getName", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class SuperLikes extends ProfileOption<SuperlikeStatus> {
        public static final SuperLikes INSTANCE = new SuperLikes();
        private static final SuperlikeStatus defaultValue = ProfileOption.DEFAULT_SUPERLIKE_STATUS;

        @NotNull
        public String getName() {
            return "superLikes";
        }

        private SuperLikes() {
            super();
        }

        public SuperlikeStatus getDefaultValue() {
            return defaultValue;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/profile/model/ProfileOption$TopPhoto;", "Lcom/tinder/domain/profile/model/ProfileOption;", "Lcom/tinder/domain/profile/model/settings/TopPhotoSettings;", "()V", "defaultValue", "getDefaultValue", "()Lcom/tinder/domain/profile/model/settings/TopPhotoSettings;", "name", "", "getName", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class TopPhoto extends ProfileOption<TopPhotoSettings> {
        public static final TopPhoto INSTANCE = new TopPhoto();
        @NotNull
        private static final TopPhotoSettings defaultValue = ProfileOption.DEFAULT_TOP_PHOTO_SETTINGS;
        @NotNull
        private static final String name = "top_photo";

        private TopPhoto() {
            super();
        }

        @NotNull
        public String getName() {
            return name;
        }

        @NotNull
        public TopPhotoSettings getDefaultValue() {
            return defaultValue;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/profile/model/ProfileOption$Tutorials;", "Lcom/tinder/domain/profile/model/ProfileOption;", "Lcom/tinder/domain/profile/model/Tutorials;", "()V", "defaultValue", "getDefaultValue", "()Lcom/tinder/domain/profile/model/Tutorials;", "name", "", "getName", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Tutorials extends ProfileOption<Tutorials> {
        public static final Tutorials INSTANCE = new Tutorials();
        @NotNull
        private static final Tutorials defaultValue = ProfileOption.DEFAULT_TUTORIALS;

        @NotNull
        public String getName() {
            return ManagerWebServices.PARAM_TUTORIALS;
        }

        private Tutorials() {
            super();
        }

        @NotNull
        public Tutorials getDefaultValue() {
            return defaultValue;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tinder/domain/profile/model/ProfileOption$User;", "Lcom/tinder/domain/profile/model/ProfileOption;", "Lcom/tinder/domain/common/model/User;", "()V", "name", "", "getName", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class User extends ProfileOption<com.tinder.domain.common.model.User> {
        public static final User INSTANCE = new User();

        @NotNull
        public String getName() {
            return ManagerWebServices.PARAM_USER;
        }

        private User() {
            super();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/profile/model/ProfileOption$WebProfile;", "Lcom/tinder/domain/profile/model/ProfileOption;", "Lcom/tinder/domain/profile/model/settings/WebProfileSettings;", "()V", "defaultValue", "getDefaultValue", "()Lcom/tinder/domain/profile/model/settings/WebProfileSettings;", "name", "", "getName", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class WebProfile extends ProfileOption<WebProfileSettings> {
        public static final WebProfile INSTANCE = new WebProfile();
        @NotNull
        private static final WebProfileSettings defaultValue = ProfileOption.DEFAULT_WEB_PROFILE_SETTINGS;
        @NotNull
        private static final String name = "webprofile";

        private WebProfile() {
            super();
        }

        @NotNull
        public String getName() {
            return name;
        }

        @NotNull
        public WebProfileSettings getDefaultValue() {
            return defaultValue;
        }
    }

    @NotNull
    public abstract String getName();

    private ProfileOption() {
    }

    @Nullable
    public T getDefaultValue() {
        return this.defaultValue;
    }
}
