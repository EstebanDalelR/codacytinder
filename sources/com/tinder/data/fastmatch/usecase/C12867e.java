package com.tinder.data.fastmatch.usecase;

import com.tinder.api.TinderApi;
import com.tinder.domain.fastmatch.provider.FastMatchStatusProvider;
import com.tinder.domain.meta.providers.AuthStatusProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.fastmatch.usecase.e */
public final class C12867e implements Factory<C10771d> {
    /* renamed from: a */
    private final Provider<TinderApi> f41315a;
    /* renamed from: b */
    private final Provider<FastMatchStatusProvider> f41316b;
    /* renamed from: c */
    private final Provider<AuthStatusProvider> f41317c;

    public /* synthetic */ Object get() {
        return m50509a();
    }

    public C12867e(Provider<TinderApi> provider, Provider<FastMatchStatusProvider> provider2, Provider<AuthStatusProvider> provider3) {
        this.f41315a = provider;
        this.f41316b = provider2;
        this.f41317c = provider3;
    }

    /* renamed from: a */
    public C10771d m50509a() {
        return C12867e.m50507a(this.f41315a, this.f41316b, this.f41317c);
    }

    /* renamed from: a */
    public static C10771d m50507a(Provider<TinderApi> provider, Provider<FastMatchStatusProvider> provider2, Provider<AuthStatusProvider> provider3) {
        return new C10771d((TinderApi) provider.get(), (FastMatchStatusProvider) provider2.get(), (AuthStatusProvider) provider3.get());
    }

    /* renamed from: b */
    public static C12867e m50508b(Provider<TinderApi> provider, Provider<FastMatchStatusProvider> provider2, Provider<AuthStatusProvider> provider3) {
        return new C12867e(provider, provider2, provider3);
    }
}
