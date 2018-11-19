package com.tinder.core.experiment;

import com.tinder.domain.auth.UniqueIdFactory;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.core.experiment.i */
public final class C12813i<VARIANT> implements Factory<C8593g<VARIANT>> {
    /* renamed from: a */
    private final Provider<UniqueIdFactory> f41219a;

    public /* synthetic */ Object get() {
        return m50330a();
    }

    public C12813i(Provider<UniqueIdFactory> provider) {
        this.f41219a = provider;
    }

    /* renamed from: a */
    public C8593g<VARIANT> m50330a() {
        return C12813i.m50328a(this.f41219a);
    }

    /* renamed from: a */
    public static <VARIANT> C8593g<VARIANT> m50328a(Provider<UniqueIdFactory> provider) {
        return new C8593g((UniqueIdFactory) provider.get());
    }

    /* renamed from: b */
    public static <VARIANT> C12813i<VARIANT> m50329b(Provider<UniqueIdFactory> provider) {
        return new C12813i(provider);
    }
}
