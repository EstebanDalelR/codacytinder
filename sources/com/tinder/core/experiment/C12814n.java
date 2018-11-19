package com.tinder.core.experiment;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.core.experiment.n */
public final class C12814n implements Factory<C8597m> {
    /* renamed from: a */
    private final Provider<AbTestUtility> f41220a;

    public /* synthetic */ Object get() {
        return m50333a();
    }

    public C12814n(Provider<AbTestUtility> provider) {
        this.f41220a = provider;
    }

    /* renamed from: a */
    public C8597m m50333a() {
        return C12814n.m50331a(this.f41220a);
    }

    /* renamed from: a */
    public static C8597m m50331a(Provider<AbTestUtility> provider) {
        return new C8597m((AbTestUtility) provider.get());
    }

    /* renamed from: b */
    public static C12814n m50332b(Provider<AbTestUtility> provider) {
        return new C12814n(provider);
    }
}
