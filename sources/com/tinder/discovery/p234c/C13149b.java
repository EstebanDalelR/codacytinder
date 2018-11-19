package com.tinder.discovery.p234c;

import com.tinder.base.p172b.C8301a;
import com.tinder.discovery.view.DiscoveryTabView;
import com.tinder.main.router.MainPageRouter;
import dagger.internal.C17281c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.discovery.c.b */
public final class C13149b implements Factory<C8890a> {
    /* renamed from: a */
    private final Provider<DiscoveryTabView> f41822a;
    /* renamed from: b */
    private final Provider<C8301a> f41823b;
    /* renamed from: c */
    private final Provider<MainPageRouter> f41824c;

    public /* synthetic */ Object get() {
        return m51087a();
    }

    public C13149b(Provider<DiscoveryTabView> provider, Provider<C8301a> provider2, Provider<MainPageRouter> provider3) {
        this.f41822a = provider;
        this.f41823b = provider2;
        this.f41824c = provider3;
    }

    /* renamed from: a */
    public C8890a m51087a() {
        return C13149b.m51085a(this.f41822a, this.f41823b, this.f41824c);
    }

    /* renamed from: a */
    public static C8890a m51085a(Provider<DiscoveryTabView> provider, Provider<C8301a> provider2, Provider<MainPageRouter> provider3) {
        return new C8890a(C17281c.b(provider), (C8301a) provider2.get(), (MainPageRouter) provider3.get());
    }

    /* renamed from: b */
    public static C13149b m51086b(Provider<DiscoveryTabView> provider, Provider<C8301a> provider2, Provider<MainPageRouter> provider3) {
        return new C13149b(provider, provider2, provider3);
    }
}
