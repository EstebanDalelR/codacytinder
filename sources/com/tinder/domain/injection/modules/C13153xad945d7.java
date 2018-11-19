package com.tinder.domain.injection.modules;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import kotlin.jvm.functions.Function0;

/* renamed from: com.tinder.domain.injection.modules.CommonDomainModule_ProvideCurrentDateTimeMillis$domain_releaseFactory */
public final class C13153xad945d7 implements Factory<Function0<Long>> {
    private final CommonDomainModule module;

    public C13153xad945d7(CommonDomainModule commonDomainModule) {
        this.module = commonDomainModule;
    }

    public Function0<Long> get() {
        return C13153xad945d7.provideInstance(this.module);
    }

    public static Function0<Long> provideInstance(CommonDomainModule commonDomainModule) {
        return C13153xad945d7.proxyProvideCurrentDateTimeMillis$domain_release(commonDomainModule);
    }

    public static C13153xad945d7 create(CommonDomainModule commonDomainModule) {
        return new C13153xad945d7(commonDomainModule);
    }

    public static Function0<Long> proxyProvideCurrentDateTimeMillis$domain_release(CommonDomainModule commonDomainModule) {
        return (Function0) C15521i.a(commonDomainModule.provideCurrentDateTimeMillis$domain_release(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
