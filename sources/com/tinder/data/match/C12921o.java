package com.tinder.data.match;

import com.tinder.api.TinderApi;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.match.o */
public final class C12921o implements Factory<C8674m> {
    /* renamed from: a */
    private final Provider<TinderApi> f41433a;
    /* renamed from: b */
    private final Provider<C10799v> f41434b;

    public /* synthetic */ Object get() {
        return m50602a();
    }

    public C12921o(Provider<TinderApi> provider, Provider<C10799v> provider2) {
        this.f41433a = provider;
        this.f41434b = provider2;
    }

    /* renamed from: a */
    public C8674m m50602a() {
        return C12921o.m50600a(this.f41433a, this.f41434b);
    }

    /* renamed from: a */
    public static C8674m m50600a(Provider<TinderApi> provider, Provider<C10799v> provider2) {
        return new C8674m((TinderApi) provider.get(), (C10799v) provider2.get());
    }

    /* renamed from: b */
    public static C12921o m50601b(Provider<TinderApi> provider, Provider<C10799v> provider2) {
        return new C12921o(provider, provider2);
    }
}
