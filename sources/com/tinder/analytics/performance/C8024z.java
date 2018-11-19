package com.tinder.analytics.performance;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.core.experiment.AbTestUtility;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.analytics.performance.z */
public final class C8024z implements Factory<C8157y> {
    /* renamed from: a */
    private final Provider<C2630h> f28667a;
    /* renamed from: b */
    private final Provider<AbTestUtility> f28668b;

    public /* synthetic */ Object get() {
        return m33934a();
    }

    public C8024z(Provider<C2630h> provider, Provider<AbTestUtility> provider2) {
        this.f28667a = provider;
        this.f28668b = provider2;
    }

    /* renamed from: a */
    public C8157y m33934a() {
        return C8024z.m33932a(this.f28667a, this.f28668b);
    }

    /* renamed from: a */
    public static C8157y m33932a(Provider<C2630h> provider, Provider<AbTestUtility> provider2) {
        return new C8157y((C2630h) provider.get(), (AbTestUtility) provider2.get());
    }

    /* renamed from: b */
    public static C8024z m33933b(Provider<C2630h> provider, Provider<AbTestUtility> provider2) {
        return new C8024z(provider, provider2);
    }
}
