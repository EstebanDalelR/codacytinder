package com.tinder.chat.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.analytics.n */
public final class C12697n implements Factory<C10535m> {
    /* renamed from: a */
    private final Provider<C2630h> f40979a;
    /* renamed from: b */
    private final Provider<C10522a> f40980b;

    public /* synthetic */ Object get() {
        return m50000a();
    }

    public C12697n(Provider<C2630h> provider, Provider<C10522a> provider2) {
        this.f40979a = provider;
        this.f40980b = provider2;
    }

    /* renamed from: a */
    public C10535m m50000a() {
        return C12697n.m49998a(this.f40979a, this.f40980b);
    }

    /* renamed from: a */
    public static C10535m m49998a(Provider<C2630h> provider, Provider<C10522a> provider2) {
        return new C10535m((C2630h) provider.get(), (C10522a) provider2.get());
    }

    /* renamed from: b */
    public static C12697n m49999b(Provider<C2630h> provider, Provider<C10522a> provider2) {
        return new C12697n(provider, provider2);
    }
}
