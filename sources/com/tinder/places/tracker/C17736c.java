package com.tinder.places.tracker;

import android.app.Application;
import com.tinder.api.EnvironmentProvider;
import com.tinder.auth.repository.C8297k;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.places.tracker.c */
public final class C17736c implements Factory<PilgrimLocationTracker> {
    /* renamed from: a */
    private final Provider<Application> f55189a;
    /* renamed from: b */
    private final Provider<EnvironmentProvider> f55190b;
    /* renamed from: c */
    private final Provider<LoadProfileOptionData> f55191c;
    /* renamed from: d */
    private final Provider<C8297k> f55192d;

    public /* synthetic */ Object get() {
        return m64615a();
    }

    public C17736c(Provider<Application> provider, Provider<EnvironmentProvider> provider2, Provider<LoadProfileOptionData> provider3, Provider<C8297k> provider4) {
        this.f55189a = provider;
        this.f55190b = provider2;
        this.f55191c = provider3;
        this.f55192d = provider4;
    }

    /* renamed from: a */
    public PilgrimLocationTracker m64615a() {
        return C17736c.m64613a(this.f55189a, this.f55190b, this.f55191c, this.f55192d);
    }

    /* renamed from: a */
    public static PilgrimLocationTracker m64613a(Provider<Application> provider, Provider<EnvironmentProvider> provider2, Provider<LoadProfileOptionData> provider3, Provider<C8297k> provider4) {
        return new PilgrimLocationTracker((Application) provider.get(), (EnvironmentProvider) provider2.get(), (LoadProfileOptionData) provider3.get(), (C8297k) provider4.get());
    }

    /* renamed from: b */
    public static C17736c m64614b(Provider<Application> provider, Provider<EnvironmentProvider> provider2, Provider<LoadProfileOptionData> provider3, Provider<C8297k> provider4) {
        return new C17736c(provider, provider2, provider3, provider4);
    }
}
