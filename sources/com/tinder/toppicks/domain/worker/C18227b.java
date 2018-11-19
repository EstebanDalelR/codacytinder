package com.tinder.toppicks.domain.worker;

import com.tinder.domain.profile.usecase.ObserveDiscoverySettings;
import com.tinder.domain.toppicks.usecase.ResetScreenState;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.toppicks.domain.worker.b */
public final class C18227b implements Factory<C17007a> {
    /* renamed from: a */
    private final Provider<ObserveDiscoverySettings> f56507a;
    /* renamed from: b */
    private final Provider<ResetScreenState> f56508b;

    public /* synthetic */ Object get() {
        return m66069a();
    }

    public C18227b(Provider<ObserveDiscoverySettings> provider, Provider<ResetScreenState> provider2) {
        this.f56507a = provider;
        this.f56508b = provider2;
    }

    /* renamed from: a */
    public C17007a m66069a() {
        return C18227b.m66067a(this.f56507a, this.f56508b);
    }

    /* renamed from: a */
    public static C17007a m66067a(Provider<ObserveDiscoverySettings> provider, Provider<ResetScreenState> provider2) {
        return new C17007a((ObserveDiscoverySettings) provider.get(), (ResetScreenState) provider2.get());
    }

    /* renamed from: b */
    public static C18227b m66068b(Provider<ObserveDiscoverySettings> provider, Provider<ResetScreenState> provider2) {
        return new C18227b(provider, provider2);
    }
}
