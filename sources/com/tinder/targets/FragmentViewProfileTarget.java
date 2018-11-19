package com.tinder.targets;

import android.support.annotation.Nullable;
import com.tinder.domain.common.model.Gender.Value;
import com.tinder.domain.common.model.Job;
import java8.util.Optional;

public interface FragmentViewProfileTarget {
    void delegateLegacyLocalPhotoAdded(String str);

    void delegateLegacyPhotoAddedWithFacebookConnected();

    void delegateLocalPhotoAdded(String str);

    void delegatePhotoAddedWithFacebookConnected();

    void disableJobEditing();

    void disableSchoolsEditing();

    void dismissProgressDialog();

    void displayPlusControlSettings(boolean z, boolean z2, boolean z3);

    void enableJobEditing();

    void enableMoreGenderView();

    void enableSchoolEditing();

    void enableSpotifyViews();

    void finishActivityWithSuccess();

    void focusJob();

    void focusSchool();

    void goToJobActivity();

    void goToSchoolActivity();

    void hideMoreGenderView();

    void hideMySchool();

    void hideSpotifyViews();

    void saveCurrentUserPhotos();

    void saveCurrentUserProfile();

    void selectPhotosNoFacebook();

    void selectPhotosWithFacebook();

    void setBio(String str);

    void setGender(Value value);

    void setJobEditingMaxLength(int i, int i2);

    void setName(String str);

    void setSchoolEditingMaxLength(int i);

    void setUserGender(Value value, String str);

    void showGalleryIntentNotAvailableSnackbar();

    void showInstagramConnected(String str);

    void showInstagramDisconnected();

    void showMyJob(Optional<Job> optional);

    void showMySchool(@Nullable CharSequence charSequence);

    void showNewPhotoGrid();

    void showProfileUpdateFailedSnackbar();

    void showProfileUpdatedSnackbar();

    void showProgressDialog();
}
