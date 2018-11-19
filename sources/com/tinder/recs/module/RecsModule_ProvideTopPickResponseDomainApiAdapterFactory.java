package com.tinder.recs.module;

import com.tinder.data.toppicks.C11027p;
import com.tinder.data.toppicks.C11028q;
import com.tinder.data.toppicks.C8795i;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsModule_ProvideTopPickResponseDomainApiAdapterFactory implements Factory<C8795i> {
    private final RecsModule module;
    private final Provider<C11027p> topPicksRecDomainApiAdapterProvider;
    private final Provider<C11028q> topPicksTeaserRecDomainApiAdapterProvider;

    public RecsModule_ProvideTopPickResponseDomainApiAdapterFactory(RecsModule recsModule, Provider<C11027p> provider, Provider<C11028q> provider2) {
        this.module = recsModule;
        this.topPicksRecDomainApiAdapterProvider = provider;
        this.topPicksTeaserRecDomainApiAdapterProvider = provider2;
    }

    public C8795i get() {
        return provideInstance(this.module, this.topPicksRecDomainApiAdapterProvider, this.topPicksTeaserRecDomainApiAdapterProvider);
    }

    public static C8795i provideInstance(RecsModule recsModule, Provider<C11027p> provider, Provider<C11028q> provider2) {
        return proxyProvideTopPickResponseDomainApiAdapter(recsModule, (C11027p) provider.get(), (C11028q) provider2.get());
    }

    public static RecsModule_ProvideTopPickResponseDomainApiAdapterFactory create(RecsModule recsModule, Provider<C11027p> provider, Provider<C11028q> provider2) {
        return new RecsModule_ProvideTopPickResponseDomainApiAdapterFactory(recsModule, provider, provider2);
    }

    public static C8795i proxyProvideTopPickResponseDomainApiAdapter(RecsModule recsModule, C11027p c11027p, C11028q c11028q) {
        return (C8795i) C15521i.m58001a(recsModule.provideTopPickResponseDomainApiAdapter(c11027p, c11028q), "Cannot return null from a non-@Nullable @Provides method");
    }
}
