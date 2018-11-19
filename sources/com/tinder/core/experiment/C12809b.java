package com.tinder.core.experiment;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.core.experiment.b */
public final class C12809b implements Factory<C10709a> {
    /* renamed from: a */
    private final Provider<AbTestUtility> f41211a;

    public /* synthetic */ Object get() {
        return m50318a();
    }

    public C12809b(Provider<AbTestUtility> provider) {
        this.f41211a = provider;
    }

    /* renamed from: a */
    public C10709a m50318a() {
        return C12809b.m50316a(this.f41211a);
    }

    /* renamed from: a */
    public static C10709a m50316a(Provider<AbTestUtility> provider) {
        return new C10709a((AbTestUtility) provider.get());
    }

    /* renamed from: b */
    public static C12809b m50317b(Provider<AbTestUtility> provider) {
        return new C12809b(provider);
    }
}
