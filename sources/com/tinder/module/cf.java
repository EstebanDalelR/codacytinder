package com.tinder.module;

import com.tinder.common.C12791q;
import com.tinder.data.user.CurrentUserProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class cf implements Factory<CurrentUserProvider> {
    /* renamed from: a */
    private final bs f42857a;
    /* renamed from: b */
    private final Provider<C12791q> f42858b;

    public /* synthetic */ Object get() {
        return m52252a();
    }

    public cf(bs bsVar, Provider<C12791q> provider) {
        this.f42857a = bsVar;
        this.f42858b = provider;
    }

    /* renamed from: a */
    public CurrentUserProvider m52252a() {
        return m52250a(this.f42857a, this.f42858b);
    }

    /* renamed from: a */
    public static CurrentUserProvider m52250a(bs bsVar, Provider<C12791q> provider) {
        return m52249a(bsVar, (C12791q) provider.get());
    }

    /* renamed from: b */
    public static cf m52251b(bs bsVar, Provider<C12791q> provider) {
        return new cf(bsVar, provider);
    }

    /* renamed from: a */
    public static CurrentUserProvider m52249a(bs bsVar, C12791q c12791q) {
        return (CurrentUserProvider) C15521i.a(bsVar.m40806a(c12791q), "Cannot return null from a non-@Nullable @Provides method");
    }
}
