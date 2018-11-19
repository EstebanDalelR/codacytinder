package com.tinder.domain.injection.modules;

import com.tinder.domain.loops.usecase.GetAutoPlayLoopsEnabled;
import com.tinder.domain.loops.usecase.GetAutoPlayLoopsEnabledStatus;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.domain.injection.modules.CommonDomainModule_ProvideGetAutoPlayLoopsEnabledStatus$domain_releaseFactory */
public final class C13154xe42f5e5a implements Factory<GetAutoPlayLoopsEnabledStatus> {
    private final Provider<GetAutoPlayLoopsEnabled> getAutoPlayLoopsEnabledProvider;
    private final CommonDomainModule module;

    public C13154xe42f5e5a(CommonDomainModule commonDomainModule, Provider<GetAutoPlayLoopsEnabled> provider) {
        this.module = commonDomainModule;
        this.getAutoPlayLoopsEnabledProvider = provider;
    }

    public GetAutoPlayLoopsEnabledStatus get() {
        return C13154xe42f5e5a.provideInstance(this.module, this.getAutoPlayLoopsEnabledProvider);
    }

    public static GetAutoPlayLoopsEnabledStatus provideInstance(CommonDomainModule commonDomainModule, Provider<GetAutoPlayLoopsEnabled> provider) {
        return C13154xe42f5e5a.proxyProvideGetAutoPlayLoopsEnabledStatus$domain_release(commonDomainModule, (GetAutoPlayLoopsEnabled) provider.get());
    }

    public static C13154xe42f5e5a create(CommonDomainModule commonDomainModule, Provider<GetAutoPlayLoopsEnabled> provider) {
        return new C13154xe42f5e5a(commonDomainModule, provider);
    }

    public static GetAutoPlayLoopsEnabledStatus proxyProvideGetAutoPlayLoopsEnabledStatus$domain_release(CommonDomainModule commonDomainModule, GetAutoPlayLoopsEnabled getAutoPlayLoopsEnabled) {
        return (GetAutoPlayLoopsEnabledStatus) C15521i.a(commonDomainModule.provideGetAutoPlayLoopsEnabledStatus$domain_release(getAutoPlayLoopsEnabled), "Cannot return null from a non-@Nullable @Provides method");
    }
}
