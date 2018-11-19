package com.tinder.recs.module;

import com.tinder.data.adapter.C10746z;
import com.tinder.data.toppicks.C11007e;
import com.tinder.data.toppicks.C11028q;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsModule_ProvideTopPicksTeaserRecDomainApiAdapterFactory implements Factory<C11028q> {
    private final RecsModule module;
    private final Provider<C10746z> photosAdapterProvider;
    private final Provider<C11007e> tagDomainApiAdapterProvider;

    public RecsModule_ProvideTopPicksTeaserRecDomainApiAdapterFactory(RecsModule recsModule, Provider<C10746z> provider, Provider<C11007e> provider2) {
        this.module = recsModule;
        this.photosAdapterProvider = provider;
        this.tagDomainApiAdapterProvider = provider2;
    }

    public C11028q get() {
        return provideInstance(this.module, this.photosAdapterProvider, this.tagDomainApiAdapterProvider);
    }

    public static C11028q provideInstance(RecsModule recsModule, Provider<C10746z> provider, Provider<C11007e> provider2) {
        return proxyProvideTopPicksTeaserRecDomainApiAdapter(recsModule, (C10746z) provider.get(), (C11007e) provider2.get());
    }

    public static RecsModule_ProvideTopPicksTeaserRecDomainApiAdapterFactory create(RecsModule recsModule, Provider<C10746z> provider, Provider<C11007e> provider2) {
        return new RecsModule_ProvideTopPicksTeaserRecDomainApiAdapterFactory(recsModule, provider, provider2);
    }

    public static C11028q proxyProvideTopPicksTeaserRecDomainApiAdapter(RecsModule recsModule, C10746z c10746z, C11007e c11007e) {
        return (C11028q) C15521i.m58001a(recsModule.provideTopPicksTeaserRecDomainApiAdapter(c10746z, c11007e), "Cannot return null from a non-@Nullable @Provides method");
    }
}
