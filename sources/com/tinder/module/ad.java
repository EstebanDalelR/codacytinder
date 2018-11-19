package com.tinder.module;

import com.tinder.analytics.C2634g;
import com.tinder.analytics.C6233k;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ad implements Factory<C2634g> {
    /* renamed from: a */
    private final aa f42747a;
    /* renamed from: b */
    private final Provider<C6233k> f42748b;

    public /* synthetic */ Object get() {
        return m52063a();
    }

    public ad(aa aaVar, Provider<C6233k> provider) {
        this.f42747a = aaVar;
        this.f42748b = provider;
    }

    /* renamed from: a */
    public C2634g m52063a() {
        return m52061a(this.f42747a, this.f42748b);
    }

    /* renamed from: a */
    public static C2634g m52061a(aa aaVar, Provider<C6233k> provider) {
        return m52060a(aaVar, (C6233k) provider.get());
    }

    /* renamed from: b */
    public static ad m52062b(aa aaVar, Provider<C6233k> provider) {
        return new ad(aaVar, provider);
    }

    /* renamed from: a */
    public static C2634g m52060a(aa aaVar, C6233k c6233k) {
        return (C2634g) C15521i.a(aaVar.m40770a(c6233k), "Cannot return null from a non-@Nullable @Provides method");
    }
}
