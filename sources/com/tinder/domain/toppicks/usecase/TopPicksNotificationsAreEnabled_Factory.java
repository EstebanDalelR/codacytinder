package com.tinder.domain.toppicks.usecase;

import com.tinder.domain.config.TopPicksConfig;
import com.tinder.domain.settings.notifications.NotificationSettingsSource;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class TopPicksNotificationsAreEnabled_Factory implements Factory<TopPicksNotificationsAreEnabled> {
    private final Provider<NotificationSettingsSource> notificationSettingsSourceProvider;
    private final Provider<TopPicksConfig> topPicksConfigProvider;

    public TopPicksNotificationsAreEnabled_Factory(Provider<NotificationSettingsSource> provider, Provider<TopPicksConfig> provider2) {
        this.notificationSettingsSourceProvider = provider;
        this.topPicksConfigProvider = provider2;
    }

    public TopPicksNotificationsAreEnabled get() {
        return provideInstance(this.notificationSettingsSourceProvider, this.topPicksConfigProvider);
    }

    public static TopPicksNotificationsAreEnabled provideInstance(Provider<NotificationSettingsSource> provider, Provider<TopPicksConfig> provider2) {
        return new TopPicksNotificationsAreEnabled((NotificationSettingsSource) provider.get(), (TopPicksConfig) provider2.get());
    }

    public static TopPicksNotificationsAreEnabled_Factory create(Provider<NotificationSettingsSource> provider, Provider<TopPicksConfig> provider2) {
        return new TopPicksNotificationsAreEnabled_Factory(provider, provider2);
    }

    public static TopPicksNotificationsAreEnabled newTopPicksNotificationsAreEnabled(NotificationSettingsSource notificationSettingsSource, TopPicksConfig topPicksConfig) {
        return new TopPicksNotificationsAreEnabled(notificationSettingsSource, topPicksConfig);
    }
}
