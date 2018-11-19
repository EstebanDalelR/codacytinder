package com.tinder.purchase.usecase;

import com.tinder.api.TinderApi;
import com.tinder.purchase.billing.Biller;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.purchase.usecase.b */
public final class C17864b implements Factory<C16242a> {
    /* renamed from: a */
    private final Provider<TinderApi> f55735a;
    /* renamed from: b */
    private final Provider<Biller> f55736b;

    public /* synthetic */ Object get() {
        return m65140a();
    }

    public C17864b(Provider<TinderApi> provider, Provider<Biller> provider2) {
        this.f55735a = provider;
        this.f55736b = provider2;
    }

    /* renamed from: a */
    public C16242a m65140a() {
        return C17864b.m65138a(this.f55735a, this.f55736b);
    }

    /* renamed from: a */
    public static C16242a m65138a(Provider<TinderApi> provider, Provider<Biller> provider2) {
        return new C16242a((TinderApi) provider.get(), (Biller) provider2.get());
    }

    /* renamed from: b */
    public static C17864b m65139b(Provider<TinderApi> provider, Provider<Biller> provider2) {
        return new C17864b(provider, provider2);
    }
}
