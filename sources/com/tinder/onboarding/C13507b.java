package com.tinder.onboarding;

import com.tinder.core.experiment.AbTestUtility;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.onboarding.b */
public final class C13507b implements Factory<C12154a> {
    /* renamed from: a */
    private final Provider<AbTestUtility> f43098a;

    public /* synthetic */ Object get() {
        return m52615a();
    }

    public C13507b(Provider<AbTestUtility> provider) {
        this.f43098a = provider;
    }

    /* renamed from: a */
    public C12154a m52615a() {
        return C13507b.m52613a(this.f43098a);
    }

    /* renamed from: a */
    public static C12154a m52613a(Provider<AbTestUtility> provider) {
        return new C12154a((AbTestUtility) provider.get());
    }

    /* renamed from: b */
    public static C13507b m52614b(Provider<AbTestUtility> provider) {
        return new C13507b(provider);
    }
}
