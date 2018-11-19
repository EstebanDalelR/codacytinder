package com.tinder.domain.settings.notifications;

import com.tinder.domain.pushnotifications.model.PushNotificationType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\bH&¨\u0006\r"}, d2 = {"Lcom/tinder/domain/settings/notifications/NotificationSettingsSource;", "", "disablePushNotification", "", "pushNotificationType", "Lcom/tinder/domain/pushnotifications/model/PushNotificationType;", "enablePushNotification", "getLikesYouNotificationFrequency", "", "isPushNotificationEnabled", "", "saveLikesYouNotificationFrequency", "frequency", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface NotificationSettingsSource {
    void disablePushNotification(@NotNull PushNotificationType pushNotificationType);

    void enablePushNotification(@NotNull PushNotificationType pushNotificationType);

    int getLikesYouNotificationFrequency();

    boolean isPushNotificationEnabled(@NotNull PushNotificationType pushNotificationType);

    void saveLikesYouNotificationFrequency(int i);
}
