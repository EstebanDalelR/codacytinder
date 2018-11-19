package com.tinder.recs.presenter;

import com.tinder.domain.profile.usecase.LoadDiscoverySettings;
import com.tinder.managers.bj;
import com.tinder.recs.analytics.AddRecsInteractEvent;
import com.tinder.recs.usecase.UpdateDiscoverySettings;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SettingsShortcutPresenter_Factory implements Factory<SettingsShortcutPresenter> {
    private final Provider<AddRecsInteractEvent> addRecsInteractEventProvider;
    private final Provider<LoadDiscoverySettings> loadDiscoverySettingsProvider;
    private final Provider<bj> managerSettingsProvider;
    private final Provider<UpdateDiscoverySettings> updateDiscoverySettingsProvider;

    public SettingsShortcutPresenter_Factory(Provider<UpdateDiscoverySettings> provider, Provider<bj> provider2, Provider<LoadDiscoverySettings> provider3, Provider<AddRecsInteractEvent> provider4) {
        this.updateDiscoverySettingsProvider = provider;
        this.managerSettingsProvider = provider2;
        this.loadDiscoverySettingsProvider = provider3;
        this.addRecsInteractEventProvider = provider4;
    }

    public SettingsShortcutPresenter get() {
        return provideInstance(this.updateDiscoverySettingsProvider, this.managerSettingsProvider, this.loadDiscoverySettingsProvider, this.addRecsInteractEventProvider);
    }

    public static SettingsShortcutPresenter provideInstance(Provider<UpdateDiscoverySettings> provider, Provider<bj> provider2, Provider<LoadDiscoverySettings> provider3, Provider<AddRecsInteractEvent> provider4) {
        return new SettingsShortcutPresenter((UpdateDiscoverySettings) provider.get(), (bj) provider2.get(), (LoadDiscoverySettings) provider3.get(), (AddRecsInteractEvent) provider4.get());
    }

    public static SettingsShortcutPresenter_Factory create(Provider<UpdateDiscoverySettings> provider, Provider<bj> provider2, Provider<LoadDiscoverySettings> provider3, Provider<AddRecsInteractEvent> provider4) {
        return new SettingsShortcutPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static SettingsShortcutPresenter newSettingsShortcutPresenter(UpdateDiscoverySettings updateDiscoverySettings, bj bjVar, LoadDiscoverySettings loadDiscoverySettings, AddRecsInteractEvent addRecsInteractEvent) {
        return new SettingsShortcutPresenter(updateDiscoverySettings, bjVar, loadDiscoverySettings, addRecsInteractEvent);
    }
}
