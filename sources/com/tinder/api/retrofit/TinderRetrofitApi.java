package com.tinder.api.retrofit;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.tinder.api.TinderApi;
import com.tinder.api.TinderUserApi;
import com.tinder.api.giphy.GiphyApiResponse;
import com.tinder.api.model.activityfeed.ActivityFeedResponse;
import com.tinder.api.model.activityfeed.FeedCommentRequest;
import com.tinder.api.model.activityfeed.FeedCommentResponse;
import com.tinder.api.model.auth.AccountKitValidateRequest;
import com.tinder.api.model.auth.LogoutRequestBody;
import com.tinder.api.model.common.ApiMessage;
import com.tinder.api.model.common.DeleteSuperLikeResponse;
import com.tinder.api.model.common.NetworkError;
import com.tinder.api.model.common.Photo;
import com.tinder.api.model.common.User;
import com.tinder.api.model.fastmatch.FastMatchPreviewResponse;
import com.tinder.api.model.fastmatch.adapter.FastMatchPreviewResponseAdapter;
import com.tinder.api.model.intropricing.DiscountSponsoredMessage;
import com.tinder.api.model.meta.Meta;
import com.tinder.api.model.meta.SuperLikes;
import com.tinder.api.model.meta.v2.MetaV2Response;
import com.tinder.api.model.places.request.CorrectLocationRequest;
import com.tinder.api.model.places.request.MarkPlaceRecsViewedRequest;
import com.tinder.api.model.places.request.MarkPlaceViewedRequest;
import com.tinder.api.model.places.request.PlacesVisitRequest;
import com.tinder.api.model.places.response.CorrectLocationResponse;
import com.tinder.api.model.places.response.PlacesRecsResponse;
import com.tinder.api.model.places.response.PlacesResponse;
import com.tinder.api.model.places.response.PlacesSettingsResponse;
import com.tinder.api.model.profile.ActivityFeedSettings;
import com.tinder.api.model.profile.DiscoverySettingsRequestBody;
import com.tinder.api.model.profile.EmailSettings;
import com.tinder.api.model.profile.ImageUploadResponse;
import com.tinder.api.model.profile.PlusControl;
import com.tinder.api.model.profile.ProfilePhotosResponse;
import com.tinder.api.model.profile.ProfileUserUpdateRequestBody;
import com.tinder.api.model.profile.ProfileV2Response;
import com.tinder.api.model.profile.Share;
import com.tinder.api.model.profile.UpdateJobRequestBody;
import com.tinder.api.model.profile.UpdateJobsRequestBody;
import com.tinder.api.model.profile.UpdatePhotoOptimizerEnabledRequestBody;
import com.tinder.api.model.profile.UpdatePlacesSettingsRequestBody;
import com.tinder.api.model.profile.UpdateSchoolRequestBody;
import com.tinder.api.model.profile.UpdateUsernameRequestBody;
import com.tinder.api.model.purchase.BillingReceipt;
import com.tinder.api.model.purchase.PurchaseDiscountEligibility;
import com.tinder.api.model.purchase.PurchaseLogRequest;
import com.tinder.api.model.purchase.PurchaseLogResponse;
import com.tinder.api.model.purchase.PurchaseValidationWrapper;
import com.tinder.api.model.purchase.PurchasedSkus;
import com.tinder.api.model.pushnotifications.ResetPushNotificationRequest;
import com.tinder.api.model.rating.LikeRatingResponse;
import com.tinder.api.model.rating.PassRatingResponse;
import com.tinder.api.model.rating.SuperLikeRatingResponse;
import com.tinder.api.model.settings.PushSettings;
import com.tinder.api.model.superlikeable.SuperLikeableGameResponse.Data;
import com.tinder.api.model.superlikeable.SuperLikeableGameResponse.Empty;
import com.tinder.api.model.toppicks.TopPicksRecResponse;
import com.tinder.api.model.updates.Updates;
import com.tinder.api.model.updates.UpdatesRequestBody;
import com.tinder.api.request.AddThirdPartyPhotoBody;
import com.tinder.api.request.DeleteProfilePhotoBody;
import com.tinder.api.request.DiscoverabilitySettingsRequest;
import com.tinder.api.request.FeedbackRequestBody;
import com.tinder.api.request.GenderSettingsRequest;
import com.tinder.api.request.HideProfileItemsRequestBody;
import com.tinder.api.request.InstagramAuthRequestBody;
import com.tinder.api.request.InstagramAuthResponse;
import com.tinder.api.request.InstagramErrorResponse;
import com.tinder.api.request.InstagramLogoutRequestBody;
import com.tinder.api.request.LastEmailDismissedAtBody;
import com.tinder.api.request.LikeRatingRequest;
import com.tinder.api.request.MetaV2RequestBody;
import com.tinder.api.request.OrderProfilePhotosBody;
import com.tinder.api.request.PassRatingRequest;
import com.tinder.api.request.PauseAccountRequest;
import com.tinder.api.request.PhotoOptimizerEnableRequest;
import com.tinder.api.request.PushSettingsRequest;
import com.tinder.api.request.ReportUserRequest;
import com.tinder.api.request.SchoolRequestBody;
import com.tinder.api.request.SendMessageRequestBody;
import com.tinder.api.request.SuperLikeRatingRequest;
import com.tinder.api.request.SuperLikeableActionRequestBody.Skip;
import com.tinder.api.request.SuperLikeableActionRequestBody.SuperLike;
import com.tinder.api.request.UpdateProfileRequest;
import com.tinder.api.response.AddThirdPartyPhotoResponse;
import com.tinder.api.response.FastMatchCountResponse;
import com.tinder.api.response.LocationResponse;
import com.tinder.api.response.MatchResponse;
import com.tinder.api.response.ProfileResponse;
import com.tinder.api.response.RecsResponse;
import com.tinder.api.response.UserResponse;
import com.tinder.api.response.v2.DataResponse;
import com.tinder.api.response.v2.EmptyResponse;
import com.tinder.api.response.v2.FastMatchNewCountResponse;
import com.tinder.api.response.v2.FastMatchRecsResponse;
import com.tinder.common.p076a.C2640a;
import io.reactivex.C3956a;
import io.reactivex.C3960g;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java8.util.Objects;
import java8.util.Optional;
import okhttp3.Authenticator;
import okhttp3.C15968t;
import okhttp3.C17690n.C15960b;
import okhttp3.C17692o;
import okhttp3.C17692o.C15961a;
import okhttp3.Interceptor;
import retrofit2.Response;
import retrofit2.adapter.rxjava.HttpException;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.moshi.MoshiConverterFactory;
import rx.Completable;
import rx.Observable;
import rx.Single;

public class TinderRetrofitApi implements TinderApi, TinderUserApi {
    private final TinderImageUploadService imageUploadService;
    private final C5987p moshi;
    private final NoAuthenticatorTinderApiRetrofitService noAuthenticatorService;
    private final Map<Class<?>, RetrofitErrorBodyAwareTransformer<?>> retrofitErrorBodyAwareTransformers;
    private final TinderApiRetrofitService retrofitService;

    public static class Builder {
        private TinderAuthenticator authenticator;
        private Set<Interceptor> headerInterceptors;
        private String imageUploadBaseUrl;
        private C5987p moshi;
        private C17692o okHttpClient;
        private final retrofit2.Retrofit.Builder retrofitBuilder;
        private Map<Class<?>, RetrofitErrorBodyAwareTransformer<?>> retrofitErrorBodyAwareTransformers;

        public Builder(retrofit2.Retrofit.Builder builder, Map<Class<?>, RetrofitErrorBodyAwareTransformer<?>> map) {
            C2640a.a(builder);
            this.retrofitErrorBodyAwareTransformers = map;
            this.retrofitBuilder = builder;
        }

        public Builder okHttpClient(C17692o c17692o) {
            this.okHttpClient = c17692o;
            return this;
        }

        public Builder rootUrl(@NonNull String str) {
            this.retrofitBuilder.baseUrl(str);
            return this;
        }

        public Builder imageUploadUrl(@NonNull String str) {
            this.imageUploadBaseUrl = str;
            return this;
        }

        public Builder headerInterceptors(Set<Interceptor> set) {
            this.headerInterceptors = set;
            return this;
        }

        public Builder authenticator(TinderAuthenticator tinderAuthenticator) {
            this.authenticator = tinderAuthenticator;
            return this;
        }

        public Builder rxJavaCallAdapterFactory(RxJavaCallAdapterFactory rxJavaCallAdapterFactory) {
            this.retrofitBuilder.addCallAdapterFactory(rxJavaCallAdapterFactory);
            return this;
        }

        public Builder rxJava2CallAdapterFactory(RxJava2CallAdapterFactory rxJava2CallAdapterFactory) {
            this.retrofitBuilder.addCallAdapterFactory(rxJava2CallAdapterFactory);
            return this;
        }

        public Builder retrofitErrorBodyAwareTransformers(Map<Class<?>, RetrofitErrorBodyAwareTransformer<?>> map) {
            this.retrofitErrorBodyAwareTransformers = map;
            return this;
        }

        public Builder moshi(C5987p c5987p) {
            this.moshi = c5987p;
            this.retrofitBuilder.addConverterFactory(MoshiConverterFactory.create(c5987p));
            return this;
        }

        public TinderRetrofitApi build() {
            C15961a z = this.okHttpClient.z();
            z.a().addAll(this.headerInterceptors);
            this.okHttpClient = z.b();
            return new TinderRetrofitApi(createTinderApiRetrofitService(), createNoAuthenticatorService(), createImageUploadService(), this.retrofitErrorBodyAwareTransformers, this.moshi);
        }

        private TinderApiRetrofitService createTinderApiRetrofitService() {
            return (TinderApiRetrofitService) this.retrofitBuilder.client(this.okHttpClient.z().a(this.authenticator).b()).build().create(TinderApiRetrofitService.class);
        }

        private NoAuthenticatorTinderApiRetrofitService createNoAuthenticatorService() {
            return (NoAuthenticatorTinderApiRetrofitService) this.retrofitBuilder.client(this.okHttpClient.z().a(Authenticator.f49061a).b()).build().create(NoAuthenticatorTinderApiRetrofitService.class);
        }

        private TinderImageUploadService createImageUploadService() {
            return (TinderImageUploadService) this.retrofitBuilder.client(this.okHttpClient.z().a(this.authenticator).b()).baseUrl(this.imageUploadBaseUrl).build().create(TinderImageUploadService.class);
        }
    }

    private TinderRetrofitApi(TinderApiRetrofitService tinderApiRetrofitService, NoAuthenticatorTinderApiRetrofitService noAuthenticatorTinderApiRetrofitService, TinderImageUploadService tinderImageUploadService, Map<Class<?>, RetrofitErrorBodyAwareTransformer<?>> map, C5987p c5987p) {
        this.retrofitService = tinderApiRetrofitService;
        this.noAuthenticatorService = noAuthenticatorTinderApiRetrofitService;
        this.moshi = c5987p;
        this.imageUploadService = tinderImageUploadService;
        this.retrofitErrorBodyAwareTransformers = map;
    }

    public Observable<Meta> getMeta(int i) {
        return this.retrofitService.getMeta(i);
    }

    public Single<Updates> getUpdates(UpdatesRequestBody updatesRequestBody, boolean z, String str) {
        return this.retrofitService.getUpdates(updatesRequestBody, z, str);
    }

    public Observable<PurchaseValidationWrapper> validatePurchase(@NonNull BillingReceipt billingReceipt) {
        return this.retrofitService.validatePurchase(billingReceipt).h(new TinderRetrofitApi$$Lambda$0(this));
    }

    final /* synthetic */ rx.Observable lambda$validatePurchase$0$TinderRetrofitApi(retrofit2.Response r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r4.isSuccessful();
        if (r0 == 0) goto L_0x0054;
    L_0x0006:
        r0 = r3.moshi;
        r1 = java.util.Map.class;
        r0 = r0.a(r1);
        r4 = r4.body();
        r4 = r0.toJson(r4);
        r0 = r3.moshi;	 Catch:{ Throwable -> 0x0039 }
        r1 = com.tinder.api.model.purchase.PurchaseValidation.class;	 Catch:{ Throwable -> 0x0039 }
        r0 = r0.a(r1);	 Catch:{ Throwable -> 0x0039 }
        r0 = r0.fromJson(r4);	 Catch:{ Throwable -> 0x0039 }
        r0 = (com.tinder.api.model.purchase.PurchaseValidation) r0;	 Catch:{ Throwable -> 0x0039 }
        r1 = com.tinder.api.model.purchase.PurchaseValidationWrapper.builder();	 Catch:{ Throwable -> 0x0039 }
        r0 = r1.purchaseValidation(r0);	 Catch:{ Throwable -> 0x0039 }
        r0 = r0.responseBody(r4);	 Catch:{ Throwable -> 0x0039 }
        r0 = r0.build();	 Catch:{ Throwable -> 0x0039 }
        r0 = rx.Observable.a(r0);	 Catch:{ Throwable -> 0x0039 }
        return r0;
    L_0x0039:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Cannot parse validation response: ";
        r1.append(r2);
        r1.append(r4);
        r4 = r1.toString();
        r0.<init>(r4);
        r4 = rx.Observable.a(r0);
        return r4;
    L_0x0054:
        r0 = new retrofit2.adapter.rxjava.HttpException;
        r0.<init>(r4);
        r4 = rx.Observable.a(r0);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.retrofit.TinderRetrofitApi.lambda$validatePurchase$0$TinderRetrofitApi(retrofit2.Response):rx.Observable");
    }

    public Observable<PurchaseLogResponse> sendPurchaseLogs(@NonNull PurchaseLogRequest purchaseLogRequest) {
        return this.retrofitService.sendPurchaseLogs(purchaseLogRequest);
    }

    public C3960g<DataResponse<PurchaseDiscountEligibility>> checkPurchaseDiscountEligibility(@NonNull PurchasedSkus purchasedSkus) {
        return this.retrofitService.checkPurchaseDiscountEligibility(purchasedSkus);
    }

    public C3960g<DataResponse<DiscountSponsoredMessage>> fetchDiscountSponsoredMessage(@NonNull String str, @NonNull String str2) {
        return this.retrofitService.fetchDiscountSponsoredMessage(str, str2);
    }

    public Single<Response<RecsResponse>> fetchRecs(@NonNull String str) {
        return this.retrofitService.fetchRecs(str);
    }

    @Deprecated
    public Observable<SuperLikes> getSuperLikeStatus() {
        return this.retrofitService.getSuperlikeStatus().k(TinderRetrofitApi$$Lambda$1.$instance);
    }

    public Completable confirmTutorialViewed() {
        return this.retrofitService.confirmTutorialViewed();
    }

    public C3956a updateJob(UpdateJobRequestBody updateJobRequestBody) {
        return this.retrofitService.updateJob(updateJobRequestBody);
    }

    public C3956a updateJobForSMSUser(@NonNull UpdateJobsRequestBody updateJobsRequestBody) {
        return this.retrofitService.updateJobForSMSUser(updateJobsRequestBody);
    }

    public C3956a deleteJob() {
        return this.retrofitService.deleteJob();
    }

    public C3956a deleteSchool() {
        return this.retrofitService.deleteSchool();
    }

    public Observable<ProfilePhotosResponse> getProfilePhotos() {
        return this.retrofitService.getProfilePhotos().h(TinderRetrofitApi$$Lambda$2.$instance);
    }

    static final /* synthetic */ Observable lambda$getProfilePhotos$1$TinderRetrofitApi(Response response) {
        if (response.isSuccessful()) {
            return Observable.a(response.body());
        }
        return Observable.a(new HttpException(response));
    }

    public C3960g<List<Photo>> setProfilePhotoOrder(OrderProfilePhotosBody orderProfilePhotosBody) {
        return this.retrofitService.setProfilePhotoOrder(orderProfilePhotosBody);
    }

    public C3960g<List<Photo>> deleteProfilePhoto(DeleteProfilePhotoBody deleteProfilePhotoBody) {
        return this.retrofitService.deleteProfilePhoto(deleteProfilePhotoBody);
    }

    public C3960g<DataResponse<ActivityFeedSettings>> saveActivityFeedSettings(@NonNull ActivityFeedSettings activityFeedSettings) {
        return this.retrofitService.saveActivityFeedSettings(activityFeedSettings);
    }

    public C3956a confirmTutorials(List<String> list) {
        return this.retrofitService.confirmTutorials(list);
    }

    public C3960g<DataResponse<PlusControl>> updatePlusControlSettings(PlusControl plusControl) {
        return this.retrofitService.savePlusControlSettings(plusControl);
    }

    public C3960g<DataResponse<PlacesSettingsResponse>> updatePlacesSettings(UpdatePlacesSettingsRequestBody updatePlacesSettingsRequestBody) {
        return this.retrofitService.savePlacesSettings(updatePlacesSettingsRequestBody);
    }

    public C3960g<AddThirdPartyPhotoResponse> addThirdPartyPhoto(AddThirdPartyPhotoBody addThirdPartyPhotoBody) {
        return this.retrofitService.addThirdPartyPhoto(addThirdPartyPhotoBody);
    }

    public Completable putSchool(SchoolRequestBody schoolRequestBody) {
        return this.retrofitService.putSchool(schoolRequestBody);
    }

    public C3956a updateSchool(UpdateSchoolRequestBody updateSchoolRequestBody) {
        return this.retrofitService.updateSchool(updateSchoolRequestBody);
    }

    public C3956a updateSchoolForSMSUser(UpdateSchoolRequestBody updateSchoolRequestBody) {
        return this.retrofitService.updateSchoolForSMSUser(updateSchoolRequestBody);
    }

    public Observable<User> postToggleSmartPhotos(@NonNull PhotoOptimizerEnableRequest photoOptimizerEnableRequest) {
        return this.retrofitService.postToggleSmartPhotos(photoOptimizerEnableRequest);
    }

    public Observable<User> postBlendToProfile(@NonNull Map<String, String> map) {
        return this.retrofitService.postBlendToProfile(map);
    }

    public C3960g<EmptyResponse> updateUsername(UpdateUsernameRequestBody updateUsernameRequestBody) {
        return this.retrofitService.putUsername(updateUsernameRequestBody).e(TinderRetrofitApi$$Lambda$3.$instance);
    }

    public C3960g<EmptyResponse> createUsername(UpdateUsernameRequestBody updateUsernameRequestBody) {
        return this.retrofitService.postUsername(updateUsernameRequestBody).e(TinderRetrofitApi$$Lambda$4.$instance);
    }

    public C3960g<EmptyResponse> deleteUsername() {
        return this.retrofitService.deleteUsername().e(TinderRetrofitApi$$Lambda$5.$instance);
    }

    public Observable<User> getUserProfile() {
        return this.retrofitService.getUserProfile();
    }

    public Single<DataResponse<MetaV2Response>> getMetaV2(MetaV2RequestBody metaV2RequestBody) {
        return this.retrofitService.getMetaV2(metaV2RequestBody);
    }

    public Observable<ProfileResponse> getUserProfileIncluding(String str) {
        return this.retrofitService.loadUserProfileIncluding(str);
    }

    public C3960g<DataResponse<ProfileV2Response>> getUserProfile(String str) {
        return this.retrofitService.getProfile(str);
    }

    public Observable<com.tinder.api.response.EmptyResponse> saveGender(@NonNull GenderSettingsRequest genderSettingsRequest) {
        return this.retrofitService.saveGender(genderSettingsRequest).k(TinderRetrofitApi$$Lambda$6.$instance);
    }

    public Observable<User> saveDiscoverability(@NonNull DiscoverabilitySettingsRequest discoverabilitySettingsRequest) {
        return this.retrofitService.saveDiscoverability(discoverabilitySettingsRequest).h(TinderRetrofitApi$$Lambda$7.$instance);
    }

    static final /* synthetic */ Observable lambda$saveDiscoverability$6$TinderRetrofitApi(Response response) {
        if (response.isSuccessful()) {
            return Observable.a(response.body());
        }
        return Observable.a(new HttpException(response));
    }

    public Observable<User> postHideProfileItems(@NonNull HideProfileItemsRequestBody hideProfileItemsRequestBody) {
        return this.retrofitService.postHideProfileItems(hideProfileItemsRequestBody);
    }

    public Single<MatchResponse> getMatch(@NonNull String str) {
        return this.retrofitService.getMatch(str);
    }

    public Completable muteMatch(@NonNull String str) {
        return this.retrofitService.muteMatch(str).b();
    }

    public Single<ApiMessage> sendMessage(String str, SendMessageRequestBody sendMessageRequestBody) {
        return this.retrofitService.sendMessage(str, sendMessageRequestBody);
    }

    public Completable likeMatchMessage(String str) {
        return this.retrofitService.likeMatchMessage(str).b();
    }

    public Completable deleteMatchMessageLike(String str) {
        return this.retrofitService.deleteMessageLike(str).b();
    }

    public Observable<Response<Share>> getShareLink(@NonNull String str) {
        return this.retrofitService.getShareLink(str);
    }

    public Completable unMuteMatch(@NonNull String str) {
        return this.retrofitService.unMuteMatch(str).b();
    }

    public Completable reportMatch(@NonNull String str, @NonNull ReportUserRequest reportUserRequest) {
        return this.retrofitService.reportMatch(str, reportUserRequest).b();
    }

    public Observable<Response<LikeRatingResponse>> reportRec(@NonNull String str, @NonNull ReportUserRequest reportUserRequest) {
        return this.retrofitService.reportRec(str, reportUserRequest);
    }

    public Completable unMatch(@NonNull String str) {
        return this.retrofitService.unMatch(str).b();
    }

    public Observable<User> saveProfileSettings(@NonNull UpdateProfileRequest updateProfileRequest) {
        return this.retrofitService.saveProfileSettings(updateProfileRequest);
    }

    public Observable<LocationResponse> getPopularLocations(@NonNull String str) {
        return this.retrofitService.getPopularLocations(str);
    }

    public Observable<LocationResponse> getSearchLocation(@NonNull String str, @NonNull String str2) {
        return this.retrofitService.getSearchLocation(str, str2);
    }

    public Observable<LocationResponse> getSearchPinLocation(@NonNull String str, @NonNull Double d, @NonNull Double d2) {
        return this.retrofitService.getSearchPinLocation(str, d, d2);
    }

    public Observable<UserResponse> getUser(@NonNull String str) {
        return this.retrofitService.getUser(str);
    }

    public Observable<Response<LikeRatingResponse>> like(@NonNull String str, @NonNull LikeRatingRequest likeRatingRequest) {
        return this.retrofitService.like(str, likeRatingRequest);
    }

    public Observable<Response<PassRatingResponse>> pass(@NonNull PassRatingRequest passRatingRequest) {
        String recId = passRatingRequest.recId();
        String photoId = passRatingRequest.photoId();
        String contentHash = passRatingRequest.contentHash();
        Boolean bool = (Boolean) Optional.b(passRatingRequest.didRecUserSuperlike()).c(Boolean.valueOf(false));
        Integer num = (Integer) Optional.b(passRatingRequest.didRecUserSuperlike()).a(TinderRetrofitApi$$Lambda$8.$instance).c(null);
        Boolean isCurrentUserBoosting = passRatingRequest.isCurrentUserBoosting();
        Integer booleanToOneOrNull = booleanToOneOrNull(passRatingRequest.isFastMatch());
        Integer booleanToOneOrNull2 = booleanToOneOrNull(passRatingRequest.isTopPicks());
        Integer booleanToOneOrNull3 = booleanToOneOrNull(passRatingRequest.isUndo());
        Long sNumber = passRatingRequest.sNumber();
        if (bool.booleanValue() != null) {
            return this.retrofitService.passAfterReceivingSuperlike(recId, photoId, contentHash, num, isCurrentUserBoosting, sNumber);
        }
        return this.retrofitService.pass(recId, photoId, contentHash, num, isCurrentUserBoosting, booleanToOneOrNull, booleanToOneOrNull2, booleanToOneOrNull3, sNumber);
    }

    public Observable<Response<SuperLikeRatingResponse>> superlike(@NonNull SuperLikeRatingRequest superLikeRatingRequest) {
        String recId = superLikeRatingRequest.recId();
        String photoId = superLikeRatingRequest.photoId();
        Boolean wasRecUserPassporting = superLikeRatingRequest.wasRecUserPassporting();
        Boolean isCurrentUserPassporting = superLikeRatingRequest.isCurrentUserPassporting();
        return this.retrofitService.superlike(recId, photoId, wasRecUserPassporting, superLikeRatingRequest.isCurrentUserBoosting(), isCurrentUserPassporting, booleanToOneOrNull(superLikeRatingRequest.isFastMatch()), booleanToOneOrNull(superLikeRatingRequest.isTopPicks()), superLikeRatingRequest.sNumber());
    }

    public Single<DeleteSuperLikeResponse> deleteSuperLike(@NonNull String str) {
        return this.retrofitService.deleteSuperLike(str).a();
    }

    public C3956a validateSMSWithAccountKit(AccountKitValidateRequest accountKitValidateRequest) {
        return this.noAuthenticatorService.validateSMSWithAccountKit(accountKitValidateRequest);
    }

    public Single<FastMatchCountResponse> fetchFastMatchCount() {
        return this.retrofitService.fetchFastMatchCount();
    }

    public Single<FastMatchPreviewResponse> fetchFastMatchPreview() {
        FastMatchPreviewResponseAdapter fastMatchPreviewResponseAdapter = new FastMatchPreviewResponseAdapter();
        Single fetchFastMatchPreview = this.retrofitService.fetchFastMatchPreview();
        fastMatchPreviewResponseAdapter.getClass();
        return fetchFastMatchPreview.d(TinderRetrofitApi$$Lambda$9.get$Lambda(fastMatchPreviewResponseAdapter));
    }

    public Single<FastMatchRecsResponse> fetchFastMatchRecs(int i, @Nullable String str) {
        return this.retrofitService.fetchFastMatchRecs(i, str);
    }

    public Single<DataResponse<FastMatchNewCountResponse>> fetchNewFastMatchCount(String str, int i) {
        return this.retrofitService.fetchNewFastMatchCount(str, i);
    }

    public C3960g<DataResponse<TopPicksRecResponse>> fetchTopPicksRecs(int i, @Nullable String str, @NonNull Boolean bool) {
        return this.retrofitService.fetchTopPicksRecs(i, str, booleanToOneOrNull(bool));
    }

    public C3960g<DataResponse<TopPicksRecResponse>> fetchTopPicksTeaser(int i) {
        return this.retrofitService.fetchTopPicksTeaser(i);
    }

    public Completable registerPushToken(@NonNull String str) {
        return updatePushSettings(str, null);
    }

    public Single<Response<DataResponse<PlacesResponse>>> fetchRecentPlaces() {
        return this.retrofitService.fetchRecentPlaces();
    }

    public Single<Response<DataResponse<PlacesRecsResponse>>> fetchPlaceRecs(Long l, int i, @Nullable String str) {
        return this.retrofitService.fetchPlaceRecs(l, i, str);
    }

    public Single<Response<EmptyResponse>> submitPlacesVisit(PlacesVisitRequest placesVisitRequest) {
        return this.retrofitService.submitPlacesVisit(placesVisitRequest);
    }

    public Single<Response<DataResponse<CorrectLocationResponse>>> correctPlace(Long l, Long l2) {
        return this.retrofitService.correctPlace(new CorrectLocationRequest(l.longValue(), l2.longValue()));
    }

    public Single<Response<EmptyResponse>> blacklistPlace(Long l) {
        return this.retrofitService.blackListPlace(l);
    }

    public Single<Response<EmptyResponse>> deletePlace(Long l) {
        return this.retrofitService.deletePlace(l);
    }

    public Single<Response<EmptyResponse>> markPlaceViewed(String str) {
        return this.retrofitService.markPlaceViewed(str, new MarkPlaceViewedRequest());
    }

    public Single<Response<EmptyResponse>> markPlaceRecsViewed(String str) {
        return this.retrofitService.markPlaceRecsViewed(str, new MarkPlaceRecsViewedRequest());
    }

    public Completable updatePushSettings(@NonNull String str, @Nullable PushSettings pushSettings) {
        return this.retrofitService.postPushSettings(str, new PushSettingsRequest(pushSettings)).b();
    }

    public Completable unregisterPush(@NonNull String str) {
        return this.retrofitService.unregisterPush(str);
    }

    public Completable notifyPushServerAppOpen() {
        return this.retrofitService.notifyPushServerAppOpen(new ResetPushNotificationRequest()).b();
    }

    public Completable pauseAccount(boolean z) {
        return this.retrofitService.pauseAccount(PauseAccountRequest.Companion.create(z)).b();
    }

    public Single<Boolean> isUserPaused() {
        return this.retrofitService.getUserV2().d(TinderRetrofitApi$$Lambda$10.$instance);
    }

    public C3956a logout(@Nullable String str) {
        return this.noAuthenticatorService.logout(new LogoutRequestBody(str));
    }

    @Nullable
    private Integer booleanToOneOrNull(@Nullable Boolean bool) {
        return ((Boolean) Objects.b(bool, Boolean.valueOf(false))).booleanValue() != null ? Integer.valueOf(1) : null;
    }

    public Completable sendUserFeedback(FeedbackRequestBody feedbackRequestBody) {
        return this.retrofitService.sendUserFeedback(feedbackRequestBody);
    }

    public C3956a postSmsCollectionDismissed() {
        return this.retrofitService.smsCollectionDismissed();
    }

    public C3960g<ImageUploadResponse> uploadPhoto(String str, C15960b c15960b) {
        return this.imageUploadService.uploadPhoto(str, c15960b);
    }

    public Single<ActivityFeedResponse> activityFeed(@Nullable String str, @Nullable String str2, @Nullable Long l, @Nullable Integer num) {
        return this.retrofitService.getActivityFeed(str, str2, l, num).d(TinderRetrofitApi$$Lambda$11.$instance);
    }

    public Single<FeedCommentResponse> sendFeedItemComment(FeedCommentRequest feedCommentRequest) {
        return this.retrofitService.sendFeedItemComment(feedCommentRequest);
    }

    public Single<Data> fetchSuperLikeableGame() {
        return this.retrofitService.fetchSuperLikeableGame();
    }

    public Single<Empty> superLikeOnSuperLikeableGameUserRec(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        return this.retrofitService.superLikeOnSuperLikeableGameUserRec(SuperLike.build(str, str2, str3)).a((RetrofitErrorBodyAwareTransformer) this.retrofitErrorBodyAwareTransformers.get(Empty.class));
    }

    public Single<Empty> skipSuperLikeableGame(@NonNull String str) {
        return this.retrofitService.skipSuperLikeableGame(Skip.build(str)).a((RetrofitErrorBodyAwareTransformer) this.retrofitErrorBodyAwareTransformers.get(Empty.class));
    }

    public C3960g<User> updatePhotoOptimizerEnabled(UpdatePhotoOptimizerEnabledRequestBody updatePhotoOptimizerEnabledRequestBody) {
        return this.retrofitService.updatePhotoOptimizerEnabled(updatePhotoOptimizerEnabledRequestBody).e(TinderRetrofitApi$$Lambda$12.$instance);
    }

    public C3960g<User> updateProfileUser(ProfileUserUpdateRequestBody profileUserUpdateRequestBody) {
        return this.retrofitService.updateProfileUser(profileUserUpdateRequestBody).e(TinderRetrofitApi$$Lambda$13.$instance);
    }

    public C3960g<User> updateDiscoverySettings(DiscoverySettingsRequestBody discoverySettingsRequestBody) {
        return this.retrofitService.updateDiscoverySettings(discoverySettingsRequestBody).e(TinderRetrofitApi$$Lambda$14.$instance);
    }

    public C3956a updateEmailSettings(EmailSettings emailSettings) {
        return this.retrofitService.updateEmailSettings(emailSettings);
    }

    public C3956a logoutInstagram() {
        return this.retrofitService.logoutInstagram(InstagramLogoutRequestBody.INSTANCE);
    }

    public C3960g<InstagramAuthResponse> authInstagram(String str) {
        return this.retrofitService.authInstagram(new InstagramAuthRequestBody(str)).e(new TinderRetrofitApi$$Lambda$15(this));
    }

    final /* synthetic */ InstagramAuthResponse lambda$authInstagram$9$TinderRetrofitApi(Response response) throws Exception {
        if (response.isSuccessful()) {
            return (InstagramAuthResponse) response.body();
        }
        int code = response.code();
        C15968t errorBody = response.errorBody();
        if (errorBody != null) {
            throw new NetworkError(code, ((InstagramErrorResponse) this.moshi.a(InstagramErrorResponse.class).fromJson(errorBody.string())).getErrorMessage());
        }
        throw new NetworkError(code, response.message());
    }

    public C3960g<GiphyApiResponse> searchGifs(String str, String str2) {
        return this.retrofitService.searchGifs(str, str2);
    }

    public C3960g<GiphyApiResponse> trendingGifs(String str) {
        return this.retrofitService.trendingGifs(str);
    }

    public C3956a setMatchSeen(@NonNull String str) {
        return this.retrofitService.setMatchSeen(str);
    }

    public C3956a setMessageSeen(@NonNull String str, @NonNull String str2) {
        return this.retrofitService.setMessageSeen(str, str2);
    }

    public C3956a postEmailLastDismissedAtTime(@NonNull LastEmailDismissedAtBody lastEmailDismissedAtBody) {
        return this.retrofitService.sendEmailLastDismissedTime(lastEmailDismissedAtBody);
    }
}
