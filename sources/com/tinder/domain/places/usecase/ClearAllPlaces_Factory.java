package com.tinder.domain.places.usecase;

import com.tinder.domain.places.PlacesLoadedStateProvider;
import com.tinder.domain.places.PlacesRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ClearAllPlaces_Factory implements Factory<ClearAllPlaces> {
    private final Provider<PlacesRepository> placesRepositoryProvider;
    private final Provider<PlacesLoadedStateProvider> stateProvider;

    public ClearAllPlaces_Factory(Provider<PlacesLoadedStateProvider> provider, Provider<PlacesRepository> provider2) {
        this.stateProvider = provider;
        this.placesRepositoryProvider = provider2;
    }

    public ClearAllPlaces get() {
        return provideInstance(this.stateProvider, this.placesRepositoryProvider);
    }

    public static ClearAllPlaces provideInstance(Provider<PlacesLoadedStateProvider> provider, Provider<PlacesRepository> provider2) {
        return new ClearAllPlaces((PlacesLoadedStateProvider) provider.get(), (PlacesRepository) provider2.get());
    }

    public static ClearAllPlaces_Factory create(Provider<PlacesLoadedStateProvider> provider, Provider<PlacesRepository> provider2) {
        return new ClearAllPlaces_Factory(provider, provider2);
    }

    public static ClearAllPlaces newClearAllPlaces(PlacesLoadedStateProvider placesLoadedStateProvider, PlacesRepository placesRepository) {
        return new ClearAllPlaces(placesLoadedStateProvider, placesRepository);
    }
}
