package com.tinder.toppicks.p431b;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.toppicks.repo.TopPicksApplicationRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.toppicks.b.b */
public final class C18220b implements Factory<C15234a> {
    /* renamed from: a */
    private final Provider<AbTestUtility> f56477a;
    /* renamed from: b */
    private final Provider<TopPicksApplicationRepository> f56478b;

    public /* synthetic */ Object get() {
        return m66043a();
    }

    public C18220b(Provider<AbTestUtility> provider, Provider<TopPicksApplicationRepository> provider2) {
        this.f56477a = provider;
        this.f56478b = provider2;
    }

    /* renamed from: a */
    public C15234a m66043a() {
        return C18220b.m66041a(this.f56477a, this.f56478b);
    }

    /* renamed from: a */
    public static C15234a m66041a(Provider<AbTestUtility> provider, Provider<TopPicksApplicationRepository> provider2) {
        return new C15234a((AbTestUtility) provider.get(), (TopPicksApplicationRepository) provider2.get());
    }

    /* renamed from: b */
    public static C18220b m66042b(Provider<AbTestUtility> provider, Provider<TopPicksApplicationRepository> provider2) {
        return new C18220b(provider, provider2);
    }
}
