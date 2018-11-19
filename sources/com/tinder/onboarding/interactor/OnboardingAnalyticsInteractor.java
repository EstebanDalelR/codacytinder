package com.tinder.onboarding.interactor;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.onboarding.model.OnboardingEventCode;
import java.util.Set;

public interface OnboardingAnalyticsInteractor {
    void fireOnboardingAgeGateEvent(int i);

    void fireOnboardingCancelEvent(boolean z);

    void fireOnboardingErrorEvent(int i);

    void fireOnboardingJsonUnparsableError(@Nullable String str);

    void fireOnboardingSkipEvent(@NonNull OnboardingEventCode onboardingEventCode, boolean z);

    void fireOnboardingSmsCancelEvent(boolean z);

    void fireOnboardingSubmitEvent(@NonNull OnboardingEventCode onboardingEventCode, @Nullable String str, boolean z);

    void fireOnboardingViewEvent(@NonNull OnboardingEventCode onboardingEventCode);

    void fireOnboardingViewEvent(@NonNull OnboardingEventCode onboardingEventCode, @Nullable String str);

    void setEditableFields(Set<OnboardingEventCode> set);

    void setRequiredFields(Set<OnboardingEventCode> set);
}
