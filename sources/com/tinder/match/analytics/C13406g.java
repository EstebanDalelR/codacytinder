package com.tinder.match.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.match.analytics.g */
public final class C13406g implements Factory<C12038f> {
    /* renamed from: a */
    private final Provider<C2630h> f42541a;
    /* renamed from: b */
    private final Provider<C9845l> f42542b;

    public /* synthetic */ Object get() {
        return m51846a();
    }

    public C13406g(Provider<C2630h> provider, Provider<C9845l> provider2) {
        this.f42541a = provider;
        this.f42542b = provider2;
    }

    /* renamed from: a */
    public C12038f m51846a() {
        return C13406g.m51844a(this.f42541a, this.f42542b);
    }

    /* renamed from: a */
    public static C12038f m51844a(Provider<C2630h> provider, Provider<C9845l> provider2) {
        return new C12038f((C2630h) provider.get(), (C9845l) provider2.get());
    }

    /* renamed from: b */
    public static C13406g m51845b(Provider<C2630h> provider, Provider<C9845l> provider2) {
        return new C13406g(provider, provider2);
    }
}
