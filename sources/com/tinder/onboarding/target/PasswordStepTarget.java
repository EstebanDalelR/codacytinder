package com.tinder.onboarding.target;

import rx.Observable;

public interface PasswordStepTarget extends OnboardingStepTarget {
    void disableActionButton();

    void dismissKeyboard();

    Observable<String> editTextAfterTextChanges();

    void enableActionButton();

    void removeHintMessage();

    void setText(String str);

    void showGenericErrorDialog();

    void showKeyboard();

    void showPasswordNormalHint();

    void showPasswordRequirementHint();

    void showSimplePasswordHint();

    void showStrongPasswordHint();
}
