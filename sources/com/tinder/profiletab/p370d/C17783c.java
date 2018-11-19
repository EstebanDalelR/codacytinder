package com.tinder.profiletab.p370d;

import android.content.res.Resources;
import com.tinder.domain.utils.AgeCalculator;
import com.tinder.profiletab.p370d.C14470b.C14469b;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.profiletab.d.c */
public final class C17783c implements Factory<C14469b> {
    /* renamed from: a */
    private final Provider<Resources> f55486a;
    /* renamed from: b */
    private final Provider<AgeCalculator> f55487b;

    public /* synthetic */ Object get() {
        return m64987a();
    }

    public C17783c(Provider<Resources> provider, Provider<AgeCalculator> provider2) {
        this.f55486a = provider;
        this.f55487b = provider2;
    }

    /* renamed from: a */
    public C14469b m64987a() {
        return C17783c.m64985a(this.f55486a, this.f55487b);
    }

    /* renamed from: a */
    public static C14469b m64985a(Provider<Resources> provider, Provider<AgeCalculator> provider2) {
        return new C14469b((Resources) provider.get(), (AgeCalculator) provider2.get());
    }

    /* renamed from: b */
    public static C17783c m64986b(Provider<Resources> provider, Provider<AgeCalculator> provider2) {
        return new C17783c(provider, provider2);
    }
}
