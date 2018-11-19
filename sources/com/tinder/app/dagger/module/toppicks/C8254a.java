package com.tinder.app.dagger.module.toppicks;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.data.toppicks.C11008g;
import com.tinder.data.toppicks.C11016j;
import com.tinder.data.toppicks.C11018m;
import com.tinder.data.toppicks.C11026o;
import com.tinder.data.toppicks.store.C8798a;
import com.tinder.data.toppicks.store.C8799c;
import com.tinder.dialogs.ah;
import com.tinder.domain.injection.qualifiers.CurrentDateTimeMillis;
import com.tinder.domain.toppicks.TopPicksCountUpdater;
import com.tinder.domain.toppicks.TopPicksCountUpdatesObserver;
import com.tinder.domain.toppicks.repo.TopPicksApplicationRepository;
import com.tinder.domain.toppicks.repo.TopPicksRepository;
import com.tinder.paywall.legacy.LegacyPaywallLauncher;
import com.tinder.paywall.legacy.TopPicksPaywallViewFactory;
import com.tinder.paywall.paywallflow.ab;
import com.tinder.recsgrid.C14782d;
import com.tinder.recsgrid.C16487f;
import com.tinder.recsgrid.ScrollStatusNotifier;
import com.tinder.recsgrid.ScrollStatusProvider;
import com.tinder.toppicks.C15256e;
import com.tinder.toppicks.C15275j;
import com.tinder.toppicks.SettingsLauncher;
import com.tinder.toppicks.di.TopPicksScope;
import com.tinder.toppicks.dialog.C16996a;
import com.tinder.views.grid.p449a.C15453a;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\u000e\u001a\u00020\u000bH\u0007J\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\b\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J%\u0010\u001d\u001a\u00020\u001e2\u000e\b\u0001\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$J\r\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\b'J5\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0001¢\u0006\u0002\b3J\r\u00104\u001a\u000205H\u0001¢\u0006\u0002\b6¨\u00067"}, d2 = {"Lcom/tinder/app/dagger/module/toppicks/TopPicksModule;", "", "()V", "providePaywallLauncher", "Lcom/tinder/paywall/legacy/LegacyPaywallLauncher;", "providePaywallLauncher$Tinder_release", "provideRecPrefetcher", "Lcom/tinder/recsgrid/RecPrefetcher;", "provideScrollStatusNotifier", "Lcom/tinder/recsgrid/ScrollStatusNotifier;", "scrollStatusProviderAndNotifier", "Lcom/tinder/recsgrid/ScrollStatusProviderAndNotifier;", "provideScrollStatusProvider", "Lcom/tinder/recsgrid/ScrollStatusProvider;", "provideScrollStatusProviderAndNotifer", "provideSettingsLauncher", "Lcom/tinder/toppicks/SettingsLauncher;", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "provideSettingsLauncher$Tinder_release", "provideTopPicksCountUpdateNotifier", "Lcom/tinder/domain/toppicks/TopPicksCountUpdater;", "topPicksCountUpdatesProviderAndUpdater", "Lcom/tinder/data/toppicks/TopPicksCountUpdatesObserverAndUpdater;", "provideTopPicksCountUpdateProvider", "Lcom/tinder/domain/toppicks/TopPicksCountUpdatesObserver;", "provideTopPicksCountUpdateProviderAndNotifier", "topPicksRepository", "Lcom/tinder/domain/toppicks/repo/TopPicksRepository;", "provideTopPicksExpirationTimeSynchronizer", "Lcom/tinder/toppicks/TopPicksExpirationTimeSynchronizer;", "currentDateTimeMills", "Lkotlin/Function0;", "", "topPicksTimeSyncDelayCalculator", "Lcom/tinder/toppicks/TopPicksTimeSyncDelayCalculator;", "provideTopPicksExpirationTimeSynchronizer$Tinder_release", "provideTopPicksPaywallViewProvider", "Lcom/tinder/paywall/legacy/TopPicksPaywallViewFactory;", "provideTopPicksPaywallViewProvider$Tinder_release", "provideTopPicksRepository", "teasersDataStore", "Lcom/tinder/data/toppicks/store/TopPicksTeasersLocalDataStore;", "topPicksApiClient", "Lcom/tinder/data/toppicks/TopPicksApiClient;", "topPicksTeaserAdapter", "Lcom/tinder/data/toppicks/TeaserRecToTopPickTeaserAdapter;", "topPicksSharedPreferencesDataStore", "Lcom/tinder/data/toppicks/store/TopPicksSharedPreferencesDataStore;", "topPicksSettingsRepository", "Lcom/tinder/domain/toppicks/repo/TopPicksApplicationRepository;", "provideTopPicksRepository$Tinder_release", "provideUserRecPhotoAlbumProvider", "Lcom/tinder/views/grid/provider/UserRecPhotoAlbumProvider;", "provideUserRecPhotoAlbumProvider$Tinder_release", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@Module
/* renamed from: com.tinder.app.dagger.module.toppicks.a */
public final class C8254a {
    @NotNull
    @TopPicksScope
    @Provides
    /* renamed from: a */
    public final TopPicksRepository m35230a(@NotNull C8799c c8799c, @NotNull C11016j c11016j, @NotNull C11008g c11008g, @NotNull C8798a c8798a, @NotNull TopPicksApplicationRepository topPicksApplicationRepository) {
        C2668g.b(c8799c, "teasersDataStore");
        C2668g.b(c11016j, "topPicksApiClient");
        C2668g.b(c11008g, "topPicksTeaserAdapter");
        C2668g.b(c8798a, "topPicksSharedPreferencesDataStore");
        C2668g.b(topPicksApplicationRepository, "topPicksSettingsRepository");
        return new C11026o(c8799c, c11016j, c11008g, c8798a, topPicksApplicationRepository);
    }

    @NotNull
    @TopPicksScope
    @Provides
    /* renamed from: a */
    public final LegacyPaywallLauncher m35231a() {
        return new ab();
    }

    @NotNull
    @TopPicksScope
    @Provides
    /* renamed from: b */
    public final TopPicksPaywallViewFactory m35236b() {
        return new C16996a();
    }

    @NotNull
    @Provides
    /* renamed from: c */
    public final C15453a m35238c() {
        return new C15453a();
    }

    @NotNull
    @TopPicksScope
    @Provides
    /* renamed from: d */
    public final C14782d m35239d() {
        return new C14782d(1.0f, 10);
    }

    @NotNull
    @TopPicksScope
    @Provides
    /* renamed from: a */
    public final ScrollStatusNotifier m35232a(@NotNull C16487f c16487f) {
        C2668g.b(c16487f, "scrollStatusProviderAndNotifier");
        return c16487f;
    }

    @NotNull
    @TopPicksScope
    @Provides
    /* renamed from: b */
    public final ScrollStatusProvider m35237b(@NotNull C16487f c16487f) {
        C2668g.b(c16487f, "scrollStatusProviderAndNotifier");
        return c16487f;
    }

    @NotNull
    @TopPicksScope
    @Provides
    /* renamed from: e */
    public final C16487f m35240e() {
        return new C16487f();
    }

    @NotNull
    @TopPicksScope
    @Provides
    /* renamed from: a */
    public final TopPicksCountUpdater m35229a(@NotNull C11018m c11018m) {
        C2668g.b(c11018m, "topPicksCountUpdatesProviderAndUpdater");
        return c11018m;
    }

    @NotNull
    @TopPicksScope
    @Provides
    /* renamed from: b */
    public final TopPicksCountUpdatesObserver m35235b(@NotNull C11018m c11018m) {
        C2668g.b(c11018m, "topPicksCountUpdatesProviderAndUpdater");
        return c11018m;
    }

    @NotNull
    @TopPicksScope
    @Provides
    /* renamed from: a */
    public final C11018m m35228a(@NotNull TopPicksRepository topPicksRepository) {
        C2668g.b(topPicksRepository, "topPicksRepository");
        return new C11018m(topPicksRepository);
    }

    @NotNull
    @TopPicksScope
    @Provides
    /* renamed from: a */
    public final SettingsLauncher m35233a(@NotNull AbTestUtility abTestUtility) {
        C2668g.b(abTestUtility, "abTestUtility");
        return new ah(abTestUtility);
    }

    @NotNull
    @TopPicksScope
    @Provides
    /* renamed from: a */
    public final C15256e m35234a(@NotNull @CurrentDateTimeMillis Function0<Long> function0, @NotNull C15275j c15275j) {
        C2668g.b(function0, "currentDateTimeMills");
        C2668g.b(c15275j, "topPicksTimeSyncDelayCalculator");
        return new C15256e(function0, c15275j);
    }
}
