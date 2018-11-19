package com.tinder.data.boost;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.boost.e */
public final class C12845e implements Factory<C10752d> {
    /* renamed from: a */
    private final Provider<BoostStatusProvider> f41281a;

    public /* synthetic */ Object get() {
        return m50448a();
    }

    public C12845e(Provider<BoostStatusProvider> provider) {
        this.f41281a = provider;
    }

    /* renamed from: a */
    public C10752d m50448a() {
        return C12845e.m50446a(this.f41281a);
    }

    /* renamed from: a */
    public static C10752d m50446a(Provider<BoostStatusProvider> provider) {
        return new C10752d((BoostStatusProvider) provider.get());
    }

    /* renamed from: b */
    public static C12845e m50447b(Provider<BoostStatusProvider> provider) {
        return new C12845e(provider);
    }
}
