package com.tinder.data.updates;

import com.tinder.domain.updates.UpdateSignalRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.updates.u */
public final class C13128u implements Factory<C8809l> {
    /* renamed from: a */
    private final Provider<C8805i> f41777a;
    /* renamed from: b */
    private final Provider<UpdateSignalRepository> f41778b;

    public /* synthetic */ Object get() {
        return m51036a();
    }

    public C13128u(Provider<C8805i> provider, Provider<UpdateSignalRepository> provider2) {
        this.f41777a = provider;
        this.f41778b = provider2;
    }

    /* renamed from: a */
    public C8809l m51036a() {
        return C13128u.m51034a(this.f41777a, this.f41778b);
    }

    /* renamed from: a */
    public static C8809l m51034a(Provider<C8805i> provider, Provider<UpdateSignalRepository> provider2) {
        return C13128u.m51033a((C8805i) provider.get(), (UpdateSignalRepository) provider2.get());
    }

    /* renamed from: b */
    public static C13128u m51035b(Provider<C8805i> provider, Provider<UpdateSignalRepository> provider2) {
        return new C13128u(provider, provider2);
    }

    /* renamed from: a */
    public static C8809l m51033a(C8805i c8805i, UpdateSignalRepository updateSignalRepository) {
        return (C8809l) C15521i.a(C8811p.m37503a(c8805i, updateSignalRepository), "Cannot return null from a non-@Nullable @Provides method");
    }
}
