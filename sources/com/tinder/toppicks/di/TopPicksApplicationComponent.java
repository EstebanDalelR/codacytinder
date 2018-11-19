package com.tinder.toppicks.di;

import com.tinder.domain.config.TopPicksConfig;
import com.tinder.domain.toppicks.repo.TopPicksApplicationRepository;
import com.tinder.toppicks.notifications.TopPicksNotificationDispatcher;
import com.tinder.toppicks.notifications.TopPicksNotificationDispatcherService;
import dagger.Component;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/toppicks/di/TopPicksApplicationComponent;", "", "inject", "", "topPicksNotificationDispatcherService", "Lcom/tinder/toppicks/notifications/TopPicksNotificationDispatcherService;", "Parent", "toppicks_release"}, k = 1, mv = {1, 1, 10})
@Component(dependencies = {Parent.class})
public interface TopPicksApplicationComponent {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/tinder/toppicks/di/TopPicksApplicationComponent$Parent;", "", "topPicksApplicationRepository", "Lcom/tinder/domain/toppicks/repo/TopPicksApplicationRepository;", "topPicksConfig", "Lcom/tinder/domain/config/TopPicksConfig;", "topPicksNotificationDispatcher", "Lcom/tinder/toppicks/notifications/TopPicksNotificationDispatcher;", "toppicks_release"}, k = 1, mv = {1, 1, 10})
    public interface Parent {
        @NotNull
        TopPicksApplicationRepository topPicksApplicationRepository();

        @NotNull
        TopPicksConfig topPicksConfig();

        @NotNull
        TopPicksNotificationDispatcher topPicksNotificationDispatcher();
    }

    void inject(@NotNull TopPicksNotificationDispatcherService topPicksNotificationDispatcherService);
}
