package com.tinder.chat.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class aa implements Factory<C10542z> {
    /* renamed from: a */
    private final Provider<C2630h> f40935a;
    /* renamed from: b */
    private final Provider<C10522a> f40936b;

    public /* synthetic */ Object get() {
        return m49954a();
    }

    public aa(Provider<C2630h> provider, Provider<C10522a> provider2) {
        this.f40935a = provider;
        this.f40936b = provider2;
    }

    /* renamed from: a */
    public C10542z m49954a() {
        return m49952a(this.f40935a, this.f40936b);
    }

    /* renamed from: a */
    public static C10542z m49952a(Provider<C2630h> provider, Provider<C10522a> provider2) {
        return new C10542z((C2630h) provider.get(), (C10522a) provider2.get());
    }

    /* renamed from: b */
    public static aa m49953b(Provider<C2630h> provider, Provider<C10522a> provider2) {
        return new aa(provider, provider2);
    }
}
