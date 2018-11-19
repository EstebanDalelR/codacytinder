package com.tinder.toppicks.p484f;

import com.tinder.domain.toppicks.usecase.ResetScreenState;
import com.tinder.passport.provider.PassportLocationProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.toppicks.f.b */
public final class C18231b implements Factory<C17026a> {
    /* renamed from: a */
    private final Provider<PassportLocationProvider> f56515a;
    /* renamed from: b */
    private final Provider<ResetScreenState> f56516b;

    public /* synthetic */ Object get() {
        return m66082a();
    }

    public C18231b(Provider<PassportLocationProvider> provider, Provider<ResetScreenState> provider2) {
        this.f56515a = provider;
        this.f56516b = provider2;
    }

    /* renamed from: a */
    public C17026a m66082a() {
        return C18231b.m66080a(this.f56515a, this.f56516b);
    }

    /* renamed from: a */
    public static C17026a m66080a(Provider<PassportLocationProvider> provider, Provider<ResetScreenState> provider2) {
        return new C17026a((PassportLocationProvider) provider.get(), (ResetScreenState) provider2.get());
    }

    /* renamed from: b */
    public static C18231b m66081b(Provider<PassportLocationProvider> provider, Provider<ResetScreenState> provider2) {
        return new C18231b(provider, provider2);
    }
}
