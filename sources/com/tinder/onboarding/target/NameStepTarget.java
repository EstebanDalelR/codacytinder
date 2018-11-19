package com.tinder.onboarding.target;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.Set;

public interface NameStepTarget extends OnboardingStepTarget {
    void disableContinueButton();

    void enableContinueButton();

    void setNameText(@NonNull String str);

    void showErrorMessage(@Nullable String str);

    void showGenericErrorMessage();

    void showInappropriatePhrasesHint();

    void showInvalidCharsHint(@NonNull Set<String> set);

    void showKeyboard();
}
