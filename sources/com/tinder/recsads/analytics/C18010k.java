package com.tinder.recsads.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.recsads.analytics.AdEventFields.C14729c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.recsads.analytics.k */
public final class C18010k implements Factory<C16434j> {
    /* renamed from: a */
    private final Provider<C2630h> f55946a;
    /* renamed from: b */
    private final Provider<C14729c> f55947b;

    public /* synthetic */ Object get() {
        return m65389a();
    }

    public C18010k(Provider<C2630h> provider, Provider<C14729c> provider2) {
        this.f55946a = provider;
        this.f55947b = provider2;
    }

    /* renamed from: a */
    public C16434j m65389a() {
        return C18010k.m65387a(this.f55946a, this.f55947b);
    }

    /* renamed from: a */
    public static C16434j m65387a(Provider<C2630h> provider, Provider<C14729c> provider2) {
        return new C16434j((C2630h) provider.get(), (C14729c) provider2.get());
    }

    /* renamed from: b */
    public static C18010k m65388b(Provider<C2630h> provider, Provider<C14729c> provider2) {
        return new C18010k(provider, provider2);
    }
}
