package com.tinder.settings.p405c;

import com.google.gson.Gson;
import com.tinder.core.experiment.AbTestUtility;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.settings.c.c */
public final class C18060c implements Factory<C16617a> {
    /* renamed from: a */
    private final Provider<Gson> f56091a;
    /* renamed from: b */
    private final Provider<AbTestUtility> f56092b;

    public /* synthetic */ Object get() {
        return m65553a();
    }

    public C18060c(Provider<Gson> provider, Provider<AbTestUtility> provider2) {
        this.f56091a = provider;
        this.f56092b = provider2;
    }

    /* renamed from: a */
    public C16617a m65553a() {
        return C18060c.m65551a(this.f56091a, this.f56092b);
    }

    /* renamed from: a */
    public static C16617a m65551a(Provider<Gson> provider, Provider<AbTestUtility> provider2) {
        return new C16617a((Gson) provider.get(), (AbTestUtility) provider2.get());
    }

    /* renamed from: b */
    public static C18060c m65552b(Provider<Gson> provider, Provider<AbTestUtility> provider2) {
        return new C18060c(provider, provider2);
    }
}
