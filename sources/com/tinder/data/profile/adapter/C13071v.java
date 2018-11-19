package com.tinder.data.profile.adapter;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.profile.adapter.v */
public final class C13071v implements Factory<C10922u> {
    /* renamed from: a */
    private final Provider<C10923w> f41644a;

    public /* synthetic */ Object get() {
        return m50877a();
    }

    public C13071v(Provider<C10923w> provider) {
        this.f41644a = provider;
    }

    /* renamed from: a */
    public C10922u m50877a() {
        return C13071v.m50875a(this.f41644a);
    }

    /* renamed from: a */
    public static C10922u m50875a(Provider<C10923w> provider) {
        return new C10922u((C10923w) provider.get());
    }

    /* renamed from: b */
    public static C13071v m50876b(Provider<C10923w> provider) {
        return new C13071v(provider);
    }
}
