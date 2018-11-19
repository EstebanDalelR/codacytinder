package com.tinder.reactions.p385c;

import com.tinder.domain.reactions.provider.StrikeReactionTypesProvider;
import com.tinder.domain.reactions.repository.StrikeReactionRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.c.i */
public final class C17939i implements Factory<C16288h> {
    /* renamed from: a */
    private final Provider<StrikeReactionRepository> f55848a;
    /* renamed from: b */
    private final Provider<StrikeReactionTypesProvider> f55849b;

    public /* synthetic */ Object get() {
        return m65254a();
    }

    public C17939i(Provider<StrikeReactionRepository> provider, Provider<StrikeReactionTypesProvider> provider2) {
        this.f55848a = provider;
        this.f55849b = provider2;
    }

    /* renamed from: a */
    public C16288h m65254a() {
        return C17939i.m65252a(this.f55848a, this.f55849b);
    }

    /* renamed from: a */
    public static C16288h m65252a(Provider<StrikeReactionRepository> provider, Provider<StrikeReactionTypesProvider> provider2) {
        return new C16288h((StrikeReactionRepository) provider.get(), (StrikeReactionTypesProvider) provider2.get());
    }

    /* renamed from: b */
    public static C17939i m65253b(Provider<StrikeReactionRepository> provider, Provider<StrikeReactionTypesProvider> provider2) {
        return new C17939i(provider, provider2);
    }
}
