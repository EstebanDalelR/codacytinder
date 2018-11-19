package com.tinder.common;

import com.tinder.model.adapter.domain.CurrentUserLegacyUserAdapter;
import com.tinder.p238f.p336c.C11600a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.common.o */
public final class C12786o implements Factory<C12781h> {
    /* renamed from: a */
    private final Provider<CurrentUserLegacyUserAdapter> f41180a;
    /* renamed from: b */
    private final Provider<C11600a> f41181b;

    public /* synthetic */ Object get() {
        return m50269a();
    }

    public C12786o(Provider<CurrentUserLegacyUserAdapter> provider, Provider<C11600a> provider2) {
        this.f41180a = provider;
        this.f41181b = provider2;
    }

    /* renamed from: a */
    public C12781h m50269a() {
        return C12786o.m50267a(this.f41180a, this.f41181b);
    }

    /* renamed from: a */
    public static C12781h m50267a(Provider<CurrentUserLegacyUserAdapter> provider, Provider<C11600a> provider2) {
        return new C12781h((CurrentUserLegacyUserAdapter) provider.get(), (C11600a) provider2.get());
    }

    /* renamed from: b */
    public static C12786o m50268b(Provider<CurrentUserLegacyUserAdapter> provider, Provider<C11600a> provider2) {
        return new C12786o(provider, provider2);
    }
}
