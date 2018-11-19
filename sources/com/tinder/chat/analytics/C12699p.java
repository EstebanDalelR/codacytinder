package com.tinder.chat.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.analytics.p */
public final class C12699p implements Factory<C10536o> {
    /* renamed from: a */
    private final Provider<C2630h> f40982a;
    /* renamed from: b */
    private final Provider<C10522a> f40983b;

    public /* synthetic */ Object get() {
        return m50004a();
    }

    public C12699p(Provider<C2630h> provider, Provider<C10522a> provider2) {
        this.f40982a = provider;
        this.f40983b = provider2;
    }

    /* renamed from: a */
    public C10536o m50004a() {
        return C12699p.m50002a(this.f40982a, this.f40983b);
    }

    /* renamed from: a */
    public static C10536o m50002a(Provider<C2630h> provider, Provider<C10522a> provider2) {
        return new C10536o((C2630h) provider.get(), (C10522a) provider2.get());
    }

    /* renamed from: b */
    public static C12699p m50003b(Provider<C2630h> provider, Provider<C10522a> provider2) {
        return new C12699p(provider, provider2);
    }
}
