package com.tinder.analytics.p153b;

import com.tinder.analytics.CrmEventTracker;
import com.tinder.analytics.p152a.C6208a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.analytics.b.e */
public final class C7999e implements Factory<C7317d> {
    /* renamed from: a */
    private final Provider<CrmEventTracker> f28613a;
    /* renamed from: b */
    private final Provider<C6208a> f28614b;

    public /* synthetic */ Object get() {
        return m33889a();
    }

    public C7999e(Provider<CrmEventTracker> provider, Provider<C6208a> provider2) {
        this.f28613a = provider;
        this.f28614b = provider2;
    }

    /* renamed from: a */
    public C7317d m33889a() {
        return C7999e.m33887a(this.f28613a, this.f28614b);
    }

    /* renamed from: a */
    public static C7317d m33887a(Provider<CrmEventTracker> provider, Provider<C6208a> provider2) {
        return new C7317d((CrmEventTracker) provider.get(), (C6208a) provider2.get());
    }

    /* renamed from: b */
    public static C7999e m33888b(Provider<CrmEventTracker> provider, Provider<C6208a> provider2) {
        return new C7999e(provider, provider2);
    }
}
