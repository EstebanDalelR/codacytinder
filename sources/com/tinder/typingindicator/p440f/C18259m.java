package com.tinder.typingindicator.p440f;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.typingindicator.f.m */
public final class C18259m implements Factory<C18258l> {
    /* renamed from: a */
    private final Provider<C18254g> f56574a;

    public /* synthetic */ Object get() {
        return m66155a();
    }

    public C18259m(Provider<C18254g> provider) {
        this.f56574a = provider;
    }

    /* renamed from: a */
    public C18258l m66155a() {
        return C18259m.m66153a(this.f56574a);
    }

    /* renamed from: a */
    public static C18258l m66153a(Provider<C18254g> provider) {
        return new C18258l((C18254g) provider.get());
    }

    /* renamed from: b */
    public static C18259m m66154b(Provider<C18254g> provider) {
        return new C18259m(provider);
    }
}
