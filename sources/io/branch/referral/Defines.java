package io.branch.referral;

import com.tinder.api.ManagerWebServices;

public class Defines {

    public enum Jsonkey {
        IdentityID("identity_id"),
        Identity("identity"),
        DeviceFingerprintID("device_fingerprint_id"),
        SessionID("session_id"),
        LinkClickID("link_click_id"),
        GoogleSearchInstallReferrer("google_search_install_referrer"),
        GooglePlayInstallReferrer("install_referrer_extras"),
        ClickedReferrerTimeStamp("clicked_referrer_ts"),
        InstallBeginTimeStamp("install_begin_ts"),
        FaceBookAppLinkChecked("facebook_app_link_checked"),
        BranchLinkUsed("branch_used"),
        ReferringBranchIdentity("referring_branch_identity"),
        BranchIdentity("branch_identity"),
        BranchKey("branch_key"),
        BranchData("branch_data"),
        Bucket("bucket"),
        DefaultBucket("default"),
        Amount(ManagerWebServices.PARAM_AMOUNT),
        CalculationType("calculation_type"),
        Location("location"),
        Type("type"),
        CreationSource("creation_source"),
        Prefix("prefix"),
        Expiration("expiration"),
        Event("event"),
        Metadata("metadata"),
        CommerceData("commerce_data"),
        ReferralCode("referral_code"),
        Total("total"),
        Unique("unique"),
        Length("length"),
        Direction("direction"),
        BeginAfterID("begin_after_id"),
        Link(ManagerWebServices.IG_PARAM_LINK),
        ReferringData("referring_data"),
        ReferringLink("referring_link"),
        IsFullAppConv("is_full_app_conversion"),
        Data(ManagerWebServices.FB_DATA),
        OS("os"),
        HardwareID("hardware_id"),
        AndroidID("android_id"),
        UnidentifiedDevice("unidentified_device"),
        HardwareIDType("hardware_id_type"),
        HardwareIDTypeVendor("vendor_id"),
        HardwareIDTypeRandom("random"),
        IsHardwareIDReal("is_hardware_id_real"),
        AppVersion("app_version"),
        OSVersion("os_version"),
        Country(ManagerWebServices.PARAM_COUNTRY),
        Language("language"),
        IsReferrable("is_referrable"),
        Update("update"),
        OriginalInstallTime("first_install_time"),
        FirstInstallTime("latest_install_time"),
        LastUpdateTime("latest_update_time"),
        PreviousUpdateTime("previous_update_time"),
        URIScheme("uri_scheme"),
        AppIdentifier("app_identifier"),
        LinkIdentifier("link_identifier"),
        GoogleAdvertisingID("google_advertising_id"),
        AAID("aaid"),
        LATVal("lat_val"),
        LimitedAdTracking("limit_ad_tracking"),
        limitFacebookTracking("limit_facebook_tracking"),
        Debug("debug"),
        Brand("brand"),
        Model("model"),
        ScreenDpi("screen_dpi"),
        ScreenHeight("screen_height"),
        ScreenWidth("screen_width"),
        WiFi("wifi"),
        LocalIP("local_ip"),
        UserData("user_data"),
        DeveloperIdentity("developer_identity"),
        UserAgent("user_agent"),
        SDK("sdk"),
        SdkVersion("sdk_version"),
        UIMode("ui_mode"),
        Clicked_Branch_Link(ManagerWebServices.PARAM_CLICK_BRANCH_LINK),
        IsFirstSession(ManagerWebServices.PARAM_IS_FIRST_SESSION),
        AndroidDeepLinkPath("$android_deeplink_path"),
        DeepLinkPath(ManagerWebServices.PARAM_DEEPLINK_PATH),
        AndroidAppLinkURL("android_app_link_url"),
        AndroidPushNotificationKey("branch"),
        AndroidPushIdentifier("push_identifier"),
        ForceNewBranchSession("branch_force_new_session"),
        CanonicalIdentifier("$canonical_identifier"),
        ContentTitle("$og_title"),
        ContentDesc("$og_description"),
        ContentImgUrl("$og_image_url"),
        CanonicalUrl("$canonical_url"),
        ContentType("$content_type"),
        PublicallyIndexable("$publicly_indexable"),
        LocallyIndexable("$locally_indexable"),
        ContentKeyWords("$keywords"),
        ContentExpiryTime("$exp_date"),
        Params("params"),
        SharedLink("$shared_link"),
        ShareError("$share_error"),
        External_Intent_URI("external_intent_uri"),
        External_Intent_Extra("external_intent_extra"),
        Last_Round_Trip_Time("lrtt"),
        Branch_Round_Trip_Time("brtt"),
        Branch_Instrumentation("instrumentation"),
        Queue_Wait_Time("qwt"),
        InstantDeepLinkSession("instant_dl_session"),
        BranchViewData("branch_view_data"),
        BranchViewID("id"),
        BranchViewAction("action"),
        BranchViewNumOfUse("number_of_use"),
        BranchViewUrl("url"),
        BranchViewHtml("html"),
        Path("path"),
        ViewList("view_list"),
        ContentActionView("view"),
        ContentPath("content_path"),
        ContentNavPath("content_nav_path"),
        ReferralLink("referral_link"),
        ContentData("content_data"),
        ContentEvents("events"),
        ContentAnalyticsMode("content_analytics_mode"),
        ContentDiscovery("cd"),
        Environment("environment"),
        InstantApp("INSTANT_APP"),
        NativeApp("FULL_APP"),
        TransactionID("transaction_id"),
        Currency("currency"),
        Revenue("revenue"),
        Shipping("shipping"),
        Tax("tax"),
        Coupon("coupon"),
        Affiliation("affiliation"),
        Description(ManagerWebServices.PARAM_BADGE_DESC),
        SearchQuery("search_query"),
        Name("name"),
        CustomData("custom_data"),
        EventData("event_data"),
        ContentItems("content_items"),
        ContentSchema("$content_schema"),
        Price("$price"),
        PriceCurrency("$currency"),
        Quantity("$quantity"),
        SKU("$sku"),
        ProductName("$product_name"),
        ProductBrand("$product_brand"),
        ProductCategory("$product_category"),
        ProductVariant("$product_variant"),
        Rating("$rating"),
        RatingAverage("$rating_average"),
        RatingCount("$rating_count"),
        RatingMax("$rating_max"),
        AddressStreet("$address_street"),
        AddressCity("$address_city"),
        AddressRegion("$address_region"),
        AddressCountry("$address_country"),
        AddressPostalCode("$address_postal_code"),
        Latitude("$latitude"),
        Longitude("$longitude"),
        ImageCaptions("$image_captions"),
        Condition("$condition"),
        CreationTimestamp("$creation_timestamp"),
        TrackingDisabled("tracking_disabled");
        
        private String key;

        private Jsonkey(String str) {
            this.key = "";
            this.key = str;
        }

        public String getKey() {
            return this.key;
        }

        public String toString() {
            return this.key;
        }
    }

    public enum LinkParam {
        Tags("tags"),
        Alias("alias"),
        Type("type"),
        Duration(ManagerWebServices.PARAM_DURATION),
        Channel("channel"),
        Feature("feature"),
        Stage("stage"),
        Campaign(ManagerWebServices.PARAM_DISCOUNT_CAMPAIGN),
        Data(ManagerWebServices.FB_DATA),
        URL("url");
        
        private String key;

        private LinkParam(String str) {
            this.key = "";
            this.key = str;
        }

        public String getKey() {
            return this.key;
        }

        public String toString() {
            return this.key;
        }
    }

    public enum RequestPath {
        RedeemRewards("v1/redeem"),
        GetURL("v1/url"),
        RegisterInstall("v1/install"),
        RegisterClose("v1/close"),
        RegisterOpen("v1/open"),
        RegisterView("v1/register-view"),
        GetCredits("v1/credits/"),
        GetCreditHistory("v1/credithistory"),
        CompletedAction("v1/event"),
        IdentifyUser("v1/profile"),
        Logout("v1/logout"),
        GetReferralCode("v1/referralcode"),
        ValidateReferralCode("v1/referralcode/"),
        ApplyReferralCode("v1/applycode/"),
        DebugConnect("v1/debug/connect"),
        ContentEvent("v1/content-events"),
        TrackStandardEvent("v2/event/standard"),
        TrackCustomEvent("v2/event/custom");
        
        private String key;

        private RequestPath(String str) {
            this.key = "";
            this.key = str;
        }

        public String getPath() {
            return this.key;
        }

        public String toString() {
            return this.key;
        }
    }
}
