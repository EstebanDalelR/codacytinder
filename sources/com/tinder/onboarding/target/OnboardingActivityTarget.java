package com.tinder.onboarding.target;

import android.support.annotation.NonNull;
import com.tinder.onboarding.viewmodel.OnboardingStep;
import java.util.List;
import java8.util.Optional;

public interface OnboardingActivityTarget extends OnboardingStepTarget {
    void dismiss();

    void finishOnboardingWithError(Throwable th);

    void finishOnboardingWithSuccess();

    void finishOnboardingWithUnderage(int i);

    void hideSkipButton();

    void hideTitle();

    void setSteps(@NonNull List<OnboardingStep> list);

    void setTitle(String str);

    void showCancelConfirmationDialog();

    void showCreateUserError(Optional<Integer> optional);

    void showGenericErrorMessage(boolean z);

    void showSkipButton();

    void showStep(@NonNull OnboardingStep onboardingStep);
}
