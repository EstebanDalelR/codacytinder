package com.tinder.p238f.p243e;

import com.tinder.common.logger.Logger;
import com.tinder.interactors.C9718i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.f.e.f */
public final class C13174f implements Factory<C11603e> {
    /* renamed from: a */
    private final Provider<C9718i> f41851a;
    /* renamed from: b */
    private final Provider<Logger> f41852b;

    public /* synthetic */ Object get() {
        return m51106a();
    }

    public C13174f(Provider<C9718i> provider, Provider<Logger> provider2) {
        this.f41851a = provider;
        this.f41852b = provider2;
    }

    /* renamed from: a */
    public C11603e m51106a() {
        return C13174f.m51104a(this.f41851a, this.f41852b);
    }

    /* renamed from: a */
    public static C11603e m51104a(Provider<C9718i> provider, Provider<Logger> provider2) {
        return new C11603e((C9718i) provider.get(), (Logger) provider2.get());
    }

    /* renamed from: b */
    public static C13174f m51105b(Provider<C9718i> provider, Provider<Logger> provider2) {
        return new C13174f(provider, provider2);
    }
}
