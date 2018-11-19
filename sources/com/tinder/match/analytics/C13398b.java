package com.tinder.match.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.match.analytics.b */
public final class C13398b implements Factory<C12035a> {
    /* renamed from: a */
    private final Provider<C2630h> f42531a;
    /* renamed from: b */
    private final Provider<C9845l> f42532b;

    public /* synthetic */ Object get() {
        return m51834a();
    }

    public C13398b(Provider<C2630h> provider, Provider<C9845l> provider2) {
        this.f42531a = provider;
        this.f42532b = provider2;
    }

    /* renamed from: a */
    public C12035a m51834a() {
        return C13398b.m51832a(this.f42531a, this.f42532b);
    }

    /* renamed from: a */
    public static C12035a m51832a(Provider<C2630h> provider, Provider<C9845l> provider2) {
        return new C12035a((C2630h) provider.get(), (C9845l) provider2.get());
    }

    /* renamed from: b */
    public static C13398b m51833b(Provider<C2630h> provider, Provider<C9845l> provider2) {
        return new C13398b(provider, provider2);
    }
}
