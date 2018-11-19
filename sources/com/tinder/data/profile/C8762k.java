package com.tinder.data.profile;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.tinder.domain.common.model.Instagram;
import com.tinder.domain.common.model.Subscription;
import com.tinder.domain.common.model.User;
import com.tinder.domain.config.model.ProfileEditingConfig;
import com.tinder.domain.meta.model.BoostSettings;
import com.tinder.domain.meta.model.DiscoverySettings;
import com.tinder.domain.meta.model.PlusControlSettings;
import com.tinder.domain.meta.model.SelectSettings;
import com.tinder.domain.meta.model.SpotifySettings;
import com.tinder.domain.onboarding.Onboarding;
import com.tinder.domain.profile.model.AccountInformation;
import com.tinder.domain.profile.model.FacebookInformation;
import com.tinder.domain.profile.model.GenderSettings;
import com.tinder.domain.profile.model.Interests;
import com.tinder.domain.profile.model.Products;
import com.tinder.domain.profile.model.Tutorials;
import com.tinder.domain.profile.model.settings.AccountSettings;
import com.tinder.domain.profile.model.settings.PlacesSettings;
import com.tinder.domain.profile.model.settings.SmartPhotoSettings;
import com.tinder.domain.profile.model.settings.TopPhotoSettings;
import com.tinder.domain.profile.model.settings.WebProfileSettings;
import com.tinder.domain.settings.email.model.EmailSettings;
import com.tinder.domain.settings.feed.model.FeedSettings;
import com.tinder.domain.superlike.SuperlikeStatus;
import com.tinder.domain.tinderplus.LikeStatus;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bQ\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BÃ\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000103\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000105¢\u0006\u0002\u00106J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010!HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010#HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010%HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010'HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010)HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010+HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010-HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010/HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u000101HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u000103HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u000105HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0012\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0011HÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u0013HÆ\u0003JÈ\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\n\b\u0002\u00102\u001a\u0004\u0018\u0001032\n\b\u0002\u00104\u001a\u0004\u0018\u000105HÆ\u0001J\u0016\u0010\u0001\u001a\u00030\u00012\t\u0010\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010\u0001\u001a\u00030\u0001HÖ\u0001J\n\u0010\u0001\u001a\u00020\u000fHÖ\u0001R\u0013\u0010$\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0013\u00102\u001a\u0004\u0018\u000103¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0013\u0010*\u001a\u0004\u0018\u00010+¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0013\u00100\u001a\u0004\u0018\u000101¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0013\u0010,\u001a\u0004\u0018\u00010-¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0013\u00104\u001a\u0004\u0018\u000105¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0013\u0010(\u001a\u0004\u0018\u00010)¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\ba\u0010bR\u0013\u0010.\u001a\u0004\u0018\u00010/¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bg\u0010hR\u0013\u0010&\u001a\u0004\u0018\u00010'¢\u0006\b\n\u0000\u001a\u0004\bi\u0010j¨\u0006\u0001"}, d2 = {"Lcom/tinder/data/profile/ProfileDataSyncResult;", "", "user", "Lcom/tinder/domain/common/model/User;", "plusControl", "Lcom/tinder/domain/meta/model/PlusControlSettings;", "spotify", "Lcom/tinder/domain/meta/model/SpotifySettings;", "boost", "Lcom/tinder/domain/meta/model/BoostSettings;", "select", "Lcom/tinder/domain/meta/model/SelectSettings;", "tutorials", "Lcom/tinder/domain/profile/model/Tutorials;", "passport", "", "notifications", "", "purchase", "Lcom/tinder/domain/common/model/Subscription;", "products", "Lcom/tinder/domain/profile/model/Products;", "likes", "Lcom/tinder/domain/tinderplus/LikeStatus;", "superLikes", "Lcom/tinder/domain/superlike/SuperlikeStatus;", "instagram", "Lcom/tinder/domain/common/model/Instagram;", "feedSettings", "Lcom/tinder/domain/settings/feed/model/FeedSettings;", "discoverySettings", "Lcom/tinder/domain/meta/model/DiscoverySettings;", "smartPhotoSettings", "Lcom/tinder/domain/profile/model/settings/SmartPhotoSettings;", "accountSettings", "Lcom/tinder/domain/profile/model/settings/AccountSettings;", "accountInfo", "Lcom/tinder/domain/profile/model/AccountInformation;", "webProfileSettings", "Lcom/tinder/domain/profile/model/settings/WebProfileSettings;", "placesSettings", "Lcom/tinder/domain/profile/model/settings/PlacesSettings;", "facebookInformation", "Lcom/tinder/domain/profile/model/FacebookInformation;", "interests", "Lcom/tinder/domain/profile/model/Interests;", "topPhotoId", "Lcom/tinder/domain/profile/model/settings/TopPhotoSettings;", "genderSettings", "Lcom/tinder/domain/profile/model/GenderSettings;", "emailSettings", "Lcom/tinder/domain/settings/email/model/EmailSettings;", "onboarding", "Lcom/tinder/domain/onboarding/Onboarding;", "(Lcom/tinder/domain/common/model/User;Lcom/tinder/domain/meta/model/PlusControlSettings;Lcom/tinder/domain/meta/model/SpotifySettings;Lcom/tinder/domain/meta/model/BoostSettings;Lcom/tinder/domain/meta/model/SelectSettings;Lcom/tinder/domain/profile/model/Tutorials;Ljava/lang/String;Ljava/util/List;Lcom/tinder/domain/common/model/Subscription;Lcom/tinder/domain/profile/model/Products;Lcom/tinder/domain/tinderplus/LikeStatus;Lcom/tinder/domain/superlike/SuperlikeStatus;Lcom/tinder/domain/common/model/Instagram;Lcom/tinder/domain/settings/feed/model/FeedSettings;Lcom/tinder/domain/meta/model/DiscoverySettings;Lcom/tinder/domain/profile/model/settings/SmartPhotoSettings;Lcom/tinder/domain/profile/model/settings/AccountSettings;Lcom/tinder/domain/profile/model/AccountInformation;Lcom/tinder/domain/profile/model/settings/WebProfileSettings;Lcom/tinder/domain/profile/model/settings/PlacesSettings;Lcom/tinder/domain/profile/model/FacebookInformation;Lcom/tinder/domain/profile/model/Interests;Lcom/tinder/domain/profile/model/settings/TopPhotoSettings;Lcom/tinder/domain/profile/model/GenderSettings;Lcom/tinder/domain/settings/email/model/EmailSettings;Lcom/tinder/domain/onboarding/Onboarding;)V", "getAccountInfo", "()Lcom/tinder/domain/profile/model/AccountInformation;", "getAccountSettings", "()Lcom/tinder/domain/profile/model/settings/AccountSettings;", "getBoost", "()Lcom/tinder/domain/meta/model/BoostSettings;", "getDiscoverySettings", "()Lcom/tinder/domain/meta/model/DiscoverySettings;", "getEmailSettings", "()Lcom/tinder/domain/settings/email/model/EmailSettings;", "getFacebookInformation", "()Lcom/tinder/domain/profile/model/FacebookInformation;", "getFeedSettings", "()Lcom/tinder/domain/settings/feed/model/FeedSettings;", "getGenderSettings", "()Lcom/tinder/domain/profile/model/GenderSettings;", "getInstagram", "()Lcom/tinder/domain/common/model/Instagram;", "getInterests", "()Lcom/tinder/domain/profile/model/Interests;", "getLikes", "()Lcom/tinder/domain/tinderplus/LikeStatus;", "getNotifications", "()Ljava/util/List;", "getOnboarding", "()Lcom/tinder/domain/onboarding/Onboarding;", "getPassport", "()Ljava/lang/String;", "getPlacesSettings", "()Lcom/tinder/domain/profile/model/settings/PlacesSettings;", "getPlusControl", "()Lcom/tinder/domain/meta/model/PlusControlSettings;", "getProducts", "()Lcom/tinder/domain/profile/model/Products;", "getPurchase", "()Lcom/tinder/domain/common/model/Subscription;", "getSelect", "()Lcom/tinder/domain/meta/model/SelectSettings;", "getSmartPhotoSettings", "()Lcom/tinder/domain/profile/model/settings/SmartPhotoSettings;", "getSpotify", "()Lcom/tinder/domain/meta/model/SpotifySettings;", "getSuperLikes", "()Lcom/tinder/domain/superlike/SuperlikeStatus;", "getTopPhotoId", "()Lcom/tinder/domain/profile/model/settings/TopPhotoSettings;", "getTutorials", "()Lcom/tinder/domain/profile/model/Tutorials;", "getUser", "()Lcom/tinder/domain/common/model/User;", "getWebProfileSettings", "()Lcom/tinder/domain/profile/model/settings/WebProfileSettings;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.profile.k */
public final class C8762k {
    @Nullable
    /* renamed from: a */
    private final User f30785a;
    @Nullable
    /* renamed from: b */
    private final PlusControlSettings f30786b;
    @Nullable
    /* renamed from: c */
    private final SpotifySettings f30787c;
    @Nullable
    /* renamed from: d */
    private final BoostSettings f30788d;
    @Nullable
    /* renamed from: e */
    private final SelectSettings f30789e;
    @Nullable
    /* renamed from: f */
    private final Tutorials f30790f;
    @Nullable
    /* renamed from: g */
    private final String f30791g;
    @Nullable
    /* renamed from: h */
    private final List<String> f30792h;
    @Nullable
    /* renamed from: i */
    private final Subscription f30793i;
    @Nullable
    /* renamed from: j */
    private final Products f30794j;
    @Nullable
    /* renamed from: k */
    private final LikeStatus f30795k;
    @Nullable
    /* renamed from: l */
    private final SuperlikeStatus f30796l;
    @Nullable
    /* renamed from: m */
    private final Instagram f30797m;
    @Nullable
    /* renamed from: n */
    private final FeedSettings f30798n;
    @Nullable
    /* renamed from: o */
    private final DiscoverySettings f30799o;
    @Nullable
    /* renamed from: p */
    private final SmartPhotoSettings f30800p;
    @Nullable
    /* renamed from: q */
    private final AccountSettings f30801q;
    @Nullable
    /* renamed from: r */
    private final AccountInformation f30802r;
    @Nullable
    /* renamed from: s */
    private final WebProfileSettings f30803s;
    @Nullable
    /* renamed from: t */
    private final PlacesSettings f30804t;
    @Nullable
    /* renamed from: u */
    private final FacebookInformation f30805u;
    @Nullable
    /* renamed from: v */
    private final Interests f30806v;
    @Nullable
    /* renamed from: w */
    private final TopPhotoSettings f30807w;
    @Nullable
    /* renamed from: x */
    private final GenderSettings f30808x;
    @Nullable
    /* renamed from: y */
    private final EmailSettings f30809y;
    @Nullable
    /* renamed from: z */
    private final Onboarding f30810z;

    public C8762k() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108863, null);
    }

    @NotNull
    /* renamed from: a */
    public static /* synthetic */ C8762k m37340a(C8762k c8762k, User user, PlusControlSettings plusControlSettings, SpotifySettings spotifySettings, BoostSettings boostSettings, SelectSettings selectSettings, Tutorials tutorials, String str, List list, Subscription subscription, Products products, LikeStatus likeStatus, SuperlikeStatus superlikeStatus, Instagram instagram, FeedSettings feedSettings, DiscoverySettings discoverySettings, SmartPhotoSettings smartPhotoSettings, AccountSettings accountSettings, AccountInformation accountInformation, WebProfileSettings webProfileSettings, PlacesSettings placesSettings, FacebookInformation facebookInformation, Interests interests, TopPhotoSettings topPhotoSettings, GenderSettings genderSettings, EmailSettings emailSettings, Onboarding onboarding, int i, Object obj) {
        DiscoverySettings discoverySettings2;
        SmartPhotoSettings smartPhotoSettings2;
        C8762k c8762k2 = c8762k;
        int i2 = i;
        User user2 = (i2 & 1) != 0 ? c8762k2.f30785a : user;
        PlusControlSettings plusControlSettings2 = (i2 & 2) != 0 ? c8762k2.f30786b : plusControlSettings;
        SpotifySettings spotifySettings2 = (i2 & 4) != 0 ? c8762k2.f30787c : spotifySettings;
        BoostSettings boostSettings2 = (i2 & 8) != 0 ? c8762k2.f30788d : boostSettings;
        SelectSettings selectSettings2 = (i2 & 16) != 0 ? c8762k2.f30789e : selectSettings;
        Tutorials tutorials2 = (i2 & 32) != 0 ? c8762k2.f30790f : tutorials;
        String str2 = (i2 & 64) != 0 ? c8762k2.f30791g : str;
        List list2 = (i2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? c8762k2.f30792h : list;
        Subscription subscription2 = (i2 & 256) != 0 ? c8762k2.f30793i : subscription;
        Products products2 = (i2 & 512) != 0 ? c8762k2.f30794j : products;
        LikeStatus likeStatus2 = (i2 & 1024) != 0 ? c8762k2.f30795k : likeStatus;
        SuperlikeStatus superlikeStatus2 = (i2 & ItemAnimator.FLAG_MOVED) != 0 ? c8762k2.f30796l : superlikeStatus;
        Instagram instagram2 = (i2 & 4096) != 0 ? c8762k2.f30797m : instagram;
        FeedSettings feedSettings2 = (i2 & 8192) != 0 ? c8762k2.f30798n : feedSettings;
        DiscoverySettings discoverySettings3 = (i2 & 16384) != 0 ? c8762k2.f30799o : discoverySettings;
        if ((i2 & 32768) != 0) {
            discoverySettings2 = discoverySettings3;
            smartPhotoSettings2 = c8762k2.f30800p;
        } else {
            discoverySettings2 = discoverySettings3;
            smartPhotoSettings2 = smartPhotoSettings;
        }
        return c8762k2.m37341a(user2, plusControlSettings2, spotifySettings2, boostSettings2, selectSettings2, tutorials2, str2, list2, subscription2, products2, likeStatus2, superlikeStatus2, instagram2, feedSettings2, discoverySettings2, smartPhotoSettings2, (65536 & i2) != 0 ? c8762k2.f30801q : accountSettings, (131072 & i2) != 0 ? c8762k2.f30802r : accountInformation, (262144 & i2) != 0 ? c8762k2.f30803s : webProfileSettings, (524288 & i2) != 0 ? c8762k2.f30804t : placesSettings, (1048576 & i2) != 0 ? c8762k2.f30805u : facebookInformation, (2097152 & i2) != 0 ? c8762k2.f30806v : interests, (4194304 & i2) != 0 ? c8762k2.f30807w : topPhotoSettings, (8388608 & i2) != 0 ? c8762k2.f30808x : genderSettings, (16777216 & i2) != 0 ? c8762k2.f30809y : emailSettings, (i2 & 33554432) != 0 ? c8762k2.f30810z : onboarding);
    }

    @NotNull
    /* renamed from: a */
    public final C8762k m37341a(@Nullable User user, @Nullable PlusControlSettings plusControlSettings, @Nullable SpotifySettings spotifySettings, @Nullable BoostSettings boostSettings, @Nullable SelectSettings selectSettings, @Nullable Tutorials tutorials, @Nullable String str, @Nullable List<String> list, @Nullable Subscription subscription, @Nullable Products products, @Nullable LikeStatus likeStatus, @Nullable SuperlikeStatus superlikeStatus, @Nullable Instagram instagram, @Nullable FeedSettings feedSettings, @Nullable DiscoverySettings discoverySettings, @Nullable SmartPhotoSettings smartPhotoSettings, @Nullable AccountSettings accountSettings, @Nullable AccountInformation accountInformation, @Nullable WebProfileSettings webProfileSettings, @Nullable PlacesSettings placesSettings, @Nullable FacebookInformation facebookInformation, @Nullable Interests interests, @Nullable TopPhotoSettings topPhotoSettings, @Nullable GenderSettings genderSettings, @Nullable EmailSettings emailSettings, @Nullable Onboarding onboarding) {
        return new C8762k(user, plusControlSettings, spotifySettings, boostSettings, selectSettings, tutorials, str, list, subscription, products, likeStatus, superlikeStatus, instagram, feedSettings, discoverySettings, smartPhotoSettings, accountSettings, accountInformation, webProfileSettings, placesSettings, facebookInformation, interests, topPhotoSettings, genderSettings, emailSettings, onboarding);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8762k) {
                C8762k c8762k = (C8762k) obj;
                if (C2668g.a(this.f30785a, c8762k.f30785a) && C2668g.a(this.f30786b, c8762k.f30786b) && C2668g.a(this.f30787c, c8762k.f30787c) && C2668g.a(this.f30788d, c8762k.f30788d) && C2668g.a(this.f30789e, c8762k.f30789e) && C2668g.a(this.f30790f, c8762k.f30790f) && C2668g.a(this.f30791g, c8762k.f30791g) && C2668g.a(this.f30792h, c8762k.f30792h) && C2668g.a(this.f30793i, c8762k.f30793i) && C2668g.a(this.f30794j, c8762k.f30794j) && C2668g.a(this.f30795k, c8762k.f30795k) && C2668g.a(this.f30796l, c8762k.f30796l) && C2668g.a(this.f30797m, c8762k.f30797m) && C2668g.a(this.f30798n, c8762k.f30798n) && C2668g.a(this.f30799o, c8762k.f30799o) && C2668g.a(this.f30800p, c8762k.f30800p) && C2668g.a(this.f30801q, c8762k.f30801q) && C2668g.a(this.f30802r, c8762k.f30802r) && C2668g.a(this.f30803s, c8762k.f30803s) && C2668g.a(this.f30804t, c8762k.f30804t) && C2668g.a(this.f30805u, c8762k.f30805u) && C2668g.a(this.f30806v, c8762k.f30806v) && C2668g.a(this.f30807w, c8762k.f30807w) && C2668g.a(this.f30808x, c8762k.f30808x) && C2668g.a(this.f30809y, c8762k.f30809y) && C2668g.a(this.f30810z, c8762k.f30810z)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        User user = this.f30785a;
        int i = 0;
        int hashCode = (user != null ? user.hashCode() : 0) * 31;
        PlusControlSettings plusControlSettings = this.f30786b;
        hashCode = (hashCode + (plusControlSettings != null ? plusControlSettings.hashCode() : 0)) * 31;
        SpotifySettings spotifySettings = this.f30787c;
        hashCode = (hashCode + (spotifySettings != null ? spotifySettings.hashCode() : 0)) * 31;
        BoostSettings boostSettings = this.f30788d;
        hashCode = (hashCode + (boostSettings != null ? boostSettings.hashCode() : 0)) * 31;
        SelectSettings selectSettings = this.f30789e;
        hashCode = (hashCode + (selectSettings != null ? selectSettings.hashCode() : 0)) * 31;
        Tutorials tutorials = this.f30790f;
        hashCode = (hashCode + (tutorials != null ? tutorials.hashCode() : 0)) * 31;
        String str = this.f30791g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.f30792h;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Subscription subscription = this.f30793i;
        hashCode = (hashCode + (subscription != null ? subscription.hashCode() : 0)) * 31;
        Products products = this.f30794j;
        hashCode = (hashCode + (products != null ? products.hashCode() : 0)) * 31;
        LikeStatus likeStatus = this.f30795k;
        hashCode = (hashCode + (likeStatus != null ? likeStatus.hashCode() : 0)) * 31;
        SuperlikeStatus superlikeStatus = this.f30796l;
        hashCode = (hashCode + (superlikeStatus != null ? superlikeStatus.hashCode() : 0)) * 31;
        Instagram instagram = this.f30797m;
        hashCode = (hashCode + (instagram != null ? instagram.hashCode() : 0)) * 31;
        FeedSettings feedSettings = this.f30798n;
        hashCode = (hashCode + (feedSettings != null ? feedSettings.hashCode() : 0)) * 31;
        DiscoverySettings discoverySettings = this.f30799o;
        hashCode = (hashCode + (discoverySettings != null ? discoverySettings.hashCode() : 0)) * 31;
        SmartPhotoSettings smartPhotoSettings = this.f30800p;
        hashCode = (hashCode + (smartPhotoSettings != null ? smartPhotoSettings.hashCode() : 0)) * 31;
        AccountSettings accountSettings = this.f30801q;
        hashCode = (hashCode + (accountSettings != null ? accountSettings.hashCode() : 0)) * 31;
        AccountInformation accountInformation = this.f30802r;
        hashCode = (hashCode + (accountInformation != null ? accountInformation.hashCode() : 0)) * 31;
        WebProfileSettings webProfileSettings = this.f30803s;
        hashCode = (hashCode + (webProfileSettings != null ? webProfileSettings.hashCode() : 0)) * 31;
        PlacesSettings placesSettings = this.f30804t;
        hashCode = (hashCode + (placesSettings != null ? placesSettings.hashCode() : 0)) * 31;
        FacebookInformation facebookInformation = this.f30805u;
        hashCode = (hashCode + (facebookInformation != null ? facebookInformation.hashCode() : 0)) * 31;
        Interests interests = this.f30806v;
        hashCode = (hashCode + (interests != null ? interests.hashCode() : 0)) * 31;
        TopPhotoSettings topPhotoSettings = this.f30807w;
        hashCode = (hashCode + (topPhotoSettings != null ? topPhotoSettings.hashCode() : 0)) * 31;
        GenderSettings genderSettings = this.f30808x;
        hashCode = (hashCode + (genderSettings != null ? genderSettings.hashCode() : 0)) * 31;
        EmailSettings emailSettings = this.f30809y;
        hashCode = (hashCode + (emailSettings != null ? emailSettings.hashCode() : 0)) * 31;
        Onboarding onboarding = this.f30810z;
        if (onboarding != null) {
            i = onboarding.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProfileDataSyncResult(user=");
        stringBuilder.append(this.f30785a);
        stringBuilder.append(", plusControl=");
        stringBuilder.append(this.f30786b);
        stringBuilder.append(", spotify=");
        stringBuilder.append(this.f30787c);
        stringBuilder.append(", boost=");
        stringBuilder.append(this.f30788d);
        stringBuilder.append(", select=");
        stringBuilder.append(this.f30789e);
        stringBuilder.append(", tutorials=");
        stringBuilder.append(this.f30790f);
        stringBuilder.append(", passport=");
        stringBuilder.append(this.f30791g);
        stringBuilder.append(", notifications=");
        stringBuilder.append(this.f30792h);
        stringBuilder.append(", purchase=");
        stringBuilder.append(this.f30793i);
        stringBuilder.append(", products=");
        stringBuilder.append(this.f30794j);
        stringBuilder.append(", likes=");
        stringBuilder.append(this.f30795k);
        stringBuilder.append(", superLikes=");
        stringBuilder.append(this.f30796l);
        stringBuilder.append(", instagram=");
        stringBuilder.append(this.f30797m);
        stringBuilder.append(", feedSettings=");
        stringBuilder.append(this.f30798n);
        stringBuilder.append(", discoverySettings=");
        stringBuilder.append(this.f30799o);
        stringBuilder.append(", smartPhotoSettings=");
        stringBuilder.append(this.f30800p);
        stringBuilder.append(", accountSettings=");
        stringBuilder.append(this.f30801q);
        stringBuilder.append(", accountInfo=");
        stringBuilder.append(this.f30802r);
        stringBuilder.append(", webProfileSettings=");
        stringBuilder.append(this.f30803s);
        stringBuilder.append(", placesSettings=");
        stringBuilder.append(this.f30804t);
        stringBuilder.append(", facebookInformation=");
        stringBuilder.append(this.f30805u);
        stringBuilder.append(", interests=");
        stringBuilder.append(this.f30806v);
        stringBuilder.append(", topPhotoId=");
        stringBuilder.append(this.f30807w);
        stringBuilder.append(", genderSettings=");
        stringBuilder.append(this.f30808x);
        stringBuilder.append(", emailSettings=");
        stringBuilder.append(this.f30809y);
        stringBuilder.append(", onboarding=");
        stringBuilder.append(this.f30810z);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C8762k(@Nullable User user, @Nullable PlusControlSettings plusControlSettings, @Nullable SpotifySettings spotifySettings, @Nullable BoostSettings boostSettings, @Nullable SelectSettings selectSettings, @Nullable Tutorials tutorials, @Nullable String str, @Nullable List<String> list, @Nullable Subscription subscription, @Nullable Products products, @Nullable LikeStatus likeStatus, @Nullable SuperlikeStatus superlikeStatus, @Nullable Instagram instagram, @Nullable FeedSettings feedSettings, @Nullable DiscoverySettings discoverySettings, @Nullable SmartPhotoSettings smartPhotoSettings, @Nullable AccountSettings accountSettings, @Nullable AccountInformation accountInformation, @Nullable WebProfileSettings webProfileSettings, @Nullable PlacesSettings placesSettings, @Nullable FacebookInformation facebookInformation, @Nullable Interests interests, @Nullable TopPhotoSettings topPhotoSettings, @Nullable GenderSettings genderSettings, @Nullable EmailSettings emailSettings, @Nullable Onboarding onboarding) {
        this.f30785a = user;
        this.f30786b = plusControlSettings;
        this.f30787c = spotifySettings;
        this.f30788d = boostSettings;
        this.f30789e = selectSettings;
        this.f30790f = tutorials;
        this.f30791g = str;
        this.f30792h = list;
        this.f30793i = subscription;
        this.f30794j = products;
        this.f30795k = likeStatus;
        this.f30796l = superlikeStatus;
        this.f30797m = instagram;
        this.f30798n = feedSettings;
        this.f30799o = discoverySettings;
        this.f30800p = smartPhotoSettings;
        this.f30801q = accountSettings;
        this.f30802r = accountInformation;
        this.f30803s = webProfileSettings;
        this.f30804t = placesSettings;
        this.f30805u = facebookInformation;
        this.f30806v = interests;
        this.f30807w = topPhotoSettings;
        this.f30808x = genderSettings;
        this.f30809y = emailSettings;
        this.f30810z = onboarding;
    }

    public /* synthetic */ C8762k(User user, PlusControlSettings plusControlSettings, SpotifySettings spotifySettings, BoostSettings boostSettings, SelectSettings selectSettings, Tutorials tutorials, String str, List list, Subscription subscription, Products products, LikeStatus likeStatus, SuperlikeStatus superlikeStatus, Instagram instagram, FeedSettings feedSettings, DiscoverySettings discoverySettings, SmartPhotoSettings smartPhotoSettings, AccountSettings accountSettings, AccountInformation accountInformation, WebProfileSettings webProfileSettings, PlacesSettings placesSettings, FacebookInformation facebookInformation, Interests interests, TopPhotoSettings topPhotoSettings, GenderSettings genderSettings, EmailSettings emailSettings, Onboarding onboarding, int i, C15823e c15823e) {
        int i2 = i;
        this((i2 & 1) != 0 ? (User) null : user, (i2 & 2) != 0 ? (PlusControlSettings) null : plusControlSettings, (i2 & 4) != 0 ? (SpotifySettings) null : spotifySettings, (i2 & 8) != 0 ? (BoostSettings) null : boostSettings, (i2 & 16) != 0 ? (SelectSettings) null : selectSettings, (i2 & 32) != 0 ? (Tutorials) null : tutorials, (i2 & 64) != 0 ? (String) null : str, (i2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? (List) null : list, (i2 & 256) != 0 ? (Subscription) null : subscription, (i2 & 512) != 0 ? (Products) null : products, (i2 & 1024) != 0 ? (LikeStatus) null : likeStatus, (i2 & ItemAnimator.FLAG_MOVED) != 0 ? (SuperlikeStatus) null : superlikeStatus, (i2 & 4096) != 0 ? (Instagram) null : instagram, (i2 & 8192) != 0 ? (FeedSettings) null : feedSettings, (i2 & 16384) != 0 ? (DiscoverySettings) null : discoverySettings, (32768 & i2) != 0 ? (SmartPhotoSettings) null : smartPhotoSettings, (65536 & i2) != 0 ? (AccountSettings) null : accountSettings, (131072 & i2) != 0 ? (AccountInformation) null : accountInformation, (262144 & i2) != 0 ? (WebProfileSettings) null : webProfileSettings, (524288 & i2) != 0 ? (PlacesSettings) null : placesSettings, (1048576 & i2) != 0 ? (FacebookInformation) null : facebookInformation, (2097152 & i2) != 0 ? (Interests) null : interests, (4194304 & i2) != 0 ? (TopPhotoSettings) null : topPhotoSettings, (8388608 & i2) != 0 ? (GenderSettings) null : genderSettings, (16777216 & i2) != 0 ? (EmailSettings) null : emailSettings, (i2 & 33554432) != 0 ? (Onboarding) null : onboarding);
    }

    @Nullable
    /* renamed from: a */
    public final User m37342a() {
        return this.f30785a;
    }

    @Nullable
    /* renamed from: b */
    public final PlusControlSettings m37343b() {
        return this.f30786b;
    }

    @Nullable
    /* renamed from: c */
    public final SpotifySettings m37344c() {
        return this.f30787c;
    }

    @Nullable
    /* renamed from: d */
    public final BoostSettings m37345d() {
        return this.f30788d;
    }

    @Nullable
    /* renamed from: e */
    public final SelectSettings m37346e() {
        return this.f30789e;
    }

    @Nullable
    /* renamed from: f */
    public final Tutorials m37347f() {
        return this.f30790f;
    }

    @Nullable
    /* renamed from: g */
    public final String m37348g() {
        return this.f30791g;
    }

    @Nullable
    /* renamed from: h */
    public final List<String> m37349h() {
        return this.f30792h;
    }

    @Nullable
    /* renamed from: i */
    public final Subscription m37350i() {
        return this.f30793i;
    }

    @Nullable
    /* renamed from: j */
    public final Products m37351j() {
        return this.f30794j;
    }

    @Nullable
    /* renamed from: k */
    public final LikeStatus m37352k() {
        return this.f30795k;
    }

    @Nullable
    /* renamed from: l */
    public final SuperlikeStatus m37353l() {
        return this.f30796l;
    }

    @Nullable
    /* renamed from: m */
    public final Instagram m37354m() {
        return this.f30797m;
    }

    @Nullable
    /* renamed from: n */
    public final FeedSettings m37355n() {
        return this.f30798n;
    }

    @Nullable
    /* renamed from: o */
    public final DiscoverySettings m37356o() {
        return this.f30799o;
    }

    @Nullable
    /* renamed from: p */
    public final SmartPhotoSettings m37357p() {
        return this.f30800p;
    }

    @Nullable
    /* renamed from: q */
    public final AccountSettings m37358q() {
        return this.f30801q;
    }

    @Nullable
    /* renamed from: r */
    public final AccountInformation m37359r() {
        return this.f30802r;
    }

    @Nullable
    /* renamed from: s */
    public final WebProfileSettings m37360s() {
        return this.f30803s;
    }

    @Nullable
    /* renamed from: t */
    public final PlacesSettings m37361t() {
        return this.f30804t;
    }

    @Nullable
    /* renamed from: u */
    public final FacebookInformation m37362u() {
        return this.f30805u;
    }

    @Nullable
    /* renamed from: v */
    public final Interests m37363v() {
        return this.f30806v;
    }

    @Nullable
    /* renamed from: w */
    public final GenderSettings m37364w() {
        return this.f30808x;
    }

    @Nullable
    /* renamed from: x */
    public final EmailSettings m37365x() {
        return this.f30809y;
    }

    @Nullable
    /* renamed from: y */
    public final Onboarding m37366y() {
        return this.f30810z;
    }
}
