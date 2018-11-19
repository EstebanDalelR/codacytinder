package com.tinder.places.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.places.analytics.c */
public final class C13560c implements Factory<C10113b> {
    /* renamed from: a */
    private final Provider<C2630h> f43294a;

    public /* synthetic */ Object get() {
        return m52979a();
    }

    public C13560c(Provider<C2630h> provider) {
        this.f43294a = provider;
    }

    /* renamed from: a */
    public C10113b m52979a() {
        return C13560c.m52977a(this.f43294a);
    }

    /* renamed from: a */
    public static C10113b m52977a(Provider<C2630h> provider) {
        return new C10113b((C2630h) provider.get());
    }

    /* renamed from: b */
    public static C13560c m52978b(Provider<C2630h> provider) {
        return new C13560c(provider);
    }
}
