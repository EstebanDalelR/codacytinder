package com.tinder.domain.injection.modules;

import com.tinder.domain.profile.usecase.CheckTutorialViewed;
import com.tinder.domain.profile.usecase.CheckTutorialViewedStatus;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class CommonDomainModule_ProvideCheckedTutorial$domain_releaseFactory implements Factory<CheckTutorialViewedStatus> {
    private final Provider<CheckTutorialViewed> checkTutorialViewedProvider;
    private final CommonDomainModule module;

    public CommonDomainModule_ProvideCheckedTutorial$domain_releaseFactory(CommonDomainModule commonDomainModule, Provider<CheckTutorialViewed> provider) {
        this.module = commonDomainModule;
        this.checkTutorialViewedProvider = provider;
    }

    public CheckTutorialViewedStatus get() {
        return provideInstance(this.module, this.checkTutorialViewedProvider);
    }

    public static CheckTutorialViewedStatus provideInstance(CommonDomainModule commonDomainModule, Provider<CheckTutorialViewed> provider) {
        return proxyProvideCheckedTutorial$domain_release(commonDomainModule, (CheckTutorialViewed) provider.get());
    }

    public static CommonDomainModule_ProvideCheckedTutorial$domain_releaseFactory create(CommonDomainModule commonDomainModule, Provider<CheckTutorialViewed> provider) {
        return new CommonDomainModule_ProvideCheckedTutorial$domain_releaseFactory(commonDomainModule, provider);
    }

    public static CheckTutorialViewedStatus proxyProvideCheckedTutorial$domain_release(CommonDomainModule commonDomainModule, CheckTutorialViewed checkTutorialViewed) {
        return (CheckTutorialViewedStatus) C15521i.a(commonDomainModule.provideCheckedTutorial$domain_release(checkTutorialViewed), "Cannot return null from a non-@Nullable @Provides method");
    }
}
