package com.tinder.data.profile;

import com.tinder.api.TinderUserApi;
import com.tinder.data.profile.adapter.C10915e;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.profile.b */
public final class C13075b implements Factory<C8753a> {
    /* renamed from: a */
    private final Provider<TinderUserApi> f41648a;
    /* renamed from: b */
    private final Provider<C10915e> f41649b;

    public /* synthetic */ Object get() {
        return m50889a();
    }

    public C13075b(Provider<TinderUserApi> provider, Provider<C10915e> provider2) {
        this.f41648a = provider;
        this.f41649b = provider2;
    }

    /* renamed from: a */
    public C8753a m50889a() {
        return C13075b.m50887a(this.f41648a, this.f41649b);
    }

    /* renamed from: a */
    public static C8753a m50887a(Provider<TinderUserApi> provider, Provider<C10915e> provider2) {
        return new C8753a((TinderUserApi) provider.get(), (C10915e) provider2.get());
    }

    /* renamed from: b */
    public static C13075b m50888b(Provider<TinderUserApi> provider, Provider<C10915e> provider2) {
        return new C13075b(provider, provider2);
    }
}
