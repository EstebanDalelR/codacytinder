package com.tinder.superlike.p421e;

import com.tinder.api.TinderApi;
import com.tinder.superlike.p418a.C15066a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.superlike.e.e */
public final class C18193e implements Factory<C15081c> {
    /* renamed from: a */
    private final Provider<TinderApi> f56405a;
    /* renamed from: b */
    private final Provider<C15066a> f56406b;

    public /* synthetic */ Object get() {
        return m65968a();
    }

    public C18193e(Provider<TinderApi> provider, Provider<C15066a> provider2) {
        this.f56405a = provider;
        this.f56406b = provider2;
    }

    /* renamed from: a */
    public C15081c m65968a() {
        return C18193e.m65966a(this.f56405a, this.f56406b);
    }

    /* renamed from: a */
    public static C15081c m65966a(Provider<TinderApi> provider, Provider<C15066a> provider2) {
        return new C15081c((TinderApi) provider.get(), (C15066a) provider2.get());
    }

    /* renamed from: b */
    public static C18193e m65967b(Provider<TinderApi> provider, Provider<C15066a> provider2) {
        return new C18193e(provider, provider2);
    }
}
