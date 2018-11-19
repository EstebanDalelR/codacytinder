package com.tinder.data.loops.p223a;

import android.app.Application;
import android.content.SharedPreferences;
import com.tinder.data.loops.AutoPlayVideoPreferences;
import com.tinder.data.loops.C10792a;
import com.tinder.domain.settings.loops.repository.AutoPlayVideoSettingsRepository;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/tinder/data/loops/module/AutoPlayVideoDataModule;", "", "()V", "provideAutoPlayVideoSettingsRepository", "Lcom/tinder/domain/settings/loops/repository/AutoPlayVideoSettingsRepository;", "sharedPreferences", "Landroid/content/SharedPreferences;", "provideAutoPlayVideoSettingsRepository$data_release", "provideConfigSharedPreferences", "application", "Landroid/app/Application;", "provideConfigSharedPreferences$data_release", "data_release"}, k = 1, mv = {1, 1, 10})
@Module
/* renamed from: com.tinder.data.loops.a.a */
public final class C8671a {
    @AutoPlayVideoPreferences
    @Singleton
    @NotNull
    @Provides
    /* renamed from: a */
    public final SharedPreferences m36943a(@NotNull Application application) {
        C2668g.b(application, "application");
        application = application.getSharedPreferences("PreferenceAutoPlayVideoSettingsRepository_loops", 0);
        C2668g.a(application, "application.getSharedPre…xt.MODE_PRIVATE\n        )");
        return application;
    }

    @Singleton
    @NotNull
    @Provides
    /* renamed from: a */
    public final AutoPlayVideoSettingsRepository m36944a(@NotNull @AutoPlayVideoPreferences SharedPreferences sharedPreferences) {
        C2668g.b(sharedPreferences, "sharedPreferences");
        return new C10792a(sharedPreferences);
    }
}
