package com.tinder.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.analytics.f */
public final class C8005f implements Factory<C7319e> {
    /* renamed from: a */
    private final Provider<C2630h> f28630a;

    public /* synthetic */ Object get() {
        return m33907a();
    }

    public C8005f(Provider<C2630h> provider) {
        this.f28630a = provider;
    }

    /* renamed from: a */
    public C7319e m33907a() {
        return C8005f.m33905a(this.f28630a);
    }

    /* renamed from: a */
    public static C7319e m33905a(Provider<C2630h> provider) {
        return new C7319e((C2630h) provider.get());
    }

    /* renamed from: b */
    public static C8005f m33906b(Provider<C2630h> provider) {
        return new C8005f(provider);
    }
}
