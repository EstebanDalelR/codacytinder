package com.tinder.recs;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.profile.model.Profile.C14418b;
import com.tinder.recs.card.CardSizeProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsCardFactory_Factory implements Factory<RecsCardFactory> {
    private final Provider<AbTestUtility> abTestUtilityProvider;
    private final Provider<CardSizeProvider> cardSizeProvider;
    private final Provider<RecsPhotoUrlFactory> photoUrlFactoryProvider;
    private final Provider<C14418b> profileFactoryProvider;

    public RecsCardFactory_Factory(Provider<RecsPhotoUrlFactory> provider, Provider<CardSizeProvider> provider2, Provider<C14418b> provider3, Provider<AbTestUtility> provider4) {
        this.photoUrlFactoryProvider = provider;
        this.cardSizeProvider = provider2;
        this.profileFactoryProvider = provider3;
        this.abTestUtilityProvider = provider4;
    }

    public RecsCardFactory get() {
        return provideInstance(this.photoUrlFactoryProvider, this.cardSizeProvider, this.profileFactoryProvider, this.abTestUtilityProvider);
    }

    public static RecsCardFactory provideInstance(Provider<RecsPhotoUrlFactory> provider, Provider<CardSizeProvider> provider2, Provider<C14418b> provider3, Provider<AbTestUtility> provider4) {
        return new RecsCardFactory((RecsPhotoUrlFactory) provider.get(), (CardSizeProvider) provider2.get(), (C14418b) provider3.get(), (AbTestUtility) provider4.get());
    }

    public static RecsCardFactory_Factory create(Provider<RecsPhotoUrlFactory> provider, Provider<CardSizeProvider> provider2, Provider<C14418b> provider3, Provider<AbTestUtility> provider4) {
        return new RecsCardFactory_Factory(provider, provider2, provider3, provider4);
    }

    public static RecsCardFactory newRecsCardFactory(RecsPhotoUrlFactory recsPhotoUrlFactory, CardSizeProvider cardSizeProvider, C14418b c14418b, AbTestUtility abTestUtility) {
        return new RecsCardFactory(recsPhotoUrlFactory, cardSizeProvider, c14418b, abTestUtility);
    }
}
