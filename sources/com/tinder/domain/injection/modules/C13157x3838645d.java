package com.tinder.domain.injection.modules;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import rx.C2671a;

/* renamed from: com.tinder.domain.injection.modules.RxSchedulersModule_ProvidesRxJava1FeedTrackerScheduler$domain_releaseFactory */
public final class C13157x3838645d implements Factory<C2671a> {
    private final RxSchedulersModule module;

    public C13157x3838645d(RxSchedulersModule rxSchedulersModule) {
        this.module = rxSchedulersModule;
    }

    public C2671a get() {
        return C13157x3838645d.provideInstance(this.module);
    }

    public static C2671a provideInstance(RxSchedulersModule rxSchedulersModule) {
        return C13157x3838645d.proxyProvidesRxJava1FeedTrackerScheduler$domain_release(rxSchedulersModule);
    }

    public static C13157x3838645d create(RxSchedulersModule rxSchedulersModule) {
        return new C13157x3838645d(rxSchedulersModule);
    }

    public static C2671a proxyProvidesRxJava1FeedTrackerScheduler$domain_release(RxSchedulersModule rxSchedulersModule) {
        return (C2671a) C15521i.a(rxSchedulersModule.providesRxJava1FeedTrackerScheduler$domain_release(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
