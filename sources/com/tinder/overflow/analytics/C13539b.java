package com.tinder.overflow.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.overflow.analytics.b */
public final class C13539b implements Factory<C12239a> {
    /* renamed from: a */
    private final Provider<C2630h> f43260a;

    public /* synthetic */ Object get() {
        return m52920a();
    }

    public C13539b(Provider<C2630h> provider) {
        this.f43260a = provider;
    }

    /* renamed from: a */
    public C12239a m52920a() {
        return C13539b.m52918a(this.f43260a);
    }

    /* renamed from: a */
    public static C12239a m52918a(Provider<C2630h> provider) {
        return new C12239a((C2630h) provider.get());
    }

    /* renamed from: b */
    public static C13539b m52919b(Provider<C2630h> provider) {
        return new C13539b(provider);
    }
}
