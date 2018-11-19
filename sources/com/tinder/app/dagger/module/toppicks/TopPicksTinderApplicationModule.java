package com.tinder.app.dagger.module.toppicks;

import com.tinder.data.toppicks.C11005a;
import com.tinder.data.toppicks.C11006c;
import com.tinder.data.toppicks.C11017k;
import com.tinder.domain.config.TopPicksConfig;
import com.tinder.domain.toppicks.TopPicksDiscoveryNotificationDispatcher;
import com.tinder.domain.toppicks.TopPicksLoadingStatusNotifier;
import com.tinder.domain.toppicks.TopPicksLoadingStatusProvider;
import com.tinder.domain.toppicks.TopPicksLoadingStatusProviderAndNotifier;
import com.tinder.domain.toppicks.repo.TopPicksApplicationRepository;
import com.tinder.domain.toppicks.repo.TopPicksSessionRepository;
import com.tinder.domain.toppicks.repo.TopPicksSettingRepository;
import com.tinder.toppicks.domain.worker.C17007a;
import com.tinder.toppicks.domain.worker.C17010c;
import com.tinder.toppicks.domain.worker.TopPicksWorker;
import com.tinder.toppicks.notifications.C17037a;
import com.tinder.toppicks.notifications.C17047h;
import com.tinder.toppicks.notifications.C17049j;
import com.tinder.toppicks.notifications.TopPicksNotificationDispatcher;
import com.tinder.toppicks.notifications.TopPicksNotificationScheduler;
import com.tinder.toppicks.p431b.C15234a;
import com.tinder.toppicks.p484f.C17026a;
import dagger.Binds;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/tinder/app/dagger/module/toppicks/TopPicksTinderApplicationModule;", "", "()V", "provideTopPicksConfig", "Lcom/tinder/domain/config/TopPicksConfig;", "topPicksConfigFactory", "Ldagger/Lazy;", "Lcom/tinder/toppicks/config/TopPicksConfigFactory;", "provideTopPicksConfig$Tinder_release", "Declarations", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@Module(includes = {Declarations.class})
public final class TopPicksTinderApplicationModule {

    @Module
    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH'J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H'J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H'J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H'J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH'J\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001fH'J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H'J\u0010\u0010$\u001a\u00020%2\u0006\u0010\"\u001a\u00020#H'J\u0010\u0010&\u001a\u00020'2\u0006\u0010\f\u001a\u00020(H'¨\u0006)"}, d2 = {"Lcom/tinder/app/dagger/module/toppicks/TopPicksTinderApplicationModule$Declarations;", "", "provideTopPicksApplicationRepository", "Lcom/tinder/domain/toppicks/repo/TopPicksApplicationRepository;", "topPicksSettingDataRepository", "Lcom/tinder/data/toppicks/TopPicksApplicationDataRepository;", "provideTopPicksDiscoverySettingWorker", "Lcom/tinder/toppicks/domain/worker/TopPicksWorker;", "topPicksDiscoverySettingWorker", "Lcom/tinder/toppicks/domain/worker/TopPicksDiscoverySettingWorker;", "provideTopPicksDisoveryNotificationsDispatcher", "Lcom/tinder/domain/toppicks/TopPicksDiscoveryNotificationDispatcher;", "tinderTopPicksNotificationDispatcher", "Lcom/tinder/toppicks/notifications/TinderTopPicksDiscoveryNotificationDispatcher;", "provideTopPicksNotificationScheduler", "Lcom/tinder/toppicks/notifications/TopPicksNotificationScheduler;", "dailyTopPicksNotificationScheduler", "Lcom/tinder/toppicks/notifications/DailyTopPicksNotificationScheduler;", "provideTopPicksPassportChangeWorker", "topPicksPassportChangeWorker", "Lcom/tinder/toppicks/worker/TopPicksPassportChangeWorker;", "provideTopPicksSessionRepository", "Lcom/tinder/domain/toppicks/repo/TopPicksSessionRepository;", "inMemoryTopPicksSessionRepository", "Lcom/tinder/data/toppicks/InMemoryTopPicksSessionRepository;", "provideTopPicksSettingsRepository", "Lcom/tinder/domain/toppicks/repo/TopPicksSettingRepository;", "inMemoryTopPicksSettingsRepository", "Lcom/tinder/data/toppicks/InMemoryTopPicksSettingsRepository;", "provideTopPicksSubscriptionWorker", "topPicksSubscriptionWorker", "Lcom/tinder/toppicks/domain/worker/TopPicksSubscriptionWorker;", "providesTopPickLoadingStatusNotifier", "Lcom/tinder/domain/toppicks/TopPicksLoadingStatusNotifier;", "topPicksLoadingStatusProviderAndNotifier", "Lcom/tinder/domain/toppicks/TopPicksLoadingStatusProviderAndNotifier;", "providesTopPickLoadingStatusProvider", "Lcom/tinder/domain/toppicks/TopPicksLoadingStatusProvider;", "providesTopPicksNotificationDispatcher", "Lcom/tinder/toppicks/notifications/TopPicksNotificationDispatcher;", "Lcom/tinder/toppicks/notifications/TinderTopPicksNotificationDispatcher;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public interface Declarations {
        @NotNull
        @Binds
        TopPicksApplicationRepository provideTopPicksApplicationRepository(@NotNull C11017k c11017k);

        @NotNull
        @Binds
        @IntoSet
        TopPicksWorker provideTopPicksDiscoverySettingWorker(@NotNull C17007a c17007a);

        @NotNull
        @Binds
        TopPicksDiscoveryNotificationDispatcher provideTopPicksDisoveryNotificationsDispatcher(@NotNull C17047h c17047h);

        @NotNull
        @Binds
        TopPicksNotificationScheduler provideTopPicksNotificationScheduler(@NotNull C17037a c17037a);

        @NotNull
        @Binds
        @IntoSet
        TopPicksWorker provideTopPicksPassportChangeWorker(@NotNull C17026a c17026a);

        @Singleton
        @NotNull
        @Binds
        TopPicksSessionRepository provideTopPicksSessionRepository(@NotNull C11005a c11005a);

        @Singleton
        @NotNull
        @Binds
        TopPicksSettingRepository provideTopPicksSettingsRepository(@NotNull C11006c c11006c);

        @NotNull
        @Binds
        @IntoSet
        TopPicksWorker provideTopPicksSubscriptionWorker(@NotNull C17010c c17010c);

        @Singleton
        @NotNull
        @Binds
        TopPicksLoadingStatusNotifier providesTopPickLoadingStatusNotifier(@NotNull TopPicksLoadingStatusProviderAndNotifier topPicksLoadingStatusProviderAndNotifier);

        @Singleton
        @NotNull
        @Binds
        TopPicksLoadingStatusProvider providesTopPickLoadingStatusProvider(@NotNull TopPicksLoadingStatusProviderAndNotifier topPicksLoadingStatusProviderAndNotifier);

        @NotNull
        @Binds
        TopPicksNotificationDispatcher providesTopPicksNotificationDispatcher(@NotNull C17049j c17049j);
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final TopPicksConfig m35227a(@NotNull Lazy<C15234a> lazy) {
        C2668g.b(lazy, "topPicksConfigFactory");
        return ((C15234a) lazy.get()).a();
    }
}
