package com.tinder.module;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.sponsoredmessage.C15034e;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.module.c */
public final class C13482c implements Factory<C15034e> {
    /* renamed from: a */
    private final C9939a f42846a;
    /* renamed from: b */
    private final Provider<AbTestUtility> f42847b;

    public /* synthetic */ Object get() {
        return m52228a();
    }

    public C13482c(C9939a c9939a, Provider<AbTestUtility> provider) {
        this.f42846a = c9939a;
        this.f42847b = provider;
    }

    /* renamed from: a */
    public C15034e m52228a() {
        return C13482c.m52226a(this.f42846a, this.f42847b);
    }

    /* renamed from: a */
    public static C15034e m52226a(C9939a c9939a, Provider<AbTestUtility> provider) {
        return C13482c.m52225a(c9939a, (AbTestUtility) provider.get());
    }

    /* renamed from: b */
    public static C13482c m52227b(C9939a c9939a, Provider<AbTestUtility> provider) {
        return new C13482c(c9939a, provider);
    }

    /* renamed from: a */
    public static C15034e m52225a(C9939a c9939a, AbTestUtility abTestUtility) {
        return (C15034e) C15521i.a(c9939a.m40762b(abTestUtility), "Cannot return null from a non-@Nullable @Provides method");
    }
}
