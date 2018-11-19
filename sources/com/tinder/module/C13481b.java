package com.tinder.module;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.recsads.model.RecsAdsConfig;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.module.b */
public final class C13481b implements Factory<RecsAdsConfig> {
    /* renamed from: a */
    private final C9939a f42795a;
    /* renamed from: b */
    private final Provider<AbTestUtility> f42796b;

    public /* synthetic */ Object get() {
        return m52146a();
    }

    public C13481b(C9939a c9939a, Provider<AbTestUtility> provider) {
        this.f42795a = c9939a;
        this.f42796b = provider;
    }

    /* renamed from: a */
    public RecsAdsConfig m52146a() {
        return C13481b.m52144a(this.f42795a, this.f42796b);
    }

    /* renamed from: a */
    public static RecsAdsConfig m52144a(C9939a c9939a, Provider<AbTestUtility> provider) {
        return C13481b.m52143a(c9939a, (AbTestUtility) provider.get());
    }

    /* renamed from: b */
    public static C13481b m52145b(C9939a c9939a, Provider<AbTestUtility> provider) {
        return new C13481b(c9939a, provider);
    }

    /* renamed from: a */
    public static RecsAdsConfig m52143a(C9939a c9939a, AbTestUtility abTestUtility) {
        return (RecsAdsConfig) C15521i.a(c9939a.m40761a(abTestUtility), "Cannot return null from a non-@Nullable @Provides method");
    }
}
