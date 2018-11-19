package com.tinder.module;

import com.tinder.data.fastmatch.C8649b;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.recs.RecsEngine;
import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.domain.recs.model.RecSource.FastMatch;
import com.tinder.domain.settings.notifications.NotificationSettingsSource;
import com.tinder.fastmatch.p338d.C11623a;
import com.tinder.managers.bk;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\b\u000bJ\u0015\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/tinder/module/FastMatchModule;", "", "()V", "provideFastMatchConfigProvider", "Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;", "dataStore", "Lcom/tinder/data/fastmatch/FastMatchSharedPreferenceDataStore;", "sharedPreferences", "Lcom/tinder/managers/ManagerSharedPreferences;", "notificationSettingsSource", "Lcom/tinder/domain/settings/notifications/NotificationSettingsSource;", "provideFastMatchConfigProvider$Tinder_release", "provideFastMatchEngine", "Lcom/tinder/domain/recs/RecsEngine;", "recsEngineRegistry", "Lcom/tinder/domain/recs/RecsEngineRegistry;", "provideFastMatchEngine$Tinder_release", "FastMatchRecsEngine", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@Module
public final class FastMatchModule {
    @Singleton
    @NotNull
    @Provides
    /* renamed from: a */
    public final FastMatchConfigProvider m40759a(@NotNull C8649b c8649b, @NotNull bk bkVar, @NotNull NotificationSettingsSource notificationSettingsSource) {
        C2668g.b(c8649b, "dataStore");
        C2668g.b(bkVar, "sharedPreferences");
        C2668g.b(notificationSettingsSource, "notificationSettingsSource");
        return new C11623a(c8649b, bkVar, notificationSettingsSource);
    }

    @NotNull
    @FastMatchModule$FastMatchRecsEngine
    @Provides
    /* renamed from: a */
    public final RecsEngine m40760a(@NotNull RecsEngineRegistry recsEngineRegistry) {
        C2668g.b(recsEngineRegistry, "recsEngineRegistry");
        return recsEngineRegistry.addEngineIfAbsent(FastMatch.INSTANCE);
    }
}
