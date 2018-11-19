package com.tinder.domain.injection.modules;

import com.tinder.domain.profile.usecase.ConfirmTutorialsViewed;
import com.tinder.domain.profile.usecase.ConfirmTutorialsViewedStatus;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class CommonDomainModule_ProvideConfirmTutorial$domain_releaseFactory implements Factory<ConfirmTutorialsViewedStatus> {
    private final Provider<ConfirmTutorialsViewed> confirmTutorialsViewedProvider;
    private final CommonDomainModule module;

    public CommonDomainModule_ProvideConfirmTutorial$domain_releaseFactory(CommonDomainModule commonDomainModule, Provider<ConfirmTutorialsViewed> provider) {
        this.module = commonDomainModule;
        this.confirmTutorialsViewedProvider = provider;
    }

    public ConfirmTutorialsViewedStatus get() {
        return provideInstance(this.module, this.confirmTutorialsViewedProvider);
    }

    public static ConfirmTutorialsViewedStatus provideInstance(CommonDomainModule commonDomainModule, Provider<ConfirmTutorialsViewed> provider) {
        return proxyProvideConfirmTutorial$domain_release(commonDomainModule, (ConfirmTutorialsViewed) provider.get());
    }

    public static CommonDomainModule_ProvideConfirmTutorial$domain_releaseFactory create(CommonDomainModule commonDomainModule, Provider<ConfirmTutorialsViewed> provider) {
        return new CommonDomainModule_ProvideConfirmTutorial$domain_releaseFactory(commonDomainModule, provider);
    }

    public static ConfirmTutorialsViewedStatus proxyProvideConfirmTutorial$domain_release(CommonDomainModule commonDomainModule, ConfirmTutorialsViewed confirmTutorialsViewed) {
        return (ConfirmTutorialsViewedStatus) C15521i.a(commonDomainModule.provideConfirmTutorial$domain_release(confirmTutorialsViewed), "Cannot return null from a non-@Nullable @Provides method");
    }
}
