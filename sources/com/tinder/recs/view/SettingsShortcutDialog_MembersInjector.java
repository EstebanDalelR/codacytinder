package com.tinder.recs.view;

import com.tinder.recs.presenter.SettingsShortcutPresenter;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class SettingsShortcutDialog_MembersInjector implements MembersInjector<SettingsShortcutDialog> {
    private final Provider<SettingsShortcutPresenter> presenterProvider;

    public SettingsShortcutDialog_MembersInjector(Provider<SettingsShortcutPresenter> provider) {
        this.presenterProvider = provider;
    }

    public static MembersInjector<SettingsShortcutDialog> create(Provider<SettingsShortcutPresenter> provider) {
        return new SettingsShortcutDialog_MembersInjector(provider);
    }

    public void injectMembers(SettingsShortcutDialog settingsShortcutDialog) {
        injectPresenter(settingsShortcutDialog, (SettingsShortcutPresenter) this.presenterProvider.get());
    }

    public static void injectPresenter(SettingsShortcutDialog settingsShortcutDialog, SettingsShortcutPresenter settingsShortcutPresenter) {
        settingsShortcutDialog.presenter = settingsShortcutPresenter;
    }
}
