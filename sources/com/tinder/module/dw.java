package com.tinder.module;

import com.tinder.common.repository.C10698c;
import com.tinder.domain.meta.providers.AuthStatusProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class dw implements Factory<AuthStatusProvider> {
    /* renamed from: a */
    private final bs f42950a;
    /* renamed from: b */
    private final Provider<C10698c> f42951b;

    public /* synthetic */ Object get() {
        return m52421a();
    }

    public dw(bs bsVar, Provider<C10698c> provider) {
        this.f42950a = bsVar;
        this.f42951b = provider;
    }

    /* renamed from: a */
    public AuthStatusProvider m52421a() {
        return m52419a(this.f42950a, this.f42951b);
    }

    /* renamed from: a */
    public static AuthStatusProvider m52419a(bs bsVar, Provider<C10698c> provider) {
        return m52418a(bsVar, (C10698c) provider.get());
    }

    /* renamed from: b */
    public static dw m52420b(bs bsVar, Provider<C10698c> provider) {
        return new dw(bsVar, provider);
    }

    /* renamed from: a */
    public static AuthStatusProvider m52418a(bs bsVar, C10698c c10698c) {
        return (AuthStatusProvider) C15521i.a(bsVar.m40809a(c10698c), "Cannot return null from a non-@Nullable @Provides method");
    }
}
