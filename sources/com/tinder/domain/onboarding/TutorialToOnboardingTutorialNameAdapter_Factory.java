package com.tinder.domain.onboarding;

import dagger.internal.Factory;

public final class TutorialToOnboardingTutorialNameAdapter_Factory implements Factory<TutorialToOnboardingTutorialNameAdapter> {
    private static final TutorialToOnboardingTutorialNameAdapter_Factory INSTANCE = new TutorialToOnboardingTutorialNameAdapter_Factory();

    public TutorialToOnboardingTutorialNameAdapter get() {
        return provideInstance();
    }

    public static TutorialToOnboardingTutorialNameAdapter provideInstance() {
        return new TutorialToOnboardingTutorialNameAdapter();
    }

    public static TutorialToOnboardingTutorialNameAdapter_Factory create() {
        return INSTANCE;
    }

    public static TutorialToOnboardingTutorialNameAdapter newTutorialToOnboardingTutorialNameAdapter() {
        return new TutorialToOnboardingTutorialNameAdapter();
    }
}
