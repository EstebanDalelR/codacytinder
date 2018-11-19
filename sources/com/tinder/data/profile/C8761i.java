package com.tinder.data.profile;

import com.tinder.api.ManagerWebServices;
import com.tinder.api.TinderApi;
import com.tinder.api.model.common.TinderSelect;
import com.tinder.api.model.places.response.PlacesSettingsResponse;
import com.tinder.api.model.profile.PlusControl;
import com.tinder.api.model.profile.ProfileUserUpdateRequestBody;
import com.tinder.api.model.profile.ProfileV2Response;
import com.tinder.api.model.profile.PurchaseResponse;
import com.tinder.api.model.profile.UpdatePhotoOptimizerEnabledRequestBody;
import com.tinder.api.model.profile.UpdatePlacesSettingsRequestBody;
import com.tinder.api.request.LastEmailDismissedAtBody;
import com.tinder.api.response.v2.DataResponse;
import com.tinder.data.adapter.C10742q;
import com.tinder.data.adapter.C2646o;
import com.tinder.data.adapter.aq;
import com.tinder.data.meta.p226a.C10843a;
import com.tinder.data.meta.p226a.C10844c;
import com.tinder.data.meta.p226a.C10846g;
import com.tinder.data.meta.p226a.C10848k;
import com.tinder.data.meta.p226a.C10849m;
import com.tinder.data.profile.adapter.C10913a;
import com.tinder.data.profile.adapter.C10914c;
import com.tinder.data.profile.adapter.C10915e;
import com.tinder.data.profile.adapter.C10916i;
import com.tinder.data.profile.adapter.C10917k;
import com.tinder.data.profile.adapter.C10918m;
import com.tinder.data.profile.adapter.C10919o;
import com.tinder.data.profile.adapter.C10920q;
import com.tinder.data.profile.adapter.C10921s;
import com.tinder.data.profile.adapter.C10924y;
import com.tinder.data.profile.adapter.C8754g;
import com.tinder.data.profile.adapter.aa;
import com.tinder.data.profile.adapter.ag;
import com.tinder.data.profile.adapter.am;
import com.tinder.data.profile.adapter.ao;
import com.tinder.data.profile.adapter.as;
import com.tinder.domain.common.model.Gender.Value;
import com.tinder.domain.common.model.Instagram;
import com.tinder.domain.common.model.Subscription;
import com.tinder.domain.common.model.User;
import com.tinder.domain.meta.model.BoostSettings;
import com.tinder.domain.meta.model.DiscoverySettings;
import com.tinder.domain.meta.model.PlusControlSettings;
import com.tinder.domain.meta.model.SelectSettings;
import com.tinder.domain.meta.model.SpotifySettings;
import com.tinder.domain.onboarding.Onboarding;
import com.tinder.domain.profile.model.AccountInformation;
import com.tinder.domain.profile.model.DiscoverySettingsUpdateRequest;
import com.tinder.domain.profile.model.EmailLastDismissedAtUpdateRequest;
import com.tinder.domain.profile.model.EmailSettingsUpdateRequest;
import com.tinder.domain.profile.model.FacebookInformation;
import com.tinder.domain.profile.model.FeedSettingsUpdateRequest;
import com.tinder.domain.profile.model.GenderSettings;
import com.tinder.domain.profile.model.Interests;
import com.tinder.domain.profile.model.PlacesUpdateRequest;
import com.tinder.domain.profile.model.PlusControlUpdateRequest;
import com.tinder.domain.profile.model.Products;
import com.tinder.domain.profile.model.ProfileDataRequest;
import com.tinder.domain.profile.model.ProfileOption;
import com.tinder.domain.profile.model.ProfileOption.AccountInfo;
import com.tinder.domain.profile.model.ProfileOption.ActivityFeed;
import com.tinder.domain.profile.model.ProfileOption.Boost;
import com.tinder.domain.profile.model.ProfileOption.Discovery;
import com.tinder.domain.profile.model.ProfileOption.Facebook;
import com.tinder.domain.profile.model.ProfileOption.Likes;
import com.tinder.domain.profile.model.ProfileOption.Notifications;
import com.tinder.domain.profile.model.ProfileOption.Passport;
import com.tinder.domain.profile.model.ProfileOption.Places;
import com.tinder.domain.profile.model.ProfileOption.Purchase;
import com.tinder.domain.profile.model.ProfileOption.Select;
import com.tinder.domain.profile.model.ProfileOption.ShowGender;
import com.tinder.domain.profile.model.ProfileOption.SmartPhoto;
import com.tinder.domain.profile.model.ProfileOption.Spotify;
import com.tinder.domain.profile.model.ProfileOption.SuperLikes;
import com.tinder.domain.profile.model.ProfileOption.TopPhoto;
import com.tinder.domain.profile.model.ProfileOption.WebProfile;
import com.tinder.domain.profile.model.ProfileUpdateRequest;
import com.tinder.domain.profile.model.ProfileUserUpdateRequest;
import com.tinder.domain.profile.model.SmartPhotosUpdateRequest;
import com.tinder.domain.profile.model.Tutorials;
import com.tinder.domain.profile.model.TutorialsUpdateRequest;
import com.tinder.domain.profile.model.settings.AccountSettings;
import com.tinder.domain.profile.model.settings.PlacesSettings;
import com.tinder.domain.profile.model.settings.SmartPhotoSettings;
import com.tinder.domain.profile.model.settings.TopPhotoSettings;
import com.tinder.domain.profile.model.settings.WebProfileSettings;
import com.tinder.domain.settings.email.model.EmailSettings;
import com.tinder.domain.settings.feed.model.FeedSettings;
import com.tinder.domain.superlike.SuperlikeStatus;
import com.tinder.domain.tinderplus.LikeStatus;
import com.tinder.model.analytics.AnalyticsConstants;
import io.reactivex.C3956a;
import io.reactivex.C3959e;
import io.reactivex.C3960g;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.C19301m;
import kotlin.collections.ae;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B×\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020'\u0012\u0006\u0010(\u001a\u00020)\u0012\u0006\u0010*\u001a\u00020+\u0012\u0006\u0010,\u001a\u00020-\u0012\u0006\u0010.\u001a\u00020/\u0012\u0006\u00100\u001a\u000201\u0012\u0006\u00102\u001a\u000203\u0012\u0006\u00104\u001a\u000205¢\u0006\u0002\u00106J\u001a\u0010;\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000109\u0012\u0004\u0012\u00020:08H\u0002J\u001b\u0010<\u001a\b\u0012\u0004\u0012\u00020>0=2\u0006\u0010?\u001a\u00020@H\u0000¢\u0006\u0002\bAJ9\u0010B\u001a\u0004\u0018\u0001HC\"\u0004\b\u0000\u0010D\"\u0004\b\u0001\u0010C2\b\u0010E\u001a\u0004\u0018\u0001HD2\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u0002HD\u0012\u0004\u0012\u0002HC0GH\u0002¢\u0006\u0002\u0010HJ9\u0010B\u001a\u0004\u0018\u0001HC\"\u0004\b\u0000\u0010D\"\u0004\b\u0001\u0010C2\b\u0010E\u001a\u0004\u0018\u0001HD2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u0002HC\u0012\u0004\u0012\u0002HD0JH\u0002¢\u0006\u0002\u0010KJ\u001b\u0010L\u001a\b\u0012\u0004\u0012\u00020>0=2\u0006\u0010?\u001a\u00020MH\u0000¢\u0006\u0002\bNJ\u0010\u0010O\u001a\u00020:*\u0006\u0012\u0002\b\u000309H\u0002R\u000e\u0010 \u001a\u00020!X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R \u00107\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000109\u0012\u0004\u0012\u00020:08X\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0004¢\u0006\u0002\n\u0000¨\u0006P"}, d2 = {"Lcom/tinder/data/profile/ProfileClient;", "", "api", "Lcom/tinder/api/TinderApi;", "feedSettingsApiClient", "Lcom/tinder/data/profile/ActivityFeedSettingsApiClient;", "subscriptionAdapter", "Lcom/tinder/data/meta/adapter/SubscriptionAdapter;", "superlikeStatusAdapter", "Lcom/tinder/data/adapter/SuperlikeStatusDomainApiAdapter;", "productsAdapter", "Lcom/tinder/data/profile/adapter/ProductsAdapter;", "tutorialsAdapter", "Lcom/tinder/data/profile/adapter/TutorialsAdapter;", "placesAdapter", "Lcom/tinder/data/profile/adapter/PlacesAdapter;", "feedSettingsAdapter", "Lcom/tinder/data/profile/adapter/ActivityFeedSettingsApiAdapter;", "plusControlSettingsAdapter", "Lcom/tinder/data/profile/adapter/PlusControlSettingsAdapter;", "likeStatusAdapter", "Lcom/tinder/data/profile/adapter/LikeStatusAdapter;", "boostSettingsAdapter", "Lcom/tinder/data/meta/adapter/BoostSettingsAdapter;", "selectSettingsAdapter", "Lcom/tinder/data/meta/adapter/SelectSettingsAdapter;", "instagramDomainApiAdapter", "Lcom/tinder/data/adapter/InstagramDomainApiAdapter;", "discoverySettingsAdapter", "Lcom/tinder/data/meta/adapter/DiscoverySettingsAdapter;", "discoverySettingsRequestAdapter", "Lcom/tinder/data/profile/adapter/DiscoverySettingsRequestAdapter;", "accountInfoAdapter", "Lcom/tinder/data/profile/adapter/AccountInformationAdapter;", "webProfileSettingsAdapter", "Lcom/tinder/data/profile/adapter/WebProfileSettingsAdapter;", "smartPhotoSettingsAdapter", "Lcom/tinder/data/profile/adapter/SmartPhotoSettingsAdapter;", "accountSettingsAdapter", "Lcom/tinder/data/profile/adapter/AccountSettingsAdapter;", "coreUserAdapter", "Lcom/tinder/data/meta/adapter/CoreUserAdapter;", "facebookInformationAdapter", "Lcom/tinder/data/profile/adapter/FacebookInformationAdapter;", "interestsAdapter", "Lcom/tinder/data/profile/adapter/InterestsAdapter;", "topPhotoSettingsAdapter", "Lcom/tinder/data/profile/adapter/TopPhotoSettingsAdapter;", "genderSettingsAdapter", "Lcom/tinder/data/profile/adapter/GenderSettingsAdapter;", "emailSettingsAdapter", "Lcom/tinder/data/profile/adapter/EmailSettingsAdapter;", "onboardingAdapter", "Lcom/tinder/data/profile/adapter/OnboardingAdapter;", "(Lcom/tinder/api/TinderApi;Lcom/tinder/data/profile/ActivityFeedSettingsApiClient;Lcom/tinder/data/meta/adapter/SubscriptionAdapter;Lcom/tinder/data/adapter/SuperlikeStatusDomainApiAdapter;Lcom/tinder/data/profile/adapter/ProductsAdapter;Lcom/tinder/data/profile/adapter/TutorialsAdapter;Lcom/tinder/data/profile/adapter/PlacesAdapter;Lcom/tinder/data/profile/adapter/ActivityFeedSettingsApiAdapter;Lcom/tinder/data/profile/adapter/PlusControlSettingsAdapter;Lcom/tinder/data/profile/adapter/LikeStatusAdapter;Lcom/tinder/data/meta/adapter/BoostSettingsAdapter;Lcom/tinder/data/meta/adapter/SelectSettingsAdapter;Lcom/tinder/data/adapter/InstagramDomainApiAdapter;Lcom/tinder/data/meta/adapter/DiscoverySettingsAdapter;Lcom/tinder/data/profile/adapter/DiscoverySettingsRequestAdapter;Lcom/tinder/data/profile/adapter/AccountInformationAdapter;Lcom/tinder/data/profile/adapter/WebProfileSettingsAdapter;Lcom/tinder/data/profile/adapter/SmartPhotoSettingsAdapter;Lcom/tinder/data/profile/adapter/AccountSettingsAdapter;Lcom/tinder/data/meta/adapter/CoreUserAdapter;Lcom/tinder/data/profile/adapter/FacebookInformationAdapter;Lcom/tinder/data/profile/adapter/InterestsAdapter;Lcom/tinder/data/profile/adapter/TopPhotoSettingsAdapter;Lcom/tinder/data/profile/adapter/GenderSettingsAdapter;Lcom/tinder/data/profile/adapter/EmailSettingsAdapter;Lcom/tinder/data/profile/adapter/OnboardingAdapter;)V", "map", "", "Lcom/tinder/domain/profile/model/ProfileOption;", "", "createOptionToPathMap", "get", "Lio/reactivex/Single;", "Lcom/tinder/data/profile/ProfileDataSyncResult;", "request", "Lcom/tinder/domain/profile/model/ProfileDataRequest;", "get$data_release", "mapToDomain", "DOMAIN", "API", "apiData", "mapper", "Lkotlin/Function1;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "adapter", "Lcom/tinder/data/adapter/DomainApiAdapter;", "(Ljava/lang/Object;Lcom/tinder/data/adapter/DomainApiAdapter;)Ljava/lang/Object;", "post", "Lcom/tinder/domain/profile/model/ProfileUpdateRequest;", "post$data_release", "path", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.profile.i */
public final class C8761i {
    /* renamed from: A */
    private final C10921s f30758A;
    /* renamed from: a */
    private final Map<ProfileOption<Object>, String> f30759a = m37314a();
    /* renamed from: b */
    private final TinderApi f30760b;
    /* renamed from: c */
    private final C8753a f30761c;
    /* renamed from: d */
    private final C10849m f30762d;
    /* renamed from: e */
    private final aq f30763e;
    /* renamed from: f */
    private final ag f30764f;
    /* renamed from: g */
    private final com.tinder.data.profile.adapter.aq f30765g;
    /* renamed from: h */
    private final C10924y f30766h;
    /* renamed from: i */
    private final C10915e f30767i;
    /* renamed from: j */
    private final aa f30768j;
    /* renamed from: k */
    private final C10920q f30769k;
    /* renamed from: l */
    private final C10843a f30770l;
    /* renamed from: m */
    private final C10848k f30771m;
    /* renamed from: n */
    private final C10742q f30772n;
    /* renamed from: o */
    private final C10846g f30773o;
    /* renamed from: p */
    private final C8754g f30774p;
    /* renamed from: q */
    private final C10913a f30775q;
    /* renamed from: r */
    private final as f30776r;
    /* renamed from: s */
    private final am f30777s;
    /* renamed from: t */
    private final C10914c f30778t;
    /* renamed from: u */
    private final C10844c f30779u;
    /* renamed from: v */
    private final C10917k f30780v;
    /* renamed from: w */
    private final C10919o f30781w;
    /* renamed from: x */
    private final ao f30782x;
    /* renamed from: y */
    private final C10918m f30783y;
    /* renamed from: z */
    private final C10916i f30784z;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/profile/model/ProfileOption;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.i$a */
    static final class C10936a<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C8761i f35639a;

        C10936a(C8761i c8761i) {
            this.f35639a = c8761i;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43531a((ProfileOption) obj);
        }

        @NotNull
        /* renamed from: a */
        public final String m43531a(@NotNull ProfileOption<?> profileOption) {
            C2668g.b(profileOption, "it");
            return this.f35639a.m37313a((ProfileOption) profileOption);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012(\u0010\u0002\u001a$\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u00010\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.i$b */
    static final class C10937b<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C10937b f35640a = new C10937b();

        C10937b() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43532a((List) obj);
        }

        @NotNull
        /* renamed from: a */
        public final String m43532a(@NotNull List<String> list) {
            C2668g.b(list, "it");
            return C19301m.a(list, ",", null, null, 0, null, null, 62, null);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002 \u0003*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/tinder/api/model/profile/ProfileV2Response;", "kotlin.jvm.PlatformType", "it", "", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.i$c */
    static final class C10939c<T, R> implements Function<T, SingleSource<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C8761i f35642a;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/api/model/profile/ProfileV2Response;", "it", "Lcom/tinder/api/response/v2/DataResponse;", "kotlin.jvm.PlatformType", "apply"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.data.profile.i$c$1 */
        static final class C109381<T, R> implements Function<T, R> {
            /* renamed from: a */
            public static final C109381 f35641a = new C109381();

            C109381() {
            }

            public /* synthetic */ Object apply(Object obj) {
                return m43533a((DataResponse) obj);
            }

            @Nullable
            /* renamed from: a */
            public final ProfileV2Response m43533a(@NotNull DataResponse<ProfileV2Response> dataResponse) {
                C2668g.b(dataResponse, "it");
                return (ProfileV2Response) dataResponse.data();
            }
        }

        C10939c(C8761i c8761i) {
            this.f35642a = c8761i;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43534a((String) obj);
        }

        /* renamed from: a */
        public final C3960g<ProfileV2Response> m43534a(@NotNull String str) {
            C2668g.b(str, "it");
            return this.f35642a.f30760b.getUserProfile(str).e(C109381.f35641a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/data/profile/ProfileDataSyncResult;", "it", "Lcom/tinder/api/model/profile/ProfileV2Response;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.i$d */
    static final class C10940d<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C8761i f35643a;

        C10940d(C8761i c8761i) {
            this.f35643a = c8761i;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43535a((ProfileV2Response) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C8762k m43535a(@NotNull ProfileV2Response profileV2Response) {
            C2668g.b(profileV2Response, "it");
            User user = (User) this.f35643a.m37310a(profileV2Response.getUser(), (C2646o) this.f35643a.f30779u);
            PlusControlSettings plusControlSettings = (PlusControlSettings) this.f35643a.m37310a(profileV2Response.getPlusSettings(), (C2646o) this.f35643a.f30768j);
            SpotifySettings spotifySettings = (SpotifySettings) this.f35643a.m37311a(profileV2Response.getSpotify(), (Function1) ProfileClient$get$4$1.f43957a);
            BoostSettings boostSettings = (BoostSettings) this.f35643a.m37310a(profileV2Response.getBoost(), (C2646o) this.f35643a.f30770l);
            C8761i c8761i = this.f35643a;
            TinderSelect select = profileV2Response.getSelect();
            Object obj = null;
            SelectSettings selectSettings = (SelectSettings) c8761i.m37310a(select != null ? select.select() : null, (C2646o) r0.f35643a.f30771m);
            Tutorials tutorials = (Tutorials) r0.f35643a.m37310a(profileV2Response.getTutorials(), (C2646o) r0.f35643a.f30765g);
            String str = (String) r0.f35643a.m37311a(profileV2Response.getTravel(), (Function1) ProfileClient$get$4$2.f43958a);
            List list = (List) r0.f35643a.m37311a(profileV2Response.getNotifications(), (Function1) ProfileClient$get$4$3.f43959a);
            C8761i c8761i2 = r0.f35643a;
            PurchaseResponse purchase = profileV2Response.getPurchase();
            if (purchase != null) {
                obj = purchase.getPurchases();
            }
            return new C8762k(user, plusControlSettings, spotifySettings, boostSettings, selectSettings, tutorials, str, list, (Subscription) c8761i2.m37310a(obj, (C2646o) r0.f35643a.f30762d), (Products) r0.f35643a.m37311a(profileV2Response.getProducts(), (Function1) new ProfileClient$get$4$4(r0)), (LikeStatus) r0.f35643a.m37310a(profileV2Response.getLikes(), (C2646o) r0.f35643a.f30769k), (SuperlikeStatus) r0.f35643a.m37310a(profileV2Response.getSuperLikes(), (C2646o) r0.f35643a.f30763e), (Instagram) r0.f35643a.m37310a(profileV2Response.getInstagram(), (C2646o) r0.f35643a.f30772n), (FeedSettings) r0.f35643a.m37310a(profileV2Response.getActivityFeedSettings(), (C2646o) r0.f35643a.f30767i), (DiscoverySettings) r0.f35643a.m37310a(profileV2Response.getUser(), (C2646o) r0.f35643a.f30773o), (SmartPhotoSettings) r0.f35643a.m37310a(profileV2Response.getUser(), (C2646o) r0.f35643a.f30777s), (AccountSettings) r0.f35643a.m37310a(profileV2Response.getUser(), (C2646o) r0.f35643a.f30778t), (AccountInformation) r0.f35643a.m37310a(profileV2Response.getUser(), (C2646o) r0.f35643a.f30775q), (WebProfileSettings) r0.f35643a.m37310a(profileV2Response.getUser(), (C2646o) r0.f35643a.f30776r), (PlacesSettings) r0.f35643a.m37310a(profileV2Response.getPlacesSettings(), (C2646o) r0.f35643a.f30766h), (FacebookInformation) r0.f35643a.m37310a(profileV2Response.getFacebook(), (C2646o) r0.f35643a.f30780v), (Interests) r0.f35643a.m37310a(profileV2Response.getUser(), (C2646o) r0.f35643a.f30781w), (TopPhotoSettings) r0.f35643a.m37310a(profileV2Response.getTopPhoto(), (C2646o) r0.f35643a.f30782x), (GenderSettings) r0.f35643a.m37310a(profileV2Response.getUser(), (C2646o) r0.f35643a.f30783y), (EmailSettings) r0.f35643a.m37310a(profileV2Response.getEmailSettings(), (C2646o) r0.f35643a.f30784z), (Onboarding) r0.f35643a.m37310a(profileV2Response.getOnboarding(), (C2646o) r0.f35643a.f30758A));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/data/profile/ProfileDataSyncResult;", "it", "Lcom/tinder/domain/settings/feed/model/FeedSettings;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.i$e */
    static final class C10941e<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C10941e f35644a = new C10941e();

        C10941e() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43536a((FeedSettings) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C8762k m43536a(@NotNull FeedSettings feedSettings) {
            FeedSettings feedSettings2 = feedSettings;
            C2668g.b(feedSettings2, "it");
            return new C8762k(null, null, null, null, null, null, null, null, null, null, null, null, null, feedSettings2, null, null, null, null, null, null, null, null, null, null, null, null, 67100671, null);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/tinder/domain/meta/model/PlusControlSettings;", "response", "Lcom/tinder/api/response/v2/DataResponse;", "Lcom/tinder/api/model/profile/PlusControl;", "kotlin.jvm.PlatformType", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.i$f */
    static final class C10942f<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C8761i f35645a;

        C10942f(C8761i c8761i) {
            this.f35645a = c8761i;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43537a((DataResponse) obj);
        }

        @NotNull
        /* renamed from: a */
        public final PlusControlSettings m43537a(@NotNull DataResponse<PlusControl> dataResponse) {
            C2668g.b(dataResponse, "response");
            dataResponse = dataResponse.data();
            if (dataResponse == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.api.model.profile.PlusControl");
            }
            return this.f35645a.f30768j.m43476a((PlusControl) dataResponse);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/data/profile/ProfileDataSyncResult;", "it", "Lcom/tinder/domain/meta/model/PlusControlSettings;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.i$g */
    static final class C10943g<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C10943g f35646a = new C10943g();

        C10943g() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43538a((PlusControlSettings) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C8762k m43538a(@NotNull PlusControlSettings plusControlSettings) {
            PlusControlSettings plusControlSettings2 = plusControlSettings;
            C2668g.b(plusControlSettings2, "it");
            return new C8762k(null, plusControlSettings2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108861, null);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/tinder/domain/profile/model/settings/PlacesSettings;", "response", "Lcom/tinder/api/response/v2/DataResponse;", "Lcom/tinder/api/model/places/response/PlacesSettingsResponse;", "kotlin.jvm.PlatformType", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.i$h */
    static final class C10944h<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C8761i f35647a;

        C10944h(C8761i c8761i) {
            this.f35647a = c8761i;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43539a((DataResponse) obj);
        }

        @NotNull
        /* renamed from: a */
        public final PlacesSettings m43539a(@NotNull DataResponse<PlacesSettingsResponse> dataResponse) {
            C2668g.b(dataResponse, "response");
            dataResponse = dataResponse.data();
            if (dataResponse == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.api.model.places.response.PlacesSettingsResponse");
            }
            return this.f35647a.f30766h.m43520a(((PlacesSettingsResponse) dataResponse).getPlaces());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/data/profile/ProfileDataSyncResult;", "it", "Lcom/tinder/domain/profile/model/settings/PlacesSettings;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.i$i */
    static final class C10945i<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C10945i f35648a = new C10945i();

        C10945i() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43540a((PlacesSettings) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C8762k m43540a(@NotNull PlacesSettings placesSettings) {
            C2668g.b(placesSettings, "it");
            return new C8762k(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, placesSettings, null, null, null, null, null, null, 66584575, null);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/domain/profile/model/settings/SmartPhotoSettings;", "it", "Lcom/tinder/api/model/common/User;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.i$j */
    static final class C10946j<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C8761i f35649a;

        C10946j(C8761i c8761i) {
            this.f35649a = c8761i;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43541a((com.tinder.api.model.common.User) obj);
        }

        @NotNull
        /* renamed from: a */
        public final SmartPhotoSettings m43541a(@NotNull com.tinder.api.model.common.User user) {
            C2668g.b(user, "it");
            return this.f35649a.f30777s.m43482a(user);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/data/profile/ProfileDataSyncResult;", "it", "Lcom/tinder/domain/profile/model/settings/SmartPhotoSettings;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.i$k */
    static final class C10947k<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C10947k f35650a = new C10947k();

        C10947k() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43542a((SmartPhotoSettings) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C8762k m43542a(@NotNull SmartPhotoSettings smartPhotoSettings) {
            C2668g.b(smartPhotoSettings, "it");
            return new C8762k(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, smartPhotoSettings, null, null, null, null, null, null, null, null, null, null, 67076095, null);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/data/profile/ProfileDataSyncResult;", "it", "Lcom/tinder/api/model/common/User;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.i$l */
    static final class C10948l<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C8761i f35651a;

        C10948l(C8761i c8761i) {
            this.f35651a = c8761i;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43543a((com.tinder.api.model.common.User) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C8762k m43543a(@NotNull com.tinder.api.model.common.User user) {
            Object obj = user;
            C2668g.b(obj, "it");
            return new C8762k((User) this.f35651a.m37310a(obj, (C2646o) this.f35651a.f30779u), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (GenderSettings) this.f35651a.m37310a(obj, (C2646o) this.f35651a.f30783y), null, null, 58720254, null);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/data/profile/ProfileDataSyncResult;", "it", "Lcom/tinder/api/model/common/User;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.i$m */
    static final class C10949m<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C8761i f35652a;

        C10949m(C8761i c8761i) {
            this.f35652a = c8761i;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43544a((com.tinder.api.model.common.User) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C8762k m43544a(@NotNull com.tinder.api.model.common.User user) {
            Object obj = user;
            C2668g.b(obj, "it");
            return new C8762k((User) this.f35652a.m37310a(obj, (C2646o) this.f35652a.f30779u), null, null, null, null, null, null, null, null, null, null, null, null, null, (DiscoverySettings) this.f35652a.m37310a(obj, (C2646o) this.f35652a.f30773o), null, null, null, null, null, null, null, null, null, null, null, 67092478, null);
        }
    }

    @Inject
    public C8761i(@NotNull TinderApi tinderApi, @NotNull C8753a c8753a, @NotNull C10849m c10849m, @NotNull aq aqVar, @NotNull ag agVar, @NotNull com.tinder.data.profile.adapter.aq aqVar2, @NotNull C10924y c10924y, @NotNull C10915e c10915e, @NotNull aa aaVar, @NotNull C10920q c10920q, @NotNull C10843a c10843a, @NotNull C10848k c10848k, @NotNull C10742q c10742q, @NotNull C10846g c10846g, @NotNull C8754g c8754g, @NotNull C10913a c10913a, @NotNull as asVar, @NotNull am amVar, @NotNull C10914c c10914c, @NotNull C10844c c10844c, @NotNull C10917k c10917k, @NotNull C10919o c10919o, @NotNull ao aoVar, @NotNull C10918m c10918m, @NotNull C10916i c10916i, @NotNull C10921s c10921s) {
        C8761i c8761i = this;
        TinderApi tinderApi2 = tinderApi;
        C8753a c8753a2 = c8753a;
        C10849m c10849m2 = c10849m;
        aq aqVar3 = aqVar;
        ag agVar2 = agVar;
        com.tinder.data.profile.adapter.aq aqVar4 = aqVar2;
        C10924y c10924y2 = c10924y;
        C10915e c10915e2 = c10915e;
        aa aaVar2 = aaVar;
        C10920q c10920q2 = c10920q;
        C10843a c10843a2 = c10843a;
        C10848k c10848k2 = c10848k;
        C10742q c10742q2 = c10742q;
        C10846g c10846g2 = c10846g;
        C8754g c8754g2 = c8754g;
        C10913a c10913a2 = c10913a;
        C2668g.b(tinderApi2, "api");
        C2668g.b(c8753a2, "feedSettingsApiClient");
        C2668g.b(c10849m2, "subscriptionAdapter");
        C2668g.b(aqVar3, "superlikeStatusAdapter");
        C2668g.b(agVar2, "productsAdapter");
        C2668g.b(aqVar4, "tutorialsAdapter");
        C2668g.b(c10924y2, "placesAdapter");
        C2668g.b(c10915e2, "feedSettingsAdapter");
        C2668g.b(aaVar2, "plusControlSettingsAdapter");
        C2668g.b(c10920q2, "likeStatusAdapter");
        C2668g.b(c10843a2, "boostSettingsAdapter");
        C2668g.b(c10848k2, "selectSettingsAdapter");
        C2668g.b(c10742q2, "instagramDomainApiAdapter");
        C2668g.b(c10846g2, "discoverySettingsAdapter");
        C2668g.b(c8754g2, "discoverySettingsRequestAdapter");
        C2668g.b(c10913a, "accountInfoAdapter");
        C2668g.b(asVar, "webProfileSettingsAdapter");
        C2668g.b(amVar, "smartPhotoSettingsAdapter");
        C2668g.b(c10914c, "accountSettingsAdapter");
        C2668g.b(c10844c, "coreUserAdapter");
        C2668g.b(c10917k, "facebookInformationAdapter");
        C2668g.b(c10919o, "interestsAdapter");
        C2668g.b(aoVar, "topPhotoSettingsAdapter");
        C2668g.b(c10918m, "genderSettingsAdapter");
        C2668g.b(c10916i, "emailSettingsAdapter");
        C2668g.b(c10921s, "onboardingAdapter");
        C10913a c10913a3 = c10913a;
        this.f30760b = tinderApi2;
        this.f30761c = c8753a2;
        this.f30762d = c10849m2;
        this.f30763e = aqVar3;
        this.f30764f = agVar2;
        this.f30765g = aqVar4;
        this.f30766h = c10924y2;
        this.f30767i = c10915e2;
        this.f30768j = aaVar2;
        this.f30769k = c10920q2;
        this.f30770l = c10843a2;
        this.f30771m = c10848k2;
        this.f30772n = c10742q2;
        this.f30773o = c10846g2;
        this.f30774p = c8754g;
        this.f30775q = c10913a3;
        am amVar2 = amVar;
        this.f30776r = asVar;
        this.f30777s = amVar2;
        C10844c c10844c2 = c10844c;
        this.f30778t = c10914c;
        this.f30779u = c10844c2;
        C10919o c10919o2 = c10919o;
        this.f30780v = c10917k;
        this.f30781w = c10919o2;
        C10918m c10918m2 = c10918m;
        this.f30782x = aoVar;
        this.f30783y = c10918m2;
        C10921s c10921s2 = c10921s;
        this.f30784z = c10916i;
        this.f30758A = c10921s2;
    }

    @NotNull
    /* renamed from: a */
    public final C3960g<C8762k> m37338a(@NotNull ProfileDataRequest profileDataRequest) {
        C2668g.b(profileDataRequest, "request");
        profileDataRequest = C3959e.fromIterable(profileDataRequest.getComponents()).map(new C10936a(this)).distinct().toList().e(C10937b.f35640a).a(new C10939c(this)).e(new C10940d(this));
        C2668g.a(profileDataRequest, "Observable.fromIterable(…          )\n            }");
        return profileDataRequest;
    }

    @NotNull
    /* renamed from: a */
    public final C3960g<C8762k> m37339a(@NotNull ProfileUpdateRequest profileUpdateRequest) {
        C8761i c8761i = this;
        ProfileUpdateRequest profileUpdateRequest2 = profileUpdateRequest;
        C2668g.b(profileUpdateRequest2, "request");
        C3960g<C8762k> e;
        if (profileUpdateRequest2 instanceof FeedSettingsUpdateRequest) {
            e = c8761i.f30761c.m37280a(((FeedSettingsUpdateRequest) profileUpdateRequest2).getSettings()).e(C10941e.f35644a);
            C2668g.a(e, "feedSettingsApiClient.sa…sult(feedSettings = it) }");
            return e;
        } else if (profileUpdateRequest2 instanceof TutorialsUpdateRequest) {
            TutorialsUpdateRequest tutorialsUpdateRequest = (TutorialsUpdateRequest) profileUpdateRequest2;
            r2 = c8761i.f30760b.confirmTutorials(c8761i.f30765g.m43491a(tutorialsUpdateRequest.getTutorials()));
            C8762k c8762k = r3;
            r3 = new C8762k(null, null, null, null, null, tutorialsUpdateRequest.getTutorials(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108831, null);
            e = r2.a(c8762k);
            C2668g.a(e, "api.confirmTutorials(tut…als = request.tutorials))");
            return e;
        } else if (profileUpdateRequest2 instanceof PlusControlUpdateRequest) {
            e = c8761i.f30760b.updatePlusControlSettings(c8761i.f30768j.m43475a(((PlusControlUpdateRequest) profileUpdateRequest2).getPlusControl())).e(new C10942f(c8761i)).e(C10943g.f35646a);
            C2668g.a(e, "api.updatePlusControlSet…esult(plusControl = it) }");
            return e;
        } else if (profileUpdateRequest2 instanceof PlacesUpdateRequest) {
            e = c8761i.f30760b.updatePlacesSettings(new UpdatePlacesSettingsRequestBody(c8761i.f30766h.m43519a(((PlacesUpdateRequest) profileUpdateRequest2).getPlacesSettings()))).e(new C10944h(c8761i)).e(C10945i.f35648a);
            C2668g.a(e, "api.updatePlacesSettings…lt(placesSettings = it) }");
            return e;
        } else if (profileUpdateRequest2 instanceof SmartPhotosUpdateRequest) {
            e = c8761i.f30760b.updatePhotoOptimizerEnabled(new UpdatePhotoOptimizerEnabledRequestBody(((SmartPhotosUpdateRequest) profileUpdateRequest2).getSmartPhotoSettings().getEnabled())).e(new C10946j(c8761i)).e(C10947k.f35650a);
            C2668g.a(e, "api.updatePhotoOptimizer…martPhotoSettings = it) }");
            return e;
        } else if (profileUpdateRequest2 instanceof EmailSettingsUpdateRequest) {
            EmailSettingsUpdateRequest emailSettingsUpdateRequest = (EmailSettingsUpdateRequest) profileUpdateRequest2;
            r2 = c8761i.f30760b.updateEmailSettings(c8761i.f30784z.m43502a(emailSettingsUpdateRequest.getEmailSettings()));
            C8762k c8762k2 = r3;
            r3 = new C8762k(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, emailSettingsUpdateRequest.getEmailSettings(), null, 50331647, null);
            e = r2.a(c8762k2);
            C2668g.a(e, "api.updateEmailSettings(…= request.emailSettings))");
            return e;
        } else if (profileUpdateRequest2 instanceof ProfileUserUpdateRequest) {
            ProfileUserUpdateRequest profileUserUpdateRequest = (ProfileUserUpdateRequest) profileUpdateRequest2;
            String bio = profileUserUpdateRequest.getBio();
            Value gender = profileUserUpdateRequest.getGender();
            e = c8761i.f30760b.updateProfileUser(new ProfileUserUpdateRequestBody(bio, gender != null ? Integer.valueOf(gender.id()) : null, profileUserUpdateRequest.getCustomGender(), profileUserUpdateRequest.getShowGenderOnProfile())).e(new C10948l(c8761i));
            C2668g.a(e, "api.updateProfileUser(re…  )\n                    }");
            return e;
        } else if (profileUpdateRequest2 instanceof DiscoverySettingsUpdateRequest) {
            e = c8761i.f30760b.updateDiscoverySettings(c8761i.f30774p.m37289a((DiscoverySettingsUpdateRequest) profileUpdateRequest2)).e(new C10949m(c8761i));
            C2668g.a(e, "api.updateDiscoverySetti…  )\n                    }");
            return e;
        } else if (profileUpdateRequest2 instanceof EmailLastDismissedAtUpdateRequest) {
            C3956a postEmailLastDismissedAtTime = c8761i.f30760b.postEmailLastDismissedAtTime(new LastEmailDismissedAtBody(((EmailLastDismissedAtUpdateRequest) profileUpdateRequest2).getEmailLastDismissedAt()));
            C8762k c8762k3 = r2;
            C8762k c8762k4 = new C8762k(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108863, null);
            e = postEmailLastDismissedAtTime.a(c8762k3);
            C2668g.a(e, "api.postEmailLastDismiss…(ProfileDataSyncResult())");
            return e;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    private final Map<ProfileOption<Object>, String> m37314a() {
        return ae.a(new Pair[]{C15811g.a(ProfileOption.User.INSTANCE, ManagerWebServices.PARAM_USER), C15811g.a(ProfileOption.PlusControl.INSTANCE, "plus_control"), C15811g.a(Spotify.INSTANCE, ManagerWebServices.PARAM_SPOTIFY), C15811g.a(Boost.INSTANCE, ManagerWebServices.PARAM_BOOST), C15811g.a(Select.INSTANCE, "select"), C15811g.a(ProfileOption.Tutorials.INSTANCE, "tutorials,onboarding"), C15811g.a(Passport.INSTANCE, ManagerWebServices.PARAM_TRAVEL), C15811g.a(Notifications.INSTANCE, ManagerWebServices.PARAM_NOTIFICATIONS), C15811g.a(Purchase.INSTANCE, "purchase"), C15811g.a(ProfileOption.Products.INSTANCE, ManagerWebServices.PARAM_PRODUCTS), C15811g.a(Likes.INSTANCE, ManagerWebServices.FB_PARAM_LIKES), C15811g.a(SuperLikes.INSTANCE, ManagerWebServices.PARAM_SUPERLIKES), C15811g.a(Facebook.INSTANCE, AnalyticsConstants.VALUE_FACEBOOK), C15811g.a(ProfileOption.Instagram.INSTANCE, ManagerWebServices.IG_PARAM_INSTAGRAM), C15811g.a(ActivityFeed.INSTANCE, "feed_control"), C15811g.a(Places.INSTANCE, "places"), C15811g.a(Discovery.INSTANCE, ManagerWebServices.PARAM_USER), C15811g.a(AccountInfo.INSTANCE, ManagerWebServices.PARAM_USER), C15811g.a(ProfileOption.AccountSettings.INSTANCE, ManagerWebServices.PARAM_USER), C15811g.a(WebProfile.INSTANCE, ManagerWebServices.PARAM_USER), C15811g.a(SmartPhoto.INSTANCE, ManagerWebServices.PARAM_USER), C15811g.a(ProfileOption.Interests.INSTANCE, ManagerWebServices.PARAM_USER), C15811g.a(TopPhoto.INSTANCE, "top_photo"), C15811g.a(ShowGender.INSTANCE, ManagerWebServices.PARAM_USER), C15811g.a(ProfileOption.EmailSettings.INSTANCE, "email_settings"), C15811g.a(ProfileOption.Onboarding.INSTANCE, "onboarding")});
    }

    /* renamed from: a */
    private final <API, DOMAIN> DOMAIN m37310a(API api, C2646o<DOMAIN, API> c2646o) {
        return m37311a((Object) api, (Function1) new ProfileClient$mapToDomain$1(c2646o));
    }

    /* renamed from: a */
    private final <API, DOMAIN> DOMAIN m37311a(API api, Function1<? super API, ? extends DOMAIN> function1) {
        return api != null ? function1.invoke(api) : null;
    }

    /* renamed from: a */
    private final String m37313a(@NotNull ProfileOption<?> profileOption) {
        String str = (String) this.f30759a.get(profileOption);
        if (str != null) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Load ");
        stringBuilder.append(profileOption);
        stringBuilder.append(" profile option isn't supported yet.");
        throw new UnsupportedOperationException(stringBuilder.toString());
    }
}
