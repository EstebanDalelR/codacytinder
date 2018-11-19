package com.tinder.module;

import com.tinder.analytics.CrmEventTracker;
import com.tinder.analytics.p153b.C6212b;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ac implements Factory<CrmEventTracker> {
    /* renamed from: a */
    private final aa f42745a;
    /* renamed from: b */
    private final Provider<C6212b> f42746b;

    public /* synthetic */ Object get() {
        return m52059a();
    }

    public ac(aa aaVar, Provider<C6212b> provider) {
        this.f42745a = aaVar;
        this.f42746b = provider;
    }

    /* renamed from: a */
    public CrmEventTracker m52059a() {
        return m52057a(this.f42745a, this.f42746b);
    }

    /* renamed from: a */
    public static CrmEventTracker m52057a(aa aaVar, Provider<C6212b> provider) {
        return m52056a(aaVar, (C6212b) provider.get());
    }

    /* renamed from: b */
    public static ac m52058b(aa aaVar, Provider<C6212b> provider) {
        return new ac(aaVar, provider);
    }

    /* renamed from: a */
    public static CrmEventTracker m52056a(aa aaVar, C6212b c6212b) {
        return (CrmEventTracker) C15521i.a(aaVar.m40763a(c6212b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
