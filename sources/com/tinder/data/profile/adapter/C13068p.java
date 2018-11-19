package com.tinder.data.profile.adapter;

import com.tinder.data.adapter.C10743s;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.profile.adapter.p */
public final class C13068p implements Factory<C10919o> {
    /* renamed from: a */
    private final Provider<C10743s> f41641a;

    public /* synthetic */ Object get() {
        return m50868a();
    }

    public C13068p(Provider<C10743s> provider) {
        this.f41641a = provider;
    }

    /* renamed from: a */
    public C10919o m50868a() {
        return C13068p.m50866a(this.f41641a);
    }

    /* renamed from: a */
    public static C10919o m50866a(Provider<C10743s> provider) {
        return new C10919o((C10743s) provider.get());
    }

    /* renamed from: b */
    public static C13068p m50867b(Provider<C10743s> provider) {
        return new C13068p(provider);
    }
}
