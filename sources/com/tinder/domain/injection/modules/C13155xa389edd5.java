package com.tinder.domain.injection.modules;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import io.reactivex.C15679f;

/* renamed from: com.tinder.domain.injection.modules.RxSchedulersModule_ProvidesComputationScheduler$domain_releaseFactory */
public final class C13155xa389edd5 implements Factory<C15679f> {
    private final RxSchedulersModule module;

    public C13155xa389edd5(RxSchedulersModule rxSchedulersModule) {
        this.module = rxSchedulersModule;
    }

    public C15679f get() {
        return C13155xa389edd5.provideInstance(this.module);
    }

    public static C15679f provideInstance(RxSchedulersModule rxSchedulersModule) {
        return C13155xa389edd5.proxyProvidesComputationScheduler$domain_release(rxSchedulersModule);
    }

    public static C13155xa389edd5 create(RxSchedulersModule rxSchedulersModule) {
        return new C13155xa389edd5(rxSchedulersModule);
    }

    public static C15679f proxyProvidesComputationScheduler$domain_release(RxSchedulersModule rxSchedulersModule) {
        return (C15679f) C15521i.a(rxSchedulersModule.providesComputationScheduler$domain_release(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
