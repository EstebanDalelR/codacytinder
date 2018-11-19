package com.tinder.api.model.profile;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.squareup.moshi.Json;
import com.tinder.api.model.common.Instagram;
import com.tinder.api.model.common.TinderSelect;
import com.tinder.api.model.common.User;
import com.tinder.api.model.meta.SuperLikes;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 i2\u00020\u0001:\u0001iBõ\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0001\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010&\u0012\n\b\u0001\u0010'\u001a\u0004\u0018\u00010(¢\u0006\u0002\u0010)J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010 HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\"HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010$HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010&HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010(HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010^\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0011\u0010`\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\rHÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0014HÆ\u0003Jù\u0001\u0010b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0003\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0010\b\u0003\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0003\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0003\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0003\u0010'\u001a\u0004\u0018\u00010(HÆ\u0001J\u0013\u0010c\u001a\u00020d2\b\u0010e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010f\u001a\u00020gHÖ\u0001J\t\u0010h\u001a\u00020\u000eHÖ\u0001R\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010%\u001a\u0004\u0018\u00010&¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010'\u001a\u0004\u0018\u00010(¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0013\u0010#\u001a\u0004\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\bL\u00107R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bM\u0010N¨\u0006j"}, d2 = {"Lcom/tinder/api/model/profile/ProfileV2Response;", "", "user", "Lcom/tinder/api/model/common/User;", "plusSettings", "Lcom/tinder/api/model/profile/PlusControl;", "spotify", "Lcom/tinder/api/model/profile/Spotify;", "boost", "Lcom/tinder/api/model/profile/ProfileBoost;", "select", "Lcom/tinder/api/model/common/TinderSelect;", "tutorials", "", "", "travel", "Lcom/tinder/api/model/profile/Travel;", "notifications", "Lcom/tinder/api/model/profile/Notification;", "purchase", "Lcom/tinder/api/model/profile/PurchaseResponse;", "products", "Lcom/tinder/api/model/profile/Products;", "likes", "Lcom/tinder/api/model/profile/Likes;", "superLikes", "Lcom/tinder/api/model/meta/SuperLikes;", "facebook", "Lcom/tinder/api/model/profile/Facebook;", "instagram", "Lcom/tinder/api/model/common/Instagram;", "activityFeedSettings", "Lcom/tinder/api/model/profile/ActivityFeedSettings;", "placesSettings", "Lcom/tinder/api/model/profile/PlacesSettings;", "topPhoto", "Lcom/tinder/api/model/profile/TopPhoto;", "emailSettings", "Lcom/tinder/api/model/profile/EmailSettings;", "onboarding", "Lcom/tinder/api/model/profile/Onboarding;", "(Lcom/tinder/api/model/common/User;Lcom/tinder/api/model/profile/PlusControl;Lcom/tinder/api/model/profile/Spotify;Lcom/tinder/api/model/profile/ProfileBoost;Lcom/tinder/api/model/common/TinderSelect;Ljava/util/List;Lcom/tinder/api/model/profile/Travel;Ljava/util/List;Lcom/tinder/api/model/profile/PurchaseResponse;Lcom/tinder/api/model/profile/Products;Lcom/tinder/api/model/profile/Likes;Lcom/tinder/api/model/meta/SuperLikes;Lcom/tinder/api/model/profile/Facebook;Lcom/tinder/api/model/common/Instagram;Lcom/tinder/api/model/profile/ActivityFeedSettings;Lcom/tinder/api/model/profile/PlacesSettings;Lcom/tinder/api/model/profile/TopPhoto;Lcom/tinder/api/model/profile/EmailSettings;Lcom/tinder/api/model/profile/Onboarding;)V", "getActivityFeedSettings", "()Lcom/tinder/api/model/profile/ActivityFeedSettings;", "getBoost", "()Lcom/tinder/api/model/profile/ProfileBoost;", "getEmailSettings", "()Lcom/tinder/api/model/profile/EmailSettings;", "getFacebook", "()Lcom/tinder/api/model/profile/Facebook;", "getInstagram", "()Lcom/tinder/api/model/common/Instagram;", "getLikes", "()Lcom/tinder/api/model/profile/Likes;", "getNotifications", "()Ljava/util/List;", "getOnboarding", "()Lcom/tinder/api/model/profile/Onboarding;", "getPlacesSettings", "()Lcom/tinder/api/model/profile/PlacesSettings;", "getPlusSettings", "()Lcom/tinder/api/model/profile/PlusControl;", "getProducts", "()Lcom/tinder/api/model/profile/Products;", "getPurchase", "()Lcom/tinder/api/model/profile/PurchaseResponse;", "getSelect", "()Lcom/tinder/api/model/common/TinderSelect;", "getSpotify", "()Lcom/tinder/api/model/profile/Spotify;", "getSuperLikes", "()Lcom/tinder/api/model/meta/SuperLikes;", "getTopPhoto", "()Lcom/tinder/api/model/profile/TopPhoto;", "getTravel", "()Lcom/tinder/api/model/profile/Travel;", "getTutorials", "getUser", "()Lcom/tinder/api/model/common/User;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "api_release"}, k = 1, mv = {1, 1, 10})
public final class ProfileV2Response {
    public static final Companion Companion = new Companion();
    @Nullable
    private final ActivityFeedSettings activityFeedSettings;
    @Nullable
    private final ProfileBoost boost;
    @Nullable
    private final EmailSettings emailSettings;
    @Nullable
    private final Facebook facebook;
    @Nullable
    private final Instagram instagram;
    @Nullable
    private final Likes likes;
    @Nullable
    private final List<Notification> notifications;
    @Nullable
    private final Onboarding onboarding;
    @Nullable
    private final PlacesSettings placesSettings;
    @Nullable
    private final PlusControl plusSettings;
    @Nullable
    private final Products products;
    @Nullable
    private final PurchaseResponse purchase;
    @Nullable
    private final TinderSelect select;
    @Nullable
    private final Spotify spotify;
    @Nullable
    private final SuperLikes superLikes;
    @Nullable
    private final TopPhoto topPhoto;
    @Nullable
    private final Travel travel;
    @Nullable
    private final List<String> tutorials;
    @Nullable
    private final User user;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jø\u0001\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00102\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+H\u0007¨\u0006,"}, d2 = {"Lcom/tinder/api/model/profile/ProfileV2Response$Companion;", "", "()V", "newInstance", "Lcom/tinder/api/model/profile/ProfileV2Response;", "user", "Lcom/tinder/api/model/common/User;", "plusSettings", "Lcom/tinder/api/model/profile/PlusControl;", "spotify", "Lcom/tinder/api/model/profile/Spotify;", "boost", "Lcom/tinder/api/model/profile/ProfileBoost;", "select", "Lcom/tinder/api/model/common/TinderSelect;", "tutorials", "", "", "travel", "Lcom/tinder/api/model/profile/Travel;", "notifications", "Lcom/tinder/api/model/profile/Notification;", "purchase", "Lcom/tinder/api/model/profile/PurchaseResponse;", "products", "Lcom/tinder/api/model/profile/Products;", "likes", "Lcom/tinder/api/model/profile/Likes;", "superLikes", "Lcom/tinder/api/model/meta/SuperLikes;", "facebook", "Lcom/tinder/api/model/profile/Facebook;", "instagram", "Lcom/tinder/api/model/common/Instagram;", "activityFeedSettings", "Lcom/tinder/api/model/profile/ActivityFeedSettings;", "placesSettings", "Lcom/tinder/api/model/profile/PlacesSettings;", "topPhoto", "Lcom/tinder/api/model/profile/TopPhoto;", "emailSettings", "Lcom/tinder/api/model/profile/EmailSettings;", "onboarding", "Lcom/tinder/api/model/profile/Onboarding;", "api_release"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @NotNull
        public static /* synthetic */ ProfileV2Response newInstance$default(Companion companion, User user, PlusControl plusControl, Spotify spotify, ProfileBoost profileBoost, TinderSelect tinderSelect, List list, Travel travel, List list2, PurchaseResponse purchaseResponse, Products products, Likes likes, SuperLikes superLikes, Facebook facebook, Instagram instagram, ActivityFeedSettings activityFeedSettings, PlacesSettings placesSettings, TopPhoto topPhoto, EmailSettings emailSettings, Onboarding onboarding, int i, Object obj) {
            int i2 = i;
            return companion.newInstance((i2 & 1) != 0 ? (User) null : user, (i2 & 2) != 0 ? (PlusControl) null : plusControl, (i2 & 4) != 0 ? (Spotify) null : spotify, (i2 & 8) != 0 ? (ProfileBoost) null : profileBoost, (i2 & 16) != 0 ? (TinderSelect) null : tinderSelect, (i2 & 32) != 0 ? (List) null : list, (i2 & 64) != 0 ? (Travel) null : travel, (i2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? (List) null : list2, (i2 & 256) != 0 ? (PurchaseResponse) null : purchaseResponse, (i2 & 512) != 0 ? (Products) null : products, (i2 & 1024) != 0 ? (Likes) null : likes, (i2 & ItemAnimator.FLAG_MOVED) != 0 ? (SuperLikes) null : superLikes, (i2 & 4096) != 0 ? (Facebook) null : facebook, (i2 & 8192) != 0 ? (Instagram) null : instagram, (i2 & 16384) != 0 ? (ActivityFeedSettings) null : activityFeedSettings, (32768 & i2) != 0 ? (PlacesSettings) null : placesSettings, (65536 & i2) != 0 ? (TopPhoto) null : topPhoto, (131072 & i2) != 0 ? (EmailSettings) null : emailSettings, (i2 & 262144) != 0 ? (Onboarding) null : onboarding);
        }

        @JvmStatic
        @NotNull
        public final ProfileV2Response newInstance(@Nullable User user, @Nullable PlusControl plusControl, @Nullable Spotify spotify, @Nullable ProfileBoost profileBoost, @Nullable TinderSelect tinderSelect, @Nullable List<String> list, @Nullable Travel travel, @Nullable List<? extends Notification> list2, @Nullable PurchaseResponse purchaseResponse, @Nullable Products products, @Nullable Likes likes, @Nullable SuperLikes superLikes, @Nullable Facebook facebook, @Nullable Instagram instagram, @Nullable ActivityFeedSettings activityFeedSettings, @Nullable PlacesSettings placesSettings, @Nullable TopPhoto topPhoto, @Nullable EmailSettings emailSettings, @Nullable Onboarding onboarding) {
            return new ProfileV2Response(user, plusControl, spotify, profileBoost, tinderSelect, list, travel, list2, purchaseResponse, products, likes, superLikes, facebook, instagram, activityFeedSettings, placesSettings, topPhoto, emailSettings, onboarding);
        }
    }

    @NotNull
    public static /* synthetic */ ProfileV2Response copy$default(ProfileV2Response profileV2Response, User user, PlusControl plusControl, Spotify spotify, ProfileBoost profileBoost, TinderSelect tinderSelect, List list, Travel travel, List list2, PurchaseResponse purchaseResponse, Products products, Likes likes, SuperLikes superLikes, Facebook facebook, Instagram instagram, ActivityFeedSettings activityFeedSettings, PlacesSettings placesSettings, TopPhoto topPhoto, EmailSettings emailSettings, Onboarding onboarding, int i, Object obj) {
        ActivityFeedSettings activityFeedSettings2;
        PlacesSettings placesSettings2;
        ProfileV2Response profileV2Response2 = profileV2Response;
        int i2 = i;
        User user2 = (i2 & 1) != 0 ? profileV2Response2.user : user;
        PlusControl plusControl2 = (i2 & 2) != 0 ? profileV2Response2.plusSettings : plusControl;
        Spotify spotify2 = (i2 & 4) != 0 ? profileV2Response2.spotify : spotify;
        ProfileBoost profileBoost2 = (i2 & 8) != 0 ? profileV2Response2.boost : profileBoost;
        TinderSelect tinderSelect2 = (i2 & 16) != 0 ? profileV2Response2.select : tinderSelect;
        List list3 = (i2 & 32) != 0 ? profileV2Response2.tutorials : list;
        Travel travel2 = (i2 & 64) != 0 ? profileV2Response2.travel : travel;
        List list4 = (i2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? profileV2Response2.notifications : list2;
        PurchaseResponse purchaseResponse2 = (i2 & 256) != 0 ? profileV2Response2.purchase : purchaseResponse;
        Products products2 = (i2 & 512) != 0 ? profileV2Response2.products : products;
        Likes likes2 = (i2 & 1024) != 0 ? profileV2Response2.likes : likes;
        SuperLikes superLikes2 = (i2 & ItemAnimator.FLAG_MOVED) != 0 ? profileV2Response2.superLikes : superLikes;
        Facebook facebook2 = (i2 & 4096) != 0 ? profileV2Response2.facebook : facebook;
        Instagram instagram2 = (i2 & 8192) != 0 ? profileV2Response2.instagram : instagram;
        ActivityFeedSettings activityFeedSettings3 = (i2 & 16384) != 0 ? profileV2Response2.activityFeedSettings : activityFeedSettings;
        if ((i2 & 32768) != 0) {
            activityFeedSettings2 = activityFeedSettings3;
            placesSettings2 = profileV2Response2.placesSettings;
        } else {
            activityFeedSettings2 = activityFeedSettings3;
            placesSettings2 = placesSettings;
        }
        return profileV2Response2.copy(user2, plusControl2, spotify2, profileBoost2, tinderSelect2, list3, travel2, list4, purchaseResponse2, products2, likes2, superLikes2, facebook2, instagram2, activityFeedSettings2, placesSettings2, (65536 & i2) != 0 ? profileV2Response2.topPhoto : topPhoto, (131072 & i2) != 0 ? profileV2Response2.emailSettings : emailSettings, (i2 & 262144) != 0 ? profileV2Response2.onboarding : onboarding);
    }

    @JvmStatic
    @NotNull
    public static final ProfileV2Response newInstance(@Nullable User user, @Nullable PlusControl plusControl, @Nullable Spotify spotify, @Nullable ProfileBoost profileBoost, @Nullable TinderSelect tinderSelect, @Nullable List<String> list, @Nullable Travel travel, @Nullable List<? extends Notification> list2, @Nullable PurchaseResponse purchaseResponse, @Nullable Products products, @Nullable Likes likes, @Nullable SuperLikes superLikes, @Nullable Facebook facebook, @Nullable Instagram instagram, @Nullable ActivityFeedSettings activityFeedSettings, @Nullable PlacesSettings placesSettings, @Nullable TopPhoto topPhoto, @Nullable EmailSettings emailSettings, @Nullable Onboarding onboarding) {
        return Companion.newInstance(user, plusControl, spotify, profileBoost, tinderSelect, list, travel, list2, purchaseResponse, products, likes, superLikes, facebook, instagram, activityFeedSettings, placesSettings, topPhoto, emailSettings, onboarding);
    }

    @Nullable
    public final User component1() {
        return this.user;
    }

    @Nullable
    public final Products component10() {
        return this.products;
    }

    @Nullable
    public final Likes component11() {
        return this.likes;
    }

    @Nullable
    public final SuperLikes component12() {
        return this.superLikes;
    }

    @Nullable
    public final Facebook component13() {
        return this.facebook;
    }

    @Nullable
    public final Instagram component14() {
        return this.instagram;
    }

    @Nullable
    public final ActivityFeedSettings component15() {
        return this.activityFeedSettings;
    }

    @Nullable
    public final PlacesSettings component16() {
        return this.placesSettings;
    }

    @Nullable
    public final TopPhoto component17() {
        return this.topPhoto;
    }

    @Nullable
    public final EmailSettings component18() {
        return this.emailSettings;
    }

    @Nullable
    public final Onboarding component19() {
        return this.onboarding;
    }

    @Nullable
    public final PlusControl component2() {
        return this.plusSettings;
    }

    @Nullable
    public final Spotify component3() {
        return this.spotify;
    }

    @Nullable
    public final ProfileBoost component4() {
        return this.boost;
    }

    @Nullable
    public final TinderSelect component5() {
        return this.select;
    }

    @Nullable
    public final List<String> component6() {
        return this.tutorials;
    }

    @Nullable
    public final Travel component7() {
        return this.travel;
    }

    @Nullable
    public final List<Notification> component8() {
        return this.notifications;
    }

    @Nullable
    public final PurchaseResponse component9() {
        return this.purchase;
    }

    @NotNull
    public final ProfileV2Response copy(@Nullable @Json(name = "user") User user, @Nullable @Json(name = "plus_control") PlusControl plusControl, @Nullable @Json(name = "spotify") Spotify spotify, @Nullable @Json(name = "boost") ProfileBoost profileBoost, @Nullable @Json(name = "select") TinderSelect tinderSelect, @Nullable @Json(name = "tutorials") List<String> list, @Nullable @Json(name = "travel") Travel travel, @Nullable @Json(name = "notifications") List<? extends Notification> list2, @Nullable @Json(name = "purchase") PurchaseResponse purchaseResponse, @Nullable @Json(name = "products") Products products, @Nullable @Json(name = "likes") Likes likes, @Nullable @Json(name = "super_likes") SuperLikes superLikes, @Nullable @Json(name = "facebook") Facebook facebook, @Nullable @Json(name = "instagram") Instagram instagram, @Nullable @Json(name = "feed_control") ActivityFeedSettings activityFeedSettings, @Nullable @Json(name = "places") PlacesSettings placesSettings, @Nullable @Json(name = "top_photo") TopPhoto topPhoto, @Nullable @Json(name = "email_settings") EmailSettings emailSettings, @Nullable @Json(name = "onboarding") Onboarding onboarding) {
        return new ProfileV2Response(user, plusControl, spotify, profileBoost, tinderSelect, list, travel, list2, purchaseResponse, products, likes, superLikes, facebook, instagram, activityFeedSettings, placesSettings, topPhoto, emailSettings, onboarding);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProfileV2Response) {
                ProfileV2Response profileV2Response = (ProfileV2Response) obj;
                if (C2668g.a(this.user, profileV2Response.user) && C2668g.a(this.plusSettings, profileV2Response.plusSettings) && C2668g.a(this.spotify, profileV2Response.spotify) && C2668g.a(this.boost, profileV2Response.boost) && C2668g.a(this.select, profileV2Response.select) && C2668g.a(this.tutorials, profileV2Response.tutorials) && C2668g.a(this.travel, profileV2Response.travel) && C2668g.a(this.notifications, profileV2Response.notifications) && C2668g.a(this.purchase, profileV2Response.purchase) && C2668g.a(this.products, profileV2Response.products) && C2668g.a(this.likes, profileV2Response.likes) && C2668g.a(this.superLikes, profileV2Response.superLikes) && C2668g.a(this.facebook, profileV2Response.facebook) && C2668g.a(this.instagram, profileV2Response.instagram) && C2668g.a(this.activityFeedSettings, profileV2Response.activityFeedSettings) && C2668g.a(this.placesSettings, profileV2Response.placesSettings) && C2668g.a(this.topPhoto, profileV2Response.topPhoto) && C2668g.a(this.emailSettings, profileV2Response.emailSettings) && C2668g.a(this.onboarding, profileV2Response.onboarding)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        User user = this.user;
        int i = 0;
        int hashCode = (user != null ? user.hashCode() : 0) * 31;
        PlusControl plusControl = this.plusSettings;
        hashCode = (hashCode + (plusControl != null ? plusControl.hashCode() : 0)) * 31;
        Spotify spotify = this.spotify;
        hashCode = (hashCode + (spotify != null ? spotify.hashCode() : 0)) * 31;
        ProfileBoost profileBoost = this.boost;
        hashCode = (hashCode + (profileBoost != null ? profileBoost.hashCode() : 0)) * 31;
        TinderSelect tinderSelect = this.select;
        hashCode = (hashCode + (tinderSelect != null ? tinderSelect.hashCode() : 0)) * 31;
        List list = this.tutorials;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Travel travel = this.travel;
        hashCode = (hashCode + (travel != null ? travel.hashCode() : 0)) * 31;
        list = this.notifications;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        PurchaseResponse purchaseResponse = this.purchase;
        hashCode = (hashCode + (purchaseResponse != null ? purchaseResponse.hashCode() : 0)) * 31;
        Products products = this.products;
        hashCode = (hashCode + (products != null ? products.hashCode() : 0)) * 31;
        Likes likes = this.likes;
        hashCode = (hashCode + (likes != null ? likes.hashCode() : 0)) * 31;
        SuperLikes superLikes = this.superLikes;
        hashCode = (hashCode + (superLikes != null ? superLikes.hashCode() : 0)) * 31;
        Facebook facebook = this.facebook;
        hashCode = (hashCode + (facebook != null ? facebook.hashCode() : 0)) * 31;
        Instagram instagram = this.instagram;
        hashCode = (hashCode + (instagram != null ? instagram.hashCode() : 0)) * 31;
        ActivityFeedSettings activityFeedSettings = this.activityFeedSettings;
        hashCode = (hashCode + (activityFeedSettings != null ? activityFeedSettings.hashCode() : 0)) * 31;
        PlacesSettings placesSettings = this.placesSettings;
        hashCode = (hashCode + (placesSettings != null ? placesSettings.hashCode() : 0)) * 31;
        TopPhoto topPhoto = this.topPhoto;
        hashCode = (hashCode + (topPhoto != null ? topPhoto.hashCode() : 0)) * 31;
        EmailSettings emailSettings = this.emailSettings;
        hashCode = (hashCode + (emailSettings != null ? emailSettings.hashCode() : 0)) * 31;
        Onboarding onboarding = this.onboarding;
        if (onboarding != null) {
            i = onboarding.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProfileV2Response(user=");
        stringBuilder.append(this.user);
        stringBuilder.append(", plusSettings=");
        stringBuilder.append(this.plusSettings);
        stringBuilder.append(", spotify=");
        stringBuilder.append(this.spotify);
        stringBuilder.append(", boost=");
        stringBuilder.append(this.boost);
        stringBuilder.append(", select=");
        stringBuilder.append(this.select);
        stringBuilder.append(", tutorials=");
        stringBuilder.append(this.tutorials);
        stringBuilder.append(", travel=");
        stringBuilder.append(this.travel);
        stringBuilder.append(", notifications=");
        stringBuilder.append(this.notifications);
        stringBuilder.append(", purchase=");
        stringBuilder.append(this.purchase);
        stringBuilder.append(", products=");
        stringBuilder.append(this.products);
        stringBuilder.append(", likes=");
        stringBuilder.append(this.likes);
        stringBuilder.append(", superLikes=");
        stringBuilder.append(this.superLikes);
        stringBuilder.append(", facebook=");
        stringBuilder.append(this.facebook);
        stringBuilder.append(", instagram=");
        stringBuilder.append(this.instagram);
        stringBuilder.append(", activityFeedSettings=");
        stringBuilder.append(this.activityFeedSettings);
        stringBuilder.append(", placesSettings=");
        stringBuilder.append(this.placesSettings);
        stringBuilder.append(", topPhoto=");
        stringBuilder.append(this.topPhoto);
        stringBuilder.append(", emailSettings=");
        stringBuilder.append(this.emailSettings);
        stringBuilder.append(", onboarding=");
        stringBuilder.append(this.onboarding);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ProfileV2Response(@Nullable @Json(name = "user") User user, @Nullable @Json(name = "plus_control") PlusControl plusControl, @Nullable @Json(name = "spotify") Spotify spotify, @Nullable @Json(name = "boost") ProfileBoost profileBoost, @Nullable @Json(name = "select") TinderSelect tinderSelect, @Nullable @Json(name = "tutorials") List<String> list, @Nullable @Json(name = "travel") Travel travel, @Nullable @Json(name = "notifications") List<? extends Notification> list2, @Nullable @Json(name = "purchase") PurchaseResponse purchaseResponse, @Nullable @Json(name = "products") Products products, @Nullable @Json(name = "likes") Likes likes, @Nullable @Json(name = "super_likes") SuperLikes superLikes, @Nullable @Json(name = "facebook") Facebook facebook, @Nullable @Json(name = "instagram") Instagram instagram, @Nullable @Json(name = "feed_control") ActivityFeedSettings activityFeedSettings, @Nullable @Json(name = "places") PlacesSettings placesSettings, @Nullable @Json(name = "top_photo") TopPhoto topPhoto, @Nullable @Json(name = "email_settings") EmailSettings emailSettings, @Nullable @Json(name = "onboarding") Onboarding onboarding) {
        this.user = user;
        this.plusSettings = plusControl;
        this.spotify = spotify;
        this.boost = profileBoost;
        this.select = tinderSelect;
        this.tutorials = list;
        this.travel = travel;
        this.notifications = list2;
        this.purchase = purchaseResponse;
        this.products = products;
        this.likes = likes;
        this.superLikes = superLikes;
        this.facebook = facebook;
        this.instagram = instagram;
        this.activityFeedSettings = activityFeedSettings;
        this.placesSettings = placesSettings;
        this.topPhoto = topPhoto;
        this.emailSettings = emailSettings;
        this.onboarding = onboarding;
    }

    @Nullable
    public final User getUser() {
        return this.user;
    }

    @Nullable
    public final PlusControl getPlusSettings() {
        return this.plusSettings;
    }

    @Nullable
    public final Spotify getSpotify() {
        return this.spotify;
    }

    @Nullable
    public final ProfileBoost getBoost() {
        return this.boost;
    }

    @Nullable
    public final TinderSelect getSelect() {
        return this.select;
    }

    @Nullable
    public final List<String> getTutorials() {
        return this.tutorials;
    }

    @Nullable
    public final Travel getTravel() {
        return this.travel;
    }

    @Nullable
    public final List<Notification> getNotifications() {
        return this.notifications;
    }

    @Nullable
    public final PurchaseResponse getPurchase() {
        return this.purchase;
    }

    @Nullable
    public final Products getProducts() {
        return this.products;
    }

    @Nullable
    public final Likes getLikes() {
        return this.likes;
    }

    @Nullable
    public final SuperLikes getSuperLikes() {
        return this.superLikes;
    }

    @Nullable
    public final Facebook getFacebook() {
        return this.facebook;
    }

    @Nullable
    public final Instagram getInstagram() {
        return this.instagram;
    }

    @Nullable
    public final ActivityFeedSettings getActivityFeedSettings() {
        return this.activityFeedSettings;
    }

    @Nullable
    public final PlacesSettings getPlacesSettings() {
        return this.placesSettings;
    }

    @Nullable
    public final TopPhoto getTopPhoto() {
        return this.topPhoto;
    }

    @Nullable
    public final EmailSettings getEmailSettings() {
        return this.emailSettings;
    }

    @Nullable
    public final Onboarding getOnboarding() {
        return this.onboarding;
    }
}
