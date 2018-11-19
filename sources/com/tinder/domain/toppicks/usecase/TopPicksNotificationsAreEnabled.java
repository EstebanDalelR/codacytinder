package com.tinder.domain.toppicks.usecase;

import com.tinder.domain.common.usecase.ResultUseCase;
import com.tinder.domain.config.TopPicksConfig;
import com.tinder.domain.pushnotifications.model.PushNotificationType;
import com.tinder.domain.settings.notifications.NotificationSettingsSource;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/domain/toppicks/usecase/TopPicksNotificationsAreEnabled;", "Lcom/tinder/domain/common/usecase/ResultUseCase;", "", "notificationSettingsSource", "Lcom/tinder/domain/settings/notifications/NotificationSettingsSource;", "topPicksConfig", "Lcom/tinder/domain/config/TopPicksConfig;", "(Lcom/tinder/domain/settings/notifications/NotificationSettingsSource;Lcom/tinder/domain/config/TopPicksConfig;)V", "execute", "()Ljava/lang/Boolean;", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class TopPicksNotificationsAreEnabled implements ResultUseCase<Boolean> {
    private final NotificationSettingsSource notificationSettingsSource;
    private final TopPicksConfig topPicksConfig;

    @Inject
    public TopPicksNotificationsAreEnabled(@NotNull NotificationSettingsSource notificationSettingsSource, @NotNull TopPicksConfig topPicksConfig) {
        C2668g.b(notificationSettingsSource, "notificationSettingsSource");
        C2668g.b(topPicksConfig, "topPicksConfig");
        this.notificationSettingsSource = notificationSettingsSource;
        this.topPicksConfig = topPicksConfig;
    }

    @NotNull
    public Boolean execute() {
        boolean z = this.notificationSettingsSource.isPushNotificationEnabled(PushNotificationType.TOP_PICKS) && this.topPicksConfig.getPushNotificationEnabled();
        return Boolean.valueOf(z);
    }
}
