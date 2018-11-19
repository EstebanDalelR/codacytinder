package com.tinder.data;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/tinder/data/SharedPreferencesModule;", "", "()V", "providesSharedPreferences", "Landroid/content/SharedPreferences;", "context", "Landroid/app/Application;", "data_release"}, k = 1, mv = {1, 1, 10})
@Module
/* renamed from: com.tinder.data.a */
public final class C8611a {
    /* renamed from: a */
    public static final C8611a f30471a = new C8611a();

    private C8611a() {
    }

    @JvmStatic
    @NotNull
    @Provides
    /* renamed from: a */
    public static final SharedPreferences m36735a(@NotNull Application application) {
        C2668g.b(application, "context");
        application = PreferenceManager.getDefaultSharedPreferences(application);
        C2668g.a(application, "PreferenceManager.getDef…haredPreferences(context)");
        return application;
    }
}
