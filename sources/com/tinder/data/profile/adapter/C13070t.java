package com.tinder.data.profile.adapter;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.profile.adapter.t */
public final class C13070t implements Factory<C10921s> {
    /* renamed from: a */
    private final Provider<C10922u> f41643a;

    public /* synthetic */ Object get() {
        return m50874a();
    }

    public C13070t(Provider<C10922u> provider) {
        this.f41643a = provider;
    }

    /* renamed from: a */
    public C10921s m50874a() {
        return C13070t.m50872a(this.f41643a);
    }

    /* renamed from: a */
    public static C10921s m50872a(Provider<C10922u> provider) {
        return new C10921s((C10922u) provider.get());
    }

    /* renamed from: b */
    public static C13070t m50873b(Provider<C10922u> provider) {
        return new C13070t(provider);
    }
}
