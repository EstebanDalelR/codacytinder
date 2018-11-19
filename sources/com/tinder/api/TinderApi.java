package com.tinder.api;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.api.giphy.GiphyApiResponse;
import com.tinder.api.model.activityfeed.ActivityFeedResponse;
import com.tinder.api.model.activityfeed.FeedCommentRequest;
import com.tinder.api.model.activityfeed.FeedCommentResponse;
import com.tinder.api.model.auth.AccountKitValidateRequest;
import com.tinder.api.model.common.ApiMessage;
import com.tinder.api.model.common.DeleteSuperLikeResponse;
import com.tinder.api.model.common.User;
import com.tinder.api.model.fastmatch.FastMatchPreviewResponse;
import com.tinder.api.model.intropricing.DiscountSponsoredMessage;
import com.tinder.api.model.meta.SuperLikes;
import com.tinder.api.model.places.request.PlacesVisitRequest;
import com.tinder.api.model.places.response.CorrectLocationResponse;
import com.tinder.api.model.places.response.PlacesRecsResponse;
import com.tinder.api.model.places.response.PlacesResponse;
import com.tinder.api.model.places.response.PlacesSettingsResponse;
import com.tinder.api.model.profile.DiscoverySettingsRequestBody;
import com.tinder.api.model.profile.EmailSettings;
import com.tinder.api.model.profile.ImageUploadResponse;
import com.tinder.api.model.profile.PlusControl;
import com.tinder.api.model.profile.ProfileUserUpdateRequestBody;
import com.tinder.api.model.profile.ProfileV2Response;
import com.tinder.api.model.profile.Share;
import com.tinder.api.model.profile.UpdatePhotoOptimizerEnabledRequestBody;
import com.tinder.api.model.profile.UpdatePlacesSettingsRequestBody;
import com.tinder.api.model.purchase.BillingReceipt;
import com.tinder.api.model.purchase.PurchaseDiscountEligibility;
import com.tinder.api.model.purchase.PurchaseLogRequest;
import com.tinder.api.model.purchase.PurchaseLogResponse;
import com.tinder.api.model.purchase.PurchaseValidationWrapper;
import com.tinder.api.model.purchase.PurchasedSkus;
import com.tinder.api.model.rating.LikeRatingResponse;
import com.tinder.api.model.rating.PassRatingResponse;
import com.tinder.api.model.rating.SuperLikeRatingResponse;
import com.tinder.api.model.settings.PushSettings;
import com.tinder.api.model.superlikeable.SuperLikeableGameResponse.Data;
import com.tinder.api.model.superlikeable.SuperLikeableGameResponse.Empty;
import com.tinder.api.model.toppicks.TopPicksRecResponse;
import com.tinder.api.model.updates.Updates;
import com.tinder.api.model.updates.UpdatesRequestBody;
import com.tinder.api.request.InstagramAuthResponse;
import com.tinder.api.request.LastEmailDismissedAtBody;
import com.tinder.api.request.LikeRatingRequest;
import com.tinder.api.request.PassRatingRequest;
import com.tinder.api.request.ReportUserRequest;
import com.tinder.api.request.SendMessageRequestBody;
import com.tinder.api.request.SuperLikeRatingRequest;
import com.tinder.api.response.FastMatchCountResponse;
import com.tinder.api.response.LocationResponse;
import com.tinder.api.response.MatchResponse;
import com.tinder.api.response.RecsResponse;
import com.tinder.api.response.v2.DataResponse;
import com.tinder.api.response.v2.EmptyResponse;
import com.tinder.api.response.v2.FastMatchNewCountResponse;
import com.tinder.api.response.v2.FastMatchRecsResponse;
import io.reactivex.C3956a;
import io.reactivex.C3960g;
import java.util.List;
import okhttp3.C17690n.C15960b;
import retrofit2.Response;
import rx.Completable;
import rx.Observable;
import rx.Single;

public interface TinderApi {
    Single<ActivityFeedResponse> activityFeed(@Nullable String str, @Nullable String str2, @Nullable Long l, @Nullable Integer num);

    C3960g<InstagramAuthResponse> authInstagram(String str);

    Single<Response<EmptyResponse>> blacklistPlace(Long l);

    C3960g<DataResponse<PurchaseDiscountEligibility>> checkPurchaseDiscountEligibility(@NonNull PurchasedSkus purchasedSkus);

    Completable confirmTutorialViewed();

    C3956a confirmTutorials(List<String> list);

    Single<Response<DataResponse<CorrectLocationResponse>>> correctPlace(Long l, Long l2);

    Completable deleteMatchMessageLike(String str);

    Single<Response<EmptyResponse>> deletePlace(Long l);

    Single<DeleteSuperLikeResponse> deleteSuperLike(@NonNull String str);

    C3960g<DataResponse<DiscountSponsoredMessage>> fetchDiscountSponsoredMessage(@NonNull String str, @NonNull String str2);

    Single<FastMatchCountResponse> fetchFastMatchCount();

    Single<FastMatchPreviewResponse> fetchFastMatchPreview();

    Single<FastMatchRecsResponse> fetchFastMatchRecs(int i, @Nullable String str);

    Single<DataResponse<FastMatchNewCountResponse>> fetchNewFastMatchCount(String str, int i);

    Single<Response<DataResponse<PlacesRecsResponse>>> fetchPlaceRecs(Long l, int i, @Nullable String str);

    Single<Response<DataResponse<PlacesResponse>>> fetchRecentPlaces();

    Single<Response<RecsResponse>> fetchRecs(@NonNull String str);

    Single<Data> fetchSuperLikeableGame();

    C3960g<DataResponse<TopPicksRecResponse>> fetchTopPicksRecs(int i, @Nullable String str, @NonNull Boolean bool);

    C3960g<DataResponse<TopPicksRecResponse>> fetchTopPicksTeaser(int i);

    Single<MatchResponse> getMatch(@NonNull String str);

    Observable<LocationResponse> getPopularLocations(@NonNull String str);

    Observable<LocationResponse> getSearchLocation(@NonNull String str, @NonNull String str2);

    Observable<LocationResponse> getSearchPinLocation(@NonNull String str, @NonNull Double d, @NonNull Double d2);

    Observable<Response<Share>> getShareLink(@NonNull String str);

    Observable<SuperLikes> getSuperLikeStatus();

    Single<Updates> getUpdates(UpdatesRequestBody updatesRequestBody, boolean z, String str);

    C3960g<DataResponse<ProfileV2Response>> getUserProfile(String str);

    Single<Boolean> isUserPaused();

    Observable<Response<LikeRatingResponse>> like(@NonNull String str, @NonNull LikeRatingRequest likeRatingRequest);

    Completable likeMatchMessage(String str);

    C3956a logout(@Nullable String str);

    C3956a logoutInstagram();

    Single<Response<EmptyResponse>> markPlaceRecsViewed(String str);

    Single<Response<EmptyResponse>> markPlaceViewed(String str);

    Completable muteMatch(@NonNull String str);

    Completable notifyPushServerAppOpen();

    Observable<Response<PassRatingResponse>> pass(@NonNull PassRatingRequest passRatingRequest);

    Completable pauseAccount(boolean z);

    C3956a postEmailLastDismissedAtTime(@NonNull LastEmailDismissedAtBody lastEmailDismissedAtBody);

    Completable registerPushToken(@NonNull String str);

    Completable reportMatch(@NonNull String str, @NonNull ReportUserRequest reportUserRequest);

    Observable<Response<LikeRatingResponse>> reportRec(@NonNull String str, @NonNull ReportUserRequest reportUserRequest);

    C3960g<GiphyApiResponse> searchGifs(String str, String str2);

    Single<FeedCommentResponse> sendFeedItemComment(FeedCommentRequest feedCommentRequest);

    Single<ApiMessage> sendMessage(String str, SendMessageRequestBody sendMessageRequestBody);

    Observable<PurchaseLogResponse> sendPurchaseLogs(@NonNull PurchaseLogRequest purchaseLogRequest);

    C3956a setMatchSeen(@NonNull String str);

    C3956a setMessageSeen(@NonNull String str, @NonNull String str2);

    Single<Empty> skipSuperLikeableGame(@NonNull String str);

    Single<Response<EmptyResponse>> submitPlacesVisit(PlacesVisitRequest placesVisitRequest);

    Single<Empty> superLikeOnSuperLikeableGameUserRec(@NonNull String str, @NonNull String str2, @NonNull String str3);

    Observable<Response<SuperLikeRatingResponse>> superlike(@NonNull SuperLikeRatingRequest superLikeRatingRequest);

    C3960g<GiphyApiResponse> trendingGifs(String str);

    Completable unMatch(@NonNull String str);

    Completable unMuteMatch(@NonNull String str);

    Completable unregisterPush(@NonNull String str);

    C3960g<User> updateDiscoverySettings(DiscoverySettingsRequestBody discoverySettingsRequestBody);

    C3956a updateEmailSettings(EmailSettings emailSettings);

    C3960g<User> updatePhotoOptimizerEnabled(UpdatePhotoOptimizerEnabledRequestBody updatePhotoOptimizerEnabledRequestBody);

    C3960g<DataResponse<PlacesSettingsResponse>> updatePlacesSettings(UpdatePlacesSettingsRequestBody updatePlacesSettingsRequestBody);

    C3960g<DataResponse<PlusControl>> updatePlusControlSettings(PlusControl plusControl);

    C3960g<User> updateProfileUser(ProfileUserUpdateRequestBody profileUserUpdateRequestBody);

    Completable updatePushSettings(@NonNull String str, @Nullable PushSettings pushSettings);

    C3960g<ImageUploadResponse> uploadPhoto(String str, C15960b c15960b);

    Observable<PurchaseValidationWrapper> validatePurchase(@NonNull BillingReceipt billingReceipt);

    C3956a validateSMSWithAccountKit(AccountKitValidateRequest accountKitValidateRequest);
}
