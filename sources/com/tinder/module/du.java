package com.tinder.module;

import com.tinder.common.repository.C10698c;
import com.tinder.managers.bk;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class du implements Factory<C10698c> {
    /* renamed from: a */
    private final bs f42943a;
    /* renamed from: b */
    private final Provider<bk> f42944b;

    public /* synthetic */ Object get() {
        return m52413a();
    }

    public du(bs bsVar, Provider<bk> provider) {
        this.f42943a = bsVar;
        this.f42944b = provider;
    }

    /* renamed from: a */
    public C10698c m52413a() {
        return m52411a(this.f42943a, this.f42944b);
    }

    /* renamed from: a */
    public static C10698c m52411a(bs bsVar, Provider<bk> provider) {
        return m52410a(bsVar, (bk) provider.get());
    }

    /* renamed from: b */
    public static du m52412b(bs bsVar, Provider<bk> provider) {
        return new du(bsVar, provider);
    }

    /* renamed from: a */
    public static C10698c m52410a(bs bsVar, bk bkVar) {
        return (C10698c) C15521i.a(bsVar.m40805a(bkVar), "Cannot return null from a non-@Nullable @Provides method");
    }
}
