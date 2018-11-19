package com.tinder.chat.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.analytics.k */
public final class C12694k implements Factory<C10533j> {
    /* renamed from: a */
    private final Provider<C2630h> f40975a;
    /* renamed from: b */
    private final Provider<C10522a> f40976b;

    public /* synthetic */ Object get() {
        return m49995a();
    }

    public C12694k(Provider<C2630h> provider, Provider<C10522a> provider2) {
        this.f40975a = provider;
        this.f40976b = provider2;
    }

    /* renamed from: a */
    public C10533j m49995a() {
        return C12694k.m49993a(this.f40975a, this.f40976b);
    }

    /* renamed from: a */
    public static C10533j m49993a(Provider<C2630h> provider, Provider<C10522a> provider2) {
        return new C10533j((C2630h) provider.get(), (C10522a) provider2.get());
    }

    /* renamed from: b */
    public static C12694k m49994b(Provider<C2630h> provider, Provider<C10522a> provider2) {
        return new C12694k(provider, provider2);
    }
}
