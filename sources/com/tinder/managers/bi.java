package com.tinder.managers;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.EnvironmentProvider;
import com.tinder.api.ManagerNetwork;
import com.tinder.core.experiment.AbTestUtility;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class bi implements Factory<bf> {
    /* renamed from: a */
    private final Provider<ManagerNetwork> f42504a;
    /* renamed from: b */
    private final Provider<C2630h> f42505b;
    /* renamed from: c */
    private final Provider<EnvironmentProvider> f42506c;
    /* renamed from: d */
    private final Provider<AbTestUtility> f42507d;

    public /* synthetic */ Object get() {
        return m51814a();
    }

    public bi(Provider<ManagerNetwork> provider, Provider<C2630h> provider2, Provider<EnvironmentProvider> provider3, Provider<AbTestUtility> provider4) {
        this.f42504a = provider;
        this.f42505b = provider2;
        this.f42506c = provider3;
        this.f42507d = provider4;
    }

    /* renamed from: a */
    public bf m51814a() {
        return m51812a(this.f42504a, this.f42505b, this.f42506c, this.f42507d);
    }

    /* renamed from: a */
    public static bf m51812a(Provider<ManagerNetwork> provider, Provider<C2630h> provider2, Provider<EnvironmentProvider> provider3, Provider<AbTestUtility> provider4) {
        return new bf((ManagerNetwork) provider.get(), (C2630h) provider2.get(), (EnvironmentProvider) provider3.get(), (AbTestUtility) provider4.get());
    }

    /* renamed from: b */
    public static bi m51813b(Provider<ManagerNetwork> provider, Provider<C2630h> provider2, Provider<EnvironmentProvider> provider3, Provider<AbTestUtility> provider4) {
        return new bi(provider, provider2, provider3, provider4);
    }
}
