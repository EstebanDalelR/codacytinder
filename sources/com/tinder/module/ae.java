package com.tinder.module;

import com.tinder.analytics.fireworks.C7330k;
import com.tinder.analytics.fireworks.FireworksRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ae implements Factory<C7330k> {
    /* renamed from: a */
    private final aa f42749a;
    /* renamed from: b */
    private final Provider<FireworksRepository> f42750b;

    public /* synthetic */ Object get() {
        return m52067a();
    }

    public ae(aa aaVar, Provider<FireworksRepository> provider) {
        this.f42749a = aaVar;
        this.f42750b = provider;
    }

    /* renamed from: a */
    public C7330k m52067a() {
        return m52065a(this.f42749a, this.f42750b);
    }

    /* renamed from: a */
    public static C7330k m52065a(aa aaVar, Provider<FireworksRepository> provider) {
        return m52064a(aaVar, (FireworksRepository) provider.get());
    }

    /* renamed from: b */
    public static ae m52066b(aa aaVar, Provider<FireworksRepository> provider) {
        return new ae(aaVar, provider);
    }

    /* renamed from: a */
    public static C7330k m52064a(aa aaVar, FireworksRepository fireworksRepository) {
        return (C7330k) C15521i.a(aaVar.m40769a(fireworksRepository), "Cannot return null from a non-@Nullable @Provides method");
    }
}
