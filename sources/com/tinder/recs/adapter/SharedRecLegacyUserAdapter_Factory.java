package com.tinder.recs.adapter;

import com.tinder.domain.utils.AgeCalculator;
import com.tinder.profile.adapters.C14367k;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SharedRecLegacyUserAdapter_Factory implements Factory<SharedRecLegacyUserAdapter> {
    private final Provider<AgeCalculator> ageCalculatorProvider;
    private final Provider<C14367k> legacyUserAdapterProvider;

    public SharedRecLegacyUserAdapter_Factory(Provider<C14367k> provider, Provider<AgeCalculator> provider2) {
        this.legacyUserAdapterProvider = provider;
        this.ageCalculatorProvider = provider2;
    }

    public SharedRecLegacyUserAdapter get() {
        return provideInstance(this.legacyUserAdapterProvider, this.ageCalculatorProvider);
    }

    public static SharedRecLegacyUserAdapter provideInstance(Provider<C14367k> provider, Provider<AgeCalculator> provider2) {
        return new SharedRecLegacyUserAdapter((C14367k) provider.get(), (AgeCalculator) provider2.get());
    }

    public static SharedRecLegacyUserAdapter_Factory create(Provider<C14367k> provider, Provider<AgeCalculator> provider2) {
        return new SharedRecLegacyUserAdapter_Factory(provider, provider2);
    }

    public static SharedRecLegacyUserAdapter newSharedRecLegacyUserAdapter(C14367k c14367k, AgeCalculator ageCalculator) {
        return new SharedRecLegacyUserAdapter(c14367k, ageCalculator);
    }
}
