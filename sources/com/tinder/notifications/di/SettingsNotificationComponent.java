package com.tinder.notifications.di;

import android.app.NotificationManager;
import android.content.res.Resources;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.domain.settings.notifications.NotificationSettingsRepository;
import com.tinder.notifications.view.LikesYouNotificationSettingItemView;
import com.tinder.notifications.view.NotificationSettingItemView;
import com.tinder.notifications.view.NotificationSettingsView;
import dagger.Component;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Component(dependencies = {Parent.class})
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\tJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH&¨\u0006\n"}, d2 = {"Lcom/tinder/notifications/di/SettingsNotificationComponent;", "", "inject", "", "view", "Lcom/tinder/notifications/view/LikesYouNotificationSettingItemView;", "notificationSettingItemView", "Lcom/tinder/notifications/view/NotificationSettingItemView;", "Lcom/tinder/notifications/view/NotificationSettingsView;", "Parent", "settings-notifications_release"}, k = 1, mv = {1, 1, 10})
@SettingsNotificationsScope
public interface SettingsNotificationComponent {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lcom/tinder/notifications/di/SettingsNotificationComponent$Parent;", "", "fastMatchConfigProvider", "Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;", "loadProfileOptionData", "Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;", "notificationManager", "Landroid/app/NotificationManager;", "notificationSettingsRepository", "Lcom/tinder/domain/settings/notifications/NotificationSettingsRepository;", "resources", "Landroid/content/res/Resources;", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "settings-notifications_release"}, k = 1, mv = {1, 1, 10})
    public interface Parent {
        @NotNull
        FastMatchConfigProvider fastMatchConfigProvider();

        @NotNull
        LoadProfileOptionData loadProfileOptionData();

        @NotNull
        NotificationManager notificationManager();

        @NotNull
        NotificationSettingsRepository notificationSettingsRepository();

        @NotNull
        Resources resources();

        @NotNull
        SubscriptionProvider subscriptionProvider();
    }

    void inject(@NotNull LikesYouNotificationSettingItemView likesYouNotificationSettingItemView);

    void inject(@NotNull NotificationSettingItemView notificationSettingItemView);

    void inject(@NotNull NotificationSettingsView notificationSettingsView);
}
