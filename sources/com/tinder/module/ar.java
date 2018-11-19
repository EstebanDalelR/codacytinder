package com.tinder.module;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.analytics.performance.af;
import com.tinder.core.experiment.AbTestUtility;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ar implements Factory<af> {
    /* renamed from: a */
    private final aa f42781a;
    /* renamed from: b */
    private final Provider<C2630h> f42782b;
    /* renamed from: c */
    private final Provider<AbTestUtility> f42783c;

    public /* synthetic */ Object get() {
        return m52118a();
    }

    public ar(aa aaVar, Provider<C2630h> provider, Provider<AbTestUtility> provider2) {
        this.f42781a = aaVar;
        this.f42782b = provider;
        this.f42783c = provider2;
    }

    /* renamed from: a */
    public af m52118a() {
        return m52116a(this.f42781a, this.f42782b, this.f42783c);
    }

    /* renamed from: a */
    public static af m52116a(aa aaVar, Provider<C2630h> provider, Provider<AbTestUtility> provider2) {
        return m52115a(aaVar, (C2630h) provider.get(), (AbTestUtility) provider2.get());
    }

    /* renamed from: b */
    public static ar m52117b(aa aaVar, Provider<C2630h> provider, Provider<AbTestUtility> provider2) {
        return new ar(aaVar, provider, provider2);
    }

    /* renamed from: a */
    public static af m52115a(aa aaVar, C2630h c2630h, AbTestUtility abTestUtility) {
        return (af) C15521i.a(aaVar.m40776b(c2630h, abTestUtility), "Cannot return null from a non-@Nullable @Provides method");
    }
}
