package com.tinder.chat.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ae implements Factory<ad> {
    /* renamed from: a */
    private final Provider<C2630h> f40940a;
    /* renamed from: b */
    private final Provider<C10522a> f40941b;

    public /* synthetic */ Object get() {
        return m49960a();
    }

    public ae(Provider<C2630h> provider, Provider<C10522a> provider2) {
        this.f40940a = provider;
        this.f40941b = provider2;
    }

    /* renamed from: a */
    public ad m49960a() {
        return m49958a(this.f40940a, this.f40941b);
    }

    /* renamed from: a */
    public static ad m49958a(Provider<C2630h> provider, Provider<C10522a> provider2) {
        return new ad((C2630h) provider.get(), (C10522a) provider2.get());
    }

    /* renamed from: b */
    public static ae m49959b(Provider<C2630h> provider, Provider<C10522a> provider2) {
        return new ae(provider, provider2);
    }
}
