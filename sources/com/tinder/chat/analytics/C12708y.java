package com.tinder.chat.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.analytics.y */
public final class C12708y implements Factory<C10541x> {
    /* renamed from: a */
    private final Provider<C2630h> f40995a;
    /* renamed from: b */
    private final Provider<C10522a> f40996b;

    public /* synthetic */ Object get() {
        return m50021a();
    }

    public C12708y(Provider<C2630h> provider, Provider<C10522a> provider2) {
        this.f40995a = provider;
        this.f40996b = provider2;
    }

    /* renamed from: a */
    public C10541x m50021a() {
        return C12708y.m50019a(this.f40995a, this.f40996b);
    }

    /* renamed from: a */
    public static C10541x m50019a(Provider<C2630h> provider, Provider<C10522a> provider2) {
        return new C10541x((C2630h) provider.get(), (C10522a) provider2.get());
    }

    /* renamed from: b */
    public static C12708y m50020b(Provider<C2630h> provider, Provider<C10522a> provider2) {
        return new C12708y(provider, provider2);
    }
}
