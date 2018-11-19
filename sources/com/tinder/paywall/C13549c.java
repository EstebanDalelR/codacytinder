package com.tinder.paywall;

import com.tinder.tinderplus.p428a.C15192e;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.paywall.c */
public final class C13549c implements Factory<C10052b> {
    /* renamed from: a */
    private final Provider<C15192e> f43273a;

    public /* synthetic */ Object get() {
        return m52945a();
    }

    public C13549c(Provider<C15192e> provider) {
        this.f43273a = provider;
    }

    /* renamed from: a */
    public C10052b m52945a() {
        return C13549c.m52943a(this.f43273a);
    }

    /* renamed from: a */
    public static C10052b m52943a(Provider<C15192e> provider) {
        return new C10052b((C15192e) provider.get());
    }

    /* renamed from: b */
    public static C13549c m52944b(Provider<C15192e> provider) {
        return new C13549c(provider);
    }
}
