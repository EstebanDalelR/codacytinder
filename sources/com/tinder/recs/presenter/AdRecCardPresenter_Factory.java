package com.tinder.recs.presenter;

import com.tinder.addy.tracker.AdUrlTracker;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class AdRecCardPresenter_Factory implements Factory<AdRecCardPresenter> {
    private final Provider<AdUrlTracker> adUrlTrackerProvider;

    public AdRecCardPresenter_Factory(Provider<AdUrlTracker> provider) {
        this.adUrlTrackerProvider = provider;
    }

    public AdRecCardPresenter get() {
        return provideInstance(this.adUrlTrackerProvider);
    }

    public static AdRecCardPresenter provideInstance(Provider<AdUrlTracker> provider) {
        return new AdRecCardPresenter((AdUrlTracker) provider.get());
    }

    public static AdRecCardPresenter_Factory create(Provider<AdUrlTracker> provider) {
        return new AdRecCardPresenter_Factory(provider);
    }

    public static AdRecCardPresenter newAdRecCardPresenter(AdUrlTracker adUrlTracker) {
        return new AdRecCardPresenter(adUrlTracker);
    }
}
