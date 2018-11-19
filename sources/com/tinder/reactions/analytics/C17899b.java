package com.tinder.reactions.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.match.usecase.GetMatch;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.analytics.b */
public final class C17899b implements Factory<C16272a> {
    /* renamed from: a */
    private final Provider<C2630h> f55799a;
    /* renamed from: b */
    private final Provider<GetMatch> f55800b;

    public /* synthetic */ Object get() {
        return m65200a();
    }

    public C17899b(Provider<C2630h> provider, Provider<GetMatch> provider2) {
        this.f55799a = provider;
        this.f55800b = provider2;
    }

    /* renamed from: a */
    public C16272a m65200a() {
        return C17899b.m65198a(this.f55799a, this.f55800b);
    }

    /* renamed from: a */
    public static C16272a m65198a(Provider<C2630h> provider, Provider<GetMatch> provider2) {
        return new C16272a((C2630h) provider.get(), (GetMatch) provider2.get());
    }

    /* renamed from: b */
    public static C17899b m65199b(Provider<C2630h> provider, Provider<GetMatch> provider2) {
        return new C17899b(provider, provider2);
    }
}
