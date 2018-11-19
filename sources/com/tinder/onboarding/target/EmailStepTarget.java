package com.tinder.onboarding.target;

import android.support.annotation.NonNull;
import rx.Observable;

public interface EmailStepTarget extends OnboardingStepTarget {
    Observable<String> afterEmailInputChanges();

    void disableEmailInput();

    void disableSubmitButton();

    void enableSubmitButton();

    void hideMarketingCheckbox();

    void setEmail(@NonNull String str);

    void showGenericErrorMessage();

    void showInvalidEmailErrorHint();

    void showKeyboard();

    void showMarketingCheckbox(boolean z);

    void showNormalHint();
}
