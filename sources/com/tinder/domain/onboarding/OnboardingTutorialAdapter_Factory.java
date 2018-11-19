package com.tinder.domain.onboarding;

import dagger.internal.Factory;

public final class OnboardingTutorialAdapter_Factory implements Factory<OnboardingTutorialAdapter> {
    private static final OnboardingTutorialAdapter_Factory INSTANCE = new OnboardingTutorialAdapter_Factory();

    public OnboardingTutorialAdapter get() {
        return provideInstance();
    }

    public static OnboardingTutorialAdapter provideInstance() {
        return new OnboardingTutorialAdapter();
    }

    public static OnboardingTutorialAdapter_Factory create() {
        return INSTANCE;
    }

    public static OnboardingTutorialAdapter newOnboardingTutorialAdapter() {
        return new OnboardingTutorialAdapter();
    }
}
