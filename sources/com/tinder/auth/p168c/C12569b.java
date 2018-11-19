package com.tinder.auth.p168c;

import com.tinder.common.provider.C2643c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.auth.c.b */
public final class C12569b implements Factory<C10330a> {
    /* renamed from: a */
    private final Provider<C2643c> f40612a;

    public /* synthetic */ Object get() {
        return m49688a();
    }

    public C12569b(Provider<C2643c> provider) {
        this.f40612a = provider;
    }

    /* renamed from: a */
    public C10330a m49688a() {
        return C12569b.m49686a(this.f40612a);
    }

    /* renamed from: a */
    public static C10330a m49686a(Provider<C2643c> provider) {
        return new C10330a((C2643c) provider.get());
    }

    /* renamed from: b */
    public static C12569b m49687b(Provider<C2643c> provider) {
        return new C12569b(provider);
    }
}
