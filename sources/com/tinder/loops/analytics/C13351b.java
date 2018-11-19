package com.tinder.loops.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.common.reactivex.schedulers.Schedulers;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.loops.analytics.b */
public final class C13351b implements Factory<C11912a> {
    /* renamed from: a */
    private final Provider<C2630h> f42353a;
    /* renamed from: b */
    private final Provider<Schedulers> f42354b;

    public /* synthetic */ Object get() {
        return m51654a();
    }

    public C13351b(Provider<C2630h> provider, Provider<Schedulers> provider2) {
        this.f42353a = provider;
        this.f42354b = provider2;
    }

    /* renamed from: a */
    public C11912a m51654a() {
        return C13351b.m51652a(this.f42353a, this.f42354b);
    }

    /* renamed from: a */
    public static C11912a m51652a(Provider<C2630h> provider, Provider<Schedulers> provider2) {
        return new C11912a((C2630h) provider.get(), (Schedulers) provider2.get());
    }

    /* renamed from: b */
    public static C13351b m51653b(Provider<C2630h> provider, Provider<Schedulers> provider2) {
        return new C13351b(provider, provider2);
    }
}
