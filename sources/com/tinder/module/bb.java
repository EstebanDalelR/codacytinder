package com.tinder.module;

import com.tinder.api.TinderApi;
import com.tinder.purchase.p373c.C14488a;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class bb implements Factory<C14488a> {
    /* renamed from: a */
    private final au f42798a;
    /* renamed from: b */
    private final Provider<TinderApi> f42799b;

    public /* synthetic */ Object get() {
        return m52154a();
    }

    public bb(au auVar, Provider<TinderApi> provider) {
        this.f42798a = auVar;
        this.f42799b = provider;
    }

    /* renamed from: a */
    public C14488a m52154a() {
        return m52152a(this.f42798a, this.f42799b);
    }

    /* renamed from: a */
    public static C14488a m52152a(au auVar, Provider<TinderApi> provider) {
        return m52151a(auVar, (TinderApi) provider.get());
    }

    /* renamed from: b */
    public static bb m52153b(au auVar, Provider<TinderApi> provider) {
        return new bb(auVar, provider);
    }

    /* renamed from: a */
    public static C14488a m52151a(au auVar, TinderApi tinderApi) {
        return (C14488a) C15521i.a(auVar.m40782a(tinderApi), "Cannot return null from a non-@Nullable @Provides method");
    }
}
