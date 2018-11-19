package com.tinder.common;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.profile.repository.ProfileLocalRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.common.s */
public final class C12793s implements Factory<C12791q> {
    /* renamed from: a */
    private final Provider<C12781h> f41191a;
    /* renamed from: b */
    private final Provider<ProfileLocalRepository> f41192b;
    /* renamed from: c */
    private final Provider<AbTestUtility> f41193c;

    public /* synthetic */ Object get() {
        return m50286a();
    }

    public C12793s(Provider<C12781h> provider, Provider<ProfileLocalRepository> provider2, Provider<AbTestUtility> provider3) {
        this.f41191a = provider;
        this.f41192b = provider2;
        this.f41193c = provider3;
    }

    /* renamed from: a */
    public C12791q m50286a() {
        return C12793s.m50284a(this.f41191a, this.f41192b, this.f41193c);
    }

    /* renamed from: a */
    public static C12791q m50284a(Provider<C12781h> provider, Provider<ProfileLocalRepository> provider2, Provider<AbTestUtility> provider3) {
        return new C12791q((C12781h) provider.get(), (ProfileLocalRepository) provider2.get(), (AbTestUtility) provider3.get());
    }

    /* renamed from: b */
    public static C12793s m50285b(Provider<C12781h> provider, Provider<ProfileLocalRepository> provider2, Provider<AbTestUtility> provider3) {
        return new C12793s(provider, provider2, provider3);
    }
}
