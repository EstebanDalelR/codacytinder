package com.tinder.api;

import android.support.annotation.NonNull;
import com.tinder.api.model.common.Photo;
import com.tinder.api.model.common.User;
import com.tinder.api.model.meta.Meta;
import com.tinder.api.model.meta.v2.MetaV2Response;
import com.tinder.api.model.profile.ActivityFeedSettings;
import com.tinder.api.model.profile.ProfilePhotosResponse;
import com.tinder.api.model.profile.UpdateJobRequestBody;
import com.tinder.api.model.profile.UpdateJobsRequestBody;
import com.tinder.api.model.profile.UpdateSchoolRequestBody;
import com.tinder.api.model.profile.UpdateUsernameRequestBody;
import com.tinder.api.request.AddThirdPartyPhotoBody;
import com.tinder.api.request.DeleteProfilePhotoBody;
import com.tinder.api.request.DiscoverabilitySettingsRequest;
import com.tinder.api.request.FeedbackRequestBody;
import com.tinder.api.request.GenderSettingsRequest;
import com.tinder.api.request.HideProfileItemsRequestBody;
import com.tinder.api.request.MetaV2RequestBody;
import com.tinder.api.request.OrderProfilePhotosBody;
import com.tinder.api.request.PhotoOptimizerEnableRequest;
import com.tinder.api.request.SchoolRequestBody;
import com.tinder.api.request.UpdateProfileRequest;
import com.tinder.api.response.AddThirdPartyPhotoResponse;
import com.tinder.api.response.ProfileResponse;
import com.tinder.api.response.UserResponse;
import com.tinder.api.response.v2.DataResponse;
import com.tinder.api.response.v2.EmptyResponse;
import io.reactivex.C3956a;
import io.reactivex.C3960g;
import java.util.List;
import java.util.Map;
import rx.Completable;
import rx.Observable;
import rx.Single;

public interface TinderUserApi {
    C3960g<AddThirdPartyPhotoResponse> addThirdPartyPhoto(AddThirdPartyPhotoBody addThirdPartyPhotoBody);

    C3960g<EmptyResponse> createUsername(UpdateUsernameRequestBody updateUsernameRequestBody);

    C3956a deleteJob();

    C3960g<List<Photo>> deleteProfilePhoto(DeleteProfilePhotoBody deleteProfilePhotoBody);

    C3956a deleteSchool();

    C3960g<EmptyResponse> deleteUsername();

    Observable<Meta> getMeta(int i);

    Single<DataResponse<MetaV2Response>> getMetaV2(@NonNull MetaV2RequestBody metaV2RequestBody);

    Observable<ProfilePhotosResponse> getProfilePhotos();

    Observable<UserResponse> getUser(@NonNull String str);

    Observable<User> getUserProfile();

    Observable<ProfileResponse> getUserProfileIncluding(String str);

    Observable<User> postBlendToProfile(@NonNull Map<String, String> map);

    Observable<User> postHideProfileItems(@NonNull HideProfileItemsRequestBody hideProfileItemsRequestBody);

    C3956a postSmsCollectionDismissed();

    Observable<User> postToggleSmartPhotos(@NonNull PhotoOptimizerEnableRequest photoOptimizerEnableRequest);

    Completable putSchool(SchoolRequestBody schoolRequestBody);

    C3960g<DataResponse<ActivityFeedSettings>> saveActivityFeedSettings(@NonNull ActivityFeedSettings activityFeedSettings);

    Observable<User> saveDiscoverability(@NonNull DiscoverabilitySettingsRequest discoverabilitySettingsRequest);

    Observable<com.tinder.api.response.EmptyResponse> saveGender(@NonNull GenderSettingsRequest genderSettingsRequest);

    Observable<User> saveProfileSettings(@NonNull UpdateProfileRequest updateProfileRequest);

    Completable sendUserFeedback(FeedbackRequestBody feedbackRequestBody);

    C3960g<List<Photo>> setProfilePhotoOrder(OrderProfilePhotosBody orderProfilePhotosBody);

    C3956a updateJob(UpdateJobRequestBody updateJobRequestBody);

    C3956a updateJobForSMSUser(UpdateJobsRequestBody updateJobsRequestBody);

    C3956a updateSchool(UpdateSchoolRequestBody updateSchoolRequestBody);

    C3956a updateSchoolForSMSUser(UpdateSchoolRequestBody updateSchoolRequestBody);

    C3960g<EmptyResponse> updateUsername(UpdateUsernameRequestBody updateUsernameRequestBody);
}
