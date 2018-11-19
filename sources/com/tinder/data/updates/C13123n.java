package com.tinder.data.updates;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.updates.n */
public final class C13123n implements Factory<C8805i> {
    /* renamed from: a */
    private final Provider<C8813v> f41768a;
    /* renamed from: b */
    private final Provider<C11085z> f41769b;

    public /* synthetic */ Object get() {
        return m51016a();
    }

    public C13123n(Provider<C8813v> provider, Provider<C11085z> provider2) {
        this.f41768a = provider;
        this.f41769b = provider2;
    }

    /* renamed from: a */
    public C8805i m51016a() {
        return C13123n.m51014a(this.f41768a, this.f41769b);
    }

    /* renamed from: a */
    public static C8805i m51014a(Provider<C8813v> provider, Provider<C11085z> provider2) {
        return new C8805i((C8813v) provider.get(), (C11085z) provider2.get());
    }

    /* renamed from: b */
    public static C13123n m51015b(Provider<C8813v> provider, Provider<C11085z> provider2) {
        return new C13123n(provider, provider2);
    }
}
