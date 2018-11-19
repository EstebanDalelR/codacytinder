package com.tinder.domain.settings.notifications;

import com.tinder.domain.pushnotifications.model.LikesYouNotificationSettingConfig;
import com.tinder.domain.pushnotifications.model.PushNotificationSetting;
import com.tinder.domain.pushnotifications.model.PushNotificationType;
import io.reactivex.C3956a;
import io.reactivex.C3960g;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H&J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&¨\u0006\u0011"}, d2 = {"Lcom/tinder/domain/settings/notifications/NotificationSettingsRepository;", "", "isTypeEnabled", "", "pushNotificationType", "Lcom/tinder/domain/pushnotifications/model/PushNotificationType;", "observeNotificationSettings", "Lio/reactivex/Single;", "", "Lcom/tinder/domain/pushnotifications/model/PushNotificationSetting;", "saveNotificationSettings", "Lio/reactivex/Completable;", "pushNotificationSettings", "setLikesYouNotificationSettingConfig", "", "config", "Lcom/tinder/domain/pushnotifications/model/LikesYouNotificationSettingConfig;", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface NotificationSettingsRepository {
    boolean isTypeEnabled(@NotNull PushNotificationType pushNotificationType);

    @NotNull
    C3960g<Set<PushNotificationSetting>> observeNotificationSettings();

    @NotNull
    C3956a saveNotificationSettings(@NotNull Set<? extends PushNotificationSetting> set);

    void setLikesYouNotificationSettingConfig(@NotNull LikesYouNotificationSettingConfig likesYouNotificationSettingConfig);
}
