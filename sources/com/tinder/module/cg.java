package com.tinder.module;

import com.tinder.domain.profile.repository.CustomGenderRepository;
import com.tinder.settings.p405c.C16617a;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class cg implements Factory<CustomGenderRepository> {
    /* renamed from: a */
    private final bs f42859a;
    /* renamed from: b */
    private final Provider<C16617a> f42860b;

    public /* synthetic */ Object get() {
        return m52256a();
    }

    public cg(bs bsVar, Provider<C16617a> provider) {
        this.f42859a = bsVar;
        this.f42860b = provider;
    }

    /* renamed from: a */
    public CustomGenderRepository m52256a() {
        return m52254a(this.f42859a, this.f42860b);
    }

    /* renamed from: a */
    public static CustomGenderRepository m52254a(bs bsVar, Provider<C16617a> provider) {
        return m52253a(bsVar, (C16617a) provider.get());
    }

    /* renamed from: b */
    public static cg m52255b(bs bsVar, Provider<C16617a> provider) {
        return new cg(bsVar, provider);
    }

    /* renamed from: a */
    public static CustomGenderRepository m52253a(bs bsVar, C16617a c16617a) {
        return (CustomGenderRepository) C15521i.a(bsVar.m40814a(c16617a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
