package com.tinder.api.retrofit;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.api.giphy.GiphyApiResponse;
import com.tinder.api.model.activityfeed.ActivityFeedResponse;
import com.tinder.api.model.activityfeed.FeedCommentRequest;
import com.tinder.api.model.activityfeed.FeedCommentResponse;
import com.tinder.api.model.common.ApiMessage;
import com.tinder.api.model.common.DeleteSuperLikeResponse;
import com.tinder.api.model.common.Photo;
import com.tinder.api.model.common.User;
import com.tinder.api.model.intropricing.DiscountSponsoredMessage;
import com.tinder.api.model.meta.Meta;
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
import com.tinder.api.model.purchase.PurchasedSkus;
import com.tinder.api.model.pushnotifications.ResetPushNotificationRequest;
import com.tinder.api.model.rating.LikeRatingResponse;
import com.tinder.api.model.rating.PassRatingResponse;
import com.tinder.api.model.rating.SuperLikeRatingResponse;
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
import com.tinder.api.request.InstagramLogoutRequestBody;
import com.tinder.api.request.LastEmailDismissedAtBody;
import com.tinder.api.request.LikeRatingRequest;
import com.tinder.api.request.MetaV2RequestBody;
import com.tinder.api.request.OrderProfilePhotosBody;
import com.tinder.api.request.PauseAccountRequest;
import com.tinder.api.request.PhotoOptimizerEnableRequest;
import com.tinder.api.request.PushSettingsRequest;
import com.tinder.api.request.ReportUserRequest;
import com.tinder.api.request.SchoolRequestBody;
import com.tinder.api.request.SendMessageRequestBody;
import com.tinder.api.request.SuperLikeableActionRequestBody.Skip;
import com.tinder.api.request.SuperLikeableActionRequestBody.SuperLike;
import com.tinder.api.request.UpdateProfileRequest;
import com.tinder.api.response.AddThirdPartyPhotoResponse;
import com.tinder.api.response.FastMatchCountResponse;
import com.tinder.api.response.LocationResponse;
import com.tinder.api.response.MatchResponse;
import com.tinder.api.response.ProfileResponse;
import com.tinder.api.response.RecsResponse;
import com.tinder.api.response.SuperlikeStatusInfoResponse;
import com.tinder.api.response.UserResponse;
import com.tinder.api.response.v2.DataResponse;
import com.tinder.api.response.v2.EmptyResponse;
import com.tinder.api.response.v2.FastMatchNewCountResponse;
import com.tinder.api.response.v2.FastMatchRecsResponse;
import io.reactivex.C3956a;
import io.reactivex.C3960g;
import java.util.List;
import java.util.Map;
import okhttp3.C15968t;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Completable;
import rx.Observable;
import rx.Single;

interface TinderApiRetrofitService {
    @POST("/media")
    C3960g<AddThirdPartyPhotoResponse> addThirdPartyPhoto(@Body AddThirdPartyPhotoBody addThirdPartyPhotoBody);

    @POST("/instagram/authenticate")
    C3960g<Response<InstagramAuthResponse>> authInstagram(@Body InstagramAuthRequestBody instagramAuthRequestBody);

    @POST("/v2/places/blocked/{placeId}")
    Single<Response<EmptyResponse>> blackListPlace(@Path("placeId") Long l);

    @POST("v2/purchase/discount/eligibility")
    C3960g<DataResponse<PurchaseDiscountEligibility>> checkPurchaseDiscountEligibility(@Body PurchasedSkus purchasedSkus);

    @POST("/meta/user/tutorials")
    Completable confirmTutorialViewed();

    @POST("/v2/profile/tutorials")
    C3956a confirmTutorials(@Body List<String> list);

    @POST("/v2/places/alternatives")
    Single<Response<DataResponse<CorrectLocationResponse>>> correctPlace(@Body CorrectLocationRequest correctLocationRequest);

    @DELETE("/profile/job")
    C3956a deleteJob();

    @DELETE("/message/{message_id}/like")
    Observable<Void> deleteMessageLike(@Path("message_id") String str);

    @DELETE("/v2/places/recent/{placeId}")
    Single<Response<EmptyResponse>> deletePlace(@Path("placeId") Long l);

    @HTTP(hasBody = true, method = "DELETE", path = "/media")
    C3960g<List<Photo>> deleteProfilePhoto(@Body DeleteProfilePhotoBody deleteProfilePhotoBody);

    @DELETE("/profile/school")
    C3956a deleteSchool();

    @DELETE("/like/{rec_id}/super")
    Observable<DeleteSuperLikeResponse> deleteSuperLike(@Path("rec_id") String str);

    @DELETE("/profile/username")
    C3960g<Response<Void>> deleteUsername();

    @GET("v2/purchase/discount/sponsored-message")
    C3960g<DataResponse<DiscountSponsoredMessage>> fetchDiscountSponsoredMessage(@Query("campaign") String str, @Query("product_type") String str2);

    @GET("/v2/fast-match/count")
    Single<FastMatchCountResponse> fetchFastMatchCount();

    @GET("/v2/fast-match/preview")
    Single<Response<C15968t>> fetchFastMatchPreview();

    @GET("v2/fast-match")
    Single<FastMatchRecsResponse> fetchFastMatchRecs(@Query("count") int i, @Query("page_token") String str);

    @GET("v2/fast-match/newcount")
    Single<DataResponse<FastMatchNewCountResponse>> fetchNewFastMatchCount(@Query("count_token") String str, @Query("mode") int i);

    @GET("/v2/places/{placeId}/recs")
    Single<Response<DataResponse<PlacesRecsResponse>>> fetchPlaceRecs(@Path("placeId") Long l, @Query("limit") int i, @Query("cursor") String str);

    @GET("/v2/places/recent")
    Single<Response<DataResponse<PlacesResponse>>> fetchRecentPlaces();

    @GET("/v2/recs/core")
    Single<Response<RecsResponse>> fetchRecs(@Query("locale") String str);

    @GET("/v1/superlikable")
    Single<Data> fetchSuperLikeableGame();

    @GET("v2/top-picks")
    C3960g<DataResponse<TopPicksRecResponse>> fetchTopPicksRecs(@Header("X-Local-UTC-Offset") int i, @Query("page_token") String str, @Query("rediscover") Integer num);

    @GET("v2/top-picks/preview")
    C3960g<DataResponse<TopPicksRecResponse>> fetchTopPicksTeaser(@Header("X-Local-UTC-Offset") int i);

    @GET("/v1/activity/feed")
    Single<DataResponse<ActivityFeedResponse>> getActivityFeed(@Nullable @Query("direction") String str, @Nullable @Query("nextToken") String str2, @Nullable @Query("eventTypes") Long l, @Nullable @Query("limit") Integer num);

    @GET("/matches/{match_id}")
    Single<MatchResponse> getMatch(@Path("match_id") String str);

    @GET("/meta")
    Observable<Meta> getMeta(@Header("X-Local-UTC-Offset") int i);

    @POST("/v2/meta")
    Single<DataResponse<MetaV2Response>> getMetaV2(@Body MetaV2RequestBody metaV2RequestBody);

    @GET("/location/popular")
    Observable<LocationResponse> getPopularLocations(@Query("locale") String str);

    @GET("/v2/profile")
    C3960g<DataResponse<ProfileV2Response>> getProfile(@Query("include") String str);

    @GET("/profile/photos")
    Observable<Response<ProfilePhotosResponse>> getProfilePhotos();

    @GET("/location/search")
    Observable<LocationResponse> getSearchLocation(@Query("locale") String str, @Query("s") String str2);

    @GET("/location/search")
    Observable<LocationResponse> getSearchPinLocation(@Query("locale") String str, @Query("lat") Double d, @Query("lon") Double d2);

    @POST("/user/{user_id}/share")
    Observable<Response<Share>> getShareLink(@Path("user_id") String str);

    @GET("/meta/superlike/info")
    Observable<SuperlikeStatusInfoResponse> getSuperlikeStatus();

    @POST("/updates")
    Single<Updates> getUpdates(@Body UpdatesRequestBody updatesRequestBody, @Query("is_boosting") boolean z, @Query("boost_cursor") String str);

    @GET("/user/{user_id}")
    Observable<UserResponse> getUser(@Path("user_id") String str);

    @GET("/profile")
    Observable<User> getUserProfile();

    @GET("/v2/profile?include=user")
    Single<com.tinder.api.response.v2.UserResponse> getUserV2();

    @POST("/like/{rec_id}")
    Observable<Response<LikeRatingResponse>> like(@Path("rec_id") String str, @Body LikeRatingRequest likeRatingRequest);

    @POST("/message/{message_id}/like")
    Observable<Void> likeMatchMessage(@Path("message_id") String str);

    @GET("/v2/profile")
    Observable<ProfileResponse> loadUserProfileIncluding(@Query("include") String str);

    @POST("/instagram/deauthorize")
    C3956a logoutInstagram(@Body InstagramLogoutRequestBody instagramLogoutRequestBody);

    @POST("/v2/places/recent/{placeId}")
    Single<Response<EmptyResponse>> markPlaceRecsViewed(@Path("placeId") String str, @Body MarkPlaceRecsViewedRequest markPlaceRecsViewedRequest);

    @POST("/v2/places/recent/{placeId}")
    Single<Response<EmptyResponse>> markPlaceViewed(@Path("placeId") String str, @Body MarkPlaceViewedRequest markPlaceViewedRequest);

    @PUT("/matches/mute/{match_id}")
    Observable<Void> muteMatch(@Path("match_id") String str);

    @PUT("/v2/push/notifications")
    Single<Void> notifyPushServerAppOpen(@Body ResetPushNotificationRequest resetPushNotificationRequest);

    @GET("/pass/{rec_id}")
    Observable<Response<PassRatingResponse>> pass(@Path("rec_id") String str, @Query("photoId") String str2, @Query("content_hash") String str3, @Query("super") Integer num, @Query("is_boosting") Boolean bool, @Query("fast_match") Integer num2, @Query("top_picks") Integer num3, @Query("undo") Integer num4, @Query("s_number") Long l);

    @POST("/pass/{rec_id}")
    Observable<Response<PassRatingResponse>> passAfterReceivingSuperlike(@Path("rec_id") String str, @Query("photoId") String str2, @Query("content_hash") String str3, @Query("super") Integer num, @Query("is_boosting") Boolean bool, @Query("s_number") Long l);

    @POST("/v2/profile")
    Single<Void> pauseAccount(@Body PauseAccountRequest pauseAccountRequest);

    @POST("/profile")
    Observable<User> postBlendToProfile(@Body Map<String, String> map);

    @POST("/profile")
    Observable<User> postHideProfileItems(@Body @NonNull HideProfileItemsRequestBody hideProfileItemsRequestBody);

    @POST("/v2/push/devices/android/{device_token}")
    Single<Void> postPushSettings(@Path("device_token") String str, @Body PushSettingsRequest pushSettingsRequest);

    @POST("/profile")
    Observable<User> postToggleSmartPhotos(@Body PhotoOptimizerEnableRequest photoOptimizerEnableRequest);

    @POST("/profile/username")
    C3960g<Response<Void>> postUsername(@Body UpdateUsernameRequestBody updateUsernameRequestBody);

    @PUT("/profile/school")
    Completable putSchool(@Body SchoolRequestBody schoolRequestBody);

    @PUT("/profile/username")
    C3960g<Response<Void>> putUsername(@Body UpdateUsernameRequestBody updateUsernameRequestBody);

    @POST("report/{match_id}")
    Observable<Void> reportMatch(@Path("match_id") String str, @Body ReportUserRequest reportUserRequest);

    @POST("report/user/{user_id}")
    Observable<Response<LikeRatingResponse>> reportRec(@Path("user_id") String str, @Body ReportUserRequest reportUserRequest);

    @POST("/v2/profile/feed_control")
    C3960g<DataResponse<ActivityFeedSettings>> saveActivityFeedSettings(@Body @NonNull ActivityFeedSettings activityFeedSettings);

    @POST("/profile")
    Observable<Response<User>> saveDiscoverability(@Body DiscoverabilitySettingsRequest discoverabilitySettingsRequest);

    @POST("/profile")
    Observable<Response<Void>> saveGender(@Body GenderSettingsRequest genderSettingsRequest);

    @POST("/v2/profile")
    C3960g<DataResponse<PlacesSettingsResponse>> savePlacesSettings(@Body UpdatePlacesSettingsRequestBody updatePlacesSettingsRequestBody);

    @POST("/v2/profile/plus_control")
    C3960g<DataResponse<PlusControl>> savePlusControlSettings(@Body PlusControl plusControl);

    @POST("/profile")
    Observable<User> saveProfileSettings(@Body UpdateProfileRequest updateProfileRequest);

    @GET("/giphy/search")
    C3960g<GiphyApiResponse> searchGifs(@Query("query") String str, @Query("lang") String str2);

    @POST("/v2/profile/account-settings")
    C3956a sendEmailLastDismissedTime(@Body LastEmailDismissedAtBody lastEmailDismissedAtBody);

    @POST("/v1/activity/comment")
    Single<FeedCommentResponse> sendFeedItemComment(@Body FeedCommentRequest feedCommentRequest);

    @POST("/user/matches/{match_id}")
    Single<ApiMessage> sendMessage(@Path("match_id") String str, @Body SendMessageRequestBody sendMessageRequestBody);

    @POST("/purchase/logs")
    Observable<PurchaseLogResponse> sendPurchaseLogs(@Body PurchaseLogRequest purchaseLogRequest);

    @POST("/feedback")
    Completable sendUserFeedback(@Body FeedbackRequestBody feedbackRequestBody);

    @POST("/v2/seen/{match_id}")
    C3956a setMatchSeen(@Path("match_id") String str);

    @POST("/v2/seen/{match_id}/{message_id}")
    C3956a setMessageSeen(@Path("match_id") String str, @Path("message_id") String str2);

    @PUT("/media")
    C3960g<List<Photo>> setProfilePhotoOrder(@Body OrderProfilePhotosBody orderProfilePhotosBody);

    @POST("/v1/superlikable")
    Single<Response<Empty>> skipSuperLikeableGame(@Body Skip skip);

    @POST("/v2/account/sms/dismiss")
    C3956a smsCollectionDismissed();

    @POST("/v2/places/foursquare/visit")
    Single<Response<EmptyResponse>> submitPlacesVisit(@Body PlacesVisitRequest placesVisitRequest);

    @POST("/v1/superlikable")
    Single<Response<Empty>> superLikeOnSuperLikeableGameUserRec(@Body SuperLike superLike);

    @POST("/like/{rec_id}/super")
    Observable<Response<SuperLikeRatingResponse>> superlike(@Path("rec_id") String str, @Query("photoId") String str2, @Query("rec_traveling") Boolean bool, @Query("is_boosting") Boolean bool2, @Query("user_traveling") Boolean bool3, @Query("fast_match") Integer num, @Query("top_picks") Integer num2, @Query("s_number") Long l);

    @GET("/giphy/trending")
    C3960g<GiphyApiResponse> trendingGifs(@Query("lang") String str);

    @DELETE("/user/matches/{match_id}")
    Observable<Void> unMatch(@Path("match_id") String str);

    @DELETE("/matches/mute/{match_id}")
    Observable<Void> unMuteMatch(@Path("match_id") String str);

    @DELETE("/v2/push/devices/android/{deviceId}")
    Completable unregisterPush(@Path("deviceId") String str);

    @POST("/v2/profile/user")
    C3960g<DataResponse<User>> updateDiscoverySettings(@Body DiscoverySettingsRequestBody discoverySettingsRequestBody);

    @POST("/v2/profile/email_settings")
    C3956a updateEmailSettings(@Body EmailSettings emailSettings);

    @PUT("/profile/job")
    C3956a updateJob(@Body UpdateJobRequestBody updateJobRequestBody);

    @POST("/v2/profile/job")
    C3956a updateJobForSMSUser(@Body UpdateJobsRequestBody updateJobsRequestBody);

    @POST("/v2/profile/user")
    C3960g<DataResponse<User>> updatePhotoOptimizerEnabled(@Body UpdatePhotoOptimizerEnabledRequestBody updatePhotoOptimizerEnabledRequestBody);

    @POST("/v2/profile/user")
    C3960g<DataResponse<User>> updateProfileUser(@Body ProfileUserUpdateRequestBody profileUserUpdateRequestBody);

    @PUT("/profile/school")
    C3956a updateSchool(@Body UpdateSchoolRequestBody updateSchoolRequestBody);

    @POST("/v2/profile/school")
    C3956a updateSchoolForSMSUser(@Body UpdateSchoolRequestBody updateSchoolRequestBody);

    @POST("/purchase/android")
    Observable<Response<Map<String, Object>>> validatePurchase(@Body BillingReceipt billingReceipt);
}
