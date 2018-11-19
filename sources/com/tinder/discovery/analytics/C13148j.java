package com.tinder.discovery.analytics;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.discovery.analytics.j */
public final class C13148j implements Factory<C8881i> {
    /* renamed from: a */
    private final Provider<C13147g> f41821a;

    public /* synthetic */ Object get() {
        return m51084a();
    }

    public C13148j(Provider<C13147g> provider) {
        this.f41821a = provider;
    }

    /* renamed from: a */
    public C8881i m51084a() {
        return C13148j.m51082a(this.f41821a);
    }

    /* renamed from: a */
    public static C8881i m51082a(Provider<C13147g> provider) {
        return new C8881i((C13147g) provider.get());
    }

    /* renamed from: b */
    public static C13148j m51083b(Provider<C13147g> provider) {
        return new C13148j(provider);
    }
}
