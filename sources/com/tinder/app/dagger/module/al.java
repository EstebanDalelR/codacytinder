package com.tinder.app.dagger.module;

import com.tinder.api.TinderUserApi;
import com.tinder.domain.verification.VerificationRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class al implements Factory<VerificationRepository> {
    /* renamed from: a */
    private final ad f40189a;
    /* renamed from: b */
    private final Provider<TinderUserApi> f40190b;

    public /* synthetic */ Object get() {
        return m48999a();
    }

    /* renamed from: a */
    public VerificationRepository m48999a() {
        return m48998a(this.f40189a, this.f40190b);
    }

    /* renamed from: a */
    public static VerificationRepository m48998a(ad adVar, Provider<TinderUserApi> provider) {
        return m48997a(adVar, (TinderUserApi) provider.get());
    }

    /* renamed from: a */
    public static VerificationRepository m48997a(ad adVar, TinderUserApi tinderUserApi) {
        return (VerificationRepository) C15521i.a(adVar.m35150a(tinderUserApi), "Cannot return null from a non-@Nullable @Provides method");
    }
}
