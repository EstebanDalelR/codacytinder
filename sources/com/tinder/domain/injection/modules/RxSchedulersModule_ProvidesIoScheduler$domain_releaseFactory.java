package com.tinder.domain.injection.modules;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import io.reactivex.C15679f;

public final class RxSchedulersModule_ProvidesIoScheduler$domain_releaseFactory implements Factory<C15679f> {
    private final RxSchedulersModule module;

    public RxSchedulersModule_ProvidesIoScheduler$domain_releaseFactory(RxSchedulersModule rxSchedulersModule) {
        this.module = rxSchedulersModule;
    }

    public C15679f get() {
        return provideInstance(this.module);
    }

    public static C15679f provideInstance(RxSchedulersModule rxSchedulersModule) {
        return proxyProvidesIoScheduler$domain_release(rxSchedulersModule);
    }

    public static RxSchedulersModule_ProvidesIoScheduler$domain_releaseFactory create(RxSchedulersModule rxSchedulersModule) {
        return new RxSchedulersModule_ProvidesIoScheduler$domain_releaseFactory(rxSchedulersModule);
    }

    public static C15679f proxyProvidesIoScheduler$domain_release(RxSchedulersModule rxSchedulersModule) {
        return (C15679f) C15521i.a(rxSchedulersModule.providesIoScheduler$domain_release(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
