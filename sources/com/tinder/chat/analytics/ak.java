package com.tinder.chat.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ak implements Factory<aj> {
    /* renamed from: a */
    private final Provider<C2630h> f40949a;
    /* renamed from: b */
    private final Provider<C10522a> f40950b;

    public /* synthetic */ Object get() {
        return m49972a();
    }

    public ak(Provider<C2630h> provider, Provider<C10522a> provider2) {
        this.f40949a = provider;
        this.f40950b = provider2;
    }

    /* renamed from: a */
    public aj m49972a() {
        return m49970a(this.f40949a, this.f40950b);
    }

    /* renamed from: a */
    public static aj m49970a(Provider<C2630h> provider, Provider<C10522a> provider2) {
        return new aj((C2630h) provider.get(), (C10522a) provider2.get());
    }

    /* renamed from: b */
    public static ak m49971b(Provider<C2630h> provider, Provider<C10522a> provider2) {
        return new ak(provider, provider2);
    }
}
