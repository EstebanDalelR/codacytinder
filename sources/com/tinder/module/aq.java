package com.tinder.module;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.analytics.performance.aa;
import com.tinder.core.experiment.AbTestUtility;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class aq implements Factory<aa> {
    /* renamed from: a */
    private final aa f42778a;
    /* renamed from: b */
    private final Provider<C2630h> f42779b;
    /* renamed from: c */
    private final Provider<AbTestUtility> f42780c;

    public /* synthetic */ Object get() {
        return m52114a();
    }

    public aq(aa aaVar, Provider<C2630h> provider, Provider<AbTestUtility> provider2) {
        this.f42778a = aaVar;
        this.f42779b = provider;
        this.f42780c = provider2;
    }

    /* renamed from: a */
    public aa m52114a() {
        return m52112a(this.f42778a, this.f42779b, this.f42780c);
    }

    /* renamed from: a */
    public static aa m52112a(aa aaVar, Provider<C2630h> provider, Provider<AbTestUtility> provider2) {
        return m52111a(aaVar, (C2630h) provider.get(), (AbTestUtility) provider2.get());
    }

    /* renamed from: b */
    public static aq m52113b(aa aaVar, Provider<C2630h> provider, Provider<AbTestUtility> provider2) {
        return new aq(aaVar, provider, provider2);
    }

    /* renamed from: a */
    public static aa m52111a(aa aaVar, C2630h c2630h, AbTestUtility abTestUtility) {
        return (aa) C15521i.a(aaVar.m40772a(c2630h, abTestUtility), "Cannot return null from a non-@Nullable @Provides method");
    }
}
