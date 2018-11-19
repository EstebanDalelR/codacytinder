package com.tinder.domain.injection.modules;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import rx.C2671a;

/* renamed from: com.tinder.domain.injection.modules.RxSchedulersModule_ProvidesRxJava1ComputationScheduler$domain_releaseFactory */
public final class C13156x9c0cf4b0 implements Factory<C2671a> {
    private final RxSchedulersModule module;

    public C13156x9c0cf4b0(RxSchedulersModule rxSchedulersModule) {
        this.module = rxSchedulersModule;
    }

    public C2671a get() {
        return C13156x9c0cf4b0.provideInstance(this.module);
    }

    public static C2671a provideInstance(RxSchedulersModule rxSchedulersModule) {
        return C13156x9c0cf4b0.proxyProvidesRxJava1ComputationScheduler$domain_release(rxSchedulersModule);
    }

    public static C13156x9c0cf4b0 create(RxSchedulersModule rxSchedulersModule) {
        return new C13156x9c0cf4b0(rxSchedulersModule);
    }

    public static C2671a proxyProvidesRxJava1ComputationScheduler$domain_release(RxSchedulersModule rxSchedulersModule) {
        return (C2671a) C15521i.a(rxSchedulersModule.providesRxJava1ComputationScheduler$domain_release(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
