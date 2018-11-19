package com.tinder.managers;

import com.tinder.api.ManagerNetwork;
import com.tinder.api.ManagerWebServices;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class bp implements Factory<bm> {
    /* renamed from: a */
    private final Provider<ManagerWebServices> f42511a;
    /* renamed from: b */
    private final Provider<ManagerNetwork> f42512b;

    public /* synthetic */ Object get() {
        return m51820a();
    }

    public bp(Provider<ManagerWebServices> provider, Provider<ManagerNetwork> provider2) {
        this.f42511a = provider;
        this.f42512b = provider2;
    }

    /* renamed from: a */
    public bm m51820a() {
        return m51818a(this.f42511a, this.f42512b);
    }

    /* renamed from: a */
    public static bm m51818a(Provider<ManagerWebServices> provider, Provider<ManagerNetwork> provider2) {
        return new bm((ManagerWebServices) provider.get(), (ManagerNetwork) provider2.get());
    }

    /* renamed from: b */
    public static bp m51819b(Provider<ManagerWebServices> provider, Provider<ManagerNetwork> provider2) {
        return new bp(provider, provider2);
    }
}
