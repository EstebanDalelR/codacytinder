package com.tinder.data.p206a.p207a;

import android.app.Application;
import android.content.SharedPreferences;
import com.tinder.data.p206a.C10725a;
import com.tinder.domain.apprating.AppRatingRepository;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/tinder/data/apprating/module/AppRatingDataModule;", "", "()V", "provideAppRatingRepository", "Lcom/tinder/domain/apprating/AppRatingRepository;", "sharedPreferences", "Landroid/content/SharedPreferences;", "provideAppRatingRepository$data_release", "provideConfigSharedPreferences", "application", "Landroid/app/Application;", "provideConfigSharedPreferences$data_release", "data_release"}, k = 1, mv = {1, 1, 10})
@Module
/* renamed from: com.tinder.data.a.a.a */
public final class C8610a {
    @Named("appRatingPreferences")
    @Singleton
    @NotNull
    @Provides
    /* renamed from: a */
    public final SharedPreferences m36733a(@NotNull Application application) {
        C2668g.b(application, "application");
        application = application.getSharedPreferences("appRatingPreferences", 0);
        C2668g.a(application, "application.getSharedPre…ES, Context.MODE_PRIVATE)");
        return application;
    }

    @Singleton
    @NotNull
    @Provides
    /* renamed from: a */
    public final AppRatingRepository m36734a(@NotNull @Named("appRatingPreferences") SharedPreferences sharedPreferences) {
        C2668g.b(sharedPreferences, "sharedPreferences");
        return new C10725a(sharedPreferences);
    }
}
