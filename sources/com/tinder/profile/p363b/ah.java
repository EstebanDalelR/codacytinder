package com.tinder.profile.p363b;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.TinderApi;
import com.tinder.core.experiment.AbTestUtility;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.profile.b.ah */
public final class ah implements Factory<ab> {
    /* renamed from: a */
    private final Provider<TinderApi> f55384a;
    /* renamed from: b */
    private final Provider<C2630h> f55385b;
    /* renamed from: c */
    private final Provider<AbTestUtility> f55386c;

    public /* synthetic */ Object get() {
        return m64892a();
    }

    public ah(Provider<TinderApi> provider, Provider<C2630h> provider2, Provider<AbTestUtility> provider3) {
        this.f55384a = provider;
        this.f55385b = provider2;
        this.f55386c = provider3;
    }

    /* renamed from: a */
    public ab m64892a() {
        return ah.m64890a(this.f55384a, this.f55385b, this.f55386c);
    }

    /* renamed from: a */
    public static ab m64890a(Provider<TinderApi> provider, Provider<C2630h> provider2, Provider<AbTestUtility> provider3) {
        return new ab((TinderApi) provider.get(), (C2630h) provider2.get(), (AbTestUtility) provider3.get());
    }

    /* renamed from: b */
    public static ah m64891b(Provider<TinderApi> provider, Provider<C2630h> provider2, Provider<AbTestUtility> provider3) {
        return new ah(provider, provider2, provider3);
    }
}
