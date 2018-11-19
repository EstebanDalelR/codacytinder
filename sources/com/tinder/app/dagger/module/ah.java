package com.tinder.app.dagger.module;

import com.tinder.domain.verification.VerificationRepository;
import com.tinder.verification.usecase.C15391b;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ah implements Factory<C15391b> {
    /* renamed from: a */
    private final ad f40177a;
    /* renamed from: b */
    private final Provider<VerificationRepository> f40178b;

    public /* synthetic */ Object get() {
        return m48985a();
    }

    /* renamed from: a */
    public C15391b m48985a() {
        return m48984a(this.f40177a, this.f40178b);
    }

    /* renamed from: a */
    public static C15391b m48984a(ad adVar, Provider<VerificationRepository> provider) {
        return m48983a(adVar, (VerificationRepository) provider.get());
    }

    /* renamed from: a */
    public static C15391b m48983a(ad adVar, VerificationRepository verificationRepository) {
        return (C15391b) C15521i.a(adVar.m35155a(verificationRepository), "Cannot return null from a non-@Nullable @Provides method");
    }
}
