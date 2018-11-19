package com.tinder.recsads.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.recsads.analytics.AdEventFields.C14729c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.recsads.analytics.c */
public final class C18007c implements Factory<C16431b> {
    /* renamed from: a */
    private final Provider<C2630h> f55940a;
    /* renamed from: b */
    private final Provider<C14729c> f55941b;

    public /* synthetic */ Object get() {
        return m65380a();
    }

    public C18007c(Provider<C2630h> provider, Provider<C14729c> provider2) {
        this.f55940a = provider;
        this.f55941b = provider2;
    }

    /* renamed from: a */
    public C16431b m65380a() {
        return C18007c.m65378a(this.f55940a, this.f55941b);
    }

    /* renamed from: a */
    public static C16431b m65378a(Provider<C2630h> provider, Provider<C14729c> provider2) {
        return new C16431b((C2630h) provider.get(), (C14729c) provider2.get());
    }

    /* renamed from: b */
    public static C18007c m65379b(Provider<C2630h> provider, Provider<C14729c> provider2) {
        return new C18007c(provider, provider2);
    }
}
