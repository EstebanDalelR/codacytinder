package com.tinder.analytics.fireworks;

import com.tinder.auth.repository.C8297k;
import com.tinder.domain.auth.UniqueIdFactory;
import com.tinder.interactors.C2647c;
import com.tinder.managers.ManagerFusedLocation;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.analytics.fireworks.c */
public final class C8011c implements Factory<C7321b> {
    /* renamed from: a */
    private final Provider<C2647c> f28640a;
    /* renamed from: b */
    private final Provider<ManagerFusedLocation> f28641b;
    /* renamed from: c */
    private final Provider<UniqueIdFactory> f28642c;
    /* renamed from: d */
    private final Provider<C8297k> f28643d;

    public /* synthetic */ Object get() {
        return m33915a();
    }

    public C8011c(Provider<C2647c> provider, Provider<ManagerFusedLocation> provider2, Provider<UniqueIdFactory> provider3, Provider<C8297k> provider4) {
        this.f28640a = provider;
        this.f28641b = provider2;
        this.f28642c = provider3;
        this.f28643d = provider4;
    }

    /* renamed from: a */
    public C7321b m33915a() {
        return C8011c.m33913a(this.f28640a, this.f28641b, this.f28642c, this.f28643d);
    }

    /* renamed from: a */
    public static C7321b m33913a(Provider<C2647c> provider, Provider<ManagerFusedLocation> provider2, Provider<UniqueIdFactory> provider3, Provider<C8297k> provider4) {
        return new C7321b((C2647c) provider.get(), (ManagerFusedLocation) provider2.get(), (UniqueIdFactory) provider3.get(), (C8297k) provider4.get());
    }

    /* renamed from: b */
    public static C8011c m33914b(Provider<C2647c> provider, Provider<ManagerFusedLocation> provider2, Provider<UniqueIdFactory> provider3, Provider<C8297k> provider4) {
        return new C8011c(provider, provider2, provider3, provider4);
    }
}
