package com.tinder.recsads.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.recsads.analytics.AdEventFields.C14729c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.recsads.analytics.m */
public final class C18011m implements Factory<C16435l> {
    /* renamed from: a */
    private final Provider<C2630h> f55948a;
    /* renamed from: b */
    private final Provider<C14729c> f55949b;

    public /* synthetic */ Object get() {
        return m65392a();
    }

    public C18011m(Provider<C2630h> provider, Provider<C14729c> provider2) {
        this.f55948a = provider;
        this.f55949b = provider2;
    }

    /* renamed from: a */
    public C16435l m65392a() {
        return C18011m.m65390a(this.f55948a, this.f55949b);
    }

    /* renamed from: a */
    public static C16435l m65390a(Provider<C2630h> provider, Provider<C14729c> provider2) {
        return new C16435l((C2630h) provider.get(), (C14729c) provider2.get());
    }

    /* renamed from: b */
    public static C18011m m65391b(Provider<C2630h> provider, Provider<C14729c> provider2) {
        return new C18011m(provider, provider2);
    }
}
