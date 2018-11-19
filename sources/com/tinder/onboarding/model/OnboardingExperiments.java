package com.tinder.onboarding.model;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/onboarding/model/OnboardingExperiments;", "", "ageLimit", "", "isEmailStepRequired", "", "isMoreGenderEnabled", "onboarding_release"}, k = 1, mv = {1, 1, 10})
public interface OnboardingExperiments {
    int ageLimit();

    boolean isEmailStepRequired();

    boolean isMoreGenderEnabled();
}
