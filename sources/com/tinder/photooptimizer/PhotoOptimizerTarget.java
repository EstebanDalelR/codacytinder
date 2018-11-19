package com.tinder.photooptimizer;

public interface PhotoOptimizerTarget {
    void disableFeature();

    void disableToggle();

    void enableFeature();

    void enableToggle();

    void showCustomPhotos();

    void showOptimizedPhotos();

    void showOptimizingPhotos();

    void showPhotoOptimizerUpdateFailure(boolean z);

    void showPhotoOptimizerUpdateSuccess(boolean z);

    void updatePhotoTogglePosition(boolean z);
}
