package com.tinder.recsads.rule;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.recsads.rule.b */
public final class C18031b implements Factory<C18030a> {
    /* renamed from: a */
    private final Provider<AdRecsInjector> f55998a;

    public /* synthetic */ Object get() {
        return m65457a();
    }

    public C18031b(Provider<AdRecsInjector> provider) {
        this.f55998a = provider;
    }

    /* renamed from: a */
    public C18030a m65457a() {
        return C18031b.m65455a(this.f55998a);
    }

    /* renamed from: a */
    public static C18030a m65455a(Provider<AdRecsInjector> provider) {
        return new C18030a((AdRecsInjector) provider.get());
    }

    /* renamed from: b */
    public static C18031b m65456b(Provider<AdRecsInjector> provider) {
        return new C18031b(provider);
    }
}
