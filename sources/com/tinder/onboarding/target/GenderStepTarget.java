package com.tinder.onboarding.target;

import android.support.annotation.NonNull;
import com.tinder.domain.common.model.Gender.Value;

public interface GenderStepTarget extends OnboardingStepTarget {
    void disableCustomGenderOption();

    void enableCustomGenderOption();

    void enabledContinueButton();

    void hideGenderTitle();

    void hideSoftInput();

    void setIncludeMeInSearchesForMen();

    void setIncludeMeInSearchesForWomen();

    void setShowMyGender(boolean z);

    void showBinaryGenderView();

    void showCustomGenderView(@NonNull String str);

    void showGenderTitle();

    void showGenericErrorDialog();

    void showInvalidCustomGenderDialog();

    void toggleGenderSelection(@NonNull Value value);
}
