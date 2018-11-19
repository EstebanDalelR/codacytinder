package com.tinder.match.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.match.analytics.e */
public final class C13404e implements Factory<C12037d> {
    /* renamed from: a */
    private final Provider<C2630h> f42538a;
    /* renamed from: b */
    private final Provider<C9845l> f42539b;

    public /* synthetic */ Object get() {
        return m51842a();
    }

    public C13404e(Provider<C2630h> provider, Provider<C9845l> provider2) {
        this.f42538a = provider;
        this.f42539b = provider2;
    }

    /* renamed from: a */
    public C12037d m51842a() {
        return C13404e.m51840a(this.f42538a, this.f42539b);
    }

    /* renamed from: a */
    public static C12037d m51840a(Provider<C2630h> provider, Provider<C9845l> provider2) {
        return new C12037d((C2630h) provider.get(), (C9845l) provider2.get());
    }

    /* renamed from: b */
    public static C13404e m51841b(Provider<C2630h> provider, Provider<C9845l> provider2) {
        return new C13404e(provider, provider2);
    }
}
