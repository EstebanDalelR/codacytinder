package com.tinder.module;

import com.tinder.analytics.fireworks.FireworksNetworkClient;
import com.tinder.analytics.fireworks.api.C6224b;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;
import okhttp3.C17692o.C15961a;

public final class ak implements Factory<FireworksNetworkClient> {
    /* renamed from: a */
    private final aa f42766a;
    /* renamed from: b */
    private final Provider<C15961a> f42767b;
    /* renamed from: c */
    private final Provider<C6224b> f42768c;

    public /* synthetic */ Object get() {
        return m52090a();
    }

    public ak(aa aaVar, Provider<C15961a> provider, Provider<C6224b> provider2) {
        this.f42766a = aaVar;
        this.f42767b = provider;
        this.f42768c = provider2;
    }

    /* renamed from: a */
    public FireworksNetworkClient m52090a() {
        return m52087a(this.f42766a, this.f42767b, this.f42768c);
    }

    /* renamed from: a */
    public static FireworksNetworkClient m52087a(aa aaVar, Provider<C15961a> provider, Provider<C6224b> provider2) {
        return m52088a(aaVar, (C15961a) provider.get(), (C6224b) provider2.get());
    }

    /* renamed from: b */
    public static ak m52089b(aa aaVar, Provider<C15961a> provider, Provider<C6224b> provider2) {
        return new ak(aaVar, provider, provider2);
    }

    /* renamed from: a */
    public static FireworksNetworkClient m52088a(aa aaVar, C15961a c15961a, C6224b c6224b) {
        return (FireworksNetworkClient) C15521i.a(aaVar.m40764a(c15961a, c6224b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
