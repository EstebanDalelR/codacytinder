package com.tinder.onboarding.target;

import android.net.Uri;
import android.support.annotation.NonNull;

public interface PhotosStepTarget extends OnboardingStepTarget {
    void hideAddPhoto();

    void hideSoftInput();

    void showAddPhoto();

    void showCamera();

    void showErrorMessage(String str);

    void showExtStorageReadPermissionDialog();

    void showGallery();

    void showGalleryUnavailableSnackbarMessage();

    void showPhoto(@NonNull Uri uri);

    void showPhotoCropper(@NonNull Uri uri);

    void showPhotoSourceSelector();
}
