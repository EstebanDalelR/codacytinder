package com.tinder.settings.targets;

import com.tinder.domain.common.model.Gender.Value;

public interface MoreGenderTarget {
    void dismissRemoveMoreGenderLoadingIndicator();

    void hideBinaryGenderView();

    void hideIncludeMeInSearchView();

    void hideMoreGenderView();

    void setGender(Value value);

    void setShowGenderOnProfile(boolean z);

    void showBinaryGenderView();

    void showIncludeMeInSearchView(Value value);

    void showMoreGender(String str);

    void showRemoveMoreGenderErrorMessage();

    void showRemoveMoreGenderLoadingIndicator();
}
