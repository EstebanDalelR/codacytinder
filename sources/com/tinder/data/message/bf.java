package com.tinder.data.message;

import android.app.Application;
import com.tinder.domain.message.ReactionSettingsRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class bf implements Factory<ReactionSettingsRepository> {
    /* renamed from: a */
    private final be f41485a;
    /* renamed from: b */
    private final Provider<Application> f41486b;

    public /* synthetic */ Object get() {
        return m50670a();
    }

    public bf(be beVar, Provider<Application> provider) {
        this.f41485a = beVar;
        this.f41486b = provider;
    }

    /* renamed from: a */
    public ReactionSettingsRepository m50670a() {
        return m50668a(this.f41485a, this.f41486b);
    }

    /* renamed from: a */
    public static ReactionSettingsRepository m50668a(be beVar, Provider<Application> provider) {
        return m50667a(beVar, (Application) provider.get());
    }

    /* renamed from: b */
    public static bf m50669b(be beVar, Provider<Application> provider) {
        return new bf(beVar, provider);
    }

    /* renamed from: a */
    public static ReactionSettingsRepository m50667a(be beVar, Application application) {
        return (ReactionSettingsRepository) C15521i.a(beVar.m37145a(application), "Cannot return null from a non-@Nullable @Provides method");
    }
}
