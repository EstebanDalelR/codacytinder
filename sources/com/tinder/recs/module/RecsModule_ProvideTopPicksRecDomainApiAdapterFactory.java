package com.tinder.recs.module;

import com.tinder.data.adapter.ah;
import com.tinder.data.toppicks.C11007e;
import com.tinder.data.toppicks.C11027p;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsModule_ProvideTopPicksRecDomainApiAdapterFactory implements Factory<C11027p> {
    private final RecsModule module;
    private final Provider<ah> recDomainApiAdapterProvider;
    private final Provider<C11007e> tagDomainApiAdapterProvider;

    public RecsModule_ProvideTopPicksRecDomainApiAdapterFactory(RecsModule recsModule, Provider<ah> provider, Provider<C11007e> provider2) {
        this.module = recsModule;
        this.recDomainApiAdapterProvider = provider;
        this.tagDomainApiAdapterProvider = provider2;
    }

    public C11027p get() {
        return provideInstance(this.module, this.recDomainApiAdapterProvider, this.tagDomainApiAdapterProvider);
    }

    public static C11027p provideInstance(RecsModule recsModule, Provider<ah> provider, Provider<C11007e> provider2) {
        return proxyProvideTopPicksRecDomainApiAdapter(recsModule, (ah) provider.get(), (C11007e) provider2.get());
    }

    public static RecsModule_ProvideTopPicksRecDomainApiAdapterFactory create(RecsModule recsModule, Provider<ah> provider, Provider<C11007e> provider2) {
        return new RecsModule_ProvideTopPicksRecDomainApiAdapterFactory(recsModule, provider, provider2);
    }

    public static C11027p proxyProvideTopPicksRecDomainApiAdapter(RecsModule recsModule, ah ahVar, C11007e c11007e) {
        return (C11027p) C15521i.m58001a(recsModule.provideTopPicksRecDomainApiAdapter(ahVar, c11007e), "Cannot return null from a non-@Nullable @Provides method");
    }
}
