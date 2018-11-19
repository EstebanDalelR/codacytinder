package com.tinder.chat.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ag implements Factory<af> {
    /* renamed from: a */
    private final Provider<C2630h> f40943a;
    /* renamed from: b */
    private final Provider<C10522a> f40944b;

    public /* synthetic */ Object get() {
        return m49964a();
    }

    public ag(Provider<C2630h> provider, Provider<C10522a> provider2) {
        this.f40943a = provider;
        this.f40944b = provider2;
    }

    /* renamed from: a */
    public af m49964a() {
        return m49962a(this.f40943a, this.f40944b);
    }

    /* renamed from: a */
    public static af m49962a(Provider<C2630h> provider, Provider<C10522a> provider2) {
        return new af((C2630h) provider.get(), (C10522a) provider2.get());
    }

    /* renamed from: b */
    public static ag m49963b(Provider<C2630h> provider, Provider<C10522a> provider2) {
        return new ag(provider, provider2);
    }
}
