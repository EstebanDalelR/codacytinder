package com.tinder.reactions.navigation.p397b;

import com.tinder.reactions.navigation.p398c.C14684a;
import com.tinder.reactions.navigation.p399d.C14688a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.navigation.b.c */
public final class C17993c implements Factory<C16369a> {
    /* renamed from: a */
    private final Provider<C14684a> f55928a;
    /* renamed from: b */
    private final Provider<C14688a> f55929b;

    public /* synthetic */ Object get() {
        return m65360a();
    }

    public C17993c(Provider<C14684a> provider, Provider<C14688a> provider2) {
        this.f55928a = provider;
        this.f55929b = provider2;
    }

    /* renamed from: a */
    public C16369a m65360a() {
        return C17993c.m65358a(this.f55928a, this.f55929b);
    }

    /* renamed from: a */
    public static C16369a m65358a(Provider<C14684a> provider, Provider<C14688a> provider2) {
        return new C16369a((C14684a) provider.get(), (C14688a) provider2.get());
    }

    /* renamed from: b */
    public static C17993c m65359b(Provider<C14684a> provider, Provider<C14688a> provider2) {
        return new C17993c(provider, provider2);
    }
}
