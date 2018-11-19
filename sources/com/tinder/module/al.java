package com.tinder.module;

import com.tinder.analytics.fireworks.FireworksRepository;
import com.tinder.analytics.fireworks.data.C6229j;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class al implements Factory<FireworksRepository> {
    /* renamed from: a */
    private final aa f42769a;
    /* renamed from: b */
    private final Provider<C6229j> f42770b;

    public /* synthetic */ Object get() {
        return m52094a();
    }

    public al(aa aaVar, Provider<C6229j> provider) {
        this.f42769a = aaVar;
        this.f42770b = provider;
    }

    /* renamed from: a */
    public FireworksRepository m52094a() {
        return m52092a(this.f42769a, this.f42770b);
    }

    /* renamed from: a */
    public static FireworksRepository m52092a(aa aaVar, Provider<C6229j> provider) {
        return m52091a(aaVar, (C6229j) provider.get());
    }

    /* renamed from: b */
    public static al m52093b(aa aaVar, Provider<C6229j> provider) {
        return new al(aaVar, provider);
    }

    /* renamed from: a */
    public static FireworksRepository m52091a(aa aaVar, C6229j c6229j) {
        return (FireworksRepository) C15521i.a(aaVar.m40765a(c6229j), "Cannot return null from a non-@Nullable @Provides method");
    }
}
