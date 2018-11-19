package com.tinder.onboarding.target;

import android.support.annotation.NonNull;
import org.joda.time.LocalDate;

public interface BirthdayStepTarget extends OnboardingStepTarget {
    void disableContinueButton();

    void disableFocusForFields();

    void enableContinueButton();

    void enableFocusForFields();

    void finishOnboardingProcess();

    void focusInputField();

    void setBirthday(@NonNull LocalDate localDate);

    void showBirthdayHint();

    void showBirthdayWidgetView();

    void showCertification();

    void showGenericErrorMessage();

    void showInvalidBirthDayMessage();

    void showUnderageError();
}
