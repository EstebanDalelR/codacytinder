package com.tinder.domain.profile.usecase;

import com.tinder.domain.onboarding.OnboardingTutorialAdapter;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class CheckTutorialViewed_Factory implements Factory<CheckTutorialViewed> {
    private final Provider<GetProfileOptionData> getProfileOptionDataProvider;
    private final Provider<OnboardingTutorialAdapter> onboardingTutorialAdapterProvider;

    public CheckTutorialViewed_Factory(Provider<GetProfileOptionData> provider, Provider<OnboardingTutorialAdapter> provider2) {
        this.getProfileOptionDataProvider = provider;
        this.onboardingTutorialAdapterProvider = provider2;
    }

    public CheckTutorialViewed get() {
        return provideInstance(this.getProfileOptionDataProvider, this.onboardingTutorialAdapterProvider);
    }

    public static CheckTutorialViewed provideInstance(Provider<GetProfileOptionData> provider, Provider<OnboardingTutorialAdapter> provider2) {
        return new CheckTutorialViewed((GetProfileOptionData) provider.get(), (OnboardingTutorialAdapter) provider2.get());
    }

    public static CheckTutorialViewed_Factory create(Provider<GetProfileOptionData> provider, Provider<OnboardingTutorialAdapter> provider2) {
        return new CheckTutorialViewed_Factory(provider, provider2);
    }

    public static CheckTutorialViewed newCheckTutorialViewed(GetProfileOptionData getProfileOptionData, OnboardingTutorialAdapter onboardingTutorialAdapter) {
        return new CheckTutorialViewed(getProfileOptionData, onboardingTutorialAdapter);
    }
}
