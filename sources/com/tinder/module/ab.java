package com.tinder.module;

import com.tinder.analytics.fireworks.C7321b;
import com.tinder.analytics.fireworks.C7322d;
import com.tinder.analytics.fireworks.C7329e;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ab implements Factory<C7322d> {
    /* renamed from: a */
    private final aa f42742a;
    /* renamed from: b */
    private final Provider<C7329e> f42743b;
    /* renamed from: c */
    private final Provider<C7321b> f42744c;

    public /* synthetic */ Object get() {
        return m52055a();
    }

    public ab(aa aaVar, Provider<C7329e> provider, Provider<C7321b> provider2) {
        this.f42742a = aaVar;
        this.f42743b = provider;
        this.f42744c = provider2;
    }

    /* renamed from: a */
    public C7322d m52055a() {
        return m52053a(this.f42742a, this.f42743b, this.f42744c);
    }

    /* renamed from: a */
    public static C7322d m52053a(aa aaVar, Provider<C7329e> provider, Provider<C7321b> provider2) {
        return m52052a(aaVar, (C7329e) provider.get(), (C7321b) provider2.get());
    }

    /* renamed from: b */
    public static ab m52054b(aa aaVar, Provider<C7329e> provider, Provider<C7321b> provider2) {
        return new ab(aaVar, provider, provider2);
    }

    /* renamed from: a */
    public static C7322d m52052a(aa aaVar, C7329e c7329e, C7321b c7321b) {
        return (C7322d) C15521i.a(aaVar.m40766a(c7329e, c7321b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
