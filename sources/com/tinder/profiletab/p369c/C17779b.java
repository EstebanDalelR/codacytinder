package com.tinder.profiletab.p369c;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.profile.usecase.LoadDiscoverySettings;
import com.tinder.domain.settings.loops.repository.AutoPlayVideoSettingsRepository;
import com.tinder.domain.toppicks.repo.TopPicksApplicationRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.profiletab.c.b */
public final class C17779b implements Factory<C16173a> {
    /* renamed from: a */
    private final Provider<C2630h> f55474a;
    /* renamed from: b */
    private final Provider<LoadDiscoverySettings> f55475b;
    /* renamed from: c */
    private final Provider<FastMatchConfigProvider> f55476c;
    /* renamed from: d */
    private final Provider<TopPicksApplicationRepository> f55477d;
    /* renamed from: e */
    private final Provider<AutoPlayVideoSettingsRepository> f55478e;

    public /* synthetic */ Object get() {
        return m64975a();
    }

    public C17779b(Provider<C2630h> provider, Provider<LoadDiscoverySettings> provider2, Provider<FastMatchConfigProvider> provider3, Provider<TopPicksApplicationRepository> provider4, Provider<AutoPlayVideoSettingsRepository> provider5) {
        this.f55474a = provider;
        this.f55475b = provider2;
        this.f55476c = provider3;
        this.f55477d = provider4;
        this.f55478e = provider5;
    }

    /* renamed from: a */
    public C16173a m64975a() {
        return C17779b.m64973a(this.f55474a, this.f55475b, this.f55476c, this.f55477d, this.f55478e);
    }

    /* renamed from: a */
    public static C16173a m64973a(Provider<C2630h> provider, Provider<LoadDiscoverySettings> provider2, Provider<FastMatchConfigProvider> provider3, Provider<TopPicksApplicationRepository> provider4, Provider<AutoPlayVideoSettingsRepository> provider5) {
        return new C16173a((C2630h) provider.get(), (LoadDiscoverySettings) provider2.get(), (FastMatchConfigProvider) provider3.get(), (TopPicksApplicationRepository) provider4.get(), (AutoPlayVideoSettingsRepository) provider5.get());
    }

    /* renamed from: b */
    public static C17779b m64974b(Provider<C2630h> provider, Provider<LoadDiscoverySettings> provider2, Provider<FastMatchConfigProvider> provider3, Provider<TopPicksApplicationRepository> provider4, Provider<AutoPlayVideoSettingsRepository> provider5) {
        return new C17779b(provider, provider2, provider3, provider4, provider5);
    }
}
