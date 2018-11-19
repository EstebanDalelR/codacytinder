package com.tinder.crashindicator.reporter;

import com.tinder.analytics.C7319e;
import com.tinder.managers.C2652a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.crashindicator.reporter.d */
public final class C12822d implements Factory<C10717c> {
    /* renamed from: a */
    private final Provider<C2652a> f41232a;
    /* renamed from: b */
    private final Provider<C7319e> f41233b;

    public /* synthetic */ Object get() {
        return m50349a();
    }

    public C12822d(Provider<C2652a> provider, Provider<C7319e> provider2) {
        this.f41232a = provider;
        this.f41233b = provider2;
    }

    /* renamed from: a */
    public C10717c m50349a() {
        return C12822d.m50347a(this.f41232a, this.f41233b);
    }

    /* renamed from: a */
    public static C10717c m50347a(Provider<C2652a> provider, Provider<C7319e> provider2) {
        return new C10717c((C2652a) provider.get(), (C7319e) provider2.get());
    }

    /* renamed from: b */
    public static C12822d m50348b(Provider<C2652a> provider, Provider<C7319e> provider2) {
        return new C12822d(provider, provider2);
    }
}
