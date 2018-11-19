package com.tinder.analytics.experiment;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.core.experiment.AbTestUtility;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.analytics.experiment.b */
public final class C8004b implements Factory<C6220a> {
    /* renamed from: a */
    private final Provider<AbTestUtility> f28628a;
    /* renamed from: b */
    private final Provider<C2630h> f28629b;

    public /* synthetic */ Object get() {
        return m33904a();
    }

    public C8004b(Provider<AbTestUtility> provider, Provider<C2630h> provider2) {
        this.f28628a = provider;
        this.f28629b = provider2;
    }

    /* renamed from: a */
    public C6220a m33904a() {
        return C8004b.m33902a(this.f28628a, this.f28629b);
    }

    /* renamed from: a */
    public static C6220a m33902a(Provider<AbTestUtility> provider, Provider<C2630h> provider2) {
        return new C6220a((AbTestUtility) provider.get(), (C2630h) provider2.get());
    }

    /* renamed from: b */
    public static C8004b m33903b(Provider<AbTestUtility> provider, Provider<C2630h> provider2) {
        return new C8004b(provider, provider2);
    }
}
