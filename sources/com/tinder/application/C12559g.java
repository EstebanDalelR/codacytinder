package com.tinder.application;

import com.tinder.core.experiment.C8593g;
import com.tinder.core.experiment.CanIGetYoEmailExperimentProvider.Variant;
import com.tinder.domain.auth.UniqueIdFactory;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.application.g */
public final class C12559g implements Factory<C8593g<Variant>> {
    /* renamed from: a */
    private final Provider<UniqueIdFactory> f40588a;

    public /* synthetic */ Object get() {
        return m49642a();
    }

    public C12559g(Provider<UniqueIdFactory> provider) {
        this.f40588a = provider;
    }

    /* renamed from: a */
    public C8593g<Variant> m49642a() {
        return C12559g.m49640a(this.f40588a);
    }

    /* renamed from: a */
    public static C8593g<Variant> m49640a(Provider<UniqueIdFactory> provider) {
        return C12559g.m49639a((UniqueIdFactory) provider.get());
    }

    /* renamed from: b */
    public static C12559g m49641b(Provider<UniqueIdFactory> provider) {
        return new C12559g(provider);
    }

    /* renamed from: a */
    public static C8593g<Variant> m49639a(UniqueIdFactory uniqueIdFactory) {
        return (C8593g) C15521i.a(C8256b.m35243a(uniqueIdFactory), "Cannot return null from a non-@Nullable @Provides method");
    }
}
