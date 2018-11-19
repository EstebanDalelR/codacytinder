package com.tinder.module;

import com.tinder.purchase.model.C14530a;
import com.tinder.purchase.model.C14531b;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ay implements Factory<C14530a> {
    /* renamed from: a */
    private final au f42792a;
    /* renamed from: b */
    private final Provider<C14531b> f42793b;

    public /* synthetic */ Object get() {
        return m52138a();
    }

    public ay(au auVar, Provider<C14531b> provider) {
        this.f42792a = auVar;
        this.f42793b = provider;
    }

    /* renamed from: a */
    public C14530a m52138a() {
        return m52136a(this.f42792a, this.f42793b);
    }

    /* renamed from: a */
    public static C14530a m52136a(au auVar, Provider<C14531b> provider) {
        return m52135a(auVar, (C14531b) provider.get());
    }

    /* renamed from: b */
    public static ay m52137b(au auVar, Provider<C14531b> provider) {
        return new ay(auVar, provider);
    }

    /* renamed from: a */
    public static C14530a m52135a(au auVar, C14531b c14531b) {
        return (C14530a) C15521i.a(auVar.m40784a(c14531b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
