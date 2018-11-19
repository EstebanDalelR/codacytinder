package com.tinder.chat.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.analytics.t */
public final class C12703t implements Factory<C10538s> {
    /* renamed from: a */
    private final Provider<C2630h> f40988a;
    /* renamed from: b */
    private final Provider<C10522a> f40989b;

    public /* synthetic */ Object get() {
        return m50012a();
    }

    public C12703t(Provider<C2630h> provider, Provider<C10522a> provider2) {
        this.f40988a = provider;
        this.f40989b = provider2;
    }

    /* renamed from: a */
    public C10538s m50012a() {
        return C12703t.m50010a(this.f40988a, this.f40989b);
    }

    /* renamed from: a */
    public static C10538s m50010a(Provider<C2630h> provider, Provider<C10522a> provider2) {
        return new C10538s((C2630h) provider.get(), (C10522a) provider2.get());
    }

    /* renamed from: b */
    public static C12703t m50011b(Provider<C2630h> provider, Provider<C10522a> provider2) {
        return new C12703t(provider, provider2);
    }
}
